package com.sbmavenweb.study001.mathexam;

public class ShopServide {
    private static ShopServide singleton = new ShopServide();

    public static ShopServide getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        ShopServide obj1 = ShopServide.getInstance();
        ShopServide obj2 = ShopServide.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
