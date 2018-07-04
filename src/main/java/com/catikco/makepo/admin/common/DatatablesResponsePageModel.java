package com.catikco.makepo.admin.common;

import java.util.List;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/2/2018  10:44
 * Description：返回给datatables的数据
 */
public class DatatablesResponsePageModel<T>{
    private Integer draw;               //绘制计数器。这个是用来确保Ajax从服务器返回的是对应的（Ajax是异步的，因此返回的顺序是不确定的）
    private Integer recordsTotal;       //即没有过滤的记录数（数据库里总共记录数）
    private Integer recordsFiltered;    //过滤后的记录数（如果有接收到前台的过滤条件，则返回的是过滤后的记录数）
    private List<T> data;               //表中中需要显示的数据。这是一个对象数组，也可以只是数组，区别在于 纯数组前台就不需要用 columns绑定数据，会自动按照顺序去显示 ，而对象数组则需要使用 columns绑定数据才能正常显示。 注意这个 data的名称可以由
    private String error;               //可选。你可以定义一个错误来描述服务器出了问题后的友好提示

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Integer recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Integer getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Integer recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
