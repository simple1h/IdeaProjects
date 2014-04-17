import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Product {
    private int id;
    public Product (int id) {
        this.id = id;
    }
    public int hashCode() {
        return id + 42;
    }
    public boolean equals (Object obj) {
        return (this == obj) ? true : super.equals(obj);
    }
}

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Product p1 = new Product(10);
        Product p2 = new Product(10);
        Product p3 = new Product(20);
        System.out.print(p1.equals(p2) + " ");
        System.out.print(p1.equals(p3) );

    }
}











