package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T> implements Iterable<T>, Closeable {

    public interface a<T> {
        void a(T t15, OutputStream outputStream);

        T b(byte[] bArr);
    }

    public static <T> c<T> C(d dVar, a<T> aVar) {
        return new b(dVar, aVar);
    }

    public static <T> c<T> E() {
        return new io.sentry.cache.tape.a();
    }

    public List<T> L(int i15) {
        int iMin = Math.min(i15, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator<T> it = iterator();
        for (int i16 = 0; i16 < iMin; i16++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract void M(int i15);

    public void clear() {
        M(size());
    }

    public abstract void h(T t15);

    public abstract int size();

    public List<T> u() {
        return L(size());
    }
}
