# Enrollee Microservice

## Three different Spring Boot Applications

- **discovery-service**: Eureka Server for service registration.
- **api-gateway**: Zuul API gateway for delegating all the incoming requests.
- **enrollee-service**: Microservice providing endpoints for managing enrollee and dependents.

---

## Service Ports

- **discovery-service**: 8761
- **api-gateway**: 8765
- **enrollee-service**: 8080

---

## Endpoints provided by enrollee-service

[Import Postman Collection](EnrolleeMicroservice.postman_collection.json)

### Enrollee

| API Title                     | Request Methods | API                                |
| ----------------------------- | --------------- | ---------------------------------- |
| Save Enrollee                 | POST            | `/api/enrollment/v1/enrollee`      |
| Update Enrollee               | POST            | `/api/enrollment/v1/enrollee`      |
| Save Enrollee With Dependents | POST            | `/api/enrollment/v1/enrollee`      |
| Save Multiple Enrollees       | POST            | `/api/enrollment/v1/enrollee/all`  |
| Get Enrollee By ID            | GET             | `/api/enrollment/v1/enrollee/{id}` |
| Get All Enrollees             | GET             | `/api/enrollment/v1/enrollee/all`  |
| Delete Enrollee By ID         | DELETE          | `/api/enrollment/v1/enrollee/{id}` |

---

### Dependent

| API Title                     | Request Methods | API                                 |
| ----------------------------- | --------------- | ----------------------------------- |
| Save Dependent Under Enrollee | POST            | `/api/enrollment/v1/dependent`      |
| Update Dependent              | POST            | `/api/enrollment/v1/dependent`      |
| Save Multiple Dependents      | POST            | `/api/enrollment/v1/dependent/all`  |
| Get Dependent By ID           | GET             | `/api/enrollment/v1/dependent/{id}` |
| Get All Dependents            | GET             | `/api/enrollment/v1/dependent/all`  |
| Delete Dependent By ID        | DELETE          | `/api/enrollment/v1/dependent/{id}` |
