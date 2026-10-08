package gf;

import af.o;
import af.t;
import bf.m;
import hf.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import ye.j;

/* JADX INFO: loaded from: classes3.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f72502f = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f72503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f72504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bf.e f72505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jf.d f72506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kf.b f72507e;

    public c(Executor executor, bf.e eVar, x xVar, jf.d dVar, kf.b bVar) {
        this.f72504b = executor;
        this.f72505c = eVar;
        this.f72503a = xVar;
        this.f72506d = dVar;
        this.f72507e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, o oVar, af.i iVar) {
        cVar.f72506d.c4(oVar, iVar);
        cVar.f72503a.a(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final o oVar, j jVar, af.i iVar) {
        cVar.getClass();
        try {
            m mVar = cVar.f72505c.get(oVar.b());
            if (mVar == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f72502f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                final af.i iVarA = mVar.a(iVar);
                cVar.f72507e.m(new kf.b.a() { // from class: gf.b
                    @Override // kf.b.a
                    public final Object B() {
                        return c.b(this.f72499a, oVar, iVarA);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e15) {
            f72502f.warning("Error scheduling event " + e15.getMessage());
            jVar.a(e15);
        }
    }

    @Override // gf.e
    public void a(final o oVar, final af.i iVar, final j jVar) {
        this.f72504b.execute(new Runnable() { // from class: gf.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f72495a, oVar, jVar, iVar);
            }
        });
    }
}
