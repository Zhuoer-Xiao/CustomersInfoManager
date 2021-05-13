public class Customer {
    public int getNo() {
        return No;
    }

    public boolean setNo(int no) {
        if(no>0){
            No = no;
            return true;
        }
        else {
            System.out.println("no error");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if(name.length()>0){
            this.name = name;
            return true;
        }
        else {
            System.out.println("name error");
            return false;
        }

    }

    public String isMale() {
        return isMale;
    }

    public boolean setMale(String male) {
        isMale = male;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if(age>0 && age<150){
            this.age = age;
            return true;
        }
        else {
            System.out.println("age error");
            return false;
        }

    }

    public String getPhone() {
        return phone;
    }

    public boolean setPhone(String phone) {
        if(phone.length()>0){
            this.phone = phone;
            return true;
        }
        else {
            System.out.println("phone error");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.length() > 0) {
            this.email = email;
            return true;
        }
        else {
            System.out.println("email error");
            return false;
        }
    }

    private int No;
    private String name;
    private String isMale;
    private int age;
    private String phone;
    private String email;
    public Customer(int No,String name,String isMale,int age,String phone,String email){
        setNo(No);
        setName(name);
        setMale(isMale);
        setAge(age);
        setPhone(phone);
        setEmail(email);
    }
//    测试Customer
//    public static void main(String[] args) {
//        Customer c=new Customer(1,"xiaozhuoer",true,18,"18723563539","2577306112@qq.com");
//        System.out.println(c.getEmail());
//    }
}
