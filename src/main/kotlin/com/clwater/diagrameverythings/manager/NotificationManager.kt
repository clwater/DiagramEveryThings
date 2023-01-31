package com.clwater.diagrameverythings.manager

import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project

/**
 * 通知管理器
 */
object NotificationManager {
    private const val groupId = "com.clwater.diagrameverythings.notification.group"

    /**
     * 显示通知(异常)
     *
     * @param project
     * @param content
     */
    fun notifyError(
        project: Project?,
        content: String
    ) {
        notify(project, content, NotificationType.ERROR)
    }

    /**
     * 显示通知(默认情况为通知)
     *
     * @param project
     * @param content
     */
    fun notify(
        project: Project?,
        content: String,
        type: NotificationType = NotificationType.INFORMATION
    ) {
        NotificationGroupManager.getInstance()
            .getNotificationGroup(groupId)
            .createNotification(content, type)
            .notify(project)
    }
}