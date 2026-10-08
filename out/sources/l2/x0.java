package l2;

import l1.RoundedCornerShape;
import n3.t2;
import n3.y2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u00104\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0019\u00103R\u0017\u00106\u001a\u0002008\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b\u001b\u00103R\u0017\u00108\u001a\u0002008\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b\u001e\u00103R\u0017\u0010:\u001a\u0002008\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b \u00103R\u0017\u0010<\u001a\u0002008\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b#\u00103R\u0017\u0010>\u001a\u0002008\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b&\u00103R\u0017\u0010@\u001a\u0002008\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b)\u00103R\u0017\u0010B\u001a\u0002008\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\b.\u00103R\u0017\u0010D\u001a\u0002008\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\b1\u00103¨\u0006E"}, d2 = {"Ll2/x0;", "", "<init>", "()V", "Ll1/g;", "b", "Ll1/g;", "a", "()Ll1/g;", "CornerExtraExtraLarge", "c", "CornerExtraLarge", "d", "CornerExtraLargeIncreased", "e", "getCornerExtraLargeTop", "CornerExtraLargeTop", "f", "CornerExtraSmall", "g", "getCornerExtraSmallTop", "CornerExtraSmallTop", "h", "getCornerFull", "CornerFull", "i", "CornerLarge", "j", "getCornerLargeEnd", "CornerLargeEnd", "k", "CornerLargeIncreased", "l", "getCornerLargeStart", "CornerLargeStart", "m", "getCornerLargeTop", "CornerLargeTop", "n", "CornerMedium", "Ln3/y2;", "o", "Ln3/y2;", "getCornerNone", "()Ln3/y2;", "CornerNone", "p", "CornerSmall", "Ll1/b;", "q", "Ll1/b;", "()Ll1/b;", "CornerValueExtraExtraLarge", "r", "CornerValueExtraLarge", "s", "CornerValueExtraLargeIncreased", "t", "CornerValueExtraSmall", "u", "CornerValueLarge", "v", "CornerValueLargeIncreased", "w", "CornerValueMedium", "x", "CornerValueNone", "y", "CornerValueSmall", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraExtraLarge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraLarge;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraLargeIncreased;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraLargeTop;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraSmall;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraSmallTop;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerLarge;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerLargeEnd;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerLargeIncreased;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerLargeStart;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerLargeTop;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerMedium;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerSmall;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueExtraExtraLarge;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueExtraLarge;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueExtraLargeIncreased;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueExtraSmall;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueLarge;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueLargeIncreased;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueMedium;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueNone;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final l1.b CornerValueSmall;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f115354a = new x0();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerFull = l1.h.i();

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final y2 CornerNone = t2.a();

    static {
        float f15 = (float) 48.0d;
        CornerExtraExtraLarge = l1.h.f(c5.h.n(f15));
        float f16 = (float) 28.0d;
        CornerExtraLarge = l1.h.f(c5.h.n(f16));
        float f17 = (float) 32.0d;
        CornerExtraLargeIncreased = l1.h.f(c5.h.n(f17));
        float f18 = (float) 0.0d;
        CornerExtraLargeTop = l1.h.g(c5.h.n(f16), c5.h.n(f16), c5.h.n(f18), c5.h.n(f18));
        float f19 = (float) 4.0d;
        CornerExtraSmall = l1.h.f(c5.h.n(f19));
        CornerExtraSmallTop = l1.h.g(c5.h.n(f19), c5.h.n(f19), c5.h.n(f18), c5.h.n(f18));
        float f25 = (float) 16.0d;
        CornerLarge = l1.h.f(c5.h.n(f25));
        CornerLargeEnd = l1.h.g(c5.h.n(f18), c5.h.n(f25), c5.h.n(f25), c5.h.n(f18));
        float f26 = (float) 20.0d;
        CornerLargeIncreased = l1.h.f(c5.h.n(f26));
        CornerLargeStart = l1.h.g(c5.h.n(f25), c5.h.n(f18), c5.h.n(f18), c5.h.n(f25));
        CornerLargeTop = l1.h.g(c5.h.n(f25), c5.h.n(f25), c5.h.n(f18), c5.h.n(f18));
        float f27 = (float) 12.0d;
        CornerMedium = l1.h.f(c5.h.n(f27));
        float f28 = (float) 8.0d;
        CornerSmall = l1.h.f(c5.h.n(f28));
        CornerValueExtraExtraLarge = l1.c.c(c5.h.n(f15));
        CornerValueExtraLarge = l1.c.c(c5.h.n(f16));
        CornerValueExtraLargeIncreased = l1.c.c(c5.h.n(f17));
        CornerValueExtraSmall = l1.c.c(c5.h.n(f19));
        CornerValueLarge = l1.c.c(c5.h.n(f25));
        CornerValueLargeIncreased = l1.c.c(c5.h.n(f26));
        CornerValueMedium = l1.c.c(c5.h.n(f27));
        CornerValueNone = l1.c.c(c5.h.n(f18));
        CornerValueSmall = l1.c.c(c5.h.n(f28));
    }

    private x0() {
    }

    public final RoundedCornerShape a() {
        return CornerExtraExtraLarge;
    }

    public final RoundedCornerShape b() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape c() {
        return CornerExtraLargeIncreased;
    }

    public final RoundedCornerShape d() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape e() {
        return CornerLarge;
    }

    public final RoundedCornerShape f() {
        return CornerLargeIncreased;
    }

    public final RoundedCornerShape g() {
        return CornerMedium;
    }

    public final RoundedCornerShape h() {
        return CornerSmall;
    }

    public final l1.b i() {
        return CornerValueExtraExtraLarge;
    }

    public final l1.b j() {
        return CornerValueExtraLarge;
    }

    public final l1.b k() {
        return CornerValueExtraLargeIncreased;
    }

    public final l1.b l() {
        return CornerValueExtraSmall;
    }

    public final l1.b m() {
        return CornerValueLarge;
    }

    public final l1.b n() {
        return CornerValueLargeIncreased;
    }

    public final l1.b o() {
        return CornerValueMedium;
    }

    public final l1.b p() {
        return CornerValueNone;
    }

    public final l1.b q() {
        return CornerValueSmall;
    }
}
