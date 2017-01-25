/**
 *
 */
package org.jsoup.nodes;

/**
 * @author arte
 *
 */
public class DirectiveTaglibType extends DirectiveType {

	/**
	 * @param contentType
	 */
	public DirectiveTaglibType(String uri, String prefix) {
		super();

		super.directiveType = "taglib";

		super.attributeList.add("uri");
		super.attributeList.add("prefix");

		super.attr("uri", uri);
		super.attr("prefix", prefix);
	}

}
