package com.github.patriciagallardo.qmlplugin.services

import com.github.patriciagallardo.qmlplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
