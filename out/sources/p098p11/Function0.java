package p098p11;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.l;
import er.p;
import f00.f0;
import f00.s;
import fr.q;
import fr.q0;
import mr.g;
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
import q11.a;
import q11.d0;
import s11.d;
import t11.c;
import th0.UserCertificateMobileApi;
import w11.i;
import y2.m;

/* JADX INFO: renamed from: p11.h, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Lgx/b;", "navigateToGlobalDestination", "g", "(Ler/a;Ler/l;Lm2/r;I)V", "certificates_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: p11.h$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements l<d, i0> {
        a(Object obj) {
            super(1, obj, d0.class, "setNavResult", "setNavResult(Lpl/gov/coi/mobywatel/feature/certificates/presentation/screens/certificates/model/CertificatesNavResult;)V", 0);
        }

        public final void E(d dVar) {
            ((d0) this.f66391b).H9(dVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(d dVar) {
            E(dVar);
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: p11.h$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends q implements l<UserCertificateMobileApi, i0> {
        b(Object obj) {
            super(1, obj, w11.q.class, "setupViewModel", "setupViewModel(Lpl/gov/coi/mobywatel/be/authenticationservice/contract/model/UserCertificateMobileApi;)V", 0);
        }

        public final void E(UserCertificateMobileApi userCertificateMobileApi) {
            ((w11.q) this.f66391b).D9(userCertificateMobileApi);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(UserCertificateMobileApi userCertificateMobileApi) {
            E(userCertificateMobileApi);
            return i0.f148189a;
        }
    }

    public static final void g(final er.a<i0> aVar, final l<? super gx.b, i0> lVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(814668360);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(814668360, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.CertificatesNavContent (CertificatesNavContent.kt:27)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            p11.a.b bVar = p11.a.b.f151496a;
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: p11.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.h(sVarJ, aVar, lVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, bVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: p11.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.m(aVar, lVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final s sVar, final er.a aVar, final l lVar, d1 d1Var) {
        f00.r.u(d1Var, p11.a.b.f151496a, null, m.b(-1036493913, true, new er.r() { // from class: p11.d
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.i(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p098p11.a.C3729a.f151494a, null, m.b(-571065762, true, new er.r() { // from class: p11.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k(sVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        c.c(d1Var, p11.a.c.f151498a, sVar);
        tw.c.c(d1Var, p11.a.d.f151500a, sVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final er.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1036493913, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.CertificatesNavContent.<anonymous>.<anonymous>.<anonymous> (CertificatesNavContent.kt:34)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        d0 d0Var = (d0) q7.d.c(q0.c(d0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<q11.a.h> bVarY1 = d0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p11.f
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j(aVar, sVar, (a.h) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        p11.a.b bVar = p11.a.b.f151496a;
        boolean zG = rVar.G(d0Var);
        Object objE2 = rVar.E();
        if (zG || objE2 == r.INSTANCE.a()) {
            objE2 = new a(d0Var);
            rVar.v(objE2);
        }
        sVar.f(bVar, (l) ((g) objE2));
        q11.t.p(d0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(er.a aVar, s sVar, q11.a.h hVar) {
        if (fr.t.c(hVar, q11.a.h.C4059a.f163580a)) {
            aVar.a();
        } else {
            if (!(hVar instanceof q11.a.h.GoToCertificateDetails)) {
                throw new oq.p();
            }
            s.i(sVar, p098p11.a.C3729a.f151494a, ((q11.a.h.GoToCertificateDetails) hVar).getCertificate(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final s sVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-571065762, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.CertificatesNavContent.<anonymous>.<anonymous>.<anonymous> (CertificatesNavContent.kt:56)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w11.q qVar = (w11.q) q7.d.c(q0.c(w11.q.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<w11.a.e> bVarY1 = qVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p11.g
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l(sVar, lVar, (w11.a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        p098p11.a.C3729a c3729a = p098p11.a.C3729a.f151494a;
        boolean zG2 = rVar.G(qVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new b(qVar);
            rVar.v(objE2);
        }
        sVar.f(c3729a, (l) ((g) objE2));
        i.f(qVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(s sVar, l lVar, w11.a.e eVar) {
        if (fr.t.c(eVar, w11.a.e.C5501a.f209176a)) {
            sVar.c();
        } else if (eVar instanceof w11.a.e.GoToConfirmation) {
            s.i(sVar, p11.a.c.f151498a, ((w11.a.e.GoToConfirmation) eVar).getConfirmation(), null, 4, null);
        } else if (eVar instanceof w11.a.e.GoBackAndRefresh) {
            s.i(sVar, p11.a.b.f151496a, ((w11.a.e.GoBackAndRefresh) eVar).getResult(), null, 4, null);
        } else if (fr.t.c(eVar, w11.a.e.d.f209180a)) {
            lVar.b(new tg1.a.ToDashboard(false, 1, null));
        } else {
            if (!(eVar instanceof w11.a.e.ShowNavigationDialog)) {
                throw new oq.p();
            }
            s.i(sVar, p11.a.d.f151500a, ((w11.a.e.ShowNavigationDialog) eVar).getNavigationDialogModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(er.a aVar, l lVar, int i15, r rVar, int i16) {
        g(aVar, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
