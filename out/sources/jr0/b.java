package jr0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Ljr0/b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "j", "k", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum b {
    MOBILE_ID_CARD("MOBILE_ID_CARD"),
    DRIVING_LICENCE("DRIVING_LICENCE"),
    TEMPORARY_DRIVING_LICENCE("TEMPORARY_DRIVING_LICENCE"),
    DEPUTY("DEPUTY"),
    DOCTOR("DOCTOR"),
    NURSE("NURSE"),
    MIDWIFE("MIDWIFE"),
    PENSIONER("PENSIONER"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ wq.a f104417m = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    b(String str) {
        this.value = str;
    }
}
