package user.service

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("user.service")
                .mainClass(Application.javaClass)
                .start()
    }
}