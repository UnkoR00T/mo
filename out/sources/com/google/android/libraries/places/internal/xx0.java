package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum xx0 {
    ROUTING_SUMMARIES,
    NEXT_PAGE_TOKEN,
    SEARCH_URI;

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "routing_summaries";
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? super.toString() : "searchUri";
        }
        return "nextPageToken";
    }
}
