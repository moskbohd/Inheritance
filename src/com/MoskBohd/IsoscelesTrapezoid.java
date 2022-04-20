package com.MoskBohd;

import java.util.Objects;

public class IsoscelesTrapezoid {
    double lenghtUp = 0;
    double lenghtDown = 0;
    double height = 0;
    double area = 0;

    // Constructor
    public IsoscelesTrapezoid(int lenghtUp, int lenghtDown, int height) {
        this.lenghtUp = lenghtUp;
        this.lenghtDown = lenghtDown;
        this.height = height;
    }

    // Getters/Setters
    public double getLenghtUp() {
        return lenghtUp;
    }

    public void setLenghtUp(double lenghtUp) {
        this.lenghtUp = lenghtUp;
    }

    public double getLenghtDown() {
        return lenghtDown;
    }

    public void setLenghtDown(double lenghtDown) {
        this.lenghtDown = lenghtDown;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 5 methods
    public double getArea() throws Exception {
        if (this.getHeight() != 0 & this.getLenghtUp() != 0 & this.getLenghtDown() != 0){
            return (this.getLenghtDown() + this.getLenghtUp()) * this.getHeight()/2;
        }else throw new Exception("Exception: there are no valid parameters!");
    }
    public double getPerimeter(){
        return (this.getLenghtDown() + this.getLenghtUp() + 2 * this.getHeight());
    }
    public double getLengthOfSide(){
        return Math.sqrt(Math.pow((this.getLenghtDown() - this.getLenghtUp())/2, 2) + Math.pow(this.getHeight(), 2));
    }
    public double getLengthOfEachDiagonal(){
        return Math.sqrt(this.getLenghtDown() * this.getLenghtUp() + Math.pow(getLengthOfSide(), 2));
    }
    public double getAcuteAngle(){
        return Math.acos(((2 * this.getLengthOfSide()) / (this.getLenghtUp() * this.getLenghtDown())));
    }

    // Override toString() method
    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "lenghtUp=" + lenghtUp +
                ", lenghtDown=" + lenghtDown +
                ", height=" + height +
                '}';
    }

    // Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsoscelesTrapezoid that = (IsoscelesTrapezoid) o;
        try {
            return Double.compare(that.getLenghtUp(), getLenghtUp()) == 0 && Double.compare(that.getLenghtDown(), getLenghtDown()) == 0 && Double.compare(that.getHeight(), getHeight()) == 0 && Double.compare(that.getArea(), getArea()) == 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int hashCode() {
        try {
            return Objects.hash(getLenghtUp(), getLenghtDown(), getHeight(), getArea());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
