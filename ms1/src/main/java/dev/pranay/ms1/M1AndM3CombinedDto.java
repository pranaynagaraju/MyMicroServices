package dev.pranay.ms1;


import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
public class M1AndM3CombinedDto {

    private List<Ms1Entity> ms1Entity;
    private List<GivenDto> ms3Entity;
}
