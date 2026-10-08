package b01;

import a14.w;
import fr.q0;
import iq0.ApplicationFormServiceGroup;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tz0.ApplicationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B9\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00109\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020B0A8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010C¨\u0006E"}, d2 = {"Lb01/o;", "Ll00/g;", "Lb01/h;", "Lb01/g;", "Lb01/i;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lc01/b;", "applicationFormListScreenMapper", "Lib4/c;", "genericDomainErrorMapper", "Lgx/d;", "globalEventManager", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lc01/b;Lib4/c;Lgx/d;La14/w;Li70/n;)V", "Ldx/b;", "error", "Loq/i0;", "r9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Liq0/j;", "group", "u9", "(Liq0/j;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lc01/b;", "c", "Lib4/c;", "d", "Lgx/d;", "e", "La14/w;", "f", "Li70/n;", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lb01/g$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lb01/i$a;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<b01.h, b01.g> implements b01.i, zx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c01.b applicationFormListScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<b01.h, b01.g> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<b01.g.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<b01.i.a> state = a9(new a(e9().getState(), this), b01.i.a.C0370a.f15800a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<b01.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f15815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f15816b;

        /* JADX INFO: renamed from: b01.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0371a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f15817a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f15818b;

            /* JADX INFO: renamed from: b01.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0372a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f15819d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f15820e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f15821f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f15823h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f15824j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f15825k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f15826l;

                public C0372a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f15819d = obj;
                    this.f15820e |= PKIFailureInfo.systemUnavail;
                    return C0371a.this.F(null, this);
                }
            }

            public C0371a(mu.h hVar, o oVar) {
                this.f15817a = hVar;
                this.f15818b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0372a c0372a;
                if (eVar instanceof C0372a) {
                    c0372a = (C0372a) eVar;
                    int i15 = c0372a.f15820e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0372a.f15820e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0372a = new C0372a(eVar);
                    }
                } else {
                    c0372a = new C0372a(eVar);
                }
                Object obj2 = c0372a.f15819d;
                Object objE = uq.b.e();
                int i16 = c0372a.f15820e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f15817a;
                    b01.i.a aVarB = this.f15818b.applicationFormListScreenMapper.b(new c01.b.Params((b01.h) obj, this.f15818b.b9(b01.g.a.f15789a), this.f15818b.new b(), this.f15818b.new c(), this.f15818b.new d(), this.f15818b.new e()));
                    c0372a.f15821f = vq.j.a(obj);
                    c0372a.f15823h = vq.j.a(c0372a);
                    c0372a.f15824j = vq.j.a(obj);
                    c0372a.f15825k = vq.j.a(hVar);
                    c0372a.f15826l = 0;
                    c0372a.f15820e = 1;
                    if (hVar.F(aVarB, c0372a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, o oVar) {
            this.f15815a = gVar;
            this.f15816b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super b01.i.a> hVar, tq.e eVar) {
            Object objA = this.f15815a.a(new C0371a(hVar, this.f15816b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<gx.b, i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(gx.b bVar) {
            c(bVar);
            return i0.f148189a;
        }

        public final void c(gx.b bVar) {
            o.this.d9(new b01.g.SendGlobalEvent(bVar));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<ApplicationData, i0> {
        c() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ApplicationData applicationData) {
            c(applicationData);
            return i0.f148189a;
        }

        public final void c(ApplicationData applicationData) {
            o.this.d9(new b01.g.GoToGenericApplications(applicationData));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.l<dx.b, i0> {
        d() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(dx.b bVar) {
            c(bVar);
            return i0.f148189a;
        }

        public final void c(dx.b bVar) {
            o.this.d9(new b01.g.ShowError(bVar));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<String, i0> {
        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(String str) {
            c(str);
            return i0.f148189a;
        }

        public final void c(String str) {
            o.this.d9(new b01.g.OpenUrlIntent(str));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb01/g$a;", "<unused var>", "Lb01/h;", "Loq/i0;", "<anonymous>", "(Lb01/g$a;Lb01/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<b01.g.a, b01.h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15831e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15831e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<b01.g.c> bVarY1 = o.this.Y1();
                b01.g.c.a aVar = b01.g.c.a.f15791a;
                this.f15831e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b01.g.a aVar, b01.h hVar, tq.e<? super i0> eVar) {
            return o.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb01/g$g;", "action", "Lb01/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb01/g$g;Lb01/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<b01.g.ShowError, b01.h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15834f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b01.g.ShowError showError = (b01.g.ShowError) this.f15834f;
            Object objE = uq.b.e();
            int i15 = this.f15833e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                dx.b domainError = showError.getDomainError();
                this.f15834f = vq.j.a(showError);
                this.f15833e = 1;
                if (oVar.r9(domainError, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b01.g.ShowError showError, b01.h hVar, tq.e<? super i0> eVar) {
            g gVar = o.this.new g(eVar);
            gVar.f15834f = showError;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb01/g$f;", "action", "Lk10/c0;", "Lb01/h$a;", "state", "Lk10/l;", "Lb01/h;", "<anonymous>", "(Lb01/g$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<b01.g.Setup, c0<b01.h.a>, tq.e<? super k10.l<? extends b01.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15838g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b01.h.Initialized O(b01.g.Setup setup, b01.h.a aVar) {
            return new b01.h.Initialized(setup.getGroup());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final b01.g.Setup setup = (b01.g.Setup) this.f15837f;
            c0 c0Var = (c0) this.f15838g;
            uq.b.e();
            if (this.f15836e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: b01.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.h.O(setup, (h.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b01.g.Setup setup, c0<b01.h.a> c0Var, tq.e<? super k10.l<? extends b01.h>> eVar) {
            h hVar = new h(eVar);
            hVar.f15837f = setup;
            hVar.f15838g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb01/g$b;", "action", "Lb01/h$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb01/g$b;Lb01/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<b01.g.GoToGenericApplications, b01.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15840f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b01.g.GoToGenericApplications goToGenericApplications = (b01.g.GoToGenericApplications) this.f15840f;
            Object objE = uq.b.e();
            int i15 = this.f15839e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<b01.g.c> bVarY1 = o.this.Y1();
                b01.g.c.GoToGenericApplications goToGenericApplications2 = new b01.g.c.GoToGenericApplications(goToGenericApplications.getData());
                this.f15840f = vq.j.a(goToGenericApplications);
                this.f15839e = 1;
                if (bVarY1.F(goToGenericApplications2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b01.g.GoToGenericApplications goToGenericApplications, b01.h.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = o.this.new i(eVar);
            iVar.f15840f = goToGenericApplications;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb01/g$e;", "action", "Lb01/h$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb01/g$e;Lb01/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<b01.g.SendGlobalEvent, b01.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15843f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b01.g.SendGlobalEvent sendGlobalEvent = (b01.g.SendGlobalEvent) this.f15843f;
            uq.b.e();
            if (this.f15842e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            o.this.globalEventManager.c(sendGlobalEvent.getGlobalEvent());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b01.g.SendGlobalEvent sendGlobalEvent, b01.h.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = o.this.new j(eVar);
            jVar.f15843f = sendGlobalEvent;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb01/g$d;", "action", "Lb01/h$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb01/g$d;Lb01/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<b01.g.OpenUrlIntent, b01.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15845e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15846f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b01.g.OpenUrlIntent openUrlIntent = (b01.g.OpenUrlIntent) this.f15846f;
            Object objE = uq.b.e();
            int i15 = this.f15845e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = o.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrlIntent.getUrl(), false, 2, null);
                this.f15846f = vq.j.a(openUrlIntent);
                this.f15845e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            o oVar = o.this;
            if (iVar instanceof dx.i.Left) {
                oVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b01.g.OpenUrlIntent openUrlIntent, b01.h.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = o.this.new k(eVar);
            kVar.f15846f = openUrlIntent;
            return kVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, c01.b bVar, ib4.c cVar, gx.d dVar, w wVar, i70.n nVar) {
        this.applicationFormListScreenMapper = bVar;
        this.genericDomainErrorMapper = cVar;
        this.globalEventManager = dVar;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.stateMachine = aVar.a(b01.h.a.f15798a, new er.l() { // from class: b01.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f15804a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new b01.g.c.ShowError(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: b01.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9((ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            return i0.f148189a;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final o oVar, v vVar) {
        vVar.c(q0.c(b01.h.class), new er.l() { // from class: b01.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.w9(this.f15805a, (z) obj);
            }
        });
        vVar.c(q0.c(b01.h.a.class), new er.l() { // from class: b01.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.x9((z) obj);
            }
        });
        vVar.c(q0.c(b01.h.Initialized.class), new er.l() { // from class: b01.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.y9(this.f15806a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(o oVar, z zVar) {
        f fVar = oVar.new f(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(b01.g.a.class), oVar2, fVar);
        zVar.x(q0.c(b01.g.ShowError.class), oVar2, oVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(z zVar) {
        h hVar = new h(null);
        zVar.v(q0.c(b01.g.Setup.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(o oVar, z zVar) {
        i iVar = oVar.new i(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(b01.g.GoToGenericApplications.class), oVar2, iVar);
        zVar.x(q0.c(b01.g.SendGlobalEvent.class), oVar2, oVar.new j(null));
        zVar.x(q0.c(b01.g.OpenUrlIntent.class), oVar2, oVar.new k(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<b01.g.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<b01.h, b01.g> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<b01.i.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(b01.i.a aVar) {
        super.P5(aVar);
    }

    public void u9(ApplicationFormServiceGroup group) {
        d9(new b01.g.Setup(group));
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
