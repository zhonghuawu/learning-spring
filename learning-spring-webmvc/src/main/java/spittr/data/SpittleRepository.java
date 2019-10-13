package spittr.data;

import spittr.dto.Spittle;

import java.util.List;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/14 0:24
 */
public interface SpittleRepository {
    /**
     * find spittles list
     *
     * @param max
     * @param count
     * @return
     */
    List<Spittle> findSpittles(long max, int count);
}
