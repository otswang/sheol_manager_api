package win.ots.sheol.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import win.ots.sheol.api.util.Result;
import win.ots.sheol.api.web.vo.*;

/**
 * @author: sy.wang
 * @date: 2019-11-23
 */
@Api("登录管理")
@RestController
@RequestMapping("/v0.1")
public class LoginController {

    @ApiOperation("登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result<UserVo> login(@RequestBody UserLogin userLogin) {
        assert userLogin != null;
        return Result.success(null);
    }

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/sms/code", method = RequestMethod.GET)
    public Result<String> getSmsCode(@RequestParam("mobile") @ApiParam("手机号") String mobile,
                                     @RequestParam("type") @ApiParam("验证码类型 0 登录 1 重置") Integer type) {

        return Result.success(null);
    }

    @ApiOperation("用手机号登录")
    @RequestMapping(value = "/login/mobile", method = RequestMethod.POST)
    public Result<UserVo> loginByMobile(@RequestBody MobileLoginInfo loginInfo) {
        return Result.success(null);
    }

    @ApiOperation("重置密码")
    @RequestMapping(value = "/password/reset", method = RequestMethod.POST)
    public Result<UserVo> resetPassw(@RequestBody PasswordResetInfo resetInfo) {
        return Result.success(null);
    }

    @ApiOperation("用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Result<UserVo> register(@RequestBody UserRegisterInfo registerInfo) {
        return Result.success(null);
    }

}

