package p037e73;

import a73.c;
import a73.x;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.l;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q;
import fr.q0;
import hb4.b;
import i53.k;
import i53.o;
import i70.e;
import iy.b0;
import mu.g;
import n63.Email;
import n63.Phone;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.g1;
import p136y9.w;
import p7.CreationExtras;
import q53.i;
import s53.ConfirmPasswordNavResultData;
import vw.NavigationDialogModel;
import w53.BiometricLoginNavResultData;
import w63.a;
import w63.m;
import y63.Add;
import y63.Confirm;
import y63.Edit;
import y63.SetupData;
import zx.d;

/* JADX INFO: renamed from: e73.u2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u0017\u001a\u00020\u0002*\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkotlin/Function1;", "Ly9/g1;", "Loq/i0;", "navGraphReady", "Lf00/a;", "startDestination", "Lkotlin/Function0;", "navResult", "Lgx/b;", "navigateToGlobalDestination", "Lg73/f;", "settingsSetPasswordDataMapper", "Lg73/d;", "settingsNavigationDialogMapper", "Li70/e;", "globalSnackBarManager", "Lmx/c;", "labelProvider", "e0", "(Ler/l;Lf00/a;Ler/a;Ler/l;Lg73/f;Lg73/d;Li70/e;Lmx/c;Lm2/r;I)V", "Ly9/d1;", "Lf00/s;", "destinationNavigator", "h0", "(Ly9/d1;Ler/a;Lf00/s;Ler/l;Lg73/f;Lg73/d;Li70/e;Lmx/c;)V", "settings_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: e73.u2$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements l<BiometricLoginNavResultData, i0> {
        a(Object obj) {
            super(1, obj, o.class, "retrieveNavigationData", "retrieveNavigationData(Lpl/gov/coi/mobywatel/feature/settings/presentation/biometriclogin/model/BiometricLoginNavResultData;)V", 0);
        }

        public final void E(BiometricLoginNavResultData biometricLoginNavResultData) {
            ((o) this.f66391b).q9(biometricLoginNavResultData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(BiometricLoginNavResultData biometricLoginNavResultData) {
            E(biometricLoginNavResultData);
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: e73.u2$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends q implements l<ConfirmPasswordNavResultData, i0> {
        b(Object obj) {
            super(1, obj, q53.o.class, "setup", "setup(Lpl/gov/coi/mobywatel/feature/settings/presentation/biometriclogin/confirmpassword/model/ConfirmPasswordNavResultData;)V", 0);
        }

        public final void E(ConfirmPasswordNavResultData confirmPasswordNavResultData) {
            ((q53.o) this.f66391b).P5(confirmPasswordNavResultData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ConfirmPasswordNavResultData confirmPasswordNavResultData) {
            E(confirmPasswordNavResultData);
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: e73.u2$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"e73/u2$c", "Lvy3/a;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "route", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements vy3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String route = m0.f48199a.getRoute();

        c() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1310069330, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:683)");
        }
        f00.r.o(wVar, q0.c(m.class), sVar.g(g0.f48166a), y2.m.d(156595549, true, new er.q() { // from class: e73.k1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.B0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(156595549, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:688)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.b2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.C0(sVar, (a) obj);
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
    public static final i0 C0(s sVar, w63.a aVar) {
        if (aVar instanceof w63.a.C5533a) {
            a0 a0Var = a0.f48113a;
            sVar.j(a0Var, new SetupData(null, 1, null), a0Var);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D0(s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-84403537, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:703)");
        }
        s.i(sVar, n0.a.f48205a, new ConfirmPasswordNavResultData(s53.b.C4559b.f178175a), null, 4, null);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E0(final s sVar, final er.a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1141262256, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:712)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ph2.q qVar = (ph2.q) q7.d.c(q0.c(ph2.q.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<ph2.a.c> bVarY1 = qVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.u1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.F0(sVar, aVar, lVar, (ph2.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        ph2.h.i(qVar, rVar, ph2.q.f157727l);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F0(s sVar, er.a aVar, l lVar, ph2.a.c cVar) {
        if (cVar instanceof ph2.a.c.ShowDialog) {
            s.i(sVar, i0.f48175a, ((ph2.a.c.ShowDialog) cVar).getNavigationDialogModel(), null, 4, null);
        } else if (fr.t.c(cVar, ph2.a.c.C3907a.f157696a)) {
            aVar.a();
        } else if (fr.t.c(cVar, ph2.a.c.b.f157697a)) {
            lVar.b(e53.a.C1094a.f47618a);
        } else {
            if (!(cVar instanceof ph2.a.c.ShowError)) {
                throw new p();
            }
            s.i(sVar, e0.f48145a, ((ph2.a.c.ShowError) cVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1928039247, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:734)");
        }
        e0 e0Var = e0.f48145a;
        f00.r.D(wVar, e0Var, sVar.e(e0Var), y2.m.d(586297842, true, new er.q() { // from class: e73.p1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.H0(sVar, (b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H0(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(586297842, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:738)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.m2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.I0(sVar, (b.a) obj);
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
    public static final i0 I0(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J0(s sVar, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-702373454, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:747)");
        }
        l0 l0Var = l0.f48195a;
        f00.r.r(wVar, l0Var, sVar.g(l0Var), y2.m.d(-42743823, true, new er.q() { // from class: e73.t1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.K0(aVar, (b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K0(final er.a aVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-42743823, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:751)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.k2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.L0(aVar, (b.a) obj);
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
    public static final i0 L0(er.a aVar, hb4.b.a aVar2) {
        if (!fr.t.c(aVar2, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M0(final s sVar, final er.a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1335148971, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:223)");
        }
        mr.c cVarC = q0.c(y63.f0.class);
        SetupData setupData = (SetupData) sVar.g(a0.f48113a);
        if (setupData == null) {
            setupData = new SetupData(null, 1, null);
        }
        f00.r.o(wVar, cVarC, setupData, y2.m.d(-3012580, true, new er.q() { // from class: e73.y1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.N0(aVar, lVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.s(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N0(final er.a aVar, final l lVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-3012580, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:229)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.c2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.O0(aVar, lVar, sVar, (y63.a.k) obj);
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
    public static final i0 O0(er.a aVar, l lVar, s sVar, y63.a.k kVar) {
        if (fr.t.c(kVar, y63.a.k.C6022a.f224682a)) {
            aVar.a();
        } else if (fr.t.c(kVar, y63.a.k.b.f224683a)) {
            lVar.b(new tg1.a.ToDashboard(false, 1, null));
        } else if (fr.t.c(kVar, y63.a.k.d.f224685a)) {
            s.m(sVar, b0.f48121a, null, 2, null);
        } else if (kVar instanceof Add) {
            s.l(sVar, t.f48253a, new q63.SetupData(!((Add) kVar).getIsAnyContactRegistered(), null), null, 4, null);
        } else if (kVar instanceof Edit) {
            s.l(sVar, c0.f48129a, new s63.SetupData(((Edit) kVar).getEmail()), null, 4, null);
        } else if (kVar instanceof Confirm) {
            Confirm confirm = (Confirm) kVar;
            s.l(sVar, z.f48318a, new n63.SetupData(new p63.a.Email(confirm.getEmail(), confirm.getPreviousEmail()), confirm.getIsAnyContactRegistered()), null, 4, null);
        } else if (kVar instanceof y63.Add) {
            s.l(sVar, u.f48260a, new a73.SetupData(!((y63.Add) kVar).getIsAnyContactRegistered(), null, null), null, 4, null);
        } else if (kVar instanceof y63.Edit) {
            y63.Edit edit = (y63.Edit) kVar;
            s.l(sVar, d0.f48137a, new c73.SetupData(edit.getPrefix(), edit.getPhoneNumber()), null, 4, null);
        } else if (kVar instanceof y63.Confirm) {
            y63.Confirm confirm2 = (y63.Confirm) kVar;
            s.l(sVar, z.f48318a, new n63.SetupData(new p63.a.Phone(confirm2.getPrefix(), confirm2.getPhoneNumber(), confirm2.getPreviousPrefix(), confirm2.getPreviousPhoneNumber()), confirm2.getIsAnyContactRegistered()), null, 4, null);
        } else {
            if (!(kVar instanceof y63.a.k.Error)) {
                throw new p();
            }
            s.l(sVar, e0.f48145a, ((y63.a.k.Error) kVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1734152532, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:305)");
        }
        f00.r.n(wVar, q0.c(u63.l.class), y2.m.d(-1329256642, true, new er.q() { // from class: e73.z1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.Q0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.m(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1329256642, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:309)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.j2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.R0(sVar, (u63.b) obj);
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
    public static final i0 R0(s sVar, u63.b bVar) {
        if (fr.t.c(bVar, u63.b.a.f195872a)) {
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-508486739, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:320)");
        }
        f00.r.o(wVar, q0.c(q63.q.class), sVar.g(t.f48253a), y2.m.d(-1846648290, true, new er.q() { // from class: e73.i1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.T0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.n(), rVar, ((i15 >> 3) & 14) | 27648 | (b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1846648290, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:325)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.o2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.U0(sVar, (q63.a.c) obj);
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
    public static final i0 U0(s sVar, q63.a.c cVar) {
        if (fr.t.c(cVar, q63.a.c.C4109a.f165030a)) {
            sVar.c();
        } else if (cVar instanceof q63.a.c.Next) {
            s.l(sVar, x.f48296a, new g63.SetupData(false, i63.a.ADD, new i63.b.a(((q63.a.c.Next) cVar).getEmail())), null, 4, null);
        } else if (cVar instanceof q63.a.c.e) {
            s.i(sVar, i0.f48175a, ((q63.a.c.e) cVar).a(), null, 4, null);
        } else if (cVar instanceof q63.a.c.Error) {
            s.l(sVar, e0.f48145a, ((q63.a.c.Error) cVar).getErrorData(), null, 4, null);
        } else {
            if (!fr.t.c(cVar, q63.a.c.b.f165031a)) {
                throw new p();
            }
            s.m(sVar, k0.f48191a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(717179054, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:357)");
        }
        f00.r.o(wVar, q0.c(s63.o.class), sVar.g(c0.f48129a), y2.m.d(-620982497, true, new er.q() { // from class: e73.r1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.W0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.p(), rVar, ((i15 >> 3) & 14) | 27648 | (b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-620982497, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:362)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.l2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.X0(sVar, (s63.a.e) obj);
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
    public static final i0 X0(s sVar, s63.a.e eVar) {
        if (fr.t.c(eVar, s63.a.e.C4571a.f178337a)) {
            sVar.c();
        } else if (eVar instanceof s63.a.e.Next) {
            s.l(sVar, x.f48296a, new g63.SetupData(false, i63.a.EDIT, new i63.b.a(((s63.a.e.Next) eVar).getEmail())), null, 4, null);
        } else if (eVar instanceof s63.a.e.ShowNavigationDialog) {
            s.i(sVar, i0.f48175a, ((s63.a.e.ShowNavigationDialog) eVar).getNavigationDialogModel(), null, 4, null);
        } else if (fr.t.c(eVar, s63.a.e.C4572e.f178343a)) {
            a0 a0Var = a0.f48113a;
            sVar.j(a0Var, new SetupData(m63.b.C3032b.f123886b), a0Var);
        } else if (eVar instanceof s63.a.e.Error) {
            s.l(sVar, e0.f48145a, ((s63.a.e.Error) eVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1942844847, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:398)");
        }
        f00.r.o(wVar, q0.c(x.class), sVar.g(u.f48260a), y2.m.d(604683296, true, new er.q() { // from class: e73.l1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.Z0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.t(), rVar, ((i15 >> 3) & 14) | 27648 | (b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(604683296, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:403)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.f2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.a1(sVar, (c) obj);
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
    public static final i0 a1(s sVar, a73.c cVar) {
        if (fr.t.c(cVar, a73.c.a.f4070a)) {
            sVar.c();
        } else if (cVar instanceof a73.c.Next) {
            a73.c.Next next = (a73.c.Next) cVar;
            s.l(sVar, x.f48296a, new g63.SetupData(false, i63.a.ADD, new i63.b.Phone(next.getPrefix(), next.getPhoneNumber())), null, 4, null);
        } else if (cVar instanceof a73.c.e) {
            s.i(sVar, i0.f48175a, ((a73.c.e) cVar).a(), null, 4, null);
        } else if (cVar instanceof a73.c.Error) {
            s.l(sVar, e0.f48145a, ((a73.c.Error) cVar).getErrorData(), null, 4, null);
        } else if (fr.t.c(cVar, a73.c.d.f4075a)) {
            s.m(sVar, k0.f48191a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b1(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1126456656, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:438)");
        }
        f00.r.o(wVar, q0.c(c73.p.class), sVar.g(d0.f48137a), y2.m.d(1830349089, true, new er.q() { // from class: e73.j1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.c1(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.l(), rVar, ((i15 >> 3) & 14) | 27648 | (b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c1(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1830349089, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:443)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.n2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.d1(sVar, (c73.a.d) obj);
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
    public static final i0 d1(s sVar, c73.a.d dVar) {
        if (fr.t.c(dVar, c73.a.d.C0641a.f23949a)) {
            sVar.c();
        } else if (dVar instanceof c73.a.d.Next) {
            c73.a.d.Next next = (c73.a.d.Next) dVar;
            s.l(sVar, x.f48296a, new g63.SetupData(false, i63.a.EDIT, new i63.b.Phone(next.getPrefix(), next.getPhoneNumber())), null, 4, null);
        } else if (dVar instanceof c73.a.d.ShowNavigationDialog) {
            s.i(sVar, i0.f48175a, ((c73.a.d.ShowNavigationDialog) dVar).getNavigationDialogModel(), null, 4, null);
        } else if (fr.t.c(dVar, c73.a.d.c.f23951a)) {
            a0 a0Var = a0.f48113a;
            sVar.j(a0Var, new SetupData(m63.b.d.f123888b), a0Var);
        } else if (dVar instanceof c73.a.d.Error) {
            s.l(sVar, e0.f48145a, ((c73.a.d.Error) dVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    public static final void e0(final l<? super g1, i0> lVar, final f00.a aVar, final er.a<i0> aVar2, final l<? super gx.b, i0> lVar2, final g73.f fVar, final g73.d dVar, final e eVar, final mx.c cVar, r rVar, final int i15) {
        int i16;
        l<? super gx.b, i0> lVar3;
        final s sVar;
        r rVarH = rVar.h(-1555824701);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            lVar3 = lVar2;
            i16 |= rVarH.G(lVar3) ? 2048 : 1024;
        } else {
            lVar3 = lVar2;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(fVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= (i15 & PKIFailureInfo.transactionIdInUse) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(eVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.G(cVar) ? 8388608 : 4194304;
        }
        int i17 = i16;
        boolean z15 = false;
        if (rVarH.r((4793491 & i17) != 4793490, i17 & 1)) {
            if (t.k()) {
                t.o(-1555824701, i17, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.SettingsNavContent (SettingsNavContent.kt:94)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            boolean zG = ((i17 & 896) == 256) | rVarH.G(sVarJ) | ((i17 & 7168) == 2048) | rVarH.G(fVar);
            if ((458752 & i17) == 131072 || ((i17 & PKIFailureInfo.transactionIdInUse) != 0 && rVarH.G(dVar))) {
                z15 = true;
            }
            boolean zG2 = zG | z15 | rVarH.G(eVar) | rVarH.G(cVar);
            Object objE = rVarH.E();
            if (zG2 || objE == r.INSTANCE.a()) {
                sVar = sVarJ;
                final l<? super gx.b, i0> lVar4 = lVar3;
                l lVar5 = new l() { // from class: e73.x1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.f0(aVar2, sVar, lVar4, fVar, dVar, eVar, cVar, (d1) obj);
                    }
                };
                rVarH.v(lVar5);
                objE = lVar5;
            } else {
                sVar = sVarJ;
            }
            d0.j(sVar, aVar, (l) objE, rVarH, s.f54562e | (i17 & 112));
            lVar.b(sVar.getNavController());
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e73.i2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.g0(lVar, aVar, aVar2, lVar2, fVar, dVar, eVar, cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e1(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(99209137, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:479)");
        }
        f00.r.n(wVar, q0.c(j63.m.class), y2.m.d(504105027, true, new er.q() { // from class: e73.s1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.f1(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.r(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(er.a aVar, s sVar, l lVar, g73.f fVar, g73.d dVar, e eVar, mx.c cVar, d1 d1Var) {
        h0(d1Var, aVar, sVar, lVar, fVar, dVar, eVar, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f1(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(504105027, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:483)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.d2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.g1(sVar, (j63.d) obj);
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
    public static final i0 g0(l lVar, f00.a aVar, er.a aVar2, l lVar2, g73.f fVar, g73.d dVar, e eVar, mx.c cVar, int i15, r rVar, int i16) {
        e0(lVar, aVar, aVar2, lVar2, fVar, dVar, eVar, cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g1(s sVar, j63.d dVar) {
        if (!fr.t.c(dVar, j63.d.a.f99823a)) {
            throw new p();
        }
        a0 a0Var = a0.f48113a;
        sVar.j(a0Var, new SetupData(null, 1, null), a0Var);
        return i0.f148189a;
    }

    public static final void h0(d1 d1Var, final er.a<i0> aVar, final s sVar, final l<? super gx.b, i0> lVar, final g73.f fVar, final g73.d dVar, final e eVar, final mx.c cVar) {
        f00.r.u(d1Var, j0.f48187a, null, y2.m.b(544581299, true, new er.r() { // from class: e73.p2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.i0(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m0.f48199a, null, y2.m.b(109483178, true, new er.r() { // from class: e73.w0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.k0(fVar, sVar, aVar, dVar, eVar, cVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a0.f48113a, null, y2.m.b(1335148971, true, new er.r() { // from class: e73.x0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.M0(sVar, aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b0.f48121a, null, y2.m.b(-1734152532, true, new er.r() { // from class: e73.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.P0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t.f48253a, null, y2.m.b(-508486739, true, new er.r() { // from class: e73.z0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.S0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c0.f48129a, null, y2.m.b(717179054, true, new er.r() { // from class: e73.a1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.V0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u.f48260a, null, y2.m.b(1942844847, true, new er.r() { // from class: e73.c1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.Y0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d0.f48137a, null, y2.m.b(-1126456656, true, new er.r() { // from class: e73.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.b1(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k0.f48191a, null, y2.m.b(99209137, true, new er.r() { // from class: e73.e1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.e1(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.f48318a, null, y2.m.b(1324874930, true, new er.r() { // from class: e73.f1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.h1(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x.f48296a, null, y2.m.b(-1917765206, true, new er.r() { // from class: e73.q2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.r0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, v.f48267a, null, y2.m.b(-692099413, true, new er.r() { // from class: e73.r2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.u0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        g3.l(d1Var, sVar, aVar, lVar);
        h.h(d1Var, sVar);
        f00.r.u(d1Var, y.f48310a, null, y2.m.b(533566380, true, new er.r() { // from class: e73.s2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.w0(sVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h0.f48171a, null, y2.m.b(1759232173, true, new er.r() { // from class: e73.t2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.y0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g0.f48166a, null, y2.m.b(-1310069330, true, new er.r() { // from class: e73.r0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.A0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o0.f48217a, null, y2.m.b(-84403537, true, new er.r() { // from class: e73.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.D0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f0.f48157a, null, y2.m.b(1141262256, true, new er.r() { // from class: e73.t0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.E0(sVar, aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e0.f48145a, null, y2.m.b(-1928039247, true, new er.r() { // from class: e73.u0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.G0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l0.f48195a, null, y2.m.b(-702373454, true, new er.r() { // from class: e73.v0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.J0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        tw.c.c(d1Var, i0.f48175a, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h1(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1324874930, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:497)");
        }
        f00.r.o(wVar, q0.c(n63.q.class), sVar.g(z.f48318a), y2.m.d(-13286621, true, new er.q() { // from class: e73.h1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.i1(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(final er.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(544581299, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:126)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        f73.p pVar = (f73.p) q7.d.c(q0.c(f73.p.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<f73.a.d> bVarY1 = pVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.q1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.j0(aVar, sVar, (f73.a.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        f73.l.m(pVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i1(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-13286621, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:502)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.h2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.j1(sVar, (n63.c) obj);
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
    public static final i0 j0(er.a aVar, s sVar, f73.a.d dVar) {
        if (dVar instanceof f73.a.d.C1350a) {
            aVar.a();
        } else if (dVar instanceof f73.a.d.C1351d) {
            s.m(sVar, m0.f48199a, null, 2, null);
        } else if (dVar instanceof f73.a.d.Error) {
            s.i(sVar, e0.f48145a, ((f73.a.d.Error) dVar).getErrorData(), null, 4, null);
        } else {
            if (!(dVar instanceof f73.a.d.ShowExitDialog)) {
                throw new p();
            }
            s.i(sVar, i0.f48175a, ((f73.a.d.ShowExitDialog) dVar).getNavigationDialogModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j1(s sVar, n63.c cVar) {
        if (fr.t.c(cVar, n63.c.a.f133295a)) {
            sVar.c();
        } else if (cVar instanceof Email) {
            Email email = (Email) cVar;
            s.l(sVar, t.f48253a, new q63.SetupData(!email.getIsAnyContactRegistered(), email.getPreviousEmail()), null, 4, null);
        } else if (cVar instanceof Phone) {
            Phone phone = (Phone) cVar;
            s.l(sVar, u.f48260a, new a73.SetupData(!phone.getIsAnyContactRegistered(), phone.getPreviousPrefix(), phone.getPreviousPhoneNumber()), null, 4, null);
        } else {
            if (!(cVar instanceof n63.c.CodeConfirmation)) {
                throw new p();
            }
            s.l(sVar, x.f48296a, ((n63.c.CodeConfirmation) cVar).getPayload(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(g73.f fVar, final s sVar, final er.a aVar, final g73.d dVar, final e eVar, final mx.c cVar, final l lVar, f fVar2, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(109483178, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:152)");
        }
        c cVar2 = new c();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.v1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.l0(sVar, (NavigationDialogModel) obj);
                }
            };
            rVar.v(objE);
        }
        f00.r.r(wVar, cVar2, fVar.b(new g73.f.Params((l) objE, aVar)), y2.m.d(905080406, true, new er.q() { // from class: e73.w1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.m0(sVar, dVar, aVar, eVar, cVar, lVar, (vy3.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3072);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(s sVar, NavigationDialogModel navigationDialogModel) {
        s.i(sVar, i0.f48175a, navigationDialogModel, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(final s sVar, final g73.d dVar, final er.a aVar, final e eVar, final mx.c cVar, final l lVar, vy3.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(905080406, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:168)");
        }
        xw.b<vy3.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(dVar) | rVar.W(aVar) | rVar.G(eVar) | rVar.G(cVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            l lVar2 = new l() { // from class: e73.e2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.n0(sVar, dVar, eVar, cVar, lVar, aVar, (vy3.b.a) obj);
                }
            };
            rVar.v(lVar2);
            objE = lVar2;
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, g73.d dVar, final e eVar, final mx.c cVar, final l lVar, final er.a aVar, vy3.b.a aVar2) {
        if (fr.t.c(aVar2, vy3.b.a.C5487a.f208709a)) {
            sVar.c();
        } else if (fr.t.c(aVar2, vy3.b.a.C5488b.f208710a)) {
            s.i(sVar, i0.f48175a, dVar.b(new g73.d.Params(new g73.a.TerminationProcessDialog(new er.a() { // from class: e73.q0
                @Override // er.a
                public final Object a() {
                    return Function1.o0(aVar);
                }
            }, null, 2, null))), null, 4, null);
        } else {
            if (!(aVar2 instanceof vy3.b.a.PasswordSet)) {
                throw new p();
            }
            if (((vy3.b.a.PasswordSet) aVar2).getWasBiometricReset()) {
                s.i(sVar, i0.f48175a, dVar.b(new g73.d.Params(new g73.a.ResetBiometricDialog(new er.a() { // from class: e73.b1
                    @Override // er.a
                    public final Object a() {
                        return Function1.p0(sVar);
                    }
                }, new er.a() { // from class: e73.m1
                    @Override // er.a
                    public final Object a() {
                        return Function1.q0(eVar, cVar, lVar);
                    }
                }))), null, 4, null);
            } else {
                eVar.y(new p50.a.Default(cVar.c(c53.a.f23710m1), false, null, 6, null));
                lVar.b(new tg1.a.ToDashboard(false, 1, null));
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o0(er.a aVar) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(s sVar) {
        s.i(sVar, n0.a.f48205a, new ConfirmPasswordNavResultData(s53.b.C4559b.f178175a), null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(e eVar, mx.c cVar, l lVar) {
        eVar.y(new p50.a.Default(cVar.c(c53.a.f23723r), false, null, 6, null));
        lVar.b(new tg1.a.ToDashboard(false, 1, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1917765206, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:533)");
        }
        f00.r.o(wVar, q0.c(g63.q.class), sVar.g(x.f48296a), y2.m.d(-451100327, true, new er.q() { // from class: e73.a2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.s0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s.f48238a.o(), rVar, ((i15 >> 3) & 14) | 27648 | (b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-451100327, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous>.<anonymous> (SettingsNavContent.kt:538)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.g2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.t0(sVar, (g63.a.e) obj);
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
    public static final i0 t0(s sVar, g63.a.e eVar) {
        if (fr.t.c(eVar, g63.a.e.C1608a.f70927a)) {
            a0 a0Var = a0.f48113a;
            sVar.j(a0Var, new SetupData(null, 1, null), a0Var);
        } else if (eVar instanceof g63.a.e.CloseWithSnackBarSuccessMessage) {
            a0 a0Var2 = a0.f48113a;
            sVar.j(a0Var2, new SetupData(((g63.a.e.CloseWithSnackBarSuccessMessage) eVar).getSnackBarSuccessMessage()), a0Var2);
        } else if (eVar instanceof g63.a.e.ShowNavigationDialog) {
            s.i(sVar, i0.f48175a, ((g63.a.e.ShowNavigationDialog) eVar).getNavigationDialogModel(), null, 4, null);
        } else if (eVar instanceof g63.a.e.CodeLockScreen) {
            s.l(sVar, g0.f48166a, ((g63.a.e.CodeLockScreen) eVar).getData(), null, 4, null);
        } else {
            if (!(eVar instanceof g63.a.e.Error)) {
                throw new p();
            }
            s.l(sVar, e0.f48145a, ((g63.a.e.Error) eVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u0(final s sVar, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-692099413, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:577)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        o oVar = (o) q7.d.c(q0.c(o.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        v vVar = v.f48267a;
        boolean zG = rVar.G(oVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new a(oVar);
            rVar.v(objE);
        }
        sVar.f(vVar, (l) ((mr.g) objE));
        xw.b<i53.a.d> bVarY1 = oVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: e73.g1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.v0(aVar, sVar, (i53.a.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        k.p(oVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(er.a aVar, s sVar, i53.a.d dVar) {
        if (fr.t.c(dVar, i53.a.d.C2118a.f89579a)) {
            aVar.a();
        } else if (dVar instanceof i53.a.d.Error) {
            s.l(sVar, l0.f48195a, ((i53.a.d.Error) dVar).getErrorData(), null, 4, null);
        } else if (fr.t.c(dVar, i53.a.d.b.f89580a)) {
            s.i(sVar, w.c.f48277a, null, null, 6, null);
        } else if (fr.t.c(dVar, i53.a.d.C2119d.f89582a)) {
            s.i(sVar, h0.f48171a, null, null, 6, null);
        } else {
            if (!fr.t.c(dVar, i53.a.d.e.f89583a)) {
                throw new p();
            }
            s.i(sVar, y.f48310a, new ConfirmPasswordNavResultData(s53.b.a.f178174a), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w0(final s sVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(533566380, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:620)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        q53.o oVar = (q53.o) q7.d.c(q0.c(q53.o.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        y yVar = y.f48310a;
        boolean zG = rVar.G(oVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new b(oVar);
            rVar.v(objE);
        }
        sVar.f(yVar, (l) ((mr.g) objE));
        xw.b<q53.a.c> bVarY1 = oVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: e73.o1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.x0(lVar, sVar, (q53.a.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        i.l(oVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x0(l lVar, s sVar, q53.a.c cVar) {
        if (!(cVar instanceof q53.a.c.SetNewPinScreen)) {
            if (cVar instanceof q53.a.c.b) {
                lVar.b(new tg1.a.ToDashboard(false, 1, null));
            } else if (cVar instanceof q53.a.c.Error) {
                s.l(sVar, l0.f48195a, ((q53.a.c.Error) cVar).getErrorData(), null, 4, null);
            } else if (fr.t.c(cVar, q53.a.c.e.f164885a)) {
                g73.c.a(sVar, v.f48267a, false);
            } else {
                if (!(cVar instanceof q53.a.c.ShowNavigationDialog)) {
                    throw new p();
                }
                s.i(sVar, i0.f48175a, ((q53.a.c.ShowNavigationDialog) cVar).getNavigationDialogModel(), null, 4, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1759232173, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addSettingsDestinations.<anonymous> (SettingsNavContent.kt:655)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        t53.m mVar = (t53.m) q7.d.c(q0.c(t53.m.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<t53.a.g> bVarY1 = mVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e73.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.z0(sVar, (t53.a.g) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        t53.f.e(mVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z0(s sVar, t53.a.g gVar) {
        if (gVar instanceof t53.a.g.CloseWithResult) {
            s.i(sVar, v.f48267a, ((t53.a.g.CloseWithResult) gVar).getResultData(), null, 4, null);
        } else if (gVar instanceof t53.a.g.OnError) {
            s.l(sVar, l0.f48195a, ((t53.a.g.OnError) gVar).getResultData(), null, 4, null);
        } else if (fr.t.c(gVar, t53.a.g.C4886a.f187829a)) {
            g73.c.b(sVar, h0.f48171a, false, 2, null);
        } else {
            if (!(gVar instanceof t53.a.g.ShowNavigationDialog)) {
                throw new p();
            }
            s.i(sVar, i0.f48175a, ((t53.a.g.ShowNavigationDialog) gVar).getNavigationDialogModel(), null, 4, null);
        }
        return i0.f148189a;
    }
}
