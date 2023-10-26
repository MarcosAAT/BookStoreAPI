# Team Project CEN 4010: Geek Text

## Project Overview

We're building an API Service to support an online web application bookstore called "Geek Text". This bookstore targets a niche in technology.

## Features

### 1. Book Browsing and Sorting

- **Benefit**: Users will have a simple and enjoyable way to discover new books and authors, and sort results.

#### API Actions:

- **Retrieve List of Books by Genre**
  - HTTP Request Type: `GET`
  - Parameters: `Genre`
  - Response: JSON List of book objects

- **Retrieve List of Top Sellers**
  - HTTP Request Type: `GET`
  - Response: JSON List of book objects sorted by top sellers

- **Retrieve List of Books for a particular rating and higher**
  - HTTP Request Type: `GET`
  - Parameters: `Rating`
  - Response: JSON List of book objects

- **Discount books by publisher**
  - HTTP Request Type: `PUT` or `PATCH`
  - Parameters: `Discount percent`, `Publisher`

### 2. Profile Management

- **Benefit**: Allows users to manage their personal details, preferences, and purchase history.

#### API Actions:

- **Create a New User Profile**
  - HTTP Request Type: `POST`
  - Parameters: `Full Name`, `Username`, `Password`, `Email`
  - Response: Confirmation message or error

- **Update User Profile**
  - HTTP Request Type: `PUT` or `PATCH`
  - Parameters: `UserID`, `Field(s) to update`, `New value(s)`
  - Response: Confirmation message or error

- **Retrieve User Purchase History**
  - HTTP Request Type: `GET`
  - Parameters: `UserID`
  - Response: JSON List of purchased items

### 3. Shopping Cart

- **Benefit**: Provides users a space to store their desired books before purchase.

#### API Actions:

- **Add Book to Cart**
  - HTTP Request Type: `POST`
  - Parameters: `UserID`, `BookID`
  - Response: Confirmation message or error

- **Remove Book from Cart**
  - HTTP Request Type: `DELETE`
  - Parameters: `UserID`, `BookID`
  - Response: Confirmation message or error

- **View Cart Contents**
  - HTTP Request Type: `GET`
  - Parameters: `UserID`
  - Response: JSON List of books in cart

### 4. Book Details

- **Benefit**: Offers users comprehensive details about a book, enhancing decision-making for purchases.

#### API Actions:

- **Retrieve Book Details**
  - HTTP Request Type: `GET`
  - Parameters: `BookID`
  - Response: JSON object containing book details (author, publisher, price, etc.)

### 5. Book Rating and Commenting

- **Benefit**: Enables users to provide feedback, aiding other users in their purchasing decisions.

#### API Actions:

- **Submit Book Rating/Review**
  - HTTP Request Type: `POST`
  - Parameters: `UserID`, `BookID`, `Rating`, `Review Text (optional)`
  - Response: Confirmation message or error

- **Retrieve All Ratings/Reviews for a Book**
  - HTTP Request Type: `GET`
  - Parameters: `BookID`
  - Response: JSON List of ratings and reviews

### 6. Wish List Management

- **Benefit**: Allows users to keep a list of books they hope to purchase in the future.

#### API Actions:

- **Add Book to Wish List**
  - HTTP Request Type: `POST`
  - Parameters: `UserID`, `BookID`
  - Response: Confirmation message or error

- **Remove Book from Wish List**
  - HTTP Request Type: `DELETE`
  - Parameters: `UserID`, `BookID`
  - Response: Confirmation message or error

- **View Wish List**
  - HTTP Request Type: `GET`
  - Parameters: `UserID`
  - Response: JSON List of books in wish list

## Architecture

The REST API service will have:

- **RESTful API**: An API service exposed to the front using HTTPS, exposing functional endpoints.
- **Backend Database**: A Database of choice to store data, which can only be accessed by the API.

## Development Process

We'll use the **Scrum** agile methodology. The process includes:

- **Sprints**: Timeboxed intervals for development.
- **Sprint Planning**: Discuss and estimate the functionality to implement during the sprint.
- **Daily Standups**: Regular check-ins on progress.
- **Sprint Review**: Demo the work completed.
- **Sprint Retrospective**: Discuss what went well and potential improvements.

### Roles:

- **Developers (6)**: Responsible for creating features and writing user stories.
- **Product Owner**: Reviews the backlog of user stories and liaises with the instructor about product functionality.
- **Scrum Master**: Oversees the sprint, removes impediments, and addresses issues.

Each sprint will rotate the roles of Product Owner and Scrum Master among team members.

---

