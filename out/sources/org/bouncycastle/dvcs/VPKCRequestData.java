package org.bouncycastle.dvcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.dvcs.Data;
import org.bouncycastle.asn1.dvcs.TargetEtcChain;

/* JADX INFO: loaded from: classes5.dex */
public class VPKCRequestData extends DVCSRequestData {
    private List chains;

    VPKCRequestData(Data data) throws DVCSConstructionException {
        super(data);
        TargetEtcChain[] certs = data.getCerts();
        if (certs == null) {
            throw new DVCSConstructionException("DVCSRequest.data.certs should be specified for VPKC service");
        }
        this.chains = new ArrayList(certs.length);
        for (int i15 = 0; i15 != certs.length; i15++) {
            this.chains.add(new TargetChain(certs[i15]));
        }
    }

    public List getCerts() {
        return Collections.unmodifiableList(this.chains);
    }
}
