/**
 * 版权声明： 版权所有 违者必究 2014
 * 日    期：14-2-12
 */
package com.appleframework.rop.impl;

import com.appleframework.rop.ThreadFerry;

/**
 * 不进行任何操作的实现类,仅为方便逻辑的运行
 * @author : chenxh(quickselect@163.com)
 * @date: 14-2-12
 */
public class DumbThreadFerry implements ThreadFerry {
    @Override
    public void doInSrcThread() {
    }

    @Override
    public void doInDestThread() {
    }
}
