package com.surya;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;
import jakarta.validation.constraints.Min;

@ConfigurationProperties(prefix = "student")
public record ApplicationProperties(

		@Min(1) @DefaultValue("10") int pageSize)

{

}
