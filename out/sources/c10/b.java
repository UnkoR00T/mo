package c10;

import fr.t;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Set;
import oq.p;
import p071kotlin.Metadata;
import pq.e1;
import ry.n;
import sn.h;
import sn.q;
import sn.r;
import sn.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Lc10/b;", "Lsn/u;", "Ljava/security/PrivateKey;", "privateKey", "Lry/n;", "signatureAlgorithm", "<init>", "(Ljava/security/PrivateKey;Lry/n;)V", "Lsn/q;", "c", "(Lry/n;)Lsn/q;", "", "b", "()Ljava/util/Set;", "Lsn/r;", "header", "", "signingInput", "Lio/c;", "a", "(Lsn/r;[B)Lio/c;", "Ljava/security/PrivateKey;", "Lry/n;", "Lwn/a;", "Lwn/a;", "context", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PrivateKey privateKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n signatureAlgorithm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn.a context = new wn.a();

    public b(PrivateKey privateKey, n nVar) {
        this.privateKey = privateKey;
        this.signatureAlgorithm = nVar;
    }

    private final q c(n nVar) {
        if (t.c(nVar, n.a.C4514a.f176847d)) {
            return q.f182533k;
        }
        if (t.c(nVar, n.a.b.f176848d)) {
            return q.f182535m;
        }
        if (t.c(nVar, n.a.c.f176849d)) {
            return q.f182536n;
        }
        if (t.c(nVar, n.b.a.f176853d)) {
            return q.f182530g;
        }
        if (t.c(nVar, n.b.C4515b.f176854d)) {
            return q.f182531h;
        }
        if (t.c(nVar, n.b.c.f176855d)) {
            return q.f182532j;
        }
        throw new p();
    }

    @Override // sn.u
    public io.c a(r header, byte[] signingInput) throws h, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance(this.signatureAlgorithm.getAlgorithm());
        signature.initSign(this.privateKey);
        signature.update(signingInput);
        byte[] bArrSign = signature.sign();
        n nVar = this.signatureAlgorithm;
        if (nVar instanceof n.a) {
            bArrSign = un.p.a(bArrSign, 64);
        } else if (!(nVar instanceof n.b)) {
            throw new p();
        }
        return io.c.h(bArrSign);
    }

    @Override // sn.t
    public Set<q> b() {
        return e1.g(c(this.signatureAlgorithm));
    }
}
