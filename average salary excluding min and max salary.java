class Solution {
    public double average(int[] salary) {
       
       int sum=0;
       float sum1=0;
   
       for(int i=0;i<salary.length;i++)
       {
           for(int j=i+1;j<salary.length;j++){
           if(salary[i]<salary[j]){
               int temp=salary[i];
               salary[i]=salary[j];
               salary[j]=temp;
           }
         }
       }
         for(int j=0;j<salary.length;j++){
             if(j==0 || j==salary.length-1)
             {
                 continue;
             }
             else{
                  sum=sum+salary[j];
             }
         }
         sum1=sum;
         sum1=sum1/(salary.length-2);
         return sum1;
    }
}