package fk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class m {
    public static l a(String str) throws GeneralSecurityException {
        l lVar = x.i().get(str);
        if (lVar != null) {
            return lVar;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
