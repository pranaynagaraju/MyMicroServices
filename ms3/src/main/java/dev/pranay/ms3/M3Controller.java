package dev.pranay.ms3;


import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class M3Controller {

private IM3service im3service;

@GetMapping("/getM3")
    public List<GivenDto> getAllM3values()
{
    return im3service.getAllM3value();
}
    @PostMapping("/setM3")
    public String setAllM3values(@RequestBody M3dto m3dto)
    {
        return im3service.setM3value(m3dto);
    }

}
