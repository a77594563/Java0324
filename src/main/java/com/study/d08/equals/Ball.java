package com.study.d08.equals;

public class Ball {
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int code = 7 * 11 * price + color.hashCode();
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        // 判斷是否視同一個物件
        if (this == obj) {
            return true;
        }
        
        Ball b = null;
        if(obj instanceof Ball){
            b = (Ball)obj;
        }else{
            return false;
        }
        return (price == b.price && color.equals(b.color));
        
    }
    
}
