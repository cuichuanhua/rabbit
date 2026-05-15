package com.tesseract1;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class Test1 {

    
    public static void main(String[] args) {
        try {
            File imageFile = new File("E:\\cch\\work\\java\\rabbitOrc\\src\\main\\java\\com\\opencv2\\1_canny.jpg");
            ITesseract tesseract = new Tesseract();
            tesseract.setDatapath("E:\\cch\\install\\tesseract-orc\\tessdata");
            String result = tesseract.doOCR(imageFile);
            System.out.println("识别结果：\n" + result);
            
        } catch (Exception e) {
            System.err.println("布局分析失败：" + e.getMessage());
            e.printStackTrace();
        }
    }
    

}
