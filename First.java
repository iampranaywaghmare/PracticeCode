class MethodOverloading{
// two number addition
void addition(int a, int b){
int result = a + b;
System.out.println("Result ="+ result);
}
// three number addition
void addition(int a, int b, int c){
int result = a + b + c;
System.out.println("Result ="+ result);
}
//four number addition
void addition(int a, int b, int c, int d){
int result = a + b + c + d;
System.out.println("Result ="+ result);
}
}
class MethodOverriding{

}class First{
public static void main(String args[]){
MethodOverloading test = new MethodOverloading(); 
}
}
