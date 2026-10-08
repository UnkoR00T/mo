package xa2;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lxa2/r;", "Ll00/g;", "Lxa2/n;", "", "Lxa2/o;", "Lyy/a;", "stateMachineFactory", "Lya2/a;", "mapper", "Lz92/c;", "loadVerificationHistoryUseCase", "<init>", "(Lyy/a;Lya2/a;Lz92/c;)V", "state", "Lxa2/o$a;", "k9", "(Lxa2/n;)Lxa2/o$a;", "Loq/i0;", "d", "()V", "b", "Lya2/a;", "c", "Lz92/c;", "Lxa2/n$a;", "Lxa2/n$a;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxa2/m;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<n, Object> implements o, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ya2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z92.c loadVerificationHistoryUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n.a initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<n, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<o.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, r.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((r) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<o.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f217820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f217821b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f217822a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f217823b;

            /* JADX INFO: renamed from: xa2.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5816a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f217824d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f217825e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f217826f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f217828h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f217829j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f217830k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f217831l;

                public C5816a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f217824d = obj;
                    this.f217825e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f217822a = hVar;
                this.f217823b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5816a c5816a;
                if (eVar instanceof C5816a) {
                    c5816a = (C5816a) eVar;
                    int i15 = c5816a.f217825e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5816a.f217825e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5816a = new C5816a(eVar);
                    }
                } else {
                    c5816a = new C5816a(eVar);
                }
                Object obj2 = c5816a.f217824d;
                Object objE = uq.b.e();
                int i16 = c5816a.f217825e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f217822a;
                    o.a aVarK9 = this.f217823b.k9((n) obj);
                    c5816a.f217826f = vq.j.a(obj);
                    c5816a.f217828h = vq.j.a(c5816a);
                    c5816a.f217829j = vq.j.a(obj);
                    c5816a.f217830k = vq.j.a(hVar);
                    c5816a.f217831l = 0;
                    c5816a.f217825e = 1;
                    if (hVar.F(aVarK9, c5816a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f217820a = gVar;
            this.f217821b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o.a> hVar, tq.e eVar) {
            Object objA = this.f217820a.a(new a(hVar, this.f217821b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lxa2/n;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<n>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217833f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n V(n nVar) {
            return n.a.f217805a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n X(List list, n nVar) {
            return new n.Initialized(list);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f217833f;
            Object objE = uq.b.e();
            int i15 = this.f217832e;
            if (i15 == 0) {
                oq.u.b(obj);
                z92.c cVar = r.this.loadVerificationHistoryUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f217833f = c0Var;
                this.f217832e = 1;
                obj = cVar.c(c1792a, this);
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
            return list.isEmpty() ? c0Var.b(new er.l() { // from class: xa2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c.V((n) obj2);
                }
            }) : c0Var.b(new er.l() { // from class: xa2.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c.X(list, (n) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<n> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = r.this.new c(eVar);
            cVar.f217833f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxa2/l;", "<unused var>", "Lxa2/n;", "Loq/i0;", "<anonymous>", "(Lxa2/l;Lxa2/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<l, n, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217835e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f217835e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m> bVarY1 = r.this.Y1();
                m.a aVar = m.a.f217804a;
                this.f217835e = 1;
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
        public final Object w(l lVar, n nVar, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ya2.a aVar2, z92.c cVar) {
        this.mapper = aVar2;
        this.loadVerificationHistoryUseCase = cVar;
        n.a aVar3 = n.a.f217805a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: xa2.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.m9(this.f217812a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), k9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o.a k9(n state) {
        return this.mapper.b(new ya2.a.Params(state, new a(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(n.class), new er.l() { // from class: xa2.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.n9(this.f217813a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(r rVar, z zVar) {
        zVar.A(rVar.new c(null));
        d dVar = rVar.new d(null);
        zVar.x(q0.c(l.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<m> Y1() {
        return this.navAction;
    }

    @Override // xa2.o
    public void d() {
        d9(l.f217803a);
    }

    @Override // l00.g
    protected k10.t<n, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<o.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
