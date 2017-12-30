package com.github.tbr.spring.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Slf4j
public class AppRunnerA  implements ApplicationRunner{
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("doing a.....");
        log.info("All args: {}",  Arrays.toString(args.getSourceArgs()));
        log.info("Non option args: {}",  args.getNonOptionArgs());
        log.info("Option names: {}",  args.getOptionNames());
        args.getOptionNames().stream().forEachOrdered(
                option -> log.info("{}:{}", option, args.getOptionValues(option))
        );
    }
}
