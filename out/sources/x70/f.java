package x70;

import d1.x;
import er.p;
import f3.j;
import f3.m;
import n3.o1;
import oq.i0;
import p036e4.w0;
import p046f2.C6457hh;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import w0.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lx70/a;", "loaderData", "Loq/i0;", "g", "(Lx70/a;Lm2/r;I)V", "data", "e", "widget_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    private static final void e(final a aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-2035519897);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-2035519897, i16, -1, "pl.gov.coi.common.widget.loader.DefaultLoader (Loader.kt:42)");
            }
            C6457hh.j(androidx.compose.foundation.layout.d.t(m.INSTANCE, aVar.getSize().getDimension()), k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().j(), 0.0f, 0L, 0, 0.0f, rVarH, 0, 60);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: x70.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.f(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a aVar, int i15, r rVar, int i16) {
        e(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final a aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(495154700);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(495154700, i16, -1, "pl.gov.coi.common.widget.loader.Loader (Loader.kt:18)");
            }
            long jD = o1.d(2282754839L);
            if (aVar instanceof a.C5796a) {
                rVarH.X(-897698427);
                e(aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof a.b)) {
                    rVarH.X(-897699560);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-897696247);
                m mVarD = i.d(androidx.compose.foundation.layout.d.f(m.INSTANCE, 0.0f, 1, null), jD, null, 2, null);
                Object objE = rVarH.E();
                r.Companion companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new er.a() { // from class: x70.b
                        @Override // er.a
                        public final Object a() {
                            return f.h();
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarN = androidx.compose.foundation.b.n(mVarD, false, null, null, null, (er.a) objE, 14, null);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarN);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                x xVar = x.f39368a;
                e(aVar, rVarH, i16 & 14);
                Object objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new er.a() { // from class: x70.c
                        @Override // er.a
                        public final Object a() {
                            return f.i();
                        }
                    };
                    rVarH.v(objE2);
                }
                q0.g(false, (er.a) objE2, rVarH, 48, 1);
                rVarH.x();
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: x70.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.j(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a aVar, int i15, r rVar, int i16) {
        g(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
