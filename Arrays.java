import java.util.Scanner;
public class Arrays {
      public static void main(String[] args){
         
        // // just declaration - this creates only reference of array 
        // String [] names;

        // // allocating memory
        // names = new String[10];

        // //combining 2 steps
        // int [] rollno = new int[10];

        //declarning array literal 
        //rollno = new int[]{1,2,3,4,5,6,7,8,9};
        
        // inserting a element into array in new position
        //rollno[9] = 10;
       
        // for(int i = 0; i< rollno.length;i++){
        //     System.out.print(rollno[i] + " ");
        // }
    
        //to find length/size of array 
        // int rollnosize = rollno.length;
        // System.out.println(rollnosize);
        

        Student[] arr = new Student[5];
        arr[0] = new Student(2, "sabarish");
        arr[1] = new Student(3, "pragadhish");
        arr[2] = new Student(4, "swathi");
        arr[3] = new Student(5, "rajashree");
        arr[4] = new Student(6, "jayasri");
         

        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i].rno +", "+arr[i].name);
        }


        //Multidemsional array
       // int [][] mdarray = new int[][];

       Integer mdarray [][] = { { 2, 7, 9 }, { 3, null, 1 }, { 7, 8, 2 } };

        // int  mdarray[][] = {{1,2,3},{4,5,6},{7, 8,9}};
          for(int i = 0;i<3; i++){
                for(int j =0; j< 3; j++){
                     // if we give println, itwill go new line for every new element
                     if(mdarray[i][j] != null){
                     System.out.print(mdarray[i][j] + " ");}
                     else {
                      System.out.print("  ");
                     }
                    //after every 3 elements, will reach new line
                }
                System.out.println();
            }
 
        }
    }

      


      // arrays can have 2 types of datatypes 
    //   1.primitive datatype
    //   2.user defined 
    //      for this we have to create our own class n constructor 

      class Student{
        public int rno;
        public String name;

        //constructor
        Student(int rno, String name){
            this.rno = rno;
            this.name = name;
        }
      }





      