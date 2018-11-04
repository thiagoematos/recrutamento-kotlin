package recrutamento.thiagoematos.prova

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@Configuration
@SpringBootApplication
class OctoEventsApplication

fun main(args: Array<String>) {
    runApplication<OctoEventsApplication>(*args)
}
