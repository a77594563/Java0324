package com.study.d14;

public class MyStock {
    //"證券代號","證券名稱","殖利率(%)","股利年度","本益比","股價淨值比","財報年/季",
    public String 證券代號;
    public String 證券名稱;
    public String 殖利率;
    public String 股利年度;
    public String 本益比;
    public String 股價淨值比;
    public String 財報年季;

    public MyStock(String 證券代號, String 證券名稱, String 殖利率, String 股利年度, String 本益比, String 股價淨值比, String 財報年季) {
        this.證券代號 = 證券代號;
        this.證券名稱 = 證券名稱;
        this.殖利率 = 殖利率;
        this.股利年度 = 股利年度;
        this.本益比 = 本益比;
        this.股價淨值比 = 股價淨值比;
        this.財報年季 = 財報年季;
    }

    @Override
    public String toString() {
        return "MyStock{" + "\u8b49\u5238\u4ee3\u865f=" + 證券代號 + ", \u8b49\u5238\u540d\u7a31=" + 證券名稱 + ", \u6b96\u5229\u7387=" + 殖利率 + ", \u80a1\u5229\u5e74\u5ea6=" + 股利年度 + ", \u672c\u76ca\u6bd4=" + 本益比 + ", \u80a1\u50f9\u6de8\u503c\u6bd4=" + 股價淨值比 + ", \u8ca1\u5831\u5e74\u5b63=" + 財報年季 + '}';
    }
    
}
