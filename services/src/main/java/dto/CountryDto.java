package dto;

import lombok.Data;

@Data
public class CountryDto {
    private String name;
    private int population;

    public CountryDto(String name, int population) {
        this.name = name;
        this.population = population;
    }
}
