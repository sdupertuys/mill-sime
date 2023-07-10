package fr.ippon.mill.farmer.infrastructure.primary;

import fr.ippon.mill.farmer.application.FarmerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    private final FarmerService farmerService;

    public CerealRessource(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    @PostMapping
    public ResponseEntity<HttpResponse> createDepot(@RequestBody RegisterCerealRequest cerealRequest){
        if (!farmerService.exist(cerealRequest.getFarmerId())) {
            HttpResponse farmerNotFound = new HttpResponse(null,
                    "Farmer not found",
                    true);
            return new ResponseEntity<>(farmerNotFound, HttpStatus.NOT_FOUND);
        }
        return null;
    }

}
