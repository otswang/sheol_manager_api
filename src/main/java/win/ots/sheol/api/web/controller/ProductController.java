package win.ots.sheol.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import win.ots.sheol.api.util.Result;
import win.ots.sheol.api.web.vo.ProductQueryVo;
import win.ots.sheol.api.web.vo.ProductVo;

import javax.validation.Valid;
import java.util.List;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Api("商品管理")
@RestController
@RequestMapping("/v0.1/products")
public class ProductController {

    @ApiOperation("查询列表")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<Page<ProductVo>> query(@RequestBody @Valid ProductQueryVo queryVo) {

        return Result.success(null);
    }

    @ApiOperation("编辑")
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public Result<ProductVo> edit(@RequestBody @Valid ProductVo productVo) {
        return Result.success(null);
    }

    @ApiOperation("删除")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Result<Integer> delete(@RequestBody List<Integer> ids,
                                  @RequestParam @ApiParam("验证码，当批量删除需要") String checkCode,
                                  @RequestParam @ApiParam("验证id，与验证码一一对应") String checkId) {
        return Result.success(null);
    }

}
