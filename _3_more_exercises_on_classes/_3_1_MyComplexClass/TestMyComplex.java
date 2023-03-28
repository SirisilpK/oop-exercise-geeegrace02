public class TestMyComplex {
    public static void main(String[] args) {
        //instantiating 2 object
        MyComplex c1=new MyComplex(1.1, 2.2);
        MyComplex c2=new MyComplex(2, 3.3);
        System.out.println("Complex number 1:"+c1);
        System.out.println("---------------------------------------------------");
        System.out.println("Complex number 2:"+c2);
        System.out.println("---------------------------------------------------");

        //check if real number
        if(!c1.isReal()) {
            System.out.println("Number 1 is: "+c1.complexRepresentation()+
                    "is not a pure real number");
        }
        //check if imaginary number
        if(!c1.isImaginary()) {
            System.out.println("Number 1 is: "+c1.complexRepresentation()+
                    "is not a pure imaginary number");
        }

        //check if real number
        if(!c2.isReal()) {
            System.out.println("Number 2 is: "+c2.complexRepresentation()+
                    "is not a pure real number");
        }

        //check if imaginary number
        if(!c1.isImaginary()) {
            System.out.println("Number 2 is: "+c2.complexRepresentation()+
                    "is not a pure imaginary number");
        }

        //check if both are equal or not
        if(!c1.equals(c2)) {
            System.out.println(c1.complexRepresentation()+" is not equal to "+c2.complexRepresentation());
        }

    }
}