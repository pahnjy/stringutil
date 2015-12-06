package com.pineone.code.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pahnj on 2015-12-06.
 */
@RestController
public class StringUtilController {


    @Autowired
    IMiniStringUtil miniStringUtil;

    @RequestMapping(value = "/stringutil/{value}", method = RequestMethod.POST)
    public String dataProtocalController(@RequestBody String length,@PathVariable String value) {
        return miniStringUtil.changeExpression(value, length);
    }

}
