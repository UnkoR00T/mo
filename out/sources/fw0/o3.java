package fw0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lfw0/o3;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum o3 {
    FRONT_DAMAGE("FRONT_DAMAGE"),
    BACK_DAMAGE("BACK_DAMAGE"),
    LEFT_SIDE_DAMAGE("LEFT_SIDE_DAMAGE"),
    RIGHT_SIDE_DAMAGE("RIGHT_SIDE_DAMAGE"),
    LEFT_FRONT_DAMAGE("LEFT_FRONT_DAMAGE"),
    RIGHT_FRONT_DAMAGE("RIGHT_FRONT_DAMAGE"),
    LEFT_BACK_DAMAGE("LEFT_BACK_DAMAGE"),
    RIGHT_BACK_DAMAGE("RIGHT_BACK_DAMAGE"),
    TOP_DAMAGE("TOP_DAMAGE"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ wq.a f68110p = wq.b.a(b());

    o3(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
