package fh;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends f0 {
    public j0() {
        super(4);
    }

    public final j0 a(Object obj) {
        obj.getClass();
        int i15 = this.f63032b;
        int i16 = i15 + 1;
        Object[] objArr = this.f63031a;
        int length = objArr.length;
        if (length < i16) {
            int i17 = length + (length >> 1) + 1;
            if (i17 < i16) {
                int iHighestOneBit = Integer.highestOneBit(i15);
                i17 = iHighestOneBit + iHighestOneBit;
            }
            if (i17 < 0) {
                i17 = Integer.MAX_VALUE;
            }
            this.f63031a = Arrays.copyOf(objArr, i17);
            this.f63033c = false;
        } else if (this.f63033c) {
            this.f63031a = (Object[]) objArr.clone();
            this.f63033c = false;
        }
        Object[] objArr2 = this.f63031a;
        int i18 = this.f63032b;
        this.f63032b = i18 + 1;
        objArr2[i18] = obj;
        return this;
    }

    public final m0 b() {
        this.f63033c = true;
        return m0.j(this.f63031a, this.f63032b);
    }
}
