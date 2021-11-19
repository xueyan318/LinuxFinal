package com.lxy.hello.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * user
 * @author 
 */
@Data
@Accessors(chain = true)
public class UserDO implements Serializable {
    private Integer id;

    private String name;

    private String age;

    private static final long serialVersionUID = 1L;



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}