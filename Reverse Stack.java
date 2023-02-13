 static void insert_at_bottom(int x)
    {if (s.isEmpty())
            s.push(x);
 
        else {
            int a = s.peek()
            s.pop();
            insert_at_bottom(x);
            s.push(a);
        }
    }
    static void reverse()
    {
        if (s.size() > 0) {
            int x = s.peek();
            s.pop();
            reverse();
            insert_at_bottom(x);
        }
    }
