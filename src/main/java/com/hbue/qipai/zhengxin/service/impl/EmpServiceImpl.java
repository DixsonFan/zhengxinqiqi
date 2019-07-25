package com.hbue.qipai.zhengxin.service.impl;


import com.hbue.qipai.zhengxin.entity.Emp;
import com.hbue.qipai.zhengxin.mapper.EmpMapper;
import com.hbue.qipai.zhengxin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务层的实现类
 */
@Service
public class EmpServiceImpl implements EmpService {
    //创建持久层
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> queryEmpAll() {
        return empMapper.queryEmpAll();
    }

    @Override
    public void deleteEmp(Integer id) {
        empMapper.deleteEmp(id);
    }

    @Override
    public Emp getEmpById(Integer id) {
        return empMapper.getEmpById(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp);
    }
}
