package dev.pranay.ms1;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class M1Controller {

private IM1service im3service;

@GetMapping("/getm1")
    public List<Ms1Entity> getAllM3values()
{
    return im3service.getAllM1value();
}
    @PostMapping("/setm1")
    public String setAllM3values(@RequestBody M1dto m1dto)
    {
        return im3service.setM1value(m1dto);
    }

}
