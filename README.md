<!-- ABOUT THE PROJECT -->
# grails-api
## About The Project
<!-- project img ... -->

This is api server framework using Grails.

### Built with
- Grails 4.0.10

## Getting Started
### Prerequisites
* Grails

## Quick started
* prod
    ```sh
    ng serve ---prod
    ```

### Installation


## Usage
* Create new project
    ```sh
    grails create-app myapi --profile=rest-api
    ```
* Create a domain class
    ```sh
    grails create-domain-class com.example.myapi.book
    ```
* Create a controller
    ```sh
    grails create-controller com.example.myapi.BookController
    ```
* Define URL mappings
    **path**: `grails-app/controllers/com/example/myapi/UrlMappings.groovy` 
    ```groovy
    package com.example.myapi

    class UrlMappings {

        static mappings = {
            "/api/books"(resources: "book")
        }
    }
    ```
* Run
    ```sh
    grails run-app
    ```
* Restful
    This will create the following RESTful endpoints:
    * `GET /api/books` - list all books
    * `GET /api/books/:id` - show a single book
    * `POST /api/books` - create a new book
    * `PUT /api/books/:id` - update an existing book
    * `DELETE /api/books/:id` - delete a book

* **main class**: /myapi/grails-app/init/sbmis.backend/Application.groovy

## Roadmap

## Contributing

## License

## Contact

## Acknowledgments
