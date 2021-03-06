package com.gamedoora.gamedoora.config.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GamedooraConfigServer {
  public static void main(String[] args) {
    SpringApplication.run(GamedooraConfigServer.class, args);
  }
}

