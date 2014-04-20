package com.deigote.grails

class AuthorController {

    def index() {
       String successQuery = "from Author a where a.books['0140869352'] like '%Pupil%'"
       [
          successfulQuery: successQuery,
          successfulQueryResult: Author.executeQuery(successQuery),
          allAuthors: Author.findAll()
       ]

    }
}
