package com.myshejimoshi.test4;

public class MyClient {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Star star = new Star("林青霞");
        Fans fans = new Fans("李四");
        Company company = new Company("黑马公司");

        agent.setStar(star);
        agent.setFans(fans);
        agent.setCompany(company);
        agent.meeting();
        agent.business();
    }
}
