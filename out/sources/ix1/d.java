package ix1;

import java.security.cert.X509Certificate;
import java.time.Instant;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Lix1/d;", "Lix1/c;", "Lzg0/b;", "initializer", "<init>", "(Lzg0/b;)V", "", "pdf", "Ljava/security/cert/X509Certificate;", "certificate", "Ljava/time/Instant;", "signingTime", "Lkx1/a;", "a", "([BLjava/security/cert/X509Certificate;Ljava/time/Instant;)Lkx1/a;", "parameters", "signature", "b", "(Lkx1/a;[B)[B", "Lzg0/b;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zg0.b initializer;

    public d(zg0.b bVar) {
        this.initializer = bVar;
    }

    @Override // ix1.c
    public kx1.a a(byte[] pdf, X509Certificate certificate, Instant signingTime) {
        return a.b(zg0.a.b(pdf, certificate, this.initializer, signingTime));
    }

    @Override // ix1.c
    public byte[] b(kx1.a parameters, byte[] signature) {
        return zg0.a.a(a.a(parameters), signature).b();
    }
}
