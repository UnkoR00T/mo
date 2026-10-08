package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.PKRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes5.dex */
public class ETSIRecipientID implements Selector<ETSIRecipientInfo> {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final HashedId8 f149220id;

    public ETSIRecipientID(HashedId8 hashedId8) {
        this.f149220id = hashedId8;
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HashedId8 hashedId8 = this.f149220id;
            HashedId8 hashedId9 = ((ETSIRecipientID) obj).f149220id;
            if (hashedId8 != null) {
                return hashedId8.equals(hashedId9);
            }
            if (hashedId9 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        HashedId8 hashedId8 = this.f149220id;
        if (hashedId8 != null) {
            return hashedId8.hashCode();
        }
        return 0;
    }

    public ETSIRecipientID(byte[] bArr) {
        this(new HashedId8(bArr));
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(ETSIRecipientInfo eTSIRecipientInfo) {
        if (eTSIRecipientInfo.getRecipientInfo().getChoice() == 2) {
            return Arrays.areEqual(PKRecipientInfo.getInstance(eTSIRecipientInfo.getRecipientInfo().getRecipientInfo()).getRecipientId().getHashBytes(), this.f149220id.getHashBytes());
        }
        return false;
    }
}
