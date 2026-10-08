package fk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y f64407a = new y();

    private y() {
    }

    static y a() {
        return f64407a;
    }

    public static y b(y yVar) throws GeneralSecurityException {
        if (yVar != null) {
            return yVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
