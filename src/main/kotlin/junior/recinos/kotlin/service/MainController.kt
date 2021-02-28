package junior.recinos.kotlin.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class HelloDto(val greeting: String)

@RestController
class MainController {

    @GetMapping("/hello")
    fun hello(): HelloDto = HelloDto("nice code")
}