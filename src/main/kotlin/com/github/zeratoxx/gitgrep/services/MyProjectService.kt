package com.github.zeratoxx.gitgrep.services

import com.github.zeratoxx.gitgrep.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
