package rs;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1 f175643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<r1> f175644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f175645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g1 f175646d;

    public g1() {
        this(null, null, null, 7, null);
    }

    public final String a() {
        return this.f175645c;
    }

    public final List<r1> b() {
        return this.f175644b;
    }

    public final r1 c() {
        return this.f175643a;
    }

    public final g1 d() {
        return this.f175646d;
    }

    public g1(r1 r1Var, List<r1> list, String str) {
        this.f175643a = r1Var;
        this.f175644b = list;
        this.f175645c = str;
        g1 g1Var = null;
        if (str != null) {
            r1 r1VarA = r1Var != null ? r1Var.a() : null;
            List<r1> list2 = list;
            ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
            for (r1 r1Var2 : list2) {
                arrayList.add(r1Var2 != null ? r1Var2.a() : null);
            }
            g1Var = new g1(r1VarA, arrayList, null);
        }
        this.f175646d = g1Var;
    }

    public /* synthetic */ g1(r1 r1Var, List list, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : r1Var, (i15 & 2) != 0 ? pq.v.n() : list, (i15 & 4) != 0 ? null : str);
    }
}
