package sr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f183551a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<zs.b> f183552b;

    static {
        Set<m> set = m.f183574f;
        ArrayList arrayList = new ArrayList(v.y(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(p.c((m) it.next()));
        }
        List listM0 = v.M0(v.M0(v.M0(arrayList, p.a.f183643h.m()), p.a.f183647j.m()), p.a.f183665s.m());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zs.b.a aVar = zs.b.f236634d;
        Iterator it4 = listM0.iterator();
        while (it4.hasNext()) {
            linkedHashSet.add(aVar.c((zs.c) it4.next()));
        }
        f183552b = linkedHashSet;
    }

    private d() {
    }

    public final Set<zs.b> a() {
        return f183552b;
    }

    public final Set<zs.b> b() {
        return f183552b;
    }
}
