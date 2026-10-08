package p077m74;

import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import l74.b;
import mu.g;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: m74.o, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "navigateToActivateAppScreen", "Ll74/b;", "lockEntryPoint", "j", "(Ler/a;Ler/a;Ll74/b;Lm2/r;I)V", "applicationlock_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void j(final a<i0> aVar, final a<i0> aVar2, final b bVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1372488908);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.c(bVar.ordinal()) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(1372488908, i16, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockNavContent (ApplicationLockNavContent.kt:18)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            e eVar = e.f124157a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32) | rVarH.G(sVarJ) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: m74.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.k(aVar, aVar2, sVarJ, bVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, eVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: m74.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.s(aVar, aVar2, bVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 k(final a aVar, final a aVar2, final s sVar, final b bVar, d1 d1Var) {
        f00.r.u(d1Var, e.f124157a, null, m.b(-495983411, true, new er.r() { // from class: m74.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.l(aVar, aVar2, sVar, bVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, d.f124155a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(-1874776458, true, new er.r() { // from class: m74.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final a aVar, final a aVar2, final s sVar, final b bVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-495983411, i15, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockNavContent.<anonymous>.<anonymous>.<anonymous> (ApplicationLockNavContent.kt:25)");
        }
        f00.r.n(wVar, q0.c(z.class), m.d(-1771855749, true, new q() { // from class: m74.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.m(aVar, aVar2, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.d(-787446248, true, new q() { // from class: m74.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.o(bVar, (z) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final a aVar, final a aVar2, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1771855749, i15, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ApplicationLockNavContent.kt:32)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: m74.m
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.n(aVar, aVar2, sVar, (a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(a aVar, a aVar2, s sVar, a.b bVar) {
        if (fr.t.c(bVar, a.b.C3045a.f124133a)) {
            aVar.a();
        } else if (fr.t.c(bVar, a.b.C3046b.f124134a)) {
            aVar2.a();
        } else {
            if (!(bVar instanceof a.b.NavigateToInfoDialog)) {
                throw new oq.p();
            }
            s.l(sVar, d.f124155a, ((a.b.NavigateToInfoDialog) bVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(b bVar, z zVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-787446248, i15, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ApplicationLockNavContent.kt:28)");
        }
        zVar.u9(bVar);
        u.k(zVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1874776458, i15, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockNavContent.<anonymous>.<anonymous>.<anonymous> (ApplicationLockNavContent.kt:50)");
        }
        d dVar = d.f124155a;
        f00.r.r(wVar, dVar, sVar.g(dVar), m.d(-1682175605, true, new q() { // from class: m74.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1682175605, i15, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ApplicationLockNavContent.kt:54)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: m74.n
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(a aVar, a aVar2, b bVar, int i15, r rVar, int i16) {
        j(aVar, aVar2, bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
