package n50;

import d1.m3;
import d1.q3;
import d1.r3;
import mx.Label;
import p046f2.n1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ln50/k0;", "data", "Loq/i0;", "k", "(Ln50/k0;Lm2/r;I)V", "Ln50/k0$a;", "m", "(Ln50/k0$a;Lm2/r;I)V", "Ln50/k0$f;", "r", "(Ln50/k0$f;Lm2/r;I)V", "Ln50/k0$d;", "p", "(Ln50/k0$d;Lm2/r;I)V", "Ln50/k0$e;", "q", "(Ln50/k0$e;Lm2/r;I)V", "Ln50/k0$c;", "o", "(Ln50/k0$c;Lm2/r;I)V", "Ln50/k0$b;", "n", "(Ln50/k0$b;Lm2/r;I)V", "Lc5/h;", "a", "F", "STATUS_BADGE_SIZE", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f132124a = c5.h.n(10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(k0.b bVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1401665780, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge.<anonymous> (SingleCardStatusBadge.kt:182)");
            }
            d1.i.f fVarE = d1.i.f39152a.e();
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarB = m3.b(fVarE, interfaceC1317cI, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            d1.r.b(w0.i.c(androidx.compose.foundation.layout.d.t(companion, aVar.b(rVar, i16).getSpacing100()), bVar.b().B(rVar, 0).m20unboximpl(), l1.h.i()), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            j70.h.g(null, null, bVar.getText(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, aVar.f(rVar, i16).f(), null, null, false, false, null, rVar, 0, 1572864, 0, 32964571);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public static final void k(final k0 k0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-121044538);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(k0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-121044538, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardStatusBadge (SingleCardStatusBadge.kt:32)");
            }
            if (k0Var instanceof k0.a) {
                rVarH.X(-359680130);
                m((k0.a) k0Var, rVarH, i16 & 14);
                rVarH.R();
            } else if (k0Var instanceof k0.f) {
                rVarH.X(-359677826);
                r((k0.f) k0Var, rVarH, i16 & 14);
                rVarH.R();
            } else if (k0Var instanceof k0.d) {
                rVarH.X(-359675586);
                p((k0.d) k0Var, rVarH, i16 & 14);
                rVarH.R();
            } else if (k0Var instanceof k0.e) {
                rVarH.X(-359673058);
                q((k0.e) k0Var, rVarH, i16 & 14);
                rVarH.R();
            } else if (k0Var instanceof k0.c) {
                rVarH.X(-359670562);
                o((k0.c) k0Var, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(k0Var instanceof k0.b)) {
                    rVarH.X(-359681555);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-359668322);
                n((k0.b) k0Var, rVarH, i16 & 14);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.l0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.l(k0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(k0 k0Var, int i15, p076m2.r rVar, int i16) {
        k(k0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final k0.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-623306532);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-623306532, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge (SingleCardStatusBadge.kt:44)");
            }
            d1.i.f fVarE = d1.i.f39152a.e();
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarB = m3.b(fVarE, interfaceC1317cI, rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            d1.r.b(w0.i.c(androidx.compose.foundation.layout.d.t(companion, f132124a), aVar.b().B(rVarH, 0).m20unboximpl(), l1.h.i()), rVarH, 0);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, aVar.getText(), null, null, aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, aVar2.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 1572864, 0, 32964571);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.u0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.s(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void n(final k0.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(389182383);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(389182383, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge (SingleCardStatusBadge.kt:170)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            androidx.compose.material3.l.g(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), l1.h.b(50), aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), 0L, 0.0f, aVar.c(rVarH, i17).getLevel0(), w0.x.a(n1.f56965a.j(rVarH, n1.Q).getWidth(), aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a()), y2.m.d(1401665780, true, new er.p() { // from class: n50.s0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.A(bVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 12582912, 24);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.t0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.t(bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void o(final k0.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-707155707);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-707155707, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge (SingleCardStatusBadge.kt:132)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            androidx.compose.material3.l.g(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing400()), l1.h.b(50), cVar.b().B(rVarH, 0).m20unboximpl(), 0L, 0.0f, aVar.c(rVarH, i17).getLevel0(), w0.x.a(n1.f56965a.j(rVarH, n1.Q).getWidth(), cVar.d().B(rVarH, 0).m20unboximpl()), y2.m.d(294639946, true, new er.p() { // from class: n50.n0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.y(cVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 12582912, 24);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.o0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.z(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void p(final k0.d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1893342172);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1893342172, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge (SingleCardStatusBadge.kt:87)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            d40.h.f(null, dVar.b(), false, rVarH, 0, 5);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, dVar.getText(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, aVar.f(rVarH, i17).f(), null, null, false, false, null, rVar2, 0, 1572864, 0, 32964571);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.r0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.v(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void q(final k0.e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(584414815);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(584414815, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge (SingleCardStatusBadge.kt:101)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            androidx.compose.material3.l.g(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing400()), l1.h.b(50), aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), 0L, 0.0f, aVar.c(rVarH, i17).getLevel0(), w0.x.a(n1.f56965a.j(rVarH, n1.Q).getWidth(), aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a()), y2.m.d(1575308986, true, new er.p() { // from class: n50.p0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.w(eVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 12582912, 24);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.q0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.x(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void r(final k0.f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        long jB;
        TextStyle textStyleD;
        p076m2.r rVarH = rVar.h(1438065029);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1438065029, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge (SingleCardStatusBadge.kt:68)");
            }
            f3.m mVarG = androidx.compose.foundation.layout.d.G(androidx.compose.foundation.layout.d.C(f3.m.INSTANCE, null, false, 3, null), null, false, 3, null);
            Label text = fVar.getText();
            boolean z15 = fVar instanceof k0.f.Error;
            if (z15) {
                rVarH.X(-998966831);
                jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else {
                if (!(fVar instanceof k0.f.Normal)) {
                    rVarH.X(-998969617);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-998963857);
                jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVarH.R();
            }
            long j15 = jB;
            if (z15) {
                rVarH.X(-998960043);
                textStyleD = k70.a.f108864a.f(rVarH, k70.a.f108865b).c();
                rVarH.R();
            } else {
                if (!(fVar instanceof k0.f.Normal)) {
                    rVarH.X(-998962702);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-998957066);
                textStyleD = k70.a.f108864a.f(rVarH, k70.a.f108865b).d();
                rVarH.R();
            }
            j70.h.g(mVarG, null, text, null, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, textStyleD, null, null, false, false, null, rVarH, 6, 1572864, 0, 32964570);
            rVar2 = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.m0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.u(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(k0.a aVar, int i15, p076m2.r rVar, int i16) {
        m(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(k0.b bVar, int i15, p076m2.r rVar, int i16) {
        n(bVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(k0.f fVar, int i15, p076m2.r rVar, int i16) {
        r(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(k0.d dVar, int i15, p076m2.r rVar, int i16) {
        p(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(k0.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1575308986, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge.<anonymous> (SingleCardStatusBadge.kt:113)");
            }
            d1.i.f fVarE = d1.i.f39152a.e();
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarB = m3.b(fVarE, interfaceC1317cI, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            d40.h.f(null, eVar.b(), false, rVar, 0, 5);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            j70.h.g(null, null, eVar.getText(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, aVar.f(rVar, i16).f(), null, null, false, false, null, rVar, 0, 1572864, 0, 32964571);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(k0.e eVar, int i15, p076m2.r rVar, int i16) {
        q(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(k0.c cVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(294639946, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.StatusBadge.<anonymous> (SingleCardStatusBadge.kt:144)");
            }
            d1.i.f fVarE = d1.i.f39152a.e();
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarB = m3.b(fVarE, interfaceC1317cI, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            d1.r.b(w0.i.c(androidx.compose.foundation.layout.d.t(companion, f132124a), cVar.c().B(rVar, 0).m20unboximpl(), l1.h.i()), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            j70.h.g(null, null, cVar.getText(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, aVar.f(rVar, i16).f(), null, null, false, false, null, rVar, 0, 1572864, 0, 32964571);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(k0.c cVar, int i15, p076m2.r rVar, int i16) {
        o(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
