package gm0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lgm0/k5;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum k5 {
    PERSONALIZATION_ERROR("PERSONALIZATION_ERROR"),
    INVALIDITY_DECLARATION_CITIZENSHIP_MISSING("INVALIDITY_DECLARATION_CITIZENSHIP_MISSING"),
    INVALIDITY_DECLARATION_FORGERY("INVALIDITY_DECLARATION_FORGERY"),
    INVALIDITY_DECLARATION_OTHER("INVALIDITY_DECLARATION_OTHER"),
    INVALIDITY_DECLARATION_WRONG_DATA("INVALIDITY_DECLARATION_WRONG_DATA"),
    INVALIDITY_DECLARATION_PERSONALIZATION_ERROR("INVALIDITY_DECLARATION_PERSONALIZATION_ERROR"),
    UNAUTHORIZED_USING_PERSONAL_DATA("UNAUTHORIZED_USING_PERSONAL_DATA"),
    CITIZEN_REQUEST("CITIZEN_REQUEST"),
    OFFICE_REQUEST("OFFICE_REQUEST"),
    INVALID_DATA("INVALID_DATA"),
    THIRD_PARTY_FOUND_DOCUMENT("THIRD_PARTY_FOUND_DOCUMENT"),
    COMPLIANT("COMPLIANT"),
    EXPIRED("EXPIRED"),
    DAMAGE("DAMAGE"),
    LOSS("LOSS"),
    RENUNCIATION_OF_CITIZENSHIP("RENUNCIATION_OF_CITIZENSHIP"),
    LOSS_RIGHT_FOR_USING_PASSPORT("LOSS_RIGHT_FOR_USING_PASSPORT"),
    TECHNICAL_FAULTS("TECHNICAL_FAULTS"),
    ISSUING_NEW_PASSPORT("ISSUING_NEW_PASSPORT"),
    DIED("DIED"),
    DATA_CHANGED("DATA_CHANGED"),
    DATA_MIGRATION("DATA_MIGRATION"),
    UNKNOWN("UNKNOWN");

    private static final /* synthetic */ wq.a D = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    k5(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
