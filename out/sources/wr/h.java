package wr;

import fr.t;
import java.util.Iterator;
import java.util.List;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public interface h extends Iterable<c>, gr.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f214542p0 = a.f214543a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f214543a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final h f214544b = new C5693a();

        /* JADX INFO: renamed from: wr.h$a$a, reason: collision with other inner class name */
        public static final class C5693a implements h {
            C5693a() {
            }

            @Override // wr.h
            public /* bridge */ /* synthetic */ c H(zs.c cVar) {
                return (c) e(cVar);
            }

            @Override // wr.h
            public /* bridge */ boolean d2(zs.c cVar) {
                return b.b(this, cVar);
            }

            public Void e(zs.c cVar) {
                return null;
            }

            @Override // wr.h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<c> iterator() {
                return v.n().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final h a(List<? extends c> list) {
            return list.isEmpty() ? f214544b : new i(list);
        }

        public final h b() {
            return f214544b;
        }
    }

    public static final class b {
        public static c a(h hVar, zs.c cVar) {
            c next;
            Iterator<c> it = hVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (t.c(next.g(), cVar)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean b(h hVar, zs.c cVar) {
            return hVar.H(cVar) != null;
        }
    }

    c H(zs.c cVar);

    boolean d2(zs.c cVar);

    boolean isEmpty();
}
