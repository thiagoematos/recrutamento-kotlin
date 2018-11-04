package recrutamento.thiagoematos.prova.service

import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import recrutamento.thiagoematos.prova.repository.EventRepository
import recrutamento.thiagoematos.prova.dto.EventDTO
import recrutamento.thiagoematos.prova.dto.IssueEvent
import recrutamento.thiagoematos.prova.model.Event

@Service
class IssueService {

    @Autowired
    lateinit var eventRepository: EventRepository

    fun filterBy(number: Long) =
            eventRepository
                    .findAllByNumber(number)
                    .map { EventDTO(it.action, it.createdAt) }

    fun save(payload: String) {
        val event = Gson().fromJson<IssueEvent>(payload, IssueEvent::class.java)
        eventRepository.save(Event(
                action = event.action,
                number = event.issue.number,
                createdAt = event.issue.created_at
        ))
    }

}
