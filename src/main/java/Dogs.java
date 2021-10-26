public class Dogs {
    //instance variables
    private int age;
    private int weight;

    //constructors
    public Dogs(int a, int w){
        age = a;
        weight = w;
    }

    public int checkAge(){
        return age;
    }

    public void celebrateBirthday(){
        age += 1;
    }

    public int checkWeight(){
        return weight;
    }

    public void addWeight(int x){
        weight += x;
    }

    public void subtractWeight(int x){
        weight -= x;
    }

    public String toString(){
        return "The age of the dog is " + age + " and the weight is " + weight;
    }
}
