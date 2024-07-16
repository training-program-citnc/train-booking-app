package trainbookingapp.trainbookingapp.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

  public static class Temp {

    private List<String> list;

    public Temp(List<String> list) {
      this.list = list;
    }
  }

  @GetMapping("/getList")
  public Temp getAdjustments() {
    return new Temp(List.of("chennai"));
  }
}
