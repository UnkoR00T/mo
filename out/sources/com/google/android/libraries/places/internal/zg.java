package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zg implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f34512a = new zg();

    private zg() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        ah ahVar;
        switch (i15) {
            case 0:
                ahVar = ah.CONTENT_UNDEFINED;
                break;
            case 1:
                ahVar = ah.PHOTO;
                break;
            case 2:
                ahVar = ah.ADDRESS;
                break;
            case 3:
                ahVar = ah.RATING;
                break;
            case 4:
                ahVar = ah.TYPE;
                break;
            case 5:
                ahVar = ah.PRICE;
                break;
            case 6:
                ahVar = ah.ACCESSIBILITY;
                break;
            case 7:
                ahVar = ah.OPEN_NOW_STATUS;
                break;
            default:
                ahVar = null;
                break;
        }
        return ahVar != null;
    }
}
