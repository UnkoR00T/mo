package fs1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.w0;
import f00.d0;
import f00.f0;
import fr.q0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lfs1/f;", "sharedViewModel", "Loq/i0;", "k", "(Lfs1/f;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    public static final void k(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(361831338);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(361831338, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.shared.DeveloperSharedNavContent (DeveloperSharedNavContent.kt:21)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            oo1.p.f0.a aVar = oo1.p.f0.a.f147567b;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(fVar))) {
                z15 = true;
            }
            boolean zG = rVarH.G(sVarJ) | z15;
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: fs1.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.l(fVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, aVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fs1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.u(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final f fVar, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, oo1.p.f0.a.f147567b, null, y2.m.b(-1489330935, true, new er.r() { // from class: fs1.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.m(fVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, oo1.p.f0.b.f147568b, null, y2.m.b(-1023902784, true, new er.r() { // from class: fs1.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.p(fVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, oo1.p.f0.c.f147569b, null, y2.m.b(-1384362495, true, new er.r() { // from class: fs1.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.s(fVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final f fVar, final f00.s sVar, p114t0.f fVar2, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1489330935, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.shared.DeveloperSharedNavContent.<anonymous>.<anonymous>.<anonymous> (DeveloperSharedNavContent.kt:29)");
        }
        boolean zG = rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fs1.m
                @Override // er.l
                public final Object b(Object obj) {
                    return q.n(fVar, (gs1.m.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        gs1.m mVar = (gs1.m) q7.d.c(q0.c(gs1.m.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<gs1.c> bVarY1 = mVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fs1.n
                @Override // er.l
                public final Object b(Object obj) {
                    return q.o(sVar, (gs1.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        gs1.i.c(mVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gs1.m n(f fVar, gs1.m.a aVar) {
        return aVar.a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(f00.s sVar, gs1.c cVar) {
        if (fr.t.c(cVar, gs1.c.b.f76615a)) {
            f00.s.i(sVar, oo1.p.f0.b.f147568b, null, null, 6, null);
        } else {
            if (!fr.t.c(cVar, gs1.c.a.f76614a)) {
                throw new oq.p();
            }
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final f fVar, final f00.s sVar, p114t0.f fVar2, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1023902784, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.shared.DeveloperSharedNavContent.<anonymous>.<anonymous>.<anonymous> (DeveloperSharedNavContent.kt:45)");
        }
        boolean zG = rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fs1.k
                @Override // er.l
                public final Object b(Object obj) {
                    return q.q(fVar, (hs1.q.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        hs1.q qVar = (hs1.q) q7.d.c(q0.c(hs1.q.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<hs1.e> bVarY1 = qVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fs1.l
                @Override // er.l
                public final Object b(Object obj) {
                    return q.r(sVar, (hs1.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        hs1.l.d(qVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs1.q q(f fVar, hs1.q.a aVar) {
        return aVar.a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(f00.s sVar, hs1.e eVar) {
        if (!(eVar instanceof hs1.e.a)) {
            throw new oq.p();
        }
        f00.s.i(sVar, oo1.p.f0.c.f147569b, null, null, 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final f fVar, p114t0.f fVar2, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1384362495, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.shared.DeveloperSharedNavContent.<anonymous>.<anonymous>.<anonymous> (DeveloperSharedNavContent.kt:59)");
        }
        boolean zG = rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fs1.j
                @Override // er.l
                public final Object b(Object obj) {
                    return q.t(fVar, (is1.g.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        is1.e.c((is1.g) q7.d.c(q0.c(is1.g.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final is1.g t(f fVar, is1.g.a aVar) {
        return aVar.a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(f fVar, int i15, p076m2.r rVar, int i16) {
        k(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
