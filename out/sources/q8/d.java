package q8;

import w7.c0;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f165264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f165265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f165266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f165267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f165268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f165269g;

    private d(int i15, int i16, int i17, int i18, int i19, int i25, int i26) {
        this.f165263a = i15;
        this.f165264b = i16;
        this.f165265c = i17;
        this.f165266d = i18;
        this.f165267e = i19;
        this.f165268f = i25;
        this.f165269g = i26;
    }

    public static d c(c0 c0Var) {
        int iD = c0Var.D();
        c0Var.g0(12);
        int iD2 = c0Var.D();
        int iD3 = c0Var.D();
        int iD4 = c0Var.D();
        c0Var.g0(4);
        int iD5 = c0Var.D();
        int iD6 = c0Var.D();
        c0Var.g0(4);
        return new d(iD, iD2, iD3, iD4, iD5, iD6, c0Var.D());
    }

    public long a() {
        return o0.U0(this.f165267e, ((long) this.f165265c) * 1000000, this.f165266d);
    }

    public int b() {
        int i15 = this.f165263a;
        if (i15 == 1935960438) {
            return 2;
        }
        if (i15 == 1935963489) {
            return 1;
        }
        if (i15 == 1937012852) {
            return 3;
        }
        t.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f165263a));
        return -1;
    }

    @Override // q8.a
    public int getType() {
        return 1752331379;
    }
}
