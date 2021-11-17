package com.xucan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 11355
 * @date 2021/11/17 18:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    private Integer coupon_id;
    private Integer coupon_count;
    private String coupon_type;
    private double coupon_intensity;
    private String start_date;
    private String end_date;
}
