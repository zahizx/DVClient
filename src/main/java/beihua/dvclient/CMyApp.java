package beihua.dvclient;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import beihua.dvframework.CWinApp;

public class CMyApp extends CWinApp {
    public static void main(String[] args) {

        JMenuBar jmb = new JMenuBar();
        JMenu jm = new JMenu("student");
        JMenuItem jmi1 = new JMenuItem("add");
        JMenuItem jmi2 = new JMenuItem("delete");
        jm.add(jmi1);
        jm.add(jmi2);
        jmb.add(jm);


        CWinApp cwa = new CWinApp();
        String[] views = {"beihua.dvclient.CMyView1", "beihua.dvclient.CMyView2", "beihua.dvclient.CMyView3"};
        cwa.InitializeInstance("beihua.dvclient.CMyDocument", views, jmb);

    }
}