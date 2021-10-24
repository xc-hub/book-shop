package com.xucan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {
    private Integer shopping_id;
    private String open_id;
    private Integer book_id;
    private Integer count;
    private boolean checked;
}
