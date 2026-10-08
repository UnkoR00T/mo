package lo1;

import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpRequestExecutor;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Llo1/c;", "", "<init>", "()V", "Lcq/c;", "lifecycle", "Lju/p0;", "e", "(Lcq/c;)Lju/p0;", "scope", "Lnr1/b;", "dataSource", "Lnr1/e;", "c", "(Lju/p0;Lnr1/b;)Lnr1/e;", "b", "()Lnr1/b;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "executor", "Lmo1/a;", "d", "(Lpl/gov/coi/common/network/HttpRequestExecutor;)Lmo1/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f119012a = new c();

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p0 p0Var) {
        q0.d(p0Var, null, 1, null);
    }

    public final nr1.b b() {
        return new nr1.c();
    }

    public final nr1.e c(p0 scope, nr1.b dataSource) {
        return new nr1.f(scope, dataSource);
    }

    public final mo1.a d(HttpRequestExecutor executor) {
        return new ko1.a(executor);
    }

    public final p0 e(cq.c lifecycle) {
        final p0 p0VarA = q0.a(g1.c().d2().n0(z2.b(null, 1, null)));
        lifecycle.a(new kq.b.a() { // from class: lo1.b
            @Override // kq.b.a
            public final void a() {
                c.f(p0VarA);
            }
        });
        return p0VarA;
    }
}
