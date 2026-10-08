package mq0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lmq0/i;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum i {
    PHYSICAL_ID_CARD_APPLICATION("PHYSICAL_ID_CARD_APPLICATION"),
    CHILD_PHYSICAL_ID_CARD_APPLICATION("CHILD_PHYSICAL_ID_CARD_APPLICATION"),
    WARD_PHYSICAL_ID_CARD_APPLICATION("WARD_PHYSICAL_ID_CARD_APPLICATION"),
    PHYSICAL_ID_CARD_SUSPENSION("PHYSICAL_ID_CARD_SUSPENSION"),
    PHYSICAL_ID_CARD_INVALIDATION("PHYSICAL_ID_CARD_INVALIDATION"),
    CHILD_ID_CARD_SUSPENSION("CHILD_ID_CARD_SUSPENSION"),
    DEPENDANT_ID_CARD_SUSPENSION("DEPENDANT_ID_CARD_SUSPENSION"),
    PASSPORT_DAMAGE("PASSPORT_DAMAGE"),
    PASSPORT_LOSS("PASSPORT_LOSS"),
    PASSPORT_INVALIDATION("PASSPORT_INVALIDATION"),
    CHILD_BIRTH_REGISTRATION("CHILD_BIRTH_REGISTRATION"),
    PASSPORT_AGREEMENT("PASSPORT_AGREEMENT"),
    PASSPORT_AGREEMENT_MANAGEMENT("PASSPORT_AGREEMENT_MANAGEMENT"),
    CHILD_PASSPORT_APPLICATION("CHILD_PASSPORT_APPLICATION"),
    CHILD_ID_CARD_INVALIDATION("CHILD_ID_CARD_INVALIDATION"),
    WARD_ID_CARD_INVALIDATION("WARD_ID_CARD_INVALIDATION"),
    HEATING_SUPPLEMENT("HEATING_SUPPLEMENT"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ wq.a f127733y = wq.b.a(b());

    i(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
