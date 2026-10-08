package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public enum c5 implements i1 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j1<c5> f29284g = new j1<c5>() { // from class: com.google.android.gms.internal.clearcut.g5
        @Override // com.google.android.gms.internal.clearcut.j1
        public final /* synthetic */ i1 p(int i15) {
            return c5.b(i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29286a;

    c5(int i15) {
        this.f29286a = i15;
    }

    public static c5 b(int i15) {
        if (i15 == 0) {
            return DEFAULT;
        }
        if (i15 == 1) {
            return UNMETERED_ONLY;
        }
        if (i15 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i15 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i15 != 4) {
            return null;
        }
        return NEVER;
    }

    @Override // com.google.android.gms.internal.clearcut.i1
    public final int a() {
        return this.f29286a;
    }
}
