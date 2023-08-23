package array_questions;
interface makePayment{
    void pay();
}
class debitCard implements makePayment{
    public void pay() {
        System.out.println("paying via debitCard");
    }
}
public class ArrayDataStructure {
    public static void main(String[] args) {
        debitCard dc = new debitCard();
        dc.pay();
        String[] array ={"bahawal","khan","mengal"};
        for (String element:array){
            System.out.print(element+" ");
        }
    }
}
