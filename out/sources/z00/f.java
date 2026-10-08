package z00;

import fr.t;
import fu.r;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.ct.LogStore;
import org.conscrypt.ct.Policy;
import org.conscrypt.ct.PolicyCompliance;
import org.conscrypt.ct.Verifier;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lz00/f;", "Lz00/e;", "Lorg/conscrypt/ct/LogStore;", "logStore", "Lorg/conscrypt/ct/Policy;", "policy", "Lpx/d;", "remoteLogger", "", "enabled", "", "", "whitelistedHostnames", "<init>", "(Lorg/conscrypt/ct/LogStore;Lorg/conscrypt/ct/Policy;Lpx/d;ZLjava/util/Set;)V", "Ljava/security/cert/X509Certificate;", "leaf", "b", "(Ljava/security/cert/X509Certificate;)Z", "dnsName", "c", "(Ljava/lang/String;)Z", "", "chain", "", "tlsData", "ocspData", "Loq/i0;", "a", "(Ljava/util/List;[B[B)V", "Lorg/conscrypt/ct/Policy;", "Lpx/d;", "Z", "d", "Ljava/util/Set;", "Lorg/conscrypt/ct/Verifier;", "e", "Lorg/conscrypt/ct/Verifier;", "verifier", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Policy policy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<String> whitelistedHostnames;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Verifier verifier;

    public f(LogStore logStore, Policy policy, px.d dVar, boolean z15, Set<String> set) {
        this.policy = policy;
        this.remoteLogger = dVar;
        this.enabled = z15;
        this.whitelistedHostnames = set;
        this.verifier = new Verifier(logStore);
    }

    private final boolean b(X509Certificate leaf) throws CertificateParsingException {
        Collection collectionN;
        Collection<List<?>> subjectAlternativeNames = leaf.getSubjectAlternativeNames();
        if (subjectAlternativeNames != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : subjectAlternativeNames) {
                List list = (List) obj;
                if (list.size() >= 2 && t.c(list.get(0), 2)) {
                    arrayList.add(obj);
                }
            }
            collectionN = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj2 = ((List) it.next()).get(1);
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null) {
                    collectionN.add(str);
                }
            }
        } else {
            collectionN = v.n();
        }
        Collection collection = collectionN;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it4 = collection.iterator();
        while (it4.hasNext()) {
            if (c((String) it4.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(String dnsName) {
        Set<String> set = this.whitelistedHostnames;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str : set) {
            if (r.V(str, "*.", false, 2, null) ? r.E(dnsName, r.M0(str, "*"), true) : r.G(dnsName, str, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // z00.e
    public void a(List<? extends X509Certificate> chain, byte[] tlsData, byte[] ocspData) throws CertificateException {
        String name;
        if (!this.enabled) {
            this.remoteLogger.u6("CT is disabled globally, skipping check", px.c.a(this));
            return;
        }
        if (chain.isEmpty()) {
            return;
        }
        if (b(chain.get(0))) {
            px.d dVar = this.remoteLogger;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("CT check skipped: cert SANs match whitelist for ");
            X500Principal subjectX500Principal = chain.get(0).getSubjectX500Principal();
            sb5.append(subjectX500Principal != null ? subjectX500Principal.getName() : null);
            dVar.u6(sb5.toString(), px.c.a(this));
            return;
        }
        PolicyCompliance policyComplianceDoesResultConformToPolicy = this.policy.doesResultConformToPolicy(this.verifier.verifySignedCertificateTimestamps((List<X509Certificate>) chain, tlsData, ocspData), chain.get(0));
        if (policyComplianceDoesResultConformToPolicy != PolicyCompliance.COMPLY) {
            X500Principal subjectX500Principal2 = chain.get(0).getSubjectX500Principal();
            if (subjectX500Principal2 == null || (name = subjectX500Principal2.getName()) == null) {
                name = "unknown";
            }
            this.remoteLogger.u6("CT policy not satisfied: compliance=" + policyComplianceDoesResultConformToPolicy + " subject=" + name, px.c.a(this));
            throw new CertificateException("Certificate Transparency policy not satisfied: " + policyComplianceDoesResultConformToPolicy + " for " + name);
        }
    }
}
