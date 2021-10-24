package com.xucan.service;

import com.xucan.domain.Address;

import java.util.List;

/**
 * @author xucan
 * @date 2021/8/19 14:26
 */
public interface AddressService {
    /**
     * @Author 11355
     * @Description
     * @Date 14:26 2021/8/19
     * @Param [java.lang.String]
     * @return java.util.List<com.xucan.domain.Address>
     **/
    List<Address> findAllAddress(String open_id);
    /**
     * @Author 11355
     * @Description
     * @Date 15:10 2021/8/19
     * @Param [com.xucan.domain.Address]
     * @return void
     **/
    void insertAddress(Address address);

    Address findAddressById(Integer id);

    void updateAddress(Address address);

    void deletedAddress(Integer id);
}
