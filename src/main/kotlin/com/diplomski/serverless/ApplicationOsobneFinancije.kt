package com.diplomski.serverless

import com.diplomski.serverless.poc.NumberInput
import com.diplomski.serverless.poc.NumberOutput
import com.diplomski.serverless.poc.ServisFinancija
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.function.Function


@SpringBootApplication
class ApplicationOsobneFinancije {

    @Bean
    fun function(servisFinancija: ServisFinancija, objectMapper: ObjectMapper): Function<NumberInput, NumberOutput?> {
        return Function {
            val output = NumberOutput()
            output.result = servisFinancija.calculate(it.inputFirst, it.inputSecond, it.inputOperation)
            return@Function output
        }
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(ApplicationOsobneFinancije::class.java, *args)
        }
    }
}
