package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f140122c = new a().d(0).b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f140123d = new a().d(1).b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<o> f140124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f140125b;

    s(LinkedHashSet<o> linkedHashSet, String str) {
        this.f140124a = linkedHashSet;
        this.f140125b = str;
    }

    private String e(Set<v.n0> set) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Cams:");
        sb5.append(set.size());
        Iterator<v.n0> it = set.iterator();
        while (it.hasNext()) {
            v.m0 m0VarO = it.next().o();
            sb5.append(String.format(" Id:%s  Lens:%s", m0VarO.i(), Integer.valueOf(m0VarO.n())));
        }
        return sb5.toString();
    }

    private String f() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(String.format("PhyId:%s  Filters:%s", this.f140125b, Integer.valueOf(this.f140124a.size())));
        for (o oVar : this.f140124a) {
            sb5.append(" Id:");
            sb5.append(oVar.a());
            if (oVar instanceof v.j2) {
                sb5.append(" LensFilter:");
                sb5.append(((v.j2) oVar).c());
            }
        }
        return sb5.toString();
    }

    public LinkedHashSet<v.n0> a(LinkedHashSet<v.n0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<v.n0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        List<q> listB = b(arrayList);
        LinkedHashSet<v.n0> linkedHashSet2 = new LinkedHashSet<>();
        for (v.n0 n0Var : linkedHashSet) {
            if (listB.contains(n0Var.c())) {
                linkedHashSet2.add(n0Var);
            }
        }
        return linkedHashSet2;
    }

    public List<q> b(List<q> list) {
        List<q> arrayList = new ArrayList<>(list);
        Iterator<o> it = this.f140124a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<o> c() {
        return this.f140124a;
    }

    public Integer d() {
        Integer num = null;
        for (o oVar : this.f140124a) {
            if (oVar instanceof v.j2) {
                Integer numValueOf = Integer.valueOf(((v.j2) oVar).c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public v.n0 g(LinkedHashSet<v.n0> linkedHashSet) {
        Iterator<v.n0> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", e(linkedHashSet), f()));
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedHashSet<o> f140126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f140127b;

        public a() {
            this.f140126a = new LinkedHashSet<>();
        }

        public static a c(s sVar) {
            return new a(sVar.c());
        }

        public a a(o oVar) {
            this.f140126a.add(oVar);
            return this;
        }

        public s b() {
            return new s(this.f140126a, this.f140127b);
        }

        public a d(int i15) {
            i6.i.j(i15 != -1, "The specified lens facing is invalid.");
            this.f140126a.add(new v.j2(i15));
            return this;
        }

        private a(LinkedHashSet<o> linkedHashSet) {
            this.f140126a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
