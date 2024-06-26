package dev.project.fight.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Fight API",
                description = "This API allows a hero and a villain to fight",
                version = "1.0",
                contact = @Contact(name = "Quarkus", url = "https://github.com/quarkusio")),
        externalDocs = @ExternalDocumentation(url = "https://github.com/Red-Hat-Developer-Games/quarkus-workshop", description = "All the Quarkus workshops"),
        tags = {
                @Tag(name = "api", description = "Public that can be used by anybody"),
                @Tag(name = "fight", description = "Anybody interested in fights"),
                @Tag(name = "superheroes", description = "Well, superhero fights")
        }
)
public class FightApplication extends Application {
}