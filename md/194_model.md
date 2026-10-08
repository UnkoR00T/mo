# Paczka 194 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `sd4/qd.java`

## sd4/qd.java

Powiązane klasy (możesz dosłać): `p146zj2/Function1.java`

```java
package sd4;

import android.os.Bundle;
import p071kotlin.Metadata;
import p146zj2.Function1;
import s93.ToCountryDetails;
import wn3.WithDeeplink;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lsd4/qd;", "Lj00/b;", "Lgx/c;", "<init>", "()V", "", "l2", "()Z", "k2", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lgx/b;", "event", "j5", "(Lgx/b;)Z", "Lgx/d;", "L0", "Lgx/d;", "j2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "M0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qd extends o9 implements gx.c {

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int N0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: sd4.qd$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/qd$a;", "", "<init>", "()V", "Ljj2/a;", "loginRedirectionPoint", "Lsd4/qd;", "a", "(Ljj2/a;)Lsd4/qd;", "", "TAG_LOGIN", "Ljava/lang/String;", "TAG_REDIRECTION_POINT", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final qd a(jj2.a loginRedirectionPoint) {
            qd qdVar = new qd();
            if (loginRedirectionPoint != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("TAG_REDIRECTION_POINT", loginRedirectionPoint);
                qdVar.F1(bundle);
            }
            return qdVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.a implements er.a<oq.i0> {
        b(Object obj) {
            super(0, obj, qd.class, "toApplicationLock", "toApplicationLock()Z", 8);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            ((qd) this.f66376a).k2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(final qd qdVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1465480980, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.LoginFeatureFragment.GetContent.<anonymous> (LoginFeatureFragment.kt:39)");
            }
            Bundle bundleV = qdVar.v();
            final jj2.a aVar = bundleV != null ? (jj2.a) bundleV.getParcelable("TAG_REDIRECTION_POINT") : null;
            Bundle bundleV2 = qdVar.v();
            if (bundleV2 != null) {
                bundleV2.remove("TAG_REDIRECTION_POINT");
            }
            boolean zG = rVar.G(qdVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sd4.nd
                    @Override // er.l
                    public final Object b(Object obj) {
                        return qd.e2(this.f180758a, (gx.b) obj);
                    }
                };
                rVar.v(objE);
            }
            er.l lVar = (er.l) objE;
            boolean zG2 = rVar.G(qdVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: sd4.od
                    @Override // er.a
                    public final Object a() {
                        return qd.f2(this.f180775a);
                    }
                };
                rVar.v(objE2);
            }
            er.a aVar2 = (er.a) objE2;
            boolean zG3 = rVar.G(aVar) | rVar.G(qdVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: sd4.pd
                    @Override // er.l
                    public final Object b(Object obj) {
                        return qd.g2(aVar, qdVar, (f00.s) obj);
                    }
                };
                rVar.v(objE3);
            }
            er.l lVar2 = (er.l) objE3;
            boolean zG4 = rVar.G(qdVar);
            Object objE4 = rVar.E();
            if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new b(qdVar);
                rVar.v(objE4);
            }
            Function1.p(lVar, aVar2, lVar2, (er.a) objE4, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(qd qdVar, gx.b bVar) {
        qdVar.j2().c(bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(qd qdVar) {
        androidx.fragment.app.p pVarR = qdVar.r();
        if (pVarR != null) {
            pVarR.finishAndRemoveTask();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g2(jj2.a aVar, qd qdVar, f00.s sVar) {
        if (fr.t.c(aVar, jj2.a.b.f103434a) || aVar == null) {
            qdVar.l2();
        } else if (fr.t.c(aVar, jj2.a.e.f103437a)) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(new go2.a.ToNotification(go2.a.ToNotification.EnumC1705a.NOTIFICATION_HISTORY));
        } else if (aVar instanceof jj2.a.Verification) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(new WithDeeplink(((jj2.a.Verification) aVar).getQrCode()));
        } else if (aVar instanceof jj2.a.DefaultWithLocalNotification) {
            qdVar.j2().c(new tg1.a.ToDashboardWithNotificationNavigation(true, ((jj2.a.DefaultWithLocalNotification) aVar).getLocalNotificationItem()));
        } else if (aVar instanceof jj2.a.AuthNotification) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(new eo2.b.ToConfirmation(((jj2.a.AuthNotification) aVar).getData()));
        } else if (aVar instanceof jj2.a.DefaultNotificationDetails) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(new r74.b.ToDefaultNotificationDetails(((jj2.a.DefaultNotificationDetails) aVar).getData()));
        } else if (aVar instanceof jj2.a.ToInstantPaymentsDetailsNotification) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(new v32.b.ToInstantPaymentsDetails(((jj2.a.ToInstantPaymentsDetailsNotification) aVar).getData(), w32.a.NOTIFICATION));
        } else if (aVar instanceof jj2.a.ToQualifiedSignatureIdentityConfirmation) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(new wy2.c.ToIdentityConfirmation(new wy2.c.ToIdentityConfirmation.InterfaceC5735a.Deeplink(((jj2.a.ToQualifiedSignatureIdentityConfirmation) aVar).getToken())));
        } else if (fr.t.c(aVar, jj2.a.m.f103447a)) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(nd3.a.f134345a);
        } else if (fr.t.c(aVar, jj2.a.g.f103441a)) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(si1.b.a.f181938a);
        } else if (fr.t.c(aVar, jj2.a.i.f103443a)) {
            qdVar.j2().c(yf2.a.C6082a.f226771a);
        } else if (fr.t.c(aVar, jj2.a.j.f103444a)) {
            qdVar.j2().c(il2.a.C2200a.f93279a);
        } else if (aVar instanceof jj2.a.ToCountryDetailsTravelAbroad) {
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            jj2.a.ToCountryDetailsTravelAbroad toCountryDetailsTravelAbroad = (jj2.a.ToCountryDetailsTravelAbroad) aVar;
            qdVar.j2().c(new ToCountryDetails(toCountryDetailsTravelAbroad.getCountryIso(), toCountryDetailsTravelAbroad.getMessageId(), toCountryDetailsTravelAbroad.getMessageDisplayed()));
        } else {
            if (!fr.t.c(aVar, jj2.a.k.f103445a)) {
                throw new oq.p();
            }
            qdVar.j2().c(new tg1.a.ToDashboard(true));
            qdVar.j2().c(ss2.a.C4742a.f183980a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h2(qd qdVar, int i15, p076m2.r rVar, int i16) {
        qdVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k2() {
        return j2().c(l74.a.b.f116926a);
    }

    private final boolean l2() {
        return j2().c(new tg1.a.ToDashboard(true));
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-602363200);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-602363200, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.LoginFeatureFragment.GetContent (LoginFeatureFragment.kt:37)");
            }
            mc4.d.d(false, y2.m.d(1465480980, true, new er.p() { // from class: sd4.ld
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return qd.d2(this.f180725a, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sd4.md
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return qd.h2(this.f180741a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final gx.d j2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // gx.c
    public boolean j5(gx.b event) {
        if (event instanceof tj2.b.ToLogin) {
            return o0();
        }
        return false;
    }
}

```
