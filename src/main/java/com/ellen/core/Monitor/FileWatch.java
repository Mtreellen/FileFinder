package com.ellen.core.Monitor;

import com.ellen.core.common.HandlePath;

/**
 * 文件监控系统
 */
public interface FileWatch {
    /**
     * 监听启动
     */
    void start();
    /**
     * 监听目录
     */
    void monitor(HandlePath handlePath);
    /**
     * 监听停止
     */
    void stop();

}
