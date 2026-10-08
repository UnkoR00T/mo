package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<e> f53181b = new ArrayList(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<gs.d> f53182c;

    public q(String str) {
        this.f53180a = str;
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            ((gs.n) it.next()).c();
        }
        this.f53182c = arrayList;
    }

    public final List<e> a() {
        return this.f53181b;
    }

    public String toString() {
        return this.f53180a;
    }
}
