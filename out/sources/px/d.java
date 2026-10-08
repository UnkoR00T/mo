package px;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0007¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lpx/d;", "Lpx/b;", "", "host", "environment", "Loq/i0;", "g7", "(Ljava/lang/String;Ljava/lang/String;)V", "message", "Lpx/d$a;", "category", "F8", "(Ljava/lang/String;Lpx/d$a;)V", "key", "value", "p", "l0", "b", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends b {

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f163099a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lpx/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        GENERAL,
        UI_INTERACTION,
        NAVIGATION,
        NETWORK,
        ERROR;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f163098g = wq.b.a(b());
    }

    /* JADX INFO: renamed from: px.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpx/d$b;", "", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f163099a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ void i2(d dVar, String str, String str2, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configure");
        }
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        dVar.g7(str, str2);
    }

    void F8(String message, a category);

    void g7(String host, String environment);

    void p(String key, String value);
}
