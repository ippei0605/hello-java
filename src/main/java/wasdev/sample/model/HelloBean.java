package wasdev.sample.model;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class HelloBean implements Serializable {

    /** シリアルバージョンID */
    private static final long serialVersionUID = 2324340609815434023L;

    /** メッセージテンプレート */
    private static final String MESSAGE_TEMPLATE = "【%s】こんにちは、Bluemix。[%d]";

    /** カウンター */
    private int count = 0;

    /** メッセージ */
    private String message = String.format(MESSAGE_TEMPLATE, "デフォルト値", count);

    @PostConstruct
    public void init() {
        setCount(0);
        setMessage(String.format(MESSAGE_TEMPLATE, "@PostConstruct", getCount()));
    }

    public void action() {
        int next = getCount() + 1;
        setCount(next);
        setMessage(String.format(MESSAGE_TEMPLATE, "ボタンアクション", next));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}