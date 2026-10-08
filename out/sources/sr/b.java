package sr;

import java.util.ServiceLoader;
import pq.v;
import vr.i0;
import vr.p0;

/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f183548a = a.f183549a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f183549a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final oq.k<b> f183550b = oq.l.b(oq.o.PUBLICATION, sr.a.f183547a);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b a() {
            b bVar = (b) v.m0(ServiceLoader.load(b.class, b.class.getClassLoader()));
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final b c() {
            return f183550b.getValue();
        }
    }

    p0 a(rt.n nVar, i0 i0Var, Iterable<? extends xr.b> iterable, xr.c cVar, xr.a aVar, boolean z15);
}
