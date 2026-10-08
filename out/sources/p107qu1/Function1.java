package p107qu1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import mr.c;
import mu.g;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import ru1.a;
import su1.b;
import wn3.h;
import xu1.SetupData;
import xu1.a1;
import y2.m;
import y30.n;
import zx.d;

/* JADX INFO: renamed from: qu1.k0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lf00/s;", "Loq/i0;", "navGraphReady", "Lgx/b;", "navigateToGlobalDestination", "", "showTemporaryDrivingLicence", "y", "(Ler/l;Ler/l;ZLm2/r;I)V", "drivinglicence_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: qu1.k0$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"qu1/k0$a", "Lgv3/a;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "route", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements gv3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String route = g.f168962a.getRoute();

        a() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getRoute() {
            return this.route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }
    }

    /* JADX INFO: renamed from: qu1.k0$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168979a;

        static {
            int[] iArr = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr[n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f168979a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final s sVar, boolean z15, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-316214532, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:49)");
        }
        c cVarC = q0.c(a1.class);
        SetupData setupData = (SetupData) sVar.g(k.f168976a);
        if (setupData == null) {
            setupData = new SetupData(z15);
        }
        f00.r.o(wVar, cVarC, setupData, m.d(1479960877, true, new q() { // from class: qu1.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.B(lVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f168953a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(final l lVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1479960877, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:55)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qu1.y
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.C(lVar, sVar, (xu1.n) obj);
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
    public static final i0 C(l lVar, s sVar, xu1.n nVar) {
        gx.b bVar;
        if (nVar instanceof xu1.n.GoToVerification) {
            int i15 = b.f168979a[((xu1.n.GoToVerification) nVar).getSelectedType().ordinal()];
            if (i15 == 1) {
                bVar = wn3.g.f214213a;
            } else {
                if (i15 != 2) {
                    throw new p();
                }
                bVar = h.f214214a;
            }
            lVar.b(bVar);
        } else if (nVar instanceof xu1.n.e) {
            lVar.b(as2.a.C0311a.f14330a);
        } else if (nVar instanceof xu1.n.GoToHistoricDocuments) {
            s.l(sVar, i.f168968a, ((xu1.n.GoToHistoricDocuments) nVar).getData(), null, 4, null);
        } else {
            if (nVar instanceof xu1.n.a) {
                lVar.b(new tg1.a.ToDashboard(false, 1, null));
            } else if (nVar instanceof xu1.n.Error) {
                s.l(sVar, j.f168972a, ((xu1.n.Error) nVar).getError(), null, 4, null);
            } else if (nVar instanceof xu1.n.ShowDialog) {
                s.l(sVar, f.f168959a, ((xu1.n.ShowDialog) nVar).getDialogData(), null, 4, null);
            } else if (nVar instanceof xu1.n.ShowAsyncDownloadLoader) {
                g gVar = g.f168962a;
                ru1.a.InterfaceC4493a.SetupData setupDataA = ((xu1.n.ShowAsyncDownloadLoader) nVar).getSetupData();
                k kVar = k.f168976a;
                sVar.j(gVar, setupDataA, kVar != null ? kVar : null);
            } else if (nVar instanceof xu1.n.GoToMoreDialog) {
                s.l(sVar, l.f168980a, ((xu1.n.GoToMoreDialog) nVar).getShortcutsTransferModel(), null, 4, null);
            } else {
                if (!(nVar instanceof xu1.n.GoToServiceOrDocument)) {
                    throw new p();
                }
                lVar.b(((xu1.n.GoToServiceOrDocument) nVar).getGlobalEvent());
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1138670221, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:113)");
        }
        f00.r.o(wVar, q0.c(su1.n.class), sVar.g(i.f168968a), m.d(-1590955164, true, new q() { // from class: qu1.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.E(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f168953a.e(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1590955164, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:120)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qu1.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.F(sVar, (b) obj);
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
    public static final i0 F(s sVar, su1.b bVar) {
        if (bVar instanceof su1.b.GoToHistoricDocumentsDetails) {
            s.l(sVar, h.f168965a, ((su1.b.GoToHistoricDocumentsDetails) bVar).getPickedDocument(), null, 4, null);
        } else {
            if (!fr.t.c(bVar, su1.b.a.f184382a)) {
                throw new p();
            }
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1396937204, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:137)");
        }
        f00.r.o(wVar, q0.c(uu1.q.class), sVar.g(h.f168965a), m.d(944652261, true, new q() { // from class: qu1.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.H(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f168953a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(944652261, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:144)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qu1.z
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.I(sVar, (uu1.b) obj);
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
    public static final i0 I(s sVar, uu1.b bVar) {
        if (fr.t.c(bVar, uu1.b.a.f201463a)) {
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-362422667, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:155)");
        }
        j jVar = j.f168972a;
        f00.r.r(wVar, jVar, sVar.g(jVar), m.d(502473686, true, new q() { // from class: qu1.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.K(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(502473686, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:160)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qu1.w
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.L(sVar, (hb4.b.a) obj);
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
    public static final i0 L(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2121782538, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:172)");
        }
        f00.r.o(wVar, q0.c(av1.l.class), sVar.g(l.f168980a), m.d(1720899815, true, new q() { // from class: qu1.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.N(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f168953a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1720899815, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:177)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qu1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.O(sVar, (av1.b) obj);
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
    public static final i0 O(s sVar, av1.b bVar) {
        if (!fr.t.c(bVar, av1.b.a.f14673a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(413824887, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:191)");
        }
        f fVar2 = f.f168959a;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), m.d(281328130, true, new q() { // from class: qu1.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.Q(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(281328130, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:196)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qu1.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.R(sVar, (cb4.f.a) obj);
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
    public static final i0 R(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(final s sVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1345534984, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:206)");
        }
        boolean zG = rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qu1.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.T(sVar, lVar, (a.InterfaceC4493a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        int i17 = i16 & 14;
        final ru1.a aVar = (ru1.a) q7.d.c(q0.c(ru1.a.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        f00.r.r(wVar, new a(), aVar.getSetupData().getScreenData(), m.d(1060563752, true, new q() { // from class: qu1.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.U(lVar, aVar, sVar, (gv3.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, i17 | 3072);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru1.a T(s sVar, l lVar, ru1.a.InterfaceC4493a interfaceC4493a) {
        ru1.a.InterfaceC4493a.SetupData setupData = (ru1.a.InterfaceC4493a.SetupData) sVar.g(g.f168962a);
        if (setupData == null) {
            setupData = new ru1.a.InterfaceC4493a.SetupData(true, new gv3.b.DocumentDownloadSetupData(rq0.b.d.DRIVING_LICENCE, null, 2, null));
            lVar.b(new tg1.a.ToDashboard(false, 1, null));
        }
        return (ru1.a) interfaceC4493a.a(setupData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(final l lVar, final ru1.a aVar, final s sVar, gv3.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1060563752, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceNavContent.kt:226)");
        }
        xw.b<gv3.b.a> bVarY1 = bVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: qu1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.V(lVar, aVar, sVar, (gv3.b.a) obj);
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
    public static final i0 V(l lVar, ru1.a aVar, s sVar, gv3.b.a aVar2) {
        if (aVar2 instanceof gv3.b.a.Close) {
            lVar.b(new tg1.a.ToDashboard(false, 1, null));
        } else if (aVar2 instanceof gv3.b.a.LoadDocument) {
            sVar.j(k.f168976a, new SetupData(aVar.getSetupData().getFromTemporaryDrivingLicence()), g.f168962a);
        } else if (aVar2 instanceof gv3.b.a.Error) {
            s.l(sVar, j.f168972a, ((gv3.b.a.Error) aVar2).getError(), null, 4, null);
        } else {
            if (!(aVar2 instanceof gv3.b.a.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, f.f168959a, ((gv3.b.a.ShowDialog) aVar2).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(l lVar, l lVar2, boolean z15, int i15, r rVar, int i16) {
        y(lVar, lVar2, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void y(final l<? super s, i0> lVar, final l<? super gx.b, i0> lVar2, final boolean z15, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(239518685);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(239518685, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.DrivingLicenceNavContent (DrivingLicenceNavContent.kt:42)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            k kVar = k.f168976a;
            boolean zG = ((i16 & 896) == 256) | rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: qu1.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.z(sVarJ, z15, lVar2, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, kVar, (l) objE, rVarH, s.f54562e | 48);
            lVar.b(sVarJ);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qu1.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.W(lVar, lVar2, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 z(final s sVar, final boolean z15, final l lVar, d1 d1Var) {
        f00.r.u(d1Var, k.f168976a, null, m.b(-316214532, true, new er.r() { // from class: qu1.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.A(sVar, z15, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.f168968a, null, m.b(-1138670221, true, new er.r() { // from class: qu1.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.D(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f168965a, null, m.b(1396937204, true, new er.r() { // from class: qu1.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.G(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f168972a, null, m.b(-362422667, true, new er.r() { // from class: qu1.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.J(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f168980a, null, m.b(-2121782538, true, new er.r() { // from class: qu1.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.M(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, f.f168959a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(413824887, true, new er.r() { // from class: qu1.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.P(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, g.f168962a, null, m.b(-1345534984, true, new er.r() { // from class: qu1.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.S(sVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }
}
