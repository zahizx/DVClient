package beihua.dvclient;

import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

import beihua.dvframework.CDocument;

public class CMyDocument extends CDocument {

    public List<Student> students = new LinkedList<Student>(Collections.singleton(new Student("张学志", 99)));

    public boolean processEvent(ActionEvent e) {
        ActionEvent f = e;
        String command = f.getActionCommand();
        System.out.println(command);
        if (command.equals("add")) {
            String inputstudent = JOptionPane.showInputDialog("请输入要添加的学生姓名和学生成绩，用逗号（半角逗号）分割");
            if (inputstudent == null) return false;
            String[] sstudent = inputstudent.split(",");
            String name = sstudent[0];
            int score = Integer.parseInt(sstudent[1]);
            students.add(new Student(name, score));
        } else if (command.equals("delete")) {
            String inputstudent = JOptionPane.showInputDialog("请输入要删除的学生姓名");
            if (inputstudent == null) return false;
            students.removeIf(student -> student.getNames().equals(inputstudent));
        }
        this.updateAllViews();
        return false;
    }

    protected int[] statisticScoreRange() {
        int[] statistic = new int[5];
        for (int i = 0; i < 5; i++) statistic[i] = 0;
        for (Student stu : students) {
            if (stu.score < 60) statistic[0]++;
            else if (stu.score > 59 && stu.score < 70) statistic[1]++;
            else if (stu.score > 69 && stu.score < 80) statistic[2]++;
            else if (stu.score > 79 && stu.score < 90) statistic[3]++;
            else if (stu.score > 89 && stu.score <= 100) statistic[4]++;
        }
        return statistic;
    }
}