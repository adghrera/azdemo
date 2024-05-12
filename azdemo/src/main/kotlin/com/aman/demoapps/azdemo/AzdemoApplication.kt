package com.aman.demoapps.azdemo

import com.aman.demoapps.azdemo.controllers.BlogProperties
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class AzdemoApplication

fun main(args: Array<String>) {
	runApplication<AzdemoApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}

