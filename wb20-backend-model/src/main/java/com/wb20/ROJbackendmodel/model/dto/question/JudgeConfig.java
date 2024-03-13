package com.wb20.ROJbackendmodel.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制: ms
     */

    private Long timeLimit;

    /**
     * 内存限制: kb
     */
    private Long memoryLimit;

    /**
     * 堆栈限制L: kb
     */
    private Long stackLimit;

}
