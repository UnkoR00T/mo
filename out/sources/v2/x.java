package v2;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"", "index", "shift", "f", "(II)I", "K", "V", "", "", "keyIndex", "key", "value", "g", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "Lv2/t;", "newNode", "j", "([Ljava/lang/Object;IILv2/t;)[Ljava/lang/Object;", "k", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "h", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "i", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final int f(int i15, int i16) {
        return (i15 >> i16) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] g(Object[] objArr, int i15, K k15, V v15) {
        Object[] objArr2 = new Object[objArr.length + 2];
        pq.n.s(objArr, objArr2, 0, 0, i15, 6, null);
        pq.n.n(objArr, objArr2, i15 + 2, i15, objArr.length);
        objArr2[i15] = k15;
        objArr2[i15 + 1] = v15;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i15) {
        Object[] objArr2 = new Object[objArr.length - 2];
        pq.n.s(objArr, objArr2, 0, 0, i15, 6, null);
        pq.n.n(objArr, objArr2, i15, i15 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i15) {
        Object[] objArr2 = new Object[objArr.length - 1];
        pq.n.s(objArr, objArr2, 0, 0, i15, 6, null);
        pq.n.n(objArr, objArr2, i15, i15 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i15, int i16, t<?, ?> tVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        pq.n.s(objArr, objArr2, 0, 0, i15, 6, null);
        pq.n.n(objArr, objArr2, i15, i15 + 2, i16);
        objArr2[i16 - 2] = tVar;
        pq.n.n(objArr, objArr2, i16 - 1, i16, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] k(Object[] objArr, int i15, int i16, K k15, V v15) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        pq.n.n(objArrCopyOf, objArrCopyOf, i15 + 2, i15 + 1, objArr.length);
        pq.n.n(objArrCopyOf, objArrCopyOf, i16 + 2, i16, i15);
        objArrCopyOf[i16] = k15;
        objArrCopyOf[i16 + 1] = v15;
        return objArrCopyOf;
    }
}
