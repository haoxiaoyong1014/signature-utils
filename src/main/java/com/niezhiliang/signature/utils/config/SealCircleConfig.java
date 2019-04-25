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
public class SealCircleConfig {

    /**
     * 圆弧中配置主题字
     *
     * @param sealInfo
     */
    public SealConfiguration setMainFont(SealInfo sealInfo) {
        SealConfiguration configuration = new SealConfiguration();
        SealFont mainFont = new SealFont();
        mainFont.setBold(true);
        mainFont.setFontFamily(sealInfo.getFontFamilyTag().getFont());
        mainFont.setMarginSize(5);
        mainFont.setFontText(sealInfo.getCompanyName());
        mainFont.setFontSize(30);
        mainFont.setFontSpace(30.0);
        if (sealInfo.getCompanyName().length() > 14) {
            mainFont.setFontSize(23);
            mainFont.setFontSpace(21.0);
        }
        configuration.setMainFont(mainFont);
        //setCenterFont(sealInfo, configuration);
        configuration.setImageSize(250);
        configuration.setBackgroudColor(sealInfo.getColorTag().getColor());
        configuration.setBorderCircle(new SealCircle(4, 115, 115));
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
        centerFont.setFontSize(70);
        configuration.setCenterFont(centerFont);
        return configuration;
    }

    /**
     * 圆弧中配置 title
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
            titleFont.setFontSize(20);
            titleFont.setFontText(sealInfo.getTitle());
            titleFont.setMarginSize(70);
            configuration.setTitleFont(titleFont);
        }
        return configuration;
    }

    /**
     * 圆弧中配置 副文字
     *
     * @param sealInfo
     * @param configuration
     * @return
     */
    public SealConfiguration setSerNoFont(SealInfo sealInfo, SealConfiguration configuration) {
        if (sealInfo.getSerNo() != null && !"".equals(sealInfo.getSerNo())) {
            SealFont viceFont = new SealFont();
            viceFont.setFontFamily(sealInfo.getFontFamilyTag().getFont());
            viceFont.setMarginSize(-5);
            viceFont.setFontText(sealInfo.getSerNo());
            viceFont.setBold(false);
            viceFont.setFontSize(13);
            viceFont.setFontSpace(10.0);
            configuration.setViceFont(viceFont);
        }
        return configuration;
    }
}
