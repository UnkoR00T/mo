package p134y02;

import cb4.DialogData;
import d12.OAuthWebViewData;
import e12.k;
import er.l;
import f00.f0;
import f00.g0;
import f00.s;
import f32.j0;
import fr.q;
import fr.q0;
import h32.a;
import h32.n;
import i12.b;
import l32.i;
import m12.d0;
import mr.c;
import mu.g;
import o12.y;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import r12.o;
import u12.s1;
import u12.v1;
import y2.m;
import z02.MessageDetailsPayload;
import z02.MessageListPayload;
import zx.d;

/* JADX INFO: renamed from: y02.d2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "", "isNativeOAuthActivated", "b0", "(Ler/a;ZLm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: y02.d2$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, v1.class, "exitProcess", "exitProcess()V", 0);
        }

        public final void E() {
            ((v1) this.f66391b).j9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: y02.d2$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, v1.class, "exitToInbox", "exitToInbox()V", 0);
        }

        public final void E() {
            ((v1) this.f66391b).k9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(s sVar, jb4.b bVar) {
        s.l(sVar, s.f222966a, bVar, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(s sVar, DialogData dialogData) {
        s.l(sVar, p.f222952a, dialogData, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C0(final er.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-980259588, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:136)");
        }
        f00.r.n(wVar, q0.c(n.class), m.d(-1827012594, true, new er.q() { // from class: y02.z0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.D0(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.v(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D0(final er.a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1827012594, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:139)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.w1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.E0(aVar, sVar, (a.h) obj);
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
    public static final i0 E0(er.a aVar, s sVar, h32.a.h hVar) {
        if (fr.t.c(hVar, h32.a.h.C1838a.f80503a)) {
            aVar.a();
        } else if (hVar instanceof h32.a.h.g) {
            s.m(sVar, z.f223013a, null, 2, null);
        } else if (hVar instanceof h32.a.h.Error) {
            s.l(sVar, s.f222966a, ((h32.a.h.Error) hVar).getError(), null, 4, null);
        } else if (hVar instanceof h32.a.h.MessagesList) {
            h32.a.h.MessagesList fVar = (h32.a.h.MessagesList) hVar;
            s.l(sVar, w.f222997a, new MessageListPayload(fVar.getDirectoryId(), fVar.getName(), fVar.getType(), null), null, 4, null);
        } else if (hVar instanceof h32.a.h.GoToAuthorization) {
            s.l(sVar, x.f223003a, ((h32.a.h.GoToAuthorization) hVar).getOAuthWebViewData(), null, 4, null);
        } else if (hVar instanceof h32.a.h.Faq) {
            s.l(sVar, t.f222970a, ((h32.a.h.Faq) hVar).getFaq(), null, 4, null);
        } else {
            if (!(hVar instanceof h32.a.h.GoToWriteMessage)) {
                throw new p();
            }
            s.l(sVar, v.o.f222993b, ((h32.a.h.GoToWriteMessage) hVar).getEntryPointData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(492019005, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:183)");
        }
        f00.r.o(wVar, q0.c(o.class), sVar.g(w.f222997a), m.d(-362114322, true, new er.q() { // from class: y02.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.G0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-362114322, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:189)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.g1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.H0(sVar, (r12.a.g) obj);
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
    public static final i0 H0(s sVar, r12.a.g gVar) {
        if (fr.t.c(gVar, r12.a.g.C4318a.f170505a)) {
            sVar.c();
        } else if (gVar instanceof r12.a.g.GoToEdorDetails) {
            r12.a.g.GoToEdorDetails dVar = (r12.a.g.GoToEdorDetails) gVar;
            s.l(sVar, q.f222957a, new MessageDetailsPayload(dVar.getMessage(), dVar.getMessageListDataModel().getDirectoryId(), dVar.getMessageListDataModel().getType(), dVar.getMessageListDataModel().getTitle(), null), null, 4, null);
        } else if (gVar instanceof r12.a.g.GoToEpuapDetails) {
            r12.a.g.GoToEpuapDetails eVar = (r12.a.g.GoToEpuapDetails) gVar;
            s.l(sVar, r.f222962a, new MessageDetailsPayload(eVar.getMessage(), eVar.getMessageListDataModel().getDirectoryId(), eVar.getMessageListDataModel().getType(), eVar.getMessageListDataModel().getTitle(), null), null, 4, null);
        } else if (gVar instanceof r12.a.g.GoToAuthorization) {
            s.l(sVar, x.f223003a, ((r12.a.g.GoToAuthorization) gVar).getOAuthWebViewData(), null, 4, null);
        } else if (gVar instanceof r12.a.g.GoToWriteMessage) {
            s.l(sVar, v.o.f222993b, ((r12.a.g.GoToWriteMessage) gVar).getEntryPointData(), null, 4, null);
        } else {
            if (!(gVar instanceof r12.a.g.Dialog)) {
                throw new p();
            }
            s.l(sVar, p.f222952a, ((r12.a.g.Dialog) gVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1964297598, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:236)");
        }
        f00.r.n(wVar, q0.c(j32.s.class), m.d(1117544592, true, new er.q() { // from class: y02.x0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.J0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.u(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1117544592, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:239)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.r1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.K0(sVar, (j32.d) obj);
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
    public static final i0 K0(s sVar, j32.d dVar) {
        if (fr.t.c(dVar, j32.d.a.f99247a)) {
            sVar.c();
        } else {
            if (!(dVar instanceof j32.d.Error)) {
                throw new p();
            }
            s.l(sVar, s.f222966a, ((j32.d.Error) dVar).getError(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L0(boolean z15, final s sVar, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-858391105, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:256)");
        }
        if (z15) {
            rVar.X(-94053959);
            c cVarC = q0.c(j0.class);
            OAuthWebViewData oAuthWebViewData = (OAuthWebViewData) sVar.g(x.f223003a);
            if (oAuthWebViewData == null) {
                oAuthWebViewData = new OAuthWebViewData(null, 1, null);
            }
            f00.r.o(wVar, cVarC, oAuthWebViewData, m.d(2030690955, true, new er.q() { // from class: y02.p0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Function0.M0(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), m.f222925a.m(), rVar, ((i15 >> 3) & 14) | 27648);
            rVar.R();
        } else {
            rVar.X(-93086387);
            c cVarC2 = q0.c(q32.t.class);
            OAuthWebViewData oAuthWebViewData2 = (OAuthWebViewData) sVar.g(x.f223003a);
            if (oAuthWebViewData2 == null) {
                oAuthWebViewData2 = new OAuthWebViewData(null, 1, null);
            }
            OAuthWebViewData oAuthWebViewData3 = oAuthWebViewData2;
            f00.r.o(wVar, cVarC2, oAuthWebViewData3, m.d(1760511764, true, new er.q() { // from class: y02.q0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Function0.O0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), m.f222925a.p(), rVar, ((i15 >> 3) & 14) | 27648);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M0(final er.a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2030690955, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:263)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.N0(aVar, sVar, (f32.c.InterfaceC1319c) obj);
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
    public static final i0 N0(er.a aVar, s sVar, f32.c.InterfaceC1319c interfaceC1319c) {
        if (fr.t.c(interfaceC1319c, f32.c.InterfaceC1319c.b.f58882a)) {
            aVar.a();
        } else if (fr.t.c(interfaceC1319c, f32.c.InterfaceC1319c.C1320c.f58883a)) {
            sVar.k(y.f223008a, x.f223003a);
        } else {
            if (!fr.t.c(interfaceC1319c, f32.c.InterfaceC1319c.a.f58881a)) {
                throw new p();
            }
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O0(final s sVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1760511764, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:283)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.k1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.P0(sVar, aVar, (q32.c.j) obj);
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
    public static final i0 P0(s sVar, er.a aVar, q32.c.j jVar) {
        if (fr.t.c(jVar, q32.c.j.a.f164138a)) {
            sVar.c();
        } else if (fr.t.c(jVar, q32.c.j.b.f164139a)) {
            aVar.a();
        } else {
            if (!fr.t.c(jVar, q32.c.j.C4078c.f164140a)) {
                throw new p();
            }
            sVar.k(y.f223008a, x.f223003a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(613887488, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:303)");
        }
        f00.r.o(wVar, q0.c(d0.class), sVar.g(q.f222957a), m.d(-240245839, true, new er.q() { // from class: y02.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.R0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.x(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-240245839, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:309)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.o1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.S0(sVar, (m12.a.n) obj);
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
    public static final i0 S0(s sVar, m12.a.n nVar) {
        if (fr.t.c(nVar, m12.a.n.C2995a.f122515a)) {
            sVar.c();
        } else if (nVar instanceof m12.a.n.GoToAuthorization) {
            s.l(sVar, x.f223003a, ((m12.a.n.GoToAuthorization) nVar).getOAuthWebViewData(), null, 4, null);
        } else if (nVar instanceof m12.a.n.ShowNavigationDialog) {
            s.l(sVar, p.f222952a, ((m12.a.n.ShowNavigationDialog) nVar).getDialogData(), null, 4, null);
        } else if (nVar instanceof m12.a.n.MessageForm) {
            s.l(sVar, v.o.f222993b, ((m12.a.n.MessageForm) nVar).getFormEntryData(), null, 4, null);
        } else {
            if (!(nVar instanceof m12.a.n.GoToTechnicalDetails)) {
                throw new p();
            }
            s.l(sVar, u.f222974a, ((m12.a.n.GoToTechnicalDetails) nVar).getDetails(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2086166081, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:344)");
        }
        f00.r.o(wVar, q0.c(y.class), sVar.g(r.f222962a), m.d(1232032754, true, new er.q() { // from class: y02.l0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.U0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.s(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1232032754, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:350)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.d1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.V0(sVar, (o12.a.l) obj);
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
    public static final i0 V0(s sVar, o12.a.l lVar) {
        if (fr.t.c(lVar, o12.a.l.C3476a.f140288a)) {
            sVar.c();
        } else if (lVar instanceof o12.a.l.GoToAuthorization) {
            s.l(sVar, x.f223003a, ((o12.a.l.GoToAuthorization) lVar).getOAuthWebViewData(), null, 4, null);
        } else if (lVar instanceof o12.a.l.ShowNavigationDialog) {
            s.l(sVar, p.f222952a, ((o12.a.l.ShowNavigationDialog) lVar).getDialogData(), null, 4, null);
        } else if (lVar instanceof o12.a.l.GoToUpoPreview) {
            s.l(sVar, b0.f222892a, new ez3.a.File(((o12.a.l.GoToUpoPreview) lVar).getDomainFile()), null, 4, null);
        } else if (lVar instanceof o12.a.l.MessageForm) {
            s.l(sVar, v.o.f222993b, ((o12.a.l.MessageForm) lVar).getFormEntryData(), null, 4, null);
        } else {
            if (!(lVar instanceof o12.a.l.GoToTechnicalDetails)) {
                throw new p();
            }
            s.l(sVar, u.f222974a, ((o12.a.l.GoToTechnicalDetails) lVar).getDetails(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-736522622, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:392)");
        }
        f00.r.o(wVar, q0.c(o32.l.class), sVar.g(u.f222974a), m.d(-1590655949, true, new er.q() { // from class: y02.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.X0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1590655949, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:398)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.m1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Y0(sVar, (o32.a.j) obj);
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
    public static final i0 Y0(s sVar, o32.a.j jVar) {
        if (fr.t.c(jVar, o32.a.j.C3498a.f141933a)) {
            sVar.c();
        } else if (jVar instanceof o32.a.j.Error) {
            s.l(sVar, s.f222966a, ((o32.a.j.Error) jVar).getData(), null, 4, null);
        } else if (jVar instanceof o32.a.j.Dialog) {
            s.l(sVar, p.f222952a, ((o32.a.j.Dialog) jVar).getDialogData(), null, 4, null);
        } else {
            if (!(jVar instanceof o32.a.j.GoToAuthorization)) {
                throw new p();
            }
            s.l(sVar, x.f223003a, ((o32.a.j.GoToAuthorization) jVar).getOAuthWebViewData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(735755971, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:424)");
        }
        f00.r.o(wVar, q0.c(k.class), sVar.g(n.f222941a), m.d(-118377356, true, new er.q() { // from class: y02.s0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.a1(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a1(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-118377356, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:428)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.p1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.b1(sVar, (e12.a.b) obj);
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

    public static final void b0(final er.a<i0> aVar, final boolean z15, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-862926683);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-862926683, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent (ElectronicDeliveryNavContent.kt:61)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a0 a0Var = a0.f222888a;
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: y02.c0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.c0(sVarJ, aVar, z15, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, a0Var, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y02.n0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.c1(aVar, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b1(s sVar, e12.a.b bVar) {
        if (!fr.t.c(bVar, e12.a.b.C1062a.f46821a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 c0(final s sVar, final er.a aVar, final boolean z15, d1 d1Var) {
        f00.r.u(d1Var, a0.f222888a, null, m.b(1948363780, true, new er.r() { // from class: y02.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f222948a, null, m.b(1842429115, true, new er.r() { // from class: y02.b2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y.f223008a, null, m.b(-980259588, true, new er.r() { // from class: y02.c2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.C0(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w.f222997a, null, m.b(492019005, true, new er.r() { // from class: y02.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.F0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.f223013a, null, m.b(1964297598, true, new er.r() { // from class: y02.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.I0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x.f223003a, null, m.b(-858391105, true, new er.r() { // from class: y02.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.L0(z15, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f222957a, null, m.b(613887488, true, new er.r() { // from class: y02.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Q0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.f222962a, null, m.b(2086166081, true, new er.r() { // from class: y02.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.T0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u.f222974a, null, m.b(-736522622, true, new er.r() { // from class: y02.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.W0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, n.f222941a, null, m.b(735755971, true, new er.r() { // from class: y02.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Z0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t.f222970a, null, m.b(-1688985157, true, new er.r() { // from class: y02.j1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.j0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b0.f222892a, null, m.b(-216706564, true, new er.r() { // from class: y02.u1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.m0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.f222966a, null, m.b(1255572029, true, new er.r() { // from class: y02.y1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, p.f222952a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(-1567116674, true, new er.r() { // from class: y02.z1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.s0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, v.o.f222993b, null, m.b(-94838081, true, new er.r() { // from class: y02.a2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.v0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c1(er.a aVar, boolean z15, int i15, r rVar, int i16) {
        b0(aVar, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(final s sVar, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1948363780, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:69)");
        }
        f00.r.n(wVar, q0.c(i.class), m.d(1916197782, true, new er.q() { // from class: y02.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.e0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.n(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(final s sVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1916197782, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:72)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.f0(sVar, aVar, (l32.a.d) obj);
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
    public static final i0 f0(s sVar, er.a aVar, l32.a.d dVar) {
        if (fr.t.c(dVar, l32.a.d.e.f115773a)) {
            sVar.k(y.f223008a, a0.f222888a);
        } else if (dVar instanceof l32.a.d.GoToAgreements) {
            sVar.j(o.f222948a, ((l32.a.d.GoToAgreements) dVar).getAgreementData(), a0.f222888a);
        } else if (dVar instanceof l32.a.d.ToAuthorization) {
            sVar.j(x.f223003a, ((l32.a.d.ToAuthorization) dVar).getOAuthWebViewData(), a0.f222888a);
        } else if (dVar instanceof l32.a.d.Error) {
            s.l(sVar, s.f222966a, ((l32.a.d.Error) dVar).getError(), null, 4, null);
        } else {
            if (!fr.t.c(dVar, l32.a.d.C2790a.f115769a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(final s sVar, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1842429115, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:107)");
        }
        f00.r.o(wVar, q0.c(g12.m.class), sVar.g(o.f222948a), m.d(988295788, true, new er.q() { // from class: y02.w0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.h0(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(final er.a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(988295788, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:111)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.x1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i0(aVar, sVar, (g12.a.b) obj);
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
    public static final i0 i0(er.a aVar, s sVar, g12.a.b bVar) {
        if (bVar instanceof g12.a.b.C1562a) {
            aVar.a();
        } else if (bVar instanceof g12.a.b.ToAuthorization) {
            s.l(sVar, x.f223003a, ((g12.a.b.ToAuthorization) bVar).getOAuthWebViewData(), null, 4, null);
        } else if (bVar instanceof g12.a.b.Error) {
            s.l(sVar, s.f222966a, ((g12.a.b.Error) bVar).getError(), null, 4, null);
        } else {
            if (!(bVar instanceof g12.a.b.ToAgreementDetails)) {
                throw new p();
            }
            s.l(sVar, n.f222941a, ((g12.a.b.ToAgreementDetails) bVar).getFullDescription(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1688985157, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:441)");
        }
        f00.r.o(wVar, q0.c(i12.o.class), sVar.g(t.f222970a), m.d(1897652778, true, new er.q() { // from class: y02.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.k0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f222925a.w(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1897652778, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:445)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l0(sVar, (b) obj);
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
    public static final i0 l0(s sVar, i12.b bVar) {
        if (!fr.t.c(bVar, i12.b.a.f88307a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-216706564, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:458)");
        }
        b0 b0Var = b0.f222892a;
        f00.r.r(wVar, b0Var, sVar.g(b0Var), m.d(-1445495651, true, new er.q() { // from class: y02.c1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.n0(sVar, (ez3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, ez3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1445495651, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:462)");
        }
        xw.b<ez3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.q1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.o0(sVar, (ez3.c.a) obj);
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
    public static final i0 o0(s sVar, ez3.c.a aVar) {
        if (!fr.t.c(aVar, ez3.c.a.C1284a.f54455a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1255572029, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:472)");
        }
        s sVar2 = s.f222966a;
        f00.r.r(wVar, sVar2, sVar.g(sVar2), m.d(1874015548, true, new er.q() { // from class: y02.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q0(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1874015548, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:476)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.e1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r0(sVar, (hb4.b.a) obj);
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
    public static final i0 r0(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1567116674, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:489)");
        }
        p pVar = p.f222952a;
        f00.r.r(wVar, pVar, sVar.g(pVar), m.d(-1703059437, true, new er.q() { // from class: y02.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.t0(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1703059437, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:493)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.l1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.u0(sVar, (cb4.f.a) obj);
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
    public static final i0 u0(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-94838081, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:505)");
        }
        f00.r.o(wVar, q0.c(v1.class), sVar.g(v.o.f222993b), m.d(-803167442, true, new er.q() { // from class: y02.a1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.w0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.d(-227168255, true, new er.q() { // from class: y02.b1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.y0(sVar, (v1) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-803167442, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:509)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y02.f1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.x0(sVar, (u12.r) obj);
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
    public static final i0 x0(s sVar, u12.r rVar) {
        if (rVar instanceof u12.r.a) {
            sVar.c();
        } else {
            if (!(rVar instanceof u12.r.ExitToInbox)) {
                throw new p();
            }
            u12.r.ExitToInbox exitToInbox = (u12.r.ExitToInbox) rVar;
            s.l(sVar, w.f222997a, new MessageListPayload(exitToInbox.getMessageDetailsPayload().getDirectoryId(), exitToInbox.getMessageDetailsPayload().getDirectoryName(), exitToInbox.getMessageDetailsPayload().getDirectoryType(), null), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(final s sVar, v1 v1Var, r rVar, int i15) {
        if (t.k()) {
            t.o(-227168255, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.ElectronicDeliveryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectronicDeliveryNavContent.kt:524)");
        }
        boolean zG = rVar.G(v1Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new a(v1Var);
            rVar.v(objE);
        }
        mr.g gVar = (mr.g) objE;
        boolean zG2 = rVar.G(v1Var);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new b(v1Var);
            rVar.v(objE2);
        }
        er.a aVar = (er.a) gVar;
        er.a aVar2 = (er.a) ((mr.g) objE2);
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: y02.s1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.z0(sVar, (OAuthWebViewData) obj);
                }
            };
            rVar.v(objE3);
        }
        l lVar = (l) objE3;
        boolean zG4 = rVar.G(sVar);
        Object objE4 = rVar.E();
        if (zG4 || objE4 == r.INSTANCE.a()) {
            objE4 = new l() { // from class: y02.t1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.A0(sVar, (jb4.b) obj);
                }
            };
            rVar.v(objE4);
        }
        l lVar2 = (l) objE4;
        boolean zG5 = rVar.G(sVar);
        Object objE5 = rVar.E();
        if (zG5 || objE5 == r.INSTANCE.a()) {
            objE5 = new l() { // from class: y02.v1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.B0(sVar, (DialogData) obj);
                }
            };
            rVar.v(objE5);
        }
        s1.X(v1Var, aVar, aVar2, lVar, lVar2, (l) objE5, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z0(s sVar, OAuthWebViewData oAuthWebViewData) {
        s.l(sVar, x.f223003a, oAuthWebViewData, null, 4, null);
        return i0.f148189a;
    }
}
