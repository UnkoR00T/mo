package eo0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Leo0/i;", "", "Liy/b0;", "value", "b", "(Liy/b0;)Liy/b0;", "", "f", "(Liy/b0;)Ljava/lang/String;", "", "e", "(Liy/b0;)I", "other", "", "c", "(Liy/b0;Ljava/lang/Object;)Z", "a", "Liy/b0;", "getValue", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.b0 value;

    private /* synthetic */ i(iy.b0 b0Var) {
        this.value = b0Var;
    }

    public static final /* synthetic */ i a(iy.b0 b0Var) {
        return new i(b0Var);
    }

    public static iy.b0 b(iy.b0 b0Var) {
        return b0Var;
    }

    public static boolean c(iy.b0 b0Var, Object obj) {
        return (obj instanceof i) && fr.t.c(b0Var, ((i) obj).getValue());
    }

    public static final boolean d(iy.b0 b0Var, iy.b0 b0Var2) {
        return fr.t.c(b0Var, b0Var2);
    }

    public static int e(iy.b0 b0Var) {
        return b0Var.hashCode();
    }

    public static String f(iy.b0 b0Var) {
        return "Base64Xml(value=" + b0Var + ")";
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ iy.b0 getValue() {
        return this.value;
    }

    public int hashCode() {
        return e(this.value);
    }

    public String toString() {
        return f(this.value);
    }
}
