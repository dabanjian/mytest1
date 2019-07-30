package com.itheima.service;

import com.itheima.model.Cust;

import java.util.List;

public interface CustService {
    List<Cust> list(String cust_name, String cust_type);
    List<Cust> query();
}
