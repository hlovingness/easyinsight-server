package com.netease.hz.bdms.easyinsight.common.vo.logcheck;

import lombok.Data;
import lombok.experimental.Accessors;


@Accessors(chain = true)
@Data
public class AccumulateQueryVO extends LogQueryVO {

    private boolean incremental;
}
