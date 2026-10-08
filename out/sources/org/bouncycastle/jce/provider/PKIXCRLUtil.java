package org.bouncycastle.jce.provider;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;

/* JADX INFO: loaded from: classes5.dex */
abstract class PKIXCRLUtil {
    PKIXCRLUtil() {
    }

    static Set findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, Date date, List list, List list2) throws AnnotatedException {
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            findCRLs(hashSet, pKIXCRLStoreSelector, list2);
            findCRLs(hashSet, pKIXCRLStoreSelector, list);
            HashSet hashSet2 = new HashSet();
            for (X509CRL x509crl : hashSet) {
                Date nextUpdate = x509crl.getNextUpdate();
                if (nextUpdate == null || nextUpdate.after(date)) {
                    X509Certificate certificateChecking = pKIXCRLStoreSelector.getCertificateChecking();
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e15) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e15);
        }
    }

    private static void findCRLs(Set set, PKIXCRLStoreSelector pKIXCRLStoreSelector, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z15 = false;
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    set.addAll(((Store) obj).getMatches(pKIXCRLStoreSelector));
                    z15 = true;
                } catch (StoreException e15) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e15);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    set.addAll(PKIXCRLStoreSelector.getCRLs(pKIXCRLStoreSelector, (CertStore) obj));
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
