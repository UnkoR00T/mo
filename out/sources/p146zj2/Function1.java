package p146zj2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import dk2.k;
import dk2.u;
import er.a;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import fr.t;
import gk2.g;
import gk2.j;
import hb4.b;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.d;
import y2.m;

/* JADX INFO: renamed from: zj2.q, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\t\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lgx/b;", "Loq/i0;", "navigateToGlobalDestination", "Lkotlin/Function0;", "navResult", "Lf00/s;", "afterLoginAction", "applicationLock", "p", "(Ler/l;Ler/a;Ler/l;Ler/a;Lm2/r;I)V", "login_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(s sVar, b.a aVar) {
        if (!t.c(aVar, b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1690774931, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:153)");
        }
        a.b bVar = a.b.f235469a;
        f00.r.r(wVar, bVar, sVar.g(bVar), m.d(-1559520088, true, new q() { // from class: zj2.e
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.C(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1559520088, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:157)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: zj2.f
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.D(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(s sVar, cb4.f.a aVar) {
        if (!t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(l lVar, a aVar, l lVar2, a aVar2, int i15, r rVar, int i16) {
        p(lVar, aVar, lVar2, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final l<? super gx.b, i0> lVar, final a<i0> aVar, final l<? super s, i0> lVar2, final a<i0> aVar2, r rVar, final int i15) {
        int i16;
        a<i0> aVar3;
        final s sVar;
        r rVarH = rVar.h(2121807564);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            aVar3 = aVar2;
            i16 |= rVarH.G(aVar3) ? 2048 : 1024;
        } else {
            aVar3 = aVar2;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2121807564, i16, -1, "pl.gov.coi.mobywatel.feature.login.presentation.NavContent (NavContent.kt:38)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a.d dVar = a.d.f235473a;
            boolean zG = ((i16 & 112) == 32) | rVarH.G(sVarJ) | ((i16 & 7168) == 2048) | ((i16 & 896) == 256) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                sVar = sVarJ;
                final a<i0> aVar4 = aVar3;
                l lVar3 = new l() { // from class: zj2.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.q(sVar, aVar, aVar4, lVar2, lVar, (d1) obj);
                    }
                };
                rVarH.v(lVar3);
                objE = lVar3;
            } else {
                sVar = sVarJ;
            }
            d0.j(sVar, dVar, (l) objE, rVarH, s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zj2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.E(lVar, aVar, lVar2, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 q(final s sVar, final a aVar, final a aVar2, final l lVar, final l lVar2, d1 d1Var) {
        f00.r.u(d1Var, a.d.f235473a, null, m.b(13753037, true, new er.r() { // from class: zj2.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.r(sVar, aVar, aVar2, lVar, lVar2, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.e.f235475a, null, m.b(-1758721930, true, new er.r() { // from class: zj2.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.t(sVar, lVar2, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.C6355a.f235467a, null, m.b(-608889643, true, new er.r() { // from class: zj2.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.v(sVar, lVar2, aVar2, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.c.f235471a, null, m.b(540942644, true, new er.r() { // from class: zj2.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.y(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, a.b.f235469a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(1690774931, true, new er.r() { // from class: zj2.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.B(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final s sVar, final a aVar, final a aVar2, final l lVar, final l lVar2, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(13753037, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:46)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        u uVar = (u) d.c(q0.c(u.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        uVar.M9((fk2.a) sVar.e(a.d.f235473a));
        xw.b<dk2.a.e> bVarY1 = uVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(aVar2) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            l lVar3 = new l() { // from class: zj2.c
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.s(aVar, sVar, aVar2, lVar, lVar2, (dk2.a.e) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        k.p(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(a aVar, s sVar, a aVar2, l lVar, l lVar2, dk2.a.e eVar) {
        if (t.c(eVar, dk2.a.e.C0955a.f43133a)) {
            aVar.a();
        } else if (eVar instanceof dk2.a.e.Error) {
            s.i(sVar, a.c.f235471a, ((dk2.a.e.Error) eVar).getErrorData(), null, 4, null);
        } else if (eVar instanceof dk2.a.e.ShowDialog) {
            s.i(sVar, a.b.f235469a, ((dk2.a.e.ShowDialog) eVar).getNavigationDialogModel(), null, 4, null);
        } else if (t.c(eVar, dk2.a.e.d.f43136a)) {
            aVar2.a();
        } else if (eVar instanceof dk2.a.e.ToBiometricPin) {
            s.i(sVar, a.C6355a.f235467a, ((dk2.a.e.ToBiometricPin) eVar).getBiometricPinSetupData(), null, 4, null);
        } else if (t.c(eVar, dk2.a.e.f.f43139a)) {
            lVar.b(sVar);
        } else if (t.c(eVar, dk2.a.e.h.f43141a)) {
            s.i(sVar, a.e.f235475a, null, null, 6, null);
        } else {
            if (!(eVar instanceof dk2.a.e.g)) {
                throw new p();
            }
            lVar2.b(new zw0.a.ToAddDocument(false, zw0.a.ToAddDocument.EnumC6430a.MAIN_DOCUMENT_LOADER, false, false, null, 28, null));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1758721930, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:84)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        j jVar = (j) d.c(q0.c(j.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<gk2.a.b> bVarY1 = jVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: zj2.d
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.u(sVar, lVar, (gk2.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        g.d(jVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(s sVar, l lVar, gk2.a.b bVar) {
        if (t.c(bVar, gk2.a.b.C1681a.f73472a)) {
            sVar.c();
        } else if (t.c(bVar, gk2.a.b.c.f73474a)) {
            lVar.b(new po2.a.ToOnboarding(true, false, false, 6, null));
        } else {
            if (!(bVar instanceof gk2.a.b.ShowDialog)) {
                throw new p();
            }
            s.i(sVar, a.b.f235469a, ((gk2.a.b.ShowDialog) bVar).getNavigationDialogModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(final s sVar, final l lVar, final a aVar, final l lVar2, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-608889643, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:104)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: zj2.o
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.w(sVar, (ak2.m.b) obj);
                }
            };
            rVar.v(objE);
        }
        ak2.m mVar = (ak2.m) d.c(q0.c(ak2.m.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ak2.a.InterfaceC0156a> bVarY1 = mVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(lVar) | rVar.W(aVar) | rVar.W(lVar2);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: zj2.p
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.x(sVar, lVar, aVar, lVar2, (ak2.a.InterfaceC0156a) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        ak2.f.e(mVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ak2.m w(s sVar, ak2.m.b bVar) {
        return bVar.a(sVar.e(a.C6355a.f235467a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(s sVar, l lVar, a aVar, l lVar2, ak2.a.InterfaceC0156a interfaceC0156a) {
        if (interfaceC0156a instanceof ak2.a.InterfaceC0156a.OnError) {
            s.i(sVar, a.c.f235471a, ((ak2.a.InterfaceC0156a.OnError) interfaceC0156a).getErrorData(), null, 4, null);
        } else if (interfaceC0156a instanceof ak2.a.InterfaceC0156a.d) {
            lVar.b(new zw0.a.ToAddDocument(false, zw0.a.ToAddDocument.EnumC6430a.MAIN_DOCUMENT_LOADER, false, false, null, 28, null));
        } else if (t.c(interfaceC0156a, ak2.a.InterfaceC0156a.b.f7141a)) {
            aVar.a();
        } else if (t.c(interfaceC0156a, ak2.a.InterfaceC0156a.c.f7142a)) {
            lVar2.b(sVar);
        } else {
            if (!(interfaceC0156a instanceof ak2.a.InterfaceC0156a.ToPasswordLogin)) {
                throw new p();
            }
            s.i(sVar, a.d.f235473a, ((ak2.a.InterfaceC0156a.ToPasswordLogin) interfaceC0156a).getLoginRedirect(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(540942644, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:137)");
        }
        a.c cVar = a.c.f235471a;
        f00.r.D(wVar, cVar, sVar.e(cVar), m.d(1497222453, true, new q() { // from class: zj2.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.z(sVar, (b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final s sVar, b bVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1497222453, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:141)");
        }
        xw.b<b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: zj2.g
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.A(sVar, (b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
