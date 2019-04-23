package com.niezhiliang.signature.utils.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.image.BufferedImage;

/**
 * Created by Haoxy on 2019-04-23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 * <p>
 * 创建抽象产品族类,定义具体产品的公共接口;
 */
public abstract class AbstractBasicSeal implements Seal {

    private static final Logger logger = LoggerFactory.getLogger(AbstractBasicSeal.class);

    protected BufferedImage bufferedImage;

    @Override
    public abstract void drawCircle();

    @Override
    public abstract void drawEllipse();

    @Override
    public void initBufferedImage() {
        logger.info("初始化BufferedImage");

    }
}
