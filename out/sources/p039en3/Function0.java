package p039en3;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.a;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fn3.VehiclesDownloadLoaderSetupData;
import fr.q0;
import fr.t;
import in3.e;
import in3.i;
import kn3.k;
import kn3.v;
import on3.b;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import pn3.n;
import pn3.x;
import q7.d;
import y2.m;

/* JADX INFO: renamed from: en3.x, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Lgx/b;", "navigateToGlobalDestination", "Lwm3/a;", "destination", "x", "(Ler/a;Ler/l;Lwm3/a;Lm2/r;I)V", "Len3/y;", "V", "(Lwm3/a;)Len3/y;", "vehicles_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(a aVar, s sVar, l lVar, n.f fVar) {
        if (fVar instanceof n.f.a) {
            aVar.a();
        } else if (fVar instanceof n.f.GoToVehicleDetails) {
            s.i(sVar, y.f.f52191a, new b.VehicleData(((n.f.GoToVehicleDetails) fVar).getVehicleDocumentData()), null, 4, null);
        } else if (fVar instanceof n.f.Error) {
            s.i(sVar, y.c.f52185a, ((n.f.Error) fVar).getError(), null, 4, null);
        } else if (fVar instanceof n.f.ShowDialog) {
            s.i(sVar, y.a.f52181a, ((n.f.ShowDialog) fVar).getDialogData(), null, 4, null);
        } else if (fVar instanceof n.f.e) {
            s.i(sVar, y.b.f52183a, null, y.g.f52193a, 2, null);
        } else {
            if (!t.c(fVar, n.f.c.f161266a)) {
                throw new p();
            }
            lVar.b(m83.a.C3059a.f124582a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(final s sVar, final wm3.a aVar, final a aVar2, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1256242013, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:86)");
        }
        boolean zG = rVar.G(sVar) | rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: en3.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.C(sVar, aVar, (v.b) obj);
                }
            };
            rVar.v(objE);
        }
        v vVar = (v) d.c(q0.c(v.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<kn3.l.p> bVarY1 = vVar.Y1();
        boolean zG2 = rVar.G(aVar) | rVar.W(aVar2) | rVar.G(sVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: en3.j
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.D(aVar, aVar2, sVar, lVar, (kn3.l.p) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        k.q(vVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v C(s sVar, wm3.a aVar, v.b bVar) {
        Object registrationNo = (b) sVar.e(y.f.f52191a);
        if (registrationNo == null) {
            wm3.a.VehicleDetails vehicleDetails = aVar instanceof wm3.a.VehicleDetails ? (wm3.a.VehicleDetails) aVar : null;
            registrationNo = new b.RegistrationNo(vehicleDetails != null ? vehicleDetails.getRegistrationNo() : null, false);
        }
        return bVar.a(registrationNo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(wm3.a aVar, a aVar2, s sVar, l lVar, kn3.l.p pVar) {
        if (pVar instanceof kn3.l.p.a) {
            if (aVar instanceof wm3.a.VehicleDetails) {
                aVar2.a();
            } else {
                if (!t.c(aVar, wm3.a.b.f214154a)) {
                    throw new p();
                }
                y.g gVar = y.g.f52193a;
                s.i(sVar, gVar, null, gVar, 2, null);
            }
        } else if (pVar instanceof kn3.l.p.ShowAsyncDownloadLoader) {
            sVar.h(y.b.f52183a, ((kn3.l.p.ShowAsyncDownloadLoader) pVar).getVehiclesDownloadLoaderSetupData(), y.f.f52191a);
        } else if (pVar instanceof kn3.l.p.Error) {
            s.i(sVar, y.c.f52185a, ((kn3.l.p.Error) pVar).getError(), null, 4, null);
        } else if (pVar instanceof kn3.l.p.GoToVehicleHistory) {
            kn3.l.p.GoToVehicleHistory gVar2 = (kn3.l.p.GoToVehicleHistory) pVar;
            lVar.b(new zi3.a.ToVehicleHistory(gVar2.getRegistrationNumber(), gVar2.getVin(), Boolean.TRUE, gVar2.getFirstRegistrationDate()));
        } else if (pVar instanceof kn3.l.p.ShowDialog) {
            s.i(sVar, y.a.f52181a, ((kn3.l.p.ShowDialog) pVar).getDialogData(), null, 4, null);
        } else if (t.c(pVar, kn3.l.p.c.f111561a)) {
            s.i(sVar, y.d.f52187a, null, null, 6, null);
        } else if (pVar instanceof kn3.l.p.GoToMoreDialog) {
            s.i(sVar, y.e.f52189a, ((kn3.l.p.GoToMoreDialog) pVar).getShortcutsTransferModel(), null, 4, null);
        } else if (pVar instanceof kn3.l.p.GoToServiceOrDocument) {
            lVar.b(((kn3.l.p.GoToServiceOrDocument) pVar).getGlobalEvent());
        } else {
            if (!t.c(pVar, kn3.l.p.e.f111563a)) {
                throw new p();
            }
            lVar.b(m83.a.C3059a.f124582a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1327446916, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:160)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        gn3.k kVar = (gn3.k) d.c(q0.c(gn3.k.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<gn3.f> bVarY1 = kVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: en3.d
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.F(sVar, (gn3.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        gn3.d.d(kVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(s sVar, gn3.f fVar) {
        if (!t.c(fVar, gn3.f.a.f75056a)) {
            throw new p();
        }
        s.i(sVar, y.f.f52191a, null, null, 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(383831451, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:174)");
        }
        y.c cVar = y.c.f52185a;
        f00.r.D(wVar, cVar, sVar.e(cVar), m.d(961918172, true, new q() { // from class: en3.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.H(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(961918172, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:178)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: en3.k
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.I(sVar, (hb4.b.a) obj);
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
    public static final i0 I(s sVar, hb4.b.a aVar) {
        if (!t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2095109818, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:190)");
        }
        y.a aVar = y.a.f52181a;
        f00.r.D(wVar, aVar, sVar.e(aVar), m.d(1963674513, true, new q() { // from class: en3.g
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.K(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1963674513, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:194)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: en3.m
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.L(sVar, (cb4.f.a) obj);
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
    public static final i0 L(s sVar, cb4.f.a aVar) {
        if (!t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(final s sVar, final wm3.a aVar, final a aVar2, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-488579111, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:203)");
        }
        y.b bVar = y.b.f52183a;
        final VehiclesDownloadLoaderSetupData vehiclesDownloadLoaderSetupData = (VehiclesDownloadLoaderSetupData) sVar.e(bVar);
        if (vehiclesDownloadLoaderSetupData == null) {
            vehiclesDownloadLoaderSetupData = new VehiclesDownloadLoaderSetupData(null, 1, null);
        }
        boolean zW = rVar.W(vehiclesDownloadLoaderSetupData);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: en3.e
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.N(vehiclesDownloadLoaderSetupData, (fn3.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        int i17 = i16 & 14;
        final fn3.b bVar2 = (fn3.b) d.c(q0.c(fn3.b.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        f00.r.D(wVar, bVar, new gv3.b.DocumentDownloadSetupData(tn3.f.f191166a.a(), null, 2, null), m.d(-1628736661, true, new q() { // from class: en3.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.O(bVar2, sVar, aVar, aVar2, (gv3.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, i17 | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fn3.b N(VehiclesDownloadLoaderSetupData vehiclesDownloadLoaderSetupData, fn3.b.a aVar) {
        return (fn3.b) aVar.a(vehiclesDownloadLoaderSetupData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final fn3.b bVar, final s sVar, final wm3.a aVar, final a aVar2, gv3.b bVar2, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1628736661, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:221)");
        }
        boolean zG = rVar.G(bVar) | rVar.G(sVar) | rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new a() { // from class: en3.n
                @Override // er.a
                public final Object a() {
                    return Function0.P(bVar, sVar, aVar);
                }
            };
            rVar.v(objE);
        }
        final a aVar3 = (a) objE;
        xw.b<gv3.b.a> bVarY1 = bVar2.Y1();
        boolean zW = rVar.W(aVar3) | rVar.W(aVar2) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: en3.o
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Q(aVar3, aVar2, sVar, (gv3.b.a) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(fn3.b bVar, s sVar, wm3.a aVar) {
        String registrationNumber = bVar.getVehiclesDownloadLoaderSetupData().getRegistrationNumber();
        if (registrationNumber != null) {
            sVar.h(y.f.f52191a, new b.RegistrationNo(registrationNumber, true), y.b.f52183a);
        } else {
            s.i(sVar, V(aVar), null, y.b.f52183a, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(a aVar, a aVar2, s sVar, gv3.b.a aVar3) {
        if (aVar3 instanceof gv3.b.a.Close) {
            boolean downloadFinishedAndCanGoToDocument = ((gv3.b.a.Close) aVar3).getDownloadFinishedAndCanGoToDocument();
            if (downloadFinishedAndCanGoToDocument) {
                aVar.a();
            } else {
                if (downloadFinishedAndCanGoToDocument) {
                    throw new p();
                }
                aVar2.a();
            }
        } else if (aVar3 instanceof gv3.b.a.LoadDocument) {
            aVar.a();
        } else if (aVar3 instanceof gv3.b.a.Error) {
            s.i(sVar, y.c.f52185a, ((gv3.b.a.Error) aVar3).getError(), null, 4, null);
        } else {
            if (!(aVar3 instanceof gv3.b.a.ShowDialog)) {
                throw new p();
            }
            s.i(sVar, y.a.f52181a, ((gv3.b.a.ShowDialog) aVar3).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1222699256, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:270)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: en3.b
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.S(sVar, (in3.l.a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        in3.l lVar = (in3.l) d.c(q0.c(in3.l.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        xw.b<in3.b> bVarY1 = lVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: en3.c
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.T(sVar, (in3.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        i.g(lVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final in3.l S(s sVar, in3.l.a aVar) {
        e eVar = (e) sVar.e(y.e.f52189a);
        if (eVar == null) {
            eVar = new e(pq.v.n());
        }
        return aVar.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(s sVar, in3.b bVar) {
        if (!t.c(bVar, in3.b.a.f93564a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(a aVar, l lVar, wm3.a aVar2, int i15, r rVar, int i16) {
        x(aVar, lVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final y V(wm3.a aVar) {
        if (aVar instanceof wm3.a.VehicleDetails) {
            return y.f.f52191a;
        }
        if (t.c(aVar, wm3.a.b.f214154a)) {
            return y.g.f52193a;
        }
        throw new p();
    }

    public static final void x(final a<i0> aVar, final l<? super gx.b, i0> lVar, final wm3.a aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1389735629);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1389735629, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent (NavContent.kt:44)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            y yVarV = V(aVar2);
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32) | rVarH.G(aVar2);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: en3.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.y(aVar, sVarJ, lVar, aVar2, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, yVarV, (l) objE, rVarH, s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: en3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.U(aVar, lVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 y(final a aVar, final s sVar, final l lVar, final wm3.a aVar2, d1 d1Var) {
        f00.r.u(d1Var, y.g.f52193a, null, m.b(-73453452, true, new er.r() { // from class: en3.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.z(aVar, sVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y.f.f52191a, null, m.b(1256242013, true, new er.r() { // from class: en3.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.B(sVar, aVar2, aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y.d.f52187a, null, m.b(-1327446916, true, new er.r() { // from class: en3.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.E(sVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y.c.f52185a, null, m.b(383831451, true, new er.r() { // from class: en3.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.G(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, y.a.f52181a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(2095109818, true, new er.r() { // from class: en3.t
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.J(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, y.b.f52183a, null, m.b(-488579111, true, new er.r() { // from class: en3.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.M(sVar, aVar2, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y.e.f52189a, null, m.b(1222699256, true, new er.r() { // from class: en3.v
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.R(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final a aVar, final s sVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-73453452, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:51)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        x xVar = (x) d.c(q0.c(x.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<n.f> bVarY1 = xVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: en3.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.A(aVar, sVar, lVar, (n.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        pn3.m.p(xVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
