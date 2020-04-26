package cz.bendis.example.logbackmetricsbug.lib;

import org.springframework.boot.actuate.autoconfigure.metrics.LogbackMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus.PrometheusMetricsExportAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(LogbackMetricsAutoConfiguration.class)
@AutoConfigureBefore(PrometheusMetricsExportAutoConfiguration.class)
public class AdditionalLogbackMetricsAutoConfiguration {
}
