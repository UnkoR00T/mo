package xg;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f218446a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f218447b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f218448c;

    b(int i15) {
    }

    public final b a(Object obj) {
        int i15;
        obj.getClass();
        int length = this.f218446a.length;
        int i16 = this.f218447b;
        int i17 = i16 + 1;
        if (i17 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i17 <= length) {
            i15 = length;
        } else {
            i15 = (length >> 1) + length + 1;
            if (i15 < i17) {
                int iHighestOneBit = Integer.highestOneBit(i16);
                i15 = iHighestOneBit + iHighestOneBit;
            }
            if (i15 < 0) {
                i15 = Integer.MAX_VALUE;
            }
        }
        if (i15 > length || this.f218448c) {
            this.f218446a = Arrays.copyOf(this.f218446a, i15);
            this.f218448c = false;
        }
        Object[] objArr = this.f218446a;
        int i18 = this.f218447b;
        this.f218447b = i18 + 1;
        objArr[i18] = obj;
        return this;
    }
}
