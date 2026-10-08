package ua2;

import fr.q0;
import java.time.OffsetDateTime;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lua2/q;", "Ll00/g;", "Lua2/l;", "", "Lua2/m;", "Lyy/a;", "stateMachineFactory", "Lva2/b;", "mapper", "Lz92/b;", "loadLocalAppActivityLogUC", "La14/i;", "formatHeaderDatesWithDaysUseCase", "<init>", "(Lyy/a;Lva2/b;Lz92/b;La14/i;)V", "state", "Lua2/m$a;", "l9", "(Lua2/l;)Lua2/m$a;", "Loq/i0;", "d", "()V", "b", "Lva2/b;", "c", "Lz92/b;", "La14/i;", "Lua2/l$a;", "e", "Lua2/l$a;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lua2/k;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<l, Object> implements m, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final va2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z92.b loadLocalAppActivityLogUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.i formatHeaderDatesWithDaysUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l.a initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<l, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<m.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<m.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f196801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f196802b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f196803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f196804b;

            /* JADX INFO: renamed from: ua2.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5119a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f196805d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f196806e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f196807f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f196809h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f196810j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f196811k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f196812l;

                public C5119a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f196805d = obj;
                    this.f196806e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f196803a = hVar;
                this.f196804b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5119a c5119a;
                if (eVar instanceof C5119a) {
                    c5119a = (C5119a) eVar;
                    int i15 = c5119a.f196806e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5119a.f196806e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5119a = new C5119a(eVar);
                    }
                } else {
                    c5119a = new C5119a(eVar);
                }
                Object obj2 = c5119a.f196805d;
                Object objE = uq.b.e();
                int i16 = c5119a.f196806e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f196803a;
                    m.a aVarL9 = this.f196804b.l9((l) obj);
                    c5119a.f196807f = vq.j.a(obj);
                    c5119a.f196809h = vq.j.a(c5119a);
                    c5119a.f196810j = vq.j.a(obj);
                    c5119a.f196811k = vq.j.a(hVar);
                    c5119a.f196812l = 0;
                    c5119a.f196806e = 1;
                    if (hVar.F(aVarL9, c5119a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f196801a = gVar;
            this.f196802b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m.a> hVar, tq.e eVar) {
            Object objA = this.f196801a.a(new a(hVar, this.f196802b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lua2/l;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<l>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196814f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l V(l lVar) {
            return l.a.f196784a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l X(List list, l lVar) {
            return new l.Initialized(list);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f196814f;
            Object objE = uq.b.e();
            int i15 = this.f196813e;
            if (i15 == 0) {
                oq.u.b(obj);
                z92.b bVar = q.this.loadLocalAppActivityLogUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f196814f = c0Var;
                this.f196813e = 1;
                obj = bVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final List list = (List) obj;
            return list.isEmpty() ? c0Var.b(new er.l() { // from class: ua2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.V((l) obj2);
                }
            }) : c0Var.b(new er.l() { // from class: ua2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.X(list, (l) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<l> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f196814f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lua2/j;", "<unused var>", "Lua2/l;", "Loq/i0;", "<anonymous>", "(Lua2/j;Lua2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<j, l, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196816e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196816e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<k> bVarY1 = q.this.Y1();
                k.a aVar = k.a.f196783a;
                this.f196816e = 1;
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
        public final Object w(j jVar, l lVar, tq.e<? super i0> eVar) {
            return q.this.new d(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, va2.b bVar, z92.b bVar2, a14.i iVar) {
        this.mapper = bVar;
        this.loadLocalAppActivityLogUC = bVar2;
        this.formatHeaderDatesWithDaysUseCase = iVar;
        l.a aVar2 = l.a.f196784a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: ua2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f196791a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), l9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m.a l9(l state) {
        return this.mapper.b(new va2.b.Params(state, new a(this), new er.l() { // from class: ua2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.m9(this.f196792a, (OffsetDateTime) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Label m9(q qVar, OffsetDateTime offsetDateTime) {
        return qVar.formatHeaderDatesWithDaysUseCase.a(new a14.i.Params(offsetDateTime, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(l.class), new er.l() { // from class: ua2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f196793a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(q qVar, z zVar) {
        zVar.A(qVar.new c(null));
        d dVar = qVar.new d(null);
        zVar.x(q0.c(j.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<k> Y1() {
        return this.navAction;
    }

    @Override // ua2.m
    public void d() {
        d9(j.f196782a);
    }

    @Override // l00.g
    protected k10.t<l, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
