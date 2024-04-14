package com.qca.pagespeed.api

import com.qca.pagespeed.model.PageSpeedRunRequest
import com.qca.pagespeed.model.PageSpeedRunResponse
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class PageSpeedApi(
    private val webClient: WebClient,
) {
    fun callPageSpeedApi(request: PageSpeedRunRequest): PageSpeedRunResponse? {
        return webClient.get()
            .uri { uriBuilder ->
                uriBuilder
                    .path(PAGE_SPEED_ONLINE_URL)
                    .queryParam("url", request.url)
                    .build()
            }
            .retrieve()
            .bodyToMono(PageSpeedRunResponse::class.java)
            .block()
    }

    companion object {
        const val PAGE_SPEED_ONLINE_URL = "/pagespeedonline/v5/runPagespeed"
    }
}
