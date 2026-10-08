package org.bouncycastle.x509;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.util.StoreException;

/* JADX INFO: loaded from: classes5.dex */
abstract class PKIXCRLUtil {
    PKIXCRLUtil() {
    }

    static Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, PKIXParameters pKIXParameters) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, x509CRLStoreSelector, pKIXParameters.getCertStores());
            return hashSet;
        } catch (AnnotatedException e15) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e15);
        }
    }

    private static void findCRLs(Set set, X509CRLStoreSelector x509CRLStoreSelector, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z15 = false;
        for (Object obj : list) {
            if (obj instanceof X509Store) {
                try {
                    set.addAll(((X509Store) obj).getMatches(x509CRLStoreSelector));
                    z15 = true;
                } catch (StoreException e15) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e15);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    set.addAll(((CertStore) obj).getCRLs(x509CRLStoreSelector));
                    z15 = true;
                } catch (CertStoreException e16) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e16);
                    annotatedException2 = annotatedException;
                }
            }
        }
        if (!z15 && annotatedException2 != null) {
            throw annotatedException2;
        }
    }
}
