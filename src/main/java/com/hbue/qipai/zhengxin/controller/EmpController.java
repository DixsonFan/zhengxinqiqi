package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.Emp;
import com.hbue.qipai.zhengxin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.List;

/**
 * 控制层
 */
@Controller
@RequestMapping("/emp")
public class EmpController {
    //创建服务层对象
    @Autowired
    private EmpService empService;

    @RequestMapping("/queryEmpAll")
    public String  queryEmpAll(Model model){
        //查询所有员工
        List<Emp> empList=empService.queryEmpAll();
        model.addAttribute("empList",empList);
        return "/emp/list";
    }

    //删除
    @RequestMapping("/deleteEmp/{id}")
    public String  deleteEmp(@PathVariable Integer id){
        //使用服务层的方法删除数据
        empService.deleteEmp(id);
        //重定向到查全部
        return "redirect:/emp/queryEmpAll";
    }

    //修改页面
    @RequestMapping("/updatePageEmp/{id}")
    public String updatePageEmp(@PathVariable Integer id, Model model) {
        Emp emp = empService.getEmpById(id);
        model.addAttribute("emp", emp);
        return "/emp/update";
    }

    //修改
    @RequestMapping("/update")
    public String update(Integer id, String name, String address, String birthday) {
        Date date = Date.valueOf(birthday);
        Emp emp = new Emp(id, name, address, date);
        empService.updateEmp(emp);
        //System.out.println(emp);
        return "redirect:/emp/queryEmpAll";
    }

    //添加页面跳转
    @RequestMapping("/addPageEmp")
    public String addPageEmp() {
        return "/emp/add";
    }

    //添加
    @RequestMapping("/addEmp")
    public String addEmp(String name, String address, String birthday, Model model) {
        Date date = Date.valueOf(birthday);
        Emp emp = new Emp(name, address, date);
        empService.addEmp(emp);
        return "redirect:/emp/queryEmpAll";
    }





}
