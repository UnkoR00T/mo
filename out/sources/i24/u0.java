package i24;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Li24/u0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum u0 {
    DEFAULT,
    SENATOR,
    PZPN;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ wq.a f88809f = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i24.u0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li24/u0$a;", "", "<init>", "()V", "", "value", "Li24/u0;", "a", "(Ljava/lang/String;)Li24/u0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final u0 a(String value) {
            if (fr.t.c(value, "SENATOR")) {
                return u0.SENATOR;
            }
            return fr.t.c(value, "PZPN") ? u0.PZPN : u0.DEFAULT;
        }

        private Companion() {
        }
    }
}
