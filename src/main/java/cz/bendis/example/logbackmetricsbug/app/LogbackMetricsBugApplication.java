package cz.bendis.example.logbackmetricsbug.app;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.logging.LogbackMetrics;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LogbackMetricsBugApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbackMetricsBugApplication.class, args);
    }

    @Bean
    Object demo2(MeterRegistry meterRegistry, LogbackMetrics logbackMetrics) {
        return new Object();
    }
}
