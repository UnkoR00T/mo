package eh;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class i0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f50649a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f50650b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f50651c;

    i0(int i15) {
    }

    private final void b(int i15) {
        Object[] objArr = this.f50649a;
        int length = objArr.length;
        if (length >= i15) {
            if (this.f50651c) {
                this.f50649a = (Object[]) objArr.clone();
                this.f50651c = false;
                return;
            }
            return;
        }
        int i16 = length + (length >> 1) + 1;
        if (i16 < i15) {
            int iHighestOneBit = Integer.highestOneBit(i15 - 1);
            i16 = iHighestOneBit + iHighestOneBit;
        }
        if (i16 < 0) {
            i16 = Integer.MAX_VALUE;
        }
        this.f50649a = Arrays.copyOf(objArr, i16);
        this.f50651c = false;
    }

    public final i0 a(Object obj) {
        obj.getClass();
        b(this.f50650b + 1);
        Object[] objArr = this.f50649a;
        int i15 = this.f50650b;
        this.f50650b = i15 + 1;
        objArr[i15] = obj;
        return this;
    }
}
