package fr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f66415a;

    public u0(int i15) {
        this.f66415a = new ArrayList<>(i15);
    }

    public void a(Object obj) {
        this.f66415a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f66415a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f66415a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f66415a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f66415a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it4 = (Iterator) obj;
            while (it4.hasNext()) {
                this.f66415a.add(it4.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f66415a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f66415a.toArray(objArr);
    }
}
