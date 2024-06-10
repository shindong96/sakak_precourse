package com.sakak.precourse.presentation;

import com.sakak.precourse.application.NutritionService;
import com.sakak.precourse.dto.request.NutritionPersistRequest;
import com.sakak.precourse.dto.request.NutritionSearchingRequest;
import com.sakak.precourse.dto.response.NutritionSearchingResponse;
import jakarta.validation.Valid;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/nutritions")
public class NutritionController {

    private final NutritionService nutritionService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody NutritionPersistRequest request) {
        Long id = nutritionService.save(request);
        return ResponseEntity.created(URI.create("/nutritions/" + id)).build();
    }

    @GetMapping
    public ResponseEntity<NutritionSearchingResponse> search(@RequestBody @Valid NutritionSearchingRequest request) {
        NutritionSearchingResponse response = nutritionService.search(request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        nutritionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
