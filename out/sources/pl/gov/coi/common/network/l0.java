package pl.gov.coi.common.network;

import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cert.ocsp.BasicOCSPResp;
import org.bouncycastle.cert.ocsp.CertificateID;
import org.bouncycastle.cert.ocsp.OCSPResp;
import org.bouncycastle.cert.ocsp.SingleResp;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0002\u001d8B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010'\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010)\u001a\u00020 H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u0004\u0018\u00010\f2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u000204*\u00020\fH\u0002¢\u0006\u0004\b5\u00106J)\u00108\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010<¨\u0006="}, d2 = {"Lpl/gov/coi/common/network/l0;", "Lpl/gov/coi/common/network/k0;", "Liy/d0;", "signatureVerifier", "Lez/a;", "currentTimeProvider", "Lpx/d;", "remoteLogger", "<init>", "(Liy/d0;Lez/a;Lpx/d;)V", "Lorg/bouncycastle/cert/ocsp/BasicOCSPResp;", "response", "Ljava/security/cert/X509Certificate;", "issuer", "", "g", "(Lorg/bouncycastle/cert/ocsp/BasicOCSPResp;Ljava/security/cert/X509Certificate;)Z", "basicResp", "cert", "Lorg/bouncycastle/cert/ocsp/SingleResp;", "d", "(Lorg/bouncycastle/cert/ocsp/BasicOCSPResp;Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/cert/ocsp/SingleResp;", "f", "(Lorg/bouncycastle/cert/ocsp/BasicOCSPResp;)Z", "singleResp", "i", "(Lorg/bouncycastle/cert/ocsp/SingleResp;)Z", "", "Lpl/gov/coi/common/network/l0$b;", "b", "(Lorg/bouncycastle/cert/ocsp/BasicOCSPResp;Ljava/security/cert/X509Certificate;)Ljava/util/List;", "candidate", "Ljava/util/Date;", "producedAt", "", "message", "signature", "Lry/n;", "algorithm", "l", "(Lpl/gov/coi/common/network/l0$b;Ljava/util/Date;[B[BLry/n;)Z", "at", "j", "(Ljava/security/cert/X509Certificate;Ljava/util/Date;)Z", "h", "(Lpl/gov/coi/common/network/l0$b;)Z", "e", "(Ljava/security/cert/X509Certificate;)Z", "Lorg/bouncycastle/cert/X509CertificateHolder;", "holder", "c", "(Lorg/bouncycastle/cert/X509CertificateHolder;)Ljava/security/cert/X509Certificate;", "", "k", "(Ljava/security/cert/X509Certificate;)Ljava/lang/String;", "Lorg/bouncycastle/cert/ocsp/OCSPResp;", "a", "(Lorg/bouncycastle/cert/ocsp/OCSPResp;Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/cert/ocsp/SingleResp;", "Liy/d0;", "Lez/a;", "Lpx/d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 implements k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f158133d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.d0 signatureVerifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lpl/gov/coi/common/network/l0$a;", "", "<init>", "()V", "", "OCSP_SIGNING_EKU_OID", "Ljava/lang/String;", "", "KEY_USAGE_DIGITAL_SIGNATURE_BIT", "I", "", "CLOCK_SKEW_MILLIS", "J", "MAX_PRODUCED_AT_AGE_MILLIS", "MAX_SINGLE_RESP_STALENESS_MILLIS", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.common.network.l0$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lpl/gov/coi/common/network/l0$b;", "", "Ljava/security/cert/X509Certificate;", "cert", "Ljava/security/PublicKey;", "issuerPublicKey", "", "isIssuer", "<init>", "(Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "b", "Ljava/security/PublicKey;", "()Ljava/security/PublicKey;", "c", "Z", "()Z", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class SignerCandidate {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final X509Certificate cert;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PublicKey issuerPublicKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isIssuer;

        public SignerCandidate(X509Certificate x509Certificate, PublicKey publicKey, boolean z15) {
            this.cert = x509Certificate;
            this.issuerPublicKey = publicKey;
            this.isIssuer = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final X509Certificate getCert() {
            return this.cert;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PublicKey getIssuerPublicKey() {
            return this.issuerPublicKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsIssuer() {
            return this.isIssuer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignerCandidate)) {
                return false;
            }
            SignerCandidate signerCandidate = (SignerCandidate) other;
            return fr.t.c(this.cert, signerCandidate.cert) && fr.t.c(this.issuerPublicKey, signerCandidate.issuerPublicKey) && this.isIssuer == signerCandidate.isIssuer;
        }

        public int hashCode() {
            return (((this.cert.hashCode() * 31) + this.issuerPublicKey.hashCode()) * 31) + Boolean.hashCode(this.isIssuer);
        }

        public String toString() {
            return "SignerCandidate(cert=" + this.cert + ", issuerPublicKey=" + this.issuerPublicKey + ", isIssuer=" + this.isIssuer + ')';
        }
    }

    public l0(iy.d0 d0Var, ez.a aVar, px.d dVar) {
        this.signatureVerifier = d0Var;
        this.currentTimeProvider = aVar;
        this.remoteLogger = dVar;
    }

    private final List<SignerCandidate> b(BasicOCSPResp response, X509Certificate issuer) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SignerCandidate(issuer, issuer.getPublicKey(), true));
        X509CertificateHolder[] certs = response.getCerts();
        if (certs == null) {
            certs = new X509CertificateHolder[0];
        }
        for (X509CertificateHolder x509CertificateHolder : certs) {
            X509Certificate x509CertificateC = c(x509CertificateHolder);
            if (x509CertificateC != null) {
                arrayList.add(new SignerCandidate(x509CertificateC, issuer.getPublicKey(), false));
            }
        }
        return arrayList;
    }

    private final X509Certificate c(X509CertificateHolder holder) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(holder.getEncoded()));
        } catch (Exception e15) {
            this.remoteLogger.T6("OCSP embedded cert parse error: " + e15.getMessage(), e15, px.c.a(this));
            return null;
        }
    }

    private final SingleResp d(BasicOCSPResp basicResp, X509Certificate cert, X509Certificate issuer) {
        SingleResp singleResp;
        CertificateID certificateID = new CertificateID(new JcaDigestCalculatorProviderBuilder().build().get(CertificateID.HASH_SHA1), new JcaX509CertificateHolder(issuer), cert.getSerialNumber());
        SingleResp[] responses = basicResp.getResponses();
        int length = responses.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                singleResp = null;
                break;
            }
            singleResp = responses[i15];
            if (fr.t.c(singleResp.getCertID(), certificateID)) {
                break;
            }
            i15++;
        }
        if (singleResp == null) {
            return null;
        }
        if (i(singleResp)) {
            return singleResp;
        }
        this.remoteLogger.F8("OCSP SingleResp out of up to date window for cert: " + k(cert), px.d.a.NETWORK);
        return null;
    }

    private final boolean e(X509Certificate cert) {
        boolean z15;
        try {
            List<String> extendedKeyUsage = cert.getExtendedKeyUsage();
            boolean z16 = extendedKeyUsage != null && extendedKeyUsage.contains("1.3.6.1.5.5.7.3.9");
            boolean[] keyUsage = cert.getKeyUsage();
            if (keyUsage != null) {
                z15 = keyUsage.length > 0 ? keyUsage[0] : false;
            } else {
                z15 = true;
            }
            return z16 && z15;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            this.remoteLogger.T6("OCSP delegate signer EKU / KeyUsage read error: " + e16.getMessage(), e16, px.c.a(this));
            return false;
        }
    }

    private final boolean f(BasicOCSPResp basicResp) {
        Date producedAt = basicResp.getProducedAt();
        if (producedAt != null) {
            long time = producedAt.getTime();
            long jA = this.currentTimeProvider.a();
            if (time <= 300000 + jA && time >= jA - 604800000) {
                return true;
            }
        }
        return false;
    }

    private final boolean g(BasicOCSPResp response, X509Certificate issuer) {
        byte[] signature;
        Date producedAt;
        ry.n nVarA = u0.a(response.getSignatureAlgOID().getId());
        if (nVarA == null) {
            px.b.y5(this.remoteLogger, "Unsupported OCSP signature algorithm: " + response.getSignatureAlgOID().getId(), null, px.c.a(this), 2, null);
            return false;
        }
        byte[] tBSResponseData = response.getTBSResponseData();
        if (tBSResponseData == null || (signature = response.getSignature()) == null || (producedAt = response.getProducedAt()) == null) {
            return false;
        }
        Iterator<SignerCandidate> it = b(response, issuer).iterator();
        while (it.hasNext()) {
            if (l(it.next(), producedAt, tBSResponseData, signature, nVarA)) {
                return true;
            }
        }
        px.b.y5(this.remoteLogger, "OCSP response signature could not be verified with issuer or any included cert", null, px.c.a(this), 2, null);
        return false;
    }

    private final boolean h(SignerCandidate candidate) {
        if (candidate.getIsIssuer()) {
            return true;
        }
        try {
            candidate.getCert().verify(candidate.getIssuerPublicKey());
            return true;
        } catch (Exception e15) {
            this.remoteLogger.T6("OCSP delegate signer cert not issued by CA: " + e15.getMessage(), e15, px.c.a(this));
            return false;
        }
    }

    private final boolean i(SingleResp singleResp) {
        Date thisUpdate = singleResp.getThisUpdate();
        if (thisUpdate != null) {
            long time = thisUpdate.getTime();
            long jA = this.currentTimeProvider.a();
            if (time > jA + 300000) {
                return false;
            }
            Date nextUpdate = singleResp.getNextUpdate();
            Long lValueOf = nextUpdate != null ? Long.valueOf(nextUpdate.getTime()) : null;
            if (lValueOf != null) {
                return lValueOf.longValue() >= jA - 300000;
            }
            if (time >= jA - 86400000) {
                return true;
            }
        }
        return false;
    }

    private final boolean j(X509Certificate cert, Date at4) {
        try {
            cert.checkValidity(at4);
            return true;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            this.remoteLogger.T6("OCSP signer cert not valid at producedAt: " + e16.getMessage(), e16, px.c.a(this));
            return false;
        }
    }

    private final String k(X509Certificate x509Certificate) {
        return "serial=" + x509Certificate.getSerialNumber() + ", dn=" + x509Certificate.getSubjectDN().getName();
    }

    private final boolean l(SignerCandidate candidate, Date producedAt, byte[] message, byte[] signature, ry.n algorithm) {
        if (!j(candidate.getCert(), producedAt)) {
            return false;
        }
        if ((candidate.getIsIssuer() || e(candidate.getCert())) && h(candidate)) {
            return this.signatureVerifier.a(message, signature, candidate.getCert().getPublicKey(), algorithm);
        }
        return false;
    }

    @Override // pl.gov.coi.common.network.k0
    public SingleResp a(OCSPResp response, X509Certificate cert, X509Certificate issuer) {
        try {
            if (response.getStatus() != 0) {
                return null;
            }
            Object responseObject = response.getResponseObject();
            BasicOCSPResp basicOCSPResp = responseObject instanceof BasicOCSPResp ? (BasicOCSPResp) responseObject : null;
            if (basicOCSPResp == null) {
                return null;
            }
            if (!g(basicOCSPResp, issuer)) {
                this.remoteLogger.F8("OCSP response signature invalid for cert: " + k(cert), px.d.a.NETWORK);
                return null;
            }
            if (f(basicOCSPResp)) {
                return d(basicOCSPResp, cert, issuer);
            }
            this.remoteLogger.F8("OCSP response producedAt out of window for cert: " + k(cert), px.d.a.NETWORK);
            return null;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            this.remoteLogger.T6("OCSP response verification error for cert: " + k(cert) + ": " + e16.getMessage(), e16, px.c.a(this));
            return null;
        }
    }
}
