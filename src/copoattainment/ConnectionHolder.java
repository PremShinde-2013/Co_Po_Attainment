/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package copoattainment;

/**
 *
 * @author ASUS
 */public class ConnectionHolder {

     private static java.sql.Connection userConnection; // Fully qualify Connection
    private static String connectedDBName;

    public static java.sql.Connection getUserConnection() {
        return userConnection;
    }
    

   public static void setUserConnection(java.sql.Connection connection, String dbName) {
    userConnection = connection;
    connectedDBName = dbName;
}
    public static String getConnectedDBName() {
        return connectedDBName;
    }
}
