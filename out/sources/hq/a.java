package hq;

import CON.p;
import androidx.fragment.app.o;
import androidx.p016lifecycle.w0;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: hq.a$a, reason: collision with other inner class name */
    public interface InterfaceC2013a {
        c a();
    }

    public interface b {
        c a();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Boolean> f86277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final gq.e f86278b;

        c(Map<Class<?>, Boolean> map, gq.e eVar) {
            this.f86277a = map;
            this.f86278b = eVar;
        }

        private w0.c c(w0.c cVar) {
            return new hq.c(this.f86277a, (w0.c) lq.d.a(cVar), this.f86278b);
        }

        w0.c a(p pVar, w0.c cVar) {
            return c(cVar);
        }

        w0.c b(o oVar, w0.c cVar) {
            return c(cVar);
        }
    }

    public static w0.c a(p pVar, w0.c cVar) {
        return ((InterfaceC2013a) bq.a.a(pVar, InterfaceC2013a.class)).a().a(pVar, cVar);
    }

    public static w0.c b(o oVar, w0.c cVar) {
        return ((b) bq.a.a(oVar, b.class)).a().b(oVar, cVar);
    }
}
