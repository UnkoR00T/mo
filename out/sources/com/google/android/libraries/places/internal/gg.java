package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class gg implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f32386a = new gg();

    private gg() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        hg hgVar;
        if (i15 == 0) {
            hgVar = hg.VARIANT_UNDEFINED;
        } else if (i15 == 1) {
            hgVar = hg.VARIANT_COMPACT;
        } else if (i15 == 2) {
            hgVar = hg.VARIANT_FULL;
        } else if (i15 != 3) {
            hgVar = i15 != 4 ? null : hg.VARIANT_FULL_ADVANCED;
        } else {
            hgVar = hg.VARIANT_COMPACT_ADVANCED;
        }
        return hgVar != null;
    }
}
