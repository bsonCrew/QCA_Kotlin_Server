package com.qca.pagespeed.api

import com.qca.pagespeed.model.PageSpeedRequest
import com.qca.pagespeed.model.PageSpeedResponse
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class PageSpeedApi(
    private val webClient: WebClient,
) {
    fun callPageSpeedApi(request: PageSpeedRequest): PageSpeedResponse? =
        webClient
            .get()
            .uri { uriBuilder ->
                uriBuilder
                    .path(PAGE_SPEED_ONLINE_URL)
                    .queryParam(URL, request.url)
                    .build()
            }.retrieve()
            .bodyToMono(PageSpeedResponse::class.java)
            .block()

    companion object {
        const val PAGE_SPEED_ONLINE_URL = "/pagespeedonline/v5/runPagespeed"
        const val URL = "url"
    }
}
