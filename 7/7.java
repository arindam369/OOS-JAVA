class Date{
   int day,month,year;
   Date(){
      day=1;
      month=1;
      year=1970;
   }
   Date(int d){
      day=d;
      month=1;
      year=1970;
   }
   Date(int d,int m){
      day=d;
      month=m;
      year=1970;
   }
   Date(int d,int m,int y){
      day=d;
      month=m;
      year=y;
   }
   void getDay(){
      System.out.println("Day : "+day+"/"+month+"/"+year);
   } 
   void getPreviousDay(){
      int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
      int newDay,newMonth,newYear;
      if(day==1){
         if(month==1){
            newYear=year-1;
            newMonth=12;
         }
         else{
            newYear=year-1;
            newMonth=month-1;
         }
         newDay=months[newMonth-1];
      }
      else{
         newDay=day-1;
         newMonth=month;
         newYear=year;
      }
      
      System.out.println("Previous Day : "+newDay+"/"+newMonth+"/"+newYear);
   }
   void getNextDay(){
      int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
      int newDay,newMonth,newYear;
      if(day==months[month-1]){
         if(month==12){
            newYear=year+1;
            newMonth=1;
         }
         else{
            newMonth=month+1;
            newYear=year;
         }
         newDay=1;
      }
      else{
         newDay=day+1;
         newMonth=month;
         newYear=year;
      }

      System.out.println("Next Day : "+newDay+"/"+newMonth+"/"+newYear);

   }

   public static void main(String args[]){
      Date d1 = new Date();
      d1.getDay();
      d1.getPreviousDay();
      d1.getNextDay();
      
      Date d2 = new Date(23,06,2002);
      d2.getDay();
      d2.getPreviousDay();
      d2.getNextDay();
   }




}
