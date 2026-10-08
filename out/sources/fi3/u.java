package fi3;

import fr.q0;
import hi3.SearchInsuranceModel;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001/B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lfi3/u;", "Ll00/g;", "Lfi3/f;", "", "Lfi3/g;", "Lyy/a;", "stateMachineFactory", "Lgi3/b;", "searchInsuranceMapper", "Lae3/s;", "searchInsuranceUC", "Lhi3/b;", "setupData", "<init>", "(Lyy/a;Lgi3/b;Lae3/s;Lhi3/b;)V", "state", "Lfi3/g$a;", "q9", "(Lfi3/f;)Lfi3/g$a;", "b", "Lgi3/b;", "c", "Lae3/s;", "d", "Lhi3/b;", "e", "Lfi3/f;", "initialState", "Lxw/b;", "Lfi3/e;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "j", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<State, Object> implements fi3.g, zx.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f64173j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f64174k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f64175l = gu.d.q(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, gu.e.MILLISECONDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gi3.b searchInsuranceMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ae3.s searchInsuranceUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SearchInsuranceModel setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fi3.e> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<fi3.g.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfi3/u$a;", "", "<init>", "()V", "Lgu/b;", "DEFAULT_SEARCH_DEBOUNCE_DURATION", "J", "a", "()J", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final long a() {
            return u.f64175l;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<fi3.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f64183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f64184b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f64185a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f64186b;

            /* JADX INFO: renamed from: fi3.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1429a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f64187d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f64188e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f64189f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f64191h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f64192j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f64193k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f64194l;

                public C1429a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f64187d = obj;
                    this.f64188e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f64185a = hVar;
                this.f64186b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1429a c1429a;
                if (eVar instanceof C1429a) {
                    c1429a = (C1429a) eVar;
                    int i15 = c1429a.f64188e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1429a.f64188e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1429a = new C1429a(eVar);
                    }
                } else {
                    c1429a = new C1429a(eVar);
                }
                Object obj2 = c1429a.f64187d;
                Object objE = uq.b.e();
                int i16 = c1429a.f64188e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f64185a;
                    fi3.g.Data dataQ9 = this.f64186b.q9((State) obj);
                    c1429a.f64189f = vq.j.a(obj);
                    c1429a.f64191h = vq.j.a(c1429a);
                    c1429a.f64192j = vq.j.a(obj);
                    c1429a.f64193k = vq.j.a(hVar);
                    c1429a.f64194l = 0;
                    c1429a.f64188e = 1;
                    if (hVar.F(dataQ9, c1429a) == objE) {
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

        public b(mu.g gVar, u uVar) {
            this.f64183a = gVar;
            this.f64184b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fi3.g.Data> hVar, tq.e eVar) {
            Object objA = this.f64183a.a(new a(hVar, this.f64184b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfi3/d;", "<unused var>", "Lfi3/f;", "Loq/i0;", "<anonymous>", "(Lfi3/d;Lfi3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fi3.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64195e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f64195e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fi3.e> bVarY1 = u.this.Y1();
                fi3.e.a aVar = fi3.e.a.f64144a;
                this.f64195e = 1;
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
        public final Object w(fi3.d dVar, State state, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfi3/b;", "action", "Lk10/c0;", "Lfi3/f;", "state", "Lk10/l;", "<anonymous>", "(Lfi3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ChangeQuery, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64199g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeQuery changeQuery, State state) {
            return State.b(state, changeQuery.getQuery(), null, null, false, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeQuery changeQuery = (ChangeQuery) this.f64198f;
            c0 c0Var = (c0) this.f64199g;
            uq.b.e();
            if (this.f64197e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fi3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.d.O(changeQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeQuery changeQuery, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f64198f = changeQuery;
            dVar.f64199g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfi3/a;", "action", "Lk10/c0;", "Lfi3/f;", "state", "Lk10/l;", "<anonymous>", "(Lfi3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ChangeActiveState, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64202g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeActiveState changeActiveState, State state) {
            return State.b(state, null, null, null, changeActiveState.getIsActive(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeActiveState changeActiveState = (ChangeActiveState) this.f64201f;
            c0 c0Var = (c0) this.f64202g;
            uq.b.e();
            if (this.f64200e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fi3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(changeActiveState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeActiveState changeActiveState, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f64201f = changeActiveState;
            eVar2.f64202g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lfi3/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64204f;

        f(tq.e<? super f> eVar) {
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
                java.lang.Object r0 = r7.f64204f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f64203e
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
                fi3.u$a r8 = fi3.u.m9()
                long r5 = r8.a()
                r7.f64204f = r0
                r7.f64203e = r4
                java.lang.Object r8 = ju.z0.c(r5, r7)
                if (r8 != r1) goto L38
                goto L65
            L38:
                fi3.u r8 = fi3.u.this
                ae3.s r8 = fi3.u.o9(r8)
                ae3.s$a r2 = new ae3.s$a
                java.lang.Object r4 = r0.a()
                fi3.f r4 = (fi3.State) r4
                java.lang.String r4 = r4.getQuery()
                java.lang.Object r5 = r0.a()
                fi3.f r5 = (fi3.State) r5
                hi3.b r5 = r5.getSearchInsuranceModel()
                java.util.List r5 = r5.a()
                r2.<init>(r4, r5)
                r7.f64204f = r0
                r7.f64203e = r3
                java.lang.Object r8 = r8.d(r2, r7)
                if (r8 != r1) goto L66
            L65:
                return r1
            L66:
                java.util.List r8 = (java.util.List) r8
                fi3.x r1 = new fi3.x
                r1.<init>()
                k10.l r8 = r0.b(r1)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fi3.u.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f64204f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfi3/c;", "<unused var>", "Lk10/c0;", "Lfi3/f;", "state", "Lk10/l;", "<anonymous>", "(Lfi3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fi3.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64207f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, "", null, null, false, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f64207f;
            uq.b.e();
            if (this.f64206e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fi3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fi3.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f64207f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, gi3.b bVar, ae3.s sVar, SearchInsuranceModel searchInsuranceModel) {
        this.searchInsuranceMapper = bVar;
        this.searchInsuranceUC = sVar;
        this.setupData = searchInsuranceModel;
        State state = new State("", searchInsuranceModel, searchInsuranceModel.a(), false);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: fi3.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.u9(this.f64172a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fi3.g.Data q9(State state) {
        return this.searchInsuranceMapper.b(new gi3.b.Params(state, new er.l() { // from class: fi3.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.r9(this.f64169a, (String) obj);
            }
        }, new er.l() { // from class: fi3.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.s9(this.f64170a, ((Boolean) obj).booleanValue());
            }
        }, b9(fi3.c.f64142a), b9(fi3.d.f64143a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(u uVar, String str) {
        uVar.d9(new ChangeQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(u uVar, boolean z15) {
        uVar.d9(new ChangeActiveState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: fi3.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.v9(this.f64168a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fi3.d.class), oVar, cVar);
        zVar.v(q0.c(ChangeQuery.class), oVar, new d(null));
        zVar.v(q0.c(ChangeActiveState.class), oVar, new e(null));
        zVar.N(new er.l() { // from class: fi3.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.w9((State) obj);
            }
        }, new er.l() { // from class: fi3.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.x9(this.f64171a, (k10.x) obj);
            }
        });
        zVar.v(q0.c(fi3.c.class), oVar, new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object w9(State state) {
        return state.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(u uVar, k10.x xVar) {
        xVar.A(uVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<fi3.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fi3.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SearchInsuranceModel searchInsuranceModel) {
        super.P5(searchInsuranceModel);
    }
}
