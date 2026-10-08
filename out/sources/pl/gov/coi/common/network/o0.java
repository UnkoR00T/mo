package pl.gov.coi.common.network;

import java.security.cert.CertificateException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0011\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0014*\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u001d\u0010\u001e\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$¨\u0006%"}, d2 = {"Lpl/gov/coi/common/network/o0;", "Lz00/g;", "Lpl/gov/coi/common/network/r;", "httpClientConfig", "Lpl/gov/coi/common/network/m0;", "ocspRetriever", "Lpl/gov/coi/common/network/d;", "crlRetriever", "Lpx/d;", "remoteLogger", "<init>", "(Lpl/gov/coi/common/network/r;Lpl/gov/coi/common/network/m0;Lpl/gov/coi/common/network/d;Lpx/d;)V", "", "Ljava/security/cert/X509Certificate;", "chain", "anchorCert", "Loq/i0;", "c", "(Ljava/util/List;Ljava/security/cert/X509Certificate;Ltq/e;)Ljava/lang/Object;", "cert", "", "e", "(Ljava/security/cert/X509Certificate;)Ljava/lang/String;", "d", "Ljava/security/cert/X509CRL;", "crl", "", "f", "(Ljava/security/cert/X509CRL;Ljava/security/cert/X509Certificate;)Z", "g", "a", "(Ljava/util/List;)V", "Lpl/gov/coi/common/network/r;", "b", "Lpl/gov/coi/common/network/m0;", "Lpl/gov/coi/common/network/d;", "Lpx/d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 implements z00.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r httpClientConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m0 ocspRetriever;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d crlRetriever;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158149e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<X509Certificate> f158151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ X509Certificate f158152h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends X509Certificate> list, X509Certificate x509Certificate, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f158151g = list;
            this.f158152h = x509Certificate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158149e;
            if (i15 == 0) {
                oq.u.b(obj);
                o0 o0Var = o0.this;
                List<X509Certificate> list = this.f158151g;
                X509Certificate x509Certificate = this.f158152h;
                this.f158149e = 1;
                if (o0Var.c(list, x509Certificate, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return o0.this.new a(this.f158151g, this.f158152h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158157h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158158j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158159k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158160l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f158161m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158163p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158161m = obj;
            this.f158163p |= PKIFailureInfo.systemUnavail;
            return o0.this.c(null, null, this);
        }
    }

    public o0(r rVar, m0 m0Var, d dVar, px.d dVar2) {
        this.httpClientConfig = rVar;
        this.ocspRetriever = m0Var;
        this.crlRetriever = dVar;
        this.remoteLogger = dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:27:0x0105  */
    /* JADX WARN: Code duplicated, block: B:30:0x0125  */
    /* JADX WARN: Code duplicated, block: B:33:0x0131  */
    /* JADX WARN: Code duplicated, block: B:35:0x0135  */
    /* JADX WARN: Code duplicated, block: B:37:0x0147  */
    /* JADX WARN: Code duplicated, block: B:38:0x014f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0186  */
    /* JADX WARN: Code duplicated, block: B:46:0x0199  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x021d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0197 -> B:67:0x0262). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x019f -> B:67:0x0262). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01c9 -> B:67:0x0262). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x021d -> B:55:0x0220). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List<? extends java.security.cert.X509Certificate> r13, java.security.cert.X509Certificate r14, tq.e<? super oq.i0> r15) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.common.network.o0.c(java.util.List, java.security.cert.X509Certificate, tq.e):java.lang.Object");
    }

    private final String d(X509Certificate cert) {
        String string;
        GeneralNames generalNames;
        GeneralName[] names;
        try {
            byte[] extensionValue = cert.getExtensionValue(Extension.cRLDistributionPoints.getId());
            if (extensionValue == null) {
                return null;
            }
            DistributionPoint[] distributionPoints = CRLDistPoint.getInstance(ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(extensionValue).getOctets())).getDistributionPoints();
            int length = distributionPoints.length;
            for (int i15 = 0; i15 < length; i15++) {
                DistributionPoint distributionPoint = distributionPoints[i15];
                DistributionPointName distributionPoint2 = distributionPoint != null ? distributionPoint.getDistributionPoint() : null;
                if (distributionPoint2 != null && distributionPoint2.getType() == 0 && (generalNames = GeneralNames.getInstance(distributionPoint2.getName())) != null && (names = generalNames.getNames()) != null) {
                    int length2 = names.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length2) {
                            string = null;
                            break;
                        }
                        GeneralName generalName = names[i16];
                        string = (generalName == null || generalName.getTagNo() != 6) ? null : generalName.getName().toString();
                        if (string != null) {
                            break;
                        }
                        i16++;
                    }
                } else {
                    string = null;
                    break;
                }
                if (string != null) {
                    return string;
                }
            }
            return null;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            this.remoteLogger.T6("CRL URL parse error for cert: " + g(cert) + ": " + e16.getMessage(), e16, px.c.a(this));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    private final String e(X509Certificate cert) {
        String string;
        try {
            byte[] extensionValue = cert.getExtensionValue(Extension.authorityInfoAccess.getId());
            if (extensionValue == null) {
                return null;
            }
            for (AccessDescription accessDescription : AuthorityInformationAccess.getInstance(ASN1Sequence.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets())).getAccessDescriptions()) {
                if (fr.t.c(accessDescription.getAccessMethod(), AccessDescription.id_ad_ocsp)) {
                    ASN1Encodable name = accessDescription.getAccessLocation().getName();
                    DERIA5String dERIA5String = name instanceof DERIA5String ? (DERIA5String) name : null;
                    if (dERIA5String != null) {
                        string = dERIA5String.getString();
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
                if (string != null) {
                    return string;
                }
            }
            return null;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            this.remoteLogger.T6("OCSP URL parse error for cert: " + g(cert) + ": " + e16.getMessage(), e16, px.c.a(this));
            return null;
        }
    }

    private final boolean f(X509CRL crl, X509Certificate cert) {
        try {
            boolean zIsRevoked = crl.isRevoked(cert);
            if (!zIsRevoked) {
                return zIsRevoked;
            }
            this.remoteLogger.F8("CRL check, cert revoked: serial=" + cert.getSerialNumber() + ", dn=" + cert.getSubjectDN().getName(), px.d.a.NETWORK);
            return zIsRevoked;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            this.remoteLogger.T6("CRL processing error for cert: " + g(cert) + ": " + e16.getMessage(), e16, px.c.a(this));
            return false;
        }
    }

    private final String g(X509Certificate x509Certificate) {
        return "serial=" + x509Certificate.getSerialNumber() + ", dn=" + x509Certificate.getSubjectDN().getName();
    }

    @Override // z00.g
    public void a(List<? extends X509Certificate> chain) throws CertificateException {
        if ((this.httpClientConfig.getOcspRevocationCheckEnabled() || this.httpClientConfig.getCrlRevocationCheckEnabled()) && chain.size() >= 2) {
            X509Certificate x509Certificate = (X509Certificate) pq.v.x0(chain);
            List listG0 = pq.v.g0(chain, 1);
            px.f.f163100a.b("Certificate revocation started for: " + ((X509Certificate) pq.v.l0(listG0)).getSubjectDN().getName(), px.c.a(this));
            try {
                ju.j.b(null, new a(listG0, x509Certificate, null), 1, null);
            } catch (CancellationException e15) {
                this.remoteLogger.F8("Certificate revocation check cancelled for: " + ((X509Certificate) pq.v.l0(listG0)).getSubjectDN().getName(), px.d.a.NETWORK);
                throw new CertificateException("Certificate revocation check cancelled: " + e15.getMessage(), e15);
            } catch (Exception e16) {
                this.remoteLogger.T6("Certificate revocation check failed: " + e16.getMessage(), e16, px.c.a(this));
                throw new CertificateException("Certificate revocation check failed: " + e16.getMessage(), e16);
            }
        }
    }
}
