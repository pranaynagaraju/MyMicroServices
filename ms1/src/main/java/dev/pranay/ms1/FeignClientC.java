package dev.pranay.ms1;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("ms3")
public interface FeignClientC {

    @GetMapping(value = "/getM3",consumes = "application/json")
    public List<GivenDto> getAllM3values();
}
