package com.xucan.mapper;

import com.xucan.domain.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 11355
 * @date 2021/8/19 14:32
 */
@Mapper
public interface AddressMapper {
    List<Address> findAllAddress(@Param("open_id") String open_id);

    void insertAddress(Address address);

    void updateDefault(Address address);

    Address findAddressById(Integer id);

    void updateAddress(Address address);

    void deletedAddress(Integer id);
}
