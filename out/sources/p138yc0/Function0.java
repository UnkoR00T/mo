package p138yc0;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import bd0.g;
import bd0.n;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.b;
import q7.d;
import y2.m;

/* JADX INFO: renamed from: yc0.k, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "goToActivation", "goToLogin", "h", "(Ler/a;Ler/a;Lm2/r;I)V", "loginlock_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void h(final a<i0> aVar, final a<i0> aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-520748613);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-520748613, i16, -1, "pl.gov.coi.mjunior.feature.loginlock.presentation.LoginLockNavContent (LoginLockNavContent.kt:19)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            b bVar = b.f226306a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: yc0.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.i(aVar, aVar2, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, bVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: yc0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.o(aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final a aVar, final a aVar2, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, b.f226306a, null, m.b(1666164156, true, new er.r() { // from class: yc0.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.j(aVar, aVar2, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, a.f226304a, new g0.Dialog(null, 1, null), m.b(-106310811, true, new er.r() { // from class: yc0.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.l(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final a aVar, final a aVar2, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1666164156, i15, -1, "pl.gov.coi.mjunior.feature.loginlock.presentation.LoginLockNavContent.<anonymous>.<anonymous>.<anonymous> (LoginLockNavContent.kt:26)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        n nVar = (n) d.c(q0.c(n.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<g.b> bVarY1 = nVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: yc0.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.k(aVar, aVar2, sVar, (g.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        bd0.f.f(nVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(a aVar, a aVar2, s sVar, g.b bVar) {
        if (fr.t.c(bVar, g.b.C0458b.f18238a)) {
            aVar.a();
        } else if (fr.t.c(bVar, g.b.c.f18239a)) {
            aVar2.a();
        } else {
            if (!(bVar instanceof g.b.ShowDialog)) {
                throw new oq.p();
            }
            s.l(sVar, a.f226304a, ((g.b.ShowDialog) bVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-106310811, i15, -1, "pl.gov.coi.mjunior.feature.loginlock.presentation.LoginLockNavContent.<anonymous>.<anonymous>.<anonymous> (LoginLockNavContent.kt:44)");
        }
        a aVar = a.f226304a;
        f00.r.r(wVar, aVar, sVar.g(aVar), m.d(938361466, true, new q() { // from class: yc0.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.m(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(938361466, i15, -1, "pl.gov.coi.mjunior.feature.loginlock.presentation.LoginLockNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginLockNavContent.kt:49)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: yc0.j
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.n(sVar, (cb4.f.a) obj);
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
    public static final i0 n(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(a aVar, a aVar2, int i15, r rVar, int i16) {
        h(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
