package by.academy.classwork.lesson18;

import java.io.Serializable;
import java.util.Date;

public class DebitCard implements Serializable, Payment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String issuer;
	private Long cardNo;
	private Date expiryDate;

	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DebitCard(String issuer, Long cardNo, Date expiryDate) {
		super();
		this.issuer = issuer;
		this.cardNo = cardNo;
		this.expiryDate = expiryDate;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public boolean authorise(double amount) {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardNo == null) ? 0 : cardNo.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((issuer == null) ? 0 : issuer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DebitCard other = (DebitCard) obj;
		if (cardNo == null) {
			if (other.cardNo != null)
				return false;
		} else if (!cardNo.equals(other.cardNo))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (issuer == null) {
			if (other.issuer != null)
				return false;
		} else if (!issuer.equals(other.issuer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DebitCard [issuer=" + issuer + ", cardNo=" + cardNo + ", expiryDate=" + expiryDate + "]";
	}

}
