package com.itheima.dao;

import com.itheima.model.Cust;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CustMapper {

    @Select("select * from s_cust sc,s_user su where sc.cust_link_user = su.uid ")
    List<Cust> query();

    @Select("<script> select * from s_cust sc,s_user su where sc.cust_link_user = su.uid <if test = \"cust_name != '' \"> and cust_name like '%${cust_name}%' </if><if test = \"cust_type != ''\"> and cust_type like '%${cust_type}%' </if></script>")
    List<Cust> list(@Param("cust_name") String cust_name, @Param("cust_type") String cust_type);
}
