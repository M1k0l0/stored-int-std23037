package com.poja.app.endpoint.rest.controller.health;

import com.poja.app.model.StoredInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoredIntController {
  private StoredInt storedInt;

  public StoredIntController() {
    storedInt = new StoredInt();
  }

  @GetMapping("/stored-int")
  public String getStoredInt() {
    return storedInt.getStoredInt();
  }
}
