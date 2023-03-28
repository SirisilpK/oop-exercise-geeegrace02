import java.util.ArrayList;
import java.util.Arrays;
public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString(){
        String strCoeffs = "";
        for(int degree = this.getDegree() - 1 ; degree >= 0 ; --degree){
            if(this.coeffs[degree] != 0){
                if(this.coeffs[degree] == 1){
                    if (degree == 1){
                        strCoeffs += ("x" + " + " );
                    } else if (degree == 0){
                        strCoeffs += 1
                    } else {
                        strCoeffs += ("x^" + Integer.toString(degree) + " + " );
                    }
                } else {
                    if(this.coeffs[degree] == 1){
                        strCoeffs += (Double.toString(this.coeffs[degree]) + "x" + " + " );
                    } else if (degree == 0) {
                        strCoeffs += (Double.toString(this.coeffs[degree]) + " + " );
                    } else {
                        strCoeffs += (Double.toString(this.coeffs[degree]) + "x^" + Integer.toString(degree) + " + " );
                    }
                }
            }
        }
        return strCoeffs;
    }

    public double evaluate(double x){
        double eval = 0;
        for (int degree = 0; degree < coeffs.length; degree++) {
            eval += Math.pow((coeffs[degree] * x), degree);
        }
        return eval;
    }

    public MyPolynomial add(MyPolynomial right){
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] maxCoeffArray = new double[magDegree + 1];

        for (int degree = 0; degree < maxCoeffArray.length; degree++) {
            double addition = 0;
            if (degree <= this.getDegree()) {
                addition += coeffs[degree];
            }
            if (degree <= right.getDegree()) {
                addition += right.coeffs[degree];
            }
            maxCoeffArray[degree] = addition;
        }
        return new MyPolynomial(maxCoeffArray);
    }

    public MyPolynomial multiply(MyPolynomial right){
        int maxDegree = this.getDegree(), right.getDegree() + 1;
        double[] maxCoeffArray = new double[maxDegree];

        for (int degree1 = 0; degree1 < coeffs.length; degree1++) {
            for (int degree2 = 0; degree2 < right.coeffs.length; degree2++) {
                double totalDegree = coeffs[degree1] * right.coeffs[degree2];
                maxCoeffArray[degree1 + degree2] += totalDegree;
            }
        }
        return new MyPolynomial(maxCoeffArray);
    }
}