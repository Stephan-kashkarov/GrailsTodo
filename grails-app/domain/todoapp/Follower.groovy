package todoapp
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Follower implements Serializable {
    User follower
    User following

    static belongsTo = [following: User]
    static hasOne = [follower: User]

    static constraints = {
        following blank: false
        follower blank: false
    }
}
