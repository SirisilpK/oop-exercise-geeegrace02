package OOP_Exercise._3_more_exercises_on_classes._3_1_MyComplexClass;
public class MyComplex{
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {return real;}

    public void setReal(double real) {this.real = real;}

    public double getImag() {return imag;}

    public void setImag(double imag) {this.imag = imag;}

    public void setValue(double real, double imag) {this.real = real; this.imag = imag;}

    @Override
    public String toString(){
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal(){
        return (real == 0);
    }

    public boolean isImaginary(){
        return (imag == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double Magnitude(){
        double sqr = this.real* this.real + this.imag * this.imag;
        return Math.sqrt(sqr);
    }

    public double argument(){
        return Math.atan2(imag, real);
    }

    public MyComplex addInto(MyComplex right){
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }

    public MyComplex add(MyComplex right){
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+this.real,this.imag+this.imag);
    }

    public MyComplex subtract(MyComplex right){
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real-this.real,this.imag-this.imag);
    }

    public MyComplex multiply(MyComplex right){
        this.real = (this.real*right.real - this.imag*right.imag);
        this.imag = (this.real*right.imag + this.imag*right.real);
        return this;
    }

    public MyComplex divide(MyComplex right){
        this.real = double ((this.real*right.real + this.imag*right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2)));
        this.imag = double ((this.imag*right.real - this.real*right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2)));
        return this;
    }

    public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }
}