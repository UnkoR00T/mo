package ge4;

import fv.d0;
import fv.e0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f72474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f72475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f72476c;

    private x(d0 d0Var, T t15, e0 e0Var) {
        this.f72474a = d0Var;
        this.f72475b = t15;
        this.f72476c = e0Var;
    }

    public static <T> x<T> c(e0 e0Var, d0 d0Var) {
        Objects.requireNonNull(e0Var, "body == null");
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (d0Var.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new x<>(d0Var, null, e0Var);
    }

    public static <T> x<T> i(T t15, d0 d0Var) {
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (d0Var.isSuccessful()) {
            return new x<>(d0Var, t15, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.f72475b;
    }

    public int b() {
        return this.f72474a.getCode();
    }

    public e0 d() {
        return this.f72476c;
    }

    public fv.u e() {
        return this.f72474a.getHeaders();
    }

    public boolean f() {
        return this.f72474a.isSuccessful();
    }

    public String g() {
        return this.f72474a.getMessage();
    }

    public d0 h() {
        return this.f72474a;
    }

    public String toString() {
        return this.f72474a.toString();
    }
}
