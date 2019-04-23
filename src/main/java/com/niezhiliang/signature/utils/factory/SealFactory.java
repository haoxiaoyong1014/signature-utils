package com.niezhiliang.signature.utils.factory;

import com.niezhiliang.signature.utils.basic.AbstractBasicSeal;

/**
 * Created by Haoxy on 2019-04-23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public abstract class SealFactory {

    protected AbstractBasicSeal basicSeal;

    public abstract AbstractBasicSeal newInstance();
}
