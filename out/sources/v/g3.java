package v;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c3> f202589a;

    public g3(List<c3> list) {
        this.f202589a = new ArrayList(list);
    }

    public static String d(g3 g3Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<c3> it = g3Var.f202589a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public boolean a(Class<? extends c3> cls) {
        Iterator<c3> it = this.f202589a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends c3> T b(Class<T> cls) {
        Iterator<c3> it = this.f202589a.iterator();
        while (it.hasNext()) {
            T t15 = (T) it.next();
            if (t15.getClass() == cls) {
                return t15;
            }
        }
        return null;
    }

    public <T extends c3> List<T> c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (c3 c3Var : this.f202589a) {
            if (cls.isAssignableFrom(c3Var.getClass())) {
                arrayList.add(c3Var);
            }
        }
        return arrayList;
    }
}
