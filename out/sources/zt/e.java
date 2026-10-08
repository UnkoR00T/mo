package zt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e<K, T> extends a<K, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c<T> f237212a;

    protected e(c<T> cVar) {
        this.f237212a = cVar;
    }

    private final String i(c<T> cVar, int i15, String str) {
        T next;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Race condition happened, the size of ArrayMap is " + i15 + " but it isn't an `" + str + '`');
        sb5.append('\n');
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Type: ");
        sb6.append(cVar.getClass());
        sb5.append(sb6.toString());
        sb5.append('\n');
        StringBuilder sb7 = new StringBuilder();
        Map<String, Integer> mapB = f().b();
        sb7.append("[");
        sb7.append('\n');
        ArrayList arrayList = new ArrayList(pq.v.y(cVar, 10));
        int i16 = 0;
        for (T t15 : cVar) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                pq.v.x();
            }
            Iterator<T> it = mapB.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Number) ((Map.Entry) next).getValue()).intValue() != i16);
            sb7.append("  " + ((Map.Entry) next) + '[' + i16 + "]: " + t15);
            sb7.append('\n');
            arrayList.add(sb7);
            i16 = i17;
        }
        sb7.append("]");
        sb7.append('\n');
        sb5.append("Content: " + sb7.toString());
        sb5.append('\n');
        return sb5.toString();
    }

    @Override // zt.a
    protected final c<T> e() {
        return this.f237212a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zt.a
    protected final void g(String str, T t15) {
        int iE = f().e(str);
        int iE2 = this.f237212a.e();
        if (iE2 == 0) {
            c<T> cVar = this.f237212a;
            if (!(cVar instanceof i)) {
                throw new IllegalStateException(i(cVar, 0, "EmptyArrayMap"));
            }
            this.f237212a = new o(t15, iE);
            return;
        }
        if (iE2 == 1) {
            c<T> cVar2 = this.f237212a;
            try {
                o oVar = (o) cVar2;
                if (oVar.g() == iE) {
                    this.f237212a = new o(t15, iE);
                    return;
                } else {
                    d dVar = new d();
                    dVar.f(oVar.g(), oVar.h());
                    this.f237212a = dVar;
                }
            } catch (ClassCastException e15) {
                throw new IllegalStateException(i(cVar2, 1, "OneElementArrayMap"), e15);
            }
        }
        this.f237212a.f(iE, t15);
    }

    public e() {
        this(i.f237225a);
    }
}
