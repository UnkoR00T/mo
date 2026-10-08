package l54;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"¨\u0006$"}, d2 = {"Ll54/a;", "Ln54/a;", "<init>", "()V", "Li54/b$a;", "token", "Loq/i0;", "i0", "(Li54/b$a;)V", "b", "()Li54/b$a;", "Li54/b$b;", "g", "(Li54/b$b;)V", "d", "()Li54/b$b;", "Li54/b$c;", "i", "(Li54/b$c;)V", "a", "()Li54/b$c;", "Li54/a;", "data", "k0", "(Li54/a;)V", "c", "()Li54/a;", "clear", "Li54/b$a;", "accessToken", "Li54/b$b;", "centralAccessToken", "Li54/b$c;", "refreshToken", "Li54/a;", "electronicDeliveryOwnerData", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements n54.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private i54.b.Access accessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private i54.b.CentralAccess centralAccessToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i54.b.Refresh refreshToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private i54.a electronicDeliveryOwnerData;

    @Override // n54.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public i54.b.Refresh getRefreshToken() {
        return this.refreshToken;
    }

    @Override // n54.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public i54.b.Access getAccessToken() {
        return this.accessToken;
    }

    @Override // n54.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public i54.a getElectronicDeliveryOwnerData() {
        return this.electronicDeliveryOwnerData;
    }

    @Override // wy.c
    public void clear() {
        this.accessToken = null;
        this.centralAccessToken = null;
        this.refreshToken = null;
        this.electronicDeliveryOwnerData = null;
    }

    @Override // n54.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public i54.b.CentralAccess getCentralAccessToken() {
        return this.centralAccessToken;
    }

    @Override // n54.a
    public void g(i54.b.CentralAccess token) {
        this.centralAccessToken = token;
    }

    @Override // n54.a
    public void i(i54.b.Refresh token) {
        this.refreshToken = token;
    }

    @Override // n54.a
    public void i0(i54.b.Access token) {
        this.accessToken = token;
    }

    @Override // n54.a
    public void k0(i54.a data) {
        this.electronicDeliveryOwnerData = data;
    }
}
