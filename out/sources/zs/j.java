package zs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import lr.m;
import oq.r;
import oq.y;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        return new b(i.f236674a.b(), f.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        return new b(i.f236674a.d(), f.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(String str) {
        return new b(i.f236674a.g(), f.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(String str) {
        return new b(i.f236674a.c(), f.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b p(String str) {
        return new b(i.f236674a.e(), f.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(String str) {
        return new b(i.f236674a.f(), f.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> r(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r rVarA = y.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(f fVar) {
        i iVar = i.f236674a;
        return new b(iVar.a().f(), f.l(fVar.j() + iVar.a().h().j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(String str) {
        return new b(i.f236674a.h(), f.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b u(String str) {
        return new b(i.f236674a.i(), f.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b v(b bVar) {
        return new b(i.f236674a.g(), f.l('U' + bVar.h().j()));
    }
}
