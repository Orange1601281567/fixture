package com.system.controller;


import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.model.ReturnT;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.system.model.SysLog;
import javax.annotation.Resource;
import com.system.service.ISysLogService;
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
 * 日志信息 前端控制器
 * </p>
 *
 * @author Ablett_Chen
 * @since 2021-01-25
 */
 
@Api(value="SysLogController",tags={"日志信息"})
@RestController
@RequestMapping("/sysLog")
public class SysLogController {
	@Resource
    public ISysLogService iSysLogService;
	
	@ApiOperation("添加日志信息")
    @PostMapping("/insert" )
    @Log(detail = "添加日志信息",operationUnit = OperationUnit.SYSTEM,operationType = OperationType.INSERT)
	public ReturnT<String> insert(@RequestBody SysLog sysLog) {
		boolean ret= iSysLogService.save(sysLog);
		return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
	}
	
	@ApiOperation("更改日志信息")
    @PutMapping("/update" )
    @Log(detail = "更改日志信息",operationUnit = OperationUnit.SYSTEM,operationType = OperationType.UPDATE)
	public ReturnT<String> updateById(@RequestBody SysLog sysLog) {
		boolean ret= iSysLogService.updateById(sysLog);
		return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
	}
	
	@ApiOperation("更改或添加日志信息")
    @PostMapping("/save" )
    @Log(detail = "更改或添加日志信息",operationUnit = OperationUnit.SYSTEM,operationType = OperationType.UPDATE)
	public ReturnT<String> save(@RequestBody SysLog sysLog) {
		if(sysLog.getId()!=null){
			boolean ret= iSysLogService.updateById(sysLog);
			return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
		}
		else{
			boolean ret= iSysLogService.save(sysLog);
			return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
		}
	}
	
	@ApiOperation("刪除日志信息")
    @DeleteMapping("/{id}" )
    @Log(detail = "刪除日志信息",operationUnit = OperationUnit.SYSTEM,operationType = OperationType.DELETE)
	public ReturnT<String> delete(@PathVariable int id) {
		boolean ret= iSysLogService.removeById(id);
		return ret==true?ReturnT.SUCCESS:ReturnT.FAIL;
	}
	
	@ApiOperation("通過id查詢日志信息")
    @GetMapping("/{id}" )
	public ReturnT<SysLog> selectById(@PathVariable int id) {
		ReturnT<SysLog> ret=new ReturnT<SysLog>(iSysLogService.getById(id));
		ret.setCount(1);
		ret.setCode(200);
		return ret;
	}
	
	@ApiOperation("查詢日志信息(不分頁)")
	@PostMapping("/list" )
	public ReturnT<List<SysLog>> list(@RequestBody Map<String,Object> columnMap) {
		ReturnT<List<SysLog>> result=new  ReturnT<List<SysLog>>(null);
        result.setCount(iSysLogService.listByMap(columnMap).size());
        result.setData(iSysLogService.listByMap(columnMap));
        result.setCode(200);
        return result;
	}
	
	
	@ApiOperation("查詢日志信息(分頁)")
	@GetMapping("/pageList" )
	public ReturnT<List<SysLog>> pageList(int limit,int page) {
        QueryWrapper<SysLog> wrapper = new QueryWrapper<SysLog>();
        Page<SysLog> pages = new Page<SysLog>(page,limit);
        IPage<SysLog> iPage=iSysLogService.page(pages, wrapper);
        ReturnT<List<SysLog>> result=new  ReturnT<List<SysLog>>(null);
        result.setCode(200);
        result.setCount((int) iPage.getTotal());
        result.setData(iPage.getRecords());
        return result;
	}
	
	
}

