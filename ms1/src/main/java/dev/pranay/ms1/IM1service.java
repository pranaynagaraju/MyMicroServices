package dev.pranay.ms1;

import java.util.List;

public interface IM1service {

    public List<Ms1Entity> getAllM1value();
    public String setM1value(M1dto m3dto);

    public M1AndM3CombinedDto combined();
}
