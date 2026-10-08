package p076m2;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, d2 = {"Lm2/o1;", "", "<init>", "()V", "", "j", "()[I", "", "value", "Loq/i0;", "i", "(I)V", "g", "()I", "default", "h", "(I)I", "f", "c", "e", "index", "d", "a", "b", "[I", "slots", "I", "tos", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int[] slots = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int tos;

    private final int[] j() {
        int[] iArr = this.slots;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        this.slots = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void a() {
        this.tos = 0;
    }

    public final int b(int value) {
        int[] iArr = this.slots;
        int iMin = Math.min(iArr.length, this.tos);
        for (int i15 = 0; i15 < iMin; i15++) {
            if (iArr[i15] == value) {
                return i15;
            }
        }
        return -1;
    }

    public final int c() {
        return this.slots[this.tos - 1];
    }

    public final int d(int index) {
        return this.slots[index];
    }

    public final int e() {
        return this.slots[this.tos - 2];
    }

    public final int f(int i15) {
        int i16 = this.tos - 1;
        return i16 >= 0 ? this.slots[i16] : i15;
    }

    public final int g() {
        int[] iArr = this.slots;
        int i15 = this.tos - 1;
        this.tos = i15;
        return iArr[i15];
    }

    public final int h(int i15) {
        int i16 = this.tos;
        if (i16 <= 0) {
            return i15;
        }
        int[] iArr = this.slots;
        int i17 = i16 - 1;
        this.tos = i17;
        return iArr[i17];
    }

    public final void i(int value) {
        int[] iArrJ = this.slots;
        if (this.tos >= iArrJ.length) {
            iArrJ = j();
        }
        int i15 = this.tos;
        this.tos = i15 + 1;
        iArrJ[i15] = value;
    }
}
