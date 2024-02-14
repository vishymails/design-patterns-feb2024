package com.bvr.structural.composite;

public class CompositeTest {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        File a = new File("a");
        File b = new File("b");
        File c = new File("c");
        File d = new File("d");
        File e = new File("e");
        File f = new File("f");
        File g = new File("g");
        File h = new File("h");
        File i = new File("i");
        File j = new File("j");
        File k = new File("k");
        File l = new File("l");
        File m = new File("m");
        File n = new File("n");
        File o = new File("o");
        File p = new File("p");
        File q = new File("q");
        File r = new File("r");
        File s = new File("s");
        File t = new File("t");
        File u = new File("u");
        File v = new File("v");
        File w = new File("w");
        File x = new File("x");
        File y = new File("y");
        File z = new File("z");
        root.addComponent(home);
        root.addComponent(user);
        home.addComponent(a);
        home.addComponent(b);
        home.addComponent(c);
        home.addComponent(d);
        home.addComponent(e);
        home.addComponent(f);
        home.addComponent(g);
        home.addComponent(h);
        user.addComponent(i);
        user.addComponent(j);
        user.addComponent(k);
        user.addComponent(l);
        user.addComponent(m);
        user.addComponent(n);
        user.addComponent(o);
        user.addComponent(p);
        user.addComponent(q);
        user.addComponent(r);
        user.addComponent(s);
        user.addComponent(t);
        user.addComponent(u);
        user.addComponent(v);
        user.addComponent(w);
        user.addComponent(x);
        user.addComponent(y);
        user.addComponent(z);
        root.showDetails("");
    }
}
