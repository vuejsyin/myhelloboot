package com.xr.springboot.model;

public class Baog {
    private Integer xid;

    private String dai;

    private String xname;

    private String jie;

    private String dan;

    private String can;

    private String xiao;

    private String text;

    private String quji;

    private String texts;

    public Baog(Integer xid, String dai, String xname, String jie, String dan, String can, String xiao, String text, String quji, String texts) {
        this.xid = xid;
        this.dai = dai;
        this.xname = xname;
        this.jie = jie;
        this.dan = dan;
        this.can = can;
        this.xiao = xiao;
        this.text = text;
        this.quji = quji;
        this.texts = texts;
    }

    public Baog() {
        super();
    }

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public String getDai() {
        return dai;
    }

    public void setDai(String dai) {
        this.dai = dai == null ? null : dai.trim();
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname == null ? null : xname.trim();
    }

    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie == null ? null : jie.trim();
    }

    public String getDan() {
        return dan;
    }

    public void setDan(String dan) {
        this.dan = dan == null ? null : dan.trim();
    }

    public String getCan() {
        return can;
    }

    public void setCan(String can) {
        this.can = can == null ? null : can.trim();
    }

    public String getXiao() {
        return xiao;
    }

    public void setXiao(String xiao) {
        this.xiao = xiao == null ? null : xiao.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getQuji() {
        return quji;
    }

    public void setQuji(String quji) {
        this.quji = quji == null ? null : quji.trim();
    }

    public String getTexts() {
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts == null ? null : texts.trim();
    }

    @Override
    public String toString() {
        return "Baog{" +
                "xid=" + xid +
                ", dai='" + dai + '\'' +
                ", xname='" + xname + '\'' +
                ", jie='" + jie + '\'' +
                ", dan='" + dan + '\'' +
                ", can='" + can + '\'' +
                ", xiao='" + xiao + '\'' +
                ", text='" + text + '\'' +
                ", quji='" + quji + '\'' +
                ", texts='" + texts + '\'' +
                '}';
    }
}