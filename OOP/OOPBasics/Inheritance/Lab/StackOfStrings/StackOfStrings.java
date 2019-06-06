package OOP.OOPBasics.Inheritance.Lab.StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings(){
        this.data = new ArrayList<>();
    }

    public void push(String item){
        this.data.add(item);
    }

    public String pop(){
        if(data.isEmpty()){
            return null;
        }
        return this.data.remove(this.data.size() - 1);
    }

    public String peek(){
        if (this.isEmpty()) {
            return null;
        }

        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
