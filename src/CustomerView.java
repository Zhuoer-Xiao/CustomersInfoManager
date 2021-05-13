public class CustomerView {
    CustomerList cl;
    public CustomerView(){
        cl=new CustomerList(50);
    }
    public void enterMainMenu(){
        boolean loopTag=true;

        while (loopTag){
            System.out.println("-----------------客户信息管理软件-----------------\n" +
                    "\n" +
                    "1 添 加 客 户\n" +
                    "2 修 改 客 户\n" +
                    "3 删 除 客 户\n" +
                    "4 客 户 列 表\n" +
                    "5 退       出\n" +
                    "\n" +
                    "请选择(1-5)：_\n");
            char c=CMUtility.readMenuSelection();
            switch (c){
                case '1':
                    addNewCustomer(cl.getTotal());
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    if(CMUtility.readConfirmSelection()=='Y'){
                        loopTag=false;
                    }
                    break;
            }
        }
    }


    private void addNewCustomer(int no){
        System.out.println("---------------------添加客户---------------------\n");
        System.out.println("姓名：");
        String name=CMUtility.readString(20);
        System.out.println("性别：");
        String isMale=CMUtility.readString(5);
        System.out.println("年龄：");
        int age=CMUtility.readInt();
        System.out.println("电话：");
        String phone=CMUtility.readString(15);
        System.out.println("邮箱：");
        String email=CMUtility.readString(20);
        Customer c=new Customer(no,name,isMale,age,phone,email);
        cl.addCustomer(c);
    }
    private void modifyCustomer(){
        System.out.println("---------------------修改客户---------------------\n" +
                "请选择待修改客户编号(-1退出)：1\n");
        int flag=CMUtility.readInt()-1;
        System.out.println("姓名：");
        String name=CMUtility.readString(20,"null");
        if (name=="null"){
            name=cl.customers[flag].getName();
        }
        System.out.println("性别：");
        String isMale=CMUtility.readString(5,"null");
        if (isMale=="null"){
            isMale=cl.customers[flag].isMale();
        }
        System.out.println("年龄：");
        int age=CMUtility.readInt(-1);
        if (age==-1){
            age=cl.customers[flag].getAge();
        }
        System.out.println("电话：");
        String phone=CMUtility.readString(15,"null");
        if (phone=="null"){
            phone=cl.customers[flag].getPhone();
        }
        System.out.println("邮箱：");
        String email=CMUtility.readString(20,"null");
        if (email=="null"){
            email=cl.customers[flag].getEmail();
        }
        Customer c=new Customer(flag,name,isMale,age,phone,email);
        cl.replaceCustomer(flag,c);
        System.out.println("---------------------修改完成---------------------\n");
    }
    private void deleteCustomer(){
        System.out.println("---------------------删除客户---------------------\n");
        System.out.println("请选择待删除客户编号(-1退出)：");
        int flag=CMUtility.readInt();
        if(flag<=cl.getTotal()&&flag>0){
            cl.deleteCustomer(flag-1);
            System.out.println("---------------------删除完成---------------------\n");
        }
        else {
            System.out.println("索引无效");
        }
    }
    private void listAllCustomers(){
        System.out.println("---------------------------客户列表---------------------------\n");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱");
        for (int k=0;k<cl.getTotal();++k){
            if(cl.customers[k]!=null){
                System.out.print((k+1)+"\t\t\t");
                System.out.print(cl.customers[k].getName()+"\t\t");
                System.out.print(cl.customers[k].isMale()+"\t\t");
                System.out.print(cl.customers[k].getAge()+"\t\t");
                System.out.print(cl.customers[k].getPhone()+"\t\t");
                System.out.println(cl.customers[k].getEmail()+"\t\t");
            }

        }

    }
    public static void main(String[] args){
        CustomerView cv=new CustomerView();
        cv.enterMainMenu();
    }
}

