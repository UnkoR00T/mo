package iq;

import CON.p;
import android.content.Context;
import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import p7.CreationExtras;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements lq.b<dq.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f96162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f96163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile dq.b f96164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f96165d = new Object();

    class a implements w0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f96166b;

        a(Context context) {
            this.f96166b = context;
        }

        @Override // androidx.lifecycle.w0.c
        public <T extends t0> T a(Class<T> cls, CreationExtras creationExtras) {
            g gVar = new g(creationExtras);
            return new c(((InterfaceC2248b) cq.b.a(this.f96166b, InterfaceC2248b.class)).d().a(gVar).build(), gVar);
        }
    }

    /* JADX INFO: renamed from: iq.b$b, reason: collision with other inner class name */
    public interface InterfaceC2248b {
        gq.b d();
    }

    static final class c extends t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dq.b f96168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f96169c;

        c(dq.b bVar, g gVar) {
            this.f96168b = bVar;
            this.f96169c = gVar;
        }

        @Override // androidx.p016lifecycle.t0
        protected void Y8() {
            super.Y8();
            ((hq.f) ((d) bq.a.a(this.f96168b, d.class)).b()).b();
        }

        dq.b Z8() {
            return this.f96168b;
        }

        g a9() {
            return this.f96169c;
        }
    }

    public interface d {
        cq.a b();
    }

    static abstract class e {
        static cq.a a() {
            return new hq.f();
        }
    }

    b(p pVar) {
        this.f96162a = pVar;
        this.f96163b = pVar;
    }

    private dq.b a() {
        return ((c) d(this.f96162a, this.f96163b).a(c.class)).Z8();
    }

    private w0 d(y0 y0Var, Context context) {
        return new w0(y0Var, new a(context));
    }

    @Override // lq.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dq.b p() {
        if (this.f96164c == null) {
            synchronized (this.f96165d) {
                try {
                    if (this.f96164c == null) {
                        this.f96164c = a();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f96164c;
    }

    public g c() {
        return ((c) d(this.f96162a, this.f96163b).a(c.class)).a9();
    }
}
