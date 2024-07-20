package trainbookingapp.trainbookingapp.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.EmailSenderService;
import trainbookingapp.trainbookingapp.Response;
import trainbookingapp.trainbookingapp.entity.VerifyUser;
import trainbookingapp.trainbookingapp.repository.VerifyUserRepository;

@RestController
@RequestMapping("/api")
public class ForgotPasswordController {

  @Autowired
  private VerifyUserRepository verifyUserRepository;

  @Autowired
  private EmailSenderService emailSenderService;

  @GetMapping("/send-otp")
  public Response sendOtp(@RequestParam String email) {
    String OTP = (int) Math.floor(100000 + Math.random() * 9000000) + "";
    emailSenderService.sendEmail(
      email,
      "OTP for Train Booking App ",
      "Your OTP is " + OTP
    );
    VerifyUser verifyUser = new VerifyUser();
    verifyUser.setEmail(email);
    verifyUser.setOtp(OTP);
    verifyUserRepository.save(verifyUser);
    Response response = new Response();
    response.message = "OTP Sent Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/verify-otp")
  public Response verifyOtp(
    @RequestParam String email,
    @RequestParam String otp
  ) {
    return new Response();
  }
}
