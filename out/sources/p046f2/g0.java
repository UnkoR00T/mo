package p046f2;

import c5.b;
import c5.h;
import er.l;
import er.q;
import f3.m;
import oq.i0;
import p036e4.a2;
import p036e4.k2;
import p036e4.m0;
import p036e4.r;
import p036e4.v0;
import p036e4.x0;
import p036e4.x2;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u001a\u0010\u0010\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lf3/m;", "d", "(Lf3/m;)Lf3/m;", "Lc5/h;", "a", "F", "getBadgeWithContentHorizontalPadding", "()F", "BadgeWithContentHorizontalPadding", "b", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalOffset", "c", "getBadgeWithContentVerticalOffset", "BadgeWithContentVerticalOffset", "getBadgeOffset", "BadgeOffset", "Le4/r;", "e", "Le4/r;", "getBadgeTopRuler", "()Le4/r;", "BadgeTopRuler", "Le4/x2;", "f", "Le4/x2;", "getBadgeEndRuler", "()Le4/x2;", "BadgeEndRuler", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f55890a = h.n(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f55891b = h.n(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f55892c = h.n(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f55893d = h.n(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r f55894e = new r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x2 f55895f = new x2();

    public static final m d(m mVar) {
        return m0.a(mVar, new q() { // from class: f2.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g0.e((y0) obj, (v0) obj2, (b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 e(y0 y0Var, v0 v0Var, b bVar) {
        final a2 a2VarO0 = v0Var.o0(bVar.getValue());
        return y0.b1(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new l() { // from class: f2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.f((k2) obj);
            }
        }, new l() { // from class: f2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.g(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(k2 k2Var) {
        k2Var.g2(f55895f, (int) (k2Var.m().b() >> 32));
        k2Var.g2(f55894e, 0.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(a2 a2Var, a2.a aVar) {
        a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }
}
