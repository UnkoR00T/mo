package tt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import st.t0;
import vr.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0<t<c0>> f192120a = new h0<>("KotlinTypeRefiner");

    public static final h0<t<c0>> a() {
        return f192120a;
    }

    public static final List<t0> b(g gVar, Iterable<? extends t0> iterable) {
        ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
        Iterator<? extends t0> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a(it.next()));
        }
        return arrayList;
    }
}
