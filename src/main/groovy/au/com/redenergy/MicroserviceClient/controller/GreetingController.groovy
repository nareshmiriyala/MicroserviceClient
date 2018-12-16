/**
 * Copyright 2018 Red Energy Limited
 * User: miriyaln 
 * Date: 17/12/18 9:54 AM
 */
package au.com.redenergy.MicroserviceClient.controller

import org.springframework.web.bind.annotation.RequestMapping


public interface GreetingController {
  @RequestMapping("/greeting")
  String greeting();
}
