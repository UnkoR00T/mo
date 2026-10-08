package rc0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lrc0/a;", "", "", "sharedPreferencesKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    PIN("M_JUNIOR_FAILED_PIN_COUNT_KEY");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ wq.a f173097d = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sharedPreferencesKey;

    a(String str) {
        this.sharedPreferencesKey = str;
    }

    public static wq.a<a> e() {
        return f173097d;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSharedPreferencesKey() {
        return this.sharedPreferencesKey;
    }
}
