package io.sentry.internal.modules;

import io.sentry.v0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<b> f95116e;

    public a(List<b> list, v0 v0Var) {
        super(v0Var);
        this.f95116e = list;
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        Iterator<b> it = this.f95116e.iterator();
        while (it.hasNext()) {
            Map<String, String> mapA = it.next().a();
            if (mapA != null) {
                treeMap.putAll(mapA);
            }
        }
        return treeMap;
    }
}
