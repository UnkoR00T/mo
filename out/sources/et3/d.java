package et3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Let3/d;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum d {
    USER_REVOCATION("USER_REVOCATION"),
    CERTIFICATE_ACTIVATION_ERROR("CERTIFICATE_ACTIVATION_ERROR"),
    CERTIFICATES_LIMIT_REACHED("CERTIFICATES_LIMIT_REACHED"),
    CERTIFICATE_EXPIRED("CERTIFICATE_EXPIRED"),
    USER_DEATH("USER_DEATH"),
    USER_PERSONAL_DATA_CHANGE("USER_PERSONAL_DATA_CHANGE"),
    ADMIN_REVOCATION("ADMIN_REVOCATION"),
    CALL_CENTER_REVOCATION("CALL_CENTER_REVOCATION"),
    VALID_PERIOD_EXCEEDED("VALID_PERIOD_EXCEEDED"),
    UNKNOWN("UNKNOWN"),
    MANUALLY_UPDATE("MANUALLY_UPDATE"),
    MOBILE_APP_UNINSTALLED("MOBILE_APP_UNINSTALLED"),
    ID_CARD_INVALIDATED_REFRESH("ID_CARD_INVALIDATED_REFRESH"),
    ID_CARD_INVALIDATED_SUBSCRIPTION("ID_CARD_INVALIDATED_SUBSCRIPTION"),
    STUDENT_USER_REVOCATION("STUDENT_USER_REVOCATION"),
    USER_SUBSCRIPTION_CANCELLED("USER_SUBSCRIPTION_CANCELLED"),
    USER_UKR_STATUS_LOSS("USER_UKR_STATUS_LOSS"),
    USER_PESEL_CHANGE("USER_PESEL_CHANGE");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ wq.a f53487y = wq.b.a(b());

    d(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
