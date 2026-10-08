package ng;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends hg.e implements mg.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final hg.a.g f135931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final hg.a.AbstractC1948a f135932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final hg.a f135933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f135934o = 0;

    static {
        hg.a.g gVar = new hg.a.g();
        f135931l = gVar;
        l lVar = new l();
        f135932m = lVar;
        f135933n = new hg.a("ModuleInstall.API", lVar, gVar);
    }

    public x(Context context) {
        super(context, (hg.a<hg.a.d.c>) f135933n, hg.a.d.f84298a, hg.e.a.f84312c);
    }

    static final a D(boolean z15, hg.g... gVarArr) {
        jg.s.m(gVarArr, "Requested APIs must not be null.");
        jg.s.b(gVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (hg.g gVar : gVarArr) {
            jg.s.m(gVar, "Requested API must not be null.");
        }
        return a.p(Arrays.asList(gVarArr), z15);
    }

    @Override // mg.d
    public final vh.l<mg.g> d(mg.f fVar) {
        final a aVarH = a.h(fVar);
        final mg.a aVarB = fVar.b();
        Executor executorC = fVar.c();
        if (aVarH.m().isEmpty()) {
            return vh.o.f(new mg.g(0));
        }
        if (aVarB == null) {
            ig.s.a aVarA = ig.s.a();
            aVarA.d(vg.g.f206699a);
            aVarA.c(true);
            aVarA.e(27304);
            aVarA.b(new ig.p() { // from class: ng.r
                /* JADX WARN: Multi-variable type inference failed */
                @Override // ig.p
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    ((i) ((y) obj).A()).p3(new n(this.f135917a, (vh.m) obj2), aVarH, null);
                }
            });
            return p(aVarA.a());
        }
        jg.s.l(aVarB);
        ig.j jVarX = executorC == null ? x(aVarB, mg.a.class.getSimpleName()) : ig.k.b(aVarB, executorC, mg.a.class.getSimpleName());
        final d dVar = new d(jVarX);
        final AtomicReference atomicReference = new AtomicReference();
        ig.p pVar = new ig.p() { // from class: ng.s
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ig.p
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((i) ((y) obj).A()).p3(new o(this.f135919a, atomicReference, (vh.m) obj2, aVarB), aVarH, dVar);
            }
        };
        ig.p pVar2 = new ig.p() { // from class: ng.t
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ig.p
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((i) ((y) obj).A()).r3(new p(this.f135924a, (vh.m) obj2), dVar);
            }
        };
        ig.o.a aVarA2 = ig.o.a();
        aVarA2.g(jVarX);
        aVarA2.d(vg.g.f206699a);
        aVarA2.c(true);
        aVarA2.b(pVar);
        aVarA2.f(pVar2);
        aVarA2.e(27305);
        return q(aVarA2.a()).s(new vh.k() { // from class: ng.u
            @Override // vh.k
            public final /* synthetic */ vh.l a(Object obj) {
                int i15 = x.f135934o;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? vh.o.f((mg.g) atomicReference2.get()) : vh.o.e(new hg.b(Status.f29009h));
            }
        });
    }

    @Override // mg.d
    public final vh.l<Boolean> e(mg.a aVar) {
        return r(ig.k.c(aVar, mg.a.class.getSimpleName()), 27306);
    }

    @Override // mg.d
    public final vh.l<Void> f(hg.g... gVarArr) {
        final a aVarD = D(false, gVarArr);
        if (aVarD.m().isEmpty()) {
            return vh.o.f(null);
        }
        ig.s.a aVarA = ig.s.a();
        aVarA.d(vg.g.f206699a);
        aVarA.e(27303);
        aVarA.c(false);
        aVarA.b(new ig.p() { // from class: ng.v
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ig.p
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((i) ((y) obj).A()).q3(new q(this.f135927a, (vh.m) obj2), aVarD);
            }
        });
        return p(aVarA.a());
    }

    @Override // mg.d
    public final vh.l<mg.b> i(hg.g... gVarArr) {
        final a aVarD = D(false, gVarArr);
        if (aVarD.m().isEmpty()) {
            return vh.o.f(new mg.b(true, 0));
        }
        ig.s.a aVarA = ig.s.a();
        aVarA.d(vg.g.f206699a);
        aVarA.e(27301);
        aVarA.c(false);
        aVarA.b(new ig.p() { // from class: ng.w
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ig.p
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((i) ((y) obj).A()).o3(new m(this.f135929a, (vh.m) obj2), aVarD);
            }
        });
        return p(aVarA.a());
    }
}
