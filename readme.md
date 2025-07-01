# EcommerceSpring 📦

A Spring Boot–based backend service for an e-commerce application. It fetches product categories from a fake-store API using either **Retrofit** or **RestTemplate**, and follows a clean layered architecture. Designed with flexibility, separation of concerns, and future scalability in mind.

---

## 🧱 Features

- Fetches product categories from [fakestoreapi.in](https://fakestoreapi.in/)
- Follows a clean architecture: Controller → Service → Gateway → DTO
- Multiple implementations of `ICategoryGateway` (Retrofit and RestTemplate)
- Uses `@Primary` and `@Qualifier` to switch gateway strategies
- Ready to scale for complete e-commerce features like Products, Orders, Cart, etc.

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Gradle 7.x+
- Internet connection (to call FakeStore API)

### Setup Instructions

1. **Clone the repository**

   ```bash
   git clone https://github.com/Shayan-Perwaiz/EcommerceSpring.git
   cd EcommerceSpring


### API Endpoints
The following endpoints are available for interacting with products and categories:

| Method | Endpoint                     | Description                              |
|--------|-----------------------------|------------------------------------------|
| GET    | `/products`                 | Retrieve all products                    |
| GET    | `/products/{id}`            | Retrieve a product by ID                 |
| GET    | `/categories`               | Retrieve all product categories          |


### Example Requests and Responses
 
1. **Get Product by ID**
    - **Request**:
      ```bash
      curl http://localhost:3000/api/products/1
      ```
    - **Response** (example):
      ```json
   {
   "id": 1,
   "title": "Fjallraven - Foldsack No. 1 Backpack",
   "price": 109.95,
   "category": "men's clothing",
   "description": "Your perfect pack for everyday use...",
   "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg"
   }
     ```

2. **Get All Categories**
    - **Request**:
      ```bash
      curl http://localhost:3000/api/categories
      ```
    - **Response**:
      ```json
      ["electronics", "jewelery", "men's clothing", "women's clothing"]
      ```
      
