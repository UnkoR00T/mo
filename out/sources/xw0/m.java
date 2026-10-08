package xw0;

import a14.w;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ww0.AboutApplicationSetupData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030;8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u0010H¨\u0006J"}, d2 = {"Lxw0/m;", "Ll00/g;", "Lxw0/g;", "", "Lxw0/h;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lvw0/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Ltw0/a;", "isAppUpdateAvailableUC", "La14/q;", "goToStoreIntentUseCase", "Lb14/b;", "getAppVersionUC", "Lww0/a;", "setupData", "<init>", "(Lyy/a;Lvw0/a;La14/w;Li70/n;Ltw0/a;La14/q;Lb14/b;Lww0/a;)V", "state", "Lxw0/h$a;", "q9", "(Lxw0/g;)Lxw0/h$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lvw0/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Ltw0/a;", "f", "La14/q;", "g", "Lb14/b;", "h", "Lww0/a;", "Lxw/b;", "Lxw0/d;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lxw0/g$b;", "k", "Lxw0/g$b;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "aboutapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<g, Object> implements h, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vw0.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final tw0.a isAppUpdateAvailableUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b14.b getAppVersionUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AboutApplicationSetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xw0.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g.b initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t<g, Object> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<h.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f221680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f221681b;

        /* JADX INFO: renamed from: xw0.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5931a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f221682a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f221683b;

            /* JADX INFO: renamed from: xw0.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5932a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f221684d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f221685e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f221686f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f221688h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f221689j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f221690k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f221691l;

                public C5932a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f221684d = obj;
                    this.f221685e |= PKIFailureInfo.systemUnavail;
                    return C5931a.this.F(null, this);
                }
            }

            public C5931a(mu.h hVar, m mVar) {
                this.f221682a = hVar;
                this.f221683b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5932a c5932a;
                if (eVar instanceof C5932a) {
                    c5932a = (C5932a) eVar;
                    int i15 = c5932a.f221685e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5932a.f221685e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5932a = new C5932a(eVar);
                    }
                } else {
                    c5932a = new C5932a(eVar);
                }
                Object obj2 = c5932a.f221684d;
                Object objE = uq.b.e();
                int i16 = c5932a.f221685e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f221682a;
                    h.a aVarQ9 = this.f221683b.q9((g) obj);
                    c5932a.f221686f = vq.j.a(obj);
                    c5932a.f221688h = vq.j.a(c5932a);
                    c5932a.f221689j = vq.j.a(obj);
                    c5932a.f221690k = vq.j.a(hVar);
                    c5932a.f221691l = 0;
                    c5932a.f221685e = 1;
                    if (hVar.F(aVarQ9, c5932a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f221680a = gVar;
            this.f221681b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.a> hVar, tq.e eVar) {
            Object objA = this.f221680a.a(new C5931a(hVar, this.f221681b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lxw0/g$b;", "state", "Lk10/l;", "Lxw0/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<g.b>, tq.e<? super k10.l<? extends g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221693f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.Content O(m mVar, String str, g.b bVar) {
            return new g.Content(null, mVar.setupData.getShouldShowKPOLogo(), str, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f221693f;
            uq.b.e();
            if (this.f221692e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final String strA = m.this.getAppVersionUC.a(gz.b.a.C1792a.f78542a);
            final m mVar = m.this;
            return c0Var.d(new er.l() { // from class: xw0.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.b.O(mVar, strA, (g.b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<g.b> c0Var, tq.e<? super k10.l<? extends g>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f221693f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lxw0/g$a;", "state", "Lk10/l;", "Lxw0/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<g.Content>, tq.e<? super k10.l<? extends g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221696f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.Content O(jx.b.a aVar, g.Content content) {
            return g.Content.b(content, aVar, false, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f221696f;
            Object objE = uq.b.e();
            int i15 = this.f221695e;
            if (i15 == 0) {
                u.b(obj);
                tw0.a aVar = m.this.isAppUpdateAvailableUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f221696f = c0Var;
                this.f221695e = 1;
                obj = aVar.a(c1792a, this);
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
            if (iVar instanceof dx.i.Left) {
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final jx.b.a aVar2 = (jx.b.a) ((dx.i.Right) iVar).b();
            return c0Var.b(new er.l() { // from class: xw0.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.c.O(aVar2, (g.Content) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<g.Content> c0Var, tq.e<? super k10.l<? extends g>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f221696f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxw0/d;", "action", "Lxw0/g$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxw0/d;Lxw0/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<xw0.d, g.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221699f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xw0.d dVar = (xw0.d) this.f221699f;
            Object objE = uq.b.e();
            int i15 = this.f221698e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xw0.d> bVarY1 = m.this.Y1();
                this.f221699f = vq.j.a(dVar);
                this.f221698e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(xw0.d dVar, g.Content content, tq.e<? super i0> eVar) {
            d dVar2 = m.this.new d(eVar);
            dVar2.f221699f = dVar;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxw0/f;", "<unused var>", "Lxw0/g$a;", "Loq/i0;", "<anonymous>", "(Lxw0/f;Lxw0/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xw0.f, g.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221701e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221701e;
            if (i15 == 0) {
                u.b(obj);
                a14.q qVar = m.this.goToStoreIntentUseCase;
                a14.q.Params params = new a14.q.Params(null);
                this.f221701e = 1;
                obj = qVar.c(params, this);
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
            m mVar = m.this;
            if (iVar instanceof dx.i.Left) {
                mVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xw0.f fVar, g.Content content, tq.e<? super i0> eVar) {
            return m.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxw0/e;", "action", "Lxw0/g$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxw0/e;Lxw0/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OpenUrl, g.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221704f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f221704f;
            Object objE = uq.b.e();
            int i15 = this.f221703e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = m.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f221704f = vq.j.a(openUrl);
                this.f221703e = 1;
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
            m mVar = m.this;
            if (iVar instanceof dx.i.Left) {
                mVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, g.Content content, tq.e<? super i0> eVar) {
            f fVar = m.this.new f(eVar);
            fVar.f221704f = openUrl;
            return fVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, vw0.a aVar2, w wVar, i70.n nVar, tw0.a aVar3, a14.q qVar, b14.b bVar, AboutApplicationSetupData aboutApplicationSetupData) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.isAppUpdateAvailableUC = aVar3;
        this.goToStoreIntentUseCase = qVar;
        this.getAppVersionUC = bVar;
        this.setupData = aboutApplicationSetupData;
        g.b bVar2 = g.b.f221656a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: xw0.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.t9(this.f221668a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), q9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.a q9(g state) {
        return this.mapper.b(new vw0.a.Params(state, new er.l() { // from class: xw0.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.r9(this.f221667a, (String) obj);
            }
        }, b9(xw0.d.c.f221649a), b9(xw0.d.b.f221648a), b9(xw0.f.f221651a), b9(xw0.d.a.f221647a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(m mVar, String str) {
        mVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final m mVar, v vVar) {
        vVar.c(q0.c(g.b.class), new er.l() { // from class: xw0.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.u9(this.f221665a, (z) obj);
            }
        });
        vVar.c(q0.c(g.Content.class), new er.l() { // from class: xw0.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.v9(this.f221666a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(m mVar, z zVar) {
        zVar.A(mVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(m mVar, z zVar) {
        zVar.A(mVar.new c(null));
        d dVar = mVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xw0.d.class), oVar, dVar);
        zVar.x(q0.c(xw0.f.class), oVar, mVar.new e(null));
        zVar.x(q0.c(OpenUrl.class), oVar, mVar.new f(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<xw0.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<g, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AboutApplicationSetupData aboutApplicationSetupData) {
        super.P5(aboutApplicationSetupData);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
