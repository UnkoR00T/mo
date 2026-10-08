package org.bouncycastle.asn1.cmp;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;

/* JADX INFO: loaded from: classes3.dex */
public class OOBCert extends CMPCertificate {
    public OOBCert(int i15, ASN1Object aSN1Object) {
        super(i15, aSN1Object);
    }

    public static OOBCert getInstance(Object obj) {
        if (obj == null || (obj instanceof OOBCert)) {
            return (OOBCert) obj;
        }
        if (obj instanceof CMPCertificate) {
            try {
                return getInstance((Object) ((CMPCertificate) obj).getEncoded());
            } catch (IOException e15) {
                throw new IllegalArgumentException(e15.getMessage(), e15);
            }
        }
        if (obj instanceof byte[]) {
            try {
                obj = ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Invalid encoding in OOBCert");
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new OOBCert(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj, 128);
            return new OOBCert(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getExplicitBaseObject());
        }
        throw new IllegalArgumentException("Invalid object: " + obj.getClass().getName());
    }

    public OOBCert(AttributeCertificate attributeCertificate) {
        super(1, attributeCertificate);
    }

    public static OOBCert getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        if (aSN1TaggedObject == null) {
            return null;
        }
        if (z15) {
            return getInstance((Object) aSN1TaggedObject.getExplicitBaseObject());
        }
        throw new IllegalArgumentException("tag must be explicit");
    }

    public OOBCert(Certificate certificate) {
        super(certificate);
    }
}
