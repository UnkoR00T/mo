package cm;

import bm.b;
import com.google.android.gms.maps.model.LatLng;
import hm.Point;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class c<T extends bm.b> extends cm.a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final im.b f28202e = new im.b(1.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28203b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Collection<a<T>> f28204c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final jm.a<a<T>> f28205d = new jm.a<>(0.0d, 1.0d, 0.0d, 1.0d);

    protected static class a<T extends bm.b> implements jm.a.b, bm.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final T f28206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Point f28207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LatLng f28208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set<T> f28209d;

        @Override // jm.a.b
        public Point b() {
            return this.f28207b;
        }

        @Override // bm.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Set<T> a() {
            return this.f28209d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return ((a) obj).f28206a.equals(this.f28206a);
            }
            return false;
        }

        @Override // bm.a
        public LatLng getPosition() {
            return this.f28208c;
        }

        @Override // bm.a
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.f28206a.hashCode();
        }

        private a(T t15) {
            this.f28206a = t15;
            LatLng position = t15.getPosition();
            this.f28208c = position;
            this.f28207b = c.f28202e.b(position);
            this.f28209d = Collections.singleton(t15);
        }
    }

    @Override // cm.b
    public Collection<T> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.f28205d) {
            try {
                Iterator<a<T>> it = this.f28204c.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next().f28206a);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return linkedHashSet;
    }

    @Override // cm.b
    public boolean c(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        boolean z15 = false;
        while (it.hasNext()) {
            if (i(it.next())) {
                z15 = true;
            }
        }
        return z15;
    }

    @Override // cm.b
    public void d() {
        synchronized (this.f28205d) {
            this.f28204c.clear();
            this.f28205d.b();
        }
    }

    @Override // cm.b
    public Set<? extends bm.a<T>> f(float f15) {
        double dPow = (((double) this.f28203b) / Math.pow(2.0d, (int) f15)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.f28205d) {
            try {
                Iterator<a<T>> it = l(this.f28205d, f15).iterator();
                while (it.hasNext()) {
                    a<T> next = it.next();
                    if (!hashSet.contains(next)) {
                        Collection<T> collectionD = this.f28205d.d(j(next.b(), dPow));
                        if (collectionD.size() == 1) {
                            hashSet2.add(next);
                            hashSet.add(next);
                            map.put(next, Double.valueOf(0.0d));
                        } else {
                            i iVar = new i(next.f28206a.getPosition());
                            hashSet2.add(iVar);
                            for (T t15 : collectionD) {
                                Double d15 = (Double) map.get(t15);
                                Iterator<a<T>> it4 = it;
                                double dK = k(t15.b(), next.b());
                                if (d15 == null) {
                                    map.put(t15, Double.valueOf(dK));
                                    iVar.b(t15.f28206a);
                                    map2.put(t15, iVar);
                                } else if (d15.doubleValue() >= dK) {
                                    ((i) map2.get(t15)).c(t15.f28206a);
                                    map.put(t15, Double.valueOf(dK));
                                    iVar.b(t15.f28206a);
                                    map2.put(t15, iVar);
                                }
                                it = it4;
                            }
                            hashSet.addAll(collectionD);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return hashSet2;
    }

    @Override // cm.b
    public int g() {
        return this.f28203b;
    }

    public boolean i(T t15) {
        boolean zAdd;
        a<T> aVar = new a<>(t15);
        synchronized (this.f28205d) {
            try {
                zAdd = this.f28204c.add(aVar);
                if (zAdd) {
                    this.f28205d.a(aVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return zAdd;
    }

    protected hm.a j(Point point, double d15) {
        double d16 = d15 / 2.0d;
        double d17 = point.x;
        double d18 = point.y;
        return new hm.a(d17 - d16, d17 + d16, d18 - d16, d18 + d16);
    }

    protected double k(Point point, Point point2) {
        double d15 = point.x;
        double d16 = point2.x;
        double d17 = (d15 - d16) * (d15 - d16);
        double d18 = point.y;
        double d19 = point2.y;
        return d17 + ((d18 - d19) * (d18 - d19));
    }

    protected Collection<a<T>> l(jm.a<a<T>> aVar, float f15) {
        return this.f28204c;
    }
}
