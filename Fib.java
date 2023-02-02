class fib{
    public void fibo(){
        int n1=0,n2=1,n3,i,count=20;
        System.out.println(n1+" "+n2);
        for(i=2;i<count;++i){
            n3=n1+n2;
            System.out.print("  "+n3);
            System.out.println();
            System.out.println();
            System.out.println();
            n1=n2;
            n2=n3;
        }

    }
    public void armstrong(){
      int n=153;
      int p=0;
      int temp=n;
      while(n>0){
        int rem=n%10;
        p=(p)+(rem*rem*rem);
        n=n/10;
      }
      if(temp==p){
        System.out.println("armstrong");
      }
      else{
        System.out.println(" not armstrong");
      }
    }
   
    public static void main(String args[]){
        fib o=new fib();
        o.fibo();
        o.armstrong();

    }
}
