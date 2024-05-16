
package com.mycompany.supperclass;


public class Students extends Person {
   private Double average;

    public Students(double average,String name, String lastname, String id, int age) {
        super(average,name, lastname, id, age);
        this.average =average;
    }
   public void study(){
       System.out.println("voy a estudiar");
   }; 
      public void homwork(){
       System.out.println("voy a hacer tareas");
   }; 
         public void goToclass(){
       System.out.println("voy al salon");
   }; 
}










