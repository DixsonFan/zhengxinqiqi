package com.hbue.qipai.zhengxin.mapper;

import com.hbue.qipai.zhengxin.entity.Emp;

import java.util.List;

/**
 * 持久层
 */
public interface EmpMapper {
    List<Emp> queryEmpAll();

    void deleteEmp(Integer id);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);

    void addEmp(Emp emp);
}
