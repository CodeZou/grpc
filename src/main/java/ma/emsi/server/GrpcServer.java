package ma.emsi.server;



import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.emsi.service.BankGrpcService;

import java.io.IOException;

public class GrpcServer {

    private Server server;

    // Méthode pour démarrer le serveur
    public void start() throws IOException {
        int port = 50051; // Port du serveur
        server = ServerBuilder.forPort(port)
                .addService(new BankGrpcService()) // Associe le service gRPC
                .build()
                .start();
        System.out.println("Serveur gRPC démarré sur le port " + port);

        // Shutdown hook pour arrêter le serveur proprement
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** Arrêt du serveur gRPC ***");
            GrpcServer.this.stop();
            System.err.println("*** Serveur gRPC arrêté ***");
        }));
    }

    // Méthode pour arrêter le serveur
    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    // Méthode pour garder le serveur en exécution
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    // Méthode principale
    public static void main(String[] args) throws IOException, InterruptedException {
        final GrpcServer grpcServer = new GrpcServer();
        grpcServer.start();
        grpcServer.blockUntilShutdown();
    }
}

