package mi2;

import ac4.d;
import dx.b;
import dx.i;
import ii2.c;
import iy.j;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.Date;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import pq.e1;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 ¨\u0006!"}, d2 = {"Lmi2/a;", "Liy/j;", "Liy/a;", "base64Coder", "Lac4/d;", "getCurrentServerTimeUseCase", "Ldx/a;", "deactivateDomainErrorFactory", "<init>", "(Liy/a;Lac4/d;Ldx/a;)V", "", "data", "Lry/c;", "certKeyPair", "Ldx/i;", "Ldx/b;", "", "c", "(Ljava/lang/String;Lry/c;)Ldx/i;", "e", "([BLry/c;)Ldx/i;", "b", "([BLry/c;)[B", "plaintext", "Ljava/security/cert/X509Certificate;", "recipientCertificate", "d", "([BLjava/security/cert/X509Certificate;)Ljava/lang/String;", "a", "([B)Ljava/lang/String;", "Liy/a;", "Lac4/d;", "Ldx/a;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.a deactivateDomainErrorFactory;

    public a(iy.a aVar, d dVar, dx.a aVar2) {
        this.base64Coder = aVar;
        this.getCurrentServerTimeUseCase = dVar;
        this.deactivateDomainErrorFactory = aVar2;
    }

    @Override // iy.j
    public String a(byte[] data) {
        return StandardCharsets.UTF_8.decode(ByteBuffer.wrap((byte[]) new CMSSignedData(data).getSignedContent().getContent())).toString();
    }

    @Override // iy.j
    public byte[] b(byte[] data, CertKeyPair certKeyPair) {
        return fi2.a.a(new CMSEnvelopedData(data), certKeyPair.getCertificate(), certKeyPair.getPrivateKey());
    }

    @Override // iy.j
    public i<b, byte[]> c(String data, CertKeyPair certKeyPair) {
        return e(data.getBytes(fu.d.UTF_8), certKeyPair);
    }

    @Override // iy.j
    public String d(byte[] plaintext, X509Certificate recipientCertificate) {
        return iy.a.e(this.base64Coder, fi2.a.c(plaintext, recipientCertificate), null, 2, null);
    }

    public i<b, byte[]> e(byte[] data, CertKeyPair certKeyPair) {
        try {
            return new i.Right(fi2.a.h(data, certKeyPair.getCertificate(), certKeyPair.getPrivateKey(), e1.d(certKeyPair.getCertificate()), Date.from(this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a).toInstant())));
        } catch (c unused) {
            return new i.Left(this.deactivateDomainErrorFactory.b(false));
        }
    }
}
