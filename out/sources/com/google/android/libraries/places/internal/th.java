package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class th implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f33790a = new th();

    private th() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        uh uhVar;
        if (i15 == 0) {
            uhVar = uh.POSITION_UNDEFINED;
        } else if (i15 != 1) {
            uhVar = i15 != 2 ? null : uh.POSITION_BOTTOM;
        } else {
            uhVar = uh.POSITION_TOP;
        }
        return uhVar != null;
    }
}
