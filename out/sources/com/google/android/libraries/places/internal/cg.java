package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class cg implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f31871a = new cg();

    private cg() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        dg dgVar;
        switch (i15) {
            case 0:
                dgVar = dg.CONTENT_UNDEFINED;
                break;
            case 1:
                dgVar = dg.PHOTO;
                break;
            case 2:
                dgVar = dg.ADDRESS;
                break;
            case 3:
                dgVar = dg.RATING;
                break;
            case 4:
                dgVar = dg.TYPE;
                break;
            case 5:
                dgVar = dg.PRICE;
                break;
            case 6:
                dgVar = dg.ACCESSIBILITY;
                break;
            case 7:
                dgVar = dg.MAPS_LINK;
                break;
            case 8:
                dgVar = dg.DIRECTIONS_LINK;
                break;
            case 9:
                dgVar = dg.OPEN_NOW_STATUS;
                break;
            case 10:
                dgVar = dg.SUMMARY;
                break;
            case 11:
                dgVar = dg.OPENING_HOURS;
                break;
            case 12:
                dgVar = dg.WEBSITE;
                break;
            case 13:
                dgVar = dg.PHONE_NUMBER;
                break;
            case 14:
                dgVar = dg.TYPE_SPECIFIC_HIGHLIGHTS;
                break;
            case 15:
                dgVar = dg.REVIEWS;
                break;
            case 16:
                dgVar = dg.PLUS_CODE;
                break;
            case 17:
                dgVar = dg.FEATURES;
                break;
            case 18:
                dgVar = dg.GENERATIVE_SUMMARY;
                break;
            default:
                dgVar = null;
                break;
        }
        return dgVar != null;
    }
}
