package beihua.dvclient;

import java.awt.Color;
import java.awt.Graphics;

import beihua.dvframework.CView;

public class CMyView2 extends CView {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    private int num = 5;
    private final int BREADTH = (WIDTH * 2 / 3) / (2 * num);

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        int[] statistic = ((CMyDocument) _document).statisticScoreRange();

        g.clearRect(0, 0, this.WIDTH, this.HEIGHT);
        g.setColor(java.awt.Color.BLUE);

        g.drawLine(WIDTH / 6, 5 * HEIGHT / 6, 5 * (WIDTH) / 6, 5 * HEIGHT / 6);
        g.drawLine(WIDTH / 6, 5 * HEIGHT / 6, WIDTH / 6, HEIGHT / 6);
        int[] x = {WIDTH * 5 / 6 - 5, WIDTH * 5 / 6, WIDTH * 5 / 6 - 5};
        int[] y = {HEIGHT * 5 / 6 - 5, HEIGHT * 5 / 6, HEIGHT * 5 / 6 + 5};
        g.drawPolyline(x, y, 3);

        int[] x2 = {WIDTH / 6 - 5, WIDTH / 6, WIDTH / 6 + 5};
        int[] y2 = {HEIGHT / 6 + 5, HEIGHT / 6, HEIGHT / 6 + 5};
        g.drawPolyline(x2, y2, 3);
        g.drawString("X轴", WIDTH * 5 / 6, HEIGHT * 5 / 6);
        g.drawString("Y 轴", WIDTH / 6, HEIGHT / 6);

        g.drawString("0-59", WIDTH / 6 + this.BREADTH, HEIGHT * 5 / 6 + 15);
        g.drawString("60-69", WIDTH / 6 + 3 * this.BREADTH, HEIGHT * 5 / 6 + 15);
        g.drawString("70-79", WIDTH / 6 + 5 * this.BREADTH, HEIGHT * 5 / 6 + 15);
        g.drawString("80-89", WIDTH / 6 + 7 * this.BREADTH, HEIGHT * 5 / 6 + 15);
        g.drawString("90-100", WIDTH / 6 + 9 * this.BREADTH, HEIGHT * 5 / 6 + 15);

        int A = statistic[0];
        int B = statistic[1];
        int C = statistic[2];
        int D = statistic[3];
        int E = statistic[4];
        //int F = (int) (Math.random() * ( HEIGHT * 2 / 3));

        g.setColor(java.awt.Color.GREEN); //设置柱状图的颜色
        g.fillRect(WIDTH / 6 + this.BREADTH, HEIGHT * 5 / 6 - A * 3, this.BREADTH, A * 3);
        g.drawString(Integer.toString(A), WIDTH / 6 + this.BREADTH, HEIGHT * 5 / 6 - A - 10);
        g.fillRect(WIDTH / 6 + 3 * this.BREADTH, HEIGHT * 5 / 6 - B * 3, this.BREADTH, B * 3);
        g.drawString(Integer.toString(B), WIDTH / 6 + 3 * this.BREADTH, HEIGHT * 5 / 6 - B - 10);
        g.fillRect(WIDTH / 6 + 5 * this.BREADTH, HEIGHT * 5 / 6 - C * 3, this.BREADTH, C * 3);
        g.drawString(Integer.toString(C), WIDTH / 6 + 5 * this.BREADTH, HEIGHT * 5 / 6 - C - 10);
        g.fillRect(WIDTH / 6 + 7 * this.BREADTH, HEIGHT * 5 / 6 - D * 3, this.BREADTH, D * 3);
        g.drawString(Integer.toString(D), WIDTH / 6 + 7 * this.BREADTH, HEIGHT * 5 / 6 - D - 10);
        g.fillRect(WIDTH / 6 + 9 * this.BREADTH, HEIGHT * 5 / 6 - E * 3, this.BREADTH, E * 3);
        g.drawString(Integer.toString(E), WIDTH / 6 + 9 * this.BREADTH, HEIGHT * 5 / 6 - E - 10);
    }
}