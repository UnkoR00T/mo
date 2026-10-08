package kx1;

import java.security.cert.X509Certificate;
import java.time.Instant;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkx1/a;", "", "", "preparedPdf", "", "cmsHashToSignHex", "Ljava/security/cert/X509Certificate;", "certificate", "Ljava/time/Instant;", "signingTime", "<init>", "([BLjava/lang/String;Ljava/security/cert/X509Certificate;Ljava/time/Instant;)V", "a", "[B", "c", "()[B", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "d", "Ljava/time/Instant;", "()Ljava/time/Instant;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] preparedPdf;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String cmsHashToSignHex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final X509Certificate certificate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Instant signingTime;

    public a(byte[] bArr, String str, X509Certificate x509Certificate, Instant instant) {
        this.preparedPdf = bArr;
        this.cmsHashToSignHex = str;
        this.certificate = x509Certificate;
        this.signingTime = instant;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final X509Certificate getCertificate() {
        return this.certificate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCmsHashToSignHex() {
        return this.cmsHashToSignHex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getPreparedPdf() {
        return this.preparedPdf;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getSigningTime() {
        return this.signingTime;
    }
}
