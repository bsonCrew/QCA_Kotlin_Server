package com.qca.pagespeed.controller

import com.qca.pagespeed.model.PageSpeedRequest
import com.qca.pagespeed.service.PageSpeedService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pagespeed")
class PageSpeedController(
    val pageSpeedService: PageSpeedService,
) {
    @PostMapping("/run")
    fun runPageSpeed(
        @RequestBody @Valid
        request: PageSpeedRequest,
    ) = ResponseEntity.ok(pageSpeedService.runPageSpeed(request))
}
