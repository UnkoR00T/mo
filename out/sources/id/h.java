package id;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<od.o, Path>> f90979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f90980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<od.i> f90981c;

    public h(List<od.i> list) {
        this.f90981c = list;
        this.f90979a = new ArrayList(list.size());
        this.f90980b = new ArrayList(list.size());
        for (int i15 = 0; i15 < list.size(); i15++) {
            this.f90979a.add(list.get(i15).b().l());
            this.f90980b.add(list.get(i15).c().l());
        }
    }

    public List<a<od.o, Path>> a() {
        return this.f90979a;
    }

    public List<od.i> b() {
        return this.f90981c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f90980b;
    }
}
