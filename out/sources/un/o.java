package un;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set<sn.k> f199298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set<sn.f> f199299i = l.f199293a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xn.a f199300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f199301g;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(sn.k.f182466n);
        linkedHashSet.add(sn.k.f182467p);
        linkedHashSet.add(sn.k.f182468q);
        linkedHashSet.add(sn.k.f182469r);
        f199298h = Collections.unmodifiableSet(linkedHashSet);
    }

    protected o(xn.a aVar, SecretKey secretKey) throws sn.h {
        super(f199298h, l.f199293a, secretKey);
        xn.a aVar2 = aVar != null ? aVar : new xn.a("unknown");
        if (!j().contains(aVar)) {
            throw new sn.h(f.b(aVar2, j()));
        }
        this.f199300f = aVar;
        this.f199301g = new k(XMSSKeyParameters.SHA_256);
    }

    protected sn.l g(sn.n nVar, SecretKey secretKey, byte[] bArr, byte[] bArr2) throws sn.h {
        io.c cVarH;
        SecretKey secretKey2;
        n.a aVarC = n.c(r.a(nVar));
        sn.f fVarB = nVar.B();
        h().i().c(e().f());
        SecretKey secretKeyA = n.a(nVar, secretKey, h());
        if (aVarC.equals(n.a.DIRECT)) {
            if (f()) {
                throw new sn.h("The provided CEK is not supported");
            }
            secretKey2 = secretKeyA;
            cVarH = null;
        } else {
            if (!aVarC.equals(n.a.KW)) {
                throw new sn.h("Unexpected JWE ECDH algorithm mode: " + aVarC);
            }
            SecretKey secretKeyD = d(fVarB);
            cVarH = io.c.h(d.a(secretKeyD, secretKeyA, e().e()));
            secretKey2 = secretKeyD;
        }
        return l.b(nVar, bArr, bArr2, secretKey2, cVarH, e());
    }

    protected k h() {
        return this.f199301g;
    }

    public xn.a i() {
        return this.f199300f;
    }

    public abstract Set<xn.a> j();
}
