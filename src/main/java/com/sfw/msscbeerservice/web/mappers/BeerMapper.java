package com.sfw.msscbeerservice.web.mappers;

import com.sfw.msscbeerservice.domain.Beer;
import com.sfw.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDto beerDto);
    BeerDto beerToBeerDto(Beer beer);

}
