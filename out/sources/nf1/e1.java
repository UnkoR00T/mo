package nf1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import hg1.SetupData;
import java.time.LocalDate;
import jg1.CompanyManagementEntryPointContractData;
import ld1.CompanyApplicationCitizenData;
import ld1.KnownUserDataModel;
import ld1.SearchModel;
import ma1.CompanyAddresses;
import ma1.CompanyData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p7.CreationExtras;
import rf1.CompanyDetailsContractData;
import tt3.AddressSearchData;
import ve1.PkdCodeSearchEntryData;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0091\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpg1/f0;", "nestedViewModel", "Lkotlin/Function0;", "Loq/i0;", "navResult", "goToCompanyDetails", "Lkotlin/Function1;", "Ljb4/b;", "goToErrorScreen", "Luw/j;", "goToDatePickerDialog", "Ltt3/b;", "goToAddressSearch", "Lld1/m;", "goToSearch", "closeWizardWithDialog", "d0", "(Lpg1/f0;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final fg1.u A0(pg1.f0 f0Var, fg1.u.a aVar) {
        return aVar.a(f0Var.Q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(f00.s sVar, er.a aVar, er.l lVar, fg1.l.e eVar) {
        if (fr.t.c(eVar, fg1.l.e.a.f62768a)) {
            sVar.c();
        } else if (fr.t.c(eVar, fg1.l.e.b.f62769a)) {
            aVar.a();
        } else if (eVar instanceof fg1.l.e.Error) {
            lVar.b(((fg1.l.e.Error) eVar).getErrorData());
        } else {
            if (!(eVar instanceof fg1.l.e.ToSummary)) {
                throw new oq.p();
            }
            f00.s.l(sVar, a.p.f135743a, ((fg1.l.e.ToSummary) eVar).getSummaryStatusEntryData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(final f00.s sVar, final er.a aVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(872960591, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:504)");
        }
        f00.r.o(wVar, fr.q0.c(if1.n.class), sVar.g(a.p.f135743a), y2.m.d(-1579869506, true, new er.q() { // from class: nf1.c0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.D0(sVar, aVar, lVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h1.f135789a.d(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D0(final f00.s sVar, final er.a aVar, final er.l lVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1579869506, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:508)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.E0(sVar, aVar, lVar, (if1.i) obj);
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
    public static final oq.i0 E0(f00.s sVar, er.a aVar, er.l lVar, if1.i iVar) {
        if (fr.t.c(iVar, if1.i.a.f92088a)) {
            sVar.c();
        } else if (fr.t.c(iVar, if1.i.b.f92089a)) {
            aVar.a();
        } else {
            if (!(iVar instanceof if1.i.c)) {
                throw new oq.p();
            }
            lVar.b(((if1.i.c) iVar).a());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(final pg1.f0 f0Var, final f00.s sVar, final er.a aVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1932254198, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:124)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.G0(f0Var, (hg1.y.a) obj);
                }
            };
            rVar.v(objE);
        }
        hg1.y yVar = (hg1.y) q7.d.c(fr.q0.c(hg1.y.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<hg1.k.d> bVarY1 = yVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar) | rVar.G(f0Var) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.H0(sVar, aVar, f0Var, lVar, (hg1.k.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        hg1.j.q(yVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hg1.y G0(pg1.f0 f0Var, hg1.y.a aVar) {
        return (hg1.y) aVar.a(new SetupData(f0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(f00.s sVar, er.a aVar, pg1.f0 f0Var, er.l lVar, final hg1.k.d dVar) {
        if (fr.t.c(dVar, hg1.k.d.a.f84373a)) {
            sVar.c();
        } else if (fr.t.c(dVar, hg1.k.d.b.f84374a)) {
            aVar.a();
        } else if (fr.t.c(dVar, hg1.k.d.C1951d.f84376a)) {
            f00.s.i(sVar, a.g.f135725a, null, null, 6, null);
        } else if (dVar instanceof hg1.k.d.c) {
            f00.s.i(sVar, a.f.f135723a, f0Var.f5(), null, 4, null);
        } else if (dVar instanceof hg1.k.d.ShowDataPicker) {
            hg1.k.d.ShowDataPicker showDataPicker = (hg1.k.d.ShowDataPicker) dVar;
            lVar.b(new uw.j.Single(null, showDataPicker.getCurrentDate(), new er.l() { // from class: nf1.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.I0(dVar, (LocalDate) obj);
                }
            }, showDataPicker.getMinDate(), showDataPicker.getMaxDate(), 1, null));
        } else {
            if (!fr.t.c(dVar, hg1.k.d.f.f84381a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, a.i.f135729a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I0(hg1.k.d dVar, LocalDate localDate) {
        ((hg1.k.d.ShowDataPicker) dVar).d().b(localDate);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J0(final f00.s sVar, final pg1.f0 f0Var, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(11717707, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:169)");
        }
        boolean zG = rVar.G(sVar) | rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.t
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.K0(sVar, f0Var, (te1.a0.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        te1.a0 a0Var = (te1.a0) q7.d.c(fr.q0.c(te1.a0.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<te1.o.h> bVarY1 = a0Var.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.L0(sVar, (te1.o.h) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        te1.n.r(a0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final te1.a0 K0(f00.s sVar, pg1.f0 f0Var, te1.a0.a aVar) {
        PkdCodeSearchEntryData pkdCodeSearchEntryData = (PkdCodeSearchEntryData) sVar.e(a.k.f135733a);
        if (pkdCodeSearchEntryData == null) {
            pkdCodeSearchEntryData = new PkdCodeSearchEntryData(null, 1, null);
        }
        return aVar.a(new te1.a0.a.SetupData(pkdCodeSearchEntryData, f0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(f00.s sVar, te1.o.h hVar) {
        if (fr.t.c(hVar, te1.o.h.a.f189885a)) {
            sVar.c();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M0(final pg1.f0 f0Var, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1955689612, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:191)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.N0(f0Var, (we1.r.a) obj);
                }
            };
            rVar.v(objE);
        }
        we1.r rVar2 = (we1.r) q7.d.c(fr.q0.c(we1.r.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<we1.h.f> bVarY1 = rVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.G(f0Var) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.O0(sVar, f0Var, lVar, (we1.h.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        we1.g.m(rVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final we1.r N0(pg1.f0 f0Var, we1.r.a aVar) {
        return aVar.a(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0(f00.s sVar, pg1.f0 f0Var, er.l lVar, we1.h.f fVar) {
        CompanyApplicationCitizenData citizenData;
        if (fr.t.c(fVar, we1.h.f.d.f212706a)) {
            f00.s.i(sVar, a.j.f135731a, null, null, 6, null);
        } else if (fr.t.c(fVar, we1.h.f.c.f212705a)) {
            KnownUserDataModel knownUserDataModelQ = f0Var.q();
            if (((knownUserDataModelQ == null || (citizenData = knownUserDataModelQ.getCitizenData()) == null) ? null : citizenData.getPermanentAddress()) != null) {
                f00.s.i(sVar, a.g.f135725a, null, null, 6, null);
            } else {
                f00.s.l(sVar, a.f.f135723a, f0Var.f5(), null, 4, null);
            }
        } else if (fr.t.c(fVar, we1.h.f.a.f212703a)) {
            sVar.c();
        } else if (fVar instanceof we1.h.f.Error) {
            lVar.b(((we1.h.f.Error) fVar).getErrorData());
        } else {
            if (!(fVar instanceof we1.h.f.ToSearchScreen)) {
                throw new oq.p();
            }
            f00.s.i(sVar, a.k.f135733a, new PkdCodeSearchEntryData(((we1.h.f.ToSearchScreen) fVar).a()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(final pg1.f0 f0Var, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-395305779, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:230)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.p
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.Q0(f0Var, (ze1.q.a) obj);
                }
            };
            rVar.v(objE);
        }
        ze1.q qVar = (ze1.q) q7.d.c(fr.q0.c(ze1.q.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ze1.f> bVarY1 = qVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(lVar) | rVar.G(f0Var);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.q
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.R0(sVar, lVar, f0Var, (ze1.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ze1.d.g(qVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ze1.q Q0(pg1.f0 f0Var, ze1.q.a aVar) {
        return aVar.a(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R0(f00.s sVar, er.l lVar, pg1.f0 f0Var, ze1.f fVar) {
        CompanyApplicationCitizenData citizenData;
        if (fr.t.c(fVar, ze1.f.a.f234679a)) {
            sVar.c();
        } else if (fVar instanceof ze1.f.Error) {
            lVar.b(((ze1.f.Error) fVar).getErrorData());
        } else {
            if (!fr.t.c(fVar, ze1.f.c.f234681a)) {
                throw new oq.p();
            }
            KnownUserDataModel knownUserDataModelQ = f0Var.q();
            if (((knownUserDataModelQ == null || (citizenData = knownUserDataModelQ.getCitizenData()) == null) ? null : citizenData.getPermanentAddress()) != null) {
                f00.s.i(sVar, a.g.f135725a, null, null, 6, null);
            } else {
                f00.s.l(sVar, a.f.f135723a, f0Var.f5(), null, 4, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(final pg1.f0 f0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1548666126, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:257)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.T0(f0Var, (yd1.p.a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        yd1.p pVar = (yd1.p) q7.d.c(fr.q0.c(yd1.p.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        xw.b<yd1.b> bVarY1 = pVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.G(f0Var);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.U0(sVar, f0Var, (yd1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        yd1.k.g(pVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yd1.p T0(pg1.f0 f0Var, yd1.p.a aVar) {
        return aVar.a(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(f00.s sVar, pg1.f0 f0Var, yd1.b bVar) {
        CompanyData companyData;
        CompanyAddresses addresses;
        if (fr.t.c(bVar, yd1.b.a.f226505a)) {
            sVar.c();
        } else if (fr.t.c(bVar, yd1.b.c.f226507a)) {
            CompanyDetailsContractData companyDetailsContractDataL0 = f0Var.L0();
            if (((companyDetailsContractDataL0 == null || (companyData = companyDetailsContractDataL0.getCompanyData()) == null || (addresses = companyData.getAddresses()) == null) ? null : addresses.getElectronicDeliveryAddress()) != null) {
                f00.s.i(sVar, a.m.f135737a, null, null, 6, null);
            } else {
                f00.s.i(sVar, a.e.f135721a, null, null, 6, null);
            }
        } else {
            if (!(bVar instanceof yd1.b.GoToEnterAddress)) {
                throw new oq.p();
            }
            f00.s.i(sVar, a.f.f135723a, ((yd1.b.GoToEnterAddress) bVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V0(final f00.s sVar, final pg1.f0 f0Var, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-802329265, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:284)");
        }
        a.f fVar2 = a.f.f135723a;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), y2.m.d(-1871533216, true, new er.q() { // from class: nf1.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.W0(sVar, f0Var, lVar, lVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W0(final f00.s sVar, final pg1.f0 f0Var, final er.l lVar, final er.l lVar2, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1871533216, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:290)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f0Var) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.X0(sVar, f0Var, lVar, lVar2, (st3.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X0(f00.s sVar, pg1.f0 f0Var, er.l lVar, er.l lVar2, st3.f.a aVar) {
        CompanyData companyData;
        CompanyAddresses addresses;
        if ((aVar instanceof st3.f.a.Close) || (aVar instanceof st3.f.a.Back)) {
            sVar.c();
        } else if (aVar instanceof st3.f.a.GoToNextScreen) {
            String electronicDeliveryAddress = null;
            f0Var.T2(new HomeAddressContractData(new hb1.c(((st3.f.a.GoToNextScreen) aVar).getResult(), null, 2, null)));
            CompanyDetailsContractData companyDetailsContractDataL0 = f0Var.L0();
            if (companyDetailsContractDataL0 != null && (companyData = companyDetailsContractDataL0.getCompanyData()) != null && (addresses = companyData.getAddresses()) != null) {
                electronicDeliveryAddress = addresses.getElectronicDeliveryAddress();
            }
            if (electronicDeliveryAddress != null) {
                f00.s.i(sVar, a.m.f135737a, null, null, 6, null);
            } else {
                f00.s.i(sVar, a.e.f135721a, null, null, 6, null);
            }
        } else if (aVar instanceof st3.f.a.GoToSearch) {
            lVar.b(((st3.f.a.GoToSearch) aVar).getModel());
        } else {
            if (!(aVar instanceof st3.f.a.GoToError)) {
                throw new oq.p();
            }
            lVar2.b(((st3.f.a.GoToError) aVar).getErrorData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y0(pg1.f0 f0Var, final f00.s sVar, er.a aVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1141642640, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:323)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: nf1.k0
                @Override // er.a
                public final Object a() {
                    return e1.Z0(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar2 = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: nf1.l0
                @Override // er.a
                public final Object a() {
                    return e1.a1(sVar);
                }
            };
            rVar.v(objE2);
        }
        er.a aVar3 = (er.a) objE2;
        boolean zW = rVar.W(lVar);
        Object objE3 = rVar.E();
        if (zW || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new er.l() { // from class: nf1.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.b1(lVar, (SearchModel) obj);
                }
            };
            rVar.v(objE3);
        }
        er.l lVar3 = (er.l) objE3;
        boolean zW2 = rVar.W(lVar2);
        Object objE4 = rVar.E();
        if (zW2 || objE4 == p076m2.r.INSTANCE.a()) {
            objE4 = new er.l() { // from class: nf1.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.c1(lVar2, (jb4.b) obj);
                }
            };
            rVar.v(objE4);
        }
        nd1.o.l(f0Var, aVar2, aVar, aVar3, lVar3, (er.l) objE4, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z0(f00.s sVar) {
        f00.s.i(sVar, a.m.f135737a, null, null, 6, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a1(f00.s sVar) {
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b1(er.l lVar, SearchModel searchModel) {
        lVar.b(searchModel);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c1(er.l lVar, jb4.b bVar) {
        lVar.b(bVar);
        return oq.i0.f148189a;
    }

    public static final void d0(final pg1.f0 f0Var, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2, final er.l<? super jb4.b, oq.i0> lVar, final er.l<? super uw.j, oq.i0> lVar2, final er.l<? super AddressSearchData, oq.i0> lVar3, final er.l<? super SearchModel, oq.i0> lVar4, final er.a<oq.i0> aVar3, p076m2.r rVar, final int i15) {
        int i16;
        er.a<oq.i0> aVar4;
        er.l<? super jb4.b, oq.i0> lVar5;
        er.l<? super uw.j, oq.i0> lVar6;
        er.l<? super AddressSearchData, oq.i0> lVar7;
        final f00.s sVar;
        p076m2.r rVarH = rVar.h(2059362292);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(f0Var) : rVarH.G(f0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar4 = aVar;
            i16 |= rVarH.G(aVar4) ? 32 : 16;
        } else {
            aVar4 = aVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            lVar5 = lVar;
            i16 |= rVarH.G(lVar5) ? 2048 : 1024;
        } else {
            lVar5 = lVar;
        }
        if ((i15 & 24576) == 0) {
            lVar6 = lVar2;
            i16 |= rVarH.G(lVar6) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            lVar6 = lVar2;
        }
        if ((196608 & i15) == 0) {
            lVar7 = lVar3;
            i16 |= rVarH.G(lVar7) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            lVar7 = lVar3;
        }
        if ((i15 & 1572864) == 0) {
            i16 |= rVarH.G(lVar4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= rVarH.G(aVar3) ? 8388608 : 4194304;
        }
        if (rVarH.r((i16 & 4793491) != 4793490, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2059362292, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent (CompanySuspensionWizardNavContent.kt:74)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            xw.b<pg1.g> bVarG = f0Var.g();
            boolean zG = rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: nf1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e1.e0(sVarJ, (pg1.g) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.f0.b(bVarG, (er.l) objE, rVarH, xw.b.f221619c);
            a.r rVar2 = a.r.f135747a;
            boolean zG2 = rVarH.G(sVarJ) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(f0Var))) | ((i16 & 112) == 32) | ((57344 & i16) == 16384) | ((i16 & 7168) == 2048) | ((458752 & i16) == 131072) | ((29360128 & i16) == 8388608) | ((3670016 & i16) == 1048576) | ((i16 & 896) == 256);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                sVar = sVarJ;
                final er.a<oq.i0> aVar5 = aVar4;
                final er.l<? super jb4.b, oq.i0> lVar8 = lVar5;
                final er.l<? super uw.j, oq.i0> lVar9 = lVar6;
                final er.l<? super AddressSearchData, oq.i0> lVar10 = lVar7;
                er.l lVar11 = new er.l() { // from class: nf1.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e1.f0(sVar, f0Var, aVar5, lVar9, lVar8, lVar10, aVar3, lVar4, aVar2, (p136y9.d1) obj);
                    }
                };
                rVarH.v(lVar11);
                objE2 = lVar11;
            } else {
                sVar = sVarJ;
            }
            f00.d0.j(sVar, rVar2, (er.l) objE2, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nf1.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e1.g1(f0Var, aVar, aVar2, lVar, lVar2, lVar3, lVar4, aVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d1(final pg1.f0 f0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1209352751, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:344)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.e1(f0Var, (cf1.j.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        cf1.j jVar = (cf1.j) q7.d.c(fr.q0.c(cf1.j.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<cf1.d.b> bVarY1 = jVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.f1(sVar, (cf1.d.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        cf1.c.c(jVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(f00.s sVar, pg1.g gVar) {
        if (!fr.t.c(gVar, pg1.g.a.f157329a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cf1.j e1(pg1.f0 f0Var, cf1.j.a aVar) {
        return aVar.a(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, final pg1.f0 f0Var, final er.a aVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar2, final er.l lVar4, final er.a aVar3, p136y9.d1 d1Var) {
        sVar.getNavController().i(new y9.e0.c() { // from class: nf1.i0
            @Override // y9.e0.c
            public final void a(p136y9.e0 e0Var, p136y9.y0 y0Var, Bundle bundle) {
                e1.g0(f0Var, e0Var, y0Var, bundle);
            }
        });
        f00.r.u(d1Var, a.r.f135747a, null, y2.m.b(1137036115, true, new er.r() { // from class: nf1.d
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.h0(sVar, aVar, f0Var, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.q.f135745a, null, y2.m.b(-1932254198, true, new er.r() { // from class: nf1.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.F0(f0Var, sVar, aVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.k.f135733a, null, y2.m.b(11717707, true, new er.r() { // from class: nf1.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.J0(sVar, f0Var, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.i.f135729a, null, y2.m.b(1955689612, true, new er.r() { // from class: nf1.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.M0(f0Var, sVar, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.j.f135731a, null, y2.m.b(-395305779, true, new er.r() { // from class: nf1.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.P0(f0Var, sVar, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.g.f135725a, null, y2.m.b(1548666126, true, new er.r() { // from class: nf1.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.S0(f0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.f.f135723a, null, y2.m.b(-802329265, true, new er.r() { // from class: nf1.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.V0(sVar, f0Var, lVar3, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.e.f135721a, null, y2.m.b(1141642640, true, new er.r() { // from class: nf1.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.Y0(f0Var, sVar, aVar2, lVar4, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.m.f135737a, null, y2.m.b(-1209352751, true, new er.r() { // from class: nf1.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.d1(f0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.h.f135727a, null, y2.m.b(734619154, true, new er.r() { // from class: nf1.t0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.k0(f0Var, sVar, aVar2, lVar2, lVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.C3352a.f135713a, null, y2.m.b(-256964342, true, new er.r() { // from class: nf1.z0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.n0(f0Var, sVar, lVar2, lVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.l.f135735a, null, y2.m.b(1687007563, true, new er.r() { // from class: nf1.a1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.q0(f0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.d.f135719a, null, y2.m.b(-663987828, true, new er.r() { // from class: nf1.b1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.t0(f0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.n.f135739a, null, y2.m.b(1279984077, true, new er.r() { // from class: nf1.c1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.w0(f0Var, sVar, aVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.o.f135741a, null, y2.m.b(-1071011314, true, new er.r() { // from class: nf1.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.z0(f0Var, sVar, aVar2, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.p.f135743a, null, y2.m.b(872960591, true, new er.r() { // from class: nf1.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.C0(sVar, aVar3, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f1(f00.s sVar, cf1.d.b bVar) {
        if (fr.t.c(bVar, cf1.d.b.a.f25632a)) {
            sVar.c();
        } else if (fr.t.c(bVar, cf1.d.b.c.f25634a)) {
            f00.s.i(sVar, a.C3352a.f135713a, null, null, 6, null);
        } else {
            if (!fr.t.c(bVar, cf1.d.b.C0685b.f25633a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, a.h.f135727a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(pg1.f0 f0Var, p136y9.e0 e0Var, p136y9.y0 y0Var, Bundle bundle) {
        a aVarA;
        String strU = y0Var.u();
        if (strU == null || (aVarA = a.INSTANCE.a(strU)) == null) {
            return;
        }
        f0Var.B3(aVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g1(pg1.f0 f0Var, er.a aVar, er.a aVar2, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.a aVar3, int i15, p076m2.r rVar, int i16) {
        d0(f0Var, aVar, aVar2, lVar, lVar2, lVar3, lVar4, aVar3, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(final f00.s sVar, final er.a aVar, final pg1.f0 f0Var, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1137036115, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:94)");
        }
        f00.r.o(wVar, fr.q0.c(mg1.u.class), sVar.g(ya1.f.f225723a), y2.m.d(1848144196, true, new er.q() { // from class: nf1.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.i0(aVar, f0Var, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h1.f135789a.c(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final er.a aVar, final pg1.f0 f0Var, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1848144196, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:98)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(f0Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.v0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.j0(aVar, f0Var, sVar, (mg1.j) obj);
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
    public static final oq.i0 j0(er.a aVar, pg1.f0 f0Var, f00.s sVar, mg1.j jVar) {
        if (fr.t.c(jVar, mg1.j.a.f126359a)) {
            aVar.a();
        } else {
            if (!(jVar instanceof mg1.j.SubmitApplication)) {
                throw new oq.p();
            }
            f0Var.Z7(new CompanyManagementEntryPointContractData(((mg1.j.SubmitApplication) jVar).getCompanyManagementEntryPoint()));
            f00.s.l(sVar, a.q.f135745a, new SetupData(f0Var), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(pg1.f0 f0Var, final f00.s sVar, er.a aVar, er.l lVar, er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(734619154, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:365)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: nf1.d0
                @Override // er.a
                public final Object a() {
                    return e1.l0(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar2 = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: nf1.e0
                @Override // er.a
                public final Object a() {
                    return e1.m0(sVar);
                }
            };
            rVar.v(objE2);
        }
        be1.i0.A(f0Var, aVar2, aVar, (er.a) objE2, lVar, lVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(f00.s sVar) {
        f00.s.i(sVar, a.C3352a.f135713a, null, null, 6, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(f00.s sVar) {
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(final pg1.f0 f0Var, final f00.s sVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-256964342, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:382)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.n
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.o0(f0Var, (kf1.n.a) obj);
                }
            };
            rVar.v(objE);
        }
        kf1.n nVar = (kf1.n) q7.d.c(fr.q0.c(kf1.n.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<kf1.a.d> bVarY1 = nVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.G(f0Var) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.o
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.p0(sVar, f0Var, lVar, lVar2, (kf1.a.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        kf1.g.d(nVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kf1.n o0(pg1.f0 f0Var, kf1.n.a aVar) {
        return aVar.a(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(f00.s sVar, pg1.f0 f0Var, er.l lVar, er.l lVar2, kf1.a.d dVar) {
        zx.a aVar;
        CompanyData companyData;
        CompanyData companyData2;
        if (fr.t.c(dVar, kf1.a.d.C2648a.f110488a)) {
            sVar.c();
        } else if (fr.t.c(dVar, kf1.a.d.C2649d.f110491a)) {
            CompanyDetailsContractData companyDetailsContractDataL0 = f0Var.L0();
            if (((companyDetailsContractDataL0 == null || (companyData2 = companyDetailsContractDataL0.getCompanyData()) == null) ? null : companyData2.getCompanyAbbreviatedName()) == null) {
                aVar = a.l.f135735a;
            } else {
                CompanyDetailsContractData companyDetailsContractDataL1 = f0Var.L0();
                aVar = (companyDetailsContractDataL1 == null || (companyData = companyDetailsContractDataL1.getCompanyData()) == null || !companyData.getHasNoEmail() || !f0Var.Q0().getIsCompanyNewContactEnabled()) ? a.n.f135739a : a.d.f135719a;
            }
            f00.s.i(sVar, aVar, null, null, 6, null);
        } else if (dVar instanceof kf1.a.d.Error) {
            lVar.b(((kf1.a.d.Error) dVar).getErrorData());
        } else {
            if (!(dVar instanceof kf1.a.d.GoToSearch)) {
                throw new oq.p();
            }
            lVar2.b(((kf1.a.d.GoToSearch) dVar).getModel());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(final pg1.f0 f0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1687007563, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:412)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.r0(f0Var, (ag1.o.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        ag1.o oVar = (ag1.o) q7.d.c(fr.q0.c(ag1.o.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ag1.b> bVarY1 = oVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.s0(sVar, (ag1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ag1.k.d(oVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ag1.o r0(pg1.f0 f0Var, ag1.o.a aVar) {
        CompanyData companyData;
        boolean isCompanyNewContactEnabled = f0Var.Q0().getIsCompanyNewContactEnabled();
        CompanyDetailsContractData companyDetailsContractDataL0 = f0Var.L0();
        boolean z15 = false;
        if (companyDetailsContractDataL0 != null && (companyData = companyDetailsContractDataL0.getCompanyData()) != null && companyData.getHasNoEmail()) {
            z15 = true;
        }
        return aVar.a(new ag1.SetupData(f0Var, isCompanyNewContactEnabled, z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(f00.s sVar, ag1.b bVar) {
        if (fr.t.c(bVar, ag1.b.a.f6226a)) {
            sVar.c();
        } else if (fr.t.c(bVar, ag1.b.c.f6228a)) {
            f00.s.i(sVar, a.n.f135739a, null, null, 6, null);
        } else {
            if (!fr.t.c(bVar, ag1.b.C0127b.f6227a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, a.d.f135719a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t0(final pg1.f0 f0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-663987828, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:439)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.u0(f0Var, (sf1.t.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        sf1.t tVar = (sf1.t) q7.d.c(fr.q0.c(sf1.t.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<sf1.g> bVarY1 = tVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.w
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.v0(sVar, (sf1.g) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        sf1.e.i(tVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sf1.t u0(pg1.f0 f0Var, sf1.t.a aVar) {
        return aVar.a(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(f00.s sVar, sf1.g gVar) {
        if (fr.t.c(gVar, sf1.g.a.f181149a)) {
            sVar.c();
        } else {
            if (!fr.t.c(gVar, sf1.g.b.f181150a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, a.n.f135739a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(final pg1.f0 f0Var, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1279984077, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:459)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.y
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.x0(f0Var, (ff1.u.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        ff1.u uVar = (ff1.u) q7.d.c(fr.q0.c(ff1.u.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ff1.d> bVarY1 = uVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.z
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.y0(sVar, aVar, (ff1.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ff1.p.k(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff1.u x0(pg1.f0 f0Var, ff1.u.a aVar) {
        return aVar.a(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(f00.s sVar, er.a aVar, ff1.d dVar) {
        if (fr.t.c(dVar, ff1.d.a.f62177a)) {
            sVar.c();
        } else if (fr.t.c(dVar, ff1.d.c.f62179a)) {
            f00.s.i(sVar, a.o.f135741a, null, null, 6, null);
        } else {
            if (!fr.t.c(dVar, ff1.d.b.f62178a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(final pg1.f0 f0Var, final f00.s sVar, final er.a aVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1071011314, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.CompanySuspensionWizardNavContent.<anonymous>.<anonymous>.<anonymous> (CompanySuspensionWizardNavContent.kt:481)");
        }
        boolean zG = rVar.G(f0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nf1.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.A0(f0Var, (fg1.u.a) obj);
                }
            };
            rVar.v(objE);
        }
        fg1.u uVar = (fg1.u) q7.d.c(fr.q0.c(fg1.u.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<fg1.l.e> bVarY1 = uVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nf1.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.B0(sVar, aVar, lVar, (fg1.l.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        fg1.k.k(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
