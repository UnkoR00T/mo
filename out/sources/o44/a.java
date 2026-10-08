package o44;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import j44.Access;
import j44.OwnerAddress;
import j44.Refresh;
import p071kotlin.Metadata;
import wy.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lo44/a;", "Lwy/c;", "Lj44/c;", "token", "Loq/i0;", ip.a.f96138c, "(Lj44/c;)V", "Lj44/f;", "x", "(Lj44/f;)V", "T", "()Lj44/f;", "Lj44/g;", "B", "(Lj44/g;)V", "g0", "()Lj44/g;", "Lj44/h;", "data", i.f37087n, "(Lj44/h;)V", "Z", "()Lj44/h;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends c {
    void B(Refresh token);

    void D(Access token);

    void H(OwnerAddress data);

    j44.Access T();

    OwnerAddress Z();

    Refresh g0();

    void x(j44.Access token);
}
