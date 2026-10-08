package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ak.p0 f32435a = ak.p0.a().g(ii.l0.d.ADDRESS_COMPONENTS, "address_components").g(ii.l0.d.BUSINESS_STATUS, "business_status").g(ii.l0.d.CURBSIDE_PICKUP, "curbside_pickup").g(ii.l0.d.CURRENT_OPENING_HOURS, "current_opening_hours").g(ii.l0.d.DELIVERY, "delivery").g(ii.l0.d.DINE_IN, "dine_in").g(ii.l0.d.DISPLAY_NAME, "name").g(ii.l0.d.EDITORIAL_SUMMARY, "editorial_summary").g(ii.l0.d.FORMATTED_ADDRESS, "formatted_address").g(ii.l0.d.ICON_BACKGROUND_COLOR, "icon_background_color").g(ii.l0.d.ICON_MASK_URL, "icon_mask_base_uri").g(ii.l0.d.ID, "place_id").g(ii.l0.d.INTERNATIONAL_PHONE_NUMBER, "international_phone_number").g(ii.l0.d.LOCATION, "geometry/location").g(ii.l0.d.OPENING_HOURS, "opening_hours").g(ii.l0.d.PHOTO_METADATAS, "photos").g(ii.l0.d.PLUS_CODE, "plus_code").g(ii.l0.d.PRICE_LEVEL, "price_level").g(ii.l0.d.RATING, "rating").g(ii.l0.d.RESERVABLE, "reservable").g(ii.l0.d.SECONDARY_OPENING_HOURS, "secondary_opening_hours").g(ii.l0.d.SERVES_BEER, "serves_beer").g(ii.l0.d.SERVES_BREAKFAST, "serves_breakfast").g(ii.l0.d.SERVES_BRUNCH, "serves_brunch").g(ii.l0.d.SERVES_DINNER, "serves_dinner").g(ii.l0.d.SERVES_LUNCH, "serves_lunch").g(ii.l0.d.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food").g(ii.l0.d.SERVES_WINE, "serves_wine").g(ii.l0.d.TAKEOUT, "takeout").g(ii.l0.d.TYPES, "types").g(ii.l0.d.USER_RATING_COUNT, "user_ratings_total").g(ii.l0.d.UTC_OFFSET, "utc_offset").g(ii.l0.d.VIEWPORT, "geometry/viewport").g(ii.l0.d.WEBSITE_URI, "website").d();

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) f32435a.get((ii.l0.d) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String b(List list) {
        StringBuilder sb5 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) f32435a.get((ii.l0.d) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb5.length() > 0) {
                    sb5.append(",");
                }
                sb5.append(str);
            }
        }
        return sb5.toString();
    }
}
