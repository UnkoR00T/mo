package tn;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import sn.h;
import sn.l;
import sn.m;
import sn.n;
import un.o;

/* JADX INFO: loaded from: classes4.dex */
public class a extends o implements m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set<xn.a> f190987k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ECPublicKey f190988j;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(xn.a.f219830d);
        linkedHashSet.add(xn.a.f219833g);
        linkedHashSet.add(xn.a.f219834h);
        f190987k = Collections.unmodifiableSet(linkedHashSet);
    }

    public a(ECPublicKey eCPublicKey) {
        this(eCPublicKey, null);
    }

    private KeyPair k(ECParameterSpec eCParameterSpec) throws h {
        Provider providerE = e().e();
        try {
            KeyPairGenerator keyPairGenerator = providerE != null ? KeyPairGenerator.getInstance("EC", providerE) : KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(eCParameterSpec);
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e15) {
            e = e15;
            throw new h("Couldn't generate ephemeral EC key pair: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e16) {
            e = e16;
            throw new h("Couldn't generate ephemeral EC key pair: " + e.getMessage(), e);
        }
    }

    @Override // sn.m
    public l c(n nVar, byte[] bArr, byte[] bArr2) throws h {
        KeyPair keyPairK = k(this.f190988j.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairK.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairK.getPrivate();
        n nVarC = new n.a(nVar).e(new xn.b.a(i(), eCPublicKey).a()).c();
        SecretKey secretKeyB = un.n.b(this.f190988j, eCPrivateKey, e().e());
        if (Arrays.equals(un.a.b(nVar), bArr2)) {
            bArr2 = un.a.b(nVarC);
        }
        return g(nVarC, secretKeyB, bArr, bArr2);
    }

    @Override // un.o
    public Set<xn.a> j() {
        return f190987k;
    }

    public a(ECPublicKey eCPublicKey, SecretKey secretKey) {
        super(xn.a.a(eCPublicKey.getParams()), secretKey);
        this.f190988j = eCPublicKey;
    }
}
