/**
 *
 */
package org.jsoup.nodes;

/**
 * @author arte
 *
 */
public class DirectivePageType extends DirectiveType {

	/**
	 * @param contentType
	 */
	public DirectivePageType(String contentType, String pageEncoding) {
		super();

		super.directiveType = "page";

		super.attributeList.add("contentType");
		super.attributeList.add("pageEncoding");

		super.attr("contentType", contentType);
		super.attr("pageEncoding", pageEncoding);
	}

}
