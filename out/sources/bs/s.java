package bs;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends e0 implements qs.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f21263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qs.i f21264c;

    public s(Type type) {
        qs.i qVar;
        this.f21263b = type;
        Type typeT = T();
        if (typeT instanceof Class) {
            qVar = new q((Class) typeT);
        } else if (typeT instanceof TypeVariable) {
            qVar = new f0((TypeVariable) typeT);
        } else {
            if (!(typeT instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeT.getClass() + "): " + typeT);
            }
            qVar = new q((Class) ((ParameterizedType) typeT).getRawType());
        }
        this.f21264c = qVar;
    }

    @Override // qs.j
    public List<qs.x> B() {
        List<Type> listH = f.h(T());
        e0.a aVar = e0.f21231a;
        ArrayList arrayList = new ArrayList(pq.v.y(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // qs.d
    public boolean F() {
        return false;
    }

    @Override // bs.e0, qs.d
    public qs.a H(zs.c cVar) {
        return null;
    }

    @Override // qs.j
    public String I() {
        return T().toString();
    }

    @Override // qs.j
    public String L() {
        throw new UnsupportedOperationException("Type not found: " + T());
    }

    @Override // bs.e0
    public Type T() {
        return this.f21263b;
    }

    @Override // qs.j
    public qs.i d() {
        return this.f21264c;
    }

    @Override // qs.d
    public Collection<qs.a> getAnnotations() {
        return pq.v.n();
    }

    @Override // qs.j
    public boolean o() {
        Type typeT = T();
        if (typeT instanceof Class) {
            if (!(((Class) typeT).getTypeParameters().length == 0)) {
                return true;
            }
        }
        return false;
    }
}
