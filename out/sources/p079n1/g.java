package p079n1;

import androidx.compose.foundation.layout.d;
import c5.h;
import c5.k;
import d1.r3;
import d1.x;
import er.a;
import er.l;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import k3.e;
import n3.b2;
import n3.n1;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p3.f;
import z1.SelectionColors;
import z1.SelectionHandleInfo;
import z1.a1;
import z1.c1;
import z1.g3;
import z1.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0017\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lz1/w;", "offsetProvider", "Lf3/m;", "modifier", "Lc5/k;", "minTouchTargetSize", "Loq/i0;", "g", "(Lz1/w;Lf3/m;JLm2/r;II)V", "k", "(Lf3/m;Lm2/r;II)V", "Landroidx/compose/ui/graphics/Color;", "handleColor", "m", "(Lf3/m;J)Lf3/m;", "Lc5/h;", "a", "F", "getCursorHandleHeight", "()F", "CursorHandleHeight", "b", "getCursorHandleWidth", "CursorHandleWidth", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f130034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f130035b;

    static {
        float fN = h.n(25);
        f130034a = fN;
        f130035b = h.n(h.n(fN * 2.0f) / 2.4142137f);
    }

    public static final void g(final w wVar, final m mVar, final long j15, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(1776202187);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(wVar) : rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(mVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= ((i16 & 4) == 0 && rVarH.d(j15)) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                }
            } else if ((i16 & 4) != 0) {
                j15 = k.INSTANCE.a();
                i17 &= -897;
            }
            rVarH.y();
            if (t.k()) {
                t.o(1776202187, i17, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
            }
            int i18 = i17 & 14;
            boolean z15 = i18 == 4 || ((i17 & 8) != 0 && rVarH.G(wVar));
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: n1.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.h(wVar, (i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            final m mVarD = v.d(mVar, false, (l) objE, 1, null);
            z1.l.l(wVar, c.INSTANCE.m(), y2.m.d(-1653527038, true, new p() { // from class: n1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(j15, mVarD, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, i18 | 432);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        final long j16 = j15;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.j(wVar, mVar, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(w wVar, i0 i0Var) {
        i0Var.e(c1.d(), new SelectionHandleInfo(q2.Cursor, wVar.a(), a1.Middle, true, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(long j15, m mVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1653527038, i15, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
            }
            if (j15 != 9205357640488583168L) {
                rVar.X(-1244013944);
                m mVarR = d.r(mVar, k.j(j15), k.i(j15), 0.0f, 0.0f, 12, null);
                w0 w0VarI = d1.r.i(c.INSTANCE.m(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                e0 e0VarT = rVar.t();
                m mVarE = j.e(rVar, mVarR);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                a<androidx.compose.ui.node.c> aVarB = companion.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB);
                } else {
                    rVar.u();
                }
                r rVarC = n6.c(rVar);
                n6.i(rVarC, w0VarI, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                x xVar = x.f39368a;
                k(null, rVar, 0, 1);
                rVar.x();
                rVar.R();
            } else {
                rVar.X(-1243644858);
                k(mVar, rVar, 0, 0);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(w wVar, m mVar, long j15, int i15, int i16, r rVar, int i17) {
        g(wVar, mVar, j15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void k(final m mVar, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(694251107);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if (rVarH.r((i17 & 3) != 2, i17 & 1)) {
            if (i18 != 0) {
                mVar = m.INSTANCE;
            }
            if (t.k()) {
                t.o(694251107, i17, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            r3.a(m(d.v(mVar, f130035b, f130034a), ((SelectionColors) rVarH.N(g3.c())).getSelectionHandleColor()), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.l(mVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(m mVar, int i15, int i16, r rVar, int i17) {
        k(mVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final m m(m mVar, final long j15) {
        return k3.k.c(mVar, new l() { // from class: n1.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.n(j15, (k3.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l n(long j15, e eVar) {
        final float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.a() >> 32)) / 2.0f;
        final b2 b2VarW = z1.l.w(eVar, fIntBitsToFloat);
        final n1 n1VarB = n1.Companion.b(n1.INSTANCE, j15, 0, 2, null);
        return eVar.e(new l() { // from class: n1.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.o(fIntBitsToFloat, b2VarW, n1VarB, (p3.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(float f15, b2 b2Var, n1 n1Var, p3.c cVar) {
        cVar.H2();
        p3.d drawContext = cVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            p3.h transform = drawContext.getTransform();
            p3.h.f(transform, f15, 0.0f, 2, null);
            transform.i(45.0f, m3.e.INSTANCE.c());
            f.V0(cVar, b2Var, 0L, 0.0f, null, n1Var, 0, 46, null);
            return oq.i0.f148189a;
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }
}
