package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if(second%first==0 && first<=second){
            System.out.println("Aliquot");
        }else {
            System.out.println("Not Aliquot");
        }
    }
}
/*
12 Aliq = 12,16,15,9,4,3, 1, 0
12/6=6+4+3+2+1    //16
16  = 1+2+4+8 //15
15 = 1+3+5 //9
A 9 = 1+3 //4
A 4 =1+2 //3
A3 = 1

 */