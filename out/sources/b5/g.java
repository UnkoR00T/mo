package b5;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u000b\u001a'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"", "i1", "i2", "i3", "e", "(III)I", "mask", "f", "(I)I", "g", "h", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i15, int i16, int i17) {
        return i15 | (i16 << 8) | (i17 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i15) {
        return i15 & GF2Field.MASK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i15) {
        return (i15 >> 8) & GF2Field.MASK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i15) {
        return (i15 >> 16) & GF2Field.MASK;
    }
}
