package cu3;

import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;
import tt3.AddressSearchData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00010B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcu3/w;", "Ll00/g;", "Lcu3/e;", "", "Lcu3/f;", "Ltt3/d;", "Lyy/a;", "stateMachineFactory", "Lcu3/h;", "addressSearchMapper", "Lxt3/a;", "addressSearchUC", "Ltt3/b;", "setupData", "<init>", "(Lyy/a;Lcu3/h;Lxt3/a;Ltt3/b;)V", "state", "Lcu3/f$a;", "o9", "(Lcu3/e;)Lcu3/f$a;", "b", "Lcu3/h;", "getAddressSearchMapper", "()Lcu3/h;", "c", "Ltt3/b;", "d", "Lcu3/e;", "initialState", "Lxw/b;", "Ltt3/d$a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "h", "a", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<State, Object> implements cu3.f, tt3.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f38081h = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f38082j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f38083k = gu.d.q(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, gu.e.MILLISECONDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h addressSearchMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AddressSearchData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<tt3.d.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<cu3.f.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcu3/w$a;", "", "<init>", "()V", "Lgu/b;", "DEFAULT_SEARCH_DEBOUNCE_DURATION", "J", "a", "()J", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final long a() {
            return w.f38083k;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<cu3.f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f38090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f38091b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f38092a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f38093b;

            /* JADX INFO: renamed from: cu3.w$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0808a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f38094d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f38095e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f38096f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f38098h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f38099j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f38100k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f38101l;

                public C0808a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f38094d = obj;
                    this.f38095e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f38092a = hVar;
                this.f38093b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0808a c0808a;
                if (eVar instanceof C0808a) {
                    c0808a = (C0808a) eVar;
                    int i15 = c0808a.f38095e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0808a.f38095e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0808a = new C0808a(eVar);
                    }
                } else {
                    c0808a = new C0808a(eVar);
                }
                Object obj2 = c0808a.f38094d;
                Object objE = uq.b.e();
                int i16 = c0808a.f38095e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f38092a;
                    cu3.f.Data aVarO9 = this.f38093b.o9((State) obj);
                    c0808a.f38096f = vq.j.a(obj);
                    c0808a.f38098h = vq.j.a(c0808a);
                    c0808a.f38099j = vq.j.a(obj);
                    c0808a.f38100k = vq.j.a(hVar);
                    c0808a.f38101l = 0;
                    c0808a.f38095e = 1;
                    if (hVar.F(aVarO9, c0808a) == objE) {
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

        public b(mu.g gVar, w wVar) {
            this.f38090a = gVar;
            this.f38091b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super cu3.f.Data> hVar, tq.e eVar) {
            Object objA = this.f38090a.a(new a(hVar, this.f38091b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcu3/d;", "<unused var>", "Lcu3/e;", "Loq/i0;", "<anonymous>", "(Lcu3/d;Lcu3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<cu3.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38102e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f38102e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<tt3.d.a> bVarY1 = w.this.Y1();
                tt3.d.a.C5021a c5021a = tt3.d.a.C5021a.f192310a;
                this.f38102e = 1;
                if (bVarY1.F(c5021a, this) == objE) {
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
        public final Object w(cu3.d dVar, State state, tq.e<? super i0> eVar) {
            return w.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcu3/b;", "action", "Lk10/c0;", "Lcu3/e;", "state", "Lk10/l;", "<anonymous>", "(Lcu3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ChangeQuery, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38105f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38106g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeQuery changeQuery, State state) {
            return State.b(state, changeQuery.getQuery(), false, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeQuery changeQuery = (ChangeQuery) this.f38105f;
            k10.c0 c0Var = (k10.c0) this.f38106g;
            uq.b.e();
            if (this.f38104e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: cu3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.d.O(changeQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeQuery changeQuery, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f38105f = changeQuery;
            dVar.f38106g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcu3/a;", "action", "Lk10/c0;", "Lcu3/e;", "state", "Lk10/l;", "<anonymous>", "(Lcu3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ChangeActiveState, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38109g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeActiveState changeActiveState, State state) {
            return State.b(state, null, changeActiveState.getIsActive(), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeActiveState changeActiveState = (ChangeActiveState) this.f38108f;
            k10.c0 c0Var = (k10.c0) this.f38109g;
            uq.b.e();
            if (this.f38107e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: cu3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.e.O(changeActiveState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeActiveState changeActiveState, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f38108f = changeActiveState;
            eVar2.f38109g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lcu3/e;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ xt3.a f38112g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(xt3.a aVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f38112g = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, false, null, list, 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
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
                java.lang.Object r0 = r7.f38111f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f38110e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r8)
                goto L62
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
                cu3.w$a r8 = cu3.w.m9()
                long r5 = r8.a()
                r7.f38111f = r0
                r7.f38110e = r4
                java.lang.Object r8 = ju.z0.c(r5, r7)
                if (r8 != r1) goto L38
                goto L61
            L38:
                xt3.a r8 = r7.f38112g
                xt3.a$a r2 = new xt3.a$a
                java.lang.Object r4 = r0.a()
                cu3.e r4 = (cu3.State) r4
                java.lang.String r4 = r4.getQuery()
                java.lang.Object r5 = r0.a()
                cu3.e r5 = (cu3.State) r5
                tt3.b r5 = r5.getAddressSearchData()
                java.util.List r5 = r5.b()
                r2.<init>(r4, r5)
                r7.f38111f = r0
                r7.f38110e = r3
                java.lang.Object r8 = r8.d(r2, r7)
                if (r8 != r1) goto L62
            L61:
                return r1
            L62:
                java.util.List r8 = (java.util.List) r8
                cu3.z r1 = new cu3.z
                r1.<init>()
                k10.l r8 = r0.b(r1)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: cu3.w.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(this.f38112g, eVar);
            fVar.f38111f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcu3/c;", "<unused var>", "Lk10/c0;", "Lcu3/e;", "state", "Lk10/l;", "<anonymous>", "(Lcu3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<cu3.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38114f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, "", false, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f38114f;
            uq.b.e();
            if (this.f38113e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: cu3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.g.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cu3.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f38114f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, h hVar, final xt3.a aVar2, AddressSearchData addressSearchData) {
        this.addressSearchMapper = hVar;
        this.setupData = addressSearchData;
        State state = new State("", false, addressSearchData, addressSearchData.b());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: cu3.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.s9(this.f38075a, aVar2, (k10.v) obj);
            }
        });
        this.state = a9(new b(mu.i.p(e9().getState()), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(w wVar, String str) {
        wVar.d9(new ChangeQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(w wVar, boolean z15) {
        wVar.d9(new ChangeActiveState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final w wVar, final xt3.a aVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: cu3.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.t9(this.f38077a, aVar, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(w wVar, final xt3.a aVar, k10.z zVar) {
        c cVar = wVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cu3.d.class), oVar, cVar);
        zVar.v(q0.c(ChangeQuery.class), oVar, new d(null));
        zVar.v(q0.c(ChangeActiveState.class), oVar, new e(null));
        zVar.N(new er.l() { // from class: cu3.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.u9((State) obj);
            }
        }, new er.l() { // from class: cu3.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.v9(aVar, (k10.x) obj);
            }
        });
        zVar.v(q0.c(cu3.c.class), oVar, new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u9(State state) {
        return state.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(xt3.a aVar, k10.x xVar) {
        xVar.A(new f(aVar, null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<tt3.d.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<cu3.f.Data> getState() {
        return this.state;
    }

    public final cu3.f.Data o9(State state) {
        return this.addressSearchMapper.b(new h.Params(state, new er.l() { // from class: cu3.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.p9(this.f38079a, (String) obj);
            }
        }, new er.l() { // from class: cu3.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.q9(this.f38080a, ((Boolean) obj).booleanValue());
            }
        }, b9(cu3.c.f38039a), b9(cu3.d.f38041a)));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AddressSearchData addressSearchData) {
        super.P5(addressSearchData);
    }
}
