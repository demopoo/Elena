import bufferpools.DirectByteBufferPools;import bufferpools.ReuseByteBuffer;import java.nio.ByteBuffer;/** * Created by demopoo on 2017/9/28. */public class ReuseByteBufferTest {    public static void main(String[] args) {        DirectByteBufferPools byteBufferPools = new DirectByteBufferPools(10,10485760,4096);        ByteBuffer byteBuffer = byteBufferPools.allocateBuffer(4096);        ReuseByteBuffer reuseByteBuffer = new ReuseByteBuffer(byteBuffer);        //先读        byte[] bytes = new byte[1024];        bytes = reuseByteBuffer.get(bytes);        //再写        String str = "Just do it.";        reuseByteBuffer.put(str.getBytes());        //再读        byte[] bytes1 = new byte[10];        bytes1 = reuseByteBuffer.get(bytes1);        //再写        String str1 = "guan yu zheng zhou ni zhi";        reuseByteBuffer.put(str1.getBytes());    }}