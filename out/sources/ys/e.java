package ys;

import java.util.List;
import pq.e1;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final xs.a.e f229098h;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(xs.a.e eVar, String[] strArr) {
        List<Integer> listB = eVar.B();
        super(strArr, listB.isEmpty() ? e1.e() : v.k1(listB), g.a(eVar.C()));
        this.f229098h = eVar;
    }
}
