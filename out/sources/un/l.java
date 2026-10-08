package un;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<sn.f> f199293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Set<sn.f>> f199294b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        sn.f fVar = sn.f.f182434e;
        linkedHashSet.add(fVar);
        sn.f fVar2 = sn.f.f182435f;
        linkedHashSet.add(fVar2);
        sn.f fVar3 = sn.f.f182436g;
        linkedHashSet.add(fVar3);
        sn.f fVar4 = sn.f.f182439k;
        linkedHashSet.add(fVar4);
        sn.f fVar5 = sn.f.f182440l;
        linkedHashSet.add(fVar5);
        sn.f fVar6 = sn.f.f182441m;
        linkedHashSet.add(fVar6);
        sn.f fVar7 = sn.f.f182437h;
        linkedHashSet.add(fVar7);
        sn.f fVar8 = sn.f.f182438j;
        linkedHashSet.add(fVar8);
        sn.f fVar9 = sn.f.f182442n;
        linkedHashSet.add(fVar9);
        f199293a = Collections.unmodifiableSet(linkedHashSet);
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(fVar4);
        hashSet2.add(fVar5);
        hashSet3.add(fVar6);
        hashSet3.add(fVar);
        hashSet3.add(fVar7);
        hashSet3.add(fVar9);
        hashSet4.add(fVar2);
        hashSet5.add(fVar3);
        hashSet5.add(fVar8);
        map.put(128, Collections.unmodifiableSet(hashSet));
        map.put(192, Collections.unmodifiableSet(hashSet2));
        map.put(256, Collections.unmodifiableSet(hashSet3));
        map.put(Integer.valueOf(MLKEMEngine.KyberPolyBytes), Collections.unmodifiableSet(hashSet4));
        map.put(512, Collections.unmodifiableSet(hashSet5));
        f199294b = Collections.unmodifiableMap(map);
    }

    private static void a(SecretKey secretKey, sn.f fVar) throws sn.x {
        try {
            int iD = io.e.d(secretKey.getEncoded());
            if (iD == 0 || fVar.c() == iD) {
                return;
            }
            throw new sn.x("The Content Encryption Key (CEK) length for " + fVar + " must be " + fVar.c() + " bits");
        } catch (io.h e15) {
            throw new sn.x("The Content Encryption Key (CEK) is too long: " + e15.getMessage());
        }
    }

    public static sn.l b(sn.n nVar, byte[] bArr, byte[] bArr2, SecretKey secretKey, io.c cVar, wn.b bVar) throws sn.h {
        byte[] bArrE;
        g gVarC;
        if (bArr2 == null) {
            return b(nVar, bArr, a.b(nVar), secretKey, cVar, bVar);
        }
        a(secretKey, nVar.B());
        byte[] bArrA = m.a(nVar, bArr);
        if (!nVar.B().equals(sn.f.f182434e) && !nVar.B().equals(sn.f.f182435f) && !nVar.B().equals(sn.f.f182436g)) {
            if (nVar.B().equals(sn.f.f182439k) || nVar.B().equals(sn.f.f182440l) || nVar.B().equals(sn.f.f182441m)) {
                io.f fVar = new io.f(c.d(bVar.b()));
                gVarC = c.c(secretKey, fVar, bArrA, bArr2, bVar.d());
                bArrE = (byte[]) fVar.a();
            } else if (nVar.B().equals(sn.f.f182437h) || nVar.B().equals(sn.f.f182438j)) {
                byte[] bArrE2 = b.e(bVar.b());
                gVarC = b.d(nVar, secretKey, cVar, bArrE2, bArrA, bVar.d(), bVar.f());
                bArrE = bArrE2;
            } else {
                if (!nVar.B().equals(sn.f.f182442n)) {
                    throw new sn.h(f.c(nVar.B(), f199293a));
                }
                io.f fVar2 = new io.f(null);
                gVarC = x.a(secretKey, fVar2, bArrA, bArr2);
                bArrE = (byte[]) fVar2.a();
            }
            return new sn.l(nVar, cVar, io.c.h(bArrE), io.c.h(gVarC.b()), io.c.h(gVarC.a()));
        }
        bArrE = b.e(bVar.b());
        gVarC = b.c(secretKey, bArrE, bArrA, bArr2, bVar.d(), bVar.f());
        nVar = nVar;
        return new sn.l(nVar, cVar, io.c.h(bArrE), io.c.h(gVarC.b()), io.c.h(gVarC.a()));
    }

    public static SecretKey c(sn.f fVar, SecureRandom secureRandom) throws sn.h {
        Set<sn.f> set = f199293a;
        if (!set.contains(fVar)) {
            throw new sn.h(f.c(fVar, set));
        }
        byte[] bArr = new byte[io.e.a(fVar.c())];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
