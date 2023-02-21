import java.util.Scanner;
class Assign1 {
    
        
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no ");
            int b=sc.nextInt();
           if(b%2==0){
            System.out.println("even no");
           }
           else{
            System.out.println("odd no");
           }
        }
    }
    
    
     
    //factorial of given no 
    class fact{
        public static void main(String args[]){
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no ");
            int b=sc.nextInt();
            int i;int fact=1;
            for(i=b;i>=1;i--){
                fact=fact*i;
            }
       
            System.out.println("factorial is : "+fact);
    
        }
    
    }
    
    //fact using recursion
    class rec{
       
        static int recurfact(int n){
            if(n==0) return 1;
            else
            return n*recurfact(n-1);
            
        }
        public static void main(String args[]){
            int fact=1;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no");
            int n=sc.nextInt();
            fact=recurfact(n);
            System.out.println(fact);
        }
    }
    
    //swap no without using 3rd variable approach1
    class swap1{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 no to be swapped");
            int a=sc.nextInt();
            int b=sc.nextInt();
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("a is : " +a);
            System.out.println("b is : " +b);
    
        }
    }
    
    //positive or negative
    class pn{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no");
            int a=sc.nextInt();
            if(a>0) System.out.println("positive no");
            else System.out.println("negative no");
            
        }
    }
    
    
    //leap year or not
    class leapyear{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter year");
            int a=sc.nextInt();
            if(((a%4==0) && (a%100!=0))|| (a%400==0)){
                System.out.println("given no is leap yaer");
            }
            else{
                System.out.println("given no is not an leap year");
            }
    
        }
    }
    
    
    //print the digits of no
    
    class digitprint{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no :");
            int temp=sc.nextInt();
            int n=temp;
            int count=0;int rem=0;
            while(temp>0){
                temp=temp/10;
                count++;
            }
            while(n>0){
                rem=n%10;
                System.out.println(rem);
                n=n/10;
                count--;
                
            }
    
        }
    }
    
    //factors of given no
    class factorsprint{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no");
            int a=sc.nextInt();
            for(int i=1;i<=a;i++){
                if(a%i == 0){
                    System.out.print( i+" ");
                }
            }
        }
    }
    
    //sum of the digits
    
    class sumdigit{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no");
            int n=sc.nextInt();
           int temp=n;int rem=0;int sum=0;int count=0;
            while(n>0){
                n=n/10;
                count++;
            }
            while(temp>0){
                 rem=temp%10;
                 sum=sum+rem;
                 temp=temp/10;
                 count--;
            }
            System.out.println(sum);
        }
    }
    
    //smallest using or symbol
    class smallest{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 3 no");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a<b) || (b<c)){
               
            }
            
        }
    }
    
    // addition without + operator
    
    class addition{
    
        static int add(int a,int b){
            for(int i=1;i<=b;i++){
                a++;
            }
            return a;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 no");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=add(a,b);
            System.out.println(c);
    
        }
    }
    
    //reverse a no
    
    class rev{
    
      public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int a=sc.nextInt();
        
        int rev=0;int rem=0;
        while(a!=0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
       System.out.println(rev);
      }
    }
    
    //gcd of 2 given no
    
    class gcd{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 no");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int gcd=0;int temp=0;
            while(b!=0){
                temp=b;
                b=a%b;
                a=temp;
            }
            gcd=a;
            System.out.println(gcd);
        }
    }
    
    
    //lcm of 2 given no
    class lcm{
         static int findgcd(int a,int b){
            if (a==0){
                return b;
            }
            return (findgcd(b%a,a));     
        }
        static int findlcm(int a,int b){
            return ((a/findgcd(a,b))*b);
        }
    
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 no");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=findlcm(a,b);
            System.out.println(c);
        }
    }
    
    
    // LCM of TWO given numberusing Prime Factors method. 
    //palindrome or not
    class palindrome{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no");
            int a=sc.nextInt();
            int temp=a;
            int rev=0;int rem=0;
            while(temp!=0){
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
           System.out.println(rev);
           if(rev==a)
            System.out.println("given no is palindrome");
           else
           System.out.println("not an palindrome no");
        }
    }
    
    //find the prime factor of given no
    class primefactorofgivenno{
        public static void primeFactors(int n)
      {
    
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
    
        for (int i = 3; i <= Math.sqrt(n); i += 2) { while (n % i == 0) { System.out.print(i + " "); n /= i; } } if (n > 2)
         System.out.print(n);
      }
          public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no");
            int n=sc.nextInt();
            primeFactors(n);
          }
    }
    
    //Given Number is Prime Number or NOT
    class primeornot{
        public static void main(String[] args)
        {
           int num, i, count=0;
           Scanner sc = new Scanner(System.in);
           
           System.out.print("Enter a Number: ");
           num = sc.nextInt();
           
           for(i=2; i<num; i++)
           {
              if(num%i == 0)
              {
                 count++;
                 break;
              }
           }
           
           if(count==0)
              System.out.println("\nIt is a Prime Number.");
           else
              System.out.println("\nIt is not a Prime Number.");
        }
    }
    
    //prime series from 1-n
    class primeseries{
        public static void main(String arg[])	
        {
        int i,count;
                   System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
                   System.out.println("Prime numbers between 1 to "+n+" are ");
        for(int j=2;j<=n;j++)
        {
        count=0;
        for(i=1;i<=j;i++)
        {
           if(j%i==0)
           {
                count++;        
           }
        }
        if(count==2)
               System.out.print(j+"  ");     
        }
        }
    }
    
    
    //armstrong or not
    class armstrong{
        public static void main(String[] args) {
            int originalNum, digit, cubeSum = 0,num;
            
            System.out.println("Enter the number:");
            Scanner sc = new Scanner(System. in );
            num = sc.nextInt();
            originalNum = num;
            while (num!= 0)
            {
                digit = num % 10;
                cubeSum += Math.pow(digit, 3);
                num /= 10;
            }
            if(cubeSum == originalNum)
                System.out.println(originalNum+ " is an Armstrong number");
            else
                System.out.println(originalNum+ " is not an Armstrong number");
        }
    }
    
    //armstrong no from 1 to 1000
    class armfrom1to1000{
        public static void main(String[] args) 
         {
            int n, count = 0, a, b, c, sum = 0;
            System.out.print("Armstrong numbers from 1 to 1000:");
            for(int i = 1; i <= 1000; i++)
            {
                n = i;
                while(n > 0)
                {
                    b = n % 10;
                    sum = sum + (b * b * b);
                    n = n / 10;
                }
                if(sum == i)
                {
                    System.out.print(i+" ");
                }
                sum = 0;
            }
        }
    }
    
    //given number is Perfect Numberor NOT.
    
     class Perfect
    {
        public static void main(String[] args) 
        {
            int n, sum = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number: ");
            n = s.nextInt();
            for(int i = 1; i < n; i++)
            {
                if(n % i == 0)
                {
                    sum = sum + i;
                }
            }
            if(sum == n)
            {
                System.out.println("Given number is a perfect number");
            }
            else
            {
                System.out.println("Given number is not a perfect number");
            }    
        }
        int divisor(int x)
        {
           return x;
        }
    }
    
    
    
    //print Perfect Numbersbetween 1 to 1000.
    class perfect{
        public static void main(String args[])
    {
        int i, j, start, end, sum;
        start=1;end=1000;
        
        for(i=start; i<=end; i++)
        {
            sum = 0;
    
            /* Check whether the current number i is Perfect number or not */
            for(j=1; j<i; j++)
            {
                if(i % j == 0)
                {
                    sum += j;
                }
            }
     
            /* If the current number i is Perfect number */
            if(sum == i)
            {
               System.out.println(i);
            }
        }
    
    
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
     

