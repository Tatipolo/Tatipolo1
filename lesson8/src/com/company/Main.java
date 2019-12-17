package com.company;

public class Main {

    public static void main(String[] args) {
	    User user1 = new User();
	    user1.setName("Vasya");
	    user1.setAge(16);
	    User user2 = new User();
        user2.setName("Vasya");
        user2.setAge(16);
        // user1 <> user2 поскольку ссылки указывают на разные области памяти
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        // обязательно должно соблюдатся правило , если x.equals(y) == true
        // то х hashCode == y hashCode == true
        // но это не тождественно правилу что наоборот тоже должно быть true
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        if (user1.hashCode() == user2.hashCode()){
            if (user1.equals(user2)){
                System.out.println("user1 == user 2");
            } else {
                System.out.println("user1 != user 2");
            }
        }
        User user3 = user2;
        // ВАЖНО!!!!!!!!!!!! x. equals(y) == y.equals(x)
        System.out.println(user3.equals(user2));
        System.out.println(user3.hashCode());
        System.out.println(user1.getClass());
        System.out.println(user1);
        // пример работы фабричного класса
        new UserFactory()
                .signin("Den4444@.ru")
                .sendMessage("hello")
                .deactivate()
                .sendMessage("How are you?")
                .activate()
                .signOut();
    }

}
