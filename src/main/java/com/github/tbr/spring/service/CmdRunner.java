package com.github.tbr.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class CmdRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("doing cmd....");
        log.info("Cmd args: {}", Arrays.toString(args));
    }
}
