package com.aathavan.ecom.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConnectionConfig {
    private DataSource getDataSource(String serverIp, String portNo, String userName, String password, String dbName) throws Exception {
        HikariDataSource hikariDataSource = null;
        try {
            hikariDataSource = new HikariDataSource();
//            hikariDataSource.setDriverClassName(DbInstallConstant.DRIVER_CLASS_NAME);
//            hikariDataSource.setJdbcUrl(DbInstallCommon.prepareConnectionString(serverIp, portNo) + dbName);
            hikariDataSource.setUsername(userName);
            hikariDataSource.setPassword(password);
            hikariDataSource.getConnection();
            return hikariDataSource;
        } catch (Exception e) {
            throw new Exception("Invalid Server Credentials");
        }
    }

//    public void checkDataSource() throws Exception {
//        ServerCredentials serverCredentials = DbInstallConstant.getServerCredentials();
//        if (serverCredentials == null) {
//            throw new Exception("Server Credentials Not Found....!");
//        }
//
//        DbInstallConstant.setDataSource(getDataSource(serverCredentials.getServerip(), serverCredentials.getPortno(),
//                serverCredentials.getUsername(), serverCredentials.getPassword(), ""));
//    }

//    public DataSource getDbDataSource(String dbName) throws Exception {
//
//        ServerCredentials serverCredentials = DbInstallConstant.getServerCredentials();
//        if (serverCredentials == null) {
//            throw new Exception("Server Credentials Not Found....!");
//        }
//
//        return getDataSource(serverCredentials.getServerip(), serverCredentials.getPortno(),
//                serverCredentials.getUsername(), serverCredentials.getPassword(), dbName);
//    }


}
