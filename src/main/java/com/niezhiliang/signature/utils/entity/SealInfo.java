package com.niezhiliang.signature.utils.entity;


/**
 * Created by Haoxy on 2019-04-24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class SealInfo {

    /**
     * 主文字
     */
    private String companyName;
    /**
     * 副文字
     */
    private String serNo;
    /**
     * 抬头文字
     */
    private String title;

    /**
     * 背景色，默认红色
     */
   private ColorEnum colorTag;

    /**
     * 字体类型
     */
    private FontEnum fontFamilyTag;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSerNo() {
        return serNo;
    }

    public void setSerNo(String serNo) {
        this.serNo = serNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ColorEnum getColorTag() {
        return colorTag;
    }

    public void setColorTag(ColorEnum colorTag) {
        this.colorTag = colorTag;
    }

    public FontEnum getFontFamilyTag() {
        return fontFamilyTag;
    }

    public void setFontFamilyTag(FontEnum fontFamilyTag) {
        this.fontFamilyTag = fontFamilyTag;
    }


    public SealInfo(String companyName,ColorEnum colorTag,FontEnum fontFamilyTag) {
        this.companyName = companyName;
        this.colorTag = colorTag;
        this.fontFamilyTag = fontFamilyTag;
    }

    public SealInfo(String companyName,ColorEnum colorTag,FontEnum fontFamilyTag,String title) {
        this.companyName = companyName;
        this.colorTag = colorTag;
        this.fontFamilyTag = fontFamilyTag;
        this.title = title;
    }

    public SealInfo(String companyName,ColorEnum colorTag,FontEnum fontFamilyTag,String title,String serNo) {
        this.companyName = companyName;
        this.colorTag = colorTag;
        this.fontFamilyTag = fontFamilyTag;
        this.title = title;
        this.serNo = serNo;
    }
}
