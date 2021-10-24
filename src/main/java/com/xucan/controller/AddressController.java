package com.xucan.controller;

import com.xucan.domain.Address;
import com.xucan.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class AddressController {
    @Autowired
    private AddressService addressService;
    /**
     * @Author xucan
     * @Description
     * @Date 14:20 2021/8/19
     * @Param [java.lang.String]
     * @return java.util.List<com.xucan.domain.Address>
     **/
    @GetMapping("address/{open_id}")
    public List<Address> findAllAddress(@PathVariable("open_id") String open_id){
        return addressService.findAllAddress(open_id);
    }
    /**
     * @Author 11355
     * @Description
     * @Date 15:09 2021/8/19
     * @Param [com.xucan.domain.Address]
     * @return void
     **/
    @PostMapping("address")
    public void insertAddress(@RequestBody Address address){
        if(address.getId()==null)
            addressService.insertAddress(address);
        else
            addressService.updateAddress(address);
    }
    @GetMapping("addressById")
    public Address findAddressById(@RequestParam Integer id){
       return addressService.findAddressById(id);
    }
    @DeleteMapping("address/{id}")
    public void deletedAddress(@PathVariable("id") Integer id){
        addressService.deletedAddress(id);
    }
}
