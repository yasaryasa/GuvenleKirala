package com.yaser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaser.dao.UserRepository;
import com.yaser.dto.ProductTypesDTO;
import com.yaser.model.User;
import com.yaser.service.product_type_service.CcaApiRegularPaymentProductsServiceService;
import com.yaser.service.product_type_service.CcaRegularPaymentProductsDTO;
import com.yaser.service.product_type_service.DatatypeConfigurationException_Exception;
import com.yaser.service.product_type_service.HmnServiceException_Exception;
import com.yaser.service.product_type_service.ICcaApiRegularPaymentProductsService;
import com.yaser.service.product_type_service.RequestApiRegularPaymentProducts;
import com.yaser.service.product_type_service.ResponseApiRegularPaymentProducts;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    public List<ProductTypesDTO> getProductTypes() {
        List<ProductTypesDTO> productTypeList = null;
        CcaApiRegularPaymentProductsServiceService service = new CcaApiRegularPaymentProductsServiceService();
        ICcaApiRegularPaymentProductsService productsServicePort = service.getCcaApiRegularPaymentProductsServicePort();
        RequestApiRegularPaymentProducts request = new RequestApiRegularPaymentProducts();
        request.setChannelCode("NONSECURE_WEB");
        request.setScreenCode("KRO");
        try {
            ResponseApiRegularPaymentProducts products = productsServicePort.getRegularPaymentProducts(request);
            List<CcaRegularPaymentProductsDTO> productstDTO = products.getCcaRegularPaymenProductstDTO();
            productstDTO.stream().forEach(w -> System.out.println("Item : " + w.getProductKey()));
            productTypeList = new ArrayList<>();
            //map to dto
            for (CcaRegularPaymentProductsDTO w : productstDTO) {
                ProductTypesDTO p = new ProductTypesDTO();
                p.setCreditClass(w.getCreditClass());
                p.setCreditType(w.getCreditType());
                p.setProductKey(w.getProductKey());
                p.setProductName(w.getProductName());
                productTypeList.add(p);
            }
            //            productstDTO.stream().forEach(w -> {
            //                ProductTypesDTO p = new ProductTypesDTO();
            //                p.setCreditClass(w.getCreditClass());
            //                p.setCreditType(w.getCreditType());
            //                p.setProductKey(w.getProductKey());
            //                p.setProductName(w.getProductName());
            //                //productTypeList.add(p);
            //            });
        } catch (DatatypeConfigurationException_Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (HmnServiceException_Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return productTypeList;
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public void saveOrUpdate(User user) {
        userRepository.save(user);
    }

    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
