package l54;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Ll54/b;", "Ln54/b;", "Ln54/a;", "dataSource", "<init>", "(Ln54/a;)V", "Li54/b$a;", "token", "Loq/i0;", "f", "(Li54/b$a;)V", "b", "()Li54/b$a;", "Li54/b$b;", "h", "(Li54/b$b;)V", "d", "()Li54/b$b;", "Li54/b$c;", "g", "(Li54/b$c;)V", "a", "()Li54/b$c;", "Li54/a;", "data", "e", "(Li54/a;)V", "c", "()Li54/a;", "Ln54/a;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements n54.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n54.a dataSource;

    public b(n54.a aVar) {
        this.dataSource = aVar;
    }

    @Override // n54.b
    public i54.b.Refresh a() {
        return this.dataSource.getRefreshToken();
    }

    @Override // n54.b
    public i54.b.Access b() {
        return this.dataSource.getAccessToken();
    }

    @Override // n54.b
    public i54.a c() {
        return this.dataSource.getElectronicDeliveryOwnerData();
    }

    @Override // n54.b
    public i54.b.CentralAccess d() {
        return this.dataSource.getCentralAccessToken();
    }

    @Override // n54.b
    public void e(i54.a data) {
        this.dataSource.k0(data);
    }

    @Override // n54.b
    public void f(i54.b.Access token) {
        this.dataSource.i0(token);
    }

    @Override // n54.b
    public void g(i54.b.Refresh token) {
        this.dataSource.i(token);
    }

    @Override // n54.b
    public void h(i54.b.CentralAccess token) {
        this.dataSource.g(token);
    }
}
