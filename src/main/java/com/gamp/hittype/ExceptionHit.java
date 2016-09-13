package com.gamp.hittype;

import static com.gamp.config.GoogleAnalyticsParameter.EXCEPTION_DESCRIPTION;
import static com.gamp.config.GoogleAnalyticsParameter.EXCEPTION_FATAL;

import com.gamp.transport.GoogleAnalyticsRequest;

/**
 * GA request to track exceptions.
 *
 * <p>For more information, see <a href="https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters#exception">GA Parameters Reference</a></p>
 *
 * @author Punith
 */
public class ExceptionHit extends GoogleAnalyticsRequest<ExceptionHit> {

    public ExceptionHit() {
        this(null);
    }

    public ExceptionHit(String exceptionDescription) {
        this(exceptionDescription, false);
    }

    public ExceptionHit(String exceptionDescription, Boolean fatal) {
        super("exception");
        exceptionDescription(exceptionDescription);
        exceptionFatal(fatal);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		Optional.
     * 	</p>
     * 	<p>Specifies the description of an exception.</p>
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
     * 				<td><code>exd</code></td>
     * 				<td>text</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>150 Bytes
     * 				</td>
     * 				<td>exception</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>DatabaseError</code><br>
     * 		Example usage: <code>exd=DatabaseError</code>
     * 	</div>
     * </div>
     */
    public ExceptionHit exceptionDescription(String value) {
        setString(EXCEPTION_DESCRIPTION, value);
        return this;
    }

    public String exceptionDescription() {
        return getString(EXCEPTION_DESCRIPTION);
    }

    /**
     * <div class="ind">
     * 	<p>
     * 		Optional.
     * 	</p>
     * 	<p>Specifies whether the exception was fatal.</p>
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
     * 				<td><code>exf</code></td>
     * 				<td>boolean</td>
     * 				<td><code>1</code>
     * 				</td>
     * 				<td><span class="none">None</span>
     * 				</td>
     * 				<td>exception</td>
     * 			</tr>
     * 		</tbody>
     * 	</table>
     * 	<div>
     * 		Example value: <code>0</code><br>
     * 		Example usage: <code>exf=0</code>
     * 	</div>
     * </div>
     */
    public ExceptionHit exceptionFatal(Boolean value) {
        setBoolean(EXCEPTION_FATAL, value);
        return this;
    }

    public Boolean exceptionFatal() {
        return getBoolean(EXCEPTION_FATAL);
    }
}
