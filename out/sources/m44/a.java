package m44;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import j44.Access;
import j44.OwnerAddress;
import j44.Refresh;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lm44/a;", "Lo44/a;", "<init>", "()V", "Lj44/c;", "token", "Loq/i0;", ip.a.f96138c, "(Lj44/c;)V", "Lj44/f;", "x", "(Lj44/f;)V", "T", "()Lj44/f;", "Lj44/g;", "B", "(Lj44/g;)V", "g0", "()Lj44/g;", "Lj44/h;", "data", i.f37087n, "(Lj44/h;)V", "Z", "()Lj44/h;", "clear", "a", "Lj44/c;", "centralAccessToken", "b", "Lj44/f;", "owAccessToken", "c", "Lj44/g;", "owRefreshToken", "d", "Lj44/h;", "ownerAddress", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Access centralAccessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private j44.Access owAccessToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Refresh owRefreshToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private OwnerAddress ownerAddress;

    @Override // o44.a
    public void B(Refresh token) {
        this.owRefreshToken = token;
    }

    @Override // o44.a
    public void D(Access token) {
        this.centralAccessToken = token;
    }

    @Override // o44.a
    public void H(OwnerAddress data) {
        this.ownerAddress = data;
    }

    @Override // o44.a
    /* JADX INFO: renamed from: T, reason: from getter */
    public j44.Access getOwAccessToken() {
        return this.owAccessToken;
    }

    @Override // o44.a
    /* JADX INFO: renamed from: Z, reason: from getter */
    public OwnerAddress getOwnerAddress() {
        return this.ownerAddress;
    }

    @Override // wy.c
    public void clear() {
        this.centralAccessToken = null;
        this.owAccessToken = null;
        this.owRefreshToken = null;
        this.ownerAddress = null;
    }

    @Override // o44.a
    /* JADX INFO: renamed from: g0, reason: from getter */
    public Refresh getOwRefreshToken() {
        return this.owRefreshToken;
    }

    @Override // o44.a
    public void x(j44.Access token) {
        this.owAccessToken = token;
    }
}
