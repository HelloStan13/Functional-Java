package katas;

import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata7Test {

    @Test
    public void testExecute() {

        Assert.assertThat(Kata7.execute(), equalTo(4));
    }

}

