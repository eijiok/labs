package designpatterns.chainofresponsability.refactoring_guru;

import designpatterns.chainofresponsability.refactoring_guru.middleware.Middleware;
import designpatterns.chainofresponsability.refactoring_guru.middleware.RoleCheckMiddleware;
import designpatterns.chainofresponsability.refactoring_guru.middleware.ThrottlingMiddleware;
import designpatterns.chainofresponsability.refactoring_guru.middleware.UserExistsMiddleware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "x");
        server.register("eiji@example.com", "x");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
