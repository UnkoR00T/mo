package org.bouncycastle.cert.path;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
class CertPathValidationResultBuilder {
    private final CertPathValidationContext context;
    private final List<Integer> certIndexes = new ArrayList();
    private final List<Integer> ruleIndexes = new ArrayList();
    private final List<CertPathValidationException> exceptions = new ArrayList();

    CertPathValidationResultBuilder(CertPathValidationContext certPathValidationContext) {
        this.context = certPathValidationContext;
    }

    private int[] toInts(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i15 = 0; i15 != size; i15++) {
            iArr[i15] = list.get(i15).intValue();
        }
        return iArr;
    }

    public void addException(int i15, int i16, CertPathValidationException certPathValidationException) {
        this.certIndexes.add(Integers.valueOf(i15));
        this.ruleIndexes.add(Integers.valueOf(i16));
        this.exceptions.add(certPathValidationException);
    }

    public CertPathValidationResult build() {
        if (this.exceptions.isEmpty()) {
            return new CertPathValidationResult(this.context);
        }
        CertPathValidationContext certPathValidationContext = this.context;
        int[] ints = toInts(this.certIndexes);
        int[] ints2 = toInts(this.ruleIndexes);
        List<CertPathValidationException> list = this.exceptions;
        return new CertPathValidationResult(certPathValidationContext, ints, ints2, (CertPathValidationException[]) list.toArray(new CertPathValidationException[list.size()]));
    }
}
