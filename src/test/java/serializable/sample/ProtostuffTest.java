package serializable.sample;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import org.testng.annotations.Test;

public class ProtostuffTest extends BaseTest {

    @Test
    public void protostuff() {
        // 序列化
        byte[] userData = ProtobufIOUtil.toByteArray(user, RuntimeSchema.getSchema(User.class),
                LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));

        // 反序列化
        User user = new User();
        ProtobufIOUtil.mergeFrom(userData, user, RuntimeSchema.getSchema(User.class));
        print(user);
    }
}
