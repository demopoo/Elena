package handle.connect;import handle.Elena_IOHandle;import java.io.IOException;import java.nio.channels.ClosedChannelException;import java.nio.channels.Selector;import java.nio.channels.SocketChannel;/** * Created by demopoo on 2017/9/28. */public class ConnectionHandle extends Elena_IOHandle {    public ConnectionHandle(Selector selector, SocketChannel socketChannel) throws Exception{        super(selector,socketChannel);    }    @Override    public void onConnection() throws IOException{        String str = "hello world"+"\r\n";        this.onWrite(str.getBytes());    }    @Override    public void onClosed() {    }}