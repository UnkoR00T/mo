package bd1;

import f00.j0;
import fr.q0;
import java.util.List;
import k10.c0;
import ld1.SearchModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0002\u0013-B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lbd1/u;", "Ll00/g;", "Lbd1/f;", "", "Lbd1/g;", "Lyy/a;", "stateMachineFactory", "Lcd1/b;", "searchMapper", "Lmb1/a;", "searchItemsUseCase", "Lld1/m;", "setupData", "<init>", "(Lyy/a;Lcd1/b;Lmb1/a;Lld1/m;)V", "state", "Lbd1/g$a;", "q9", "(Lbd1/f;)Lbd1/g$a;", "b", "Lcd1/b;", "c", "Lmb1/a;", "d", "Lbd1/f;", "initialState", "Lxw/b;", "Lbd1/e;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "h", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<State, Object> implements bd1.g, zx.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f18347h = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18348j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f18349k = gu.d.q(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, gu.e.MILLISECONDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cd1.b searchMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mb1.a searchItemsUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bd1.e> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<bd1.g.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbd1/u$a;", "", "<init>", "()V", "Lgu/b;", "DEFAULT_SEARCH_DEBOUNCE_DURATION", "J", "a", "()J", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final long a() {
            return u.f18349k;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lbd1/u$b;", "Lf00/j0;", "Lld1/m;", "Lbd1/u;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends j0<SearchModel, u> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<bd1.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f18356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f18357b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f18358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f18359b;

            /* JADX INFO: renamed from: bd1.u$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0462a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f18360d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f18361e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f18362f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f18364h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f18365j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f18366k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f18367l;

                public C0462a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f18360d = obj;
                    this.f18361e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f18358a = hVar;
                this.f18359b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0462a c0462a;
                if (eVar instanceof C0462a) {
                    c0462a = (C0462a) eVar;
                    int i15 = c0462a.f18361e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0462a.f18361e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0462a = new C0462a(eVar);
                    }
                } else {
                    c0462a = new C0462a(eVar);
                }
                Object obj2 = c0462a.f18360d;
                Object objE = uq.b.e();
                int i16 = c0462a.f18361e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f18358a;
                    bd1.g.Data dataQ9 = this.f18359b.q9((State) obj);
                    c0462a.f18362f = vq.j.a(obj);
                    c0462a.f18364h = vq.j.a(c0462a);
                    c0462a.f18365j = vq.j.a(obj);
                    c0462a.f18366k = vq.j.a(hVar);
                    c0462a.f18367l = 0;
                    c0462a.f18361e = 1;
                    if (hVar.F(dataQ9, c0462a) == objE) {
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

        public c(mu.g gVar, u uVar) {
            this.f18356a = gVar;
            this.f18357b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bd1.g.Data> hVar, tq.e eVar) {
            Object objA = this.f18356a.a(new a(hVar, this.f18357b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbd1/d;", "<unused var>", "Lbd1/f;", "Loq/i0;", "<anonymous>", "(Lbd1/d;Lbd1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<bd1.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18368e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18368e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<bd1.e> bVarY1 = u.this.Y1();
                bd1.e.a aVar = bd1.e.a.f18318a;
                this.f18368e = 1;
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
        public final Object w(bd1.d dVar, State state, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbd1/b;", "action", "Lk10/c0;", "Lbd1/f;", "state", "Lk10/l;", "<anonymous>", "(Lbd1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ChangeQuery, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18372g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeQuery changeQuery, State state) {
            return State.b(state, changeQuery.getQuery(), null, null, false, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeQuery changeQuery = (ChangeQuery) this.f18371f;
            c0 c0Var = (c0) this.f18372g;
            uq.b.e();
            if (this.f18370e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: bd1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(changeQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeQuery changeQuery, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f18371f = changeQuery;
            eVar2.f18372g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lbd1/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18374f;

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
                java.lang.Object r0 = r7.f18374f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f18373e
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
                bd1.u$a r8 = bd1.u.m9()
                long r5 = r8.a()
                r7.f18374f = r0
                r7.f18373e = r4
                java.lang.Object r8 = ju.z0.c(r5, r7)
                if (r8 != r1) goto L38
                goto L65
            L38:
                bd1.u r8 = bd1.u.this
                mb1.a r8 = bd1.u.o9(r8)
                mb1.a$a r2 = new mb1.a$a
                java.lang.Object r4 = r0.a()
                bd1.f r4 = (bd1.State) r4
                java.lang.String r4 = r4.getQuery()
                java.lang.Object r5 = r0.a()
                bd1.f r5 = (bd1.State) r5
                ld1.m r5 = r5.getSearchModel()
                java.util.List r5 = r5.a()
                r2.<init>(r4, r5)
                r7.f18374f = r0
                r7.f18373e = r3
                java.lang.Object r8 = r8.d(r2, r7)
                if (r8 != r1) goto L66
            L65:
                return r1
            L66:
                java.util.List r8 = (java.util.List) r8
                bd1.w r1 = new bd1.w
                r1.<init>()
                k10.l r8 = r0.b(r1)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: bd1.u.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f18374f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbd1/a;", "action", "Lk10/c0;", "Lbd1/f;", "state", "Lk10/l;", "<anonymous>", "(Lbd1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ChangeActiveState, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18377f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18378g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeActiveState changeActiveState, State state) {
            return State.b(state, null, null, null, changeActiveState.getIsActive(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeActiveState changeActiveState = (ChangeActiveState) this.f18377f;
            c0 c0Var = (c0) this.f18378g;
            uq.b.e();
            if (this.f18376e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: bd1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O(changeActiveState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeActiveState changeActiveState, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f18377f = changeActiveState;
            gVar.f18378g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbd1/c;", "<unused var>", "Lk10/c0;", "Lbd1/f;", "state", "Lk10/l;", "<anonymous>", "(Lbd1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<bd1.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18380f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, "", null, null, false, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f18380f;
            uq.b.e();
            if (this.f18379e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: bd1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bd1.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f18380f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, cd1.b bVar, mb1.a aVar2, SearchModel searchModel) {
        this.searchMapper = bVar;
        this.searchItemsUseCase = aVar2;
        State state = new State("", searchModel, searchModel.a(), false);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: bd1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.u9(this.f18346a, (k10.v) obj);
            }
        });
        this.state = a9(new c(mu.i.p(e9().getState()), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bd1.g.Data q9(State state) {
        return this.searchMapper.b(new cd1.b.Params(state, new er.l() { // from class: bd1.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.r9(this.f18343a, (String) obj);
            }
        }, new er.l() { // from class: bd1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.s9(this.f18344a, ((Boolean) obj).booleanValue());
            }
        }, b9(bd1.c.f18316a), b9(bd1.d.f18317a)));
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
        vVar.c(q0.c(State.class), new er.l() { // from class: bd1.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.v9(this.f18342a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final u uVar, k10.z zVar) {
        d dVar = uVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bd1.d.class), oVar, dVar);
        zVar.v(q0.c(ChangeQuery.class), oVar, new e(null));
        zVar.N(new er.l() { // from class: bd1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.w9((State) obj);
            }
        }, new er.l() { // from class: bd1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.x9(this.f18345a, (k10.x) obj);
            }
        });
        zVar.v(q0.c(ChangeActiveState.class), oVar, new g(null));
        zVar.v(q0.c(bd1.c.class), oVar, new h(null));
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
    public xw.b<bd1.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bd1.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
