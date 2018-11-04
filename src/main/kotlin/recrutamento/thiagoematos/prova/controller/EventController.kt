package recrutamento.thiagoematos.prova.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import recrutamento.thiagoematos.prova.dto.EventDTO
import recrutamento.thiagoematos.prova.service.IssueService

@RestController
class EventController {

    @Autowired
    lateinit var issueService: IssueService

    @GetMapping("/issues/{number}/events")
    fun filterEvents(@PathVariable number: Long): Collection<EventDTO> = issueService.filterBy(number)

    @PostMapping("/events")
    fun saveEvent(@RequestHeader("X-GitHub-Event") event: String,
                  @RequestBody payload: String) {
        when (event) {
            "ping" -> println("Registrado")
            "issues" -> issueService.save(payload)
        }
    }

}
