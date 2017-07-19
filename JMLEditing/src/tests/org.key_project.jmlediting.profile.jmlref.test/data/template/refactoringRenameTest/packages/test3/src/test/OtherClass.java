package test;

public class OtherClass {
    
    public static int limit;
    
    /*@ normal_behavior
      @ ensures \result == test.TestClass.balance;
      @ assignable \nothing;
      @*/
    public int getBalance() {
        return test.TestClass.balance;
    }
    
    /*@ normal_behavior
      @ ensures \result == test.OtherClass.limit;
      @ assignable \nothing;
      @*/
    public int getLimit() {
        return test.OtherClass.limit;
    }
}