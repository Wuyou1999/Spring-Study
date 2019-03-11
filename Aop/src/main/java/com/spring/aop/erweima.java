package com.spring.aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class erweima {
    public static void main(String[] args) {
        QrCodeUtil.generate("https://www.jianshu.com/u/15950825da52", 300, 300, FileUtil.file("d:/qrcode.jpg"));
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
       
        Color foreColor = new Color(200, 179, 47);
        Color bgColor = new Color(250, 117, 8);
        int foreColorRGB=foreColor.getRGB();
        int bgColorRGB=bgColor.getRGB();
        // 设置前景色，
        config.setForeColor(foreColorRGB);
        // 设置背景色
        config.setBackColor(bgColorRGB);

/*// 设置前景色，既二维码颜色（青色）
        config.setForeColor(Color.PINK.getRGB());
// 设置背景色（灰色）
        config.setBackColor(Color.LIGHT_GRAY.getRGB());*/
        
// 生成二维码到文件，也可以到流
        QrCodeUtil.generate("https://www.jianshu.com/u/15950825da52", config, FileUtil.file("e:/qrcode.jpg"));
        QrCodeUtil.generate(//
                "https://www.jianshu.com/u/15950825da52", //二维码内容
                QrConfig.create().setImg("d:/jianshu.jpg"), //附带logo
                FileUtil.file("d:/qrcodeWithLogo.jpg")//写出到的文件
        );
    }
}
