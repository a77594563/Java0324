package com.study.d06.food;

public class RiceFailure {

    private String Title;
    private String 編號;
    private String 品名;
    private String 國際條碼;
    private String 廠商名稱;
    private String 廠商地址;
    private String 檢驗結果;
    private String 不合格原因;
    private String 違反規定;
    private String 行政處分;
    private String Log_UpdateTime;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String get編號() {
        return 編號;
    }

    public void set編號(String 編號) {
        this.編號 = 編號;
    }

    public String get品名() {
        return 品名;
    }

    public void set品名(String 品名) {
        this.品名 = 品名;
    }

    public String get國際條碼() {
        return 國際條碼;
    }

    public void set國際條碼(String 國際條碼) {
        this.國際條碼 = 國際條碼;
    }

    public String get廠商名稱() {
        return 廠商名稱;
    }

    public void set廠商名稱(String 廠商名稱) {
        this.廠商名稱 = 廠商名稱;
    }

    public String get廠商地址() {
        return 廠商地址;
    }

    public void set廠商地址(String 廠商地址) {
        this.廠商地址 = 廠商地址;
    }

    public String get檢驗結果() {
        return 檢驗結果;
    }

    public void set檢驗結果(String 檢驗結果) {
        this.檢驗結果 = 檢驗結果;
    }

    public String get不合格原因() {
        return 不合格原因;
    }

    public void set不合格原因(String 不合格原因) {
        this.不合格原因 = 不合格原因;
    }

    public String get違反規定() {
        return 違反規定;
    }

    public void set違反規定(String 違反規定) {
        this.違反規定 = 違反規定;
    }

    public String get行政處分() {
        return 行政處分;
    }

    public void set行政處分(String 行政處分) {
        this.行政處分 = 行政處分;
    }

    public String getLog_UpdateTime() {
        return Log_UpdateTime;
    }

    public void setLog_UpdateTime(String Log_UpdateTime) {
        this.Log_UpdateTime = Log_UpdateTime;
    }

    @Override
    public String toString() {
        return "RiceFailure{" + "Title=" + Title + ", \u7de8\u865f=" + 編號 + ", \u54c1\u540d=" + 品名 + ", \u570b\u969b\u689d\u78bc=" + 國際條碼 + ", \u5ee0\u5546\u540d\u7a31=" + 廠商名稱 + ", \u5ee0\u5546\u5730\u5740=" + 廠商地址 + ", \u6aa2\u9a57\u7d50\u679c=" + 檢驗結果 + ", \u4e0d\u5408\u683c\u539f\u56e0=" + 不合格原因 + ", \u9055\u53cd\u898f\u5b9a=" + 違反規定 + ", \u884c\u653f\u8655\u5206=" + 行政處分 + ", Log_UpdateTime=" + Log_UpdateTime + '}';
    }

}
