package com.yx.pos.controller;

import com.yx.pos.base.QueryMap;
import com.yx.pos.comm.BusinessException;
import com.yx.pos.model.SysUser;
import com.yx.pos.model.SysWorkstation;
import com.yx.pos.service.SysUserService;
import com.yx.pos.service.SysWorkstationService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/login")
@Api(value = "登录相关", description = "登录相关")
public class LoginController {

    @Resource
    SysWorkstationService sysWorkstationService;

    @Resource
    SysUserService sysUserService;

    @ApiOperation(value = "用户登录验证", notes = "用户登录验证")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "登录用户", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "userPwd", value = "登录密码", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "computerMac", value = "MAC地址", paramType = "query", required = true, dataType = "String"),
    })
    @RequestMapping(value = "/userVerify", method =  RequestMethod.POST)
    public void userVerify(@ApiParam String userId,
                           @ApiParam String userPwd,
                           @ApiParam String computerMac) throws BusinessException{
        QueryMap queryMap = new QueryMap();
        queryMap.put("computerMac",computerMac);
        SysWorkstation sysWorkstation = sysWorkstationService.getOne(queryMap);
        if(sysWorkstation == null){
            throw BusinessException.fail("POS机未注册");
        }
        queryMap.clear();
        queryMap.put("userId",userId);
        queryMap.put("userPwd",userPwd);
        queryMap.put("userStatus","1");
//TODO:        这里应该是要加上operType<>'0',需要修改mapper.xml文件中的条件组合
//        queryMap.put("operType","^01");
        SysUser sysUser = sysUserService.getOne(queryMap);
        if(sysUser == null){
            throw BusinessException.fail("用户或密码不正确");
        }

    }

    @ApiOperation(value = "注册", notes = "POS机注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "branchNo", value = "机构编码", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "computerMac", value = "MAC地址", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jh", value = "POS机号-2位数字或字母", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "type", value = "POS机类型-0自收银1公共收银机", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "counterNo", value = "专柜编码-多个编码用;隔开", paramType = "query", required = true, dataType = "String"),
    })
    @RequestMapping(value = "/posRegister", method =  RequestMethod.POST)
    public void posRegister(@ApiParam String branchNo,
                            @ApiParam String computerMac,
                            @ApiParam String jh,
                            @ApiParam String type,
                            @ApiParam String counterNo) throws BusinessException{
        QueryMap queryMap = new QueryMap();
        //1.判断mac是否已经注册过
        queryMap.put("computerMac",computerMac);
        if(sysWorkstationService.getOne(queryMap) != null){
            throw  BusinessException.fail("本机已经注册过");
        }
        //2.判断机号是否已经被注册过
        queryMap.clear();
        queryMap.put("jh",jh);
        if(sysWorkstationService.getOne(queryMap) != null){
            throw BusinessException.fail("机号已经被注册过,请重新输入另一个机号");
        }

        SysWorkstation sysWorkstation = new SysWorkstation();
        sysWorkstation.setJh(jh);
        //        需要加密mac编码
        sysWorkstation.setComputerMac(computerMac);
//        POS机类型:0专柜收银机 1公共收银机
        sysWorkstation.setType(type);
//        对应的专柜
        sysWorkstation.setCounterNo(counterNo);
        sysWorkstation.setIsBlls("0");
        sysWorkstation.setLoginPos("1");
        sysWorkstation.setLoginHt("0");
        sysWorkstation.setIsInit("0");
        sysWorkstation.setIsRaid("0");
        sysWorkstation.setIsLogout("0");
        sysWorkstationService.create(sysWorkstation);
    }
    @ApiOperation(value = "更新注册信息", notes = "POS机更新注册信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "jh", value = "POS机号-2位数字或字母", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "type", value = "POS机类型-0自收银1公共收银机", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "counterNo", value = "专柜编码-多个编码用;隔开", paramType = "query", required = true, dataType = "String"),
    })
    @RequestMapping(value = "/posRegisterUpdate", method =  RequestMethod.POST)
    public void posRegisterUpdate(@ApiParam String jh,
                                  @ApiParam String type,
                                  @ApiParam String counterNo) throws BusinessException{
        QueryMap queryMap = new QueryMap();
        queryMap.put("jh",jh);
        SysWorkstation sysWorkstation = sysWorkstationService.getOne(queryMap);
        if( sysWorkstation== null){
            throw  BusinessException.fail("无法查询到有效的机号信息");
        }else{
            sysWorkstation.setType(type);
            sysWorkstation.setCounterNo(counterNo);
            sysWorkstationService.update(sysWorkstation);
        }

    }
}
