package gs;

import es.q;
import es.s;
import es.w;
import es.x;
import es.z;
import java.util.List;
import java.util.ServiceLoader;
import pq.v;
import us.o;
import us.r;
import us.t;

/* JADX INFO: loaded from: classes4.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f76602a = a.f76603a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f76603a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final oq.k<List<n>> f76604b = oq.l.a(m.f76601a);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List a() {
            List listF1 = v.f1(ServiceLoader.load(n.class, n.class.getClassLoader()));
            if (listF1.isEmpty()) {
                throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
            return listF1;
        }

        public final List<n> c() {
            return f76604b.getValue();
        }
    }

    i a();

    void b(es.j jVar, us.e eVar, fs.e eVar2);

    d c();

    void d(es.v vVar, r rVar, fs.e eVar);

    void e(es.g gVar, us.c cVar, fs.e eVar);

    b f();

    void g(x xVar, t tVar, fs.e eVar);

    c h();

    void i(q qVar, us.h hVar, fs.e eVar);

    void j(s sVar, us.j jVar, fs.e eVar);

    h k();

    void l(es.t tVar, o oVar, fs.e eVar);

    j m();

    void n(z zVar, us.v vVar, fs.e eVar);

    g o();

    k p();

    l q();

    void r(w wVar, us.s sVar, fs.e eVar);
}
