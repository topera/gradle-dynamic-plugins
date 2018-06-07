package com.topera.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ShowColor extends DefaultTask {

    def color

    @TaskAction
    void run() {
        println "My color is $color"
    }

}