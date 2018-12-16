/**
 * Copyright 2018 Red Energy Limited
 * User: miriyaln 
 * Date: 17/12/18 9:54 AM
 */
package au.com.redenergy.MicroserviceClient.controller

import com.netflix.discovery.EurekaClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingControllerImpl implements GreetingController {
  @Autowired
  EurekaClient eurekaClient
  @Value("\${spring.application.name}")
  private String appName

  @Override
  String greeting() {
    return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName())
  }
}
