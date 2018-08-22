package intermediate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class DOMNode {
	String tag;
	String text;
	boolean isText;
	List<DOMNode> childrens;

	public DOMNode(String tag, String text, List<DOMNode> childrens) {
		this.tag = tag;
		this.text = text;
		if (this.text.isEmpty())
			this.isText = false;
		else
			this.isText = true;
		this.childrens = childrens;
	}
}

public class CheckTwoDOMTreeHaveSameText {
	public static void main(String[] args) {
		/*
		 * constructing first DOM tree <html><p>hello</p></html>
		 */
		DOMNode root1 = new DOMNode("html", null,
				new LinkedList<DOMNode>(Arrays.asList(new DOMNode("p", "hello", null))));

		/*
		 * constructing second DOM tree <html><p><b>h</b>ello</p></html>
		 */
		DOMNode root2 = new DOMNode("html", null, new LinkedList<DOMNode>(Arrays.asList(
				new DOMNode("p", "ello", new LinkedList<DOMNode>(Arrays.asList(new DOMNode("b", "h", null)))))));
	}
}
