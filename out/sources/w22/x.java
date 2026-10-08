package w22;

import fr.q0;
import java.util.List;
import m02.SearchModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import p02.m0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001-B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lw22/x;", "Ll00/g;", "Lw22/f;", "", "Lw22/g;", "Lyy/a;", "stateMachineFactory", "Lx22/b;", "searchMapper", "Lp02/m0;", "searchItemsUseCase", "Lm02/h;", "setupData", "<init>", "(Lyy/a;Lx22/b;Lp02/m0;Lm02/h;)V", "state", "Lw22/g$a;", "q9", "(Lw22/f;)Lw22/g$a;", "b", "Lx22/b;", "c", "Lp02/m0;", "d", "Lw22/f;", "initialState", "Lxw/b;", "Lw22/e;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "h", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<State, Object> implements w22.g, zx.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f209420h = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f209421j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f209422k = gu.d.q(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, gu.e.MILLISECONDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x22.b searchMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 searchItemsUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<w22.e> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<w22.g.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw22/x$a;", "", "<init>", "()V", "Lgu/b;", "DEFAULT_SEARCH_DEBOUNCE_DURATION", "J", "a", "()J", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final long a() {
            return x.f209422k;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<w22.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f209429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f209430b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f209431a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f209432b;

            /* JADX INFO: renamed from: w22.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5512a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f209433d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f209434e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f209435f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f209437h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f209438j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f209439k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f209440l;

                public C5512a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f209433d = obj;
                    this.f209434e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f209431a = hVar;
                this.f209432b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5512a c5512a;
                if (eVar instanceof C5512a) {
                    c5512a = (C5512a) eVar;
                    int i15 = c5512a.f209434e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5512a.f209434e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5512a = new C5512a(eVar);
                    }
                } else {
                    c5512a = new C5512a(eVar);
                }
                Object obj2 = c5512a.f209433d;
                Object objE = uq.b.e();
                int i16 = c5512a.f209434e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f209431a;
                    w22.g.Data dataQ9 = this.f209432b.q9((State) obj);
                    c5512a.f209435f = vq.j.a(obj);
                    c5512a.f209437h = vq.j.a(c5512a);
                    c5512a.f209438j = vq.j.a(obj);
                    c5512a.f209439k = vq.j.a(hVar);
                    c5512a.f209440l = 0;
                    c5512a.f209434e = 1;
                    if (hVar.F(dataQ9, c5512a) == objE) {
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

        public b(mu.g gVar, x xVar) {
            this.f209429a = gVar;
            this.f209430b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super w22.g.Data> hVar, tq.e eVar) {
            Object objA = this.f209429a.a(new a(hVar, this.f209430b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw22/d;", "<unused var>", "Lw22/f;", "Loq/i0;", "<anonymous>", "(Lw22/d;Lw22/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<w22.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209441e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f209441e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w22.e> bVarY1 = x.this.Y1();
                w22.e.a aVar = w22.e.a.f209385a;
                this.f209441e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(w22.d dVar, State state, tq.e<? super i0> eVar) {
            return x.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lw22/b;", "action", "Lk10/c0;", "Lw22/f;", "state", "Lk10/l;", "<anonymous>", "(Lw22/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ChangeQuery, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209444f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f209445g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeQuery changeQuery, State state) {
            return State.b(state, changeQuery.getQuery(), null, null, false, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeQuery changeQuery = (ChangeQuery) this.f209444f;
            k10.c0 c0Var = (k10.c0) this.f209445g;
            uq.b.e();
            if (this.f209443e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: w22.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.d.O(changeQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeQuery changeQuery, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f209444f = changeQuery;
            dVar.f209445g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lw22/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209447f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, null, list, false, 11, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        
            if (r8 == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f209447f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f209446e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r8)
                goto L66
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                oq.u.b(r8)
                goto L38
            L22:
                oq.u.b(r8)
                w22.x$a r8 = w22.x.m9()
                long r5 = r8.a()
                r7.f209447f = r0
                r7.f209446e = r4
                java.lang.Object r8 = ju.z0.c(r5, r7)
                if (r8 != r1) goto L38
                goto L65
            L38:
                w22.x r8 = w22.x.this
                p02.m0 r8 = w22.x.o9(r8)
                p02.m0$a r2 = new p02.m0$a
                java.lang.Object r4 = r0.a()
                w22.f r4 = (w22.State) r4
                java.lang.String r4 = r4.getQuery()
                java.lang.Object r5 = r0.a()
                w22.f r5 = (w22.State) r5
                m02.h r5 = r5.getSearchModel()
                java.util.List r5 = r5.a()
                r2.<init>(r4, r5)
                r7.f209447f = r0
                r7.f209446e = r3
                java.lang.Object r8 = r8.d(r2, r7)
                if (r8 != r1) goto L66
            L65:
                return r1
            L66:
                java.util.List r8 = (java.util.List) r8
                w22.z r1 = new w22.z
                r1.<init>()
                k10.l r8 = r0.b(r1)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: w22.x.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((e) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f209447f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lw22/a;", "action", "Lk10/c0;", "Lw22/f;", "state", "Lk10/l;", "<anonymous>", "(Lw22/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ChangeActiveState, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f209451g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeActiveState changeActiveState, State state) {
            return State.b(state, null, null, null, changeActiveState.getIsActive(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeActiveState changeActiveState = (ChangeActiveState) this.f209450f;
            k10.c0 c0Var = (k10.c0) this.f209451g;
            uq.b.e();
            if (this.f209449e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: w22.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.f.O(changeActiveState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeActiveState changeActiveState, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f209450f = changeActiveState;
            fVar.f209451g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lw22/c;", "<unused var>", "Lk10/c0;", "Lw22/f;", "state", "Lk10/l;", "<anonymous>", "(Lw22/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<w22.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209453f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, "", null, null, false, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f209453f;
            uq.b.e();
            if (this.f209452e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: w22.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w22.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f209453f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public x(yy.a aVar, x22.b bVar, m0 m0Var, SearchModel searchModel) {
        this.searchMapper = bVar;
        this.searchItemsUseCase = m0Var;
        State state = new State("", searchModel, searchModel.a(), false);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: w22.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.u9(this.f209419a, (k10.v) obj);
            }
        });
        this.state = a9(new b(mu.i.p(e9().getState()), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w22.g.Data q9(State state) {
        return this.searchMapper.b(new x22.b.Params(state, new er.l() { // from class: w22.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.r9(this.f209415a, (String) obj);
            }
        }, new er.l() { // from class: w22.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.s9(this.f209416a, ((Boolean) obj).booleanValue());
            }
        }, b9(w22.c.f209382a), b9(w22.d.f209383a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(x xVar, String str) {
        xVar.d9(new ChangeQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(x xVar, boolean z15) {
        xVar.d9(new ChangeActiveState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: w22.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.v9(this.f209417a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final x xVar, k10.z zVar) {
        c cVar = xVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(w22.d.class), oVar, cVar);
        zVar.v(q0.c(ChangeQuery.class), oVar, new d(null));
        zVar.N(new er.l() { // from class: w22.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.w9((State) obj);
            }
        }, new er.l() { // from class: w22.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.x9(this.f209418a, (k10.x) obj);
            }
        });
        zVar.v(q0.c(ChangeActiveState.class), oVar, new f(null));
        zVar.v(q0.c(w22.c.class), oVar, new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object w9(State state) {
        return state.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(x xVar, k10.x xVar2) {
        xVar2.A(xVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<w22.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<w22.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SearchModel searchModel) {
        super.P5(searchModel);
    }
}
