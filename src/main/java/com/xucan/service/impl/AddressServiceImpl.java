package com.xucan.service.impl;

import com.xucan.domain.Address;
import com.xucan.mapper.AddressMapper;
import com.xucan.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xucan
 * @date 2021/8/19 14:27
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    /**
     * @Author 11355
     * @Description
     * @Date 14:31 2021/8/19
     * @Param [java.lang.String]
     * @return java.util.List<com.xucan.domain.Address>
     **/
    @Override
    public List<Address> findAllAddress(String open_id) {
        return addressMapper.findAllAddress(open_id);
    }
    /**
     * @Author 11355
     * @Description
     * @Date 15:10 2021/8/19
     * @Param [com.xucan.domain.Address]
     * @return void
     **/
    @Override
    public void insertAddress(Address address) {
//        System.out.println(address.getIs_default());
        if(address.getIs_default()=="true"){
            List<Address> allAddress = addressMapper.findAllAddress(address.getOpen_id());
            for (Address address1:allAddress) {
                addressMapper.updateDefault(address1);
            }
        }
        addressMapper.insertAddress(address);
    }

    @Override
    public Address findAddressById(Integer id) {
        return addressMapper.findAddressById(id);

    }

    @Override
    public void updateAddress(Address address) {
        if(address.getIs_default()=="true"){
            List<Address> allAddress = addressMapper.findAllAddress(address.getOpen_id());
            for (Address address1:allAddress) {
                addressMapper.updateDefault(address1);
            }
        }
        addressMapper.updateAddress(address);
    }

    @Override
    public void deletedAddress(Integer id) {
        addressMapper.deletedAddress(id);
    }
}
