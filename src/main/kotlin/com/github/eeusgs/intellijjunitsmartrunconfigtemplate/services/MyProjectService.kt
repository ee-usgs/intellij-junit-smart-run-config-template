package com.github.eeusgs.intellijjunitsmartrunconfigtemplate.services

import com.github.eeusgs.intellijjunitsmartrunconfigtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
