package todoapp

import grails.gorm.services.Service

@Service(Follower)
interface FollowerService {
    Follower save(User following, User follower)
}