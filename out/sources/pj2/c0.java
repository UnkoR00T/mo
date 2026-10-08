package pj2;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lpj2/c0;", "Ll00/g;", "Lpj2/u;", "Lpj2/t;", "Lpj2/v;", "", "Lyy/a;", "stateMachineFactory", "Lqj2/f;", "mapper", "La14/w;", "openUrlIntentUseCase", "Lib4/c;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "<init>", "(Lyy/a;Lqj2/f;La14/w;Lib4/c;Lhb4/d;)V", "state", "Lpj2/v$a;", "r9", "(Lpj2/u;)Lpj2/v$a;", "b", "Lqj2/f;", "c", "La14/w;", "d", "Lib4/c;", "e", "Lhb4/d;", "Lpj2/u$b;", "f", "Lpj2/u$b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lpj2/t$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "legalinformation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<u, t> implements v, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qj2.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u.b initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<u, t> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<t.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<v.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<v.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f157948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f157949b;

        /* JADX INFO: renamed from: pj2.c0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3918a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f157950a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f157951b;

            /* JADX INFO: renamed from: pj2.c0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3919a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f157952d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f157953e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f157954f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f157956h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f157957j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f157958k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f157959l;

                public C3919a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f157952d = obj;
                    this.f157953e |= PKIFailureInfo.systemUnavail;
                    return C3918a.this.F(null, this);
                }
            }

            public C3918a(mu.h hVar, c0 c0Var) {
                this.f157950a = hVar;
                this.f157951b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3919a c3919a;
                if (eVar instanceof C3919a) {
                    c3919a = (C3919a) eVar;
                    int i15 = c3919a.f157953e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3919a.f157953e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3919a = new C3919a(eVar);
                    }
                } else {
                    c3919a = new C3919a(eVar);
                }
                Object obj2 = c3919a.f157952d;
                Object objE = uq.b.e();
                int i16 = c3919a.f157953e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f157950a;
                    v.a aVarR9 = this.f157951b.r9((u) obj);
                    c3919a.f157954f = vq.j.a(obj);
                    c3919a.f157956h = vq.j.a(c3919a);
                    c3919a.f157957j = vq.j.a(obj);
                    c3919a.f157958k = vq.j.a(hVar);
                    c3919a.f157959l = 0;
                    c3919a.f157953e = 1;
                    if (hVar.F(aVarR9, c3919a) == objE) {
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

        public a(mu.g gVar, c0 c0Var) {
            this.f157948a = gVar;
            this.f157949b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super v.a> hVar, tq.e eVar) {
            Object objA = this.f157948a.a(new C3918a(hVar, this.f157949b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpj2/t$a;", "<unused var>", "Lpj2/u$b;", "Loq/i0;", "<anonymous>", "(Lpj2/t$a;Lpj2/u$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<t.a, u.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157960e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157960e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<t.c> bVarY1 = c0.this.Y1();
                t.c.a aVar = t.c.a.f158015a;
                this.f157960e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t.a aVar, u.b bVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpj2/t$d;", "<unused var>", "Lk10/c0;", "Lpj2/u$b;", "state", "Lk10/l;", "Lpj2/u;", "<anonymous>", "(Lpj2/t$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<t.d, k10.c0<u.b>, tq.e<? super k10.l<? extends u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157963f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u.c O(u.b bVar) {
            return u.c.f158020a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f157963f;
            uq.b.e();
            if (this.f157962e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: pj2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.c.O((u.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.d dVar, k10.c0<u.b> c0Var, tq.e<? super k10.l<? extends u>> eVar) {
            c cVar = new c(eVar);
            cVar.f157963f = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpj2/t$a;", "<unused var>", "Lpj2/u$c;", "Loq/i0;", "<anonymous>", "(Lpj2/t$a;Lpj2/u$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<t.a, u.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157964e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157964e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<t.c> bVarY1 = c0.this.Y1();
                t.c.a aVar = t.c.a.f158015a;
                this.f157964e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t.a aVar, u.c cVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpj2/t$b;", "<unused var>", "Lk10/c0;", "Lpj2/u$c;", "state", "Lk10/l;", "Lpj2/u;", "<anonymous>", "(Lpj2/t$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<t.b, k10.c0<u.c>, tq.e<? super k10.l<? extends u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157967f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u.b O(u.c cVar) {
            return u.b.f158019a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f157967f;
            uq.b.e();
            if (this.f157966e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: pj2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.e.O((u.c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.b bVar, k10.c0<u.c> c0Var, tq.e<? super k10.l<? extends u>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f157967f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpj2/t$e;", "action", "Lk10/c0;", "Lpj2/u;", "state", "Lk10/l;", "<anonymous>", "(Lpj2/t$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<t.OpenUrl, k10.c0<u>, tq.e<? super k10.l<? extends u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f157970g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u.Error V(final c0 c0Var, dx.b.Business business, u uVar) {
            return new u.Error(c0Var.errorVMSFactory.a(c0Var.errorMapper.b(new ib4.c.Params(business, false, new er.l() { // from class: pj2.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return c0.f.X(c0Var, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(c0 c0Var, ib4.c.b bVar) {
            c0Var.d9(t.a.f158013a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t.OpenUrl openUrl = (t.OpenUrl) this.f157969f;
            k10.c0 c0Var = (k10.c0) this.f157970g;
            Object objE = uq.b.e();
            int i15 = this.f157968e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = c0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f157969f = vq.j.a(openUrl);
                this.f157970g = c0Var;
                this.f157968e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            final c0 c0Var2 = c0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: pj2.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.f.V(c0Var2, business, (u) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(t.OpenUrl openUrl, k10.c0<u> c0Var, tq.e<? super k10.l<? extends u>> eVar) {
            f fVar = c0.this.new f(eVar);
            fVar.f157969f = openUrl;
            fVar.f157970g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpj2/t$a;", "<unused var>", "Lk10/c0;", "Lpj2/u$a;", "state", "Lk10/l;", "Lpj2/u;", "<anonymous>", "(Lpj2/t$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<t.a, k10.c0<u.Error>, tq.e<? super k10.l<? extends u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157973f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u.b O(u.Error error) {
            return u.b.f158019a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f157973f;
            uq.b.e();
            if (this.f157972e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: pj2.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.g.O((u.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.a aVar, k10.c0<u.Error> c0Var, tq.e<? super k10.l<? extends u>> eVar) {
            g gVar = new g(eVar);
            gVar.f157973f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    public c0(yy.a aVar, qj2.f fVar, a14.w wVar, ib4.c cVar, hb4.d dVar) {
        this.mapper = fVar;
        this.openUrlIntentUseCase = wVar;
        this.errorMapper = cVar;
        this.errorVMSFactory = dVar;
        u.b bVar = u.b.f158019a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: pj2.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.u9(this.f158024a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), r9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v.a r9(u state) {
        return this.mapper.b(new qj2.f.Params(state, new er.l() { // from class: pj2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.s9(this.f157938a, (String) obj);
            }
        }, b9(t.d.f158016a), b9(t.a.f158013a), b9(t.b.f158014a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s9(c0 c0Var, String str) {
        c0Var.d9(new t.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(final c0 c0Var, k10.v vVar) {
        vVar.c(q0.c(u.b.class), new er.l() { // from class: pj2.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.v9(this.f158025a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(u.c.class), new er.l() { // from class: pj2.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.w9(this.f158026a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(u.class), new er.l() { // from class: pj2.z
            @Override // er.l
            public final Object b(Object obj) {
                return c0.x9(this.f158027a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(u.Error.class), new er.l() { // from class: pj2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.y9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(c0 c0Var, k10.z zVar) {
        b bVar = c0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t.a.class), oVar, bVar);
        zVar.v(q0.c(t.d.class), oVar, new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(c0 c0Var, k10.z zVar) {
        d dVar = c0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t.a.class), oVar, dVar);
        zVar.v(q0.c(t.b.class), oVar, new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(c0 c0Var, k10.z zVar) {
        f fVar = c0Var.new f(null);
        zVar.v(q0.c(t.OpenUrl.class), k10.o.CANCEL_PREVIOUS, fVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(k10.z zVar) {
        g gVar = new g(null);
        zVar.v(q0.c(t.a.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<t.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<u, t> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(v.a aVar) {
        super.P5(aVar);
    }
}
