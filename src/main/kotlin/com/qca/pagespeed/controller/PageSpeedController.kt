package com.qca.pagespeed.controller

import com.qca.pagespeed.model.PageSpeedRunRequest
import com.qca.pagespeed.service.PageSpeedService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pagespeed")
class PageSpeedController(
    val pageSpeedService: PageSpeedService,
) {
    @GetMapping("/run")
    fun runPageSpeed(
        @Valid
        request: PageSpeedRunRequest,
    ) = ResponseEntity.ok(pageSpeedService.runPageSpeed(request))
}
