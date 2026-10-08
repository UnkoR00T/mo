package g4;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0019J-\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u000fJ\r\u0010$\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u0006."}, d2 = {"Lg4/v;", "", "", "initialCapacity", "<init>", "(I)V", "", "stack", "j", "([I)[I", "start", "end", "elSize", "Loq/i0;", "i", "(III)V", "e", "(III)I", "l", "(II)V", "a", "b", "", "(II)Z", "index", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "h", "(IIII)V", "x", "y", "size", "g", "f", "()I", "d", "()Z", "k", "()V", "[I", "I", "lastIndex", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] stack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lastIndex;

    public v(int i15) {
        this.stack = new int[i15];
    }

    private final boolean a(int a15, int b15) {
        int[] iArr = this.stack;
        int i15 = iArr[a15];
        int i16 = iArr[b15];
        return i15 < i16 || (i15 == i16 && iArr[a15 + 1] <= iArr[b15 + 1]);
    }

    private final int e(int start, int end, int elSize) {
        int i15 = start - elSize;
        while (start < end) {
            if (a(start, end)) {
                i15 += elSize;
                l(i15, start);
            }
            start += elSize;
        }
        int i16 = i15 + elSize;
        l(i16, end);
        return i16;
    }

    private final void i(int start, int end, int elSize) {
        if (start < end) {
            int iE = e(start, end, elSize);
            i(start, iE - elSize, elSize);
            i(iE + elSize, end, elSize);
        }
    }

    private final int[] j(int[] stack) {
        int[] iArrCopyOf = Arrays.copyOf(stack, stack.length * 2);
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    private final void l(int i15, int j15) {
        int[] iArr = this.stack;
        o0.i(iArr, i15, j15);
        o0.i(iArr, i15 + 1, j15 + 1);
        o0.i(iArr, i15 + 2, j15 + 2);
    }

    public final int b(int index) {
        return this.stack[index];
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final boolean d() {
        return this.lastIndex != 0;
    }

    public final int f() {
        int[] iArr = this.stack;
        int i15 = this.lastIndex - 1;
        this.lastIndex = i15;
        return iArr[i15];
    }

    public final void g(int x15, int y15, int size) {
        int i15 = this.lastIndex;
        int[] iArrJ = this.stack;
        int i16 = i15 + 3;
        if (i16 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i15] = x15 + size;
        iArrJ[i15 + 1] = y15 + size;
        iArrJ[i15 + 2] = size;
        this.lastIndex = i16;
    }

    public final void h(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i15 = this.lastIndex;
        int[] iArrJ = this.stack;
        int i16 = i15 + 4;
        if (i16 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i15] = oldStart;
        iArrJ[i15 + 1] = oldEnd;
        iArrJ[i15 + 2] = newStart;
        iArrJ[i15 + 3] = newEnd;
        this.lastIndex = i16;
    }

    public final void k() {
        int i15 = this.lastIndex;
        if (!(i15 % 3 == 0)) {
            d4.a.c("Array size not a multiple of 3");
        }
        if (i15 > 3) {
            i(0, i15 - 3, 3);
        }
    }
}
