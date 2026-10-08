package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class fh implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f32297a = new fh();

    private fh() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        gh ghVar;
        if (i15 == 0) {
            ghVar = gh.UNDEFINED;
        } else if (i15 != 1) {
            ghVar = i15 != 2 ? null : gh.SEARCH_NEARBY_REQUEST;
        } else {
            ghVar = gh.SEARCH_BY_TEXT_REQUEST;
        }
        return ghVar != null;
    }
}
