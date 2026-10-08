package p73;

import fr.k;
import fr.t;
import gz.b;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lp73/a;", "Lgz/b$a;", "Liy/b0;", "value", "c", "(Liy/b0;)Liy/b0;", "", "i", "(Liy/b0;)Ljava/lang/String;", "", "h", "(Liy/b0;)I", "", "other", "", "d", "(Liy/b0;Ljava/lang/Object;)Z", "a", "Liy/b0;", "getValue", "()Liy/b0;", "b", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b0 f153384c = c(b0.INSTANCE.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 value;

    /* JADX INFO: renamed from: p73.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp73/a$a;", "", "<init>", "()V", "Lp73/a;", "EMPTY", "Liy/b0;", "a", "()Liy/b0;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b0 a() {
            return a.f153384c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ a(b0 b0Var) {
        this.value = b0Var;
    }

    public static final /* synthetic */ a b(b0 b0Var) {
        return new a(b0Var);
    }

    public static b0 c(b0 b0Var) {
        return b0Var;
    }

    public static boolean d(b0 b0Var, Object obj) {
        return (obj instanceof a) && t.c(b0Var, ((a) obj).getValue());
    }

    public static final boolean f(b0 b0Var, b0 b0Var2) {
        return t.c(b0Var, b0Var2);
    }

    public static int h(b0 b0Var) {
        return b0Var.hashCode();
    }

    public static String i(b0 b0Var) {
        return "ActivationCode(value=" + b0Var + ')';
    }

    public boolean equals(Object obj) {
        return d(this.value, obj);
    }

    public int hashCode() {
        return h(this.value);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ b0 getValue() {
        return this.value;
    }

    public String toString() {
        return i(this.value);
    }
}
