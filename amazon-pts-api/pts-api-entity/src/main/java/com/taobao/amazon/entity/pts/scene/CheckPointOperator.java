package com.taobao.amazon.entity.pts.scene;

/**
 * @function 检查点的检查条件
 */
public class CheckPointOperator {

    /**
     * 大于
     */
    public static final String CHECK_GT = "gt";

    /**
     * 大于等于
     */
    public static final String CHECK_GTE = "gte";

    /**
     * 小于
     */
    public static final String CHECK_LT = "lt";

    /**
     * 小于等于
     */
    public static final String CHECK_LTE = "lte";

    /**
     * 等于
     */
    public static final String CHECK_EQ = "eq";

    /**
     * 不等于
     */
    public static final String CHECK_N_EQ = "n_eq";

    /**
     * 包含
     */
    public static final String CHECK_CTN = "ctn";

    /**
     * 不包含
     */
    public static final String CHECK_N_CTN = "n_ctn";

    /**
     * 存在
     */
    public static final String CHECK_EXIST = "exist";

    /**
     * 不存在
     */
    public static final String CHECK_N_EXIST = "n_exist";

    /**
     * 属于
     */
    public static final String CHECK_BELONG = "belong";

    /**
     * 不属于
     */
    public static final String CHECK_N_BELONG = "n_belong";

    /**
     * 正则匹配
     */
    public static final String CHECK_REGEX_MATCH = "regex_match";

}
