package com.qca.pagespeed.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfig {
    @Bean
    fun webClient(): WebClient =
        WebClient.builder()
            .baseUrl(BASE_URL)
            .codecs {
                it.defaultCodecs().maxInMemorySize(MEMORY_SIZE)
            }
            .build()

    companion object {
        const val BASE_URL = "https://www.googleapis.com"
        const val MEMORY_SIZE = 1024 * 1024 * 50
    }
}
