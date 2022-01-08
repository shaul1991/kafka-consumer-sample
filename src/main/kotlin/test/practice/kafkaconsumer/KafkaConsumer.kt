package test.practice.kafkaconsumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import test.practice.kafkaconsumer.KafkaConsumerConfiguration.Companion.TOPIC

class KafkaConsumer {
    @KafkaListener(topics = [TOPIC])
    fun receive(payload: String) {
        LOGGER.info("Received payload='$payload'")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(KafkaConsumer::class.java)
    }
}