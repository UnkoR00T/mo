package pl.gov.coi.common.network;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.CertPinManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpl/gov/coi/common/network/a;", "Lorg/conscrypt/CertPinManager;", "Lpl/gov/coi/common/network/r;", "httpClientConfig", "Liy/a;", "base64Coder", "Liy/i0;", "certificateDecoder", "Lpl/gov/coi/common/network/b;", "certPinStore", "<init>", "(Lpl/gov/coi/common/network/r;Liy/a;Liy/i0;Lpl/gov/coi/common/network/b;)V", "", "hostname", "", "Ljava/security/cert/X509Certificate;", "chain", "", "a", "(Ljava/lang/String;Ljava/util/List;)Z", "", "Loq/i0;", "checkChainPinning", "(Ljava/lang/String;Ljava/util/List;)V", "Lpl/gov/coi/common/network/r;", "b", "Liy/a;", "c", "Liy/i0;", "d", "Lpl/gov/coi/common/network/b;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements CertPinManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r httpClientConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.i0 certificateDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b certPinStore;

    public a(r rVar, iy.a aVar, iy.i0 i0Var, b bVar) {
        this.httpClientConfig = rVar;
        this.base64Coder = aVar;
        this.certificateDecoder = i0Var;
        this.certPinStore = bVar;
    }

    private final boolean a(String hostname, List<? extends X509Certificate> chain) {
        px.f fVar = px.f.f163100a;
        fVar.b("Verify chain pinning for hostname: " + hostname, px.c.a(this));
        boolean z15 = true;
        if (!this.httpClientConfig.getSslEnabled()) {
            fVar.b("Verify hostname skipped", px.c.a(this));
            return true;
        }
        dx.i<dx.b, List<ry.a>> iVarC = this.certPinStore.c(hostname);
        if (iVarC instanceof dx.i.Left) {
            fVar.b("Trusted certificates download failure, block non-BE network traffic", px.c.a(this));
            return false;
        }
        if (!(iVarC instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVarC).b();
        fVar.b("domainCertificates match: " + list + '.', px.c.a(this));
        List<String> listA = this.certPinStore.a();
        DomainPins domainPinsB = this.certPinStore.b();
        String domain = domainPinsB.getDomain();
        fVar.b("Trusted domains: " + listA, px.c.a(this));
        fVar.b("Hostname is in trusted domain: " + listA.contains(hostname), px.c.a(this));
        fVar.b("Hostname is in server domain: " + fr.t.c(domain, hostname), px.c.a(this));
        if (fr.t.c(domain, hostname)) {
            List<? extends X509Certificate> list2 = chain;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            loop0: while (it.hasNext()) {
                String strA = fv.g.INSTANCE.a((X509Certificate) it.next());
                px.f.f163100a.b("Hostname pin: " + strA, px.c.a(this));
                for (String str : domainPinsB.b()) {
                    px.f.f163100a.b("Trusted BE pin: " + str, px.c.a(this));
                }
                List<String> listB = domainPinsB.b();
                if (!(listB instanceof Collection) || !listB.isEmpty()) {
                    Iterator<T> it4 = listB.iterator();
                    while (it4.hasNext()) {
                        if (!fu.r.t0((String) it4.next())) {
                            List<String> listB2 = domainPinsB.b();
                            if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
                                Iterator<T> it5 = listB2.iterator();
                                while (it5.hasNext()) {
                                    if (fr.t.c((String) it5.next(), strA)) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (listA.contains(hostname) && list.isEmpty()) {
            fVar.b("Failure. No matching domain cert for trusted domain.", px.c.a(this));
            return false;
        }
        if (list.isEmpty()) {
            fVar.b("Valid. CT only, no matching trusted domain for pinning.", px.c.a(this));
            return true;
        }
        ArrayList<X509Certificate> arrayList = new ArrayList();
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            dx.i<dx.b, X509Certificate> iVarC2 = iy.a.c(this.base64Coder, iy.c0.e(((ry.a) it6.next()).getData()), null, 2, null);
            if (!(iVarC2 instanceof dx.i.Left)) {
                if (!(iVarC2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                iVarC2 = this.certificateDecoder.decode((byte[]) ((dx.i.Right) iVarC2).b());
            }
            X509Certificate x509CertificateA = iVarC2.a();
            if (x509CertificateA != null) {
                arrayList.add(x509CertificateA);
            }
        }
        if (arrayList.isEmpty()) {
            z15 = false;
        } else {
            for (X509Certificate x509Certificate : arrayList) {
                List<? extends X509Certificate> list3 = chain;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (X509Certificate x509Certificate2 : list3) {
                        if (!x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey()) || !x509Certificate.getSerialNumber().equals(x509Certificate2.getSerialNumber())) {
                        }
                    }
                }
            }
            z15 = false;
        }
        px.f.f163100a.b("Verification valid: " + z15, px.c.a(this));
        return z15;
    }

    @Override // org.conscrypt.CertPinManager
    public void checkChainPinning(String hostname, List<X509Certificate> chain) throws CertificateException {
        if (hostname == null) {
            throw new CertificateException("Hostname is null");
        }
        if (chain == null) {
            throw new CertificateException("Chain is null");
        }
        if (a(hostname, chain)) {
            return;
        }
        throw new CertificateException("Cert pinning invalid chain for: " + hostname);
    }
}
