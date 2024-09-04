# Train Booking App

This is a simple implementation of a Train Booking Application using the following technology stack:

- **Spring Boot**: Backend framework for building RESTful APIs.
- **HTML**: Frontend markup for creating the structure of the web pages.
- **CSS**: Styling the frontend for better user experience.
- **MySQL**: Relational database to store and manage booking details.

## Features

- **Train Search**: Users can search for available trains by entering their journey details.
- **Booking Management**: Users can book tickets, view existing bookings, and cancel them if needed.
- **Email Notifications**: The app sends email notifications to users for booking confirmations and other important updates.
- **User Authentication**: Basic user authentication to secure the booking process.

## Endpoints

The application provides several RESTful endpoints for interacting with the booking system:

- **/api/trains**: Fetches available trains based on search criteria.
- **/api/bookings**: Manages booking operations like creating, viewing, and canceling bookings.
- **/api/users**: Manages user registration and login.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- MySQL

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/train-booking-app.git
   cd train-booking-app
   ```

2. **Configure MySQL:**

   - Create a database named `train_booking`.
   - Update the `application.properties` file with your MySQL credentials.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/train_booking
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

3. **Build the application:**

   ```bash
   mvn clean install
   ```

4. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

5. **Access the application:**

   - The app will be accessible at `http://localhost:8080`.

## Usage

- **Train Search**: Go to the `/trains` endpoint and enter your journey details to search for available trains.
- **Booking Tickets**: Use the `/bookings` endpoint to book your tickets.
- **Manage Bookings**: View or cancel your bookings via the `/bookings` endpoint.
- **User Login**: Register or log in using the `/users` endpoint to manage your bookings securely.

## Contributing

If you would like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

## License

This project is open-source and available under the [MIT License](LICENSE).
