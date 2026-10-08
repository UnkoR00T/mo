package org.conscrypt;

import java.security.spec.EncodedKeySpec;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class XdhKeySpec extends EncodedKeySpec {
    public XdhKeySpec(byte[] bArr) {
        super(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedKeySpec)) {
            return false;
        }
        EncodedKeySpec encodedKeySpec = (EncodedKeySpec) obj;
        return getFormat().equals(encodedKeySpec.getFormat()) && Arrays.equals(getEncoded(), encodedKeySpec.getEncoded());
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "raw";
    }

    public byte[] getKey() {
        return getEncoded();
    }

    public int hashCode() {
        return Objects.hash(getFormat(), Integer.valueOf(Arrays.hashCode(getEncoded())));
    }
}
