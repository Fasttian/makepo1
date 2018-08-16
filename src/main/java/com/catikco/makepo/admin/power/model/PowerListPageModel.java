package com.catikco.makepo.admin.power.model;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:27
 * Description：
 */
public class PowerListPageModel {

    private Integer id;     //主键
    private String model;   //产品型号
    private String power;   //电源功率
    private String input;   //输入电压
    private String output;  //输出电压
    private String size;    //尺寸
    private String productCreateTime;   //发布时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(String productCreateTime) {
        this.productCreateTime = productCreateTime;
    }
}
