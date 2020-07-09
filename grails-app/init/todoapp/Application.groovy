package todoapp

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import groovy.transform.CompileStatic

@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        grails.plugin.springsecurity.logout.postOnly = false
        GrailsApp.run(Application, args)
    }
}