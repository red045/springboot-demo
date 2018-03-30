package com.kennyw.jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/3/31 0031
 */
@Data
@NoArgsConstructor
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    private String cupSize;

    private Integer age;
}
