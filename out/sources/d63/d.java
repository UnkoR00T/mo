package d63;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ld63/d;", "", "", "snackBarResId", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "c", "d", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum d {
    NONE(null),
    BIOMETRIC_WITH_PIN(Integer.valueOf(c53.a.C0)),
    BIOMETRIC_WITHOUT_PIN(Integer.valueOf(c53.a.B0));


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ wq.a f40095f = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer snackBarResId;

    d(Integer num) {
        this.snackBarResId = num;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getSnackBarResId() {
        return this.snackBarResId;
    }
}
