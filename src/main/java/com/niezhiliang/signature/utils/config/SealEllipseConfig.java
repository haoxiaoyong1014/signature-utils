package com.niezhiliang.signature.utils.config;

import com.niezhiliang.signature.utils.entity.SealCircle;
import com.niezhiliang.signature.utils.entity.SealConfiguration;
import com.niezhiliang.signature.utils.entity.SealFont;
import com.niezhiliang.signature.utils.entity.SealInfo;

/**
 * Created by Haoxy on 2019-04-24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class SealEllipseConfig {

    /**
     * 配置主文字
     *
     * @param sealInfo
     * @return
     */
    public SealConfiguration setMainFont(SealInfo sealInfo) {
        SealConfiguration configuration = new SealConfiguration();
        SealFont mainFont = new SealFont();
        mainFont.setBold(true);
        mainFont.setFontFamily(sealInfo.getFontFamilyTag().getFont());
        mainFont.setMarginSize(10);
        mainFont.setFontText(sealInfo.getCompanyName());
        mainFont.setFontSize(25);
        mainFont.setFontSpace(12.0);
        if (sealInfo.getCompanyName().length() > 14) {
            mainFont.setFontSize(20);
            mainFont.setFontSpace(8.0);
        }
        configuration.setMainFont(mainFont);

        /**
         * 图片大小
         */
        configuration.setImageSize(300);
        /**
         * 背景颜色
         */
        configuration.setBackgroudColor(sealInfo.getColorTag().getColor());
        /**
         * 边线粗细、半径
         */
        configuration.setBorderCircle(new SealCircle(4, 140, 100));
        return configuration;
    }

    /**
     * 配置 title 什么什么专用
     *
     * @param sealInfo
     * @param configuration
     * @return
     */
    public SealConfiguration setTitleFont(SealInfo sealInfo, SealConfiguration configuration) {
        if (sealInfo.getTitle() != null && !"".equals(sealInfo.getTitle())) {
            SealFont titleFont = new SealFont();
            titleFont.setBold(true);
            titleFont.setFontFamily(sealInfo.getFontFamilyTag().getFont());
            titleFont.setFontSize(22);
            if (sealInfo.getCompanyName().length() > 14) {
                titleFont.setFontSize(20);
            }
            titleFont.setFontText(sealInfo.getTitle());
            titleFont.setMarginSize(68);
            titleFont.setMarginSize(27);
            configuration.setTitleFont(titleFont);
        }
        return configuration;
    }

    /**
     * 副文字:123343445
     */
    public SealConfiguration setSerNo(SealInfo sealInfo, SealConfiguration configuration) {

        if (sealInfo.getSerNo() != null && !"".equals(sealInfo.getSerNo())) {
            SealFont viceFont = new SealFont();
            viceFont.setBold(true);
            viceFont.setFontFamily(sealInfo.getFontFamilyTag().getFont());
            viceFont.setMarginSize(5);
            viceFont.setFontText(sealInfo.getSerNo());
            viceFont.setFontSize(13);
            viceFont.setFontSpace(12.0);
            configuration.setViceFont(viceFont);
        }
        return configuration;
    }

    /**
     * 圆弧中配置 ★
     *
     * @param sealInfo
     * @param configuration
     * @return
     */
    public SealConfiguration setCenterFont(SealInfo sealInfo, SealConfiguration configuration) {
        SealFont centerFont = new SealFont();
        centerFont.setBold(false);
        centerFont.setFontFamily(sealInfo.getFontFamilyTag().getFont());
        centerFont.setFontText("★");
        centerFont.setFontSize(40);
        configuration.setCenterFont(centerFont);
        return configuration;
    }
}
