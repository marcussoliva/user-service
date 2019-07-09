package user.service

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/users")
class UserController {

    @Get("/")
    fun get() = (User("Marcus Sousa", "solivavinicius@gmail.com"))
}