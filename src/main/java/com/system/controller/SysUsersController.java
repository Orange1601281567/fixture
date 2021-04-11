package com.system.controller;


import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.model.ReturnT;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.system.model.SysUsers;
import com.system.secunity.JwtUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.system.service.ISysUsersService;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.*;
import com.system.model.Log;
import com.system.model.OperationType;
import com.system.model.OperationUnit;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author Ablett_Chen
 * @since 2021-01-25
 */
 
@Api(value="SysUsersController",tags={"用户信息表"})
@RestController
@RequestMapping("/sysUsers")
public class SysUsersController {
	@Resource
    public ISysUsersService iSysUsersService;
	
	@ApiOperation("添加用户信息表")
    @PostMapping("/insert" )
    @Log(detail = "添加用户信息表",operationUnit = OperationUnit.SYSTEM,operationType = OperationType.INSERT)
	public ReturnT<String> insert(@RequestBody SysUsers sysUsers) {
		boolean ret= iSysUsersService.save(sysUsers);
		return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
	}
	
	@ApiOperation("更改用户信息表")
    @PutMapping("/update" )
    @Log(detail = "更改用户信息表",operationUnit = OperationUnit.SYSTEM,operationType = OperationType.UPDATE)
	public ReturnT<String> updateById(@RequestBody SysUsers sysUsers) {
		boolean ret= iSysUsersService.updateById(sysUsers);
		return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
	}
	
	@ApiOperation("更改或添加用户信息表")
    @PostMapping("/save" )
    @Log(detail = "更改或添加用户信息表",operationUnit = OperationUnit.SYSTEM,operationType = OperationType.UPDATE)
	public ReturnT<String> save(@RequestBody SysUsers sysUsers) {
		if(sysUsers.getId()!=null){
			boolean ret= iSysUsersService.updateById(sysUsers);
			return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
		}
		else{
			boolean ret= iSysUsersService.save(sysUsers);
			return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
		}
	}
	
	@ApiOperation("刪除用户信息表")
    @DeleteMapping("/{id}" )
    @Log(detail = "刪除用户信息表",operationUnit = OperationUnit.SYSTEM,operationType = OperationType.DELETE)
	public ReturnT<String> delete(@PathVariable int id) {
		boolean ret= iSysUsersService.removeById(id);
		return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
	}
	
	@ApiOperation("通過id查詢用户信息表")
    @GetMapping("/{id}" )
	public ReturnT<SysUsers> selectById(@PathVariable int id) {
		ReturnT<SysUsers> ret=new ReturnT<SysUsers>(iSysUsersService.getById(id));
		ret.setCount(1);
		ret.setCode(200);
		return ret;
	}
	
	@ApiOperation("查詢用户信息表(不分頁)")
	@PostMapping("/list" )
	public ReturnT<List<SysUsers>> list(@RequestBody Map<String,Object> columnMap) {
		ReturnT<List<SysUsers>> result=new  ReturnT<List<SysUsers>>(null);
        result.setCount(iSysUsersService.listByMap(columnMap).size());
        result.setData(iSysUsersService.listByMap(columnMap));
        result.setCode(200);
        return result;
	}
	
	
	@ApiOperation("查詢用户信息表(分頁)")
	@GetMapping("/pageList" )
	public ReturnT<List<SysUsers>> pageList(Integer limit,Integer page,String username,String name,String power) {
        QueryWrapper<SysUsers> wrapper = new QueryWrapper<SysUsers>();
        if(!username.equals("")) {
        	wrapper.like("username", username);
        }
        if(!name.equals("")) {
        	wrapper.like("name", name);
        }
        if(!power.equals("")) {
        	wrapper.eq("power", power);
        }
        Page<SysUsers> pages = new Page<SysUsers>(page,limit);
        IPage<SysUsers> iPage=iSysUsersService.page(pages, wrapper);
        ReturnT<List<SysUsers>> result=new  ReturnT<List<SysUsers>>(null);
        result.setCode(200);
        result.setCount((int) iPage.getTotal());
        result.setData(iPage.getRecords());
        return result;
	}
	
	@ApiOperation("獲取用戶信息")
	@GetMapping("/getInfo" )
	public ReturnT<SysUsers> getInfo(HttpServletRequest res) {
		String tokenHeader = res.getHeader(JwtUtils.TOKEN_HEADER);
	    String token = tokenHeader.replace(JwtUtils.TOKEN_PREFIX, "");
	    String username=JwtUtils.getUsername(token);
        QueryWrapper<SysUsers> wrapper = new QueryWrapper<SysUsers>();
        wrapper.eq("username", username);
        SysUsers user=iSysUsersService.getOne(wrapper);
        ReturnT<SysUsers> result=new  ReturnT<SysUsers>(null);
        result.setCode(200);
        result.setCount(1);
        result.setData(user);
        return result;
	}
}

