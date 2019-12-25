package clwDemo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlerBase  {
	
	/**
	 * jsoup方式 获取虎扑新闻列表页
	 * @param url 虎扑新闻列表页url
	 */
	public void jsoupList(String url){
	    try {
	        Document document = Jsoup.connect(url).get();
	        System.out.println(document.toString());
	        // 使用 css选择器 提取列表新闻 a 标签
	        // <a href="https://voice.hupu.com/nba/2484553.html" target="_blank">霍华德：夏休期内曾节食30天，这考验了我的身心</a>
	        Element element = document.selectFirst("#uid");
	        String href=element.attr("href");
	        String author=element.ownText();
	        System.out.println("作者链接："+href+" ,详情页标题："+author);
	       /* for (Element element:elements){
//	                System.out.println(element);
	            // 获取详情页链接
	            String d_url = element.attr("href");
	            // 获取标题
	            String title = element.ownText();

	            System.out.println("详情页链接："+d_url+" ,详情页标题："+title);

	        }*/
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
	    String url = "https://blog.csdn.net/z694644032";
	    CrawlerBase crawlerBase = new CrawlerBase();
	    crawlerBase.jsoupList(url);
	}
	
}
