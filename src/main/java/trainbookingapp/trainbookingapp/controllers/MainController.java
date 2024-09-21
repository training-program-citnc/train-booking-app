package trainbookingapp.trainbookingapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String mainPage() {
    return "main-page.html";
  }

  @GetMapping("/admin-login")
  public String adminLoginPage() {
    return "admin-login-page.html";
  }

  @GetMapping("/book-ticket")
  public String bookTicketPage() {
    return "book-ticket-page.html";
  }

  @GetMapping("/cancel-ticket")
  public String cancelTicketPage() {
    return "cancel-ticket-page.html";
  }

  @GetMapping("/create-movie")
  public String createMoviePage() {
    return "create-movie-page.html";
  }

  @GetMapping("/delete-movie")
  public String deleteMoviePage() {
    return "delete-movie-page.html";
  }

  @GetMapping("/edit-movie")
  public String editMoviePage() {
    return "edit-movie-page.html";
  }

  @GetMapping("/forgot-password")
  public String forgotPasswordPage() {
    return "forgot-password-page.html";
  }

  @GetMapping("/audience-details")
  public String passangerDetailsPage() {
    return "audience-details-page.html";
  }

  @GetMapping("/payment")
  public String paymentPage() {
    return "payment-page.html";
  }

  @GetMapping("/reset-password")
  public String resetPasswordPage() {
    return "reset-password-page.html";
  }

  @GetMapping("/search-booked-ticket-details")
  public String searchBookTicketDetailsPage() {
    return "search-booked-ticket-details-page.html";
  }

  @GetMapping("/search-movie")
  public String ticketSearchPage() {
    return "search-movie.html";
  }

  @GetMapping("/user-dashboard")
  public String userDashboardPage() {
    return "user-dashboard-page.html";
  }

  @GetMapping("/user-login")
  public String userLoginPage() {
    return "user-login-page.html";
  }

  @GetMapping("/user-register")
  public String userRegisterPage() {
    return "user-register-page.html";
  }

  @GetMapping("/admin-register")
  public String adminRegisterPage() {
    return "admin-register-page.html";
  }

  @GetMapping("/view-booked-detail")
  public String viewBookedDetailPage() {
    return "view-booked-detail-page.html";
  }

  @GetMapping("/view-booked-ticket")
  public String viewBookedTicketPage() {
    return "view-booked-ticket-page.html";
  }

  @GetMapping("/admin-dashboard")
  public String adminDasboard() {
    return "admin-dashboard-page.html";
  }
}
