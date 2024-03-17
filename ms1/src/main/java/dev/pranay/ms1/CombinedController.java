package dev.pranay.ms1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Data
public class CombinedController {

    private IM1service im1service;
    @GetMapping("/combined")
    public M1AndM3CombinedDto m1AndM3CombinedDto()
    {
        return im1service.combined();
    }
}
