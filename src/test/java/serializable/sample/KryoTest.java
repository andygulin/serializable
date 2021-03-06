package serializable.sample;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.testng.annotations.Test;

import java.io.IOException;

public class KryoTest extends BaseTest {

    @Test
    public void kryo() throws IOException {
        Kryo kryo = new Kryo();
        Output output = new Output(32, 1024);
        kryo.writeObject(output, user);
        output.flush();
        output.close();

        byte[] data = output.toBytes();
        Input input = new Input(data);
        User obj = kryo.readObject(input, User.class);
        input.close();
        print(obj);
    }
}
