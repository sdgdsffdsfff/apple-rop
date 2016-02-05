/**
 * 版权声明： 版权所有 违者必究 2012
 * 日    期：12-6-30
 */
package com.appleframework.rop.client;

import com.appleframework.rop.response.ErrorResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
@SuppressWarnings("rawtypes")
public class DefaultCompositeResponse<T> implements CompositeResponse {

    private boolean successful;

    private ErrorResponse errorResponse;

    private T successRopResponse;

    public DefaultCompositeResponse(boolean successful) {
        this.successful = successful;
    }

    @Override
    public ErrorResponse getErrorResponse() {
        return this.errorResponse;
    }

    @Override
    public T getSuccessResponse() {
        return this.successRopResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public void setSuccessRopResponse(T successRopResponse) {
        this.successRopResponse = successRopResponse;
    }

    @Override
    public boolean isSuccessful() {
        return successful;
    }
}

