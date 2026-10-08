package iy2;

import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.DMSTerytDetail;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cb4.DialogData;
import cw3.IdentityPhotoData;
import ix2.SetupData;
import mv2.CustomErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p7.CreationExtras;
import st3.AddressTerytDetail;
import tt3.AddressSearchData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aé\u0001\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzx2/c$c;", "contract", "Lyx2/c;", "nestedViewModel", "Lkotlin/Function1;", "Ltt3/b;", "Loq/i0;", "goToSearch", "Lcb4/d;", "showDialog", "Lal0/g;", "goToSuccess", "Ldx3/a;", "showImagePreview", "Lmv2/a;", "goToCustomError", "Lkotlin/Function0;", "exitProcess", "Ljb4/b;", "goToError", "closeWizardProcess", "Lmv3/a$b;", "goToEdorAuth", "Lcw3/a;", "goToIdentityPhoto", "showCloseProcessDialog", "W", "(Lzx2/c$c;Lyx2/c;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Lm2/r;II)V", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, er.a aVar, sw2.a.InterfaceC4779a interfaceC4779a) {
        if (interfaceC4779a instanceof sw2.a.InterfaceC4779a.c) {
            f00.s.l(sVar, wv2.b1.j.f215358b, new SetupData(ix2.m.GUARDIAN, interfaceC6439c), null, 4, null);
        } else if (fr.t.c(interfaceC4779a, sw2.a.InterfaceC4779a.C4780a.f184954a)) {
            sVar.c();
        } else {
            if (!fr.t.c(interfaceC4779a, sw2.a.InterfaceC4779a.b.f184955a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-53776862, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:244)");
        }
        f00.r.o(wVar, fr.q0.c(ix2.y.class), sVar.g(wv2.b1.j.f215358b), y2.m.d(423190417, true, new er.q() { // from class: iy2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.C0(sVar, interfaceC6439c, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(423190417, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:251)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: iy2.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.D0(sVar, interfaceC6439c, aVar, (ix2.b) obj);
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
    public static final oq.i0 D0(f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, er.a aVar, ix2.b bVar) {
        if (bVar instanceof ix2.b.c) {
            f00.s.l(sVar, wv2.b1.l.f215360b, interfaceC6439c, null, 4, null);
        } else if (fr.t.c(bVar, ix2.b.a.f97614a)) {
            sVar.c();
        } else {
            if (!fr.t.c(bVar, ix2.b.C2293b.f97615a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(final f00.s sVar, final er.l lVar, final zx2.c.InterfaceC6439c interfaceC6439c, final yx2.c cVar, final er.l lVar2, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-858192127, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:270)");
        }
        f00.r.o(wVar, fr.q0.c(ox2.v.class), sVar.g(wv2.b1.l.f215360b), y2.m.d(-381224848, true, new er.q() { // from class: iy2.h0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.F0(lVar, sVar, interfaceC6439c, cVar, lVar2, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(final er.l lVar, final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final yx2.c cVar, final er.l lVar2, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-381224848, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:277)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.G(cVar) | rVar.W(lVar2) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: iy2.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.G0(lVar, sVar, interfaceC6439c, lVar2, aVar, cVar, (ox2.a.d) obj);
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
    public static final oq.i0 G0(er.l lVar, f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, er.l lVar2, er.a aVar, final yx2.c cVar, ox2.a.d dVar) {
        if (dVar instanceof ox2.a.d.GoToSearch) {
            lVar.b(((ox2.a.d.GoToSearch) dVar).getModel());
        } else if (dVar instanceof ox2.a.d.GoToNextScreen) {
            if (((al0.g.Ward) ((ox2.a.d.GoToNextScreen) dVar).getOwnerWithAge()).getIsElectronicSignatureRequired()) {
                f00.s.l(sVar, wv2.b1.k.f215359b, interfaceC6439c, null, 4, null);
            } else {
                f00.s.l(sVar, wv2.b1.g.f215355b, new aw2.SetupData(interfaceC6439c, new er.a() { // from class: iy2.z0
                    @Override // er.a
                    public final Object a() {
                        return i1.H0(cVar);
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
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(yx2.c cVar) {
        cVar.q2();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final yx2.c cVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1662607392, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:309)");
        }
        f00.r.o(wVar, fr.q0.c(lx2.q.class), sVar.g(wv2.b1.k.f215359b), y2.m.d(-1185640113, true, new er.q() { // from class: iy2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.J0(sVar, interfaceC6439c, cVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final yx2.c cVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1185640113, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:316)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.G(cVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: iy2.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.K0(sVar, interfaceC6439c, aVar, cVar, (lx2.a) obj);
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
    public static final oq.i0 K0(f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, er.a aVar, final yx2.c cVar, lx2.a aVar2) {
        if (fr.t.c(aVar2, lx2.a.c.f121109a)) {
            f00.s.l(sVar, wv2.b1.g.f215355b, new aw2.SetupData(interfaceC6439c, new er.a() { // from class: iy2.a1
                @Override // er.a
                public final Object a() {
                    return i1.L0(cVar);
                }
            }), null, 4, null);
        } else if (fr.t.c(aVar2, lx2.a.C2963a.f121107a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar2, lx2.a.b.f121108a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(yx2.c cVar) {
        cVar.q2();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M0(final f00.s sVar, final er.l lVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1827944639, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:338)");
        }
        f00.r.o(wVar, fr.q0.c(aw2.m.class), sVar.g(wv2.b1.g.f215355b), y2.m.d(-1990055378, true, new er.q() { // from class: iy2.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.N0(lVar, sVar, interfaceC6439c, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.s(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0(final er.l lVar, final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1990055378, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:343)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: iy2.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.O0(lVar, sVar, interfaceC6439c, aVar, (aw2.a.InterfaceC0329a) obj);
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
    public static final oq.i0 O0(er.l lVar, f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, er.a aVar, aw2.a.InterfaceC0329a interfaceC0329a) {
        if (interfaceC0329a instanceof aw2.a.InterfaceC0329a.Error) {
            lVar.b(((aw2.a.InterfaceC0329a.Error) interfaceC0329a).getData());
        } else if (interfaceC0329a instanceof aw2.a.InterfaceC0329a.Next) {
            sVar.j(wv2.b1.a.f215349b, new jw2.SetupData(((aw2.a.InterfaceC0329a.Next) interfaceC0329a).getIdentityPhotoEnabled(), interfaceC6439c), wv2.b1.g.f215355b);
        } else {
            if (!fr.t.c(interfaceC0329a, aw2.a.InterfaceC0329a.C0330a.f14778a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1023529374, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:364)");
        }
        f00.r.o(wVar, fr.q0.c(jw2.p.class), sVar.g(wv2.b1.a.f215349b), y2.m.d(1500496653, true, new er.q() { // from class: iy2.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.Q0(sVar, interfaceC6439c, lVar, lVar2, lVar3, lVar4, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1500496653, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:371)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.W(lVar4) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: iy2.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.R0(sVar, interfaceC6439c, lVar, lVar2, lVar3, lVar4, aVar, (jw2.a.c) obj);
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
    public static final oq.i0 R0(f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.a aVar, jw2.a.c cVar) {
        if (fr.t.c(cVar, jw2.a.c.C2525a.f106261a)) {
            f00.s.l(sVar, wv2.b1.b.f215350b, interfaceC6439c, null, 4, null);
        } else if (cVar instanceof jw2.a.c.CorrespondenceAddress) {
            f00.s.l(sVar, wv2.b1.f.f215354b, ((jw2.a.c.CorrespondenceAddress) cVar).getData(), null, 4, null);
        } else if (cVar instanceof jw2.a.c.ShowNavigationDialog) {
            lVar.b(((jw2.a.c.ShowNavigationDialog) cVar).getDialogData());
        } else if (cVar instanceof jw2.a.c.ShowError) {
            lVar2.b(((jw2.a.c.ShowError) cVar).getData());
        } else if (cVar instanceof jw2.a.c.ShowImagePreview) {
            lVar3.b(((jw2.a.c.ShowImagePreview) cVar).getData());
        } else if (cVar instanceof jw2.a.c.IdentityPhoto) {
            lVar4.b(((jw2.a.c.IdentityPhoto) cVar).getData());
        } else if (fr.t.c(cVar, jw2.a.c.b.f106262a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, jw2.a.c.C2526c.f106263a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(zx2.c.InterfaceC6439c interfaceC6439c, yx2.c cVar, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.l lVar5, er.a aVar, er.l lVar6, er.a aVar2, er.l lVar7, er.l lVar8, er.a aVar3, int i15, int i16, p076m2.r rVar, int i17) {
        W(interfaceC6439c, cVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, aVar2, lVar7, lVar8, aVar3, rVar, g4.a(i15 | 1), g4.a(i16));
        return oq.i0.f148189a;
    }

    public static final void W(final zx2.c.InterfaceC6439c interfaceC6439c, final yx2.c cVar, final er.l<? super AddressSearchData, oq.i0> lVar, final er.l<? super DialogData, oq.i0> lVar2, final er.l<? super al0.g, oq.i0> lVar3, final er.l<? super dx3.a, oq.i0> lVar4, final er.l<? super CustomErrorData, oq.i0> lVar5, final er.a<oq.i0> aVar, final er.l<? super jb4.b, oq.i0> lVar6, final er.a<oq.i0> aVar2, final er.l<? super mv3.a.EdorAddressRequired, oq.i0> lVar7, final er.l<? super IdentityPhotoData, oq.i0> lVar8, final er.a<oq.i0> aVar3, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.l<? super AddressSearchData, oq.i0> lVar9;
        er.l<? super DialogData, oq.i0> lVar10;
        int i18;
        p076m2.r rVar2;
        final f00.s sVar;
        p076m2.r rVarH = rVar.h(1404560892);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(interfaceC6439c) : rVarH.G(interfaceC6439c) ? 4 : 2) | i15;
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
            i17 |= rVarH.G(aVar) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.G(lVar6) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= rVarH.G(aVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
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
            i18 |= rVarH.G(aVar3) ? 256 : 128;
        }
        int i19 = i18;
        if (rVarH.r(((i17 & 306783379) == 306783378 && (i19 & 147) == 146) ? false : true, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1404560892, i17, i19, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent (WardWizardNavContent.kt:84)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            wv2.b1.i iVar = wv2.b1.i.f215357b;
            boolean zG = ((1879048192 & i17) == 536870912) | ((i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(interfaceC6439c))) | ((29360128 & i17) == 8388608) | rVarH.G(sVarJ) | ((i17 & 896) == 256) | ((234881024 & i17) == 67108864) | ((i19 & 896) == 256) | ((3670016 & i17) == 1048576) | ((i17 & 7168) == 2048) | ((458752 & i17) == 131072) | ((i17 & 112) == 32 || ((i17 & 64) != 0 && rVarH.G(cVar))) | ((i19 & 112) == 32) | ((i17 & 57344) == 16384) | ((i19 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                final er.l<? super AddressSearchData, oq.i0> lVar11 = lVar9;
                rVar2 = rVarH;
                sVar = sVarJ;
                final er.l<? super DialogData, oq.i0> lVar12 = lVar10;
                er.l lVar13 = new er.l() { // from class: iy2.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i1.X(interfaceC6439c, aVar2, aVar, sVar, lVar11, lVar6, aVar3, lVar5, lVar12, lVar4, cVar, lVar8, lVar3, lVar7, (p136y9.d1) obj);
                    }
                };
                rVar2.v(lVar13);
                objE = lVar13;
            } else {
                rVar2 = rVarH;
                sVar = sVarJ;
            }
            f00.d0.j(sVar, iVar, (er.l) objE, rVar2, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: iy2.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i1.S0(interfaceC6439c, cVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, aVar2, lVar7, lVar8, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final zx2.c.InterfaceC6439c interfaceC6439c, final er.a aVar, final er.a aVar2, final f00.s sVar, final er.l lVar, final er.l lVar2, final er.a aVar3, final er.l lVar3, final er.l lVar4, final er.l lVar5, final yx2.c cVar, final er.l lVar6, final er.l lVar7, final er.l lVar8, p136y9.d1 d1Var) {
        f00.r.u(d1Var, wv2.b1.i.f215357b, null, y2.m.b(-1988211331, true, new er.r() { // from class: iy2.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.Y(interfaceC6439c, aVar, aVar2, sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.c.f215351b, null, y2.m.b(-1131083098, true, new er.r() { // from class: iy2.f1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.c0(sVar, interfaceC6439c, lVar2, aVar2, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.d.f215352b, null, y2.m.b(-1935498363, true, new er.r() { // from class: iy2.g1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.s0(sVar, interfaceC6439c, lVar3, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.h.f215356b, null, y2.m.b(1555053668, true, new er.r() { // from class: iy2.h1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.v0(sVar, lVar4, lVar2, lVar5, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.n.f215362b, null, y2.m.b(750638403, true, new er.r() { // from class: iy2.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.y0(sVar, interfaceC6439c, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.j.f215358b, null, y2.m.b(-53776862, true, new er.r() { // from class: iy2.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.B0(sVar, interfaceC6439c, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.l.f215360b, null, y2.m.b(-858192127, true, new er.r() { // from class: iy2.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.E0(sVar, lVar, interfaceC6439c, cVar, lVar2, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.k.f215359b, null, y2.m.b(-1662607392, true, new er.r() { // from class: iy2.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.I0(sVar, interfaceC6439c, cVar, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.g.f215355b, null, y2.m.b(1827944639, true, new er.r() { // from class: iy2.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.M0(sVar, lVar2, interfaceC6439c, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.a.f215349b, null, y2.m.b(1023529374, true, new er.r() { // from class: iy2.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.P0(sVar, interfaceC6439c, lVar4, lVar2, lVar5, lVar6, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.b.f215350b, null, y2.m.b(-321665626, true, new er.r() { // from class: iy2.t0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.f0(sVar, lVar4, lVar2, lVar5, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.f.f215354b, null, y2.m.b(-1126080891, true, new er.r() { // from class: iy2.c1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.i0(sVar, aVar3, lVar2, interfaceC6439c, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.e.f215353b, null, y2.m.b(-1930496156, true, new er.r() { // from class: iy2.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.l0(sVar, aVar3, interfaceC6439c, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, wv2.b1.m.f215361b, null, y2.m.b(1560055875, true, new er.r() { // from class: iy2.e1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i1.o0(sVar, lVar7, lVar2, lVar8, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final zx2.c.InterfaceC6439c interfaceC6439c, final er.a aVar, final er.a aVar2, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1988211331, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:94)");
        }
        boolean zG = rVar.G(interfaceC6439c);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: iy2.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.Z(interfaceC6439c, (gx2.a.InterfaceC1773a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        final gx2.a aVar3 = (gx2.a) q7.d.c(fr.q0.c(gx2.a.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        f00.r.r(wVar, wv2.b1.i.f215357b, aVar3.Z8(), y2.m.d(805773896, true, new er.q() { // from class: iy2.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.a0(aVar, aVar2, aVar3, sVar, interfaceC6439c, lVar, (py3.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, (i16 & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gx2.a Z(zx2.c.InterfaceC6439c interfaceC6439c, gx2.a.InterfaceC1773a interfaceC1773a) {
        return (gx2.a) interfaceC1773a.a(interfaceC6439c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final er.a aVar, final er.a aVar2, final gx2.a aVar3, final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.l lVar, py3.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(805773896, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:102)");
        }
        xw.b<py3.d.a> bVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.G(aVar3) | rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar2 = new er.l() { // from class: iy2.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.b0(aVar, aVar2, aVar3, lVar, sVar, interfaceC6439c, (py3.d.a) obj);
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
    public static final oq.i0 b0(er.a aVar, er.a aVar2, gx2.a aVar3, er.l lVar, f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, py3.d.a aVar4) {
        if (fr.t.c(aVar4, py3.d.a.C4046a.f163265a)) {
            aVar.a();
        } else if (fr.t.c(aVar4, py3.d.a.b.f163266a)) {
            aVar2.a();
        } else if (aVar4 instanceof py3.d.a.OfficeSelected) {
            aVar3.b9(((py3.d.a.OfficeSelected) aVar4).getOffice());
            oq.i0 i0Var = oq.i0.f148189a;
            f00.s.l(sVar, wv2.b1.c.f215351b, interfaceC6439c, null, 4, null);
        } else {
            if (!(aVar4 instanceof py3.d.a.Search)) {
                throw new oq.p();
            }
            lVar.b(aVar3.a9(((py3.d.a.Search) aVar4).getModel()));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.l lVar, final er.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1131083098, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:128)");
        }
        f00.r.o(wVar, fr.q0.c(pw2.l.class), sVar.g(wv2.b1.c.f215351b), y2.m.d(-654115819, true, new er.q() { // from class: iy2.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.d0(sVar, interfaceC6439c, lVar, aVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.l lVar, final er.a aVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-654115819, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:135)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.W(lVar) | rVar.W(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar2 = new er.l() { // from class: iy2.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.e0(sVar, interfaceC6439c, lVar, aVar, aVar2, (pw2.a.c) obj);
                }
            };
            rVar.v(lVar2);
            objE = lVar2;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, er.l lVar, er.a aVar, er.a aVar2, pw2.a.c cVar) {
        if (cVar instanceof pw2.a.c.GoToNextScreen) {
            f00.s.l(sVar, wv2.b1.h.f215356b, interfaceC6439c, null, 4, null);
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
    public static final oq.i0 f0(final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-321665626, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:399)");
        }
        f00.r.o(wVar, fr.q0.c(gw2.l0.class), sVar.g(wv2.b1.b.f215350b), y2.m.d(1579418135, true, new er.q() { // from class: iy2.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.g0(lVar, lVar2, sVar, lVar3, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final er.l lVar, final er.l lVar2, final f00.s sVar, final er.l lVar3, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1579418135, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:406)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.W(lVar2) | rVar.G(sVar) | rVar.W(lVar3) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: iy2.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.h0(lVar, lVar2, sVar, lVar3, aVar, (gw2.c) obj);
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
    public static final oq.i0 h0(er.l lVar, er.l lVar2, f00.s sVar, er.l lVar3, er.a aVar, gw2.c cVar) {
        if (cVar instanceof gw2.c.ShowDialog) {
            lVar.b(((gw2.c.ShowDialog) cVar).getDialogData());
        } else if (cVar instanceof gw2.c.ShowError) {
            lVar2.b(((gw2.c.ShowError) cVar).getData());
        } else if (cVar instanceof gw2.c.GoToNextScreen) {
            f00.s.l(sVar, wv2.b1.f.f215354b, ((gw2.c.GoToNextScreen) cVar).getData(), null, 4, null);
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
    public static final oq.i0 i0(final f00.s sVar, final er.a aVar, final er.l lVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1126080891, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:428)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final ax2.a aVar2 = (ax2.a) q7.d.c(fr.q0.c(ax2.a.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        wv2.b1.f fVar2 = wv2.b1.f.f215354b;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), y2.m.d(-1613630634, true, new er.q() { // from class: iy2.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.j0(aVar, sVar, lVar, interfaceC6439c, aVar2, lVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final er.a aVar, final f00.s sVar, final er.l lVar, final zx2.c.InterfaceC6439c interfaceC6439c, final ax2.a aVar2, final er.l lVar2, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1613630634, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:436)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(lVar) | rVar.G(interfaceC6439c) | rVar.G(aVar2) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: iy2.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.k0(aVar, sVar, lVar, interfaceC6439c, aVar2, lVar2, (st3.f.a) obj);
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
    public static final oq.i0 k0(er.a aVar, f00.s sVar, er.l lVar, zx2.c.InterfaceC6439c interfaceC6439c, ax2.a aVar2, er.l lVar2, st3.f.a aVar3) {
        if (aVar3 instanceof st3.f.a.Close) {
            aVar.a();
        } else if (aVar3 instanceof st3.f.a.Back) {
            sVar.c();
        } else if (aVar3 instanceof st3.f.a.GoToError) {
            lVar.b(((st3.f.a.GoToError) aVar3).getErrorData());
        } else if (aVar3 instanceof st3.f.a.GoToNextScreen) {
            st3.f.a.GoToNextScreen goToNextScreen = (st3.f.a.GoToNextScreen) aVar3;
            DMSTerytDetail dMSTerytDetailD = kv2.a.d(goToNextScreen.getResult().getProvince());
            DMSTerytDetail dMSTerytDetailD2 = kv2.a.d(goToNextScreen.getResult().getCounty());
            DMSTerytDetail dMSTerytDetailD3 = kv2.a.d(goToNextScreen.getResult().getCommunity());
            DMSTerytDetail dMSTerytDetailD4 = kv2.a.d(goToNextScreen.getResult().getCity());
            String postalCode = goToNextScreen.getResult().getPostalCode();
            AddressTerytDetail street = goToNextScreen.getResult().getStreet();
            interfaceC6439c.A0(new BECorrespondenceAddressData(dMSTerytDetailD, dMSTerytDetailD2, dMSTerytDetailD3, dMSTerytDetailD4, postalCode, street != null ? kv2.a.d(street) : null, goToNextScreen.getResult().getBuildingNumber(), goToNextScreen.getResult().getApartmentNumber()));
            f00.s.l(sVar, wv2.b1.e.f215353b, aVar2.Z8(interfaceC6439c.z0()), null, 4, null);
        } else {
            if (!(aVar3 instanceof st3.f.a.GoToSearch)) {
                throw new oq.p();
            }
            lVar2.b(((st3.f.a.GoToSearch) aVar3).getModel());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, final er.a aVar, final zx2.c.InterfaceC6439c interfaceC6439c, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1930496156, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:473)");
        }
        wv2.b1.e eVar = wv2.b1.e.f215353b;
        f00.r.r(wVar, eVar, sVar.g(eVar), y2.m.d(-1889828872, true, new er.q() { // from class: iy2.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.m0(sVar, aVar, interfaceC6439c, (ru3.a) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, final er.a aVar, final zx2.c.InterfaceC6439c interfaceC6439c, ru3.a aVar2, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1889828872, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:480)");
        }
        xw.b<ru3.a.AbstractC4497a> bVarY1 = aVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.G(interfaceC6439c);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: iy2.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.n0(sVar, aVar, interfaceC6439c, (ru3.a.AbstractC4497a) obj);
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
    public static final oq.i0 n0(f00.s sVar, er.a aVar, zx2.c.InterfaceC6439c interfaceC6439c, ru3.a.AbstractC4497a abstractC4497a) {
        if (abstractC4497a instanceof ru3.a.AbstractC4497a.Back) {
            sVar.c();
        } else if (abstractC4497a instanceof ru3.a.AbstractC4497a.Close) {
            aVar.a();
        } else {
            if (!(abstractC4497a instanceof ru3.a.AbstractC4497a.Next)) {
                throw new oq.p();
            }
            ru3.a.AbstractC4497a.Next next = (ru3.a.AbstractC4497a.Next) abstractC4497a;
            interfaceC6439c.h(new BEContactDetailsData(next.getContactDetailsData().getPhoneNumber(), next.getContactDetailsData().getEmailAddress()));
            f00.s.l(sVar, wv2.b1.m.f215361b, interfaceC6439c, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1560055875, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:505)");
        }
        f00.r.o(wVar, fr.q0.c(rx2.o.class), sVar.g(wv2.b1.m.f215361b), y2.m.d(-833827660, true, new er.q() { // from class: iy2.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.p0(lVar, lVar2, lVar3, sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.u(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final er.l lVar, final er.l lVar2, final er.l lVar3, final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-833827660, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:512)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: iy2.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.q0(lVar, lVar2, lVar3, sVar, aVar, (rx2.a.c) obj);
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
    public static final oq.i0 q0(er.l lVar, er.l lVar2, er.l lVar3, f00.s sVar, er.a aVar, final rx2.a.c cVar) {
        if (cVar instanceof rx2.a.c.GoToSuccess) {
            lVar.b(((rx2.a.c.GoToSuccess) cVar).getApplicationOwnerWithAge());
        } else if (cVar instanceof rx2.a.c.GoToError) {
            lVar2.b(((rx2.a.c.GoToError) cVar).getErrorData());
        } else if (cVar instanceof rx2.a.c.GoToEdorAuth) {
            lVar3.b(new mv3.a.EdorAddressRequired(new er.l() { // from class: iy2.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.r0(cVar, (iy.b0) obj);
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
    public static final oq.i0 r0(rx2.a.c cVar, iy.b0 b0Var) {
        ((rx2.a.c.GoToEdorAuth) cVar).a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.l lVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1935498363, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:156)");
        }
        f00.r.o(wVar, fr.q0.c(ww2.q.class), sVar.g(wv2.b1.d.f215352b), y2.m.d(-1458531084, true, new er.q() { // from class: iy2.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.t0(sVar, interfaceC6439c, lVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.l lVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1458531084, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:163)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.W(lVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: iy2.v0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.u0(sVar, interfaceC6439c, lVar, aVar, (ww2.a) obj);
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
    public static final oq.i0 u0(f00.s sVar, zx2.c.InterfaceC6439c interfaceC6439c, er.l lVar, er.a aVar, ww2.a aVar2) {
        if (aVar2 instanceof ww2.a.d) {
            f00.s.l(sVar, wv2.b1.n.f215362b, new sw2.SetupData(sw2.e.GUARD, interfaceC6439c), null, 4, null);
        } else if (aVar2 instanceof ww2.a.CustomError) {
            lVar.b(((ww2.a.CustomError) aVar2).getData());
        } else if (fr.t.c(aVar2, ww2.a.C5725a.f215514a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar2, ww2.a.b.f215515a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1555053668, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:186)");
        }
        f00.r.o(wVar, fr.q0.c(dx2.t.class), sVar.g(wv2.b1.h.f215356b), y2.m.d(2032020947, true, new er.q() { // from class: iy2.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.w0(lVar, lVar2, lVar3, sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(final er.l lVar, final er.l lVar2, final er.l lVar3, final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2032020947, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:193)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: iy2.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.x0(lVar, lVar2, lVar3, sVar, aVar, (dx2.a.b) obj);
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
    public static final oq.i0 x0(er.l lVar, er.l lVar2, er.l lVar3, f00.s sVar, er.a aVar, dx2.a.b bVar) {
        if (bVar instanceof dx2.a.b.ShowDialog) {
            lVar.b(((dx2.a.b.ShowDialog) bVar).getDialogData());
        } else if (bVar instanceof dx2.a.b.ShowError) {
            lVar2.b(((dx2.a.b.ShowError) bVar).getData());
        } else if (bVar instanceof dx2.a.b.ShowImagePreview) {
            lVar3.b(((dx2.a.b.ShowImagePreview) bVar).getData());
        } else if (bVar instanceof dx2.a.b.c) {
            f00.s.l(sVar, wv2.b1.d.f215352b, yw2.a.WARD, null, 4, null);
        } else if (fr.t.c(bVar, dx2.a.b.C1042a.f45338a)) {
            sVar.c();
        } else {
            if (!fr.t.c(bVar, dx2.a.b.C1043b.f45339a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(750638403, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:215)");
        }
        f00.r.o(wVar, fr.q0.c(sw2.s.class), sVar.g(wv2.b1.n.f215362b), y2.m.d(1227605682, true, new er.q() { // from class: iy2.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i1.z0(sVar, interfaceC6439c, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f97880a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(final f00.s sVar, final zx2.c.InterfaceC6439c interfaceC6439c, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1227605682, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.ward.navcontent.WardWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WardWizardNavContent.kt:222)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(interfaceC6439c) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: iy2.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.A0(sVar, interfaceC6439c, aVar, (sw2.a.InterfaceC4779a) obj);
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
