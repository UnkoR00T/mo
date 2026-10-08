package uv0;

import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0006¨\u0006\u0019"}, d2 = {"Luv0/v;", "", "", "value", "d", "(Ljava/lang/String;)Liy/b0;", "Liy/b0;", "c", "(Liy/b0;)Liy/b0;", "", "h", "(Liy/b0;)Z", "i", "(Liy/b0;)Ljava/lang/String;", "", "g", "(Liy/b0;)I", "other", "e", "(Liy/b0;Ljava/lang/Object;)Z", "a", "Liy/b0;", "getValue", "()Liy/b0;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b0 f201764c = c(b0.INSTANCE.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 value;

    /* JADX INFO: renamed from: uv0.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Luv0/v$a;", "", "<init>", "()V", "Luv0/v;", "EMPTY", "Liy/b0;", "a", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final b0 a() {
            return v.f201764c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ v(b0 b0Var) {
        this.value = b0Var;
    }

    public static final /* synthetic */ v b(b0 b0Var) {
        return new v(b0Var);
    }

    public static b0 c(b0 b0Var) {
        return b0Var;
    }

    public static b0 d(String str) {
        return c(c0.g(str));
    }

    public static boolean e(b0 b0Var, Object obj) {
        return (obj instanceof v) && fr.t.c(b0Var, ((v) obj).getValue());
    }

    public static final boolean f(b0 b0Var, b0 b0Var2) {
        return fr.t.c(b0Var, b0Var2);
    }

    public static int g(b0 b0Var) {
        return b0Var.hashCode();
    }

    public static final boolean h(b0 b0Var) {
        return !fu.r.t0(c0.e(b0Var));
    }

    public static String i(b0 b0Var) {
        return "Vin(value=" + b0Var + ")";
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    public int hashCode() {
        return g(this.value);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ b0 getValue() {
        return this.value;
    }

    public String toString() {
        return i(this.value);
    }
}
