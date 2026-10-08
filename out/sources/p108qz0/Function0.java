package p108qz0;

import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: qz0.m, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "f", "(Ler/a;Lm2/r;I)V", "appearance_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void f(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1314127821);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1314127821, i16, -1, "pl.gov.coi.mobywatel.feature.appearance.presentation.AppearanceNavContent (AppearanceNavContent.kt:12)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            g gVar = g.f169619a;
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: qz0.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.g(aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, gVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: qz0.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final a aVar, d1 d1Var) {
        f00.r.u(d1Var, g.f169619a, null, m.b(-1693311188, true, new er.r() { // from class: qz0.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h(aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1693311188, i15, -1, "pl.gov.coi.mobywatel.feature.appearance.presentation.AppearanceNavContent.<anonymous>.<anonymous>.<anonymous> (AppearanceNavContent.kt:19)");
        }
        f00.r.n(wVar, q0.c(u.class), m.d(163190462, true, new q() { // from class: qz0.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.i(aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c0.f169606a.b(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(163190462, i15, -1, "pl.gov.coi.mobywatel.feature.appearance.presentation.AppearanceNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppearanceNavContent.kt:22)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qz0.l
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j(aVar, (c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a aVar, c cVar) {
        if (!fr.t.c(cVar, c.a.f169605a)) {
            throw new oq.p();
        }
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(a aVar, int i15, r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
