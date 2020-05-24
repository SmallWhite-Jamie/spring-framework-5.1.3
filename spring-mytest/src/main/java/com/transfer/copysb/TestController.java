package com.transfer.copysb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizheng
 * @date: 21:59 2019/03/10
 * @Description: TestController
 */
@RestController
@RequestMapping("csb")
public class TestController {

    @RequestMapping("test")
    public String test() {
        System.out.println("Copy SpringBoot");
        return "Copy SpringBoot";
    }

}
