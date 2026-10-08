package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class mo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nr0 f32971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lo0 f32975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ po0 f32977g;

    mo0(po0 po0Var, int i15, int i16, lo0 lo0Var) {
        Objects.requireNonNull(po0Var);
        this.f32977g = po0Var;
        this.f32971a = new nr0();
        this.f32976f = false;
        this.f32972b = i15;
        this.f32973c = i16;
        this.f32975e = lo0Var;
    }

    final int a() {
        return this.f32973c;
    }

    final void b(int i15) {
        this.f32974d += i15;
    }

    final int c() {
        return this.f32974d;
    }

    final int d() {
        return Math.max(0, Math.min(this.f32973c, (int) this.f32971a.K())) - this.f32974d;
    }

    final void e() {
        this.f32974d = 0;
    }

    final int f(int i15) {
        if (i15 <= 0 || Integer.MAX_VALUE - i15 >= this.f32973c) {
            int i16 = this.f32973c + i15;
            this.f32973c = i16;
            return i16;
        }
        int i17 = this.f32972b;
        StringBuilder sb5 = new StringBuilder(String.valueOf(i17).length() + 33);
        sb5.append("Window size overflow for stream: ");
        sb5.append(i17);
        throw new IllegalArgumentException(sb5.toString());
    }

    final int g() {
        return Math.min(this.f32973c, this.f32977g.h().f32973c);
    }

    final boolean h() {
        return this.f32971a.K() > 0;
    }

    final int i(int i15, oo0 oo0Var) {
        int iMin = Math.min(i15, g());
        int iK = 0;
        while (h() && iMin > 0) {
            nr0 nr0Var = this.f32971a;
            if (iMin >= nr0Var.K()) {
                iK += (int) nr0Var.K();
                j(nr0Var, (int) nr0Var.K(), this.f32976f);
            } else {
                iK += iMin;
                j(nr0Var, iMin, false);
            }
            oo0Var.f33226a++;
            iMin = Math.min(i15 - iK, g());
        }
        return iK;
    }

    final void j(nr0 nr0Var, int i15, boolean z15) {
        do {
            po0 po0Var = this.f32977g;
            int iMin = Math.min(i15, po0Var.g().i());
            int i16 = -iMin;
            po0Var.h().f(i16);
            f(i16);
            try {
                boolean z16 = false;
                if (nr0Var.K() == iMin && z15) {
                    z16 = true;
                }
                po0Var.g().V3(z16, this.f32972b, nr0Var, iMin);
                this.f32975e.b(iMin);
                i15 -= iMin;
            } catch (IOException e15) {
                throw new RuntimeException(e15);
            }
        } while (i15 > 0);
    }

    final void k(nr0 nr0Var, int i15, boolean z15) {
        this.f32971a.q1(nr0Var, i15);
        this.f32976f |= z15;
    }
}
