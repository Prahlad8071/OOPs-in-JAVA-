package exam;

public interface  Assesment {
    abstract void MSE1();
    abstract void MSE2();
    default public void CA3() {//conctrete method;
    	System.out.println("The attendence will have 3 marks");
    }
}
