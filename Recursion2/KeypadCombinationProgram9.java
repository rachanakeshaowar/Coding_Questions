public class KeypadCombinationProgram9 {
    static void combination(String dig ,String[] kp,String res){ //"253 --> kp[2]
if(dig.length()==0){
    System.out.println(res +" ");
    return;
}
int currNum = dig.charAt(0)-'0'; //2
        String currChoices =kp[currNum];//abc
        for(int i =0;i<currChoices.length();i++){//"abc"
            combination(dig.substring(1),kp,res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig ="23";
        String[] kp={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig,kp,"");
    }
}
