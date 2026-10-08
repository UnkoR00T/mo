package pl.gov.coi.common.network;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.ct.LogStore;
import org.conscrypt.ct.PolicyCompliance;
import org.conscrypt.ct.VerificationResult;
import org.conscrypt.ct.VerifiedSCT;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0011*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006!"}, d2 = {"Lpl/gov/coi/common/network/h;", "Lz00/a;", "Lpx/d;", "remoteLogger", "Liy/a;", "base64Coder", "<init>", "(Lpx/d;Liy/a;)V", "Lorg/conscrypt/ct/VerificationResult;", "", "a", "(Lorg/conscrypt/ct/VerificationResult;)Z", "b", "", "e", "(Lorg/conscrypt/ct/VerificationResult;)Ljava/lang/String;", "d", "", "Lorg/conscrypt/ct/VerifiedSCT;", "c", "(Ljava/util/List;)Ljava/util/List;", "result", "Ljava/security/cert/X509Certificate;", "leaf", "Lorg/conscrypt/ct/PolicyCompliance;", "doesResultConformToPolicy", "(Lorg/conscrypt/ct/VerificationResult;Ljava/security/cert/X509Certificate;)Lorg/conscrypt/ct/PolicyCompliance;", "Lorg/conscrypt/ct/LogStore;", "store", "isLogStoreCompliant", "(Lorg/conscrypt/ct/LogStore;)Z", "Lpx/d;", "Liy/a;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements z00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    public h(px.d dVar, iy.a aVar) {
        this.remoteLogger = dVar;
        this.base64Coder = aVar;
    }

    private final boolean a(VerificationResult verificationResult) {
        List<VerifiedSCT> validSCTs = verificationResult != null ? verificationResult.getValidSCTs() : null;
        if (validSCTs == null) {
            validSCTs = pq.v.n();
        }
        if (!validSCTs.isEmpty()) {
            return false;
        }
        List<VerifiedSCT> invalidSCTs = verificationResult != null ? verificationResult.getInvalidSCTs() : null;
        if (invalidSCTs == null) {
            invalidSCTs = pq.v.n();
        }
        List<VerifiedSCT> list = invalidSCTs;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((VerifiedSCT) it.next()).getStatus() != VerifiedSCT.Status.UNKNOWN_LOG) {
                return false;
            }
        }
        return true;
    }

    private final boolean b(VerificationResult verificationResult) {
        List<VerifiedSCT> validSCTs = verificationResult != null ? verificationResult.getValidSCTs() : null;
        if (validSCTs == null) {
            validSCTs = pq.v.n();
        }
        if (validSCTs.isEmpty()) {
            return false;
        }
        List<VerifiedSCT> invalidSCTs = verificationResult != null ? verificationResult.getInvalidSCTs() : null;
        if (invalidSCTs == null) {
            invalidSCTs = pq.v.n();
        }
        return invalidSCTs.isEmpty();
    }

    private final List<String> c(List<VerifiedSCT> list) {
        if (list == null) {
            list = pq.v.n();
        }
        List<VerifiedSCT> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        for (VerifiedSCT verifiedSCT : list2) {
            arrayList.add("\n    logId: " + iy.a.e(this.base64Coder, verifiedSCT.getSct().getLogID(), null, 2, null) + ", status: " + verifiedSCT.getStatus().name());
        }
        return arrayList;
    }

    private final String d(VerificationResult verificationResult) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("invalid SCTs:");
        sb5.append(c(verificationResult != null ? verificationResult.getInvalidSCTs() : null));
        return sb5.toString();
    }

    private final String e(VerificationResult verificationResult) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("valid SCTs:");
        sb5.append(c(verificationResult != null ? verificationResult.getValidSCTs() : null));
        return sb5.toString();
    }

    @Override // org.conscrypt.ct.Policy
    public PolicyCompliance doesResultConformToPolicy(VerificationResult result, X509Certificate leaf) {
        String name;
        X500Principal subjectX500Principal;
        if (leaf == null || (subjectX500Principal = leaf.getSubjectX500Principal()) == null || (name = subjectX500Principal.getName()) == null) {
            name = "unknown";
        }
        px.f fVar = px.f.f163100a;
        fVar.b("hostname: " + name, px.c.a(this));
        fVar.b("result, " + e(result), px.c.a(this));
        fVar.b("result, " + d(result), px.c.a(this));
        boolean zB = b(result);
        boolean zA = a(result);
        if (zA) {
            px.b.y5(this.remoteLogger, "Cache miss: no SCTs found in the log list for hostname: " + name, null, px.c.a(this), 2, null);
        }
        boolean z15 = zB || zA;
        if (!z15) {
            this.remoteLogger.u6("Hostname doesn't conform to CT policy: " + name + '\n' + e(result) + '\n' + d(result), px.c.a(this));
        }
        return z15 ? PolicyCompliance.COMPLY : PolicyCompliance.NOT_ENOUGH_SCTS;
    }

    @Override // org.conscrypt.ct.Policy
    public boolean isLogStoreCompliant(LogStore store) {
        return true;
    }
}
