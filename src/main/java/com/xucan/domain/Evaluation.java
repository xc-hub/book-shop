package com.xucan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evaluation {
    private Integer evaluation_id;
    private Integer book_id;
    private String user_avatar;
    private String user_nickname;
    private String evaluation_content;
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String evaluation_time; //时间戳格式
}
