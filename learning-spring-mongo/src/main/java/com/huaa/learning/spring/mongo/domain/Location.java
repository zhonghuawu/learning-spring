package com.huaa.learning.spring.mongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/11/23 14:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private String place;
    private String year;
}
