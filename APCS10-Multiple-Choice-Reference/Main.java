class Main {
  public static void main(String[] args) {

    //arr1 and arr2 question
    int count = 0;
    for(int i = 0; i < N; i++) {
      if(arr1[i]!=0) {
        arr1[count]=arr1[i];
        count++;
      }
    }
    int[] arr2 = new int[count];
    for(int i = 0; i < count; i++) {
      arr2[i] = arr1[i];
    }

    //doSomething question
    int[] arr = {1,2,3,4};
    doSomething(arr);
    System.out.print(arr[1]+ " ");
    System.out.print(arr[3]);
  }
  public static void doSomething(int[] list) {
    int[] b = list;
    for(int i = 0; i < b.length;i++) {
      b[i]=i;
    }
  }
}