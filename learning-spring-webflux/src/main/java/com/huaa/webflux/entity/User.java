package com.huaa.webflux.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/20 19:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private String name;
    private int age;

}
