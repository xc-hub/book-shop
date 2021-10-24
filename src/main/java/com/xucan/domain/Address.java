package com.xucan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Integer id;
    private String open_id;
    private String address_name;
    private String address_phone;
    private String address_header;
    private String address_detail;
    private String is_default;
}
