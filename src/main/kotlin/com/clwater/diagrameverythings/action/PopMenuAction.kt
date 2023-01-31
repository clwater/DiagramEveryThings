package com.clwater.diagrameverythings.action

import com.clwater.diagrameverythings.manager.NotificationManager
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class PopMenuAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        NotificationManager.notify(e.project, "pop menu")
    }
}