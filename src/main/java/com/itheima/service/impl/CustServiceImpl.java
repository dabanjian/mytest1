package com.itheima.service.impl;

import com.itheima.dao.CustMapper;
import com.itheima.model.Cust;
import com.itheima.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustServiceImpl implements CustService {
    @Autowired
    private CustMapper custMapper;

    @Override
    public List<Cust> list(String cust_name, String cust_type) {
        List<Cust> custList = custMapper.list(cust_name, cust_type);
        return custList;
    }

    @Override
    public List<Cust> query() {
        List<Cust> custList = custMapper.query();
        return custList;
    }
}
