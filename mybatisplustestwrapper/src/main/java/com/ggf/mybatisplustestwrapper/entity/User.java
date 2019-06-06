package com.ggf.mybatisplustestwrapper.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author ggf
* @since 2019-06-01
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Integer id;

    /**
    * 姓名
    */
    private String name;

    /**
    * 年龄
    */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 删除标识
     */
    @TableLogic
    private Integer deleted;

}
