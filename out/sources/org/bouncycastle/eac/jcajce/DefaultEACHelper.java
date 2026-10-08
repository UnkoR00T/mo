package org.bouncycastle.eac.jcajce;

import java.security.KeyFactory;

/* JADX INFO: loaded from: classes5.dex */
class DefaultEACHelper implements EACHelper {
    DefaultEACHelper() {
    }

    @Override // org.bouncycastle.eac.jcajce.EACHelper
    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str);
    }
}
