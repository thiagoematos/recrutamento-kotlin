package recrutamento.thiagoematos.prova.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Event(
        @Id @GeneratedValue val id: Long = 0L,
        val action: String,
        val number: Long,
        var createdAt: Date
)