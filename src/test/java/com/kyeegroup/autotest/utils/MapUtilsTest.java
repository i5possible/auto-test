package com.kyeegroup.autotest.utils;

import com.google.common.collect.Sets;
import com.kyeegroup.autotest.exception.IllegalJsonInputException;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author lianghong
 * @date 10/12/2017
 */
public class MapUtilsTest {

    @Test
    public void covert_json_string_to_map() throws IllegalJsonInputException {
        Map<String, String> map = MapUtils.jsonToMap("{\n" +
                "          \"title\": \"新人家去诶节日手指南，教你玩转APP\",\n" +
                "          \"time\": \"2016.10.20-2016.12.1\",\n" +
                "          \"type\": \"知识\",\n" +
                "          \"img_url\": \"http://xxxx/Uploads/housephoto/253/252256/56dc035c55359.JPG\",\n" +
                "          \"web_url\": \"xxx/xxx/xxx.html\",\n" +
                "           1: \"3\" " +
                "        }");

        assertThat(map.size()).isEqualTo(6);
        assertThat(map.keySet()).isEqualTo(Sets.newHashSet("1", "title", "time", "type", "img_url", "web_url"));
        assertThat(map.get("type")).isEqualTo("知识");
        assertThat(map.get("1")).isEqualTo("3");
    }
}
