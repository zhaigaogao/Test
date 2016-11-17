package moth11.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	/**
	 * 创建socket服务器端
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int port=8899;
		//此处定义一个ServerSocket坚挺在8899端口上
		ServerSocket server=new ServerSocket(port);
		//server尝试接收其他Socket的请求，server的accept方法是阻塞是的
		Socket socket=server.accept();
		//跟客户端建立好链接之后我们就可以获取socket的InputStream并从中读取对应的信息了
		Reader reader=new InputStreamReader(socket.getInputStream());
		char chars[] =new char[64];
		int len;
		StringBuilder sd=new StringBuilder();
		while((len=reader.read(chars)) !=-1){
			sd.append(new String(chars,0,len));
		}
		System.out.println("form client: "+sd);
		reader.close();
		socket.close();
		server.close();
	}
	
}
