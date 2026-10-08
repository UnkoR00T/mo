package k41;

import bl0.BEChildBirthChildData;
import fr.q0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u0002*\u00020\u0002H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0$H\u0002¢\u0006\u0004\b'\u0010(JS\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0$2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0$H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010#\u001a\b\u0012\u0004\u0012\u00020/0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lk41/x;", "Ll00/g;", "Lk41/c;", "Lk41/a;", "Lk41/d;", "", "Lyy/a;", "stateMachineFactory", "Lm41/f;", "mapper", "Lez/a;", "currentTimeProvider", "Lmx/c;", "labelProvider", "Lo31/g;", "validateNameUC", "Lo31/e;", "validateChildSecondNameUC", "Lo31/h;", "validateSurnameUC", "Lq31/c;", "exitDialogMapper", "Ll41/a;", "contract", "<init>", "(Lyy/a;Lm41/f;Lez/a;Lmx/c;Lo31/g;Lo31/e;Lo31/h;Lq31/c;Ll41/a;)V", "", "Lk41/b;", "E9", "()Ljava/util/List;", "M9", "(Lk41/c;Ltq/e;)Ljava/lang/Object;", "", "index", "Lk10/c0;", "state", "Lkotlin/Function1;", "update", "Lk10/l;", "K9", "(ILk10/c0;Ler/l;)Lk10/l;", "Lk41/b$a;", "updateData", "Lk41/b$b;", "updateValidations", "I9", "(ILk10/c0;Ler/l;Ler/l;)Lk10/l;", "Lk41/d$a;", "x9", "(Lk41/c;)Lk41/d$a;", "b", "Lm41/f;", "c", "Lez/a;", "d", "Lmx/c;", "e", "Lo31/g;", "f", "Lo31/e;", "g", "Lo31/h;", "h", "Lq31/c;", "j", "Ll41/a;", "k", "Lk41/c;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lk41/a$b;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<State, k41.a> implements k41.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m41.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o31.g validateNameUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o31.e validateChildSecondNameUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o31.h validateSurnameUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l41.a contract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, k41.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k41.a.b> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<k41.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<k41.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f108327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f108328b;

        /* JADX INFO: renamed from: k41.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2576a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f108329a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f108330b;

            /* JADX INFO: renamed from: k41.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2577a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f108331d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f108332e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f108333f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f108335h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f108336j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f108337k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f108338l;

                public C2577a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f108331d = obj;
                    this.f108332e |= PKIFailureInfo.systemUnavail;
                    return C2576a.this.F(null, this);
                }
            }

            public C2576a(mu.h hVar, x xVar) {
                this.f108329a = hVar;
                this.f108330b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2577a c2577a;
                if (eVar instanceof C2577a) {
                    c2577a = (C2577a) eVar;
                    int i15 = c2577a.f108332e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2577a.f108332e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2577a = new C2577a(eVar);
                    }
                } else {
                    c2577a = new C2577a(eVar);
                }
                Object obj2 = c2577a.f108331d;
                Object objE = uq.b.e();
                int i16 = c2577a.f108332e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f108329a;
                    k41.d.Data dataX9 = this.f108330b.x9((State) obj);
                    c2577a.f108333f = vq.j.a(obj);
                    c2577a.f108335h = vq.j.a(c2577a);
                    c2577a.f108336j = vq.j.a(obj);
                    c2577a.f108337k = vq.j.a(hVar);
                    c2577a.f108338l = 0;
                    c2577a.f108332e = 1;
                    if (hVar.F(dataX9, c2577a) == objE) {
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

        public a(mu.g gVar, x xVar) {
            this.f108327a = gVar;
            this.f108328b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k41.d.Data> hVar, tq.e eVar) {
            Object objA = this.f108327a.a(new C2576a(hVar, this.f108328b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk41/a$i;", "<unused var>", "Lk41/c;", "Loq/i0;", "<anonymous>", "(Lk41/a$i;Lk41/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<k41.a.i, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108339e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f108341e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x f108342f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f108342f = xVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f108341e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    xw.b<k41.a.b> bVarY1 = this.f108342f.Y1();
                    k41.a.b.C2574b c2574b = k41.a.b.C2574b.f108246a;
                    this.f108341e = 1;
                    if (bVarY1.F(c2574b, this) == objE) {
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

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f108342f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(x xVar) {
            i00.a.a(xVar, new a(xVar, null));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108339e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<k41.a.b> bVarY1 = x.this.Y1();
                q31.c cVar = x.this.exitDialogMapper;
                final x xVar = x.this;
                k41.a.b.ShowDialog showDialog = new k41.a.b.ShowDialog(cVar.b(new q31.c.Params(new er.a() { // from class: k41.y
                    @Override // er.a
                    public final Object a() {
                        return x.b.O(xVar);
                    }
                })));
                this.f108339e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k41.a.i iVar, State state, tq.e<? super oq.i0> eVar) {
            return x.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk41/a$b;", "action", "Lk41/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lk41/a$b;Lk41/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<k41.a.b, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108344f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k41.a.b bVar = (k41.a.b) this.f108344f;
            Object objE = uq.b.e();
            int i15 = this.f108343e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<k41.a.b> bVarY1 = x.this.Y1();
                this.f108344f = vq.j.a(bVar);
                this.f108343e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(k41.a.b bVar, State state, tq.e<? super oq.i0> eVar) {
            c cVar = x.this.new c(eVar);
            cVar.f108344f = bVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk41/a$a;", "<unused var>", "Lk10/c0;", "Lk41/c;", "state", "Lk10/l;", "<anonymous>", "(Lk41/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<k41.a.C2572a, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108347f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(pq.v.M0(state.b(), new ChildDataWithValidation(null, null, 3, null).a(ChildDataWithValidation.Child.b(new ChildDataWithValidation.Child(null, null, null, null, null, 31, null), null, null, ((ChildDataWithValidation) pq.v.l0(state.b())).getChildData().getSurname(), null, ((ChildDataWithValidation) pq.v.l0(state.b())).getChildData().getBirthDate(), 11, null), ChildDataWithValidation.ChildValidations.b(new ChildDataWithValidation.ChildValidations(null, null, null, null, 15, null), null, null, ((ChildDataWithValidation) pq.v.l0(state.b())).getValidations().getSurname(), ((ChildDataWithValidation) pq.v.l0(state.b())).getValidations().getBirthDate(), 3, null))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f108347f;
            uq.b.e();
            if (this.f108346e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: k41.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.d.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k41.a.C2572a c2572a, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f108347f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk41/a$g;", "action", "Lk10/c0;", "Lk41/c;", "state", "Lk10/l;", "<anonymous>", "(Lk41/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<k41.a.RemoveChildSection, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f108350g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k41.a.RemoveChildSection removeChildSection, State state) {
            List listI1 = pq.v.i1(state.b());
            listI1.remove(removeChildSection.getIndex());
            return state.a(pq.v.f1(listI1));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k41.a.RemoveChildSection removeChildSection = (k41.a.RemoveChildSection) this.f108349f;
            k10.c0 c0Var = (k10.c0) this.f108350g;
            uq.b.e();
            if (this.f108348e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: k41.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(removeChildSection, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k41.a.RemoveChildSection removeChildSection, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f108349f = removeChildSection;
            eVar2.f108350g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk41/a$d;", "action", "Lk10/c0;", "Lk41/c;", "state", "Lk10/l;", "<anonymous>", "(Lk41/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<k41.a.OnNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f108353g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChildDataWithValidation.Child V(k41.a.OnNameChanged onNameChanged, ChildDataWithValidation.Child child) {
            return ChildDataWithValidation.Child.b(child, onNameChanged.getName(), null, null, null, null, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChildDataWithValidation.ChildValidations X(ChildDataWithValidation.ChildValidations childValidations) {
            return ChildDataWithValidation.ChildValidations.b(childValidations, hz.b.C2039b.f86846c, null, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k41.a.OnNameChanged onNameChanged = (k41.a.OnNameChanged) this.f108352f;
            k10.c0 c0Var = (k10.c0) this.f108353g;
            uq.b.e();
            if (this.f108351e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return x.this.I9(onNameChanged.getIndex(), c0Var, new er.l() { // from class: k41.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.f.V(onNameChanged, (ChildDataWithValidation.Child) obj2);
                }
            }, new er.l() { // from class: k41.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.f.X((ChildDataWithValidation.ChildValidations) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(k41.a.OnNameChanged onNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = x.this.new f(eVar);
            fVar.f108352f = onNameChanged;
            fVar.f108353g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk41/a$e;", "action", "Lk10/c0;", "Lk41/c;", "state", "Lk10/l;", "<anonymous>", "(Lk41/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<k41.a.OnSecondNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f108357g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChildDataWithValidation.Child V(k41.a.OnSecondNameChanged onSecondNameChanged, ChildDataWithValidation.Child child) {
            return ChildDataWithValidation.Child.b(child, null, onSecondNameChanged.getSecondName(), null, null, null, 29, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChildDataWithValidation.ChildValidations X(ChildDataWithValidation.ChildValidations childValidations) {
            return ChildDataWithValidation.ChildValidations.b(childValidations, null, hz.b.C2039b.f86846c, null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k41.a.OnSecondNameChanged onSecondNameChanged = (k41.a.OnSecondNameChanged) this.f108356f;
            k10.c0 c0Var = (k10.c0) this.f108357g;
            uq.b.e();
            if (this.f108355e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return x.this.I9(onSecondNameChanged.getIndex(), c0Var, new er.l() { // from class: k41.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.V(onSecondNameChanged, (ChildDataWithValidation.Child) obj2);
                }
            }, new er.l() { // from class: k41.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.X((ChildDataWithValidation.ChildValidations) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(k41.a.OnSecondNameChanged onSecondNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = x.this.new g(eVar);
            gVar.f108356f = onSecondNameChanged;
            gVar.f108357g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk41/a$f;", "action", "Lk10/c0;", "Lk41/c;", "state", "Lk10/l;", "<anonymous>", "(Lk41/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<k41.a.OnSurnameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108360f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f108361g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChildDataWithValidation.Child V(k41.a.OnSurnameChanged onSurnameChanged, ChildDataWithValidation.Child child) {
            return ChildDataWithValidation.Child.b(child, null, null, onSurnameChanged.getSurname(), null, null, 27, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChildDataWithValidation.ChildValidations X(ChildDataWithValidation.ChildValidations childValidations) {
            return ChildDataWithValidation.ChildValidations.b(childValidations, null, null, hz.b.C2039b.f86846c, null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k41.a.OnSurnameChanged onSurnameChanged = (k41.a.OnSurnameChanged) this.f108360f;
            k10.c0 c0Var = (k10.c0) this.f108361g;
            uq.b.e();
            if (this.f108359e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return x.this.I9(onSurnameChanged.getIndex(), c0Var, new er.l() { // from class: k41.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.h.V(onSurnameChanged, (ChildDataWithValidation.Child) obj2);
                }
            }, new er.l() { // from class: k41.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.h.X((ChildDataWithValidation.ChildValidations) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(k41.a.OnSurnameChanged onSurnameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = x.this.new h(eVar);
            hVar.f108360f = onSurnameChanged;
            hVar.f108361g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk41/a$c;", "action", "Lk10/c0;", "Lk41/c;", "state", "Lk10/l;", "<anonymous>", "(Lk41/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<k41.a.OnBirthDateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f108365g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChildDataWithValidation.Child V(k41.a.OnBirthDateChanged onBirthDateChanged, ChildDataWithValidation.Child child) {
            return ChildDataWithValidation.Child.b(child, null, null, null, null, onBirthDateChanged.getBirthDate(), 15, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChildDataWithValidation.ChildValidations X(ChildDataWithValidation.ChildValidations childValidations) {
            return ChildDataWithValidation.ChildValidations.b(childValidations, null, null, null, hz.b.C2039b.f86846c, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k41.a.OnBirthDateChanged onBirthDateChanged = (k41.a.OnBirthDateChanged) this.f108364f;
            k10.c0 c0Var = (k10.c0) this.f108365g;
            uq.b.e();
            if (this.f108363e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return x.this.I9(onBirthDateChanged.getIndex(), c0Var, new er.l() { // from class: k41.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.V(onBirthDateChanged, (ChildDataWithValidation.Child) obj2);
                }
            }, new er.l() { // from class: k41.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.X((ChildDataWithValidation.ChildValidations) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(k41.a.OnBirthDateChanged onBirthDateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f108364f = onBirthDateChanged;
            iVar.f108365g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk41/a$h;", "<unused var>", "Lk10/c0;", "Lk41/c;", "state", "Lk10/l;", "<anonymous>", "(Lk41/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<k41.a.h, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108368f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f108368f;
            Object objE = uq.b.e();
            int i15 = this.f108367e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                State state = (State) c0Var.a();
                this.f108368f = c0Var;
                this.f108367e = 1;
                obj = xVar.M9(state, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final State state2 = (State) obj;
            if (!state2.c()) {
                return c0Var.b(new er.l() { // from class: k41.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.j.O(state2, (State) obj2);
                    }
                });
            }
            if (state2.b().isEmpty()) {
                return c0Var.c();
            }
            l41.a aVar = x.this.contract;
            List<ChildDataWithValidation> listB = state2.b();
            x xVar2 = x.this;
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            for (ChildDataWithValidation childDataWithValidation : listB) {
                iy.b0 name = childDataWithValidation.getChildData().getName();
                iy.b0 secondName = childDataWithValidation.getChildData().getSecondName();
                iy.b0 surname = childDataWithValidation.getChildData().getSurname();
                iy.b0 nationality = childDataWithValidation.getChildData().getNationality();
                fz.b.LocalDate birthDate = childDataWithValidation.getChildData().getBirthDate();
                if (birthDate == null) {
                    birthDate = new fz.b.LocalDate(xVar2.currentTimeProvider.c());
                }
                arrayList.add(new BEChildBirthChildData(name, secondName, surname, nationality, birthDate));
            }
            aVar.q5(arrayList);
            x.this.d9(k41.a.b.c.f108247a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k41.a.h hVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f108368f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f108370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f108372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f108373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f108374h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f108375j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f108376k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f108377l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f108378m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f108379n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f108380p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f108381q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f108382r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f108383s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f108384t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f108386w;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108384t = obj;
            this.f108386w |= PKIFailureInfo.systemUnavail;
            return x.this.M9(null, this);
        }
    }

    public x(yy.a aVar, m41.f fVar, ez.a aVar2, mx.c cVar, o31.g gVar, o31.e eVar, o31.h hVar, q31.c cVar2, l41.a aVar3) {
        this.mapper = fVar;
        this.currentTimeProvider = aVar2;
        this.labelProvider = cVar;
        this.validateNameUC = gVar;
        this.validateChildSecondNameUC = eVar;
        this.validateSurnameUC = hVar;
        this.exitDialogMapper = cVar2;
        this.contract = aVar3;
        State state = new State(E9());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: k41.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.G9(this.f108314a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), x9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(x xVar, int i15, iy.b0 b0Var) {
        xVar.d9(new k41.a.OnSecondNameChanged(i15, b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(x xVar, int i15, iy.b0 b0Var) {
        xVar.d9(new k41.a.OnSurnameChanged(i15, b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(final x xVar, final int i15) {
        xVar.d9(new k41.a.b.ShowDatePicker(new uw.j.Single(null, null, new er.l() { // from class: k41.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.D9(this.f108307a, i15, (LocalDate) obj);
            }
        }, null, xVar.currentTimeProvider.c(), 3, null)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(x xVar, int i15, LocalDate localDate) {
        xVar.d9(new k41.a.OnBirthDateChanged(i15, new fz.b.LocalDate(localDate)));
        return oq.i0.f148189a;
    }

    private final List<ChildDataWithValidation> E9() {
        List<BEChildBirthChildData> listF8 = this.contract.f8();
        ArrayList arrayList = new ArrayList(pq.v.y(listF8, 10));
        for (BEChildBirthChildData bEChildBirthChildData : listF8) {
            arrayList.add(new ChildDataWithValidation.Child(bEChildBirthChildData.getName(), bEChildBirthChildData.getSecondName(), bEChildBirthChildData.getSurname(), bEChildBirthChildData.getNationality(), bEChildBirthChildData.getBirthDate()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.isEmpty()) {
            arrayList2.add(new ChildDataWithValidation(null, null, 3, null));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ChildDataWithValidation((ChildDataWithValidation.Child) it.next(), null, 2, null));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: k41.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f108306a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(x xVar, k10.z zVar) {
        b bVar = xVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(k41.a.i.class), oVar, bVar);
        zVar.x(q0.c(k41.a.b.class), oVar, xVar.new c(null));
        zVar.v(q0.c(k41.a.C2572a.class), oVar, new d(null));
        zVar.v(q0.c(k41.a.RemoveChildSection.class), oVar, new e(null));
        zVar.v(q0.c(k41.a.OnNameChanged.class), oVar, xVar.new f(null));
        zVar.v(q0.c(k41.a.OnSecondNameChanged.class), oVar, xVar.new g(null));
        zVar.v(q0.c(k41.a.OnSurnameChanged.class), oVar, xVar.new h(null));
        zVar.v(q0.c(k41.a.OnBirthDateChanged.class), oVar, xVar.new i(null));
        zVar.v(q0.c(k41.a.h.class), oVar, xVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<State> I9(int index, k10.c0<State> state, final er.l<? super ChildDataWithValidation.Child, ChildDataWithValidation.Child> updateData, final er.l<? super ChildDataWithValidation.ChildValidations, ChildDataWithValidation.ChildValidations> updateValidations) {
        return K9(index, state, new er.l() { // from class: k41.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.J9(updateData, updateValidations, (ChildDataWithValidation) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChildDataWithValidation J9(er.l lVar, er.l lVar2, ChildDataWithValidation childDataWithValidation) {
        return childDataWithValidation.a((ChildDataWithValidation.Child) lVar.b(childDataWithValidation.getChildData()), (ChildDataWithValidation.ChildValidations) lVar2.b(childDataWithValidation.getValidations()));
    }

    private final k10.l<State> K9(final int index, final k10.c0<State> state, final er.l<? super ChildDataWithValidation, ChildDataWithValidation> update) {
        return state.b(new er.l() { // from class: k41.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.L9(state, index, update, (State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final State L9(k10.c0 c0Var, int i15, er.l lVar, State state) {
        List listI1 = pq.v.i1(((State) c0Var.a()).b());
        listI1.set(i15, lVar.b(listI1.get(i15)));
        return state.a(listI1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0119  */
    /* JADX WARN: Code duplicated, block: B:24:0x0172  */
    /* JADX WARN: Code duplicated, block: B:27:0x0194  */
    /* JADX WARN: Code duplicated, block: B:29:0x0199  */
    /* JADX WARN: Code duplicated, block: B:31:0x019d  */
    /* JADX WARN: Code duplicated, block: B:34:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x0200  */
    /* JADX WARN: Code duplicated, block: B:38:0x0205  */
    /* JADX WARN: Code duplicated, block: B:42:0x0264  */
    /* JADX WARN: Code duplicated, block: B:45:0x027f  */
    /* JADX WARN: Code duplicated, block: B:46:0x028f  */
    /* JADX WARN: Code duplicated, block: B:48:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0264 -> B:43:0x0273). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object M9(k41.State r24, tq.e<? super k41.State> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k41.x.M9(k41.c, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k41.d.Data x9(State state) {
        return this.mapper.b(new m41.f.Params(state, b9(k41.a.h.f108263a), b9(k41.a.i.f108264a), b9(k41.a.b.C2573a.f108245a), b9(k41.a.C2572a.f108244a), new er.l() { // from class: k41.n
            @Override // er.l
            public final Object b(Object obj) {
                return x.y9(this.f108301a, ((Integer) obj).intValue());
            }
        }, new er.p() { // from class: k41.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return x.z9(this.f108302a, ((Integer) obj).intValue(), (iy.b0) obj2);
            }
        }, new er.p() { // from class: k41.p
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return x.A9(this.f108303a, ((Integer) obj).intValue(), (iy.b0) obj2);
            }
        }, new er.p() { // from class: k41.q
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return x.B9(this.f108304a, ((Integer) obj).intValue(), (iy.b0) obj2);
            }
        }, new er.l() { // from class: k41.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.C9(this.f108305a, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(x xVar, int i15) {
        xVar.d9(new k41.a.RemoveChildSection(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(x xVar, int i15, iy.b0 b0Var) {
        xVar.d9(new k41.a.OnNameChanged(i15, b0Var));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(l41.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<k41.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, k41.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k41.d.Data> getState() {
        return this.state;
    }
}
