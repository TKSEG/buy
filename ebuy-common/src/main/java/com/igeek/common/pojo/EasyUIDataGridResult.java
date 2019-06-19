package com.igeek.common.pojo;

import java.io.Serializable;
import java.util.List;
import lombok.Data;
/**
 * Created by yangbo on 2019/6/19.
 */
@Data
public class EasyUIDataGridResult implements Serializable{
    private Integer total;
    private List<?> rows;

    /**
     * @Title: EasyUIDataGridResult
     * @param total
     * @param rows
     */
    public EasyUIDataGridResult(Integer total, List<?> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }
    /**
     * @Title: EasyUIDataGridResult
     * @param total
     * @param rows
     */
    public EasyUIDataGridResult(Long total, List<?> rows) {
        super();
        this.total = total.intValue();
        this.rows = rows;
    }
    public EasyUIDataGridResult(){
    }
    //属性的set和get省略
}
