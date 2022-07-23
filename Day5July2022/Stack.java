class Stack{
    
    int data;
    Stack(int n){
        fun();
        this.data = n;
        System.out.println(this.data);
        fun();
    }

    public void fun(){
        System.out.println("Ds"+ " "+data);
    }

    public static void main(String[] args) {  
        Stack obj = new Stack(12);
    }
}

