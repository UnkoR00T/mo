package hf;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f84133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jf.d f84134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f84135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kf.b f84136d;

    v(Executor executor, jf.d dVar, x xVar, kf.b bVar) {
        this.f84133a = executor;
        this.f84134b = dVar;
        this.f84135c = xVar;
        this.f84136d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator<af.o> it = vVar.f84134b.Q0().iterator();
        while (it.hasNext()) {
            vVar.f84135c.a(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f84133a.execute(new Runnable() { // from class: hf.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f84131a;
                vVar.f84136d.m(new kf.b.a() { // from class: hf.u
                    @Override // kf.b.a
                    public final Object B() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
