package ah0;

import java.beans.ConstructorProperties;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f6294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X509Certificate f6296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Instant f6297d;

    /* JADX INFO: renamed from: ah0.a$a, reason: collision with other inner class name */
    public static class C0130a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f6298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private X509Certificate f6300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Instant f6301d;

        C0130a() {
        }

        public a a() {
            return new a(this.f6298a, this.f6299b, this.f6300c, this.f6301d);
        }

        public C0130a b(X509Certificate x509Certificate) {
            this.f6300c = x509Certificate;
            return this;
        }

        public C0130a c(String str) {
            this.f6299b = str;
            return this;
        }

        public C0130a d(byte[] bArr) {
            this.f6298a = bArr;
            return this;
        }

        public C0130a e(Instant instant) {
            this.f6301d = instant;
            return this;
        }

        public String toString() {
            return "PdfPersonalSignatureParameters.PdfPersonalSignatureParametersBuilder(preparedPdf=" + Arrays.toString(this.f6298a) + ", cmsHashToSignHex=" + this.f6299b + ", certificate=" + String.valueOf(this.f6300c) + ", signingTime=" + String.valueOf(this.f6301d) + ")";
        }
    }

    @ConstructorProperties({"preparedPdf", "cmsHashToSignHex", "certificate", "signingTime"})
    a(byte[] bArr, String str, X509Certificate x509Certificate, Instant instant) {
        this.f6294a = bArr;
        this.f6295b = str;
        this.f6296c = x509Certificate;
        this.f6297d = instant;
    }

    public static C0130a a() {
        return new C0130a();
    }

    public X509Certificate b() {
        return this.f6296c;
    }

    public String c() {
        return this.f6295b;
    }

    public byte[] d() {
        return this.f6294a;
    }

    public Instant e() {
        return this.f6297d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Arrays.equals(d(), aVar.d())) {
            return false;
        }
        String strC = c();
        String strC2 = aVar.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        X509Certificate x509CertificateB = b();
        X509Certificate x509CertificateB2 = aVar.b();
        if (x509CertificateB != null ? !x509CertificateB.equals(x509CertificateB2) : x509CertificateB2 != null) {
            return false;
        }
        Instant instantE = e();
        Instant instantE2 = aVar.e();
        return instantE != null ? instantE.equals(instantE2) : instantE2 == null;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(d()) + 59;
        String strC = c();
        int iHashCode2 = (iHashCode * 59) + (strC == null ? 43 : strC.hashCode());
        X509Certificate x509CertificateB = b();
        int iHashCode3 = (iHashCode2 * 59) + (x509CertificateB == null ? 43 : x509CertificateB.hashCode());
        Instant instantE = e();
        return (iHashCode3 * 59) + (instantE != null ? instantE.hashCode() : 43);
    }

    public String toString() {
        return "PdfPersonalSignatureParameters(preparedPdf=" + Arrays.toString(d()) + ", cmsHashToSignHex=" + c() + ", certificate=" + String.valueOf(b()) + ", signingTime=" + String.valueOf(e()) + ")";
    }
}
