package com.checkmarx.sdk;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Enable Spring Boot autoconfiguration
 *
 * @author ken.mcdonald@checkmarx.com
 */
@SpringBootApplication(scanBasePackages = { "com.checkmarx.sdk", "com.cx.restclient" })
public class CheckmarxSdkApplication {


}
