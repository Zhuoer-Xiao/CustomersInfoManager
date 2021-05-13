public class CustomerList {
    Customer[] customers;
    private int total=0;
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if(total<customers.length){
            customers[total]=customer;
            ++total;
            return true;
        }
        else {
            System.out.println("list is full");
            return false;
        }

    }
    public boolean replaceCustomer(int index, Customer cust){
        customers[index]=cust;
        return true;
    }
    public boolean deleteCustomer(int index){
        if(index>=0&&index<customers.length){
            customers[index]=null;
            return true;
        }
        else{
            System.out.println("invalid index");
            return false;
        }
    }

    public Customer[] getAllCustomers(){
        Customer[] cs=customers;
        return cs;
    }
    public Customer getCustomer(int index){
        Customer c=customers[index];
        return c;
    }

    //测试customerList类
//    public static void main(String[] args) {
//        Customer c=new Customer(1,"xiaozhuoer",true,18,"18723563539","2577306112@qq.com");
//        CustomerList cl=new CustomerList(5);
//        cl.addCustomer(c);
//        System.out.println(cl.getTotal());
//        System.out.println(cl.getCustomer(0).getEmail());
//        Customer c1=new Customer(1,"bella",false,18,"18723563539","2577306112@qq.com");
//        cl.replaceCustomer(0,c1);
//        CustomerList newcl=new CustomerList(cl.total);
//        newcl.customers=cl.getAllCustomers();
//        System.out.println(newcl.getCustomer(0).getName());
//    }
}
