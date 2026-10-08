package pl.gov.mc.fringers.mobywatel;

import android.content.Intent;
import java.io.Serializable;
import java.time.OffsetDateTime;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r74.DefaultNotificationDetailsData;
import s74.DecryptedMessage;
import s74.RemoteMessageParameters;
import s93.ToCountryDetails;
import v32.InstantPaymentNotificationDetailsData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lpl/gov/mc/fringers/mobywatel/b0;", "Lpl/gov/mc/fringers/mobywatel/a0;", "Ln90/a;", "isMJuniorAppActivatedUC", "La14/s;", "launchAppUseCase", "Lt74/b;", "updateNotDisplayedPushCountUC", "<init>", "(Ln90/a;La14/s;Lt74/b;)V", "Ls74/a;", "message", "Lgx/b;", "c", "(Ls74/a;)Lgx/b;", "b", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;Ltq/e;)Ljava/lang/Object;", "Ln90/a;", "La14/s;", "Lt74/b;", "Lgo2/a$a;", "d", "Lgo2/a$a;", "loggedInFallbackEvent", "Ltj2/b$a;", "e", "Ltj2/b$a;", "notLoggedInFallbackEvent", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n90.a isMJuniorAppActivatedUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.s launchAppUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t74.b updateNotDisplayedPushCountUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final go2.a.ToNotification loggedInFallbackEvent = new go2.a.ToNotification(go2.a.ToNotification.EnumC1705a.NOTIFICATION_HISTORY);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final tj2.b.ToLogin notLoggedInFallbackEvent = new tj2.b.ToLogin(tj2.b.ToLogin.AbstractC4973a.e.f190504b);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160684a;

        static {
            int[] iArr = new int[DecryptedMessage.EnumC4591a.values().length];
            try {
                iArr[DecryptedMessage.EnumC4591a.TRUSTED_PROFILE_AUTHORIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.NOT_MAPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.NEW_PAYMENT_IN_OFFICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.VEHICLE_COLLISION_REPORT_REMINDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.DEFENCE_TRAINING_NAVIGATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.LAND_REGISTER_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.NATIONAL_COURT_REGISTRY_SUBSCRIPTION_EXPIRY_REMINDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.NATIONAL_COURT_REGISTRY_SUBSCRIPTION_EXPIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DecryptedMessage.EnumC4591a.COUNTRY_TRAVEL_ADVISORY_UPDATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f160684a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f160687f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f160688g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f160689h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f160691k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f160689h = obj;
            this.f160691k |= PKIFailureInfo.systemUnavail;
            return b0.this.a(null, this);
        }
    }

    public b0(n90.a aVar, a14.s sVar, t74.b bVar) {
        this.isMJuniorAppActivatedUC = aVar;
        this.launchAppUseCase = sVar;
        this.updateNotDisplayedPushCountUC = bVar;
    }

    private final gx.b b(DecryptedMessage message) {
        RemoteMessageParameters.TrustedProfileAuthorizationParameters trustedProfileAuthorization;
        OffsetDateTime expirationDateTime;
        RemoteMessageParameters.TrustedProfileAuthorizationParameters trustedProfileAuthorization2;
        String authorizationId;
        RemoteMessageParameters.PaymentParameters payment;
        RemoteMessageParameters.ExternalQualifiedSignatureAuthorization qualifiedSignatureAuthorization;
        OffsetDateTime expirationDateTime2;
        RemoteMessageParameters.ExternalQualifiedSignatureAuthorization qualifiedSignatureAuthorization2;
        String authorizationId2;
        RemoteMessageParameters.ExternalQualifiedSignatureAuthorization qualifiedSignatureAuthorization3;
        String processId;
        RemoteMessageParameters.TravelAdvisoryParameters countryDetails;
        String countryIso;
        switch (a.f160684a[message.getType().ordinal()]) {
            case 1:
                RemoteMessageParameters parameters = message.getParameters();
                if (parameters == null || (trustedProfileAuthorization = parameters.getTrustedProfileAuthorization()) == null || (expirationDateTime = trustedProfileAuthorization.getExpirationDateTime()) == null) {
                    return this.loggedInFallbackEvent;
                }
                RemoteMessageParameters parameters2 = message.getParameters();
                if (parameters2 == null || (trustedProfileAuthorization2 = parameters2.getTrustedProfileAuthorization()) == null || (authorizationId = trustedProfileAuthorization2.getAuthorizationId()) == null) {
                    return this.loggedInFallbackEvent;
                }
                eo2.a.TrustedProfileConfirmationData trustedProfileConfirmationDataF = c0.f(message, expirationDateTime, authorizationId);
                return trustedProfileConfirmationDataF != null ? new eo2.b.ToConfirmation(trustedProfileConfirmationDataF) : this.loggedInFallbackEvent;
            case 2:
                DefaultNotificationDetailsData defaultNotificationDetailsDataD = c0.d(message);
                return defaultNotificationDetailsDataD != null ? new r74.b.ToDefaultNotificationDetails(defaultNotificationDetailsDataD) : this.loggedInFallbackEvent;
            case 3:
                RemoteMessageParameters parameters3 = message.getParameters();
                return new v32.b.ToInstantPaymentsDetails(new InstantPaymentNotificationDetailsData((parameters3 == null || (payment = parameters3.getPayment()) == null) ? null : payment.getPaymentId(), message.getId(), false), w32.a.NOTIFICATION);
            case 4:
                RemoteMessageParameters parameters4 = message.getParameters();
                if (parameters4 == null || (qualifiedSignatureAuthorization = parameters4.getQualifiedSignatureAuthorization()) == null || (expirationDateTime2 = qualifiedSignatureAuthorization.getExpirationDateTime()) == null) {
                    return this.loggedInFallbackEvent;
                }
                RemoteMessageParameters parameters5 = message.getParameters();
                if (parameters5 == null || (qualifiedSignatureAuthorization2 = parameters5.getQualifiedSignatureAuthorization()) == null || (authorizationId2 = qualifiedSignatureAuthorization2.getAuthorizationId()) == null) {
                    return this.loggedInFallbackEvent;
                }
                RemoteMessageParameters parameters6 = message.getParameters();
                if (parameters6 == null || (qualifiedSignatureAuthorization3 = parameters6.getQualifiedSignatureAuthorization()) == null || (processId = qualifiedSignatureAuthorization3.getProcessId()) == null) {
                    return this.loggedInFallbackEvent;
                }
                eo2.a.QualifiedSignatureConfirmationData qualifiedSignatureConfirmationDataE = c0.e(message, expirationDateTime2, authorizationId2, processId);
                return qualifiedSignatureConfirmationDataE != null ? new eo2.b.ToConfirmation(qualifiedSignatureConfirmationDataE) : this.loggedInFallbackEvent;
            case 5:
                return nd3.a.f134345a;
            case 6:
                return si1.b.a.f181938a;
            case 7:
                return yf2.a.C6082a.f226771a;
            case 8:
            case 9:
                return il2.a.C2200a.f93279a;
            case 10:
                RemoteMessageParameters parameters7 = message.getParameters();
                return (parameters7 == null || (countryDetails = parameters7.getCountryDetails()) == null || (countryIso = countryDetails.getCountryIso()) == null) ? this.loggedInFallbackEvent : new ToCountryDetails(countryIso, message.getId(), false);
            default:
                throw new oq.p();
        }
    }

    private final gx.b c(DecryptedMessage message) {
        RemoteMessageParameters.TrustedProfileAuthorizationParameters trustedProfileAuthorization;
        OffsetDateTime expirationDateTime;
        RemoteMessageParameters.TrustedProfileAuthorizationParameters trustedProfileAuthorization2;
        String authorizationId;
        RemoteMessageParameters.PaymentParameters payment;
        RemoteMessageParameters.ExternalQualifiedSignatureAuthorization qualifiedSignatureAuthorization;
        OffsetDateTime expirationDateTime2;
        RemoteMessageParameters.ExternalQualifiedSignatureAuthorization qualifiedSignatureAuthorization2;
        String authorizationId2;
        RemoteMessageParameters.ExternalQualifiedSignatureAuthorization qualifiedSignatureAuthorization3;
        String processId;
        RemoteMessageParameters.TravelAdvisoryParameters countryDetails;
        String countryIso;
        switch (a.f160684a[message.getType().ordinal()]) {
            case 1:
                RemoteMessageParameters parameters = message.getParameters();
                if (parameters == null || (trustedProfileAuthorization = parameters.getTrustedProfileAuthorization()) == null || (expirationDateTime = trustedProfileAuthorization.getExpirationDateTime()) == null) {
                    return this.notLoggedInFallbackEvent;
                }
                RemoteMessageParameters parameters2 = message.getParameters();
                if (parameters2 == null || (trustedProfileAuthorization2 = parameters2.getTrustedProfileAuthorization()) == null || (authorizationId = trustedProfileAuthorization2.getAuthorizationId()) == null) {
                    return this.notLoggedInFallbackEvent;
                }
                eo2.a.TrustedProfileConfirmationData trustedProfileConfirmationDataF = c0.f(message, expirationDateTime, authorizationId);
                return trustedProfileConfirmationDataF != null ? new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.AuthConfirmation(trustedProfileConfirmationDataF)) : this.notLoggedInFallbackEvent;
            case 2:
                DefaultNotificationDetailsData defaultNotificationDetailsDataD = c0.d(message);
                return defaultNotificationDetailsDataD != null ? new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.DefaultNotificationDetails(defaultNotificationDetailsDataD)) : this.notLoggedInFallbackEvent;
            case 3:
                RemoteMessageParameters parameters3 = message.getParameters();
                return new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.ToInstantPaymentsDetails(new InstantPaymentNotificationDetailsData((parameters3 == null || (payment = parameters3.getPayment()) == null) ? null : payment.getPaymentId(), message.getId(), false)));
            case 4:
                RemoteMessageParameters parameters4 = message.getParameters();
                if (parameters4 == null || (qualifiedSignatureAuthorization = parameters4.getQualifiedSignatureAuthorization()) == null || (expirationDateTime2 = qualifiedSignatureAuthorization.getExpirationDateTime()) == null) {
                    return this.notLoggedInFallbackEvent;
                }
                RemoteMessageParameters parameters5 = message.getParameters();
                if (parameters5 == null || (qualifiedSignatureAuthorization2 = parameters5.getQualifiedSignatureAuthorization()) == null || (authorizationId2 = qualifiedSignatureAuthorization2.getAuthorizationId()) == null) {
                    return this.notLoggedInFallbackEvent;
                }
                RemoteMessageParameters parameters6 = message.getParameters();
                if (parameters6 == null || (qualifiedSignatureAuthorization3 = parameters6.getQualifiedSignatureAuthorization()) == null || (processId = qualifiedSignatureAuthorization3.getProcessId()) == null) {
                    return this.loggedInFallbackEvent;
                }
                eo2.a.QualifiedSignatureConfirmationData qualifiedSignatureConfirmationDataE = c0.e(message, expirationDateTime2, authorizationId2, processId);
                return qualifiedSignatureConfirmationDataE != null ? new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.AuthConfirmation(qualifiedSignatureConfirmationDataE)) : this.notLoggedInFallbackEvent;
            case 5:
                return new tj2.b.ToLogin(tj2.b.ToLogin.AbstractC4973a.m.f190514b);
            case 6:
                return new tj2.b.ToLogin(tj2.b.ToLogin.AbstractC4973a.f.f190505b);
            case 7:
                return new tj2.b.ToLogin(tj2.b.ToLogin.AbstractC4973a.h.f190507b);
            case 8:
            case 9:
                return new tj2.b.ToLogin(tj2.b.ToLogin.AbstractC4973a.i.f190508b);
            case 10:
                RemoteMessageParameters parameters7 = message.getParameters();
                return (parameters7 == null || (countryDetails = parameters7.getCountryDetails()) == null || (countryIso = countryDetails.getCountryIso()) == null) ? this.notLoggedInFallbackEvent : new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.ToTravelAbroadCountryDetails(countryIso, message.getId(), false));
            default:
                throw new oq.p();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mz.k
    public Object a(Intent intent, tq.e<? super Boolean> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f160691k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f160691k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f160689h;
        Object objE = uq.b.e();
        int i16 = bVar.f160691k;
        if (i16 == 0) {
            oq.u.b(obj);
            if (this.isMJuniorAppActivatedUC.b(gz.b.a.C1792a.f78542a).booleanValue()) {
                return vq.b.a(false);
            }
            Serializable serializableExtra = intent.getSerializableExtra("remoteNotification");
            DecryptedMessage decryptedMessage = serializableExtra instanceof DecryptedMessage ? (DecryptedMessage) serializableExtra : null;
            if (decryptedMessage == null) {
                return vq.b.a(false);
            }
            this.updateNotDisplayedPushCountUC.a(new t74.b.Params(t74.b.a.C4899a.f188825a));
            px.f.f163100a.b("Handling intent, remote notification path", px.c.a(this));
            a14.s.Params params = new a14.s.Params(t64.b.a.f188027a, c(decryptedMessage), b(decryptedMessage));
            a14.s sVar = this.launchAppUseCase;
            bVar.f160685d = vq.j.a(intent);
            bVar.f160686e = vq.j.a(decryptedMessage);
            bVar.f160687f = vq.j.a(params);
            bVar.f160688g = 0;
            bVar.f160691k = 1;
            if (sVar.c(params, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return vq.b.a(true);
    }
}
