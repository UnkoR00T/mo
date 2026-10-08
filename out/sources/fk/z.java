package fk;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import sk.c0;
import sk.d0;
import sk.i0;

/* JADX INFO: loaded from: classes4.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f64408a = Charset.forName("UTF-8");

    public static d0.c a(c0.c cVar) {
        return d0.c.b0().J(cVar.a0().b0()).I(cVar.d0()).H(cVar.c0()).G(cVar.b0()).build();
    }

    public static d0 b(c0 c0Var) {
        d0.b bVarH = d0.b0().H(c0Var.d0());
        Iterator<c0.c> it = c0Var.c0().iterator();
        while (it.hasNext()) {
            bVarH.G(a(it.next()));
        }
        return bVarH.build();
    }

    public static void c(c0.c cVar) throws GeneralSecurityException {
        if (!cVar.e0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.b0())));
        }
        if (cVar.c0() == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.b0())));
        }
        if (cVar.d0() == sk.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.b0())));
        }
    }

    public static void d(c0 c0Var) throws GeneralSecurityException {
        int iD0 = c0Var.d0();
        int i15 = 0;
        boolean z15 = false;
        boolean z16 = true;
        for (c0.c cVar : c0Var.c0()) {
            if (cVar.d0() == sk.z.ENABLED) {
                c(cVar);
                if (cVar.b0() == iD0) {
                    if (z15) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z15 = true;
                }
                if (cVar.a0().a0() != sk.y.c.ASYMMETRIC_PUBLIC) {
                    z16 = false;
                }
                i15++;
            }
        }
        if (i15 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z15 && !z16) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
