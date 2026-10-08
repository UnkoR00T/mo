package sv0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lsv0/v0;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum v0 {
    FRONT_DAMAGE("FRONT_DAMAGE"),
    BACK_DAMAGE("BACK_DAMAGE"),
    TOP_DAMAGE("TOP_DAMAGE"),
    LEFT_FRONT_DAMAGE("LEFT_FRONT_DAMAGE"),
    RIGHT_FRONT_DAMAGE("RIGHT_FRONT_DAMAGE"),
    LEFT_SIDE_DAMAGE("LEFT_SIDE_DAMAGE"),
    RIGHT_SIDE_DAMAGE("RIGHT_SIDE_DAMAGE"),
    LEFT_BACK_DAMAGE("LEFT_BACK_DAMAGE"),
    RIGHT_BACK_DAMAGE("RIGHT_BACK_DAMAGE"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ wq.a f184687n = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    v0(String str) {
        this.value = str;
    }
}
