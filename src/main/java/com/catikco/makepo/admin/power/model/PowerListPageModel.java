package com.catikco.makepo.admin.power.model;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:27
 * Description：
 */
public class PowerListPageModel {

    private Integer id;     //主键
    private String model;   //产品型号
    private Double power;   //电源功率
    private Double input;   //输入电压
    private Double output;  //输出电压
    private String size;    //尺寸

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

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
