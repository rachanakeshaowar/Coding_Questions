public class PrintSSQ {
   static void printSSQ(String s,String currAns){// s= "abc",currAns=""
       if(s.length()==0){
           System.out.println(currAns);
           return;
       }
       char curr=s.charAt(0);//a
       String remString =s.substring(1);//bc
       printSSQ(remString,currAns + curr); //bc,a add current
       printSSQ(remString,currAns); //bc ,""  do not add current
   }


    public static void main(String[] args) {
    printSSQ("abc"," ");
    }
}

















