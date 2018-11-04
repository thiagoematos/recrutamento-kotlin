package recrutamento.thiagoematos.prova.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import recrutamento.thiagoematos.prova.model.Event

@Repository
interface EventRepository : CrudRepository<Event, Long> {

    fun findAllByNumber(number: Long): Collection<Event>

}
