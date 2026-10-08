package eu2;

import android.os.Bundle;
import bu2.CompanyDetails;
import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import java.time.LocalDate;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p136y9.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Leu2/b;", "nestedViewModel", "Loq/i0;", "r", "(Leu2/b;Lm2/r;I)V", "peselrestrictionverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"eu2/v$a", "Lru2/m;", "Lbu2/b;", "companyDetails", "Loq/i0;", "b", "(Lbu2/b;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements ru2.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ eu2.b f53711a;

        a(eu2.b bVar) {
            this.f53711a = bVar;
        }

        @Override // ru2.m
        public Object a(tq.e<? super CompanyDetails> eVar) {
            return this.f53711a.D6(eVar);
        }

        @Override // ru2.m
        public Object b(CompanyDetails companyDetails, tq.e<? super oq.i0> eVar) {
            Object objI1 = this.f53711a.i1(companyDetails, eVar);
            return objI1 == uq.b.e() ? objI1 : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"eu2/v$b", "Lyu2/m;", "Lbu2/d;", "verificationCheckData", "Loq/i0;", "J", "(Lbu2/d;Ltq/e;)Ljava/lang/Object;", "s", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements yu2.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ eu2.b f53712a;

        b(eu2.b bVar) {
            this.f53712a = bVar;
        }

        @Override // yu2.m
        public Object J(VerificationCheckData verificationCheckData, tq.e<? super oq.i0> eVar) {
            Object objJ = this.f53712a.J(verificationCheckData, eVar);
            return objJ == uq.b.e() ? objJ : oq.i0.f148189a;
        }

        @Override // yu2.m
        public Object s(tq.e<? super VerificationCheckData> eVar) {
            return this.f53712a.s(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"eu2/v$c", "Lcv2/g;", "Lbu2/e;", "verifiedStatus", "Loq/i0;", "c", "(Lbu2/e;Ltq/e;)Ljava/lang/Object;", "b", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements cv2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ eu2.b f53713a;

        c(eu2.b bVar) {
            this.f53713a = bVar;
        }

        @Override // cv2.g
        public Object b(tq.e<? super VerifiedStatus> eVar) {
            return this.f53713a.Y(eVar);
        }

        @Override // cv2.g
        public Object c(VerifiedStatus verifiedStatus, tq.e<? super oq.i0> eVar) {
            Object objW0 = this.f53713a.w0(verifiedStatus, eVar);
            return objW0 == uq.b.e() ? objW0 : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"eu2/v$d", "Lwu2/b;", "Lbu2/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lbu2/d;", "s", "Lbu2/e;", "b", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements wu2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ eu2.b f53714a;

        d(eu2.b bVar) {
            this.f53714a = bVar;
        }

        @Override // wu2.b
        public Object a(tq.e<? super CompanyDetails> eVar) {
            return this.f53714a.D6(eVar);
        }

        @Override // wu2.b
        public Object b(tq.e<? super VerifiedStatus> eVar) {
            return this.f53714a.Y(eVar);
        }

        @Override // wu2.b
        public Object s(tq.e<? super VerificationCheckData> eVar) {
            return this.f53714a.s(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"eu2/v$e", "Lru2/m;", "Lbu2/b;", "companyDetails", "Loq/i0;", "b", "(Lbu2/b;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements ru2.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ eu2.b f53715a;

        e(eu2.b bVar) {
            this.f53715a = bVar;
        }

        @Override // ru2.m
        public Object a(tq.e<? super CompanyDetails> eVar) {
            return this.f53715a.D6(eVar);
        }

        @Override // ru2.m
        public Object b(CompanyDetails companyDetails, tq.e<? super oq.i0> eVar) {
            Object objI1 = this.f53715a.i1(companyDetails, eVar);
            return objI1 == uq.b.e() ? objI1 : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(f00.s sVar, yu2.e eVar) {
        if (!(eVar instanceof yu2.e.a)) {
            throw new oq.p();
        }
        f00.s.m(sVar, cu2.i.d.C0806d.f37988a, null, 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(final eu2.b bVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1737282322, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanyVerifyWizardNavContent.kt:127)");
        }
        f00.r.o(wVar, fr.q0.c(cv2.o.class), new c(bVar), y2.m.d(-1975957503, true, new er.q() { // from class: eu2.g
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return v.C(bVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f53703a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(final eu2.b bVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1975957503, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyVerifyWizardNavContent.kt:138)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(bVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: eu2.k
                @Override // er.l
                public final Object b(Object obj) {
                    return v.D(bVar, sVar, (cv2.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(eu2.b bVar, f00.s sVar, final cv2.a aVar) {
        if (aVar instanceof cv2.a.OpenDatePicker) {
            cv2.a.OpenDatePicker openDatePicker = (cv2.a.OpenDatePicker) aVar;
            bVar.t0(openDatePicker.getCurrentDate(), new er.l() { // from class: eu2.l
                @Override // er.l
                public final Object b(Object obj) {
                    return v.E(aVar, (LocalDate) obj);
                }
            }, openDatePicker.getMinDate(), openDatePicker.getMaxDate());
        } else {
            if (!(aVar instanceof cv2.a.b)) {
                throw new oq.p();
            }
            f00.s.m(sVar, cu2.i.d.b.f37984a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(cv2.a aVar, LocalDate localDate) {
        ((cv2.a.OpenDatePicker) aVar).d().b(localDate);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final eu2.b bVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1211930767, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanyVerifyWizardNavContent.kt:162)");
        }
        f00.r.o(wVar, fr.q0.c(wu2.p.class), new d(bVar), y2.m.d(-630203296, true, new er.q() { // from class: eu2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return v.G(sVar, bVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f53703a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(final f00.s sVar, final eu2.b bVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-630203296, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyVerifyWizardNavContent.kt:176)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(bVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: eu2.j
                @Override // er.l
                public final Object b(Object obj) {
                    return v.H(sVar, bVar, (wu2.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(f00.s sVar, eu2.b bVar, wu2.a.c cVar) {
        if (fr.t.c(cVar, wu2.a.c.C5713a.f215123a)) {
            sVar.c();
        } else if (cVar instanceof wu2.a.c.GoToResultPage) {
            bVar.H0(((wu2.a.c.GoToResultPage) cVar).getWizardResultData());
        } else if (cVar instanceof wu2.a.c.GoToErrorScreen) {
            bVar.b0(((wu2.a.c.GoToErrorScreen) cVar).getResultData());
        } else if (fr.t.c(cVar, wu2.a.c.b.f215124a)) {
            f00.s.l(sVar, cu2.i.d.a.f37982a, new e(bVar), null, 4, null);
        } else if (fr.t.c(cVar, wu2.a.c.e.f215127a)) {
            f00.s.m(sVar, cu2.i.d.C0806d.f37988a, null, 2, null);
        } else {
            if (!fr.t.c(cVar, wu2.a.c.f.f215128a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, cu2.i.d.c.f37986a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(eu2.b bVar, int i15, p076m2.r rVar, int i16) {
        r(bVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final eu2.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(612678921);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(612678921, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent (CompanyVerifyWizardNavContent.kt:29)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            xw.b<eu2.a.e> bVarG = bVar.g();
            boolean zG = rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: eu2.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.s(sVarJ, (a.e) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.f0.b(bVarG, (er.l) objE, rVarH, xw.b.f221619c);
            cu2.i.d.a aVar = cu2.i.d.a.f37982a;
            boolean zG2 = rVarH.G(sVarJ);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(bVar))) {
                z15 = true;
            }
            boolean z16 = zG2 | z15;
            Object objE2 = rVarH.E();
            if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: eu2.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.t(sVarJ, bVar, (d1) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f00.d0.j(sVarJ, aVar, (er.l) objE2, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: eu2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.I(bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(f00.s sVar, eu2.a.e eVar) {
        if (!fr.t.c(eVar, eu2.a.e.C1265a.f53594a)) {
            throw new oq.p();
        }
        sVar.getNavController().J();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(final f00.s sVar, final eu2.b bVar, d1 d1Var) {
        sVar.getNavController().i(new y9.e0.c() { // from class: eu2.o
            @Override // y9.e0.c
            public final void a(p136y9.e0 e0Var, y0 y0Var, Bundle bundle) {
                v.u(bVar, e0Var, y0Var, bundle);
            }
        });
        f00.r.u(d1Var, cu2.i.d.a.f37982a, null, y2.m.b(1434310922, true, new er.r() { // from class: eu2.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return v.v(bVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, cu2.i.d.c.f37986a, null, y2.m.b(391528115, true, new er.r() { // from class: eu2.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return v.y(bVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, cu2.i.d.C0806d.f37988a, null, y2.m.b(1737282322, true, new er.r() { // from class: eu2.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return v.B(bVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, cu2.i.d.b.f37984a, null, y2.m.b(-1211930767, true, new er.r() { // from class: eu2.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return v.F(bVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(eu2.b bVar, p136y9.e0 e0Var, y0 y0Var, Bundle bundle) {
        String strU = y0Var.u();
        cu2.i.d.a aVar = cu2.i.d.a.f37982a;
        if (fr.t.c(strU, aVar.getRoute())) {
            bVar.D8(aVar);
            return;
        }
        cu2.i.d.c cVar = cu2.i.d.c.f37986a;
        if (fr.t.c(strU, cVar.getRoute())) {
            bVar.D8(cVar);
            return;
        }
        cu2.i.d.C0806d c0806d = cu2.i.d.C0806d.f37988a;
        if (fr.t.c(strU, c0806d.getRoute())) {
            bVar.D8(c0806d);
            return;
        }
        cu2.i.d.b bVar2 = cu2.i.d.b.f37984a;
        if (fr.t.c(strU, bVar2.getRoute())) {
            bVar.D8(bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(eu2.b bVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1434310922, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanyVerifyWizardNavContent.kt:69)");
        }
        f00.r.o(wVar, fr.q0.c(ru2.z.class), new a(bVar), y2.m.d(558939577, true, new er.q() { // from class: eu2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return v.w(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f53703a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(558939577, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyVerifyWizardNavContent.kt:80)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: eu2.i
                @Override // er.l
                public final Object b(Object obj) {
                    return v.x(sVar, (ru2.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(f00.s sVar, ru2.a aVar) {
        if (!(aVar instanceof ru2.a.C4495a)) {
            throw new oq.p();
        }
        f00.s.m(sVar, cu2.i.d.c.f37986a, null, 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(eu2.b bVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(391528115, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanyVerifyWizardNavContent.kt:97)");
        }
        f00.r.o(wVar, fr.q0.c(yu2.y.class), new b(bVar), y2.m.d(973255586, true, new er.q() { // from class: eu2.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return v.z(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f53703a.e(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(973255586, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.companyverifywizard.CompanyVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyVerifyWizardNavContent.kt:110)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: eu2.h
                @Override // er.l
                public final Object b(Object obj) {
                    return v.A(sVar, (yu2.e) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
