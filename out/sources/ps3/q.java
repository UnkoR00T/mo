package ps3;

import cj0.ZusEVisitDepartment;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R,\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0013\u001a\u0004\b*\u0010+R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R&\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010\u0013\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lps3/q;", "Ll00/g;", "Lps3/d;", "Lps3/a;", "Lps3/e;", "", "Lyy/a;", "stateMachineFactory", "Lqs3/f;", "screenMapper", "Lps3/b;", "setupData", "<init>", "(Lyy/a;Lqs3/f;Lps3/b;)V", "Lps3/e$a;", "r9", "(Lps3/d;)Lps3/e$a;", "Loq/i0;", "d", "()V", "Lcj0/h;", "department", "u9", "(Lcj0/h;)V", "", "searchValue", "t9", "(Ljava/lang/String;)V", "", "isActive", "s9", "(Z)V", "b", "Lqs3/f;", "c", "Lps3/b;", "Lps3/d$a;", "Lps3/d$a;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lps3/a$d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<ps3.d, ps3.a> implements ps3.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qs3.f screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ps3.d.a initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ps3.d, ps3.a> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ps3.a.d> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<ps3.e.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<ZusEVisitDepartment, i0> {
        a(Object obj) {
            super(1, obj, q.class, "onSelectDepartment", "onSelectDepartment(Lpl/gov/coi/mobywatel/be/citizenservice/contract/model/zus/ZusEVisitDepartment;)V", 0);
        }

        public final void E(ZusEVisitDepartment zusEVisitDepartment) {
            ((q) this.f66391b).u9(zusEVisitDepartment);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ZusEVisitDepartment zusEVisitDepartment) {
            E(zusEVisitDepartment);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<String, i0> {
        b(Object obj) {
            super(1, obj, q.class, "onSearchChangeValue", "onSearchChangeValue(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((q) this.f66391b).t9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(String str) {
            E(str);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<Boolean, i0> {
        c(Object obj) {
            super(1, obj, q.class, "onSearchActiveChange", "onSearchActiveChange(Z)V", 0);
        }

        public final void E(boolean z15) {
            ((q) this.f66391b).s9(z15);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Boolean bool) {
            E(bool.booleanValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<i0> {
        d(Object obj) {
            super(0, obj, q.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((q) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162459e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f162461g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z15, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f162461g = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f162459e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(new ps3.a.ChangeSearchIsActive(this.f162461g));
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new e(this.f162461g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162462e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f162464g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f162464g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f162462e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(new ps3.a.ChangeSearchValue(this.f162464g));
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new f(this.f162464g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162465e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ZusEVisitDepartment f162467g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ZusEVisitDepartment zusEVisitDepartment, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f162467g = zusEVisitDepartment;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f162465e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(new ps3.a.SelectDepartment(this.f162467g));
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new g(this.f162467g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements mu.g<ps3.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f162469b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f162471b;

            /* JADX INFO: renamed from: ps3.q$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4007a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162472d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162473e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162474f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f162476h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162477j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162478k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f162479l;

                public C4007a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162472d = obj;
                    this.f162473e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f162470a = hVar;
                this.f162471b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4007a c4007a;
                if (eVar instanceof C4007a) {
                    c4007a = (C4007a) eVar;
                    int i15 = c4007a.f162473e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4007a.f162473e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4007a = new C4007a(eVar);
                    }
                } else {
                    c4007a = new C4007a(eVar);
                }
                Object obj2 = c4007a.f162472d;
                Object objE = uq.b.e();
                int i16 = c4007a.f162473e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f162470a;
                    ps3.e.a aVarR9 = this.f162471b.r9((ps3.d) obj);
                    c4007a.f162474f = vq.j.a(obj);
                    c4007a.f162476h = vq.j.a(c4007a);
                    c4007a.f162477j = vq.j.a(obj);
                    c4007a.f162478k = vq.j.a(hVar);
                    c4007a.f162479l = 0;
                    c4007a.f162473e = 1;
                    if (hVar.F(aVarR9, c4007a) == objE) {
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

        public h(mu.g gVar, q qVar) {
            this.f162468a = gVar;
            this.f162469b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ps3.e.a> hVar, tq.e eVar) {
            Object objA = this.f162468a.a(new a(hVar, this.f162469b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lps3/d$a;", "state", "Lk10/l;", "Lps3/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<c0<ps3.d.a>, tq.e<? super k10.l<? extends ps3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162481f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ps3.d.Initialized O(q qVar, ps3.d.a aVar) {
            return new ps3.d.Initialized("", false, qVar.setupData, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f162481f;
            uq.b.e();
            if (this.f162480e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.d(new er.l() { // from class: ps3.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.i.O(qVar, (d.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ps3.d.a> c0Var, tq.e<? super k10.l<? extends ps3.d>> eVar) {
            return ((i) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f162481f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lps3/a$b;", "event", "Lk10/c0;", "Lps3/d$b;", "state", "Lk10/l;", "Lps3/d;", "<anonymous>", "(Lps3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ps3.a.ChangeSearchValue, c0<ps3.d.Initialized>, tq.e<? super k10.l<? extends ps3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162485g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ps3.d.Initialized O(c0 c0Var, ps3.a.ChangeSearchValue changeSearchValue, ps3.d.Initialized initialized) {
            return ps3.d.Initialized.b((ps3.d.Initialized) c0Var.a(), changeSearchValue.getSearchValue(), false, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ps3.a.ChangeSearchValue changeSearchValue = (ps3.a.ChangeSearchValue) this.f162484f;
            final c0 c0Var = (c0) this.f162485g;
            uq.b.e();
            if (this.f162483e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ps3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.j.O(c0Var, changeSearchValue, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ps3.a.ChangeSearchValue changeSearchValue, c0<ps3.d.Initialized> c0Var, tq.e<? super k10.l<? extends ps3.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f162484f = changeSearchValue;
            jVar.f162485g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lps3/a$a;", "event", "Lk10/c0;", "Lps3/d$b;", "state", "Lk10/l;", "Lps3/d;", "<anonymous>", "(Lps3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ps3.a.ChangeSearchIsActive, c0<ps3.d.Initialized>, tq.e<? super k10.l<? extends ps3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162488g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ps3.d.Initialized O(c0 c0Var, ps3.a.ChangeSearchIsActive changeSearchIsActive, ps3.d.Initialized initialized) {
            return ps3.d.Initialized.b((ps3.d.Initialized) c0Var.a(), null, changeSearchIsActive.getIsActive(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ps3.a.ChangeSearchIsActive changeSearchIsActive = (ps3.a.ChangeSearchIsActive) this.f162487f;
            final c0 c0Var = (c0) this.f162488g;
            uq.b.e();
            if (this.f162486e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ps3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.k.O(c0Var, changeSearchIsActive, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ps3.a.ChangeSearchIsActive changeSearchIsActive, c0<ps3.d.Initialized> c0Var, tq.e<? super k10.l<? extends ps3.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f162487f = changeSearchIsActive;
            kVar.f162488g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lps3/a$e;", "action", "Lps3/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lps3/a$e;Lps3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ps3.a.SelectDepartment, ps3.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162491g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ps3.a.SelectDepartment selectDepartment = (ps3.a.SelectDepartment) this.f162490f;
            ps3.d.Initialized initialized = (ps3.d.Initialized) this.f162491g;
            Object objE = uq.b.e();
            int i15 = this.f162489e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                ps3.a.d.SelectDepartment selectDepartment2 = new ps3.a.d.SelectDepartment(selectDepartment.getDepartment(), initialized.getSetupData().getScreenExitType());
                this.f162490f = vq.j.a(selectDepartment);
                this.f162491g = vq.j.a(initialized);
                this.f162489e = 1;
                if (qVar.F(selectDepartment2, this) == objE) {
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
        public final Object w(ps3.a.SelectDepartment selectDepartment, ps3.d.Initialized initialized, tq.e<? super i0> eVar) {
            l lVar = q.this.new l(eVar);
            lVar.f162490f = selectDepartment;
            lVar.f162491g = initialized;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lps3/a$c;", "<unused var>", "Lps3/d$b;", "Loq/i0;", "<anonymous>", "(Lps3/a$c;Lps3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ps3.a.c, ps3.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162493e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162493e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                ps3.a.d.C4005a c4005a = ps3.a.d.C4005a.f162411a;
                this.f162493e = 1;
                if (qVar.F(c4005a, this) == objE) {
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
        public final Object w(ps3.a.c cVar, ps3.d.Initialized initialized, tq.e<? super i0> eVar) {
            return q.this.new m(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, qs3.f fVar, SetupData setupData) {
        this.screenMapper = fVar;
        this.setupData = setupData;
        ps3.d.a aVar2 = ps3.d.a.f162422a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: ps3.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f162452a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new h(e9().getState(), this), r9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        d9(ps3.a.c.f162410a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ps3.e.a r9(ps3.d dVar) {
        return this.screenMapper.b(new qs3.f.Params(dVar, new a(this), new b(this), new c(this), new d(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s9(boolean isActive) {
        i00.a.a(this, new e(isActive, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t9(String searchValue) {
        i00.a.a(this, new f(searchValue, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u9(ZusEVisitDepartment department) {
        i00.a.a(this, new g(department, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(ps3.d.a.class), new er.l() { // from class: ps3.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f162450a, (z) obj);
            }
        });
        vVar.c(q0.c(ps3.d.Initialized.class), new er.l() { // from class: ps3.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f162451a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, z zVar) {
        zVar.A(qVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(q qVar, z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ps3.a.ChangeSearchValue.class), oVar, jVar);
        zVar.v(q0.c(ps3.a.ChangeSearchIsActive.class), oVar, new k(null));
        zVar.x(q0.c(ps3.a.SelectDepartment.class), oVar, qVar.new l(null));
        zVar.x(q0.c(ps3.a.c.class), oVar, qVar.new m(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ps3.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ps3.d, ps3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ps3.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ps3.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
