package com.hbue.qipai.zhengxin.service;

import com.hbue.qipai.zhengxin.entity.Emp;

import java.util.List;

/**
 * 服务层
 */
public interface EmpService {
    //查询所有员工
    List<Emp> queryEmpAll();
    //根据id删除
    void deleteEmp(Integer id);
    //根据id查询单个员工
    Emp getEmpById(Integer id);
    //修改单条员工数据
    void updateEmp(Emp emp);
    //添加一条员工数据
    void addEmp(Emp emp);
}
