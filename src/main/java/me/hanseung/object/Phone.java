package me.hanseung.object;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component // Bean 으로 등록해서 사용 가능
@ConfigurationProperties(prefix = "phone")
public class Phone {

    private String os;

    private int series;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
