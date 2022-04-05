class Complex{
    int real,complex;
    Complex(){
        real=0;
        complex=0;
    }
    Complex(int r){
        real=r;
        complex=0;
    }
    Complex(int r,int c){
        real=r;
        complex=c;
    }
    void display(){
        if(complex<0){
            System.out.println(real+""+complex+"i");
        }
        else{
            System.out.println(real+"+"+complex+"i");
        }
    }
    Complex sum(Complex C){
        Complex sumC = new Complex();
        sumC.real = real+C.real;
        sumC.complex = complex+C.complex;
        return sumC;
    }
    Complex product(Complex C){
        Complex productC = new Complex();   // (a+ib)(c+id) = (ac-bd) + i(ad+bc)
        productC.real = real*C.real - complex*C.complex;
        productC.complex = real*C.complex + complex*C.real;
        return productC;
    }

    public static void main(String args[]){
        Complex C1 = new Complex(3,2);
        Complex C2 = new Complex(4,-2);
        
        C1.display();   C2.display();

        Complex sum = C1.sum(C2);
        System.out.print("Sum : ");     sum.display();

        Complex product = C1.product(C2);
        System.out.print("Product : ");     product.display();

    }
}
