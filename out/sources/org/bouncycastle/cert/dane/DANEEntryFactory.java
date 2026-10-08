package org.bouncycastle.cert.dane;

import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestCalculator;

/* JADX INFO: loaded from: classes5.dex */
public class DANEEntryFactory {
    private final DANEEntrySelectorFactory selectorFactory;

    public DANEEntryFactory(DigestCalculator digestCalculator) {
        this.selectorFactory = new DANEEntrySelectorFactory(digestCalculator);
    }

    public DANEEntry createEntry(String str, int i15, X509CertificateHolder x509CertificateHolder) throws DANEException {
        if (i15 >= 0 && i15 <= 3) {
            return new DANEEntry(this.selectorFactory.createSelector(str).getDomainName(), new byte[]{(byte) i15, 0, 0}, x509CertificateHolder);
        }
        throw new DANEException("unknown certificate usage: " + i15);
    }

    public DANEEntry createEntry(String str, X509CertificateHolder x509CertificateHolder) {
        return createEntry(str, 3, x509CertificateHolder);
    }
}
