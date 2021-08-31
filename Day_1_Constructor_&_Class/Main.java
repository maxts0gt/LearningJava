public class Main {
    public static void main(String[] args) {

//        Account maxAccount = new Account(
////                "123-123-123",
////                10,
////                "Max Tsogt",
////                "maxtsogt@gmail.com",
////                "012-0123-01234"
//        );
//        maxAccount.deposit(100);
//        maxAccount.withdrawal(50);
//        maxAccount.withdrawal(40);
//        maxAccount.withdrawal(110);
//
//        Account nateAccount = new Account("Nate", "nate@gmail.com", "12345");
//        System.out.println(nateAccount.getAccountNumber()+ " name " + nateAccount.getName());

        VipCustomer johnVip = new VipCustomer();
        System.out.println(johnVip.getName());
        VipCustomer employeeVip = new VipCustomer("Jane", 500);
        System.out.println(employeeVip.getName());
        VipCustomer nateVip = new VipCustomer("Nate", 1000, "nate@gmail.com");
        System.out.println(nateVip.getName());

    }
}
