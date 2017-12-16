package com.example.springkafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.springkafka.domain.CardInfo;

/**
 * Receiver to consume card information from kafka topic
 */
@Configuration
public class Receiver {
	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	private CardInfo cardInfo;
	
	@KafkaListener(topics = "${kafka.topic.name}")
	public void receive(CardInfo payload) {
		LOGGER.info("received payload='{}'", payload);
		cardInfo = payload;
	}

	public CardInfo getCardInfo() {
		return cardInfo;
	}
}
