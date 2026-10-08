package tn;

import io.c;
import java.security.interfaces.RSAPublicKey;
import java.util.Objects;
import javax.crypto.SecretKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import sn.h;
import sn.k;
import sn.l;
import sn.m;
import sn.n;
import un.f;
import un.r;
import un.t;
import un.u;
import un.v;
import un.w;

/* JADX INFO: loaded from: classes4.dex */
public class b extends u implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RSAPublicKey f190989h;

    public b(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // sn.m
    public l c(n nVar, byte[] bArr, byte[] bArr2) throws h {
        c cVarH;
        k kVarA = r.a(nVar);
        SecretKey secretKeyD = d(nVar.B());
        if (kVarA.equals(k.f182457d)) {
            cVarH = c.h(t.a(this.f190989h, secretKeyD, e().e()));
        } else if (kVarA.equals(k.f182458e)) {
            cVarH = c.h(v.a(this.f190989h, secretKeyD, e().e()));
        } else if (kVarA.equals(k.f182459f)) {
            cVarH = c.h(w.a(this.f190989h, secretKeyD, 256, e().e()));
        } else if (kVarA.equals(k.f182460g)) {
            cVarH = c.h(w.a(this.f190989h, secretKeyD, MLKEMEngine.KyberPolyBytes, e().e()));
        } else {
            if (!kVarA.equals(k.f182461h)) {
                throw new h(f.d(kVarA, u.f199306f));
            }
            cVarH = c.h(w.a(this.f190989h, secretKeyD, 512, e().e()));
        }
        return un.l.b(nVar, bArr, bArr2, secretKeyD, cVarH, e());
    }

    public b(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        super(secretKey);
        Objects.requireNonNull(rSAPublicKey);
        this.f190989h = rSAPublicKey;
    }
}
