package cj2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import pl.gov.coi.mobywatel.feature.legacy.storage.d;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @vl.c("id")
    private int f27441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @vl.c("sid")
    private int f27442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @vl.c("fn")
    private final List<String> f27443c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @vl.c("af")
    private boolean f27444d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @vl.c("ce")
    private boolean f27445e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @vl.c("lccd")
    private final Date f27446f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @vl.c("lovrn")
    private final String f27447g = "blank";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @vl.c("dc")
    private List<String> f27448h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @vl.c("dvsm")
    private final Map<String, Boolean> f27449i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @vl.c("pCS")
    private int f27450j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @vl.c("chldrnSrvcs")
    private List<Integer> f27451k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @vl.c("chldrnFiles")
    private HashSet<String> f27452l = new HashSet<>();

    public void a(String str) {
        this.f27443c.add(str);
    }

    public int b() {
        return this.f27441a;
    }

    public HashSet<String> c() {
        return this.f27452l;
    }

    public List<Integer> d() {
        return this.f27451k;
    }

    public Boolean e(String str) {
        return this.f27449i.getOrDefault(str, Boolean.TRUE);
    }

    public String f(d dVar) {
        return this.f27443c.get(dVar.ordinal());
    }

    public aj2.a g() {
        return aj2.a.INSTANCE.a(this.f27450j);
    }

    public int h() {
        return this.f27450j;
    }

    public aj2.a i() {
        return aj2.a.INSTANCE.a(this.f27442b);
    }

    public boolean j() {
        return this.f27444d;
    }

    public boolean k() {
        return this.f27445e;
    }

    public void l() {
        this.f27444d = true;
    }

    public void m(int i15) {
        this.f27441a = i15;
    }

    public void n(boolean z15) {
        this.f27445e = z15;
    }

    public void o(List<Integer> list) {
        this.f27451k = list;
    }

    public void p(String str, Boolean bool) {
        if (this.f27449i.containsKey(str)) {
            this.f27449i.replace(str, bool);
        } else {
            this.f27449i.put(str, bool);
        }
    }

    public void q(int i15) {
        this.f27450j = i15;
    }

    public void r(aj2.a aVar) {
        this.f27442b = aVar.getId();
    }
}
