package serializable.sample;

import org.msgpack.MessagePack;
import org.testng.annotations.Test;

import java.io.IOException;

public class MsgpackTest extends BaseTest {

    @Test
    public void msgpack() throws IOException {
        // 序列化
        MessagePack pack = new MessagePack();
        pack.register(User.class);
        byte[] data = pack.write(user);

        // 反序列化
        User user = pack.read(data, User.class);
        print(user);
    }
}
