package qy;

import fr.t;
import iy.a0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lqy/b;", "", "Liy/a0;", "value", "b", "(Liy/a0;)Liy/a0;", "", "f", "(Liy/a0;)Ljava/lang/String;", "", "e", "(Liy/a0;)I", "other", "", "c", "(Liy/a0;Ljava/lang/Object;)Z", "a", "Liy/a0;", "getValue", "()Liy/a0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 value;

    private /* synthetic */ b(a0 a0Var) {
        this.value = a0Var;
    }

    public static final /* synthetic */ b a(a0 a0Var) {
        return new b(a0Var);
    }

    public static a0 b(a0 a0Var) {
        return a0Var;
    }

    public static boolean c(a0 a0Var, Object obj) {
        return (obj instanceof b) && t.c(a0Var, ((b) obj).getValue());
    }

    public static final boolean d(a0 a0Var, a0 a0Var2) {
        return t.c(a0Var, a0Var2);
    }

    public static int e(a0 a0Var) {
        return a0Var.hashCode();
    }

    public static String f(a0 a0Var) {
        return "WrappedMasterKey(value=" + a0Var + ")";
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ a0 getValue() {
        return this.value;
    }

    public int hashCode() {
        return e(this.value);
    }

    public String toString() {
        return f(this.value);
    }
}
