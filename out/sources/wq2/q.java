package wq2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p127vq2.e0;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B3\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00142\u0006\u0010(\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\u00142\u0006\u0010(\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208H\u0096\u0001¢\u0006\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010T\u001a\b\u0012\u0004\u0012\u00020R0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bF\u0010PR&\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00190U8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010\u001d\u001a\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lwq2/q;", "Ll00/g;", "Lwq2/h;", "Lwq2/e;", "", "Lwq2/g;", "Lwq2/i;", "Lwq2/a;", "Lyy/a;", "stateMachineFactory", "Lxq2/a;", "screenMapper", "dataSourceContract", "Lmx/c;", "labelProvider", "Lwq2/f;", "setupData", "<init>", "(Lyy/a;Lxq2/a;Lwq2/a;Lmx/c;Lwq2/f;)V", "Lkotlin/Function0;", "Loq/i0;", "onExit", "Lcb4/d;", "n9", "(Ler/a;)Lcb4/d;", "Lwq2/i$a;", "p9", "(Lwq2/h;)Lwq2/i$a;", "A", "()V", "p8", "Lvq2/e0;", "invalidationStep", "O6", "(Lvq2/e0;)V", "Ljb4/b;", "errorData", "P6", "(Ljb4/b;)V", "Lgr2/a$a;", "data", "G7", "(Lgr2/a$a;)V", "Lar2/a$a;", "W7", "(Lar2/a$a;)V", "Ldr2/a$a;", "N1", "(Ldr2/a$a;)V", "Lmr2/a$b;", "c", "()Lmr2/a$b;", "Lmr2/a$a;", "invalidateData", "t6", "(Lmr2/a$a;)V", "Ljr2/a$a;", "t4", "()Ljr2/a$a;", "b", "Lxq2/a;", "Lwq2/a;", "d", "Lmx/c;", "e", "Lwq2/f;", "f", "Lwq2/h;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwq2/e$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lwq2/e$d;", "j", "nestedNavAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, wq2.e> implements zx.d, g, i, wq2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xq2.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wq2.a dataSourceContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, wq2.e> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wq2.e.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wq2.e.d> nestedNavAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<i.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f214440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f214441b;

        /* JADX INFO: renamed from: wq2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5686a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f214442a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f214443b;

            /* JADX INFO: renamed from: wq2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5687a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f214444d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f214445e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f214446f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f214448h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f214449j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f214450k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f214451l;

                public C5687a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f214444d = obj;
                    this.f214445e |= PKIFailureInfo.systemUnavail;
                    return C5686a.this.F(null, this);
                }
            }

            public C5686a(mu.h hVar, q qVar) {
                this.f214442a = hVar;
                this.f214443b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5687a c5687a;
                if (eVar instanceof C5687a) {
                    c5687a = (C5687a) eVar;
                    int i15 = c5687a.f214445e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5687a.f214445e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5687a = new C5687a(eVar);
                    }
                } else {
                    c5687a = new C5687a(eVar);
                }
                Object obj2 = c5687a.f214444d;
                Object objE = uq.b.e();
                int i16 = c5687a.f214445e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f214442a;
                    i.Data dataP9 = this.f214443b.p9((State) obj);
                    c5687a.f214446f = vq.j.a(obj);
                    c5687a.f214448h = vq.j.a(c5687a);
                    c5687a.f214449j = vq.j.a(obj);
                    c5687a.f214450k = vq.j.a(hVar);
                    c5687a.f214451l = 0;
                    c5687a.f214445e = 1;
                    if (hVar.F(dataP9, c5687a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, q qVar) {
            this.f214440a = gVar;
            this.f214441b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.Data> hVar, tq.e eVar) {
            Object objA = this.f214440a.a(new C5686a(hVar, this.f214441b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwq2/e$c;", "action", "Lwq2/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwq2/e$c;Lwq2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<wq2.e.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214453f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wq2.e.c cVar = (wq2.e.c) this.f214453f;
            Object objE = uq.b.e();
            int i15 = this.f214452e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wq2.e.c> bVarY1 = q.this.Y1();
                this.f214453f = vq.j.a(cVar);
                this.f214452e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wq2.e.c cVar, State state, tq.e<? super i0> eVar) {
            b bVar = q.this.new b(eVar);
            bVar.f214453f = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwq2/e$d;", "action", "Lwq2/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwq2/e$d;Lwq2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<wq2.e.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214456f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wq2.e.d dVar = (wq2.e.d) this.f214456f;
            Object objE = uq.b.e();
            int i15 = this.f214455e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wq2.e.d> bVarG = q.this.g();
                this.f214456f = vq.j.a(dVar);
                this.f214455e = 1;
                if (bVarG.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wq2.e.d dVar, State state, tq.e<? super i0> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f214456f = dVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwq2/e$e;", "action", "Lk10/c0;", "Lwq2/h;", "state", "Lk10/l;", "<anonymous>", "(Lwq2/e$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<wq2.e.OnEnterInvalidationStep, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f214460g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(wq2.e.OnEnterInvalidationStep onEnterInvalidationStep, State state) {
            return State.b(state, false, null, onEnterInvalidationStep.getStep(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wq2.e.OnEnterInvalidationStep onEnterInvalidationStep = (wq2.e.OnEnterInvalidationStep) this.f214459f;
            c0 c0Var = (c0) this.f214460g;
            uq.b.e();
            if (this.f214458e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: wq2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(onEnterInvalidationStep, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wq2.e.OnEnterInvalidationStep onEnterInvalidationStep, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f214459f = onEnterInvalidationStep;
            dVar.f214460g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwq2/e$a;", "<unused var>", "Lwq2/h;", "state", "Loq/i0;", "<anonymous>", "(Lwq2/e$a;Lwq2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<wq2.e.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214462f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f214462f;
            uq.b.e();
            if (this.f214461e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0 currentStep = state.getCurrentStep();
            if (v.c0(state.d(), currentStep)) {
                q.this.d9(wq2.e.c.C5684c.f214411a);
            } else if (!fr.t.c(currentStep, e0.d.f207926a)) {
                q.this.d9(wq2.e.d.a.f214413a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wq2.e.a aVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f214462f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwq2/e$b;", "<unused var>", "Lwq2/h;", "state", "Loq/i0;", "<anonymous>", "(Lwq2/e$b;Lwq2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<wq2.e.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214465f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f214465f;
            uq.b.e();
            if (this.f214464e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(state.getCurrentStep(), e0.d.f207926a)) {
                q.this.d9(wq2.e.c.b.f214410a);
            } else {
                q qVar = q.this;
                q qVar2 = q.this;
                qVar.d9(new wq2.e.c.ShowDialog(qVar2.n9(qVar2.b9(wq2.e.c.C5684c.f214411a))));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wq2.e.b bVar, State state, tq.e<? super i0> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f214465f = state;
            return fVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, xq2.a aVar2, wq2.a aVar3, mx.c cVar, SetupData setupData) {
        List listE;
        this.screenMapper = aVar2;
        this.dataSourceContract = aVar3;
        this.labelProvider = cVar;
        this.setupData = setupData;
        boolean z15 = setupData.getPassportNumberFromEntry() != null;
        if (z15) {
            listE = v.q(e0.b.f207922a, e0.c.f207924a);
        } else {
            if (z15) {
                throw new oq.p();
            }
            listE = v.e(e0.b.f207922a);
        }
        State state = new State(z15, listE, null, 4, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: wq2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f214430a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.nestedNavAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData n9(er.a<i0> onExit) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(qq2.a.f168118i), null, new DialogButtonTextData(this.labelProvider.c(qq2.a.f168107c), null, onExit, 2, null), new DialogButtonTextData(this.labelProvider.c(qq2.a.f168128s), null, new er.a() { // from class: wq2.o
            @Override // er.a
            public final Object a() {
                return q.o9();
            }
        }, 2, null), null, null, 100, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.Data p9(State state) {
        return this.screenMapper.b(new xq2.a.Params(state, b9(wq2.e.a.f214407a), b9(wq2.e.b.f214408a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: wq2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f214429a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(wq2.e.c.class), oVar, bVar);
        zVar.x(q0.c(wq2.e.d.class), oVar, qVar.new c(null));
        zVar.v(q0.c(wq2.e.OnEnterInvalidationStep.class), oVar, new d(null));
        zVar.x(q0.c(wq2.e.a.class), oVar, qVar.new e(null));
        zVar.x(q0.c(wq2.e.b.class), oVar, qVar.new f(null));
        return i0.f148189a;
    }

    @Override // wq2.g
    public void A() {
        d9(wq2.e.a.f214407a);
    }

    @Override // gr2.a
    public void G7(gr2.a.Data data) {
        this.dataSourceContract.G7(data);
    }

    @Override // dr2.a
    public void N1(dr2.a.Data data) {
        this.dataSourceContract.N1(data);
    }

    @Override // wq2.g
    public void O6(e0 invalidationStep) {
        d9(new wq2.e.OnEnterInvalidationStep(invalidationStep));
    }

    @Override // wq2.g
    public void P6(jb4.b errorData) {
        d9(new wq2.e.c.Error(errorData));
    }

    @Override // ar2.a
    public void W7(ar2.a.Data data) {
        this.dataSourceContract.W7(data);
    }

    @Override // zx.b
    public xw.b<wq2.e.c> Y1() {
        return this.navAction;
    }

    @Override // mr2.a
    public mr2.a.SummaryData c() {
        return this.dataSourceContract.c();
    }

    @Override // l00.g
    protected k10.t<State, wq2.e> e9() {
        return this.stateMachine;
    }

    @Override // wq2.g
    public xw.b<wq2.e.d> g() {
        return this.nestedNavAction;
    }

    @Override // l00.e
    public p0<i.Data> getState() {
        return this.state;
    }

    @Override // wq2.g
    public void p8() {
        d9(wq2.e.b.f214408a);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // jr2.a
    public jr2.a.SuccessData t4() {
        return this.dataSourceContract.t4();
    }

    @Override // mr2.a
    public void t6(mr2.a.InvalidateData invalidateData) {
        this.dataSourceContract.t6(invalidateData);
    }
}
