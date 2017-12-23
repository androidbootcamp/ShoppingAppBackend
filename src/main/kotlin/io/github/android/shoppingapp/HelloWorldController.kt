package io.github.android.shoppingapp

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/")
class HelloWorldController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") name: String): String {
        return "hello"
    }
}