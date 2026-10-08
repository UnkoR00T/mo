package org.bouncycastle.asn1.x509;

import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public class GeneralNamesBuilder {
    private Vector names = new Vector();

    public GeneralNamesBuilder addName(GeneralName generalName) {
        this.names.addElement(generalName);
        return this;
    }

    public GeneralNamesBuilder addNames(GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i15 = 0; i15 != names.length; i15++) {
            this.names.addElement(names[i15]);
        }
        return this;
    }

    public GeneralNames build() {
        int size = this.names.size();
        GeneralName[] generalNameArr = new GeneralName[size];
        for (int i15 = 0; i15 != size; i15++) {
            generalNameArr[i15] = (GeneralName) this.names.elementAt(i15);
        }
        return new GeneralNames(generalNameArr);
    }
}
