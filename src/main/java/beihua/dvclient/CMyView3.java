package beihua.dvclient;

import java.awt.Color;
import java.awt.Graphics;

import beihua.dvframework.CView;

public class CMyView3 extends CView {
    int count = 0;

    protected void paintComponent(Graphics g) {
        int x = 80, y = 20;

        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.drawString("软件22-4班成绩", x, y);
        y += 30;

        for (Student student : ((CMyDocument) this._document).students) {
            g.drawString(student.name + "    " + student.scoreToGrade(), x, y);
            g.drawLine(x, y + 5, x + 100, y + 5);
            y += 25;
        }

    }
}