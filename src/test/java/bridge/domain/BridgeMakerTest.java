package bridge.domain;

import bridge.domain.randomnumber.BridgeRandomNumberGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BridgeMakerTest {

    BridgeMaker bridgeMaker;

    @BeforeEach
    void beforeEach(){
        bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
    }

    @Test
    public void makeBridgeTest() throws Exception{
        //given
        int size = 10;

        //when
        List<String> bridges = bridgeMaker.makeBridge(size);
        //then
        for (String bridge : bridges) {
            Assertions.assertThat(bridge).isIn("U","D");
        }
    }
}