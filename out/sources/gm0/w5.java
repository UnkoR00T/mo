package gm0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lgm0/w5;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum w5 {
    APPLICATION_PROCESSED_AT_OFFICE("APPLICATION_PROCESSED_AT_OFFICE"),
    APPLICATION_PROCESSED_TO_COMPLETE_AT_OFFICE("APPLICATION_PROCESSED_TO_COMPLETE_AT_OFFICE"),
    ID_CARD_IN_PRODUCTION("ID_CARD_IN_PRODUCTION"),
    APPLICATION_SUSPENDED("APPLICATION_SUSPENDED"),
    APPLICATION_REJECTED("APPLICATION_REJECTED"),
    ID_CARD_FOR_COLLECTION_WITHOUT_PUK("ID_CARD_FOR_COLLECTION_WITHOUT_PUK"),
    ID_CARD_FOR_COLLECTION_WITH_PUK("ID_CARD_FOR_COLLECTION_WITH_PUK"),
    ID_CARD_COLLECTED("ID_CARD_COLLECTED"),
    ID_CARD_COLLECTED_WAIT_FOR_PUK("ID_CARD_COLLECTED_WAIT_FOR_PUK"),
    ID_CARD_COLLECTED_GET_PUK("ID_CARD_COLLECTED_GET_PUK"),
    ID_CARD_CANNOT_BE_ISSUED("ID_CARD_CANNOT_BE_ISSUED"),
    APPLICATION_NOT_FOUND("APPLICATION_NOT_FOUND"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ wq.a f74859s = wq.b.a(b());

    w5(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
