package dev.pranay.ms3;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class M3service implements IM3service {

    private M3repo m3repo;
    @Override
    public List<GivenDto> getAllM3value() {

        List<Ms3Entity> ms3Entities= m3repo.findAll();
        List<GivenDto> givenDtoList= new ArrayList<>();
        for(Ms3Entity i:ms3Entities)
        {
            GivenDto givenDto =new GivenDto();
            givenDto.setId(i.getM3Id());
            givenDto.setValue(i.getM3value());
            givenDtoList.add(givenDto);
        }

        return givenDtoList;




    }

    @Override
    public String setM3value(M3dto m3dto) {
        Ms3Entity ms3Entity = new Ms3Entity();
        ms3Entity.setM3value(m3dto.getValue());
        m3repo.save(ms3Entity);
        return "saved successfully in m3";
    }
}
