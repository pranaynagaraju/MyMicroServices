package dev.pranay.ms1;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class M1service implements IM1service {

    private M1repo m1repo;
    private FeignClientC feignClientC;
    @Override
    public List<Ms1Entity> getAllM1value() {
        return m1repo.findAll();
    }

    @Override
    public String setM1value(M1dto m1dto) {
        Ms1Entity ms1Entity = new Ms1Entity();
        ms1Entity.setM1value(m1dto.getValue());
        m1repo.save(ms1Entity);
        return "saved successfully in m1";
    }

    @Override
    public M1AndM3CombinedDto combined() {
        List<Ms1Entity>  m1All= m1repo.findAll();
        List<GivenDto>  m3All= feignClientC.getAllM3values();
        return new M1AndM3CombinedDto(m1All,m3All);
    }
}
