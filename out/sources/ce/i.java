package ce;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<a, Object> f25505a = new g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f25506b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f25507c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, ce.a<?>> f25508d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25510f;

    private static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f25511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<?> f25513c;

        a(b bVar) {
            this.f25511a = bVar;
        }

        @Override // ce.l
        public void a() {
            this.f25511a.c(this);
        }

        void b(int i15, Class<?> cls) {
            this.f25512b = i15;
            this.f25513c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f25512b == aVar.f25512b && this.f25513c == aVar.f25513c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i15 = this.f25512b * 31;
            Class<?> cls = this.f25513c;
            return i15 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f25512b + "array=" + this.f25513c + '}';
        }
    }

    private static final class b extends c<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ce.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i15, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i15, cls);
            return aVarB;
        }
    }

    public i(int i15) {
        this.f25509e = i15;
    }

    private void e(int i15, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapL = l(cls);
        Integer num = navigableMapL.get(Integer.valueOf(i15));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapL.remove(Integer.valueOf(i15));
                return;
            } else {
                navigableMapL.put(Integer.valueOf(i15), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i15 + ", this: " + this);
    }

    private void f() {
        g(this.f25509e);
    }

    private void g(int i15) {
        while (this.f25510f > i15) {
            Object objF = this.f25505a.f();
            ve.k.d(objF);
            ce.a aVarH = h(objF);
            this.f25510f -= aVarH.b(objF) * aVarH.a();
            e(aVarH.b(objF), objF.getClass());
            if (Log.isLoggable(aVarH.getTag(), 2)) {
                aVarH.getTag();
                aVarH.b(objF);
            }
        }
    }

    private <T> ce.a<T> h(T t15) {
        return i(t15.getClass());
    }

    private <T> ce.a<T> i(Class<T> cls) {
        ce.a<T> fVar;
        ce.a<T> aVar = (ce.a) this.f25508d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f25508d.put(cls, fVar);
        return fVar;
    }

    private <T> T j(a aVar) {
        return (T) this.f25505a.a(aVar);
    }

    private <T> T k(a aVar, Class<T> cls) {
        ce.a<T> aVarI = i(cls);
        T t15 = (T) j(aVar);
        if (t15 != null) {
            this.f25510f -= aVarI.b(t15) * aVarI.a();
            e(aVarI.b(t15), cls);
        }
        if (t15 != null) {
            return t15;
        }
        if (Log.isLoggable(aVarI.getTag(), 2)) {
            aVarI.getTag();
            int i15 = aVar.f25512b;
        }
        return aVarI.newArray(aVar.f25512b);
    }

    private NavigableMap<Integer, Integer> l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f25507c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f25507c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i15 = this.f25510f;
        return i15 == 0 || this.f25509e / i15 >= 2;
    }

    private boolean n(int i15) {
        return i15 <= this.f25509e / 2;
    }

    private boolean o(int i15, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i15 * 8;
        }
        return false;
    }

    @Override // ce.b
    public synchronized void a(int i15) {
        try {
            if (i15 >= 40) {
                b();
            } else if (i15 >= 20 || i15 == 15) {
                g(this.f25509e / 2);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // ce.b
    public synchronized void b() {
        g(0);
    }

    @Override // ce.b
    public synchronized <T> T c(int i15, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = l(cls).ceilingKey(Integer.valueOf(i15));
        } catch (Throwable th4) {
            throw th4;
        }
        return (T) k(o(i15, numCeilingKey) ? this.f25506b.e(numCeilingKey.intValue(), cls) : this.f25506b.e(i15, cls), cls);
    }

    @Override // ce.b
    public synchronized <T> T d(int i15, Class<T> cls) {
        return (T) k(this.f25506b.e(i15, cls), cls);
    }

    @Override // ce.b
    public synchronized <T> void put(T t15) {
        Class<?> cls = t15.getClass();
        ce.a<T> aVarI = i(cls);
        int iB = aVarI.b(t15);
        int iA = aVarI.a() * iB;
        if (n(iA)) {
            a aVarE = this.f25506b.e(iB, cls);
            this.f25505a.d(aVarE, t15);
            NavigableMap<Integer, Integer> navigableMapL = l(cls);
            Integer num = navigableMapL.get(Integer.valueOf(aVarE.f25512b));
            Integer numValueOf = Integer.valueOf(aVarE.f25512b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f25510f += iA;
            f();
        }
    }
}
