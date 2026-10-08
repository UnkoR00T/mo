package PRN;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.d2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001%B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"LPRN/l0;", "Lv/b;", "Lmu/g;", "", "Lh/v;", "idFlow", "Lju/p0;", "coroutineScope", "", "initialCameraIds", "Landroid/content/Context;", "context", "<init>", "(Lmu/g;Lju/p0;Ljava/util/List;Landroid/content/Context;)V", "Loq/i0;", "f", "()V", "g", "Lcom/google/common/util/concurrent/q;", "Lo/p;", "b", "()Lcom/google/common/util/concurrent/q;", "Lmu/g;", "Lju/p0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMonitoring", "Lju/d2;", "i", "Lju/d2;", "flowCollectionJob", "Landroid/hardware/camera2/CameraManager;", "j", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "k", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 extends v.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.g<List<h.v>> idFlow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isMonitoring;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private d2 flowCollectionJob;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final CameraManager cameraManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f706e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a<List<o.p>> f708g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.concurrent.futures.c.a<List<o.p>> aVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f708g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f706e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            try {
                String[] cameraIdList = l0.this.cameraManager.getCameraIdList();
                ArrayList arrayList = new ArrayList();
                for (String str : cameraIdList) {
                    o.p pVarD = null;
                    try {
                        pVarD = o.p.a.d(str, null, null, 6, null);
                    } catch (IllegalArgumentException e15) {
                        c2.h("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str, e15);
                    }
                    if (pVarD != null) {
                        arrayList.add(pVarD);
                    }
                }
                arrayList.toString();
                l0.this.h(arrayList);
                this.f708g.c(arrayList);
            } catch (Exception e16) {
                c2.f("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e16);
                l0.this.i(e16);
                this.f708g.f(e16);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return l0.this.new b(this.f708g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements mu.g<List<? extends o.p>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f709a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f710a;

            /* JADX INFO: renamed from: PRN.l0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0002a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f711d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f712e;

                public C0002a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f711d = obj;
                    this.f712e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f710a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0002a c0002a;
                if (eVar instanceof C0002a) {
                    c0002a = (C0002a) eVar;
                    int i15 = c0002a.f712e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0002a.f712e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0002a = new C0002a(eVar);
                    }
                } else {
                    c0002a = new C0002a(eVar);
                }
                Object obj2 = c0002a.f711d;
                Object objE = uq.b.e();
                int i16 = c0002a.f712e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f710a;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        String value = ((h.v) it.next()).getValue();
                        o.p pVarD = null;
                        try {
                            pVarD = o.p.a.d(value, null, null, 6, null);
                        } catch (Exception e15) {
                            c2.h("PipePresenceSrc", "Failed to create CameraIdentifier for pipeId: " + value, e15);
                        }
                        if (pVarD != null) {
                            arrayList.add(pVarD);
                        }
                    }
                    c0002a.f712e = 1;
                    if (hVar.F(arrayList, c0002a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public c(mu.g gVar) {
            this.f709a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends o.p>> hVar, tq.e eVar) {
            Object objA = this.f709a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo/p;", "identifiers", "Loq/i0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<List<? extends o.p>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f715f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ fr.l0 f717h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(fr.l0 l0Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f717h = l0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f714e;
            if (i15 == 0) {
                oq.u.b(obj);
                List list = (List) this.f715f;
                pq.v.v0(list, null, null, null, 0, null, null, 63, null);
                if (!l0.this.isMonitoring.get()) {
                    vq.b.e(Log.d("PipePresenceSrc", "Ignoring camera update because monitoring is stopped."));
                } else if (this.f717h.f66404a) {
                    com.google.common.util.concurrent.q<List<o.p>> qVarB = l0.this.b();
                    this.f714e = 1;
                    if (androidx.concurrent.futures.e.b(qVarB, this) == objE) {
                        return objE;
                    }
                } else {
                    l0.this.h(list);
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f717h.f66404a = false;
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(List<o.p> list, tq.e<? super oq.i0> eVar) {
            return ((d) v(list, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = l0.this.new d(this.f717h, eVar);
            dVar.f715f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmu/h;", "", "Lo/p;", "", "e", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.q<mu.h<? super List<? extends o.p>>, Throwable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f719f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f718e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Throwable th4 = (Throwable) this.f719f;
            c2.f("PipePresenceSrc", "Error in camera ID flow collection.", th4);
            if (l0.this.isMonitoring.get()) {
                l0.this.i(th4);
            } else {
                vq.b.e(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super List<o.p>> hVar, Throwable th4, tq.e<? super oq.i0> eVar) {
            e eVar2 = l0.this.new e(eVar);
            eVar2.f719f = th4;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(mu.g<? extends List<h.v>> gVar, ju.p0 p0Var, List<String> list, Context context) {
        super(list);
        this.idFlow = gVar;
        this.coroutineScope = p0Var;
        this.isMonitoring = new AtomicBoolean(false);
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(l0 l0Var, androidx.concurrent.futures.c.a aVar) {
        ju.k.d(l0Var.coroutineScope, null, null, l0Var.new b(aVar, null), 3, null);
        return "FetchData for PipeCameraPresence0";
    }

    @Override // v.x2
    public com.google.common.util.concurrent.q<List<o.p>> b() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: PRN.k0
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return l0.p(this.f685a, aVar);
            }
        });
    }

    @Override // v.b
    protected void f() {
        if (this.isMonitoring.compareAndSet(false, true)) {
            d2 d2Var = this.flowCollectionJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            fr.l0 l0Var = new fr.l0();
            l0Var.f66404a = true;
            this.flowCollectionJob = mu.i.N(mu.i.f(mu.i.S(new c(this.idFlow), new d(l0Var, null)), new e(null)), this.coroutineScope);
        }
    }

    @Override // v.b
    public void g() {
        if (this.isMonitoring.compareAndSet(true, false)) {
            d2 d2Var = this.flowCollectionJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this.flowCollectionJob = null;
        }
    }
}
