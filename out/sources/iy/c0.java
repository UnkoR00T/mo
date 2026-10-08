package iy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0000*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011*\b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Liy/b0;", "", "e", "(Liy/b0;)Ljava/lang/String;", "c", "(Liy/b0;)Liy/b0;", "d", "", "Liy/a0;", "f", "([B)Liy/a0;", "", "h", "([C)Liy/b0;", "g", "(Ljava/lang/String;)Liy/b0;", "", "", "a", "(Ljava/util/Collection;)Ljava/util/List;", "b", "domain"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c0 {
    public static final List<String> a(Collection<b0> collection) {
        Collection<b0> collection2 = collection;
        ArrayList arrayList = new ArrayList(pq.v.y(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(e((b0) it.next()));
        }
        return arrayList;
    }

    public static final List<b0> b(Collection<String> collection) {
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(pq.v.y(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((String) it.next()));
        }
        return arrayList;
    }

    public static final b0 c(b0 b0Var) {
        if (e(b0Var).length() > 0) {
            return b0Var;
        }
        return null;
    }

    public static final b0 d(b0 b0Var) {
        return b0Var == null ? b0.INSTANCE.a() : b0Var;
    }

    public static final String e(b0 b0Var) {
        return new String(b0Var.getData());
    }

    public static final a0 f(byte[] bArr) {
        return new a0(bArr);
    }

    public static final b0 g(String str) {
        return h(str.toCharArray());
    }

    public static final b0 h(char[] cArr) {
        return new b0(cArr);
    }
}
