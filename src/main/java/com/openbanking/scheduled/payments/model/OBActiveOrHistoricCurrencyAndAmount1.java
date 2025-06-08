package com.openbanking.scheduled.payments.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency
 * as ordered by the initiating party. Usage: This amount has to be transported unchanged through the transaction chain.
 */

@Schema(
		description = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. Usage: This amount has to be transported unchanged through the transaction chain.")
@Getter
@Setter
public class OBActiveOrHistoricCurrencyAndAmount1 implements Serializable {
	private static final long serialVersionUID = 1L;

}
