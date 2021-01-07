package com.example

import groovy.transform.CompileStatic
import io.micronaut.context.annotation.Requires
import io.micronaut.scheduling.annotation.Scheduled
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.inject.Singleton

@CompileStatic
@Singleton
@Requires(notEnv = "test")
class CsmTestJob {

    private static final Logger log = LoggerFactory.getLogger(CsmTestJob)
    @Scheduled(fixedDelay = '${feature.job.execute}')
    void executeCsmTests() {
        log.debug "CSM Test Job Is Running"
    }
}