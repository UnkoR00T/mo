package pq;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "other", "", "d", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class p extends o {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean d(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            Object[] objArr = tArr[i15];
            Object[] objArr2 = tArr2[i15];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!d(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof oq.a0) && (objArr2 instanceof oq.a0)) {
                    if (!rq.a.c(((oq.a0) objArr).getStorage(), ((oq.a0) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof oq.h0) && (objArr2 instanceof oq.h0)) {
                    if (!rq.a.a(((oq.h0) objArr).getStorage(), ((oq.h0) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof oq.c0) && (objArr2 instanceof oq.c0)) {
                    if (!rq.a.b(((oq.c0) objArr).getStorage(), ((oq.c0) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof oq.e0) && (objArr2 instanceof oq.e0)) {
                    if (!rq.a.d(((oq.e0) objArr).getStorage(), ((oq.e0) objArr2).getStorage())) {
                        return false;
                    }
                } else if (!fr.t.c(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
