package com.example.springkafka.domain;

/**
 * POJO which will be published to Kafka topic. NTS will consume from kafka topic when new card
 * generated by PLCC system
 * 
 */
public class CardInfo {
	private String cardNumber;
	private String expiryDate;
	private Long phoneNumber;
	private boolean isReissued;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expDate) {
		this.expiryDate = expDate;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isReissued() {
		return isReissued;
	}

	public void setReissued(boolean isReissued) {
		this.isReissued = isReissued;
	}

	@Override
	public String toString() {
		return "CardInfo [cardNumber=" + cardNumber + ", expiryDate=" + expiryDate + ", phoneNumber=" + phoneNumber
				+ ", isReissued=" + isReissued + "]";
	}
}
