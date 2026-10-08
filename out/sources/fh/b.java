package fh;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class b extends m implements r0 {
    protected b(Map map) {
        super(map);
    }

    @Override // fh.r0
    public final List a(Object obj) {
        return (List) super.i(obj);
    }

    @Override // fh.m
    final Collection g(Object obj, Collection collection) {
        return j(obj, (List) collection, null);
    }
}
