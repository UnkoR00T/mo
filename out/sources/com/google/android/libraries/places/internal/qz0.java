package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class qz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ak.p0 f33471a = ak.p0.a().g(ii.l0.d.ACCESSIBILITY_OPTIONS, "accessibilityOptions").g(ii.l0.d.ADDRESS_COMPONENTS, "addressComponents").g(ii.l0.d.ADDRESS_DESCRIPTOR, "addressDescriptor").g(ii.l0.d.ADR_FORMAT_ADDRESS, "adrFormatAddress").g(ii.l0.d.ALLOWS_DOGS, "allowsDogs").g(ii.l0.d.BUSINESS_STATUS, "businessStatus").g(ii.l0.d.CONSUMER_ALERT, "consumerAlert").g(ii.l0.d.CONTAINING_PLACES, "containingPlaces").g(ii.l0.d.CURBSIDE_PICKUP, "curbsidePickup").g(ii.l0.d.CURRENT_OPENING_HOURS, "currentOpeningHours").g(ii.l0.d.CURRENT_SECONDARY_OPENING_HOURS, "currentSecondaryOpeningHours").g(ii.l0.d.DELIVERY, "delivery").g(ii.l0.d.DINE_IN, "dineIn").g(ii.l0.d.DISPLAY_NAME, "displayName").g(ii.l0.d.EDITORIAL_SUMMARY, "editorialSummary").g(ii.l0.d.EV_CHARGE_AMENITY_SUMMARY, "evChargeAmenitySummary").g(ii.l0.d.EV_CHARGE_OPTIONS, "evChargeOptions").g(ii.l0.d.FORMATTED_ADDRESS, "formattedAddress").g(ii.l0.d.FUEL_OPTIONS, "fuelOptions").g(ii.l0.d.GENERATIVE_SUMMARY, "generativeSummary").g(ii.l0.d.GOOD_FOR_CHILDREN, "goodForChildren").g(ii.l0.d.GOOD_FOR_GROUPS, "goodForGroups").g(ii.l0.d.GOOD_FOR_WATCHING_SPORTS, "goodForWatchingSports").g(ii.l0.d.GOOGLE_MAPS_LINKS, "googleMapsLinks").g(ii.l0.d.GOOGLE_MAPS_URI, "googleMapsUri").g(ii.l0.d.ICON_BACKGROUND_COLOR, "iconBackgroundColor").g(ii.l0.d.ICON_MASK_URL, "iconMaskBaseUri").g(ii.l0.d.ID, "id").g(ii.l0.d.INTERNATIONAL_PHONE_NUMBER, "internationalPhoneNumber").g(ii.l0.d.LIVE_MUSIC, "liveMusic").g(ii.l0.d.LOCATION, "location").g(ii.l0.d.MENU_FOR_CHILDREN, "menuForChildren").g(ii.l0.d.NATIONAL_PHONE_NUMBER, "nationalPhoneNumber").g(ii.l0.d.NEIGHBORHOOD_SUMMARY, "neighborhoodSummary").g(ii.l0.d.OPENING_HOURS, "regularOpeningHours").g(ii.l0.d.OUTDOOR_SEATING, "outdoorSeating").g(ii.l0.d.PARKING_OPTIONS, "parkingOptions").g(ii.l0.d.PAYMENT_OPTIONS, "paymentOptions").g(ii.l0.d.PHOTO_METADATAS, "photos").g(ii.l0.d.PLUS_CODE, "plusCode").g(ii.l0.d.POSTAL_ADDRESS, "postalAddress").g(ii.l0.d.PRICE_LEVEL, "priceLevel").g(ii.l0.d.PRICE_RANGE, "priceRange").g(ii.l0.d.PRIMARY_TYPE, "primaryType").g(ii.l0.d.PRIMARY_TYPE_DISPLAY_NAME, "primaryTypeDisplayName").g(ii.l0.d.PURE_SERVICE_AREA_BUSINESS, "pureServiceAreaBusiness").g(ii.l0.d.RATING, "rating").g(ii.l0.d.RESERVABLE, "reservable").g(ii.l0.d.RESOURCE_NAME, "name").g(ii.l0.d.RESTROOM, "restroom").g(ii.l0.d.REVIEWS, "reviews").g(ii.l0.d.REVIEW_SUMMARY, "reviewSummary").g(ii.l0.d.SECONDARY_OPENING_HOURS, "regularSecondaryOpeningHours").g(ii.l0.d.SERVES_BEER, "servesBeer").g(ii.l0.d.SERVES_BREAKFAST, "servesBreakfast").g(ii.l0.d.SERVES_BRUNCH, "servesBrunch").g(ii.l0.d.SERVES_COCKTAILS, "servesCocktails").g(ii.l0.d.SERVES_COFFEE, "servesCoffee").g(ii.l0.d.SERVES_DESSERT, "servesDessert").g(ii.l0.d.SERVES_DINNER, "servesDinner").g(ii.l0.d.SERVES_LUNCH, "servesLunch").g(ii.l0.d.SERVES_VEGETARIAN_FOOD, "servesVegetarianFood").g(ii.l0.d.SERVES_WINE, "servesWine").g(ii.l0.d.SHORT_FORMATTED_ADDRESS, "shortFormattedAddress").g(ii.l0.d.SUB_DESTINATIONS, "subDestinations").g(ii.l0.d.TAKEOUT, "takeout").g(ii.l0.d.TIME_ZONE, "timeZone").g(ii.l0.d.TYPES, "types").g(ii.l0.d.USER_RATING_COUNT, "userRatingCount").g(ii.l0.d.UTC_OFFSET, "utcOffsetMinutes").g(ii.l0.d.VIEWPORT, "viewport").g(ii.l0.d.WEBSITE_URI, "websiteUri").d();

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) f33471a.get((ii.l0.d) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
