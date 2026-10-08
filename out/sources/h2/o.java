package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\" \u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0002\u0012\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0014\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lc5/h;", "a", "F", "getHorizontalSemanticsBoundsPadding", "()F", "getHorizontalSemanticsBoundsPadding$annotations", "()V", "HorizontalSemanticsBoundsPadding", "b", "getVerticalSemanticsBoundsPadding", "getVerticalSemanticsBoundsPadding$annotations", "VerticalSemanticsBoundsPadding", "Lf3/m;", "c", "Lf3/m;", "m", "()Lf3/m;", "IncreaseHorizontalSemanticsBounds", "d", "n", "IncreaseVerticalSemanticsBounds", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f79924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f79925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f3.m f79926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f3.m f79927d;

    static {
        float f15 = 10;
        float fN = c5.h.n(f15);
        f79924a = fN;
        float fN2 = c5.h.n(f15);
        f79925b = fN2;
        f3.m.Companion companion = f3.m.INSTANCE;
        f79926c = d1.a3.p(n4.v.c(p036e4.m0.a(companion, new er.q() { // from class: h2.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return o.g((p036e4.y0) obj, (p036e4.v0) obj2, (c5.b) obj3);
            }
        }), true, new er.l() { // from class: h2.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.i((n4.i0) obj);
            }
        }), fN, 0.0f, 2, null);
        f79927d = d1.a3.p(n4.v.c(p036e4.m0.a(companion, new er.q() { // from class: h2.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return o.j((p036e4.y0) obj, (p036e4.v0) obj2, (c5.b) obj3);
            }
        }), true, new er.l() { // from class: h2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.l((n4.i0) obj);
            }
        }), 0.0f, fN2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.x0 g(p036e4.y0 y0Var, p036e4.v0 v0Var, c5.b bVar) {
        final int iX0 = y0Var.X0(f79924a);
        long value = bVar.getValue();
        int i15 = iX0 * 2;
        final p036e4.a2 a2VarO0 = v0Var.o0(c5.c.i(value, i15, 0));
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth() - i15, a2VarO0.getHeight(), null, new er.l() { // from class: h2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.h(a2VarO0, iX0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(p036e4.a2 a2Var, int i15, e4.a2.a aVar) {
        e4.a2.a.E(aVar, a2Var, -i15, 0, 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(n4.i0 i0Var) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.x0 j(p036e4.y0 y0Var, p036e4.v0 v0Var, c5.b bVar) {
        final int iX0 = y0Var.X0(f79925b);
        long value = bVar.getValue();
        int i15 = iX0 * 2;
        final p036e4.a2 a2VarO0 = v0Var.o0(c5.c.i(value, 0, i15));
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight() - i15, null, new er.l() { // from class: h2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.k(a2VarO0, iX0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(p036e4.a2 a2Var, int i15, e4.a2.a aVar) {
        e4.a2.a.E(aVar, a2Var, 0, -i15, 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(n4.i0 i0Var) {
        return oq.i0.f148189a;
    }

    public static final f3.m m() {
        return f79926c;
    }

    public static final f3.m n() {
        return f79927d;
    }
}
