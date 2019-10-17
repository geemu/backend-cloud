package com.chenfangming.esb.core.impl;

import com.chenfangming.esb.core.impl.head.EsbRequestHead;
import com.chenfangming.esb.core.impl.sign.EsbBody;
import lombok.Data;

/**
 * 请求
 * @author 陈方明  cfmmail@sina.com
 * @since 2019-10-17 23:26
 */
@Data
public class EsbRequest<B extends EsbBody> implements Esb {

    private EsbRequestHead Head;

    private B Body;

}
