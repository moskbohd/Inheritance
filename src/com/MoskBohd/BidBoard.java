package com.MoskBohd;

public class BidBoard extends IsoscelesTrapezoid{
    String slogan = " ";

    // Constructor
    public BidBoard(int lenghtUp, int lenghtDown, int height) {
        super(lenghtUp, lenghtDown, height);
    }

    // Method
    public double getArea() throws Exception {
        if (this.getHeight() == 0){
            return (this.getLenghtUp() * this.getLenghtDown());
        }else if (this.getLenghtDown() == 0){
            return (this.getHeight() * this.getLenghtUp());
        }else  if(this.getLenghtUp() == 0){
            return (this.getHeight() * this.getLenghtDown());
        }else throw new Exception("Exception: there are no valid parameters!");
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Override
    public String toString() {
        return "BidBoard{" +
                "slogan='" + slogan + '\'' +
                ", area=" + area +
                '}';
    }
}
