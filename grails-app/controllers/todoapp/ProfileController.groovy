package todoapp

import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.OK
import static org.springframework.http.HttpStatus.CREATED
import grails.gorm.transactions.Transactional

class ProfileController {

    static allowedMethods = [get: "GET", edit: "POST", follow:"PUT" ]
    static defaultAction = "get"

    @Transactional
    def get(Integer ID) {

    }

    @Transactional
    def edit(Integer ID) {

    }

    @Transactional
    def follow(Integer ID) {
        
    }
}
