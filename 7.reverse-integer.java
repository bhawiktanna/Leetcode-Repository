public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int count = 0, temp = n;
    
    while(temp!=0){
        temp /= 10;
        count++;
    }
    int div = (int)Math.pow(10, count-1);

    while(div != 0){
        int digit = n / div;
        System.out.println(digit);
        n = n % div;
        div /= 10;
    }
    
    
}