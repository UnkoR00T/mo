package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class xh implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f34290a = new xh();

    private xh() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        yh yhVar;
        if (i15 == 0) {
            yhVar = yh.PLACE_WIDGET_ORIENTATION_UNSPECIFIED;
        } else if (i15 != 1) {
            yhVar = i15 != 2 ? null : yh.HORIZONTAL;
        } else {
            yhVar = yh.VERTICAL;
        }
        return yhVar != null;
    }
}
