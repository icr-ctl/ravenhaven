package org.sandiegozoo.mlcameratrap.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Menu {

    /**
     * An array of sample menu items.
     */
    public static final List<MenuItem> ITEMS = new ArrayList<MenuItem>();

    /**
     * A map of sample menu items, by ID.
     */
    public static final Map<String, MenuItem> ITEM_MAP = new HashMap<String, MenuItem>();

    private static final int COUNT = 8;

    public static final int VIEW_GRAPH = 1;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createMenuItem(i));
        }
    }

    private static void addItem(MenuItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static MenuItem createMenuItem(int position) {
        switch (position)
        {
            case VIEW_GRAPH:
                return new MenuItem(String.valueOf(position), "View Graph", makeDetails(position));
            default:
                return new MenuItem(String.valueOf(position), "Item " + position, makeDetails(position));
        }
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A menu item containing details such as position in list, content, and details
     */
    public static class MenuItem {
        public final String id;
        public final String content;
        public final String details;
        public final ChartHelper chartHelper;

        public MenuItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.chartHelper = new ChartHelper();
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
