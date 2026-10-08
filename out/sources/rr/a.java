package rr;

import fr.l0;
import fr.t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import js.i0;
import js.j0;
import pq.v;
import ss.x;
import vr.h1;
import zs.b;
import zs.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f175535a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<b> f175536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f175537c;

    /* JADX INFO: renamed from: rr.a$a, reason: collision with other inner class name */
    public static final class C4480a implements x.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f175538a;

        C4480a(l0 l0Var) {
            this.f175538a = l0Var;
        }

        @Override // ss.x.c
        public void a() {
        }

        @Override // ss.x.c
        public x.a b(b bVar, h1 h1Var) {
            if (!t.c(bVar, i0.f104649a.a())) {
                return null;
            }
            this.f175538a.f66404a = true;
            return null;
        }
    }

    static {
        List listQ = v.q(j0.f104660a, j0.f104671l, j0.f104672m, j0.f104663d, j0.f104665f, j0.f104668i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f236634d;
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((c) it.next()));
        }
        f175536b = linkedHashSet;
        f175537c = b.f236634d.c(j0.f104669j);
    }

    private a() {
    }

    public final b a() {
        return f175537c;
    }

    public final Set<b> b() {
        return f175536b;
    }

    public final boolean c(x xVar) {
        l0 l0Var = new l0();
        xVar.c(new C4480a(l0Var), null);
        return l0Var.f66404a;
    }
}
