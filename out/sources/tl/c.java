package tl;

import java.util.Iterator;
import java.util.Set;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f190619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f190620b;

    c(Set<f> set, d dVar) {
        this.f190619a = d(set);
        this.f190620b = dVar;
    }

    public static /* synthetic */ i b(yk.d dVar) {
        return new c(dVar.c(f.class), d.a());
    }

    public static yk.c<i> c() {
        return yk.c.c(i.class).b(q.m(f.class)).e(new yk.g() { // from class: tl.b
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return c.b(dVar);
            }
        }).d();
    }

    private static String d(Set<f> set) {
        StringBuilder sb5 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb5.append(next.b());
            sb5.append('/');
            sb5.append(next.c());
            if (it.hasNext()) {
                sb5.append(' ');
            }
        }
        return sb5.toString();
    }

    @Override // tl.i
    public String a() {
        if (this.f190620b.b().isEmpty()) {
            return this.f190619a;
        }
        return this.f190619a + ' ' + d(this.f190620b.b());
    }
}
