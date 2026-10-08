package dj;

import android.content.Context;
import android.graphics.Color;
import ij.b;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import x5.c;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42882f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f42887e;

    public a(Context context) {
        this(b.b(context, ri.b.f173916k, false), bj.a.b(context, ri.b.f173915j, 0), bj.a.b(context, ri.b.f173914i, 0), bj.a.b(context, ri.b.f173912g, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i15) {
        return c.k(i15, GF2Field.MASK) == this.f42886d;
    }

    public float a(float f15) {
        float f16 = this.f42887e;
        if (f16 <= 0.0f || f15 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f15 / f16)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i15, float f15) {
        int i16;
        float fA = a(f15);
        int iAlpha = Color.alpha(i15);
        int iJ = bj.a.j(c.k(i15, GF2Field.MASK), this.f42884b, fA);
        if (fA > 0.0f && (i16 = this.f42885c) != 0) {
            iJ = bj.a.i(iJ, c.k(i16, f42882f));
        }
        return c.k(iJ, iAlpha);
    }

    public int c(int i15, float f15) {
        return (this.f42883a && e(i15)) ? b(i15, f15) : i15;
    }

    public boolean d() {
        return this.f42883a;
    }

    public a(boolean z15, int i15, int i16, int i17, float f15) {
        this.f42883a = z15;
        this.f42884b = i15;
        this.f42885c = i16;
        this.f42886d = i17;
        this.f42887e = f15;
    }
}
