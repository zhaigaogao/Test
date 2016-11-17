package moth11.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) throws IOException {
		//为了简单的实现联系功能，所有的异常直接往外抛
		int port=8899;
		//定义一个ServerSocket监听在8899端口上
		ServerSocket server=new ServerSocket(port);
		Socket socket=server.accept();
		Reader reader=new InputStreamReader(socket.getInputStream());
		char chars[] =new char[6];
		int len;
		StringBuilder sb=new StringBuilder();
		while((len=reader.read(chars))!=-1){
			sb.append("form client :" +sb);
		}
		Writer writer=new OutputStreamWriter(socket.getOutputStream());
		writer.write("hello Client");
		writer.flush();
		writer.close();
		reader.close();
		socket.close();
		server.close();
	}
}
