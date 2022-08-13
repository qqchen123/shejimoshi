package com.myshejimoshi.test4;

public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meeting(){
        System.out.println(star.getName()+"---"+fans.getName()+"----");
    }

    public void business(){
        System.out.println(star.getName()+"----"+company.getName()+"----");
    }

}
