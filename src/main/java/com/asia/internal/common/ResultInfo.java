package com.asia.internal.common;

import com.asia.internal.errcode.IErrorCodeEnum;
import org.springframework.stereotype.Component;


/**
 * 結果
 *
 * @author manco
 * @since 2019/03/13 10:08
 */

@Component
public class ResultInfo {

    private static final ThreadLocal<ResultInfoHolder> contextHolder = new ThreadLocal<>();

    private static void addResultInfoHolder() {
        if(contextHolder.get() == null){
            ResultInfoHolder resultInfoHolder = new ResultInfoHolder();
            contextHolder.set(resultInfoHolder);
        }
    }

    public String getCode() {
        addResultInfoHolder();
        return contextHolder.get().getCode();
    }


    public String getMessage() {
        addResultInfoHolder();
        return contextHolder.get().getMessage();
    }


    public void setResultInfo(IErrorCodeEnum t) {
        addResultInfoHolder();
        contextHolder.get().setResultInfo(t);
    }
    public void setResultInfo(BillException t) {
        addResultInfoHolder();
        contextHolder.get().setResultInfo(t);
    }

    public void removeResultInfo() {
        contextHolder.remove();
    }
}
