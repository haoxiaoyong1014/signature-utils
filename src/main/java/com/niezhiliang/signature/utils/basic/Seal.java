package com.niezhiliang.signature.utils.basic;

import com.niezhiliang.signature.utils.entity.SealConfiguration;
import com.niezhiliang.signature.utils.entity.SealInfo;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Haoxy on 2019-04-23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public interface Seal {

    /**
     * 绘制圆形
     * @param sealInfo
     */
     String drawCircle(SealInfo sealInfo);

    /**
     * 绘制椭圆
     * @param sealInfo
     */
     String drawEllipse(SealInfo sealInfo);

    /**
     * 初始化BufferedImageCircle
     * @param sealConfiguration
     * @return
     */
    BufferedImage initBufferedImage(SealConfiguration sealConfiguration);

    /**
     * 初始化BufferedImageEllipse
     * @param sealConfiguration
     * @return
     */
    BufferedImage initBufferedImageEllipse(SealConfiguration sealConfiguration);

    /**
     * 初始化Graphics2D
     * @param bufferedImage
     * @return
     */
    Graphics2D initGraphics2D(BufferedImage bufferedImage,SealConfiguration conf) throws Exception;

}
