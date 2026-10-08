package g0;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f69152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.z0 f69153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i6.a<Throwable> f69154c;

    public y(o.k kVar) {
        i6.i.a(kVar.g() == 4);
        this.f69152a = kVar.c();
        o.z0 z0VarD = kVar.d();
        Objects.requireNonNull(z0VarD);
        this.f69153b = z0VarD;
        this.f69154c = kVar.b();
    }

    public static /* synthetic */ Object a(final y yVar, final o.z0.a aVar, final androidx.concurrent.futures.c.a aVar2) {
        yVar.f69152a.execute(new Runnable() { // from class: g0.x
            @Override // java.lang.Runnable
            public final void run() {
                y yVar2 = this.f69147a;
                aVar2.c(yVar2.f69153b.a(aVar));
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public o.z0.b c(final o.z0.a aVar) throws o.v0 {
        try {
            return (o.z0.b) androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: g0.w
                @Override // androidx.concurrent.futures.c.InterfaceC0250c
                public final Object a(androidx.concurrent.futures.c.a aVar2) {
                    return y.a(this.f69143a, aVar, aVar2);
                }
            }).get();
        } catch (Exception e15) {
            e = e15;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new o.v0(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
