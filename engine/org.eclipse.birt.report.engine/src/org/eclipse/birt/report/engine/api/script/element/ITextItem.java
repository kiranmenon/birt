package org.eclipse.birt.report.engine.api.script.element;

import org.eclipse.birt.report.engine.api.script.ScriptException;

/**
 * Represents a the design of a TextItem in the scripting environment
 */
public interface ITextItem extends IReportItem {

	/**
	 * Gets the text of this text element.
	 * 
	 * @return the text to display with the element, if this property value is not
	 *         set, return <code>null</code>.
	 */

	String getContent();

	/**
	 * Returns the localized content for the text. If the localized text for the
	 * text resource key is found, it will be returned. Otherwise, the static text
	 * will be returned.
	 * 
	 * @return the localized content for the text.
	 */

	String getDisplayContent();

	/**
	 * Sets the text for the text element.
	 * 
	 * @param value the new content of the text item
	 * @throws ScriptException if the property is locked.
	 */

	void setContent(String value) throws ScriptException;

	/**
	 * Returns the content type of this text item. The content type will one of the
	 * following constants defined in <code>DesignChoiceConstants</code>:
	 * 
	 * <ul>
	 * <li><code>TEXT_CONTENT_TYPE_AUTO</code>
	 * <li><code>TEXT_CONTENT_TYPE_PLAIN</code>
	 * <li><code>TEXT_CONTENT_TYPE_HTML</code>
	 * <li><code>TEXT_CONTENT_TYPE_RTF</code>
	 * </ul>
	 * 
	 * @return the content type. if this property value is not set, return
	 *         <code>null</code>.
	 * 
	 * @see org.eclipse.birt.report.model.api.elements.DesignChoiceConstants
	 */

	String getContentType();

	/**
	 * Sets the content type of this text item. The content type will one of the
	 * following constants defined in <code>DesignChoiceConstants</code>:
	 * 
	 * <ul>
	 * <li><code>TEXT_CONTENT_TYPE_AUTO</code>
	 * <li><code>TEXT_CONTENT_TYPE_PLAIN</code>
	 * <li><code>TEXT_CONTENT_TYPE_HTML</code>
	 * <li><code>TEXT_CONTENT_TYPE_RTF</code>
	 * </ul>
	 * 
	 * @param contentType the content type of this text item.
	 * 
	 * @throws ScriptException if the value is not a valid choice item.
	 * @see org.eclipse.birt.report.model.api.elements.DesignChoiceConstants
	 * 
	 */

	void setContentType(String contentType) throws ScriptException;

	/**
	 * Gets the resource key of the text for the item.
	 * 
	 * @return the resource key of the text
	 */

	String getContentKey();

	/**
	 * Sets the resource key of the text for the item.
	 * 
	 * @param resourceKey the resource key of the text
	 * @throws ScriptException if the property is locked.
	 */

	void setContentKey(String resourceKey) throws ScriptException;

}