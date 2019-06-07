package creational.builder.inner;

public class Client {

    public static void main(String[] args) {
        Account account = Account.newBuilder()
                .setToken("Ew3e-SDfe-lo6f-BvcQ")
                .setUserId("FF2")
                .build();

        System.out.println("UserId:\t" + account.getUserId());
        System.out.println("Token:\t" + account.getToken());
    }

}
