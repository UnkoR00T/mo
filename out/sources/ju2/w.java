package ju2;

import android.os.Bundle;
import bu2.CompanyDetails;
import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import fr.q0;
import java.time.LocalDate;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p136y9.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lju2/f;", "nestedViewModel", "Loq/i0;", "o", "(Lju2/f;Lm2/r;I)V", "peselrestrictionverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ju2/w$a", "Lyu2/m;", "Lbu2/d;", "verificationCheckData", "Loq/i0;", "J", "(Lbu2/d;Ltq/e;)Ljava/lang/Object;", "s", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements yu2.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f105994a;

        a(f fVar) {
            this.f105994a = fVar;
        }

        @Override // yu2.m
        public Object J(VerificationCheckData verificationCheckData, tq.e<? super oq.i0> eVar) {
            Object objJ = this.f105994a.J(verificationCheckData, eVar);
            return objJ == uq.b.e() ? objJ : oq.i0.f148189a;
        }

        @Override // yu2.m
        public Object s(tq.e<? super VerificationCheckData> eVar) {
            return this.f105994a.s(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ju2/w$b", "Lcv2/g;", "Lbu2/e;", "verifiedStatus", "Loq/i0;", "c", "(Lbu2/e;Ltq/e;)Ljava/lang/Object;", "b", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements cv2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f105995a;

        b(f fVar) {
            this.f105995a = fVar;
        }

        @Override // cv2.g
        public Object b(tq.e<? super VerifiedStatus> eVar) {
            return this.f105995a.Y(eVar);
        }

        @Override // cv2.g
        public Object c(VerifiedStatus verifiedStatus, tq.e<? super oq.i0> eVar) {
            Object objW0 = this.f105995a.w0(verifiedStatus, eVar);
            return objW0 == uq.b.e() ? objW0 : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"ju2/w$c", "Lwu2/b;", "Lbu2/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lbu2/d;", "s", "Lbu2/e;", "b", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements wu2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f105996a;

        c(f fVar) {
            this.f105996a = fVar;
        }

        @Override // wu2.b
        public Object a(tq.e<? super CompanyDetails> eVar) {
            return null;
        }

        @Override // wu2.b
        public Object b(tq.e<? super VerifiedStatus> eVar) {
            return this.f105996a.Y(eVar);
        }

        @Override // wu2.b
        public Object s(tq.e<? super VerificationCheckData> eVar) {
            return this.f105996a.s(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ju2/w$d", "Lcv2/g;", "Lbu2/e;", "verifiedStatus", "Loq/i0;", "c", "(Lbu2/e;Ltq/e;)Ljava/lang/Object;", "b", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements cv2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f105997a;

        d(f fVar) {
            this.f105997a = fVar;
        }

        @Override // cv2.g
        public Object b(tq.e<? super VerifiedStatus> eVar) {
            return this.f105997a.Y(eVar);
        }

        @Override // cv2.g
        public Object c(VerifiedStatus verifiedStatus, tq.e<? super oq.i0> eVar) {
            Object objW0 = this.f105997a.w0(verifiedStatus, eVar);
            return objW0 == uq.b.e() ? objW0 : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ju2/w$e", "Lyu2/m;", "Lbu2/d;", "verificationCheckData", "Loq/i0;", "J", "(Lbu2/d;Ltq/e;)Ljava/lang/Object;", "s", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements yu2.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f105998a;

        e(f fVar) {
            this.f105998a = fVar;
        }

        @Override // yu2.m
        public Object J(VerificationCheckData verificationCheckData, tq.e<? super oq.i0> eVar) {
            Object objJ = this.f105998a.J(verificationCheckData, eVar);
            return objJ == uq.b.e() ? objJ : oq.i0.f148189a;
        }

        @Override // yu2.m
        public Object s(tq.e<? super VerificationCheckData> eVar) {
            return this.f105998a.s(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(final f00.s sVar, final f fVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1851220698, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.personalverifywizard.PersonalVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalVerifyWizardNavContent.kt:138)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ju2.j
                @Override // er.l
                public final Object b(Object obj) {
                    return w.B(sVar, fVar, (wu2.a.c) obj);
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
    public static final oq.i0 B(f00.s sVar, f fVar, wu2.a.c cVar) {
        if (fr.t.c(cVar, wu2.a.c.C5713a.f215123a)) {
            sVar.c();
        } else if (cVar instanceof wu2.a.c.GoToResultPage) {
            fVar.H0(((wu2.a.c.GoToResultPage) cVar).getWizardResultData());
        } else if (cVar instanceof wu2.a.c.GoToErrorScreen) {
            fVar.b0(((wu2.a.c.GoToErrorScreen) cVar).getResultData());
        } else if (!fr.t.c(cVar, wu2.a.c.b.f215124a)) {
            if (fr.t.c(cVar, wu2.a.c.e.f215127a)) {
                f00.s.l(sVar, cu2.i.g.c.f37999a, new d(fVar), null, 4, null);
            } else {
                if (!fr.t.c(cVar, wu2.a.c.f.f215128a)) {
                    throw new oq.p();
                }
                f00.s.l(sVar, cu2.i.g.b.f37997a, new e(fVar), null, 4, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(f fVar, int i15, p076m2.r rVar, int i16) {
        o(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(78687006);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(78687006, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.personalverifywizard.PersonalVerifyWizardNavContent (PersonalVerifyWizardNavContent.kt:25)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            xw.b<ju2.e.AbstractC2511e> bVarG = fVar.g();
            boolean zG = rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ju2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w.p(sVarJ, (e.AbstractC2511e) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.f0.b(bVarG, (er.l) objE, rVarH, xw.b.f221619c);
            cu2.i.g.b bVar = cu2.i.g.b.f37997a;
            boolean zG2 = rVarH.G(sVarJ);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(fVar))) {
                z15 = true;
            }
            boolean z16 = zG2 | z15;
            Object objE2 = rVarH.E();
            if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: ju2.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w.q(sVarJ, fVar, (d1) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f00.d0.j(sVarJ, bVar, (er.l) objE2, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ju2.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.C(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(f00.s sVar, ju2.e.AbstractC2511e abstractC2511e) {
        if (!fr.t.c(abstractC2511e, ju2.e.AbstractC2511e.a.f105897a)) {
            throw new oq.p();
        }
        sVar.getNavController().J();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(final f00.s sVar, final f fVar, d1 d1Var) {
        sVar.getNavController().i(new y9.e0.c() { // from class: ju2.p
            @Override // y9.e0.c
            public final void a(p136y9.e0 e0Var, y0 y0Var, Bundle bundle) {
                w.r(fVar, e0Var, y0Var, bundle);
            }
        });
        f00.r.u(d1Var, cu2.i.g.b.f37997a, null, y2.m.b(299008893, true, new er.r() { // from class: ju2.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w.s(fVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, cu2.i.g.c.f37999a, null, y2.m.b(254857524, true, new er.r() { // from class: ju2.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w.v(sVar, fVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, cu2.i.g.a.f37995a, null, y2.m.b(-1901269899, true, new er.r() { // from class: ju2.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w.z(sVar, fVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(f fVar, p136y9.e0 e0Var, y0 y0Var, Bundle bundle) {
        String strU = y0Var.u();
        cu2.i.g.b bVar = cu2.i.g.b.f37997a;
        if (fr.t.c(strU, bVar.getRoute())) {
            fVar.Y5(bVar);
            return;
        }
        cu2.i.g.c cVar = cu2.i.g.c.f37999a;
        if (fr.t.c(strU, cVar.getRoute())) {
            fVar.Y5(cVar);
            return;
        }
        cu2.i.g.a aVar = cu2.i.g.a.f37995a;
        if (fr.t.c(strU, aVar.getRoute())) {
            fVar.Y5(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(final f fVar, final f00.s sVar, p114t0.f fVar2, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(299008893, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.personalverifywizard.PersonalVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (PersonalVerifyWizardNavContent.kt:60)");
        }
        f00.r.o(wVar, q0.c(yu2.y.class), new a(fVar), y2.m.d(1152691310, true, new er.q() { // from class: ju2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w.t(sVar, fVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), ju2.d.f105880a.d(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(final f00.s sVar, final f fVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1152691310, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.personalverifywizard.PersonalVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalVerifyWizardNavContent.kt:73)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ju2.l
                @Override // er.l
                public final Object b(Object obj) {
                    return w.u(sVar, fVar, (yu2.e) obj);
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
    public static final oq.i0 u(f00.s sVar, f fVar, yu2.e eVar) {
        if (!(eVar instanceof yu2.e.a)) {
            throw new oq.p();
        }
        f00.s.l(sVar, cu2.i.g.c.f37999a, new b(fVar), null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(final f00.s sVar, final f fVar, p114t0.f fVar2, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(254857524, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.personalverifywizard.PersonalVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (PersonalVerifyWizardNavContent.kt:96)");
        }
        f00.r.o(wVar, q0.c(cv2.o.class), sVar.g(cu2.i.g.c.f37999a), y2.m.d(304906725, true, new er.q() { // from class: ju2.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w.w(fVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), ju2.d.f105880a.e(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(final f fVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(304906725, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.personalverifywizard.PersonalVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalVerifyWizardNavContent.kt:102)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(fVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ju2.k
                @Override // er.l
                public final Object b(Object obj) {
                    return w.x(fVar, sVar, (cv2.a) obj);
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
    public static final oq.i0 x(f fVar, f00.s sVar, final cv2.a aVar) {
        if (aVar instanceof cv2.a.OpenDatePicker) {
            cv2.a.OpenDatePicker openDatePicker = (cv2.a.OpenDatePicker) aVar;
            fVar.t0(openDatePicker.getCurrentDate(), new er.l() { // from class: ju2.m
                @Override // er.l
                public final Object b(Object obj) {
                    return w.y(aVar, (LocalDate) obj);
                }
            }, openDatePicker.getMinDate(), openDatePicker.getMaxDate());
        } else {
            if (!(aVar instanceof cv2.a.b)) {
                throw new oq.p();
            }
            f00.s.l(sVar, cu2.i.g.a.f37995a, new c(fVar), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(cv2.a aVar, LocalDate localDate) {
        ((cv2.a.OpenDatePicker) aVar).d().b(localDate);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(final f00.s sVar, final f fVar, p114t0.f fVar2, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1901269899, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.personalverifywizard.PersonalVerifyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (PersonalVerifyWizardNavContent.kt:132)");
        }
        f00.r.o(wVar, q0.c(wu2.p.class), sVar.g(cu2.i.g.a.f37995a), y2.m.d(-1851220698, true, new er.q() { // from class: ju2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w.A(sVar, fVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), ju2.d.f105880a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
