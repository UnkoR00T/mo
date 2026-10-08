package ge4;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class m extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f72327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f72328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient x<?> f72329c;

    public m(x<?> xVar) {
        super(a(xVar));
        this.f72327a = xVar.b();
        this.f72328b = xVar.g();
        this.f72329c = xVar;
    }

    private static String a(x<?> xVar) {
        Objects.requireNonNull(xVar, "response == null");
        return "HTTP " + xVar.b() + " " + xVar.g();
    }
}
