package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class dh implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f32036a = new dh();

    private dh() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        eh ehVar;
        if (i15 == 0) {
            ehVar = eh.ORIENTATION_UNDEFINED;
        } else if (i15 != 1) {
            ehVar = i15 != 2 ? null : eh.ORIENTATION_HORIZONTAL;
        } else {
            ehVar = eh.ORIENTATION_VERTICAL;
        }
        return ehVar != null;
    }
}
