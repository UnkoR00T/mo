package dh;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class j8 extends k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f41939a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f41940b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f41941c;

    j8(int i15) {
    }

    private final void b(int i15) {
        Object[] objArr = this.f41939a;
        int length = objArr.length;
        if (length >= i15) {
            if (this.f41941c) {
                this.f41939a = (Object[]) objArr.clone();
                this.f41941c = false;
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
        this.f41939a = Arrays.copyOf(objArr, i16);
        this.f41941c = false;
    }

    public final j8 a(Object obj) {
        obj.getClass();
        b(this.f41940b + 1);
        Object[] objArr = this.f41939a;
        int i15 = this.f41940b;
        this.f41940b = i15 + 1;
        objArr[i15] = obj;
        return this;
    }
}
