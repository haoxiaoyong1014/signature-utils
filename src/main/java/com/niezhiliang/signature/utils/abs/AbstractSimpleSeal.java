package com.niezhiliang.signature.utils.abs;

import com.niezhiliang.signature.utils.entity.SealConfiguration;
import com.niezhiliang.signature.utils.basic.AbstractBasicSeal;
import com.niezhiliang.signature.utils.config.SealCircleConfig;
import com.niezhiliang.signature.utils.config.SealEllipseConfig;
import com.niezhiliang.signature.utils.entity.SealInfo;

/**
 * Created by Haoxy on 2019-04-23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 * 创建抽象产品类,定义抽象产品的公共接口
 */
public abstract class AbstractSimpleSeal extends AbstractBasicSeal {

    @Override
    public abstract String drawCircle(SealInfo sealInfo);

    @Override
    public abstract String drawEllipse(SealInfo sealInfo);

    public SealConfiguration sealConfigCircle(SealInfo sealInfo) {
        SealCircleConfig sealCircle = new SealCircleConfig();
        SealConfiguration mainFontConfig = sealCircle.setMainFont(sealInfo);
        SealConfiguration sealConfigurationStarted = sealCircle.setCenterFont(sealInfo, mainFontConfig);
        SealConfiguration sealConfigurationSimple = sealCircle.setTitleFont(sealInfo, sealConfigurationStarted);
        return sealConfigurationSimple;

    }

    public SealConfiguration sealConfigEllipse(SealInfo sealInfo) {
        SealEllipseConfig sealEllipse = new SealEllipseConfig();
        SealConfiguration mainFontConfig = sealEllipse.setMainFont(sealInfo);
        SealConfiguration sealConfigurationStarted = sealEllipse.setTitleFont(sealInfo, mainFontConfig);
        SealConfiguration sealConfigurationSimple = sealEllipse.setSerNo(sealInfo, sealConfigurationStarted);
        return sealConfigurationSimple;
    }
}
