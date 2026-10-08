package r0;

import java.util.ConcurrentModificationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Lr0/b;", "", "hash", "b", "(Lr0/b;I)I", "", "key", "c", "(Lr0/b;Ljava/lang/Object;I)I", "d", "(Lr0/b;)I", "size", "Loq/i0;", "a", "(Lr0/b;I)V", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final <E> void a(b<E> bVar, int i15) {
        bVar.n(new int[i15]);
        bVar.l(new Object[i15]);
    }

    public static final <E> int b(b<E> bVar, int i15) {
        try {
            return s0.a.a(bVar.getHashes(), bVar.i(), i15);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(b<E> bVar, Object obj, int i15) {
        int i16 = bVar.i();
        if (i16 == 0) {
            return -1;
        }
        int iB = b(bVar, i15);
        if (iB < 0 || fr.t.c(obj, bVar.getArray()[iB])) {
            return iB;
        }
        int i17 = iB + 1;
        while (i17 < i16 && bVar.getHashes()[i17] == i15) {
            if (fr.t.c(obj, bVar.getArray()[i17])) {
                return i17;
            }
            i17++;
        }
        for (int i18 = iB - 1; i18 >= 0 && bVar.getHashes()[i18] == i15; i18--) {
            if (fr.t.c(obj, bVar.getArray()[i18])) {
                return i18;
            }
        }
        return ~i17;
    }

    public static final <E> int d(b<E> bVar) {
        return c(bVar, null, 0);
    }
}
