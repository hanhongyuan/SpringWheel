package com.yk.common.constants;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: hejm
 * Date: 2016/4/25
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
@Component("ykConstant")
public class YKConstant {
     /****************   page default  *************/
    /**
     * 列表页面大小
     */
    public static final int PAGE_SIZE = 5;


    /****************   提示页面  *************/
    /**
     * 信息提示页面
     */
    public static final String MSG_PAGE = "/msg";

    /****************   i18n 国际化  *************/
    /**
     * 编码信息路径
     */
    public static final String I18N_MSG = "classpath:/i18n/messages";

    /**
     * 消息显示
     */
    public static final String I18N_CODE = "classpath:/i18n/code";

    /**
     * 编码
     */
    public static final String I18N_ENCODIND = "UTF-8";






}
