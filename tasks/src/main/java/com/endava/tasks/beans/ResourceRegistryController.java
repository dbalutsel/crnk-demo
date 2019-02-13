package com.endava.tasks.beans;

import io.crnk.core.engine.registry.RegistryEntry;
import io.crnk.core.engine.registry.ResourceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ResourceRegistryController {

    @Autowired
    private ResourceRegistry resourceRegistry;

    @GetMapping("/resource-info")
    public Map<String, String> getResources() {
        Map<String, String> result = new HashMap<>();

        for (RegistryEntry entry : resourceRegistry.getResources()) {
            result.put(entry.getResourceInformation().getResourceType(),
                    resourceRegistry.getResourceUrl(entry.getResourceInformation()));
        }

        return result;
    }
}
