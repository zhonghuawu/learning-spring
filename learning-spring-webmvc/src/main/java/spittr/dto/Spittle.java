package spittr.dto;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/14 0:15
 */
@Value
@AllArgsConstructor
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;


    public Spittle(String message, Date time) {
        this(null, message, time, null, null);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }

}
