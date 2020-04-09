package com.study.d06.youbike;

public class Youbike {

    private int _id; // 序號
    private String sno; // 站場編號
    private String sna; // 站場名稱
    private String tot; // 單車總量
    private String sbi; // 可借數量
    private String sarea; // 站場行政區域
    private String mday; // 資料更新時間
    private String lat; // 緯度
    private String lng; //經度
    private String ar; // 站場地址
    private String sareaen;
    private String snaen;
    private String aren;
    private String bemp; // 可還數量(已借出)
    private String act; //站場狀態(1: 表示正使用中)
    //--------------------------------------------
    private double km;

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSna() {
        return sna;
    }

    public void setSna(String sna) {
        this.sna = sna;
    }

    public String getTot() {
        return tot;
    }

    public void setTot(String tot) {
        this.tot = tot;
    }

    public String getSbi() {
        return sbi;
    }

    public void setSbi(String sbi) {
        this.sbi = sbi;
    }

    public String getSarea() {
        return sarea;
    }

    public void setSarea(String sarea) {
        this.sarea = sarea;
    }

    public String getMday() {
        return mday;
    }

    public void setMday(String mday) {
        this.mday = mday;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getSareaen() {
        return sareaen;
    }

    public void setSareaen(String sareaen) {
        this.sareaen = sareaen;
    }

    public String getSnaen() {
        return snaen;
    }

    public void setSnaen(String snaen) {
        this.snaen = snaen;
    }

    public String getAren() {
        return aren;
    }

    public void setAren(String aren) {
        this.aren = aren;
    }

    public String getBemp() {
        return bemp;
    }

    public void setBemp(String bemp) {
        this.bemp = bemp;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    @Override
    public String toString() {
        return km + " km, Youbike{" + "_id=" + _id + ", sno=" + sno + ", sna=" + sna + ", tot=" + tot + ", sbi=" + sbi + ", sarea=" + sarea + ", mday=" + mday + ", lat=" + lat + ", lng=" + lng + ", ar=" + ar + ", sareaen=" + sareaen + ", snaen=" + snaen + ", aren=" + aren + ", bemp=" + bemp + ", act=" + act + '}';
    }
    
    
}
