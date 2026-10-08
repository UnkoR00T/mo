package org.bouncycastle.cert.path;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.cert.X509CertificateHolder;

/* JADX INFO: loaded from: classes5.dex */
class CertPathUtils {
    CertPathUtils() {
    }

    static Set getCriticalExtensionsOIDs(X509CertificateHolder[] x509CertificateHolderArr) {
        HashSet hashSet = new HashSet();
        for (int i15 = 0; i15 != x509CertificateHolderArr.length; i15++) {
            hashSet.addAll(x509CertificateHolderArr[i15].getCriticalExtensionOIDs());
        }
        return hashSet;
    }
}
