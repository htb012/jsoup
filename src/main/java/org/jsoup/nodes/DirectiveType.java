package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.helper.StringUtil;

/**
 * A {@code <%@ %>} node.
 */
public class DirectiveType extends Node {
	protected String directiveType = "";

	protected List<String> attributeList = new ArrayList<String>();

	/**
	 * Create a new DirectiveType element.
	 *
	 * @param contentType
	 */
	public DirectiveType() {
		super("");
	}

	@Override
	public String nodeName() {
		return "#directive";
	}

	@Override
	void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
		accum.append("\n<%@ ");
		accum.append(this.directiveType);

		for (String attribute : this.attributeList) {
			if (has(attribute))
				accum.append(" " + attribute + "=\"").append(attr(attribute)).append('"');
		}

		accum.append(" %>");
	}

	@Override
	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
	}

	private boolean has(final String attribute) {
		return !StringUtil.isBlank(attr(attribute));
	}
}
