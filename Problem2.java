import java.util.*;

public class Problem2{
    public static void main(String args[]){
        List<Data> sales2021=new ArrayList<>();
        List<Data> sales2022=new ArrayList<>();
        sales2021.add(new Data("tea",120));
        sales2021.add(new Data("Coffee",230));
        sales2021.add(new Data("greentea",60));
       

        sales2022.add(new Data("tea",100));
        sales2022.add(new Data("Coffee",250));
        sales2022.add(new Data("greentea",50));
        
        
         

        int sales2021Total=sales2021.stream().mapToInt(s->s.getvalue()).sum();
        int sales2022Total=sales2022.stream().mapToInt(s->s.getvalue()).sum();
        //calculate total for tea products-so use filter option
        

        int salesoftea2021=sales2021.stream().filter(s->s.getProduct().contains("tea"))
        .mapToInt(s->s.getvalue()).sum();
        int salesoftea2022=sales2022.stream().filter(s->s.getProduct().contains("tea"))
        .mapToInt(s->s.getvalue()).sum();

       
       
      
        System.out.println("sum of 2021 sales"+sales2021Total);
        System.out.println("sum of 2022 sales"+sales2022Total);
        System.out.println(salesoftea2021);
        System.out.println(salesoftea2022);


       

        
       }
}
class Data {
    private String product;
    private int value;
    private double varpct;
     public Data(String product,int value){
        this.product=product;
        this.value=value;
        

     }
     public Data(String product,double varpct){
        this.product=product;
        this.varpct=varpct;
     }
     public int getvalue(){
        return value;

     }
     public String getProduct(){
        return product;
     }
     public String toString(){
        return "{"+this.product+":"+this.value+":"+this.varpct+"}";
     }

    
}
/*
 Output
 sum of 2021 sales410
sum of 2022 sales400
180
150
 */


