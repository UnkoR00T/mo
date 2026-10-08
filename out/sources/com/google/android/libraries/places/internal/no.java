package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class no {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33082d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33083e;

    private no(int i15, int i16, int i17, int i18) {
        this.f33079a = i15;
        this.f33083e = i16;
        this.f33080b = i17;
        this.f33081c = i18;
    }

    static no b(int i15) {
        return new no(i15, 1, 0, 0);
    }

    final void a() {
        this.f33082d = true;
    }

    final no c() {
        int i15 = this.f33083e;
        zj.p.x(!(i15 == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i15 == 3) {
            return new no(this.f33079a, 4, this.f33080b, this.f33081c);
        }
        if (i15 == 1 && this.f33082d) {
            int i16 = this.f33079a;
            int i17 = this.f33080b;
            return new no(i16, 2, i17, i17);
        }
        int i18 = this.f33080b;
        int i19 = i18 + 1;
        int i25 = this.f33079a;
        int i26 = i19 >= i25 ? 3 : 1;
        int i27 = this.f33081c;
        if (i19 < i25) {
            i18 = i19;
        }
        return new no(i25, i26, i18, i27);
    }

    final /* synthetic */ int d() {
        return this.f33079a;
    }

    final /* synthetic */ int e() {
        return this.f33080b;
    }

    final /* synthetic */ int f() {
        return this.f33081c;
    }

    final /* synthetic */ int g() {
        return this.f33083e;
    }
}
