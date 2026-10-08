package fp0;

import fr.t;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0007\u0092\u0001\u00020\u0006¨\u0006\u0010"}, d2 = {"Lfp0/h;", "Lgz/b$a;", "", "value", "c", "(Ljava/lang/String;)Liy/b0;", "Liy/b0;", "payload", "b", "(Liy/b0;)Liy/b0;", "h", "(Liy/b0;)Ljava/lang/String;", "", "f", "(Liy/b0;)I", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b0 f65816b = b(b0.INSTANCE.a());

    /* JADX INFO: renamed from: fp0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfp0/h$a;", "", "<init>", "()V", "Lfp0/h;", "EMPTY", "Liy/b0;", "a", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final b0 a() {
            return h.f65816b;
        }

        private Companion() {
        }
    }

    public static b0 b(b0 b0Var) {
        return b0Var;
    }

    public static b0 c(String str) {
        return b(c0.g(str));
    }

    public static final boolean d(b0 b0Var, b0 b0Var2) {
        return t.c(b0Var, b0Var2);
    }

    public static int f(b0 b0Var) {
        return b0Var.hashCode();
    }

    public static String h(b0 b0Var) {
        return "QrCode(payload=" + b0Var + ")";
    }
}
