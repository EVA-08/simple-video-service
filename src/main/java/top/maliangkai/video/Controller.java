package top.maliangkai.video;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maliangkai@itiger.com
 * @date 2020/5/25
 */
@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
