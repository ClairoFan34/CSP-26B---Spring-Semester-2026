import java.util.ArrayList;

public class expressionsStack<Type> {
    private ArrayList<Type> arr = new ArrayList<>();

    public void push(Type value) {
        arr.add(value); 
    }

    public Type pop() {
        if (arr.isEmpty())
                return null;
        return arr.remove(arr.size()-1);
    }

    public Type peek() {
        return arr.get(arr.size()-1);
    }

    public boolean isEmpty() {
        return arr.isEmpty();
    }


}
