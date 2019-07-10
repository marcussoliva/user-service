package user.service

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/users")
class UserController {

    @Get("/")
    fun get(): List<User> {
        return listOf(User("Marcus Sousa", "solivavinicius@gmail.com"),
                User("Marcus Soliva", "solivavinicius@gmail.com"),
                User("Vinicius", "solivavinicius@gmail.com"))
    }
}