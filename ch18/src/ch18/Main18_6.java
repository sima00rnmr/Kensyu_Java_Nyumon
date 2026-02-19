package ch18;
/*これは参考程度に…
 *javaを使ってWebアプリケーションを作る際は
 *サーブレット（Servlet）というクラスを開発する
 *
 *以下のコードを
 *コンパイル、実行するには
 *サーブレットの開発環境が必要である…
 *
 *エラーが沢山あるけど、いずれ対応してみよう…！
 *
 */
import java.io.IOException;

import javax.servlet.http.*; //これがサーブレット？ないとできないやつかな…？
@WebServlet("/HelloServlrt")
public class Main18_6 extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		Date d =new Date();
		PrintWrite w = res.getWriter();
		res.setContentType("text/html");
		w.write("<html><body>");
		w.write("Today is" + d.toString());
		w.write("</body></html>");
	}

	
	public static void main(String[] args) {
		

	}

}
