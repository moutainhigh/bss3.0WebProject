package com.asia.web.openApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author WangBaoQiang
 * @ClassName: TestControler
 * @description: TODO
 * @date 2019/7/2919:28
 * @Version 1.0
 */
@Controller
public class TestControler {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}