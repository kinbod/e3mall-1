package cn.haohaoli.common.pojo;

import java.io.Serializable;

/**
 * 树对象
 * @author Liwenhao
 * @date 2018/8/6 12:51
 */
public class TreeNode implements Serializable {

    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
