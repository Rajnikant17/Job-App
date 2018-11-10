package com.example.rajnikantpandey.emailandpass;

/**
 * Created by Rajnikant Pandey on 11/10/2018.
 */

public class FragOneDataProvidr {
    private   int image;
    private  String number;

    public FragOneDataProvidr(int img,String number)
    {
        this.setImage(img);
        this.setNumber(number);
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {

        return number;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {

        return image;
    }

}

