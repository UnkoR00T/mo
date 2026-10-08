package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class xg implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f34288a = new xg();

    private xg() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        yg ygVar;
        if (i15 == 0) {
            ygVar = yg.SIZE_UNDEFINED;
        } else if (i15 == 1) {
            ygVar = yg.SMALL;
        } else if (i15 != 2) {
            ygVar = i15 != 3 ? null : yg.LARGE;
        } else {
            ygVar = yg.MEDIUM;
        }
        return ygVar != null;
    }
}
