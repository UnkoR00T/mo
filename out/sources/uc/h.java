package uc;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kc.n;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0002\u0019\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u0003RV\u0010\"\u001a>\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0\u001aj\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d`\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$¨\u0006&"}, d2 = {"Luc/h;", "Luc/j;", "<init>", "()V", "Loq/i0;", "c", "Luc/d$b;", "key", "Luc/d$c;", "a", "(Luc/d$b;)Luc/d$c;", "Lkc/n;", "image", "", "", "", "extras", "", "size", "d", "(Luc/d$b;Lkc/n;Ljava/util/Map;J)V", "", "f", "(Luc/d$b;)Z", "clear", "b", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Luc/h$b;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "getCache$coil_core", "()Ljava/util/LinkedHashMap;", "cache", "", "I", "operationsSinceCleanUp", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<d.Key, ArrayList<b>> cache = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int operationsSinceCleanUp;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Luc/h$b;", "", "Ljava/lang/ref/WeakReference;", "Lkc/n;", "Lcoil3/util/WeakReference;", "image", "", "", "extras", "", "size", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V", "a", "Ljava/lang/ref/WeakReference;", "b", "()Ljava/lang/ref/WeakReference;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "J", "()J", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final WeakReference<n> image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> extras;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long size;

        public b(WeakReference<n> weakReference, Map<String, ? extends Object> map, long j15) {
            this.image = weakReference;
            this.extras = map;
            this.size = j15;
        }

        public final Map<String, Object> a() {
            return this.extras;
        }

        public final WeakReference<n> b() {
            return this.image;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSize() {
            return this.size;
        }
    }

    private final void c() {
        int i15 = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i15 + 1;
        if (i15 >= 10) {
            b();
        }
    }

    @Override // uc.j
    public d.Value a(d.Key key) {
        ArrayList<b> arrayList = this.cache.get(key);
        d.Value value = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            b bVar = arrayList.get(i15);
            n nVar = bVar.b().get();
            d.Value value2 = nVar != null ? new d.Value(nVar, bVar.a()) : null;
            if (value2 != null) {
                value = value2;
                break;
            }
        }
        c();
        return value;
    }

    public final void b() {
        WeakReference<n> weakReferenceB;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<b>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) v.n0(next);
                if (((bVar == null || (weakReferenceB = bVar.b()) == null) ? null : weakReferenceB.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i15 = 0;
                for (int i16 = 0; i16 < size; i16++) {
                    int i17 = i16 - i15;
                    if (next.get(i17).b().get() == null) {
                        next.remove(i17);
                        i15++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // uc.j
    public void clear() {
        this.operationsSinceCleanUp = 0;
        this.cache.clear();
    }

    @Override // uc.j
    public void d(d.Key key, n image, Map<String, ? extends Object> extras, long size) {
        LinkedHashMap<d.Key, ArrayList<b>> linkedHashMap = this.cache;
        ArrayList<b> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<b> arrayList2 = arrayList;
        b bVar = new b(new WeakReference(image), extras, size);
        if (arrayList2.isEmpty()) {
            arrayList2.add(bVar);
        } else {
            int size2 = arrayList2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                b bVar2 = arrayList2.get(i15);
                if (size >= bVar2.getSize()) {
                    if (bVar2.b().get() == image) {
                        arrayList2.set(i15, bVar);
                        break;
                    } else {
                        arrayList2.add(i15, bVar);
                        break;
                    }
                }
            }
        }
        c();
    }

    @Override // uc.j
    public boolean f(d.Key key) {
        return this.cache.remove(key) != null;
    }
}
