package refactoring.types.composing_methods;

/**
 * <h1>Extract Variable</h1>
 * <p><strong>Problem</strong>: You have an expression that’s hard to understand.</p>
 * <p><strong>Solution</strong>: Place the result of the expression or its parts in separate variables that are self-explanatory.</p>
 * <br />
 * <p><strong>Task</strong>: on <i>renderBanner()</i> extract Variables:
 * <ul>
 *     <li>isMacOs</li>
 *     <li>isIE</li>
 *     <li>wasResized</li>
 * </ul>
 * </p>
 */
public class ExtractVariable {
    private String platform;
    private String browser;
    private int resize;

    /**
     * Extract:
     * - isMacOs
     * - isIE
     * - wasResized
     */
    void renderBanner() {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0 )
        {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }
}
