package u01;

import er.p;
import er.q;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oo0.Category;
import oo0.Topic;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010?\u001a\b\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lu01/k;", "Ll00/g;", "Lu01/b;", "Lu01/a;", "Lu01/c;", "", "Lyy/a;", "stateMachineFactory", "Lv01/b;", "suggestionTopicMapper", "Lpo0/a;", "fetchCategorizedTopicsUC", "Lib4/c;", "genericDomainErrorMapper", "Loo0/c$a;", "categoryCode", "<init>", "(Lyy/a;Lv01/b;Lpo0/a;Lib4/c;Loo0/c$a;)V", "state", "Lu01/c$a;", "t9", "(Lu01/b;)Lu01/c$a;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onRetry", "r9", "(Ldx/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "Loo0/u;", "topic", "Lp01/a;", "q9", "(Loo0/u;Loo0/c$a;)Lp01/a;", "b", "Lv01/b;", "c", "Lpo0/a;", "d", "Lib4/c;", "e", "Loo0/c$a;", "f", "Lu01/b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lu01/a$d;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, u01.a> implements u01.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v01.b suggestionTopicMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final po0.a fetchCategorizedTopicsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Category.a categoryCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, u01.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<u01.c.Data> state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<u01.a.d> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<u01.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f194030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f194031b;

        /* JADX INFO: renamed from: u01.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5053a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f194032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f194033b;

            /* JADX INFO: renamed from: u01.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5054a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f194034d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f194035e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f194036f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f194038h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f194039j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f194040k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f194041l;

                public C5054a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f194034d = obj;
                    this.f194035e |= PKIFailureInfo.systemUnavail;
                    return C5053a.this.F(null, this);
                }
            }

            public C5053a(mu.h hVar, k kVar) {
                this.f194032a = hVar;
                this.f194033b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5054a c5054a;
                if (eVar instanceof C5054a) {
                    c5054a = (C5054a) eVar;
                    int i15 = c5054a.f194035e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5054a.f194035e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5054a = new C5054a(eVar);
                    }
                } else {
                    c5054a = new C5054a(eVar);
                }
                Object obj2 = c5054a.f194034d;
                Object objE = uq.b.e();
                int i16 = c5054a.f194035e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f194032a;
                    u01.c.Data dataT9 = this.f194033b.t9((State) obj);
                    c5054a.f194036f = vq.j.a(obj);
                    c5054a.f194038h = vq.j.a(c5054a);
                    c5054a.f194039j = vq.j.a(obj);
                    c5054a.f194040k = vq.j.a(hVar);
                    c5054a.f194041l = 0;
                    c5054a.f194035e = 1;
                    if (hVar.F(dataT9, c5054a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f194030a = gVar;
            this.f194031b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super u01.c.Data> hVar, tq.e eVar) {
            Object objA = this.f194030a.a(new C5053a(hVar, this.f194031b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu01/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lu01/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194042e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f194042e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.this.d9(u01.a.b.f194004a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((b) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu01/a$a;", "<unused var>", "Lu01/b;", "Loq/i0;", "<anonymous>", "(Lu01/a$a;Lu01/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<u01.a.C5051a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194044e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f194044e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<u01.a.d> bVarY1 = k.this.Y1();
                u01.a.d.C5052a c5052a = u01.a.d.C5052a.f194006a;
                this.f194044e = 1;
                if (bVarY1.F(c5052a, this) == objE) {
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
        public final Object w(u01.a.C5051a c5051a, State state, tq.e<? super i0> eVar) {
            return k.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu01/a$b;", "<unused var>", "Lk10/c0;", "Lu01/b;", "state", "Lk10/l;", "<anonymous>", "(Lu01/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<u01.a.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f194046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f194047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f194048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f194049h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f194050j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f194051k;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, list, 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
        
            if (r2.r9(r4, r6, r5, r7) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f194051k
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f194050j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r1 = r7.f194047f
                dx.b r1 = (dx.b) r1
                java.lang.Object r1 = r7.f194046e
                dx.i r1 = (dx.i) r1
                oq.u.b(r8)
                goto L81
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                oq.u.b(r8)
                goto L48
            L2a:
                oq.u.b(r8)
                u01.k r8 = u01.k.this
                po0.a r8 = u01.k.m9(r8)
                java.lang.Object r2 = r0.a()
                u01.b r2 = (u01.State) r2
                oo0.c$a r2 = r2.getSuggestionCategoryCode()
                r7.f194051k = r0
                r7.f194050j = r4
                java.lang.Object r8 = r8.c(r2, r7)
                if (r8 != r1) goto L48
                goto L80
            L48:
                dx.i r8 = (dx.i) r8
                u01.k r2 = u01.k.this
                boolean r4 = r8 instanceof dx.i.Left
                if (r4 == 0) goto L86
                r4 = r8
                dx.i$b r4 = (dx.i.Left) r4
                java.lang.Object r4 = r4.b()
                dx.b r4 = (dx.b) r4
                u01.a$b r5 = u01.a.b.f194004a
                er.a r5 = u01.k.k9(r2, r5)
                u01.a$a r6 = u01.a.C5051a.f194003a
                er.a r6 = u01.k.k9(r2, r6)
                r7.f194051k = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f194046e = r8
                java.lang.Object r8 = vq.j.a(r4)
                r7.f194047f = r8
                r8 = 0
                r7.f194048g = r8
                r7.f194049h = r8
                r7.f194050j = r3
                java.lang.Object r8 = u01.k.o9(r2, r4, r6, r5, r7)
                if (r8 != r1) goto L81
            L80:
                return r1
            L81:
                k10.l r8 = r0.c()
                return r8
            L86:
                boolean r1 = r8 instanceof dx.i.Right
                if (r1 == 0) goto L9c
                dx.i$c r8 = (dx.i.Right) r8
                java.lang.Object r8 = r8.b()
                java.util.List r8 = (java.util.List) r8
                u01.l r1 = new u01.l
                r1.<init>()
                k10.l r8 = r0.d(r1)
                return r8
            L9c:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: u01.k.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(u01.a.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = k.this.new d(eVar);
            dVar.f194051k = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu01/a$c;", "action", "Lu01/b;", "state", "Loq/i0;", "<anonymous>", "(Lu01/a$c;Lu01/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<u01.a.GoToSuggestionForm, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194055g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u01.a.GoToSuggestionForm goToSuggestionForm = (u01.a.GoToSuggestionForm) this.f194054f;
            State state = (State) this.f194055g;
            Object objE = uq.b.e();
            int i15 = this.f194053e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<u01.a.d> bVarY1 = k.this.Y1();
                u01.a.d.GoToSuggestionForm goToSuggestionForm2 = new u01.a.d.GoToSuggestionForm(k.this.q9(goToSuggestionForm.getTopic(), state.getSuggestionCategoryCode()));
                this.f194054f = vq.j.a(goToSuggestionForm);
                this.f194055g = vq.j.a(state);
                this.f194053e = 1;
                if (bVarY1.F(goToSuggestionForm2, this) == objE) {
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
        public final Object w(u01.a.GoToSuggestionForm goToSuggestionForm, State state, tq.e<? super i0> eVar) {
            e eVar2 = k.this.new e(eVar);
            eVar2.f194054f = goToSuggestionForm;
            eVar2.f194055g = state;
            return eVar2.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, v01.b bVar, po0.a aVar2, ib4.c cVar, Category.a aVar3) {
        this.suggestionTopicMapper = bVar;
        this.fetchCategorizedTopicsUC = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.categoryCode = aVar3;
        State state = new State(aVar3, null, 2, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: u01.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.w9(this.f194021a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p01.a q9(Topic topic, Category.a categoryCode) {
        Category.a aVar = Category.a.DOCUMENTS;
        if (categoryCode == aVar && topic.getType() == Topic.b.OTHER_DOCUMENTS) {
            return new p01.a.AbstractC3723a.Other(topic);
        }
        Category.a aVar2 = Category.a.SERVICES;
        if (categoryCode == aVar2 && topic.getType() == Topic.b.OTHER_SERVICES) {
            return new p01.a.c.Other(topic);
        }
        if (categoryCode == aVar) {
            return new p01.a.AbstractC3723a.Specific(topic);
        }
        return categoryCode == aVar2 ? new p01.a.c.Specific(topic) : new p01.a.Others(topic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new u01.a.d.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: u01.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.s9(aVar2, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            aVar.a();
        } else {
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u01.c.Data t9(State state) {
        return this.suggestionTopicMapper.b(new v01.b.Params(state, b9(u01.a.C5051a.f194003a), new er.l() { // from class: u01.g
            @Override // er.l
            public final Object b(Object obj) {
                return k.u9(this.f194017a, (Topic) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(k kVar, Topic topic) {
        kVar.d9(new u01.a.GoToSuggestionForm(topic));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: u01.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.x9(this.f194018a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(k kVar, z zVar) {
        zVar.C(kVar.new b(null));
        c cVar = kVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(u01.a.C5051a.class), oVar, cVar);
        zVar.v(q0.c(u01.a.b.class), oVar, kVar.new d(null));
        zVar.x(q0.c(u01.a.GoToSuggestionForm.class), oVar, kVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<u01.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, u01.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<u01.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(Category.a aVar) {
        super.P5(aVar);
    }
}
