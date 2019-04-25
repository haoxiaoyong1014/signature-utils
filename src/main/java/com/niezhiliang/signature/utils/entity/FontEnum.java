package com.niezhiliang.signature.utils.entity;


/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @Date 2019/2/12 上午10:56
 */
public enum  FontEnum {

    SONGTI("SimSun"),

    FANGZHENGHEITI("SimHei"),

    KAITI("KaiTi");
    ;
    private String font;

    FontEnum(String font) {
        this.font = font;
    }

    public String getFont() {
        return font;
    }
}
