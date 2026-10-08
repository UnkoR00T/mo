package y2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Ly2/y;", "", "", "size", "", "keys", "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", "key", "a", "(J)I", "b", "(J)Ljava/lang/Object;", "value", "", "d", "(JLjava/lang/Object;)Z", "c", "(JLjava/lang/Object;)Ly2/y;", "I", "[J", "[Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object[] values;

    public y(int i15, long[] jArr, Object[] objArr) {
        this.size = i15;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int a(long key) {
        int i15 = this.size - 1;
        if (i15 != -1) {
            int i16 = 0;
            if (i15 != 0) {
                while (i16 <= i15) {
                    int i17 = (i16 + i15) >>> 1;
                    long j15 = this.keys[i17] - key;
                    if (j15 < 0) {
                        i16 = i17 + 1;
                    } else {
                        if (j15 <= 0) {
                            return i17;
                        }
                        i15 = i17 - 1;
                    }
                }
                return -(i16 + 1);
            }
            long j16 = this.keys[0];
            if (j16 == key) {
                return 0;
            }
            if (j16 > key) {
                return -2;
            }
        }
        return -1;
    }

    public final Object b(long key) {
        int iA = a(key);
        if (iA >= 0) {
            return this.values[iA];
        }
        return null;
    }

    public final y c(long key, Object value) {
        int i15 = this.size;
        int i16 = 0;
        int i17 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i17++;
            }
        }
        int i18 = i17 + 1;
        long[] jArr = new long[i18];
        Object[] objArr = new Object[i18];
        if (i18 > 1) {
            int i19 = 0;
            while (i16 < i18 && i19 < i15) {
                long j15 = this.keys[i19];
                Object obj2 = this.values[i19];
                if (j15 > key) {
                    jArr[i16] = key;
                    objArr[i16] = value;
                    i16++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i16] = j15;
                    objArr[i16] = obj2;
                    i16++;
                }
                i19++;
            }
            if (i19 == i15) {
                jArr[i17] = key;
                objArr[i17] = value;
            } else {
                while (i16 < i18) {
                    long j16 = this.keys[i19];
                    Object obj3 = this.values[i19];
                    if (obj3 != null) {
                        jArr[i16] = j16;
                        objArr[i16] = obj3;
                        i16++;
                    }
                    i19++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new y(i18, jArr, objArr);
    }

    public final boolean d(long key, Object value) {
        int iA = a(key);
        if (iA < 0) {
            return false;
        }
        this.values[iA] = value;
        return true;
    }
}
