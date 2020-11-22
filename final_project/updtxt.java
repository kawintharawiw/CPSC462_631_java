import java.io.*;
import java.lang.*;
import java.util.regex.*;
class updtxt {
  public static void main(String args[]) throws IOException {
    String choice;
    BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));    
    String w; 
    choice  = "Wait your choice [menu, bye, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14] : ";
    displaymenu();
    System.out.print(choice);
    w = wiw.readLine();
     while (!w.equals("0")) {
      if (w.equals("0") || w.equals("bye")) {
        System.out.println("bye bye");  
        break;
      } else if (w.equals("1")) {
        addstu();
        w = " ";
      } else if (w.equals("2")) {
        addsubj();
        w = " ";
      } else if (w.equals("3")) {
        addreg();
        w = " ";
      } else if (w.equals("4")) {
        deletestu();
        w = " ";
      } else if (w.equals("5")) {
        deletesubj();
        w = " ";
      } else if (w.equals("6")) {
        deletereg();
        w = " ";
      } else if (w.equals("7")) {
        editstu();
        w = " ";
      } else if (w.equals("8")) {
       	editsub();
       	w = " ";
     	} else if (w.equals("9")) {
       	editreg();
       	w = " ";
     	} else if (w.equals("10")) {
        list("student.txt");
        w = " ";
      } else if (w.equals("11")) {
        list("subject.txt");
        w = " ";
      } else if (w.equals("12")) {
        list("register.txt");
        w = " ";
      } else if (w.equals("13")) {
        search();
        w = " ";
      } else if (w.equals("14")) {
        list("myprofile.txt");
        w = " ";
      } else {
        System.out.print(choice);
        w = wiw.readLine();
      }
    }
  }
// ======================================================
  static void displaymenu () {
    System.out.println("0 : bye bye !!!");
    System.out.println("1 : Add Student");
    System.out.println("2 : Add Subject");
    System.out.println("3 : Add Register");
    System.out.println("4 : Delete Student");
    System.out.println("5 : Delete Subject");
    System.out.println("6 : Delete Register");
    System.out.println("7 : Edit Student");
    System.out.println("8 : Edit Subject");
    System.out.println("9 : Edit Register");
    System.out.println("10 : List Student");
    System.out.println("11 : List Subject");
    System.out.println("12 : List Register");
    System.out.println("13 : Search");
    System.out.println("14 : My Profile");
    System.out.println("");  
  }
// ======================================================
 public static void addstu () throws IOException {
   BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id,name;
    System.out.print("Student ID : ");
    id = wiw.readLine();
    System.out.print("Student Name : ");
    name = wiw.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(id + "," + name);
    System.out.println("Add : Completely");
    pout.close();
  }
  // ======================================================
  public static void addsubj () throws IOException {
   BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id,name,credit;
    System.out.print("Subjects ID : ");
    id = wiw.readLine();
    System.out.print("Subject Name : ");
    name = wiw.readLine();
    System.out.print("Subject Credit : ");
    credit = wiw.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subject.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("subject.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(id + "," + name + "," + credit);
    System.out.println("Add : Completely");
    pout.close();
  }
 // ======================================================
  public static void addreg () throws IOException {
   BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id,name,grade,sec;
    System.out.print("Enter Student ID : ");
    id = wiw.readLine();
    System.out.print("Enter Subject ID : ");
    name = wiw.readLine();
    System.out.print("Enter Grade : ");
    grade = wiw.readLine();
    System.out.print("Enter Sec: ");
    sec = wiw.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("register.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("register.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(id + "," + name + "," + grade + "," + sec);
    System.out.println("Add : Completely");
    pout.close();
  }
  // ======================================================
  public static void editstu () throws IOException {
    BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id,name;
    System.out.print("Enter Student ID : ");
    id = wiw.readLine();
    System.out.print("Enter Student Name : ");
    name = wiw.readLine();
    
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();

    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      if (id.equals(ar[i].substring(0,10))) {
        pout.println(id + "," + name);
        System.out.println("Edit Student : Completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ======================================================
  public static void editsub () throws IOException {
    BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id,name,credit;
    System.out.print("Enter Subjects ID : ");
    id = wiw.readLine();
    System.out.print("Enter Subjects Name : ");
    name = wiw.readLine();
    System.out.print("Enter Subjects Credit : ");
    credit = wiw.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subject.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();

    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("subject.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      if (id.equals(ar[i].substring(0,2))) {
        pout.println(id + "," + name + "," + credit);
        System.out.println("Edit Subject : Completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ======================================================
  public static void editreg () throws IOException {
    BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id,name,grade,sec;
    System.out.print("Enter Stuent Id : ");
    id = wiw.readLine();
    System.out.print("Enter Subject Id : ");
    name = wiw.readLine();
    System.out.print("Enter Grade : ");
    grade = wiw.readLine();
    System.out.print("Enter Sec: ");
    sec = wiw.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("register.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("register.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      if (id.equals(ar[i].substring(0,3))) {
        pout.println(id + "," + name + "," + grade + "," + sec);
        System.out.println("Edit : Completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ======================================================
  public static void deletestu () throws IOException {
    BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id;
    System.out.print("Student ID : ");
    id = wiw.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();

    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      if (id.equals(ar[i].substring(0,10))) {
        System.out.println("Delete Stduent : Completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ======================================================
  public static void deletesubj () throws IOException {
    BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id;
    System.out.print("Subjects ID : ");
    id = wiw.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subject.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("subject.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      if (id.equals(ar[i].substring(0,2))) {
        System.out.println("Delete Subject : Completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ======================================================
  public static void deletereg () throws IOException {
    BufferedReader wiw = new BufferedReader(new InputStreamReader(System.in));
    String id;
    System.out.print("Register ID : ");
    id = wiw.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("register.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();

    int wiwk = i;
    FileOutputStream fout = new FileOutputStream("register.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < wiwk) {      
      if (id.equals(ar[i].substring(0,3))) {
        System.out.println("Delete Register : Completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ======================================================
  public static void list (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }
// ======================================================
public static void search() throws IOException{
  int found =0;
  char w;
  String b,g = "";
  String[] fields;
  System.out.print("Enter Student ID : ");
  w =(char)System.in.read();
  while (w != 'f'){
    g = g + w;
    w = (char)System.in.read();
  }
  FileReader fin = new FileReader("register.txt");
  BufferedReader bin = new BufferedReader(fin);
  while((b=bin.readLine()) != null){
    fields = b.split(",");
    if(fields[0].equals(g)){
      System.out.println("== Register Data ==" + "\n" +
        "Student ID : " + fields[0] + "\n" +
        "Subject ID : " + fields[1] + "\n" +
        "Grade ID : " + fields[2] + "\n" +
        "Sec : " + fields[3]);
      found=1;
    }
  }
  if (found == 0) System.out.println("Not Found");
  fin.close();
}
// ======================================================
public static void prof (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1){
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }
} 