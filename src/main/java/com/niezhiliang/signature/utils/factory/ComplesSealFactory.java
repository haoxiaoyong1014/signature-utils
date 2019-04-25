package com.niezhiliang.signature.utils.factory;

import com.niezhiliang.signature.utils.basic.AbstractBasicSeal;
import com.niezhiliang.signature.utils.abs.ComplexSeal;

/**
 * Created by Haoxy on 2019-04-24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class ComplesSealFactory extends SealFactory{
    @Override
    public AbstractBasicSeal newInstance() {

        if (this.basicSeal == null) {
            return new ComplexSeal();
        }
        return this.basicSeal;
    }
}
