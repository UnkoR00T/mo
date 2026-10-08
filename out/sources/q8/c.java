package q8;

import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f165260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f165261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f165262d;

    private c(int i15, int i16, int i17, int i18) {
        this.f165259a = i15;
        this.f165260b = i16;
        this.f165261c = i17;
        this.f165262d = i18;
    }

    public static c b(c0 c0Var) {
        int iD = c0Var.D();
        c0Var.g0(8);
        int iD2 = c0Var.D();
        int iD3 = c0Var.D();
        c0Var.g0(4);
        int iD4 = c0Var.D();
        c0Var.g0(12);
        return new c(iD, iD2, iD3, iD4);
    }

    public boolean a() {
        return (this.f165260b & 16) == 16;
    }

    @Override // q8.a
    public int getType() {
        return 1751742049;
    }
}
