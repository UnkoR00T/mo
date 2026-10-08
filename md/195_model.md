# Paczka 195 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `sd4/rf.java (część 1/2)`

## sd4/rf.java (część 1/2)

```java
package sd4;

import android.net.Uri;
import android.os.Bundle;
import j84.NotificationsHistoryRecord;
import j84.NotificationsHistoryRecordParameters;
import p071kotlin.Metadata;
import r74.DefaultNotificationDetailsData;
import s93.ToCountryDetails;
import v32.InstantPaymentNotificationDetailsData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R+\u0010,\u001a\u00020$2\u0006\u0010%\u001a\u00020$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lsd4/rf;", "Lj00/b;", "<init>", "()V", "Lj84/c;", "record", "Loq/i0;", "m2", "(Lj84/c;)V", "l2", "Landroid/os/Bundle;", "savedInstanceState", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "k2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lrh2/a;", "M0", "Lrh2/a;", "j2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Landroid/net/Uri;", "N0", "Landroid/net/Uri;", "deeplink", "Lgo2/a$a$a;", "<set-?>", "O0", "Lir/e;", "i2", "()Lgo2/a$a$a;", "n2", "(Lgo2/a$a$a;)V", "entryPoint", "P0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rf extends w9 {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEvent
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ rf b(Companion companion, Uri uri, go2.a.ToNotification.EnumC1705a enumC1705a, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                uri = null;
            }
            return companion.a(uri, enumC1705a);
        }

        public final rf a(Uri deeplink, go2.a.ToNotification.EnumC1705a destination) {
            rf rfVar = new rf();
            Bundle bundle = new Bundle();
            if (deeplink != null) {
                bundle.putParcelable("deepLinkUri", deeplink);
            }
            bundle.putSerializable("KEY_DESTINATION", destination);
            rfVar.F1(bundle);
            return rfVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f180837b;

        static {
            int[] iArr = new int[go2.a.ToNotification.EnumC1705a.values().length];
            try {
                iArr[go2.a.ToNotification.EnumC1705a.NOTIFICATION_HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[go2.a.ToNotification.EnumC1705a.NOTIFICATION_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f180836a = iArr;
            int[] iArr2 = new int[NotificationsHistoryRecord.a.values().length];
            try {
                iArr2[NotificationsHistoryRecord.a.TRUSTED_PROFILE_AUTHORIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NotificationsHistoryRecord.a.EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f180837b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(final rf rfVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-547624472, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.NotificationFeatureFragment.GetContent.<anonymous> (NotificationFeatureFragment.kt:50)");
            }
            int i16 = b.f180836a[rfVar.i2().ordinal()];
            if (i16 == 1) {
                rVar.X(2013863718);
                w74.a aVar = w74.a.MOBYWATEL;
                boolean zG = rVar.G(rfVar);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: sd4.of
                        @Override // er.a
                        public final Object a() {
                            return rf.e2(this.f180777a);
                        }
                    };
                    rVar.v(objE);
                }
                er.a aVar2 = (er.a) objE;
                boolean zG2 = rVar.G(rfVar);
                Object objE2 = rVar.E();
                if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.l() { // from class: sd4.pf
                        @Override // er.l
                        public final Object b(Object obj) {
                            return rf.f2(this.f180800a, (l84.d.e) obj);
                        }
                    };
                    rVar.v(objE2);
                }
                l84.r.i(aVar, aVar2, (er.l) objE2, rVar, 6);
                rVar.R();
            } else {
                if (i16 != 2) {
                    rVar.X(2013861966);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(2013914906);
                w74.a aVar3 = w74.a.MOBYWATEL;
                boolean zG3 = rVar.G(rfVar);
                Object objE3 = rVar.E();
                if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                    objE3 = new er.a() { // from class: sd4.qf
                        @Override // er.a
                        public final Object a() {
                            return rf.g2(this.f180822a);
                        }
                    };
                    rVar.v(objE3);
                }
                e84.n.i(aVar3, (er.a) objE3, rVar, 6);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(rf rfVar) {
        rfVar.j2().c("NotificationListFragment");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(rf rfVar, l84.d.e eVar) {
        if (eVar instanceof l84.d.e.GoToAuthConfirmation) {
            rfVar.l2(((l84.d.e.GoToAuthConfirmation) eVar).getRecord());
        } else if (eVar instanceof l84.d.e.GoToCountryDetailsTravelAbroad) {
            l84.d.e.GoToCountryDetailsTravelAbroad goToCountryDetailsTravelAbroad = (l84.d.e.GoToCountryDetailsTravelAbroad) eVar;
            rfVar.k2().c(new ToCountryDetails(goToCountryDetailsTravelAbroad.getCountryIso(), goToCountryDetailsTravelAbroad.getRecord().getId(), goToCountryDetailsTravelAbroad.getRecord().getDisplayed()));
        } else if (eVar instanceof l84.d.e.GoToInstantPaymentDetails) {
            gx.d dVarK2 = rfVar.k2();
            l84.d.e.GoToInstantPaymentDetails goToInstantPaymentDetails = (l84.d.e.GoToInstantPaymentDetails) eVar;
            NotificationsHistoryRecordParameters.PaymentParams payment = goToInstantPaymentDetails.getRecord().getParameters().getPayment();
            dVarK2.c(new v32.b.ToInstantPaymentsDetails(new InstantPaymentNotificationDetailsData(payment != null ? payment.getPaymentId() : null, goToInstantPaymentDetails.getRecord().getId(), goToInstantPaymentDetails.getRecord().getDisplayed()), w32.a.NOTIFICATIONS_LIST));
        } else if (eVar instanceof l84.d.e.GoToNotificationDetail) {
            rfVar.m2(((l84.d.e.GoToNotificationDetail) eVar).getRecord());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g2(rf rfVar) {
        rfVar.j2().c("NotificationListFragment");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h2(rf rfVar, int i15, p076m2.r rVar, int i16) {
        rfVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private final go2.a.ToNotification.EnumC1705a i2() {
        return (go2.a.ToNotification.EnumC1705a) this.entryPoint.a(this, Q0[0]);
    }

    private final void l2(NotificationsHistoryRecord record) {
        eo2.a trustedProfileConfirmationData;
        NotificationsHistoryRecordParameters.QualifiedSignatureAuthorizationParams qualifiedSignatureAuthorization;
        int i15 = b.f180837b[record.getType().ordinal()];
        eo2.a aVar = null;
        if (i15 == 1) {
            NotificationsHistoryRecordParameters.TrustedProfileAuthorizationParams trustedProfileAuthorization = record.getParameters().getTrustedProfileAuthorization();
            if (trustedProfileAuthorization != null) {
                trustedProfileConfirmationData = new eo2.a.TrustedProfileConfirmationData(record.getId(), record.getDisplayed(), record.getSendingDateTime(), record.getTitle(), record.getContent(), record.getPrivateContent(), trustedProfileAuthorization.getAuthorizationId(), trustedProfileAuthorization.getExpirationDateTime());
                aVar = trustedProfileConfirmationData;
            }
        } else if (i15 == 2 && (qualifiedSignatureAuthorization = record.getParameters().getQualifiedSignatureAuthorization()) != null) {
            trustedProfileConfirmationData = new eo2.a.QualifiedSignatureConfirmationData(record.getId(), record.getDisplayed(), record.getSendingDateTime(), record.getTitle(), record.getContent(), record.getPrivateContent(), qualifiedSignatureAuthorization.getAuthorizationId(), qualifiedSignatureAuthorization.getExpirationDateTime(), qualifiedSignatureAuthorization.getProcessId());
            aVar = trustedProfileConfirmationData;
        }
        if (aVar != null) {
            k2().c(new eo2.b.ToConfirmation(aVar));
        } else {
            m2(record);
        }
    }

    private final void m2(NotificationsHistoryRecord record) {
        k2().c(new r74.b.ToDefaultNotificationDetails(new DefaultNotificationDetailsData(record.getId(), record.getDisplayed(), record.getSendingDateTime(), record.getTitle(), record.getContent(), record.getPrivateContent())));
    }

    private final void n2(go2.a.ToNotification.EnumC1705a enumC1705a) {
        this.entryPoint.b(this, Q0[0], enumC1705a);
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1083096940);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1083096940, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.NotificationFeatureFragment.GetContent (NotificationFeatureFragment.kt:49)");
            }
            mc4.d.d(false, y2.m.d(-547624472, true, new er.p() { // from class: sd4.mf
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return rf.d2(this.f180745a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.nf
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return rf.h2(this.f180761a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

```
