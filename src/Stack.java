import java.util.Arrays;

public class Stack
{
    public Stack()
    {
        size = 100;
        list = new char[size];
        top = 0;
    }

    public Stack(int s)
    {
        size = s;
        list = new char[size];
        top = 0;
    }

    public void push(char c)
    {
        if (isFull()) {
            size = 2 * size;
            list = Arrays.copyOf(list, size);
        }
        list[top] = c;
        top++;
    }

    public void pop()
    {
        if (!isEmpty()) {
            top--;
        }
        else {
            System.out.println("Stack is empty");
        }

    }

    public char peek()
    {
        if (!isEmpty()) {
            return list[top - 1];

        }
        else {
            System.out.println("Stack is empty!");
            return ' ';
        }
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public boolean isFull() {
        return top == size;
    }
    private char[] list;
    private int size;
    private int top;
}
