package org.bouncycastle.est;

import java.util.Collection;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.est.AttrOrOID;
import org.bouncycastle.asn1.est.CsrAttrs;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes5.dex */
public class CSRAttributesResponse implements Encodable {
    private final CsrAttrs csrAttrs;
    private final HashMap<ASN1ObjectIdentifier, AttrOrOID> index;

    public CSRAttributesResponse(CsrAttrs csrAttrs) {
        HashMap<ASN1ObjectIdentifier, AttrOrOID> map;
        ASN1ObjectIdentifier attrType;
        this.csrAttrs = csrAttrs;
        this.index = new HashMap<>(csrAttrs.size());
        AttrOrOID[] attrOrOIDs = csrAttrs.getAttrOrOIDs();
        for (int i15 = 0; i15 != attrOrOIDs.length; i15++) {
            AttrOrOID attrOrOID = attrOrOIDs[i15];
            if (attrOrOID.isOid()) {
                map = this.index;
                attrType = attrOrOID.getOid();
            } else {
                map = this.index;
                attrType = attrOrOID.getAttribute().getAttrType();
            }
            map.put(attrType, attrOrOID);
        }
    }

    private static CsrAttrs parseBytes(byte[] bArr) throws ESTException {
        try {
            return CsrAttrs.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (Exception e15) {
            throw new ESTException("malformed data: " + e15.getMessage(), e15);
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return this.csrAttrs.getEncoded();
    }

    public Collection<ASN1ObjectIdentifier> getRequirements() {
        return this.index.keySet();
    }

    public boolean hasRequirement(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.index.containsKey(aSN1ObjectIdentifier);
    }

    public boolean isAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (this.index.containsKey(aSN1ObjectIdentifier)) {
            return !this.index.get(aSN1ObjectIdentifier).isOid();
        }
        return false;
    }

    public boolean isEmpty() {
        return this.csrAttrs.size() == 0;
    }

    public CSRAttributesResponse(byte[] bArr) {
        this(parseBytes(bArr));
    }
}
