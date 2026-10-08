package cu;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    static class a<N> extends AbstractC0805b<N, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f37869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f37870b;

        a(er.l lVar, boolean[] zArr) {
            this.f37869a = lVar;
            this.f37870b = zArr;
        }

        @Override // cu.b.d
        public boolean c(N n15) {
            if (((Boolean) this.f37869a.b(n15)).booleanValue()) {
                this.f37870b[0] = true;
            }
            return !this.f37870b[0];
        }

        @Override // cu.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f37870b[0]);
        }
    }

    /* JADX INFO: renamed from: cu.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0805b<N, R> implements d<N, R> {
        @Override // cu.b.d
        public void b(N n15) {
        }
    }

    public interface c<N> {
        Iterable<? extends N> a(N n15);
    }

    public interface d<N, R> {
        R a();

        void b(N n15);

        boolean c(N n15);
    }

    public interface e<N> {
        boolean a(N n15);
    }

    public static class f<N> implements e<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<N> f37871a;

        public f() {
            this(new HashSet());
        }

        private static /* synthetic */ void b(int i15) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // cu.b.e
        public boolean a(N n15) {
            return this.f37871a.add(n15);
        }

        public f(Set<N> set) {
            if (set == null) {
                b(0);
            }
            this.f37871a = set;
        }
    }

    private static /* synthetic */ void a(int i15) {
        Object[] objArr = new Object[3];
        switch (i15) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i15) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R b(Collection<N> collection, c<N> cVar, d<N, R> dVar) {
        if (collection == null) {
            a(4);
        }
        if (cVar == null) {
            a(5);
        }
        if (dVar == null) {
            a(6);
        }
        return (R) c(collection, cVar, new f(), dVar);
    }

    public static <N, R> R c(Collection<N> collection, c<N> cVar, e<N> eVar, d<N, R> dVar) {
        if (collection == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        if (eVar == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), cVar, eVar, dVar);
        }
        return dVar.a();
    }

    public static <N> void d(N n15, c<N> cVar, e<N> eVar, d<N, ?> dVar) {
        if (n15 == null) {
            a(22);
        }
        if (cVar == null) {
            a(23);
        }
        if (eVar == null) {
            a(24);
        }
        if (dVar == null) {
            a(25);
        }
        if (eVar.a(n15) && dVar.c(n15)) {
            Iterator<? extends N> it = cVar.a(n15).iterator();
            while (it.hasNext()) {
                d(it.next(), cVar, eVar, dVar);
            }
            dVar.b(n15);
        }
    }

    public static <N> Boolean e(Collection<N> collection, c<N> cVar, er.l<N, Boolean> lVar) {
        if (collection == null) {
            a(7);
        }
        if (cVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (Boolean) b(collection, cVar, new a(lVar, new boolean[1]));
    }
}
