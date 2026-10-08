package qe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zd.j;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f166159a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f166160b = new HashMap();

    private static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f166161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<R> f166162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j<T, R> f166163c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f166161a = cls;
            this.f166162b = cls2;
            this.f166163c = jVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f166161a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f166162b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f166159a.contains(str)) {
                this.f166159a.add(str);
            }
            arrayList = this.f166160b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f166160b.put(str, arrayList);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return arrayList;
    }

    public synchronized <T, R> void a(String str, j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, jVar));
    }

    public synchronized <T, R> List<j<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f166159a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f166160b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f166163c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f166159a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f166160b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f166162b)) {
                        arrayList.add(aVar.f166162b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f166159a);
            this.f166159a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f166159a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f166159a.add(str);
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
