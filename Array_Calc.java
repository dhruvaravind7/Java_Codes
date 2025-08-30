import java.util.ArrayList;

public class Array_Calc {

    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    public  void generate_Array(int numelements, int range) {
        for (int i = 0; i< numelements; i++){
            int value = (int) ((Math.random() * range) + 1);
            numbers.add(value);
        }
    }

    public void print_Array(){
        System.out.println(numbers);
    }

    public int FindRange(){
        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);
        for (int i = 1; i<numbers.size();i++){
            if (numbers.get(i) > maxNumber){
                maxNumber = numbers.get(i);
            } else if (numbers.get(i) < minNumber){
                minNumber = numbers.get(i);
            }
        }
        return (maxNumber - minNumber);
    }

    public static void main(String[] args) {
        Array_Calc array1 = new Array_Calc();
        array1.generate_Array(5,10);
        array1.print_Array();
        System.out.println(array1.FindRange());
    }
}
