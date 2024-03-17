package dev.pranay.ms3;

import java.util.List;

public interface IM3service {

    public List<GivenDto> getAllM3value();
    public String setM3value(M3dto m3dto);
}
