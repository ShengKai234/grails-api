package com.example.myapi

import grails.converters.JSON

class BookController {

    def index() {
        System.out.println("Book index!!!!");
        render Book.list() as JSON
    }

    def show() {
        def book = Book.get(params.id)
        if (!book) {
            notFound()
            return
        }
        render book as JSON
    }

    def create() {
        def book = new Book(params)
        if (book.save()) {
            render book as JSON
        } else {
            render book.errors as JSON
        }
    }

    def update() {
        def book = Book.get(params.id)
        if (!book) {
            notFound()
            return
        }
        book.properties = params
        if (book.save()) {
            render book as JSON
        } else {
            render book.errors as JSON
        }
    }

    def delete() {
        def book = Book.get(params.id)
        if (!book) {
            notFound()
            return
        }
        book.delete()
        render status: HttpStatus.NO_CONTENT
    }
}
