package p081n61;

import a91.SetupData;
import android.os.Bundle;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import c71.v;
import cl0.g0;
import d81.b;
import dx3.c;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import g81.DocumentPickerNavigationParams;
import i81.x;
import k71.j;
import mu.g;
import o61.u;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.e0;
import p136y9.g1;
import p136y9.w;
import p7.CreationExtras;
import p91.n;
import st3.AddressData;
import w91.a;
import w91.b0;
import x71.ChildPassportApplicationCorrespondenceCountryData;
import y2.m;
import y61.ChildPassportApplicationAttachmentsNavigationParams;
import y61.c0;
import y71.k;
import zx.d;

/* JADX INFO: renamed from: n61.z4, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "S1", "(Ler/a;Lm2/r;I)V", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: n61.z4$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133289a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SURNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.BIRTH_PLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f133289a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A2(final s sVar, final f5 f5Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-161019667, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1198)");
        }
        f00.r.o(wVar, q0.c(b0.class), sVar.g(d.p0.f132643a), m.d(-1800910180, true, new q() { // from class: n61.i4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.B2(f5Var, sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.O(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A3(f5 f5Var, s sVar, g91.a aVar) {
        if (fr.t.c(aVar, g91.a.C1624a.f71369a)) {
            d dVarQ9 = f5Var.Q9();
            d.y yVar = d.y.f132682a;
            if (fr.t.c(dVarQ9, yVar)) {
                s.l(sVar, yVar, f5Var, null, 4, null);
            } else {
                s.l(sVar, d.c.f132525a, f5Var, null, 4, null);
            }
        } else if (fr.t.c(aVar, g91.a.b.f71370a)) {
            f5Var.Z9();
        } else {
            if (!fr.t.c(aVar, g91.a.c.f71371a)) {
                throw new p();
            }
            s.l(sVar, d.e.C3292d.f132546a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.NEW_APPLICATION_MONEY_TRANSFER), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A4(s sVar, f5 f5Var, h71.a.c cVar) {
        if (fr.t.c(cVar, h71.a.c.C1878a.f81341a)) {
            s.l(sVar, d.t0.f132667a, new ea1.b.Initial(f5Var), null, 4, null);
        } else if (fr.t.c(cVar, h71.a.c.b.f81342a)) {
            f5Var.Z9();
        } else if (fr.t.c(cVar, h71.a.c.C1879c.f81343a)) {
            s.l(sVar, d.g.f132576a, f5Var, null, 4, null);
        } else if (fr.t.c(cVar, h71.a.c.d.f81344a)) {
            s.l(sVar, d.u.f132670a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(cVar, h71.a.c.e.f81345a)) {
                throw new p();
            }
            d.h hVar = d.h.f132582a;
            f5Var.V9(hVar.getRoute());
            sVar.j(d.u.f132670a, f5Var, hVar);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B2(final f5 f5Var, final s sVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1800910180, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1204)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.C2(f5Var, sVar, aVar, (a.d) obj);
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
    public static final i0 B3(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1234889256, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2005)");
        }
        d.r rVar2 = d.r.f132652a;
        f00.r.r(wVar, rVar2, sVar.g(rVar2), m.d(-1658297987, true, new q() { // from class: n61.t3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.C3(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B4(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1350671379, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:736)");
        }
        f00.r.o(wVar, q0.c(e71.r.class), sVar.g(d.g.f132576a), m.d(1783017566, true, new q() { // from class: n61.s4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.C4(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.e0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C2(f5 f5Var, s sVar, er.a aVar, w91.a.d dVar) {
        if (fr.t.c(dVar, w91.a.d.C5549a.f211160a)) {
            d dVarQ9 = f5Var.Q9();
            d.e.a aVar2 = d.e.a.f132537a;
            if (fr.t.c(dVarQ9, aVar2)) {
                sVar.j(aVar2, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.ABROAD_TREATMENT_CONFIRMATION), d.p0.f132643a);
            } else {
                d.e.C3293e c3293e = d.e.C3293e.f132549a;
                if (fr.t.c(dVarQ9, c3293e)) {
                    sVar.j(c3293e, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.OLD_APPLICATION_MONEY_TRANSFER), d.p0.f132643a);
                } else {
                    d.e.C3292d c3292d = d.e.C3292d.f132546a;
                    if (fr.t.c(dVarQ9, c3292d)) {
                        sVar.j(c3292d, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.NEW_APPLICATION_MONEY_TRANSFER), d.p0.f132643a);
                    } else {
                        d.e.i iVar = d.e.i.f132561a;
                        if (fr.t.c(dVarQ9, iVar)) {
                            sVar.j(iVar, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.TECHNICAL_ISSUE_CONFIRMATION), d.p0.f132643a);
                        } else {
                            d.y yVar = d.y.f132682a;
                            if (fr.t.c(dVarQ9, yVar)) {
                                s.l(sVar, yVar, f5Var, null, 4, null);
                            } else {
                                sVar.j(d.e0.f132567a, new SetupData(f5Var), d.p0.f132643a);
                            }
                        }
                    }
                }
            }
        } else if (fr.t.c(dVar, w91.a.d.b.f211161a)) {
            f5Var.Z9();
        } else if (fr.t.c(dVar, w91.a.d.c.f211162a)) {
            aVar.a();
        } else if (dVar instanceof w91.a.d.ToEdorAuth) {
            s.l(sVar, d.t.f132664a, ((w91.a.d.ToEdorAuth) dVar).getData(), null, 4, null);
        } else {
            if (!(dVar instanceof w91.a.d.MakePayment)) {
                throw new p();
            }
            s.l(sVar, d.d0.f132534a, ((w91.a.d.MakePayment) dVar).getPaymentData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C3(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1658297987, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2009)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.D3(sVar, (cb4.f.a) obj);
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
    public static final i0 C4(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1783017566, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:740)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.x
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.D4(sVar, f5Var, (e71.a.e) obj);
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
    public static final i0 D2(final s sVar, final f5 f5Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1759534822, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:476)");
        }
        f00.r.o(wVar, q0.c(s91.m.class), sVar.g(d.m0.f132613a), m.d(598256471, true, new q() { // from class: n61.e4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.E2(sVar, f5Var, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.p0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D3(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D4(s sVar, f5 f5Var, e71.a.e eVar) {
        if (fr.t.c(eVar, e71.a.e.c.f47928a)) {
            d.b0 b0Var = d.b0.f132522a;
            g0 passportOfficePlace = f5Var.I0().getPassportOfficePlace();
            if (passportOfficePlace == null) {
                passportOfficePlace = g0.UNKNOWN;
            }
            s.l(sVar, b0Var, new s81.SetupData(f5Var, passportOfficePlace), null, 4, null);
        } else if (fr.t.c(eVar, e71.a.e.C1113a.f47926a)) {
            sVar.j(d.h.f132582a, f5Var, d.g.f132576a);
        } else {
            if (!fr.t.c(eVar, e71.a.e.b.f47927a)) {
                throw new p();
            }
            f5Var.Z9();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E2(final s sVar, final f5 f5Var, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(598256471, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:482)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.F2(sVar, f5Var, aVar, (s91.a.InterfaceC4611a) obj);
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
    public static final i0 E3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1404140841, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2019)");
        }
        f00.r.o(wVar, q0.c(j91.l.class), sVar.g(d.i0.f132589a), m.d(-235749672, true, new q() { // from class: n61.q3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.F3(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.h0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    private static final void E4(final s sVar, final f5 f5Var, final er.a<i0> aVar, w wVar, final d.e eVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-922878420, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.getAttachmentsNavContent (ChildPassportApplicationNavContent.kt:1086)");
        }
        f00.r.o(wVar, q0.c(c0.class), sVar.g(eVar), m.d(1806781853, true, new q() { // from class: n61.v3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.F4(eVar, sVar, f5Var, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.V(), rVar, (i15 & 14) | 27648);
        if (t.k()) {
            t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F2(s sVar, f5 f5Var, er.a aVar, s91.a.InterfaceC4611a interfaceC4611a) {
        if (fr.t.c(interfaceC4611a, s91.a.InterfaceC4611a.C4612a.f179401a)) {
            s.l(sVar, d.e0.f132567a, new SetupData(f5Var), null, 4, null);
        } else if (fr.t.c(interfaceC4611a, s91.a.InterfaceC4611a.b.f179402a)) {
            aVar.a();
        } else if (fr.t.c(interfaceC4611a, s91.a.InterfaceC4611a.c.f179403a)) {
            s.l(sVar, d.e.b.f132540a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.TEMPORARY_REASON), null, 4, null);
        } else {
            if (!fr.t.c(interfaceC4611a, s91.a.InterfaceC4611a.d.f179404a)) {
                throw new p();
            }
            s.l(sVar, d.n0.f132619a, f5Var, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F3(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-235749672, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2025)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.G3(f5Var, sVar, (j91.b) obj);
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
    public static final i0 F4(final d.e eVar, final s sVar, final f5 f5Var, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1806781853, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.getAttachmentsNavContent.<anonymous> (ChildPassportApplicationNavContent.kt:1093)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(eVar) | rVar.G(sVar) | rVar.G(f5Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.m
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.G4(eVar, sVar, f5Var, aVar, (y61.a.e) obj);
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
    public static final i0 G2(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(8231918, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1362)");
        }
        d.C3291d c3291d = d.C3291d.f132531a;
        f00.r.r(wVar, c3291d, sVar.g(c3291d), m.d(1721476072, true, new q() { // from class: n61.j3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.H2(sVar, (c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G3(f5 f5Var, s sVar, j91.b bVar) {
        if (fr.t.c(bVar, j91.b.a.f100413a)) {
            d dVarQ9 = f5Var.Q9();
            if (dVarQ9 instanceof d.k) {
                s.l(sVar, d.k.f132598a, f5Var.L9().getContactDetailsFormData(), null, 4, null);
            } else {
                if (!(dVarQ9 instanceof d.l)) {
                    throw new IllegalStateException(("There is no back stack navigation for destination: " + dVarQ9).toString());
                }
                s.l(sVar, d.l.f132604a, f5Var, null, 4, null);
            }
        } else if (fr.t.c(bVar, j91.b.C2357b.f100414a)) {
            f5Var.Z9();
        } else if (fr.t.c(bVar, j91.b.c.f100415a)) {
            s.l(sVar, d.e.a.f132537a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.ABROAD_TREATMENT_CONFIRMATION), null, 4, null);
        } else if (fr.t.c(bVar, j91.b.d.f100416a)) {
            s.l(sVar, d.e.c.f132543a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.KDR_CONFIRMATION), null, 4, null);
        } else if (fr.t.c(bVar, j91.b.e.f100417a)) {
            s.l(sVar, d.e.i.f132561a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.TECHNICAL_ISSUE_CONFIRMATION), null, 4, null);
        } else {
            if (!fr.t.c(bVar, j91.b.f.f100418a)) {
                throw new p();
            }
            s.l(sVar, d.c.f132525a, f5Var, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G4(d.e eVar, s sVar, f5 f5Var, er.a aVar, y61.a.e eVar2) {
        if (fr.t.c(eVar2, y61.a.e.C6011a.f224417a)) {
            if (fr.t.c(eVar, d.e.b.f132540a)) {
                sVar.j(d.m0.f132613a, f5Var, eVar);
            } else if (fr.t.c(eVar, d.e.h.f132558a) || fr.t.c(eVar, d.e.f.f132552a)) {
                sVar.k(d.j.f132592a, eVar);
            } else if (fr.t.c(eVar, d.e.a.f132537a) || fr.t.c(eVar, d.e.c.f132543a) || fr.t.c(eVar, d.e.i.f132561a)) {
                sVar.j(d.i0.f132589a, f5Var, eVar);
            } else {
                d.e.C3293e c3293e = d.e.C3293e.f132549a;
                if (fr.t.c(eVar, c3293e)) {
                    sVar.j(d.c.f132525a, f5Var, c3293e);
                } else {
                    d.e.C3292d c3292d = d.e.C3292d.f132546a;
                    if (fr.t.c(eVar, c3292d)) {
                        sVar.j(d.f0.f132573a, f5Var, c3292d);
                    }
                }
            }
        } else if (fr.t.c(eVar2, y61.a.e.c.f224419a)) {
            f5Var.Z9();
        } else if (eVar2 instanceof y61.a.e.ShowAttachmentPreview) {
            s.l(sVar, d.C3291d.f132531a, ((y61.a.e.ShowAttachmentPreview) eVar2).getData(), null, 4, null);
        } else if (fr.t.c(eVar2, y61.a.e.b.f224418a)) {
            aVar.a();
        } else if (fr.t.c(eVar2, y61.a.e.h.f224424a)) {
            s.l(sVar, d.l0.f132607a, f5Var, null, 4, null);
        } else if (fr.t.c(eVar2, y61.a.e.j.f224426a)) {
            s.l(sVar, d.t0.f132667a, new ea1.b.Initial(f5Var), null, 4, null);
        } else if (fr.t.c(eVar2, y61.a.e.i.f224425a)) {
            d.p0 p0Var = d.p0.f132643a;
            sVar.j(p0Var, new w91.SetupData(f5Var, false, 2, null), p0Var);
        } else if (fr.t.c(eVar2, y61.a.e.f.f224422a)) {
            s.l(sVar, d.m.f132610a, f5Var, null, 4, null);
        } else if (fr.t.c(eVar2, y61.a.e.C6012e.f224421a)) {
            s.l(sVar, d.c.f132525a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(eVar2, y61.a.e.g.f224423a)) {
                throw new p();
            }
            s.l(sVar, d.c0.f132528a, new x81.SetupData(f5Var.O9(), f5Var.C0()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H2(final s sVar, c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1721476072, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1368)");
        }
        xw.b<c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.I2(sVar, (c.a) obj);
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
    public static final i0 H3(final s sVar, final f5 f5Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2098037992, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:535)");
        }
        f00.r.o(wVar, q0.c(n.class), sVar.g(d.l0.f132607a), m.d(936759641, true, new q() { // from class: n61.x4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.I3(sVar, f5Var, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.j0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    private static final void H4(final s sVar, final f5 f5Var, w wVar, final d.o oVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1883196808, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.getCutNavContent (ChildPassportApplicationNavContent.kt:1326)");
        }
        f00.r.o(wVar, q0.c(k.class), sVar.g(oVar), m.d(-323379463, true, new q() { // from class: n61.q4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.I4(sVar, f5Var, oVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.U(), rVar, (i15 & 14) | 27648);
        if (t.k()) {
            t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I2(s sVar, c.a aVar) {
        if (!fr.t.c(aVar, c.a.C1047a.f45490a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I3(final s sVar, final f5 f5Var, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(936759641, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:541)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.J3(sVar, f5Var, aVar, (p91.c) obj);
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
    public static final i0 I4(final s sVar, final f5 f5Var, final d.o oVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-323379463, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.getCutNavContent.<anonymous> (ChildPassportApplicationNavContent.kt:1333)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var) | rVar.G(oVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.J4(sVar, f5Var, oVar, (y71.a.b) obj);
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
    public static final i0 J2(final f5 f5Var, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-563200508, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1378)");
        }
        f00.r.n(wVar, q0.c(j.class), m.d(-1292211278, true, new q() { // from class: n61.b4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.K2(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.N(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J3(s sVar, f5 f5Var, er.a aVar, p91.c cVar) {
        if (cVar instanceof p91.c.C3793c) {
            s.l(sVar, d.c0.f132528a, new x81.SetupData(f5Var.O9(), f5Var.C0()), null, 4, null);
        } else if (cVar instanceof p91.c.a) {
            d dVarQ9 = f5Var.Q9();
            d.e.b bVar = d.e.b.f132540a;
            if (fr.t.c(dVarQ9, bVar)) {
                s.l(sVar, bVar, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.TEMPORARY_REASON), null, 4, null);
            } else {
                d.e0 e0Var = d.e0.f132567a;
                if (fr.t.c(dVarQ9, e0Var)) {
                    s.l(sVar, e0Var, new SetupData(f5Var), null, 4, null);
                } else {
                    s.l(sVar, e0Var, new SetupData(f5Var), null, 4, null);
                }
            }
        } else {
            if (!fr.t.c(cVar, p91.c.b.f153569a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J4(s sVar, f5 f5Var, d.o oVar, y71.a.b bVar) {
        if (fr.t.c(bVar, y71.a.b.C6032a.f225206a)) {
            sVar.c();
        } else if (fr.t.c(bVar, y71.a.b.C6033b.f225207a)) {
            sVar.j(d.p.f132640a, f5Var, oVar);
        } else if (fr.t.c(bVar, y71.a.b.c.f225208a)) {
            d.p pVar = d.p.f132640a;
            sVar.j(pVar, f5Var, pVar);
        } else {
            if (!(bVar instanceof y71.a.b.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, d.r.f132652a, ((y71.a.b.ShowDialog) bVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K2(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1292211278, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1381)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.v0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.L2(f5Var, sVar, (k71.a) obj);
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
    public static final i0 K3(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1573392426, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2087)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.a.f132537a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    private static final void K4(final s sVar, final f5 f5Var, w wVar, d.o0 o0Var, r rVar, int i15) {
        if (t.k()) {
            t.o(1014204888, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.getSplitNavContent (ChildPassportApplicationNavContent.kt:1287)");
        }
        f00.r.o(wVar, q0.c(e81.m.class), sVar.g(o0Var), m.d(1737865929, true, new q() { // from class: n61.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.L4(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.c0(), rVar, (i15 & 14) | 27648 | (iy.b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L2(f5 f5Var, s sVar, k71.a aVar) {
        if (fr.t.c(aVar, k71.a.C2591a.f108896a)) {
            d dVarQ9 = f5Var.Q9();
            if (dVarQ9 instanceof d.a) {
                s.l(sVar, d.a.f132513a, new o61.SetupData(f5Var, f5Var.N9().getIdentityPhotoEnabled()), null, 4, null);
            } else if (dVarQ9 instanceof d.h0) {
                s.l(sVar, d.h0.f132585a, f5Var, null, 4, null);
            } else if (dVarQ9 instanceof d.p) {
                s.l(sVar, d.p.f132640a, f5Var, null, 4, null);
            } else {
                s.l(sVar, d.e0.f132567a, new SetupData(f5Var), null, 4, null);
            }
        } else if (fr.t.c(aVar, k71.a.b.f108897a)) {
            f5Var.Z9();
        } else if (fr.t.c(aVar, k71.a.c.f108898a)) {
            s.l(sVar, d.m.f132610a, f5Var, null, 4, null);
        } else if (fr.t.c(aVar, k71.a.d.f108899a)) {
            s.l(sVar, d.e.f.f132552a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.OTHER_PARENT_UNABLE_TO_CONSENT), null, 4, null);
        } else {
            if (!fr.t.c(aVar, k71.a.e.f108900a)) {
                throw new p();
            }
            s.l(sVar, d.e.h.f132558a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.SIGNED_CONSENT), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L3(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1742644011, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2094)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.c.f132543a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L4(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1737865929, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.getSplitNavContent.<anonymous> (ChildPassportApplicationNavContent.kt:1294)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.M4(sVar, f5Var, (e81.a.c) obj);
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
    public static final i0 M2(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-393948923, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1443)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.h.f132558a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M3(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1911895596, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2101)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.i.f132561a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M4(s sVar, f5 f5Var, e81.a.c cVar) {
        zx.c cVar2;
        if (fr.t.c(cVar, e81.a.c.C1121a.f48345a) || fr.t.c(cVar, e81.a.c.b.f48346a)) {
            sVar.c();
        } else if (cVar instanceof e81.a.c.Next) {
            e81.a.c.Next c1122c = (e81.a.c.Next) cVar;
            int i15 = a.f133289a[c1122c.getSplitType().ordinal()];
            if (i15 == 1) {
                cVar2 = d.o.b.f132625a;
            } else if (i15 == 2) {
                cVar2 = d.o.c.f132628a;
            } else {
                if (i15 != 3) {
                    throw new p();
                }
                cVar2 = d.o.a.f132622a;
            }
            s.l(sVar, cVar2, new y71.SetupData(f5Var, c1122c.getSplitType(), c1122c.getDataSplit()), null, 4, null);
        } else {
            if (!(cVar instanceof e81.a.c.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, d.r.f132652a, ((e81.a.c.ShowDialog) cVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N2(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-224697338, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1452)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.f.f132552a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1340463170, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2108)");
        }
        f00.r.o(wVar, q0.c(d91.p.class), sVar.g(d.g0.f132579a), m.d(-299427343, true, new q() { // from class: n61.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.O3(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.X(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N4(er.a aVar, int i15, r rVar, int i16) {
        S1(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-55445753, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1459)");
        }
        f00.r.o(wVar, q0.c(b81.m.class), sVar.g(d.p.f132640a), m.d(-1695336266, true, new q() { // from class: n61.n3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.P2(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.l0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O3(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-299427343, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2114)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.P3(f5Var, sVar, (d91.a.e) obj);
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
    public static final i0 P2(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1695336266, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1465)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Q2(f5Var, sVar, (b81.a) obj);
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
    public static final i0 P3(f5 f5Var, s sVar, d91.a.e eVar) {
        if (fr.t.c(eVar, d91.a.e.C0885a.f40409a)) {
            f5Var.Z9();
        } else if (eVar instanceof d91.a.e.ToEdorAuth) {
            s.l(sVar, d.t.f132664a, ((d91.a.e.ToEdorAuth) eVar).getData(), null, 4, null);
        } else {
            if (!fr.t.c(eVar, d91.a.e.c.f40411a)) {
                throw new p();
            }
            d.p0 p0Var = d.p0.f132643a;
            sVar.j(p0Var, new w91.SetupData(f5Var, false, 2, null), p0Var);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q2(f5 f5Var, s sVar, b81.a aVar) {
        if (fr.t.c(aVar, b81.a.C0424a.f17524a)) {
            d dVarQ9 = f5Var.Q9();
            if (dVarQ9 instanceof d.a) {
                sVar.j(d.a.f132513a, new o61.SetupData(f5Var, f5Var.N9().getIdentityPhotoEnabled()), d.p.f132640a);
            } else {
                if (!(dVarQ9 instanceof d.h0)) {
                    throw new IllegalStateException(("There is no back stack navigation for destination: " + dVarQ9).toString());
                }
                sVar.j(d.h0.f132585a, f5Var, d.p.f132640a);
            }
        } else if (fr.t.c(aVar, b81.a.b.f17525a)) {
            f5Var.Z9();
        } else if (aVar instanceof b81.a.ToEditNamesSplit) {
            s.l(sVar, d.o0.b.f132634a, new e81.SetupData(b.NAMES, ((b81.a.ToEditNamesSplit) aVar).getDataSplit()), null, 4, null);
        } else if (aVar instanceof b81.a.ToEditSurnameSplit) {
            s.l(sVar, d.o0.c.f132637a, new e81.SetupData(b.SURNAME, ((b81.a.ToEditSurnameSplit) aVar).getDataSplit()), null, 4, null);
        } else if (aVar instanceof b81.a.ToEditBirthPlaceSplit) {
            s.l(sVar, d.o0.a.f132631a, new e81.SetupData(b.BIRTH_PLACE, ((b81.a.ToEditBirthPlaceSplit) aVar).getDataSplit()), null, 4, null);
        } else {
            if (!fr.t.c(aVar, b81.a.f.f17532a)) {
                throw new p();
            }
            s.m(sVar, d.j.f132592a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q3(final s sVar, final f5 f5Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1509714755, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2138)");
        }
        f00.r.o(wVar, q0.c(z91.j.class), sVar.g(d.q0.f132649a), m.d(-130175758, true, new q() { // from class: n61.m3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.R3(sVar, f5Var, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.Q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(113805832, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1522)");
        }
        f00.r.o(wVar, q0.c(n71.l.class), sVar.g(d.l.f132604a), m.d(-1526084681, true, new q() { // from class: n61.i3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.S2(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.Y(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R3(final s sVar, final f5 f5Var, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-130175758, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2144)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.S3(sVar, f5Var, aVar, (z91.a.b) obj);
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void S1(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-521995441);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-521995441, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent (ChildPassportApplicationNavContent.kt:134)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            y0 y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final f5 f5Var = (f5) q7.d.c(q0.c(f5.class), y0VarC, null, j7.a.a(y0VarC, rVarH, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
            g1 navController = sVarJ.getNavController();
            boolean zG = rVarH.G(f5Var);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new e0.c() { // from class: n61.h
                    @Override // y9.e0.c
                    public final void a(e0 e0Var, p136y9.y0 y0Var, Bundle bundle) {
                        Function0.T1(f5Var, e0Var, y0Var, bundle);
                    }
                };
                rVarH.v(objE);
            }
            navController.i((e0.c) objE);
            xw.b<b> bVarY1 = f5Var.Y1();
            int i17 = i16 & 14;
            boolean zG2 = (i17 == 4) | rVarH.G(sVarJ) | rVarH.G(f5Var);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: n61.o1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.U1(aVar, sVarJ, f5Var, (b) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f0.b(bVarY1, (l) objE2, rVarH, xw.b.f221619c);
            d.f fVar = d.f.f132570a;
            boolean zG3 = rVarH.G(sVarJ) | rVarH.G(f5Var) | (i17 == 4);
            Object objE3 = rVarH.E();
            if (zG3 || objE3 == r.INSTANCE.a()) {
                objE3 = new l() { // from class: n61.z1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.V1(sVarJ, f5Var, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE3);
            }
            d0.j(sVarJ, fVar, (l) objE3, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n61.k2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.N4(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S2(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1526084681, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1528)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.z
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.T2(f5Var, sVar, (n71.b) obj);
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
    public static final i0 S3(s sVar, f5 f5Var, er.a aVar, z91.a.b bVar) {
        if (fr.t.c(bVar, z91.a.b.C6290b.f233640a)) {
            s.l(sVar, d.g0.f132579a, new d91.SetupData(f5Var), null, 4, null);
        } else {
            if (!fr.t.c(bVar, z91.a.b.C6289a.f233639a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(f5 f5Var, e0 e0Var, p136y9.y0 y0Var, Bundle bundle) {
        d dVarA;
        String strU = y0Var.u();
        if (strU == null || (dVarA = d.INSTANCE.a(strU)) == null) {
            return;
        }
        if (!dVarA.g()) {
            dVarA = null;
        }
        if (dVarA != null) {
            f5Var.ea(dVarA.getRoute());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T2(f5 f5Var, s sVar, n71.b bVar) {
        if (fr.t.c(bVar, n71.b.a.f133395a)) {
            d dVarQ9 = f5Var.Q9();
            if (dVarQ9 instanceof d.r0) {
                s.l(sVar, d.r0.f132655a, f5Var.f5(), null, 4, null);
            } else if (dVarQ9 instanceof d.x) {
                d.x xVar = d.x.f132679a;
                g0 passportOfficePlace = f5Var.I0().getPassportOfficePlace();
                ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryDataN8 = f5Var.N8();
                s.l(sVar, xVar, new s71.SetupData(passportOfficePlace, childPassportApplicationCorrespondenceCountryDataN8 != null ? childPassportApplicationCorrespondenceCountryDataN8.getCountry() : null, f5Var), null, 4, null);
            } else if (dVarQ9 instanceof d.k0) {
                s.l(sVar, d.k0.f132601a, f5Var, null, 4, null);
            } else {
                s.l(sVar, d.e0.f132567a, new SetupData(f5Var), null, 4, null);
            }
        } else if (fr.t.c(bVar, n71.b.C3296b.f133396a)) {
            f5Var.Z9();
        } else if (bVar instanceof n71.b.c) {
            s.l(sVar, d.k.f132598a, f5Var.L9().getContactDetailsFormData(), null, 4, null);
        } else {
            if (!fr.t.c(bVar, n71.b.d.f133398a)) {
                throw new p();
            }
            s.l(sVar, d.i0.f132589a, f5Var, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T3(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1678966340, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2163)");
        }
        d.v vVar = d.v.f132673a;
        f00.r.r(wVar, vVar, sVar.g(vVar), m.d(2047295107, true, new q() { // from class: n61.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.U3(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 U1(er.a aVar, s sVar, f5 f5Var, b bVar) {
        if (fr.t.c(bVar, b.a.f132454a)) {
            aVar.a();
        } else if (bVar instanceof b.ShowDialog) {
            s.l(sVar, d.r.f132652a, ((b.ShowDialog) bVar).getDialogData(), null, 4, null);
        } else if (bVar instanceof b.Error) {
            s.l(sVar, d.v.f132673a, ((b.Error) bVar).getErrorData(), null, 4, null);
        } else {
            if (!(bVar instanceof b.NavigateToDestination)) {
                throw new p();
            }
            d dVarA = ((b.NavigateToDestination) bVar).getDestination();
            d.e0 e0Var = d.e0.f132567a;
            if (fr.t.c(dVarA, e0Var)) {
                s.l(sVar, e0Var, new SetupData(f5Var), null, 4, null);
            } else {
                d.m0 m0Var = d.m0.f132613a;
                if (fr.t.c(dVarA, m0Var)) {
                    s.l(sVar, m0Var, f5Var, null, 4, null);
                } else {
                    d.e.b bVar2 = d.e.b.f132540a;
                    if (fr.t.c(dVarA, bVar2)) {
                        s.l(sVar, bVar2, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.TEMPORARY_REASON), null, 4, null);
                    } else {
                        d.l0 l0Var = d.l0.f132607a;
                        if (fr.t.c(dVarA, l0Var)) {
                            s.l(sVar, l0Var, f5Var, null, 4, null);
                        } else {
                            d.s0 s0Var = d.s0.f132661a;
                            if (fr.t.c(dVarA, s0Var)) {
                                s.l(sVar, s0Var, f5Var, null, 4, null);
                            } else {
                                d.c0 c0Var = d.c0.f132528a;
                                if (fr.t.c(dVarA, c0Var)) {
                                    s.l(sVar, c0Var, new x81.SetupData(f5Var.O9(), f5Var.C0()), null, 4, null);
                                } else {
                                    d.t0 t0Var = d.t0.f132667a;
                                    if (fr.t.c(dVarA, t0Var)) {
                                        s.l(sVar, t0Var, new ea1.b.Initial(f5Var), null, 4, null);
                                    } else {
                                        d.h hVar = d.h.f132582a;
                                        if (fr.t.c(dVarA, hVar)) {
                                            s.l(sVar, hVar, f5Var, null, 4, null);
                                        } else {
                                            d.u uVar = d.u.f132670a;
                                            if (fr.t.c(dVarA, uVar)) {
                                                s.l(sVar, uVar, f5Var, null, 4, null);
                                            } else {
                                                d.g gVar = d.g.f132576a;
                                                if (fr.t.c(dVarA, gVar)) {
                                                    s.l(sVar, gVar, f5Var, null, 4, null);
                                                } else {
                                                    d.b0 b0Var = d.b0.f132522a;
                                                    if (fr.t.c(dVarA, b0Var)) {
                                                        g0 passportOfficePlace = f5Var.I0().getPassportOfficePlace();
                                                        if (passportOfficePlace == null) {
                                                            passportOfficePlace = g0.UNKNOWN;
                                                        }
                                                        s.l(sVar, b0Var, new s81.SetupData(f5Var, passportOfficePlace), null, 4, null);
                                                    } else {
                                                        d.a aVar2 = d.a.f132513a;
                                                        if (fr.t.c(dVarA, aVar2)) {
                                                            s.l(sVar, aVar2, new o61.SetupData(f5Var, f5Var.N9().getIdentityPhotoEnabled()), null, 4, null);
                                                        } else {
                                                            d.h0 h0Var = d.h0.f132585a;
                                                            if (fr.t.c(dVarA, h0Var)) {
                                                                s.l(sVar, h0Var, f5Var, null, 4, null);
                                                            } else {
                                                                d.p pVar = d.p.f132640a;
                                                                if (fr.t.c(dVarA, pVar)) {
                                                                    s.l(sVar, pVar, f5Var, null, 4, null);
                                                                } else {
                                                                    d.j jVar = d.j.f132592a;
                                                                    int i15 = 2;
                                                                    Object[] objArr = 0;
                                                                    if (fr.t.c(dVarA, jVar)) {
                                                                        s.m(sVar, jVar, null, 2, null);
                                                                    } else {
                                                                        d.e.f fVar = d.e.f.f132552a;
                                                                        if (fr.t.c(dVarA, fVar)) {
                                                                            s.l(sVar, fVar, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.OTHER_PARENT_UNABLE_TO_CONSENT), null, 4, null);
                                                                        } else {
                                                                            d.e.h hVar2 = d.e.h.f132558a;
                                                                            if (fr.t.c(dVarA, hVar2)) {
                                                                                s.l(sVar, hVar2, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.SIGNED_CONSENT), null, 4, null);
                                                                            } else {
                                                                                d.m mVar = d.m.f132610a;
                                                                                if (fr.t.c(dVarA, mVar)) {
                                                                                    s.l(sVar, mVar, f5Var, null, 4, null);
                                                                                } else {
                                                                                    d.r0 r0Var = d.r0.f132655a;
                                                                                    if (fr.t.c(dVarA, r0Var)) {
                                                                                        s.l(sVar, r0Var, f5Var.f5(), null, 4, null);
                                                                                    } else {
                                                                                        d.x xVar = d.x.f132679a;
                                                                                        if (fr.t.c(dVarA, xVar)) {
                                                                                            g0 passportOfficePlace2 = f5Var.I0().getPassportOfficePlace();
                                                                                            ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryDataN8 = f5Var.N8();
                                                                                            s.l(sVar, xVar, new s71.SetupData(passportOfficePlace2, childPassportApplicationCorrespondenceCountryDataN8 != null ? childPassportApplicationCorrespondenceCountryDataN8.getCountry() : null, f5Var), null, 4, null);
                                                                                        } else {
                                                                                            d.l lVar = d.l.f132604a;
                                                                                            if (fr.t.c(dVarA, lVar)) {
                                                                                                s.l(sVar, lVar, f5Var, null, 4, null);
                                                                                            } else {
                                                                                                d.k0 k0Var = d.k0.f132601a;
                                                                                                if (fr.t.c(dVarA, k0Var)) {
                                                                                                    s.l(sVar, k0Var, f5Var, null, 4, null);
                                                                                                } else {
                                                                                                    d.k kVar = d.k.f132598a;
                                                                                                    if (fr.t.c(dVarA, kVar)) {
                                                                                                        s.l(sVar, kVar, f5Var.L9().getContactDetailsFormData(), null, 4, null);
                                                                                                    } else {
                                                                                                        d.i0 i0Var = d.i0.f132589a;
                                                                                                        if (fr.t.c(dVarA, i0Var)) {
                                                                                                            s.l(sVar, i0Var, f5Var, null, 4, null);
                                                                                                        } else {
                                                                                                            d.e.a aVar3 = d.e.a.f132537a;
                                                                                                            if (fr.t.c(dVarA, aVar3)) {
                                                                                                                s.l(sVar, aVar3, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.ABROAD_TREATMENT_CONFIRMATION), null, 4, null);
                                                                                                            } else {
                                                                                                                d.e.c cVar = d.e.c.f132543a;
                                                                                                                if (fr.t.c(dVarA, cVar)) {
                                                                                                                    s.l(sVar, cVar, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.KDR_CONFIRMATION), null, 4, null);
                                                                                                                } else {
                                                                                                                    d.e.i iVar = d.e.i.f132561a;
                                                                                                                    if (fr.t.c(dVarA, iVar)) {
                                                                                                                        s.l(sVar, iVar, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.TECHNICAL_ISSUE_CONFIRMATION), null, 4, null);
                                                                                                                    } else {
                                                                                                                        d.c cVar2 = d.c.f132525a;
                                                                                                                        if (fr.t.c(dVarA, cVar2)) {
                                                                                                                            s.l(sVar, cVar2, f5Var, null, 4, null);
                                                                                                                        } else {
                                                                                                                            d.y yVar = d.y.f132682a;
                                                                                                                            if (fr.t.c(dVarA, yVar)) {
                                                                                                                                s.l(sVar, yVar, f5Var, null, 4, null);
                                                                                                                            } else {
                                                                                                                                d.f0 f0Var = d.f0.f132573a;
                                                                                                                                if (fr.t.c(dVarA, f0Var)) {
                                                                                                                                    s.l(sVar, f0Var, f5Var, null, 4, null);
                                                                                                                                } else {
                                                                                                                                    d.e.C3293e c3293e = d.e.C3293e.f132549a;
                                                                                                                                    if (fr.t.c(dVarA, c3293e)) {
                                                                                                                                        s.l(sVar, c3293e, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.OLD_APPLICATION_MONEY_TRANSFER), null, 4, null);
                                                                                                                                    } else if (fr.t.c(dVarA, d.e.C3292d.f132546a)) {
                                                                                                                                        s.l(sVar, c3293e, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.NEW_APPLICATION_MONEY_TRANSFER), null, 4, null);
                                                                                                                                    } else {
                                                                                                                                        d.g0 g0Var = d.g0.f132579a;
                                                                                                                                        if (fr.t.c(dVarA, g0Var)) {
                                                                                                                                            s.l(sVar, g0Var, new d91.SetupData(f5Var), null, 4, null);
                                                                                                                                        } else {
                                                                                                                                            d.q0 q0Var = d.q0.f132649a;
                                                                                                                                            if (fr.t.c(dVarA, q0Var)) {
                                                                                                                                                s.m(sVar, q0Var, null, 2, null);
                                                                                                                                            } else {
                                                                                                                                                d.p0 p0Var = d.p0.f132643a;
                                                                                                                                                if (fr.t.c(dVarA, p0Var)) {
                                                                                                                                                    sVar.j(p0Var, new w91.SetupData(f5Var, false, i15, objArr == true ? 1 : 0), p0Var);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(283057417, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1582)");
        }
        d.k kVar = d.k.f132598a;
        f00.r.r(wVar, kVar, sVar.g(kVar), m.d(-443652363, true, new q() { // from class: n61.x3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.V2(f5Var, sVar, (ru3.a) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U3(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2047295107, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2169)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.r
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.V3(sVar, (hb4.b.a) obj);
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
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 V1(final s sVar, final f5 f5Var, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, d.f.f132570a, null, m.b(1607627758, true, new er.r() { // from class: n61.v2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.W1(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e0.f132567a, null, m.b(1590283237, true, new er.r() { // from class: n61.j1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Z1(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.m0.f132613a, null, m.b(1759534822, true, new er.r() { // from class: n61.v1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.D2(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.n0.f132619a, null, m.b(1928786407, true, new er.r() { // from class: n61.h2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.a3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.l0.f132607a, null, m.b(2098037992, true, new er.r() { // from class: n61.t2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.H3(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.c0.f132528a, null, m.b(-2027677719, true, new er.r() { // from class: n61.b3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.e4(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.s0.f132661a, null, m.b(-1858426134, true, new er.r() { // from class: n61.c3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.s4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.t0.f132667a, null, m.b(-1689174549, true, new er.r() { // from class: n61.d3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.v4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.h.f132582a, null, m.b(-1519922964, true, new er.r() { // from class: n61.e3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.y4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.g.f132576a, null, m.b(-1350671379, true, new er.r() { // from class: n61.f3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.B4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.u.f132670a, null, m.b(-1515032347, true, new er.r() { // from class: n61.g3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.c2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.b0.f132522a, null, m.b(-1345780762, true, new er.r() { // from class: n61.r3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.f2(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.j0.f132595a, null, m.b(-1176529177, true, new er.r() { // from class: n61.c4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.i2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.s.f132658a, null, m.b(-1007277592, true, new er.r() { // from class: n61.n4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.l2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.a.f132513a, null, m.b(-838026007, true, new er.r() { // from class: n61.y4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.o2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.a0.f132516a, null, m.b(-668774422, true, new er.r() { // from class: n61.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.r2(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.z.f132685a, null, m.b(-499522837, true, new er.r() { // from class: n61.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.u2(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.h0.f132585a, null, m.b(-330271252, true, new er.r() { // from class: n61.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.x2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.p0.f132643a, null, m.b(-161019667, true, new er.r() { // from class: n61.z0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.A2(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.C3291d.f132531a, null, m.b(8231918, true, new er.r() { // from class: n61.i1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.G2(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.j.f132592a, null, m.b(-563200508, true, new er.r() { // from class: n61.k1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.J2(f5Var, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e.h.f132558a, null, m.b(-393948923, true, new er.r() { // from class: n61.l1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.M2(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e.f.f132552a, null, m.b(-224697338, true, new er.r() { // from class: n61.m1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.N2(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.p.f132640a, null, m.b(-55445753, true, new er.r() { // from class: n61.n1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.O2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.l.f132604a, null, m.b(113805832, true, new er.r() { // from class: n61.p1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.R2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.k.f132598a, null, m.b(283057417, true, new er.r() { // from class: n61.q1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.U2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.k0.f132601a, null, m.b(452309002, true, new er.r() { // from class: n61.r1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.X2(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.m.f132610a, null, m.b(621560587, true, new er.r() { // from class: n61.s1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.n.f132616a, null, m.b(790812172, true, new er.r() { // from class: n61.t1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.r0.f132655a, null, m.b(960063757, true, new er.r() { // from class: n61.u1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.j3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.b.f132519a, null, m.b(388631331, true, new er.r() { // from class: n61.w1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.m3(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.x.f132679a, null, m.b(557882916, true, new er.r() { // from class: n61.x1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.c.f132525a, null, m.b(727134501, true, new er.r() { // from class: n61.y1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.s3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.y.f132682a, null, m.b(896386086, true, new er.r() { // from class: n61.a2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.v3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.f0.f132573a, null, m.b(1065637671, true, new er.r() { // from class: n61.b2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.y3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, d.r.f132652a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(1234889256, true, new er.r() { // from class: n61.c2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.B3(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, d.i0.f132589a, null, m.b(1404140841, true, new er.r() { // from class: n61.d2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.E3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e.a.f132537a, null, m.b(1573392426, true, new er.r() { // from class: n61.e2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.K3(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e.c.f132543a, null, m.b(1742644011, true, new er.r() { // from class: n61.f2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.L3(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e.i.f132561a, null, m.b(1911895596, true, new er.r() { // from class: n61.g2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.M3(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.g0.f132579a, null, m.b(1340463170, true, new er.r() { // from class: n61.i2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.N3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.q0.f132649a, null, m.b(1509714755, true, new er.r() { // from class: n61.j2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Q3(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.v.f132673a, null, m.b(1678966340, true, new er.r() { // from class: n61.l2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.T3(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.t.f132664a, null, m.b(1848217925, true, new er.r() { // from class: n61.m2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.W3(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.w.f132676a, null, m.b(2017469510, true, new er.r() { // from class: n61.n2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Z3(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, d.q.f132646a, sVar);
        f00.r.u(d1Var, d.e.g.f132555a, null, m.b(-2108246201, true, new er.r() { // from class: n61.o2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.c4(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e.b.f132540a, null, m.b(-1938994616, true, new er.r() { // from class: n61.p2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d4(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e.C3293e.f132549a, null, m.b(-1769743031, true, new er.r() { // from class: n61.q2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h4(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.e.C3292d.f132546a, null, m.b(-1600491446, true, new er.r() { // from class: n61.r2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.i4(sVar, f5Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.o0.b.f132634a, null, m.b(-1431239861, true, new er.r() { // from class: n61.s2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.j4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.o0.c.f132637a, null, m.b(-2002672287, true, new er.r() { // from class: n61.u2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.o0.a.f132631a, null, m.b(-1833420702, true, new er.r() { // from class: n61.w2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.l4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.o.b.f132625a, null, m.b(-1664169117, true, new er.r() { // from class: n61.x2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.m4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.o.c.f132628a, null, m.b(-1494917532, true, new er.r() { // from class: n61.y2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.n4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.o.a.f132622a, null, m.b(-1325665947, true, new er.r() { // from class: n61.z2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.o4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.d0.f132534a, null, m.b(-1156414362, true, new er.r() { // from class: n61.a3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p4(sVar, f5Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V2(final f5 f5Var, final s sVar, ru3.a aVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-443652363, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1588)");
        }
        xw.b<ru3.a.AbstractC4497a> bVarY1 = aVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.n
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.W2(f5Var, sVar, (ru3.a.AbstractC4497a) obj);
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
    public static final i0 V3(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W1(final s sVar, final f5 f5Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1607627758, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:416)");
        }
        f00.r.n(wVar, q0.c(v.class), m.d(1860621568, true, new q() { // from class: n61.s3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.X1(sVar, f5Var, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.S(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W2(f5 f5Var, s sVar, ru3.a.AbstractC4497a abstractC4497a) {
        if (abstractC4497a instanceof ru3.a.AbstractC4497a.Back) {
            f5Var.q3(((ru3.a.AbstractC4497a.Back) abstractC4497a).getContactDetailsData());
            sVar.j(d.l.f132604a, f5Var, d.k.f132598a);
        } else if (abstractC4497a instanceof ru3.a.AbstractC4497a.Close) {
            f5Var.q3(((ru3.a.AbstractC4497a.Close) abstractC4497a).getContactDetailsData());
            f5Var.Z9();
        } else {
            if (!(abstractC4497a instanceof ru3.a.AbstractC4497a.Next)) {
                throw new p();
            }
            f5Var.q3(((ru3.a.AbstractC4497a.Next) abstractC4497a).getContactDetailsData());
            s.l(sVar, d.i0.f132589a, f5Var, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W3(final s sVar, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1848217925, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2179)");
        }
        d.t tVar = d.t.f132664a;
        f00.r.r(wVar, tVar, sVar.g(tVar), m.d(1351492960, true, new q() { // from class: n61.d4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.X3(sVar, aVar, (mv3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X1(final s sVar, final f5 f5Var, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1860621568, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:419)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Y1(sVar, f5Var, aVar, (c71.a.d) obj);
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
    public static final i0 X2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(452309002, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1618)");
        }
        f00.r.o(wVar, q0.c(m91.m.class), sVar.g(d.k0.f132601a), m.d(-1187581511, true, new q() { // from class: n61.u3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.Y2(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.m0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X3(final s sVar, final er.a aVar, mv3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1351492960, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2185)");
        }
        xw.b<mv3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.d1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Y3(sVar, aVar, (mv3.c.a) obj);
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
    public static final i0 Y1(s sVar, f5 f5Var, er.a aVar, c71.a.d dVar) {
        if (dVar instanceof c71.a.d.ToWizard) {
            s.l(sVar, d.e0.f132567a, new SetupData(f5Var), null, 4, null);
        } else if (fr.t.c(dVar, c71.a.d.C0635a.f23842a)) {
            aVar.a();
        } else if (dVar instanceof c71.a.d.b) {
            s.l(sVar, d.v.f132673a, ((c71.a.d.b) dVar).a(), null, 4, null);
        } else {
            if (!(dVar instanceof c71.a.d.ToEdorAuth)) {
                throw new p();
            }
            s.l(sVar, d.t.f132664a, ((c71.a.d.ToEdorAuth) dVar).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y2(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1187581511, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1624)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.v
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Z2(sVar, f5Var, (m91.a) obj);
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
    public static final i0 Y3(s sVar, er.a aVar, mv3.c.a aVar2) {
        if (fr.t.c(aVar2, mv3.c.a.C3193a.f128686a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar2, mv3.c.a.b.f128687a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z1(final s sVar, final f5 f5Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1590283237, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:449)");
        }
        f00.r.o(wVar, q0.c(a91.n.class), sVar.g(d.e0.f132567a), m.d(429004886, true, new q() { // from class: n61.p3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.a2(sVar, f5Var, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.g0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z2(s sVar, f5 f5Var, m91.a aVar) {
        if (fr.t.c(aVar, m91.a.C3064a.f124720a)) {
            d.x xVar = d.x.f132679a;
            g0 passportOfficePlace = f5Var.I0().getPassportOfficePlace();
            ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryDataN8 = f5Var.N8();
            s.l(sVar, xVar, new s71.SetupData(passportOfficePlace, childPassportApplicationCorrespondenceCountryDataN8 != null ? childPassportApplicationCorrespondenceCountryDataN8.getCountry() : null, f5Var), null, 4, null);
        } else if (fr.t.c(aVar, m91.a.b.f124721a)) {
            f5Var.Z9();
        } else {
            if (!fr.t.c(aVar, m91.a.c.f124722a)) {
                throw new p();
            }
            s.l(sVar, d.l.f132604a, f5Var, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2017469510, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2196)");
        }
        f00.r.o(wVar, q0.c(m81.n.class), sVar.g(d.w.f132676a), m.d(377578997, true, new q() { // from class: n61.p4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.a4(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.R(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a2(final s sVar, final f5 f5Var, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(429004886, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:455)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.p
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.b2(sVar, f5Var, aVar, (a91.b) obj);
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
    public static final i0 a3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1928786407, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:512)");
        }
        f00.r.o(wVar, q0.c(u91.m.class), sVar.g(d.n0.f132619a), m.d(767508056, true, new q() { // from class: n61.t4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.b3(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.L(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a4(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(377578997, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2202)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.b4(f5Var, sVar, (m81.a.InterfaceC3053a) obj);
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
    public static final i0 b2(s sVar, f5 f5Var, er.a aVar, a91.b bVar) {
        if (bVar instanceof a91.b.c) {
            s.l(sVar, d.m0.f132613a, f5Var, null, 4, null);
        } else if (fr.t.c(bVar, a91.b.C0085b.f4989a)) {
            s.l(sVar, d.l0.f132607a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(bVar, a91.b.a.f4988a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b3(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(767508056, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:518)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.t
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.c3(sVar, f5Var, (u91.a) obj);
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
    public static final i0 b4(f5 f5Var, s sVar, m81.a.InterfaceC3053a interfaceC3053a) {
        if (fr.t.c(interfaceC3053a, m81.a.InterfaceC3053a.C3054a.f124506a)) {
            f5Var.Z9();
        } else if (fr.t.c(interfaceC3053a, m81.a.InterfaceC3053a.c.f124508a)) {
            s.l(sVar, d.a.f132513a, new o61.SetupData(f5Var, f5Var.N9().getIdentityPhotoEnabled()), null, 4, null);
        } else {
            if (!fr.t.c(interfaceC3053a, m81.a.InterfaceC3053a.b.f124507a)) {
                throw new p();
            }
            f5Var.q2();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1515032347, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:766)");
        }
        f00.r.o(wVar, q0.c(x.class), sVar.g(d.u.f132670a), m.d(1140044436, true, new q() { // from class: n61.l3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.d2(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.f0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c3(s sVar, f5 f5Var, u91.a aVar) {
        if (!fr.t.c(aVar, u91.a.C5111a.f196578a) && !(aVar instanceof u91.a.GoBackWithResult)) {
            throw new p();
        }
        s.l(sVar, d.m0.f132613a, f5Var, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c4(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2108246201, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2228)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.g.f132555a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d2(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1140044436, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:772)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.f1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.e2(f5Var, sVar, (i81.a.InterfaceC2135a) obj);
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
    public static final i0 d3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(621560587, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1648)");
        }
        f00.r.o(wVar, q0.c(p71.p.class), sVar.g(d.m.f132610a), m.d(-1018329926, true, new q() { // from class: n61.f4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.e3(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.k0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d4(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1938994616, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2235)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.b.f132540a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e2(f5 f5Var, s sVar, i81.a.InterfaceC2135a interfaceC2135a) {
        if (interfaceC2135a instanceof i81.a.InterfaceC2135a.C2136a) {
            d dVarQ9 = f5Var.Q9();
            if (dVarQ9 instanceof d.t0) {
                sVar.j(d.t0.f132667a, new ea1.b.Initial(f5Var), d.u.f132670a);
            } else if (dVarQ9 instanceof d.h) {
                sVar.j(d.h.f132582a, f5Var, d.u.f132670a);
            } else {
                sVar.j(d.e0.f132567a, new SetupData(f5Var), d.u.f132670a);
            }
        } else if (fr.t.c(interfaceC2135a, i81.a.InterfaceC2135a.b.f89931a)) {
            f5Var.Z9();
        } else if (interfaceC2135a instanceof i81.a.InterfaceC2135a.ToDatePicker) {
            s.l(sVar, d.q.f132646a, ((i81.a.InterfaceC2135a.ToDatePicker) interfaceC2135a).getPickerData(), null, 4, null);
        } else {
            if (!fr.t.c(interfaceC2135a, i81.a.InterfaceC2135a.c.f89932a)) {
                throw new p();
            }
            d.b0 b0Var = d.b0.f132522a;
            g0 passportOfficePlace = f5Var.I0().getPassportOfficePlace();
            if (passportOfficePlace == null) {
                passportOfficePlace = g0.UNKNOWN;
            }
            s.l(sVar, b0Var, new s81.SetupData(f5Var, passportOfficePlace), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e3(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1018329926, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1654)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.f3(f5Var, sVar, (p71.a.b) obj);
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
    public static final i0 e4(final s sVar, final f5 f5Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2027677719, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:586)");
        }
        f00.r.o(wVar, q0.c(x81.k.class), sVar.g(d.c0.f132528a), m.d(1106011226, true, new q() { // from class: n61.m4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.f4(sVar, f5Var, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.n0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f2(final s sVar, final f5 f5Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1345780762, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:823)");
        }
        f00.r.o(wVar, q0.c(s81.g0.class), (s81.SetupData) sVar.g(d.b0.f132522a), m.d(1309296021, true, new q() { // from class: n61.w4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.g2(f5Var, sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.M(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f3(f5 f5Var, s sVar, p71.a.b bVar) {
        if (fr.t.c(bVar, p71.a.b.C3774a.f153293a)) {
            d dVarQ9 = f5Var.Q9();
            if (dVarQ9 instanceof d.e.h) {
                sVar.j(d.e.h.f132558a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.SIGNED_CONSENT), d.m.f132610a);
            } else if (dVarQ9 instanceof d.e.f) {
                sVar.j(d.e.f.f132552a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.OTHER_PARENT_UNABLE_TO_CONSENT), d.m.f132610a);
            } else if (dVarQ9 instanceof d.j) {
                sVar.k(d.j.f132592a, d.m.f132610a);
            } else {
                sVar.j(d.e0.f132567a, new SetupData(f5Var), d.m.f132610a);
            }
        } else if (fr.t.c(bVar, p71.a.b.C3775b.f153294a)) {
            f5Var.Z9();
        } else if (bVar instanceof p71.a.b.e) {
            s.l(sVar, d.r0.f132655a, f5Var.f5(), null, 4, null);
        } else if (fr.t.c(bVar, p71.a.b.d.f153296a)) {
            d.x xVar = d.x.f132679a;
            g0 passportOfficePlace = f5Var.I0().getPassportOfficePlace();
            ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryDataN8 = f5Var.N8();
            s.l(sVar, xVar, new s71.SetupData(passportOfficePlace, childPassportApplicationCorrespondenceCountryDataN8 != null ? childPassportApplicationCorrespondenceCountryDataN8.getCountry() : null, f5Var), null, 4, null);
        } else {
            if (!(bVar instanceof p71.a.b.ToCorrespondencePicker)) {
                throw new p();
            }
            sVar.j(d.n.f132616a, new u71.SetupData(((p71.a.b.ToCorrespondencePicker) bVar).a(), f5Var), d.m.f132610a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f4(final s sVar, final f5 f5Var, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1106011226, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:592)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.g4(sVar, f5Var, aVar, (x81.a.b) obj);
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
    public static final i0 g2(final f5 f5Var, final s sVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1309296021, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:829)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.t0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.h2(f5Var, sVar, aVar, (s81.c) obj);
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
    public static final i0 g3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(790812172, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1727)");
        }
        f00.r.o(wVar, q0.c(u71.v.class), (u71.SetupData) sVar.g(d.n.f132616a), m.d(-849078341, true, new q() { // from class: n61.l4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.h3(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.J(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g4(s sVar, f5 f5Var, er.a aVar, x81.a.b bVar) {
        if (fr.t.c(bVar, x81.a.b.d.f217328a)) {
            s.l(sVar, d.s0.f132661a, f5Var, null, 4, null);
        } else if (fr.t.c(bVar, x81.a.b.C5799b.f217326a)) {
            s.l(sVar, d.l0.f132607a, f5Var, null, 4, null);
        } else if (fr.t.c(bVar, x81.a.b.C5798a.f217325a)) {
            s.l(sVar, d.e.b.f132540a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.TEMPORARY_REASON), null, 4, null);
        } else {
            if (!fr.t.c(bVar, x81.a.b.c.f217327a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h2(f5 f5Var, s sVar, er.a aVar, s81.c cVar) {
        if (fr.t.c(cVar, s81.c.a.f178982a)) {
            d dVarQ9 = f5Var.Q9();
            d.g gVar = d.g.f132576a;
            if (fr.t.c(dVarQ9, gVar)) {
                sVar.j(gVar, f5Var, d.b0.f132522a);
            } else {
                d.u uVar = d.u.f132670a;
                if (fr.t.c(dVarQ9, uVar)) {
                    sVar.j(uVar, f5Var, d.b0.f132522a);
                } else {
                    sVar.j(gVar, f5Var, d.b0.f132522a);
                }
            }
        } else if (fr.t.c(cVar, s81.c.b.f178983a)) {
            aVar.a();
        } else if (fr.t.c(cVar, s81.c.d.f178985a)) {
            f5Var.Z9();
        } else if (fr.t.c(cVar, s81.c.C4595c.f178984a)) {
            s.l(sVar, d.w.f132676a, new m81.SetupData(f5Var), null, 4, null);
        } else {
            if (!(cVar instanceof s81.c.ToInstitutionPicker)) {
                throw new p();
            }
            s.l(sVar, d.j0.f132595a, new v81.SetupData(((s81.c.ToInstitutionPicker) cVar).a(), f5Var), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h3(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-849078341, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1733)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i3(sVar, f5Var, (u71.d) obj);
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
    public static final i0 h4(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1769743031, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2242)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.C3293e.f132549a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1176529177, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:879)");
        }
        f00.r.o(wVar, q0.c(v81.t.class), (v81.SetupData) sVar.g(d.j0.f132595a), m.d(1478547606, true, new q() { // from class: n61.h3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.j2(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.b0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i3(s sVar, f5 f5Var, u71.d dVar) {
        if (!(dVar instanceof u71.d.a)) {
            throw new p();
        }
        sVar.j(d.m.f132610a, f5Var, d.n.f132616a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i4(s sVar, f5 f5Var, er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1600491446, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2249)");
        }
        E4(sVar, f5Var, aVar, wVar, d.e.C3292d.f132546a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j2(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1478547606, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:885)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.k2(sVar, f5Var, (v81.b) obj);
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
    public static final i0 j3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(960063757, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1751)");
        }
        d.r0 r0Var = d.r0.f132655a;
        f00.r.r(wVar, r0Var, sVar.g(r0Var), m.d(12541532, true, new q() { // from class: n61.y3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.k3(f5Var, sVar, (st3.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j4(s sVar, f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1431239861, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2256)");
        }
        K4(sVar, f5Var, wVar, d.o0.b.f132634a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k2(s sVar, f5 f5Var, v81.b bVar) {
        if (fr.t.c(bVar, v81.b.a.f204419a)) {
            sVar.c();
        } else {
            if (!(bVar instanceof v81.b.GoBackWithResult)) {
                throw new p();
            }
            d.b0 b0Var = d.b0.f132522a;
            g0 passportOfficePlace = f5Var.I0().getPassportOfficePlace();
            if (passportOfficePlace == null) {
                passportOfficePlace = g0.UNKNOWN;
            }
            sVar.j(b0Var, new s81.SetupData(f5Var, passportOfficePlace), d.j0.f132595a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k3(final f5 f5Var, final s sVar, st3.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(12541532, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1758)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l3(f5Var, sVar, (st3.f.a) obj);
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
    public static final i0 k4(s sVar, f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2002672287, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2263)");
        }
        K4(sVar, f5Var, wVar, d.o0.c.f132637a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1007277592, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:906)");
        }
        f00.r.o(wVar, q0.c(g81.l.class), sVar.g(d.s.f132658a), m.d(1647799191, true, new q() { // from class: n61.k3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.m2(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.W(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l3(f5 f5Var, s sVar, st3.f.a aVar) {
        if (aVar instanceof st3.f.a.Close) {
            AddressData addressDataA = ((st3.f.a.Close) aVar).getAddressData();
            if (addressDataA != null) {
                f5Var.r8(new i61.d.Domestic(addressDataA));
            }
            f5Var.Z9();
        } else if (aVar instanceof st3.f.a.Back) {
            AddressData addressDataA2 = ((st3.f.a.Back) aVar).getAddressData();
            if (addressDataA2 != null) {
                f5Var.r8(new i61.d.Domestic(addressDataA2));
            }
            sVar.j(d.m.f132610a, f5Var, d.r0.f132655a);
        } else if (aVar instanceof st3.f.a.GoToError) {
            s.l(sVar, d.v.f132673a, ((st3.f.a.GoToError) aVar).getErrorData(), null, 4, null);
        } else if (aVar instanceof st3.f.a.GoToNextScreen) {
            f5Var.r8(new i61.d.Domestic(((st3.f.a.GoToNextScreen) aVar).getResult()));
            s.l(sVar, d.l.f132604a, f5Var, null, 4, null);
        } else {
            if (!(aVar instanceof st3.f.a.GoToSearch)) {
                throw new p();
            }
            s.l(sVar, d.b.f132519a, ((st3.f.a.GoToSearch) aVar).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l4(s sVar, f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1833420702, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2270)");
        }
        K4(sVar, f5Var, wVar, d.o0.a.f132631a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m2(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1647799191, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:912)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.q
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.n2(sVar, f5Var, (g81.a) obj);
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
    public static final i0 m3(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(388631331, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1814)");
        }
        d.b bVar = d.b.f132519a;
        f00.r.r(wVar, bVar, sVar.g(bVar), m.d(1396528150, true, new q() { // from class: n61.v4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.n3(sVar, (tt3.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m4(s sVar, f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1664169117, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2277)");
        }
        H4(sVar, f5Var, wVar, d.o.b.f132625a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n2(s sVar, f5 f5Var, g81.a aVar) {
        if (fr.t.c(aVar, g81.a.C1618a.f71179a)) {
            sVar.j(d.s0.f132661a, f5Var, d.s.f132658a);
        } else {
            if (!(aVar instanceof g81.a.GoBackWithResult)) {
                throw new p();
            }
            sVar.j(d.t0.f132667a, new ea1.b.DocumentPicker(f5Var, ((g81.a.GoBackWithResult) aVar).getSelectedDocumentType()), d.s.f132658a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n3(final s sVar, tt3.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1396528150, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1821)");
        }
        xw.b<tt3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.o3(sVar, (tt3.d.a) obj);
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
    public static final i0 n4(s sVar, f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1494917532, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2284)");
        }
        H4(sVar, f5Var, wVar, d.o.c.f132628a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-838026007, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:936)");
        }
        f00.r.o(wVar, q0.c(u.class), sVar.g(d.a.f132513a), m.d(1817050776, true, new q() { // from class: n61.o4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.p2(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.P(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o3(s sVar, tt3.d.a aVar) {
        if (!fr.t.c(aVar, tt3.d.a.C5021a.f192310a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o4(s sVar, f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1325665947, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2291)");
        }
        H4(sVar, f5Var, wVar, d.o.a.f132622a, rVar, ((i15 >> 3) & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p2(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1817050776, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:940)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.q2(sVar, f5Var, (o61.a.g) obj);
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
    public static final i0 p3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(557882916, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1831)");
        }
        f00.r.o(wVar, q0.c(s71.q.class), (s71.SetupData) sVar.g(d.x.f132679a), m.d(-1082007597, true, new q() { // from class: n61.g4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q3(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.a0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p4(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1156414362, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2298)");
        }
        d.d0 d0Var = d.d0.f132534a;
        f00.r.r(wVar, d0Var, sVar.g(d0Var), m.d(-2002924779, true, new q() { // from class: n61.r4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q4(sVar, f5Var, (qx3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q2(s sVar, f5 f5Var, o61.a.g gVar) {
        if (gVar instanceof o61.a.g.ShowNavigationDialog) {
            s.l(sVar, d.r.f132652a, ((o61.a.g.ShowNavigationDialog) gVar).getDialogData(), null, 4, null);
        } else if (gVar instanceof o61.a.g.e) {
            s.l(sVar, d.v.f132673a, ((o61.a.g.e) gVar).a(), null, 4, null);
        } else if (gVar instanceof o61.a.g.ShowImagePreview) {
            s.l(sVar, d.a0.f132516a, ((o61.a.g.ShowImagePreview) gVar).getData(), null, 4, null);
        } else if (gVar instanceof o61.a.g.IdentityPhoto) {
            s.l(sVar, d.z.f132685a, ((o61.a.g.IdentityPhoto) gVar).getData(), null, 4, null);
        } else if (fr.t.c(gVar, o61.a.g.C3530a.f142554a)) {
            s.l(sVar, d.h0.f132585a, f5Var, null, 4, null);
        } else if (fr.t.c(gVar, o61.a.g.b.f142555a)) {
            d.b0 b0Var = d.b0.f132522a;
            g0 passportOfficePlace = f5Var.I0().getPassportOfficePlace();
            if (passportOfficePlace == null) {
                passportOfficePlace = g0.UNKNOWN;
            }
            sVar.j(b0Var, new s81.SetupData(f5Var, passportOfficePlace), d.a.f132513a);
        } else if (fr.t.c(gVar, o61.a.g.c.f142556a)) {
            f5Var.Z9();
        } else if (fr.t.c(gVar, o61.a.g.i.f142561a)) {
            s.l(sVar, d.p.f132640a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(gVar, o61.a.g.h.f142560a)) {
                throw new p();
            }
            s.m(sVar, d.j.f132592a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q3(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1082007597, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1837)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.w
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r3(sVar, f5Var, (s71.a.c) obj);
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
    public static final i0 q4(final s sVar, final f5 f5Var, qx3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2002924779, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:2304)");
        }
        xw.b<qx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r4(sVar, f5Var, (qx3.c.a) obj);
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
    public static final i0 r2(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-668774422, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1002)");
        }
        d.a0 a0Var = d.a0.f132516a;
        f00.r.r(wVar, a0Var, sVar.g(a0Var), m.d(1044469732, true, new q() { // from class: n61.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.s2(sVar, (c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r3(s sVar, f5 f5Var, s71.a.c cVar) {
        if (fr.t.c(cVar, s71.a.c.C4583a.f178640a)) {
            sVar.j(d.m.f132610a, f5Var, d.x.f132679a);
        } else if (fr.t.c(cVar, s71.a.c.b.f178641a)) {
            f5Var.Z9();
        } else if (fr.t.c(cVar, s71.a.c.C4584c.f178642a)) {
            s.l(sVar, d.l.f132604a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(cVar, s71.a.c.d.f178643a)) {
                throw new p();
            }
            s.l(sVar, d.k0.f132601a, f5Var, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r4(s sVar, f5 f5Var, qx3.c.a aVar) {
        if (fr.t.c(aVar, qx3.c.a.C4279a.f169322a)) {
            sVar.c();
        } else if (fr.t.c(aVar, qx3.c.a.b.f169323a)) {
            sVar.j(d.p0.f132643a, new w91.SetupData(f5Var, false, 2, null), d.d0.f132534a);
        } else {
            if (!(aVar instanceof qx3.c.a.ProcessCompleted)) {
                throw new p();
            }
            d.g0 g0Var = d.g0.f132579a;
            sVar.j(g0Var, new d91.SetupData(f5Var), g0Var);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s2(final s sVar, c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1044469732, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1009)");
        }
        xw.b<c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.c1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.t2(sVar, (c.a) obj);
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
    public static final i0 s3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(727134501, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1866)");
        }
        f00.r.o(wVar, q0.c(v61.k.class), (x61.a) sVar.g(d.c.f132525a), m.d(-912756012, true, new q() { // from class: n61.a4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.t3(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.T(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s4(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1858426134, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:622)");
        }
        f00.r.o(wVar, q0.c(ba1.n.class), sVar.g(d.s0.f132661a), m.d(1275262811, true, new q() { // from class: n61.o3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.t4(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.I(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t2(s sVar, c.a aVar) {
        if (!fr.t.c(aVar, c.a.C1047a.f45490a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t3(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-912756012, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1872)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.u3(f5Var, sVar, (v61.a) obj);
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
    public static final i0 t4(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1275262811, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:628)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.g1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.u4(sVar, f5Var, (ba1.c) obj);
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
    public static final i0 u2(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-499522837, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1021)");
        }
        d.z zVar = d.z.f132685a;
        f00.r.r(wVar, zVar, sVar.g(zVar), m.d(1537132342, true, new q() { // from class: n61.h4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.v2(sVar, (cw3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u3(f5 f5Var, s sVar, v61.a aVar) {
        if (fr.t.c(aVar, v61.a.C5321a.f204103a)) {
            d dVarQ9 = f5Var.Q9();
            d.e.c cVar = d.e.c.f132543a;
            if (fr.t.c(dVarQ9, cVar)) {
                s.l(sVar, cVar, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.KDR_CONFIRMATION), null, 4, null);
            } else {
                d.i0 i0Var = d.i0.f132589a;
                if (fr.t.c(dVarQ9, i0Var)) {
                    s.l(sVar, i0Var, f5Var, null, 4, null);
                } else {
                    s.l(sVar, d.e0.f132567a, new SetupData(f5Var), null, 4, null);
                }
            }
        } else if (fr.t.c(aVar, v61.a.b.f204104a)) {
            f5Var.Z9();
        } else if (fr.t.c(aVar, v61.a.e.f204107a)) {
            s.l(sVar, d.f0.f132573a, f5Var, null, 4, null);
        } else if (fr.t.c(aVar, v61.a.d.f204106a)) {
            s.l(sVar, d.y.f132682a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(aVar, v61.a.c.f204105a)) {
                throw new p();
            }
            s.l(sVar, d.e.C3293e.f132549a, new ChildPassportApplicationAttachmentsNavigationParams(f5Var, b71.b.OLD_APPLICATION_MONEY_TRANSFER), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u4(s sVar, f5 f5Var, ba1.c cVar) {
        if (fr.t.c(cVar, ba1.c.a.f17812a)) {
            s.l(sVar, d.c0.f132528a, new x81.SetupData(f5Var.O9(), f5Var.C0()), null, 4, null);
        } else if (fr.t.c(cVar, ba1.c.b.f17813a)) {
            f5Var.Z9();
        } else {
            if (!fr.t.c(cVar, ba1.c.C0435c.f17814a)) {
                throw new p();
            }
            s.l(sVar, d.t0.f132667a, new ea1.b.Initial(f5Var), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v2(final s sVar, cw3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1537132342, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1028)");
        }
        xw.b<cw3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.u
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.w2(sVar, (cw3.c.a) obj);
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
    public static final i0 v3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(896386086, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1927)");
        }
        f00.r.o(wVar, q0.c(p81.n.class), (r81.a) sVar.g(d.y.f132682a), m.d(-743504427, true, new q() { // from class: n61.u4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.w3(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.Z(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v4(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1689174549, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:653)");
        }
        f00.r.o(wVar, q0.c(ea1.u.class), sVar.g(d.t0.f132667a), m.d(1444514396, true, new q() { // from class: n61.j4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.w4(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.o0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w2(s sVar, cw3.c.a aVar) {
        if (!fr.t.c(aVar, cw3.c.a.C0819a.f38374a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w3(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-743504427, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1933)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.e1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.x3(sVar, f5Var, (p81.d) obj);
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
    public static final i0 w4(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1444514396, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:657)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.y
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.x4(sVar, f5Var, (ea1.a.InterfaceC1143a) obj);
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
    public static final i0 x2(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-330271252, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1040)");
        }
        f00.r.o(wVar, q0.c(r61.c0.class), sVar.g(d.h0.f132585a), m.d(-1970161765, true, new q() { // from class: n61.w3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.y2(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.K(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x3(s sVar, f5 f5Var, p81.d dVar) {
        if (fr.t.c(dVar, p81.d.a.f153416a)) {
            s.l(sVar, d.c.f132525a, f5Var, null, 4, null);
        } else if (fr.t.c(dVar, p81.d.c.f153418a)) {
            f5Var.Z9();
        } else if (fr.t.c(dVar, p81.d.b.f153417a)) {
            s.l(sVar, d.f0.f132573a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(dVar, p81.d.C3784d.f153419a)) {
                throw new p();
            }
            d.p0 p0Var = d.p0.f132643a;
            sVar.j(p0Var, new w91.SetupData(f5Var, false, 2, null), p0Var);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x4(s sVar, f5 f5Var, ea1.a.InterfaceC1143a interfaceC1143a) {
        if (fr.t.c(interfaceC1143a, ea1.a.InterfaceC1143a.C1144a.f48852a)) {
            s.l(sVar, d.s0.f132661a, f5Var, null, 4, null);
        } else if (interfaceC1143a instanceof ea1.a.InterfaceC1143a.ToDocumentTypePicker) {
            s.l(sVar, d.s.f132658a, new DocumentPickerNavigationParams(((ea1.a.InterfaceC1143a.ToDocumentTypePicker) interfaceC1143a).getDocumentType()), null, 4, null);
        } else if (fr.t.c(interfaceC1143a, ea1.a.InterfaceC1143a.c.f48854a)) {
            s.l(sVar, d.h.f132582a, f5Var, null, 4, null);
        } else if (fr.t.c(interfaceC1143a, ea1.a.InterfaceC1143a.e.f48856a)) {
            s.l(sVar, d.u.f132670a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(interfaceC1143a, ea1.a.InterfaceC1143a.b.f48853a)) {
                throw new p();
            }
            f5Var.Z9();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y2(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1970161765, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1046)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.z2(sVar, f5Var, (r61.a.e) obj);
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
    public static final i0 y3(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1065637671, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1964)");
        }
        f00.r.o(wVar, q0.c(g91.k.class), (i91.a) sVar.g(d.f0.f132573a), m.d(-574252842, true, new q() { // from class: n61.z3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.z3(f5Var, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.d0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y4(final s sVar, final f5 f5Var, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1519922964, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:693)");
        }
        f00.r.o(wVar, q0.c(h71.n.class), sVar.g(d.h.f132582a), m.d(1613765981, true, new q() { // from class: n61.k4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.z4(sVar, f5Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s7.f133167a.i0(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z2(s sVar, f5 f5Var, r61.a.e eVar) {
        if (fr.t.c(eVar, r61.a.e.C4379a.f171980a)) {
            sVar.j(d.a.f132513a, new o61.SetupData(f5Var, f5Var.N9().getIdentityPhotoEnabled()), d.h0.f132585a);
        } else if (fr.t.c(eVar, r61.a.e.b.f171981a)) {
            f5Var.Z9();
        } else if (eVar instanceof r61.a.e.ShowAttachmentPreview) {
            s.l(sVar, d.C3291d.f132531a, ((r61.a.e.ShowAttachmentPreview) eVar).getData(), null, 4, null);
        } else if (fr.t.c(eVar, r61.a.e.C4380e.f171984a)) {
            s.l(sVar, d.p.f132640a, f5Var, null, 4, null);
        } else {
            if (!fr.t.c(eVar, r61.a.e.d.f171983a)) {
                throw new p();
            }
            s.m(sVar, d.j.f132592a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z3(final f5 f5Var, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-574252842, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:1970)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(f5Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.o
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.A3(f5Var, sVar, (g91.a) obj);
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
    public static final i0 z4(final s sVar, final f5 f5Var, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1613765981, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.ChildPassportApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationNavContent.kt:699)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(f5Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n61.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.A4(sVar, f5Var, (h71.a.c) obj);
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
}
