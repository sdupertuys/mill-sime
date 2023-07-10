package fr.ippon.mill.farmer.infrastructure.primary;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CerealRessource.CEREAL_API_URI)
@Validated
public class CerealRessource {
    public static final String CEREAL_API_URI = "/api/cereals";


    @PostMapping
    public void createDepot(@RequestBody RegisterCerealRequest cerealRequest){

    }

}
