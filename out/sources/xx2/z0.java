package xx2;

import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.DMSTerytDetail;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cb4.DialogData;
import cw3.IdentityPhotoData;
import mv2.CustomErrorData;
import mw2.SetupData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p7.CreationExtras;
import st3.AddressTerytDetail;
import tt3.AddressSearchData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aé\u0001\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzx2/c$a;", "contract", "Lyx2/c;", "nestedViewModel", "Lkotlin/Function1;", "Ltt3/b;", "Loq/i0;", "goToSearch", "Lcb4/d;", "showDialog", "Lal0/g;", "goToSuccess", "Ldx3/a;", "showImagePreview", "Lmv2/a;", "goToCustomError", "Lkotlin/Function0;", "exitProcess", "Ljb4/b;", "goToError", "closeWizardProcess", "Lmv3/a$b;", "goToEdorAuth", "Lcw3/a;", "goToIdentityPhoto", "showCloseProcessDialog", "Z", "(Lzx2/c$a;Lyx2/c;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Lm2/r;II)V", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(f00.s sVar, er.a aVar, zx2.c.a aVar2, ju3.d.a aVar3) {
        if (fr.t.c(aVar3, ju3.d.a.C2514a.f106013a)) {
            sVar.c();
        } else if (aVar3 instanceof ju3.d.a.ChildSelected) {
            ju3.d.a.ChildSelected childSelected = (ju3.d.a.ChildSelected) aVar3;
            ju3.e selectedChild = childSelected.getSelectedChild();
            wv2.q0.f fVar = (fr.t.c(selectedChild, ju3.e.a.f106016a) ? selectedChild : null) != null ? wv2.q0.f.f215422b : null;
            if (selectedChild instanceof ju3.e.Specific) {
                sVar.j(wv2.q0.d.f215420b, new SetupData(new mw2.l.Child(((ju3.e.Specific) childSelected.getSelectedChild()).getChildData()), aVar2), fVar);
            } else {
                sVar.j(wv2.q0.g.f215423b, yw2.a.CHILD, fVar);
            }
            oq.i0 i0Var = oq.i0.f148189a;
            aVar2.l(kv2.a.c(childSelected.getSelectedChild()));
        } else {
            if (!fr.t.c(aVar3, ju3.d.a.c.f106015a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(final f00.s sVar, final er.l lVar, final zx2.c.a aVar, final er.a aVar2, final er.l lVar2, final er.a aVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1220110766, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:209)");
        }
        f00.r.o(wVar, fr.q0.c(mw2.z.class), sVar.g(wv2.q0.d.f215420b), y2.m.d(-1327297635, true, new er.q() { // from class: xx2.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.C0(lVar, sVar, aVar, aVar2, lVar2, aVar3, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(final er.l lVar, final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, final er.l lVar2, final er.a aVar3, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1327297635, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:216)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(aVar) | rVar.W(aVar2) | rVar.W(lVar2) | rVar.W(aVar3);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: xx2.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.D0(lVar, sVar, aVar, aVar2, lVar2, aVar3, (mw2.d) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D0(er.l lVar, f00.s sVar, zx2.c.a aVar, er.a aVar2, er.l lVar2, er.a aVar3, mw2.d dVar) {
        if (dVar instanceof mw2.d.GoToError) {
            lVar.b(((mw2.d.GoToError) dVar).getErrorData());
        } else if (dVar instanceof mw2.d.f) {
            f00.s.l(sVar, wv2.q0.n.f215430b, aVar, null, 4, null);
        } else if (fr.t.c(dVar, mw2.d.a.f128822a)) {
            sVar.c();
        } else if (fr.t.c(dVar, mw2.d.b.f128823a)) {
            aVar2.a();
        } else if (dVar instanceof mw2.d.C3194d) {
            lVar2.b(((mw2.d.C3194d) dVar).a());
        } else {
            if (!fr.t.c(dVar, mw2.d.c.f128824a)) {
                throw new oq.p();
            }
            aVar3.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(final f00.s sVar, final zx2.c.a aVar, final er.l lVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1266582771, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:238)");
        }
        f00.r.o(wVar, fr.q0.c(ww2.q.class), sVar.g(wv2.q0.g.f215423b), y2.m.d(480976124, true, new er.q() { // from class: xx2.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.F0(sVar, aVar, lVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.s(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(final f00.s sVar, final zx2.c.a aVar, final er.l lVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(480976124, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:245)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar) | rVar.W(lVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.G0(sVar, aVar, lVar, aVar2, (ww2.a) obj);
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
    public static final oq.i0 G0(f00.s sVar, zx2.c.a aVar, er.l lVar, er.a aVar2, ww2.a aVar3) {
        if (aVar3 instanceof ww2.a.d) {
            f00.s.l(sVar, wv2.q0.e.f215421b, new sw2.SetupData(sw2.e.PARENT, aVar), null, 4, null);
        } else if (aVar3 instanceof ww2.a.CustomError) {
            lVar.b(((ww2.a.CustomError) aVar3).getData());
        } else if (fr.t.c(aVar3, ww2.a.C5725a.f215514a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar3, ww2.a.b.f215515a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(541690988, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:268)");
        }
        f00.r.o(wVar, fr.q0.c(sw2.s.class), sVar.g(wv2.q0.e.f215421b), y2.m.d(-2005717413, true, new er.q() { // from class: xx2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.I0(sVar, aVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.u(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I0(final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2005717413, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:275)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.J0(sVar, aVar, aVar2, (sw2.a.InterfaceC4779a) obj);
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
    public static final oq.i0 J0(f00.s sVar, zx2.c.a aVar, er.a aVar2, sw2.a.InterfaceC4779a interfaceC4779a) {
        if (interfaceC4779a instanceof sw2.a.InterfaceC4779a.c) {
            f00.s.l(sVar, wv2.q0.l.f215428b, new ix2.SetupData(ix2.m.PARENT, aVar), null, 4, null);
        } else if (fr.t.c(interfaceC4779a, sw2.a.InterfaceC4779a.C4780a.f184954a)) {
            sVar.c();
        } else {
            if (!fr.t.c(interfaceC4779a, sw2.a.InterfaceC4779a.b.f184955a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K0(final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1945002549, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:297)");
        }
        f00.r.o(wVar, fr.q0.c(ix2.y.class), sVar.g(wv2.q0.l.f215428b), y2.m.d(-197443654, true, new er.q() { // from class: xx2.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.L0(sVar, aVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-197443654, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:304)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.M0(sVar, aVar, aVar2, (ix2.b) obj);
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
    public static final oq.i0 M0(f00.s sVar, zx2.c.a aVar, er.a aVar2, ix2.b bVar) {
        if (bVar instanceof ix2.b.c) {
            f00.s.l(sVar, wv2.q0.n.f215430b, aVar, null, 4, null);
        } else if (fr.t.c(bVar, ix2.b.a.f97614a)) {
            sVar.c();
        } else {
            if (!fr.t.c(bVar, ix2.b.C2293b.f97615a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0(final f00.s sVar, final er.l lVar, final zx2.c.a aVar, final yx2.c cVar, final er.l lVar2, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-136728790, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:323)");
        }
        f00.r.o(wVar, fr.q0.c(ox2.v.class), sVar.g(wv2.q0.n.f215430b), y2.m.d(1610830105, true, new er.q() { // from class: xx2.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.O0(lVar, sVar, aVar, cVar, lVar2, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0(final er.l lVar, final f00.s sVar, final zx2.c.a aVar, final yx2.c cVar, final er.l lVar2, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1610830105, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:330)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(aVar) | rVar.G(cVar) | rVar.W(lVar2) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: xx2.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.P0(lVar, sVar, aVar, lVar2, aVar2, cVar, (ox2.a.d) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(er.l lVar, f00.s sVar, zx2.c.a aVar, er.l lVar2, er.a aVar2, final yx2.c cVar, ox2.a.d dVar) {
        if (dVar instanceof ox2.a.d.GoToSearch) {
            lVar.b(((ox2.a.d.GoToSearch) dVar).getModel());
        } else if (dVar instanceof ox2.a.d.GoToNextScreen) {
            if (((al0.g.Child) ((ox2.a.d.GoToNextScreen) dVar).getOwnerWithAge()).getIsElectronicSignatureRequired()) {
                f00.s.l(sVar, wv2.q0.m.f215429b, aVar, null, 4, null);
            } else {
                f00.s.l(sVar, wv2.q0.j.f215426b, new aw2.SetupData(aVar, new er.a() { // from class: xx2.r0
                    @Override // er.a
                    public final Object a() {
                        return z0.Q0(cVar);
                    }
                }), null, 4, null);
            }
        } else if (fr.t.c(dVar, ox2.a.d.C3709a.f150483a)) {
            sVar.c();
        } else if (dVar instanceof ox2.a.d.GoToError) {
            lVar2.b(((ox2.a.d.GoToError) dVar).getError());
        } else {
            if (!fr.t.c(dVar, ox2.a.d.b.f150484a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(yx2.c cVar) {
        cVar.q2();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R0(final f00.s sVar, final zx2.c.a aVar, final yx2.c cVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1671544969, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:363)");
        }
        f00.r.o(wVar, fr.q0.c(lx2.q.class), sVar.g(wv2.q0.m.f215429b), y2.m.d(-875863432, true, new er.q() { // from class: xx2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.S0(sVar, aVar, cVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(final f00.s sVar, final zx2.c.a aVar, final yx2.c cVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-875863432, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:370)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar) | rVar.G(cVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.T0(sVar, aVar, aVar2, cVar, (lx2.a) obj);
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
    public static final oq.i0 T0(f00.s sVar, zx2.c.a aVar, er.a aVar2, final yx2.c cVar, lx2.a aVar3) {
        if (fr.t.c(aVar3, lx2.a.c.f121109a)) {
            f00.s.l(sVar, wv2.q0.j.f215426b, new aw2.SetupData(aVar, new er.a() { // from class: xx2.q0
                @Override // er.a
                public final Object a() {
                    return z0.U0(cVar);
                }
            }), null, 4, null);
        } else if (fr.t.c(aVar3, lx2.a.C2963a.f121107a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar3, lx2.a.b.f121108a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(yx2.c cVar) {
        cVar.q2();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V0(final f00.s sVar, final er.l lVar, final zx2.c.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-815148568, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:392)");
        }
        f00.r.o(wVar, fr.q0.c(aw2.m.class), sVar.g(wv2.q0.j.f215426b), y2.m.d(932410327, true, new er.q() { // from class: xx2.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.W0(lVar, sVar, aVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W0(final er.l lVar, final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(932410327, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:397)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.X0(lVar, sVar, aVar, aVar2, (aw2.a.InterfaceC0329a) obj);
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
    public static final oq.i0 X0(er.l lVar, f00.s sVar, zx2.c.a aVar, er.a aVar2, aw2.a.InterfaceC0329a interfaceC0329a) {
        if (interfaceC0329a instanceof aw2.a.InterfaceC0329a.Error) {
            lVar.b(((aw2.a.InterfaceC0329a.Error) interfaceC0329a).getData());
        } else if (interfaceC0329a instanceof aw2.a.InterfaceC0329a.Next) {
            sVar.j(wv2.q0.a.f215417b, new jw2.SetupData(((aw2.a.InterfaceC0329a.Next) interfaceC0329a).getIdentityPhotoEnabled(), aVar), wv2.q0.j.f215426b);
        } else {
            if (!fr.t.c(interfaceC0329a, aw2.a.InterfaceC0329a.C0330a.f14778a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y0(zx2.c.a aVar, yx2.c cVar, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.l lVar5, er.a aVar2, er.l lVar6, er.a aVar3, er.l lVar7, er.l lVar8, er.a aVar4, int i15, int i16, p076m2.r rVar, int i17) {
        Z(aVar, cVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, lVar7, lVar8, aVar4, rVar, g4.a(i15 | 1), g4.a(i16));
        return oq.i0.f148189a;
    }

    public static final void Z(final zx2.c.a aVar, final yx2.c cVar, final er.l<? super AddressSearchData, oq.i0> lVar, final er.l<? super DialogData, oq.i0> lVar2, final er.l<? super al0.g, oq.i0> lVar3, final er.l<? super dx3.a, oq.i0> lVar4, final er.l<? super CustomErrorData, oq.i0> lVar5, final er.a<oq.i0> aVar2, final er.l<? super jb4.b, oq.i0> lVar6, final er.a<oq.i0> aVar3, final er.l<? super mv3.a.EdorAddressRequired, oq.i0> lVar7, final er.l<? super IdentityPhotoData, oq.i0> lVar8, final er.a<oq.i0> aVar4, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.l<? super AddressSearchData, oq.i0> lVar9;
        er.l<? super DialogData, oq.i0> lVar10;
        int i18;
        p076m2.r rVar2;
        final f00.s sVar;
        p076m2.r rVarH = rVar.h(-1172142266);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            lVar9 = lVar;
            i17 |= rVarH.G(lVar9) ? 256 : 128;
        } else {
            lVar9 = lVar;
        }
        if ((i15 & 3072) == 0) {
            lVar10 = lVar2;
            i17 |= rVarH.G(lVar10) ? 2048 : 1024;
        } else {
            lVar10 = lVar2;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.G(lVar3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i15 & 196608) == 0) {
            i17 |= rVarH.G(lVar4) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= rVarH.G(lVar5) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= rVarH.G(aVar2) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.G(lVar6) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= rVarH.G(aVar3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (rVarH.G(lVar7) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.G(lVar8) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.G(aVar4) ? 256 : 128;
        }
        int i19 = i18;
        if (rVarH.r(((i17 & 306783379) == 306783378 && (i19 & 147) == 146) ? false : true, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1172142266, i17, i19, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent (ChildWizardNavContent.kt:88)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            wv2.q0.k kVar = wv2.q0.k.f215427b;
            boolean zG = ((1879048192 & i17) == 536870912) | ((i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(aVar))) | ((29360128 & i17) == 8388608) | rVarH.G(sVarJ) | ((i17 & 896) == 256) | ((234881024 & i17) == 67108864) | ((i19 & 896) == 256) | ((3670016 & i17) == 1048576) | ((i17 & 112) == 32 || ((i17 & 64) != 0 && rVarH.G(cVar))) | ((i17 & 7168) == 2048) | ((458752 & i17) == 131072) | ((i19 & 112) == 32) | ((i17 & 57344) == 16384) | ((i19 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                final er.l<? super AddressSearchData, oq.i0> lVar11 = lVar9;
                rVar2 = rVarH;
                sVar = sVarJ;
                final er.l<? super DialogData, oq.i0> lVar12 = lVar10;
                er.l lVar13 = new er.l() { // from class: xx2.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z0.a0(aVar, aVar3, aVar2, sVar, lVar11, lVar6, aVar4, lVar5, cVar, lVar12, lVar4, lVar8, lVar3, lVar7, (p136y9.d1) obj);
                    }
                };
                rVar2.v(lVar13);
                objE = lVar13;
            } else {
                rVar2 = rVarH;
                sVar = sVarJ;
            }
            f00.d0.j(sVar, kVar, (er.l) objE, rVar2, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xx2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z0.Y0(aVar, cVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, lVar7, lVar8, aVar4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final zx2.c.a aVar, final er.a aVar2, final er.a aVar3, final f00.s sVar, final er.l lVar, final er.l lVar2, final er.a aVar4, final er.l lVar3, final yx2.c cVar, final er.l lVar4, final er.l lVar5, final er.l lVar6, final er.l lVar7, final er.l lVar8, p136y9.d1 d1Var) {
        f00.r.u(d1Var, wv2.q0.k.f215427b, null, y2.m.b(1333216839, true, new er.r() { // from class: xx2.w
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.b0(aVar, aVar2, aVar3, sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.c.f215419b, null, y2.m.b(1898530544, true, new er.r() { // from class: xx2.x0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.f0(sVar, lVar2, aVar3, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.f.f215422b, null, y2.m.b(-588162993, true, new er.r() { // from class: xx2.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.y0(sVar, aVar, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.d.f215420b, null, y2.m.b(1220110766, true, new er.r() { // from class: xx2.b
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.B0(sVar, lVar2, aVar, aVar3, lVar3, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.g.f215423b, null, y2.m.b(-1266582771, true, new er.r() { // from class: xx2.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.E0(sVar, aVar, lVar3, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.e.f215421b, null, y2.m.b(541690988, true, new er.r() { // from class: xx2.d
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.H0(sVar, aVar, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.l.f215428b, null, y2.m.b(-1945002549, true, new er.r() { // from class: xx2.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.K0(sVar, aVar, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.n.f215430b, null, y2.m.b(-136728790, true, new er.r() { // from class: xx2.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.N0(sVar, lVar, aVar, cVar, lVar2, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.m.f215429b, null, y2.m.b(1671544969, true, new er.r() { // from class: xx2.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.R0(sVar, aVar, cVar, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.j.f215426b, null, y2.m.b(-815148568, true, new er.r() { // from class: xx2.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.V0(sVar, lVar2, aVar, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.a.f215417b, null, y2.m.b(-1651342864, true, new er.r() { // from class: xx2.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.i0(sVar, lVar4, lVar2, lVar5, lVar6, aVar, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.b.f215418b, null, y2.m.b(156930895, true, new er.r() { // from class: xx2.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.l0(sVar, lVar4, lVar2, lVar5, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.i.f215425b, null, y2.m.b(1965204654, true, new er.r() { // from class: xx2.u0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.o0(sVar, aVar4, lVar2, aVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.h.f215424b, null, y2.m.b(-521488883, true, new er.r() { // from class: xx2.v0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.r0(sVar, aVar4, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.q0.o.f215431b, null, y2.m.b(1286784876, true, new er.r() { // from class: xx2.w0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z0.u0(sVar, lVar7, lVar2, lVar8, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(final zx2.c.a aVar, final er.a aVar2, final er.a aVar3, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1333216839, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:98)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.k
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.c0(aVar, (gx2.a.InterfaceC1773a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        final gx2.a aVar4 = (gx2.a) q7.d.c(fr.q0.c(gx2.a.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        f00.r.r(wVar, wv2.q0.k.f215427b, aVar4.Z8(), y2.m.d(681754002, true, new er.q() { // from class: xx2.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.d0(aVar2, aVar3, aVar4, sVar, aVar, lVar, (py3.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, (i16 & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gx2.a c0(zx2.c.a aVar, gx2.a.InterfaceC1773a interfaceC1773a) {
        return (gx2.a) interfaceC1773a.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final er.a aVar, final er.a aVar2, final gx2.a aVar3, final f00.s sVar, final zx2.c.a aVar4, final er.l lVar, py3.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(681754002, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:106)");
        }
        xw.b<py3.d.a> bVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.G(aVar3) | rVar.G(sVar) | rVar.G(aVar4) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar2 = new er.l() { // from class: xx2.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.e0(aVar, aVar2, aVar3, lVar, sVar, aVar4, (py3.d.a) obj);
                }
            };
            rVar.v(lVar2);
            objE = lVar2;
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(er.a aVar, er.a aVar2, gx2.a aVar3, er.l lVar, f00.s sVar, zx2.c.a aVar4, py3.d.a aVar5) {
        if (fr.t.c(aVar5, py3.d.a.C4046a.f163265a)) {
            aVar.a();
        } else if (fr.t.c(aVar5, py3.d.a.b.f163266a)) {
            aVar2.a();
        } else if (aVar5 instanceof py3.d.a.OfficeSelected) {
            aVar3.b9(((py3.d.a.OfficeSelected) aVar5).getOffice());
            oq.i0 i0Var = oq.i0.f148189a;
            f00.s.l(sVar, wv2.q0.c.f215419b, aVar4, null, 4, null);
        } else {
            if (!(aVar5 instanceof py3.d.a.Search)) {
                throw new oq.p();
            }
            lVar.b(aVar3.a9(((py3.d.a.Search) aVar5).getModel()));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, final er.l lVar, final er.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1898530544, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:132)");
        }
        f00.r.o(wVar, fr.q0.c(pw2.l.class), sVar.g(wv2.q0.c.f215419b), y2.m.d(-648877857, true, new er.q() { // from class: xx2.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.g0(sVar, lVar, aVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, final er.l lVar, final er.a aVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-648877857, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:139)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar) | rVar.W(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.h0(sVar, lVar, aVar, aVar2, (pw2.a.c) obj);
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
    public static final oq.i0 h0(f00.s sVar, er.l lVar, er.a aVar, er.a aVar2, pw2.a.c cVar) {
        if (cVar instanceof pw2.a.c.GoToNextScreen) {
            f00.s.l(sVar, wv2.q0.f.f215422b, ((pw2.a.c.GoToNextScreen) cVar).getModel(), null, 4, null);
        } else if (cVar instanceof pw2.a.c.GoToError) {
            lVar.b(((pw2.a.c.GoToError) cVar).getErrorData());
        } else if (fr.t.c(cVar, pw2.a.c.b.f162994a)) {
            aVar.a();
        } else if (fr.t.c(cVar, pw2.a.c.C4033a.f162993a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, pw2.a.c.C4034c.f162995a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final zx2.c.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1651342864, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:418)");
        }
        f00.r.o(wVar, fr.q0.c(jw2.p.class), sVar.g(wv2.q0.a.f215417b), y2.m.d(983375329, true, new er.q() { // from class: xx2.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.j0(lVar, lVar2, lVar3, lVar4, sVar, aVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(983375329, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:425)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.W(lVar4) | rVar.G(sVar) | rVar.G(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.k0(lVar, lVar2, lVar3, lVar4, sVar, aVar, aVar2, (jw2.a.c) obj);
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
    public static final oq.i0 k0(er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, f00.s sVar, zx2.c.a aVar, er.a aVar2, jw2.a.c cVar) {
        if (cVar instanceof jw2.a.c.ShowNavigationDialog) {
            lVar.b(((jw2.a.c.ShowNavigationDialog) cVar).getDialogData());
        } else if (cVar instanceof jw2.a.c.ShowError) {
            lVar2.b(((jw2.a.c.ShowError) cVar).getData());
        } else if (cVar instanceof jw2.a.c.ShowImagePreview) {
            lVar3.b(((jw2.a.c.ShowImagePreview) cVar).getData());
        } else if (cVar instanceof jw2.a.c.IdentityPhoto) {
            lVar4.b(((jw2.a.c.IdentityPhoto) cVar).getData());
        } else if (fr.t.c(cVar, jw2.a.c.C2525a.f106261a)) {
            f00.s.l(sVar, wv2.q0.b.f215418b, aVar, null, 4, null);
        } else if (cVar instanceof jw2.a.c.CorrespondenceAddress) {
            f00.s.l(sVar, wv2.q0.i.f215425b, ((jw2.a.c.CorrespondenceAddress) cVar).getData(), null, 4, null);
        } else if (fr.t.c(cVar, jw2.a.c.b.f106262a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, jw2.a.c.C2526c.f106263a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(156930895, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:453)");
        }
        f00.r.o(wVar, fr.q0.c(gw2.l0.class), sVar.g(wv2.q0.b.f215418b), y2.m.d(-1503318208, true, new er.q() { // from class: xx2.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.m0(lVar, lVar2, sVar, lVar3, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final er.l lVar, final er.l lVar2, final f00.s sVar, final er.l lVar3, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1503318208, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:460)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.W(lVar2) | rVar.G(sVar) | rVar.W(lVar3) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: xx2.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.n0(lVar, lVar2, sVar, lVar3, aVar, (gw2.c) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(er.l lVar, er.l lVar2, f00.s sVar, er.l lVar3, er.a aVar, gw2.c cVar) {
        if (cVar instanceof gw2.c.ShowDialog) {
            lVar.b(((gw2.c.ShowDialog) cVar).getDialogData());
        } else if (cVar instanceof gw2.c.ShowError) {
            lVar2.b(((gw2.c.ShowError) cVar).getData());
        } else if (cVar instanceof gw2.c.GoToNextScreen) {
            f00.s.l(sVar, wv2.q0.i.f215425b, ((gw2.c.GoToNextScreen) cVar).getData(), null, 4, null);
        } else if (cVar instanceof gw2.c.ShowImagePreview) {
            lVar3.b(((gw2.c.ShowImagePreview) cVar).getData());
        } else if (fr.t.c(cVar, gw2.c.a.f77974a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, gw2.c.b.f77975a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, final er.a aVar, final er.l lVar, final zx2.c.a aVar2, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1965204654, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:482)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final ax2.a aVar3 = (ax2.a) q7.d.c(fr.q0.c(ax2.a.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        wv2.q0.i iVar = wv2.q0.i.f215425b;
        f00.r.r(wVar, iVar, sVar.g(iVar), y2.m.d(-1859491585, true, new er.q() { // from class: xx2.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.p0(aVar, sVar, lVar, aVar2, aVar3, lVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final er.a aVar, final f00.s sVar, final er.l lVar, final zx2.c.a aVar2, final ax2.a aVar3, final er.l lVar2, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1859491585, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:490)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(lVar) | rVar.G(aVar2) | rVar.G(aVar3) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: xx2.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.q0(aVar, sVar, lVar, aVar2, aVar3, lVar2, (st3.f.a) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(er.a aVar, f00.s sVar, er.l lVar, zx2.c.a aVar2, ax2.a aVar3, er.l lVar2, st3.f.a aVar4) {
        if (aVar4 instanceof st3.f.a.Close) {
            aVar.a();
        } else if (aVar4 instanceof st3.f.a.Back) {
            sVar.c();
        } else if (aVar4 instanceof st3.f.a.GoToError) {
            lVar.b(((st3.f.a.GoToError) aVar4).getErrorData());
        } else if (aVar4 instanceof st3.f.a.GoToNextScreen) {
            st3.f.a.GoToNextScreen goToNextScreen = (st3.f.a.GoToNextScreen) aVar4;
            DMSTerytDetail dMSTerytDetailD = kv2.a.d(goToNextScreen.getResult().getProvince());
            DMSTerytDetail dMSTerytDetailD2 = kv2.a.d(goToNextScreen.getResult().getCounty());
            DMSTerytDetail dMSTerytDetailD3 = kv2.a.d(goToNextScreen.getResult().getCommunity());
            DMSTerytDetail dMSTerytDetailD4 = kv2.a.d(goToNextScreen.getResult().getCity());
            String postalCode = goToNextScreen.getResult().getPostalCode();
            AddressTerytDetail street = goToNextScreen.getResult().getStreet();
            aVar2.A0(new BECorrespondenceAddressData(dMSTerytDetailD, dMSTerytDetailD2, dMSTerytDetailD3, dMSTerytDetailD4, postalCode, street != null ? kv2.a.d(street) : null, goToNextScreen.getResult().getBuildingNumber(), goToNextScreen.getResult().getApartmentNumber()));
            f00.s.l(sVar, wv2.q0.h.f215424b, aVar3.Z8(aVar2.z0()), null, 4, null);
        } else {
            if (!(aVar4 instanceof st3.f.a.GoToSearch)) {
                throw new oq.p();
            }
            lVar2.b(((st3.f.a.GoToSearch) aVar4).getModel());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(final f00.s sVar, final er.a aVar, final zx2.c.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-521488883, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:527)");
        }
        wv2.q0.h hVar = wv2.q0.h.f215424b;
        f00.r.r(wVar, hVar, sVar.g(hVar), y2.m.d(1375261857, true, new er.q() { // from class: xx2.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.s0(sVar, aVar, aVar2, (ru3.a) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(final f00.s sVar, final er.a aVar, final zx2.c.a aVar2, ru3.a aVar3, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1375261857, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:534)");
        }
        xw.b<ru3.a.AbstractC4497a> bVarY1 = aVar3.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.G(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.t0(sVar, aVar, aVar2, (ru3.a.AbstractC4497a) obj);
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
    public static final oq.i0 t0(f00.s sVar, er.a aVar, zx2.c.a aVar2, ru3.a.AbstractC4497a abstractC4497a) {
        if (abstractC4497a instanceof ru3.a.AbstractC4497a.Back) {
            sVar.c();
        } else if (abstractC4497a instanceof ru3.a.AbstractC4497a.Close) {
            aVar.a();
        } else {
            if (!(abstractC4497a instanceof ru3.a.AbstractC4497a.Next)) {
                throw new oq.p();
            }
            ru3.a.AbstractC4497a.Next next = (ru3.a.AbstractC4497a.Next) abstractC4497a;
            aVar2.h(new BEContactDetailsData(next.getContactDetailsData().getPhoneNumber(), next.getContactDetailsData().getEmailAddress()));
            f00.s.l(sVar, wv2.q0.o.f215431b, aVar2, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u0(final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1286784876, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:559)");
        }
        f00.r.o(wVar, fr.q0.c(rx2.o.class), sVar.g(wv2.q0.o.f215431b), y2.m.d(-373464227, true, new er.q() { // from class: xx2.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.v0(lVar, lVar2, lVar3, sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l1.f221978a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(final er.l lVar, final er.l lVar2, final er.l lVar3, final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-373464227, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:566)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: xx2.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.w0(lVar, lVar2, lVar3, sVar, aVar, (rx2.a.c) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(er.l lVar, er.l lVar2, er.l lVar3, f00.s sVar, er.a aVar, final rx2.a.c cVar) {
        if (cVar instanceof rx2.a.c.GoToSuccess) {
            lVar.b(((rx2.a.c.GoToSuccess) cVar).getApplicationOwnerWithAge());
        } else if (cVar instanceof rx2.a.c.GoToError) {
            lVar2.b(((rx2.a.c.GoToError) cVar).getErrorData());
        } else if (cVar instanceof rx2.a.c.GoToEdorAuth) {
            lVar3.b(new mv3.a.EdorAddressRequired(new er.l() { // from class: xx2.t0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.x0(cVar, (iy.b0) obj);
                }
            }, null, 2, null));
        } else if (fr.t.c(cVar, rx2.a.c.C4510a.f176660a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, rx2.a.c.b.f176661a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x0(rx2.a.c cVar, iy.b0 b0Var) {
        ((rx2.a.c.GoToEdorAuth) cVar).a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-588162993, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:160)");
        }
        wv2.q0.f fVar2 = wv2.q0.f.f215422b;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), y2.m.d(557058891, true, new er.q() { // from class: xx2.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z0.z0(sVar, aVar, aVar2, (ju3.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(final f00.s sVar, final zx2.c.a aVar, final er.a aVar2, ju3.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(557058891, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.child.navcontent.ChildWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildWizardNavContent.kt:167)");
        }
        xw.b<ju3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xx2.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return z0.A0(sVar, aVar2, aVar, (ju3.d.a) obj);
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
}
