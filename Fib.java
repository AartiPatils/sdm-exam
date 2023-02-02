class fib{

  public void fiboni(){
    int n1=0,n2=1,n3,i,count=20;
    System.out.println(n1+" "+n2);
    for(i=2;i<count;++i){
        n3=n1+n2;
        System.out.print("  "+n3);
        System.out.println();
        System.out.println();
        n1=n2;
        n2=n3;
    }
}
    public void prime(){
        int num=60,count;
        int n=3;
        
            for(int i=1;i<=num;i++){
                count=0;
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        count++;
                        break;
                    }
                
            }
            if(count==0){
                System.out.println(i);
            }
        }
            
    }
  //Prime no

    public static void main(String args[]){
        fib o=new fib();
        o.fiboni();
        o.prime();
        
    }
}
