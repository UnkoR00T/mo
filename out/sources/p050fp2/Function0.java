package p050fp2;

import al0.s0;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import aq2.SetupData;
import aq2.o;
import dq2.f;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fq2.c;
import fq2.z;
import fr.q0;
import fr.t;
import gp2.PassportAgreementAttachmentsNavigationParams;
import gp2.e;
import gp2.k0;
import iq2.n;
import kq2.b;
import mp2.u;
import mu.g;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import pp2.a;
import sp2.DocumentPickerNavigationParams;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: fp2.b2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "X", "(Ler/a;Lm2/r;I)V", "passportagreement_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: fp2.b2$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f65911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f65912c;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.DIPLOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.BIOMETRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.TEMPORARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f65910a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b.GUARDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f65911b = iArr2;
            int[] iArr3 = new int[jp2.b.values().length];
            try {
                iArr3[jp2.b.GUARDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[jp2.b.DIPLOMATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[jp2.b.MSWIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f65912c = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(s sVar, f fVar, er.a aVar, c.InterfaceC1467c interfaceC1467c) {
        if (t.c(interfaceC1467c, c.InterfaceC1467c.a.f66153a)) {
            sVar.c();
        } else if (t.c(interfaceC1467c, c.InterfaceC1467c.b.f66154a)) {
            fVar.k9();
        } else if (t.c(interfaceC1467c, c.InterfaceC1467c.C1468c.f66155a)) {
            aVar.a();
        } else {
            if (!(interfaceC1467c instanceof c.InterfaceC1467c.ToEdorAuth)) {
                throw new p();
            }
            s.l(sVar, u.f66016a, ((c.InterfaceC1467c.ToEdorAuth) interfaceC1467c).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(final s sVar, final f fVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-262856126, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:129)");
        }
        f00.r.o(wVar, q0.c(o.class), sVar.g(y.f66037a), m.d(-1864445647, true, new q() { // from class: fp2.d1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.C0(sVar, fVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C0(final s sVar, final f fVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1864445647, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:133)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.g1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.D0(sVar, fVar, (aq2.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D0(s sVar, f fVar, aq2.c cVar) {
        if (cVar instanceof aq2.c.Next) {
            int i15 = a.f65910a[((aq2.c.Next) cVar).getPassportType().ordinal()];
            if (i15 == 1) {
                s.l(sVar, n.b.f65972a, new PassportAgreementAttachmentsNavigationParams(fVar, jp2.b.DIPLOMATIC), null, 4, null);
            } else if (i15 == 2) {
                s.l(sVar, n.b.f65972a, new PassportAgreementAttachmentsNavigationParams(fVar, jp2.b.MSWIA), null, 4, null);
            } else {
                if (i15 != 3 && i15 != 4 && i15 != 5) {
                    throw new p();
                }
                s.l(sVar, a0.f65898a, fVar, null, 4, null);
            }
        } else if (t.c(cVar, aq2.c.b.f14078a)) {
            fVar.k9();
        } else {
            if (!t.c(cVar, aq2.c.a.f14077a)) {
                throw new p();
            }
            sVar.k(x.f66032a, u.f66016a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E0(final s sVar, final f fVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-397438815, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:171)");
        }
        f00.r.o(wVar, q0.c(n.class), sVar.g(a0.f65898a), m.d(-1999028336, true, new q() { // from class: fp2.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.F0(sVar, fVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F0(final s sVar, final f fVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1999028336, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:175)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.G0(sVar, fVar, (iq2.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G0(s sVar, f fVar, iq2.c cVar) {
        if (t.c(cVar, iq2.c.a.f96496a)) {
            sVar.c();
        } else if (t.c(cVar, iq2.c.b.f96497a)) {
            fVar.k9();
        } else {
            if (!(cVar instanceof iq2.c.Next)) {
                throw new p();
            }
            int i15 = a.f65911b[((iq2.c.Next) cVar).getWhoAgrees().ordinal()];
            if (i15 == 1) {
                s.l(sVar, b0.f65905a, new lq2.b.Initial(fVar), null, 4, null);
            } else {
                if (i15 != 2) {
                    throw new p();
                }
                s.l(sVar, n.a.f65970a, new PassportAgreementAttachmentsNavigationParams(fVar, jp2.b.GUARDIAN), null, 4, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H0(final s sVar, final f fVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-532021504, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:202)");
        }
        f00.r.o(wVar, q0.c(pp2.n.class), sVar.g(q.f65991a), m.d(-2133611025, true, new q() { // from class: fp2.z0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.I0(sVar, fVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I0(final s sVar, final f fVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2133611025, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:206)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.s1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.J0(sVar, fVar, (a.InterfaceC3982a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J0(s sVar, f fVar, pp2.a.InterfaceC3982a interfaceC3982a) {
        if (t.c(interfaceC3982a, pp2.a.InterfaceC3982a.C3983a.f161597a)) {
            sVar.c();
        } else if (t.c(interfaceC3982a, pp2.a.InterfaceC3982a.b.f161598a)) {
            fVar.k9();
        } else if (t.c(interfaceC3982a, pp2.a.InterfaceC3982a.c.f161599a)) {
            s.l(sVar, p.f65983a, fVar, null, 4, null);
        } else if (t.c(interfaceC3982a, pp2.a.InterfaceC3982a.d.f161600a)) {
            s.l(sVar, v.f66022a, fVar, null, 4, null);
        } else {
            if (!t.c(interfaceC3982a, pp2.a.InterfaceC3982a.e.f161601a)) {
                throw new p();
            }
            sVar.j(v.f66022a, fVar, q.f65991a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K0(final s sVar, final f fVar, final er.a aVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-666604193, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:233)");
        }
        f00.r.o(wVar, q0.c(u.class), sVar.g(p.f65983a), m.d(2026773582, true, new q() { // from class: fp2.e1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.L0(sVar, fVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L0(final s sVar, final f fVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2026773582, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:237)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.m1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.M0(sVar, fVar, aVar, (mp2.c.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M0(s sVar, f fVar, er.a aVar, mp2.c.e eVar) {
        if (t.c(eVar, mp2.c.e.d.f127492a)) {
            s.l(sVar, z.f66042a, fVar, null, 4, null);
        } else if (t.c(eVar, mp2.c.e.a.f127489a)) {
            sVar.c();
        } else if (t.c(eVar, mp2.c.e.b.f127490a)) {
            fVar.k9();
        } else {
            if (!t.c(eVar, mp2.c.e.C3150c.f127491a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N0(final s sVar, final f fVar, final er.a aVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-801186882, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:254)");
        }
        f00.r.o(wVar, q0.c(up2.f0.class), sVar.g(v.f66022a), m.d(1892190893, true, new q() { // from class: fp2.b1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.O0(sVar, fVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O0(final s sVar, final f fVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1892190893, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:260)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.p1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.P0(sVar, fVar, aVar, (up2.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P0(s sVar, f fVar, er.a aVar, up2.c.a aVar2) {
        if (t.c(aVar2, up2.c.a.d.f199597a)) {
            s.l(sVar, z.f66042a, fVar, null, 4, null);
        } else if (t.c(aVar2, up2.c.a.C5187a.f199594a)) {
            sVar.c();
        } else if (t.c(aVar2, up2.c.a.b.f199595a)) {
            fVar.k9();
        } else if (t.c(aVar2, up2.c.a.C5188c.f199596a)) {
            aVar.a();
        } else {
            if (!(aVar2 instanceof up2.c.a.ToDatePicker)) {
                throw new p();
            }
            s.l(sVar, r.f65998a, ((up2.c.a.ToDatePicker) aVar2).getPickerData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q0(s sVar, f fVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-935769571, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:326)");
        }
        S0(sVar, fVar, wVar, n.a.f65970a, rVar, ((i15 >> 3) & 14) | 48);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R0(s sVar, f fVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1070352260, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:333)");
        }
        S0(sVar, fVar, wVar, n.b.f65972a, rVar, ((i15 >> 3) & 14) | 48);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    private static final void S0(final s sVar, final f fVar, w wVar, n nVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-97270980, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.getAttachmentsNavContent (PassportAgreementNavContent.kt:284)");
        }
        f00.r.o(wVar, q0.c(k0.class), sVar.g(nVar), m.d(1788251947, true, new q() { // from class: fp2.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.T0(sVar, fVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.u(), rVar, (i15 & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T0(final s sVar, final f fVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1788251947, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.getAttachmentsNavContent.<anonymous> (PassportAgreementNavContent.kt:291)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.r1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.U0(sVar, fVar, (e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U0(s sVar, f fVar, e eVar) {
        if (t.c(eVar, e.a.f75922a)) {
            sVar.c();
        } else if (t.c(eVar, e.b.f75923a)) {
            fVar.k9();
        } else if (eVar instanceof e.ShowAttachmentPreview) {
            s.l(sVar, m.f65963a, ((e.ShowAttachmentPreview) eVar).getData(), null, 4, null);
        } else {
            if (!(eVar instanceof e.Next)) {
                throw new p();
            }
            int i15 = a.f65912c[((e.Next) eVar).getAttachmentType().ordinal()];
            if (i15 == 1) {
                s.l(sVar, b0.f65905a, new lq2.b.Initial(fVar), null, 4, null);
            } else {
                if (i15 != 2 && i15 != 3) {
                    throw new p();
                }
                s.l(sVar, a0.f65898a, fVar, null, 4, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V0(er.a aVar, int i15, r rVar, int i16) {
        X(aVar, rVar, g4.a(i15 | 1));
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
    public static final void X(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1721464377);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1721464377, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent (PassportAgreementNavContent.kt:58)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            y0 y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final f fVar = (f) q7.d.c(q0.c(f.class), y0VarC, null, j7.a.a(y0VarC, rVarH, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
            xw.b<dq2.b> bVarY1 = fVar.Y1();
            int i17 = i16 & 14;
            boolean zG = (i17 == 4) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: fp2.e0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.Y(aVar, sVarJ, (dq2.b) obj);
                    }
                };
                rVarH.v(objE);
            }
            f0.b(bVarY1, (l) objE, rVarH, xw.b.f221619c);
            x xVar = x.f66032a;
            boolean zG2 = rVarH.G(sVarJ) | (i17 == 4) | rVarH.G(fVar);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: fp2.p0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.Z(sVarJ, aVar, fVar, (d1) obj);
                    }
                };
                rVarH.v(objE2);
            }
            d0.j(sVarJ, xVar, (l) objE2, rVarH, s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fp2.a1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.V0(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(er.a aVar, s sVar, dq2.b bVar) {
        if (t.c(bVar, dq2.b.a.f44064a)) {
            aVar.a();
        } else {
            if (!(bVar instanceof dq2.b.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, s.f66004a, ((dq2.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 Z(final s sVar, final er.a aVar, final f fVar, d1 d1Var) {
        f00.r.u(d1Var, x.f66032a, null, m.b(970389562, true, new er.r() { // from class: fp2.l1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.a0(sVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f65977a, null, m.b(-128273437, true, new er.r() { // from class: fp2.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d0(sVar, fVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y.f66037a, null, m.b(-262856126, true, new er.r() { // from class: fp2.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.B0(sVar, fVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a0.f65898a, null, m.b(-397438815, true, new er.r() { // from class: fp2.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.E0(sVar, fVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f65991a, null, m.b(-532021504, true, new er.r() { // from class: fp2.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.H0(sVar, fVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p.f65983a, null, m.b(-666604193, true, new er.r() { // from class: fp2.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.K0(sVar, fVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, v.f66022a, null, m.b(-801186882, true, new er.r() { // from class: fp2.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.N0(sVar, fVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, n.a.f65970a, null, m.b(-935769571, true, new er.r() { // from class: fp2.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Q0(sVar, fVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, n.b.f65972a, null, m.b(-1070352260, true, new er.r() { // from class: fp2.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.R0(sVar, fVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f65963a, null, m.b(-1204934949, true, new er.r() { // from class: fp2.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g0(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, s.f66004a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(2142564067, true, new er.r() { // from class: fp2.v1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.j0(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, w.f66026a, null, m.b(2007981378, true, new er.r() { // from class: fp2.w1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.m0(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u.f66016a, null, m.b(1873398689, true, new er.r() { // from class: fp2.x1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p0(sVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b0.f65905a, null, m.b(1738816000, true, new er.r() { // from class: fp2.y1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.s0(sVar, fVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t.f66010a, null, m.b(1604233311, true, new er.r() { // from class: fp2.z1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.v0(sVar, fVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.f66042a, null, m.b(1469650622, true, new er.r() { // from class: fp2.a2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.y0(sVar, fVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, r.f65998a, sVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(final s sVar, final er.a aVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(970389562, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:77)");
        }
        f00.r.n(wVar, q0.c(yp2.p.class), m.d(149147624, true, new q() { // from class: fp2.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.b0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.s(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(final s sVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(149147624, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:80)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.o1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.c0(sVar, aVar, (yp2.c.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(s sVar, er.a aVar, yp2.c.d dVar) {
        if (t.c(dVar, yp2.c.d.C6139c.f228401a)) {
            s.m(sVar, o.f65977a, null, 2, null);
        } else if (t.c(dVar, yp2.c.d.a.f228399a)) {
            aVar.a();
        } else {
            if (!(dVar instanceof yp2.c.d.HandleGenericError)) {
                throw new p();
            }
            s.l(sVar, w.f66026a, ((yp2.c.d.HandleGenericError) dVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(final s sVar, final f fVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-128273437, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:98)");
        }
        f00.r.n(wVar, q0.c(kp2.n.class), m.d(932206609, true, new q() { // from class: fp2.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.e0(sVar, fVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.r(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(final s sVar, final f fVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(932206609, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:101)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.f0(sVar, fVar, (kp2.c.InterfaceC2709c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(s sVar, f fVar, kp2.c.InterfaceC2709c interfaceC2709c) {
        if (t.c(interfaceC2709c, kp2.c.InterfaceC2709c.d.f112180a)) {
            s.l(sVar, y.f66037a, new SetupData(fVar), null, 4, null);
        } else if (t.c(interfaceC2709c, kp2.c.InterfaceC2709c.a.f112178a)) {
            sVar.c();
        } else if (interfaceC2709c instanceof kp2.c.InterfaceC2709c.b) {
            s.l(sVar, w.f66026a, ((kp2.c.InterfaceC2709c.b) interfaceC2709c).a(), null, 4, null);
        } else {
            if (!(interfaceC2709c instanceof kp2.c.InterfaceC2709c.ToEdorAuth)) {
                throw new p();
            }
            s.l(sVar, u.f66016a, ((kp2.c.InterfaceC2709c.ToEdorAuth) interfaceC2709c).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1204934949, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:342)");
        }
        m mVar = m.f65963a;
        f00.r.r(wVar, mVar, sVar.g(mVar), m.d(955410005, true, new q() { // from class: fp2.y0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.h0(sVar, (dx3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(final s sVar, dx3.c cVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(955410005, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:348)");
        }
        xw.b<dx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.k1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i0(sVar, (dx3.c.a) obj);
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
    public static final i0 i0(s sVar, dx3.c.a aVar) {
        if (!t.c(aVar, dx3.c.a.C1047a.f45490a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2142564067, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:361)");
        }
        s sVar2 = s.f66004a;
        f00.r.r(wVar, sVar2, sVar.g(sVar2), m.d(1928588398, true, new q() { // from class: fp2.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.k0(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1928588398, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:366)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l0(sVar, (cb4.f.a) obj);
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
    public static final i0 l0(s sVar, cb4.f.a aVar) {
        if (!t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2007981378, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:376)");
        }
        w wVar2 = w.f66026a;
        f00.r.r(wVar, wVar2, sVar.g(wVar2), m.d(316969891, true, new q() { // from class: fp2.x0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.n0(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(316969891, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:382)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.o0(sVar, (hb4.b.a) obj);
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
    public static final i0 o0(s sVar, hb4.b.a aVar) {
        if (!t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(final s sVar, final er.a aVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1873398689, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:392)");
        }
        u uVar = u.f66016a;
        f00.r.r(wVar, uVar, sVar.g(uVar), m.d(-873825114, true, new q() { // from class: fp2.s0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q0(sVar, aVar, (mv3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(final s sVar, final er.a aVar, mv3.c cVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-873825114, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:398)");
        }
        xw.b<mv3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.u1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r0(sVar, aVar, (mv3.c.a) obj);
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
    public static final i0 r0(s sVar, er.a aVar, mv3.c.a aVar2) {
        if (t.c(aVar2, mv3.c.a.C3193a.f128686a)) {
            sVar.c();
        } else {
            if (!t.c(aVar2, mv3.c.a.b.f128687a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(final s sVar, final f fVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1738816000, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:409)");
        }
        f00.r.o(wVar, q0.c(lq2.u.class), sVar.g(b0.f65905a), m.d(-665818895, true, new q() { // from class: fp2.c1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.t0(sVar, fVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(final s sVar, final f fVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-665818895, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:413)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.t1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.u0(sVar, fVar, (lq2.a.InterfaceC2907a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u0(s sVar, f fVar, lq2.a.InterfaceC2907a interfaceC2907a) {
        if (t.c(interfaceC2907a, lq2.a.InterfaceC2907a.C2908a.f119499a)) {
            sVar.c();
        } else if (interfaceC2907a instanceof lq2.a.InterfaceC2907a.ToDocumentTypePicker) {
            s.l(sVar, t.f66010a, new DocumentPickerNavigationParams(((lq2.a.InterfaceC2907a.ToDocumentTypePicker) interfaceC2907a).getDocumentType()), null, 4, null);
        } else if (t.c(interfaceC2907a, lq2.a.InterfaceC2907a.c.f119501a)) {
            s.l(sVar, q.f65991a, fVar, null, 4, null);
        } else if (t.c(interfaceC2907a, lq2.a.InterfaceC2907a.e.f119503a)) {
            s.l(sVar, v.f66022a, fVar, null, 4, null);
        } else {
            if (!t.c(interfaceC2907a, lq2.a.InterfaceC2907a.b.f119500a)) {
                throw new p();
            }
            fVar.k9();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(final s sVar, final f fVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1604233311, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:439)");
        }
        f00.r.o(wVar, q0.c(sp2.l.class), sVar.g(t.f66010a), m.d(-800401584, true, new q() { // from class: fp2.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.w0(sVar, fVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w0(final s sVar, final f fVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-800401584, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:445)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.f1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.x0(sVar, fVar, (sp2.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x0(s sVar, f fVar, sp2.a aVar) {
        if (t.c(aVar, sp2.a.C4719a.f183400a)) {
            sVar.c();
        } else {
            if (!(aVar instanceof sp2.a.GoBackWithResult)) {
                throw new p();
            }
            s.l(sVar, b0.f65905a, new lq2.b.DocumentPicker(fVar, ((sp2.a.GoBackWithResult) aVar).getSelectedDocumentType()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(final s sVar, final f fVar, final er.a aVar, p114t0.f fVar2, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1469650622, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:462)");
        }
        f00.r.o(wVar, q0.c(z.class), sVar.g(z.f66042a), m.d(-934984273, true, new q() { // from class: fp2.w0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.z0(sVar, fVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f65947a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z0(final s sVar, final f fVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-934984273, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.PassportAgreementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementNavContent.kt:468)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(fVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: fp2.q1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.A0(sVar, fVar, aVar, (c.InterfaceC1467c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
