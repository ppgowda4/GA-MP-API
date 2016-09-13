package com.gamp.hittype;

import static com.gamp.config.GoogleAnalyticsParameter.CURRENCY_CODE;
import static com.gamp.config.GoogleAnalyticsParameter.TRANSACTION_AFFILIATION;
import static com.gamp.config.GoogleAnalyticsParameter.TRANSACTION_ID;
import static com.gamp.config.GoogleAnalyticsParameter.TRANSACTION_REVENUE;
import static com.gamp.config.GoogleAnalyticsParameter.TRANSACTION_SHIPPING;
import static com.gamp.config.GoogleAnalyticsParameter.TRANSACTION_TAX;

import com.gamp.transport.GoogleAnalyticsRequest;

/**
 * GA request to track ecommerce transaction.
 *
 * <p>For more information, see <a href="https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters#ecomm">GA Parameters Reference</a></p>
 *
 * @author Punith
 */
public class TransactionHit extends GoogleAnalyticsRequest<TransactionHit> {

    public TransactionHit() {
        this(null);
    }

    public TransactionHit(String txId) {
        this(txId, null);
    }

    public TransactionHit(String txId, Double txRevenue) {
        this(txId, null, txRevenue);
    }

    public TransactionHit(String txId, String txAffiliation, Double txRevenue) {
        this(txId, txAffiliation, txRevenue, null, null, "USD");
    }

    public TransactionHit(String txId, String txAffiliation, Double txRevenue, String currencyCode) {
        this(txId, txAffiliation, txRevenue, null, null, currencyCode);
    }

    public TransactionHit(String txId, String txAffiliation, Double txRevenue, Double txShipping, Double txTax, String currencyCode) {
        super("transaction");
        txId(txId);
        txAffiliation(txAffiliation);
        txRevenue(txRevenue);
        txShipping(txShipping);
        txTax(txTax);
        currencyCode(currencyCode);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		<strong>Required for transaction hit type.</strong>
     * 		<br>
     * 		<strong>Required for item hit type.</strong>
     * 	</p>
     * 	<p>A unique identifier for the transaction. This value should be the same for both the Transaction hit and Items hits associated to the particular transaction.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>ti</code></td>
     * 				<td>text</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>500 Bytes
     * 				</td>
     * 				<td>transaction, item</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>OD564</code><br>
     * 		Example usage: <code>ti=OD564</code>
     * 	</div>
     * </div>
     */
    public TransactionHit txId(String value) {
        setString(TRANSACTION_ID, value);
        return this;
    }

    public String txId() {
        return getString(TRANSACTION_ID);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		Optional.
     * 	</p>
     * 	<p>Specifies the affiliation or store name.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>ta</code></td>
     * 				<td>text</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>500 Bytes
     * 				</td>
     * 				<td>transaction</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>Member</code><br>
     * 		Example usage: <code>ta=Member</code>
     * 	</div>
     * </div>
     */
    public TransactionHit txAffiliation(String value) {
        setString(TRANSACTION_AFFILIATION, value);
        return this;
    }

    public String txAffiliation() {
        return getString(TRANSACTION_AFFILIATION);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		Optional.
     * 	</p>
     * 	<p>Specifies the total revenue associated with the transaction. This value should include any shipping or tax costs.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>tr</code></td>
     * 				<td>currency</td>
     * 				<td><code>0</code>
     * 				</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>transaction</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>15.47</code><br>
     * 		Example usage: <code>tr=15.47</code>
     * 	</div>
     * </div>
     */
    public TransactionHit txRevenue(Double value) {
        setDouble(TRANSACTION_REVENUE, value);
        return this;
    }

    public Double txRevenue() {
        return getDouble(TRANSACTION_REVENUE);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		Optional.
     * 	</p>
     * 	<p>Specifies the total shipping cost of the transaction.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>ts</code></td>
     * 				<td>currency</td>
     * 				<td><code>0</code>
     * 				</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>transaction</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>3.50</code><br>
     * 		Example usage: <code>ts=3.50</code>
     * 	</div>
     * </div>
     */
    public TransactionHit txShipping(Double value) {
        setDouble(TRANSACTION_SHIPPING, value);
        return this;
    }

    public Double txShipping() {
        return getDouble(TRANSACTION_SHIPPING);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		Optional.
     * 	</p>
     * 	<p>Specifies the total tax of the transaction.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>tt</code></td>
     * 				<td>currency</td>
     * 				<td><code>0</code>
     * 				</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>transaction</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>11.20</code><br>
     * 		Example usage: <code>tt=11.20</code>
     * 	</div>
     * </div>
     */
    public TransactionHit txTax(Double value) {
        setDouble(TRANSACTION_TAX, value);
        return this;
    }

    public Double txTax() {
        return getDouble(TRANSACTION_TAX);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		Optional.
     * 	</p>
     * 	<p>When present indicates the local currency for all transaction currency values. Value should be a valid ISO 4217 currency code.</p>
     * 	<table border="1">
     * 		<tbody>
     * 			<tr>
     * 				<th>Parameter</th>
     * 				<th>Value Type</th>
     * 				<th>Default Value</th>
     * 				<th>Max Length</th>
     * 				<th>Supported Hit Types</th>
     * 			</tr>
     * 			<tr>
     * 				<td><code>cu</code></td>
     * 				<td>text</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>10 Bytes
     * 				</td>
     * 				<td>transaction, item</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>EUR</code><br>
     * 		Example usage: <code>cu=EUR</code>
     * 	</div>
     * </div>
     */
    public TransactionHit currencyCode(String value) {
        setString(CURRENCY_CODE, value);
        return this;
    }

    public String currencyCode() {
        return getString(CURRENCY_CODE);
    }

}
