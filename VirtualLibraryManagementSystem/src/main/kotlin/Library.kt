package org.example

class Library {

    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        println("Book '${book.title}' added to the library.")
    }

    fun borrowBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }

        if (book != null) {
            if (book.availableCopies > 0) {
                book.availableCopies -= 1
                println("You successfully borrowed '${book.title}'.")
            } else {
                println("Sorry, '${book.title}' is currently unavailable.")
            }
        } else {
            println("Book '$title' not found in the library.")
        }
    }

    fun returnBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }

        if (book != null) {
            book.availableCopies += 1
            println("Thank you for returning '${book.title}'.")
        } else {
            println("Book '$title' does not belong to this library.")
        }
    }

    fun showBooks() {
        if (books.isEmpty()) {
            println("The library has no books.")
            return
        }

        println("\nLibrary Collection:")
        for (book in books) {
            println("Title: ${book.title}")
            println("Author: ${book.author}")
            println("Available Copies: ${book.availableCopies}")
            println("----------------------")
        }
    }

    fun searchByAuthor(author: String) {
        val results = books.filter { it.author.equals(author, ignoreCase = true) }

        if (results.isEmpty()) {
            println("No books found by $author.")
        } else {
            println("Books by $author:")
            for (book in results) {
                println("- ${book.title}")
            }
        }
    }
}