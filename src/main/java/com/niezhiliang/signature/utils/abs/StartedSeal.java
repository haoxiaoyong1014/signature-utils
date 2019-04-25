package com.niezhiliang.signature.utils.abs;

import com.niezhiliang.signature.utils.entity.SealConfiguration;
import com.niezhiliang.signature.utils.abs.AbstractStartedSeal;
import com.niezhiliang.signature.utils.entity.SealInfo;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Haoxy on 2019-04-23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 * <p>
 * 创建具体产品类（继承抽象产品类,定义生产的具体产品)
 *
 * 入门级圆形签章,签章中包含: 公司名称,★;
 * 入门级椭圆签章,签章中包含: 公司名称,title(什么什么专用章)
 */
public class StartedSeal extends AbstractStartedSeal {

    @Override
    public String drawCircle(SealInfo sealInfo) {
        try {
            SealConfiguration conf = this.sealConfigCircle(sealInfo);
            BufferedImage bufferedImage = this.initBufferedImage(conf);
            Graphics2D g2d = this.initGraphics2D(bufferedImage, conf);
            int borderCircleWidth = conf.getBorderCircle().getWidth();
            int borderCircleHeight = conf.getBorderCircle().getHeight();
            //画主要字,公司名称
            this.drawArcFont4Circle(g2d, borderCircleHeight, conf.getMainFont(), true);
            //画中心字 星
            this.drawFont(g2d, (borderCircleWidth + INIT_BEGIN) * 2, (borderCircleHeight + INIT_BEGIN) * 2, conf.getCenterFont());
            g2d.dispose();
            String base = this.buildAndStoreSeal(bufferedImage);
            return base;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String drawEllipse(SealInfo sealInfo) {
        try {
            SealConfiguration conf = this.sealConfigEllipse(sealInfo);
            BufferedImage bufferedImage = this.initBufferedImage(conf);
            Graphics2D g2d = this.initGraphics2D(bufferedImage, conf);
            int borderCircleWidth = conf.getBorderCircle().getWidth();
            int borderCircleHeight = conf.getBorderCircle().getHeight();
            //画主要字,公司名称
            this.drawArcFont4Oval(g2d, conf.getBorderCircle(), conf.getMainFont(), true);
            //画 title
            drawFont(g2d, (borderCircleWidth + INIT_BEGIN) * 2, (borderCircleHeight + INIT_BEGIN) * 2, conf.getTitleFont());
            g2d.dispose();
            String base = this.buildAndStoreSeal(bufferedImage);
            return base;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
