package ch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class b1 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f25774a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25775b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f25776c;

    b1(int i15) {
    }

    private final void d(int i15) {
        Object[] objArr = this.f25774a;
        int length = objArr.length;
        if (length >= i15) {
            if (this.f25776c) {
                this.f25774a = (Object[]) objArr.clone();
                this.f25776c = false;
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
        this.f25774a = Arrays.copyOf(objArr, i16);
        this.f25776c = false;
    }

    public final b1 b(Object obj) {
        obj.getClass();
        d(this.f25775b + 1);
        Object[] objArr = this.f25774a;
        int i15 = this.f25775b;
        this.f25775b = i15 + 1;
        objArr[i15] = obj;
        return this;
    }

    public final c1 c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(this.f25775b + collection.size());
            if (collection instanceof d1) {
                this.f25775b = ((d1) collection).e(this.f25774a, this.f25775b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
