package gk2;

import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lgk2/j;", "Ll00/g;", "Lgk2/b;", "Lgk2/a;", "Lgk2/c;", "", "Lyy/a;", "stateMachineFactory", "Lhk2/b;", "mapper", "<init>", "(Lyy/a;Lhk2/b;)V", "Lgk2/c$a;", "m9", "()Lgk2/c$a;", "b", "Lhk2/b;", "Lxw/b;", "Lgk2/a$b;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<gk2.b, gk2.a> implements gk2.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hk2.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<gk2.b, gk2.a> stateMachine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gk2.a.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<gk2.c.Data> state = a9(new a(e9().getState(), this), m9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<gk2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f73496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f73497b;

        /* JADX INFO: renamed from: gk2.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1683a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f73498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f73499b;

            /* JADX INFO: renamed from: gk2.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1684a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f73500d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f73501e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f73502f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f73504h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f73505j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f73506k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f73507l;

                public C1684a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f73500d = obj;
                    this.f73501e |= PKIFailureInfo.systemUnavail;
                    return C1683a.this.F(null, this);
                }
            }

            public C1683a(mu.h hVar, j jVar) {
                this.f73498a = hVar;
                this.f73499b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1684a c1684a;
                if (eVar instanceof C1684a) {
                    c1684a = (C1684a) eVar;
                    int i15 = c1684a.f73501e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1684a.f73501e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1684a = new C1684a(eVar);
                    }
                } else {
                    c1684a = new C1684a(eVar);
                }
                Object obj2 = c1684a.f73500d;
                Object objE = uq.b.e();
                int i16 = c1684a.f73501e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f73498a;
                    gk2.c.Data dataM9 = this.f73499b.m9();
                    c1684a.f73502f = vq.j.a(obj);
                    c1684a.f73504h = vq.j.a(c1684a);
                    c1684a.f73505j = vq.j.a(obj);
                    c1684a.f73506k = vq.j.a(hVar);
                    c1684a.f73507l = 0;
                    c1684a.f73501e = 1;
                    if (hVar.F(dataM9, c1684a) == objE) {
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

        public a(mu.g gVar, j jVar) {
            this.f73496a = gVar;
            this.f73497b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super gk2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f73496a.a(new C1683a(hVar, this.f73497b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgk2/a$a;", "<unused var>", "Lgk2/b;", "Loq/i0;", "<anonymous>", "(Lgk2/a$a;Lgk2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<gk2.a.C1680a, gk2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73508e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73508e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                gk2.a.b.C1681a c1681a = gk2.a.b.C1681a.f73472a;
                this.f73508e = 1;
                if (jVar.F(c1681a, this) == objE) {
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
        public final Object w(gk2.a.C1680a c1680a, gk2.b bVar, tq.e<? super i0> eVar) {
            return j.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgk2/a$d;", "<unused var>", "Lgk2/b;", "Loq/i0;", "<anonymous>", "(Lgk2/a$d;Lgk2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<gk2.a.d, gk2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73510e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73510e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                gk2.a.b.c cVar = gk2.a.b.c.f73474a;
                this.f73510e = 1;
                if (jVar.F(cVar, this) == objE) {
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
        public final Object w(gk2.a.d dVar, gk2.b bVar, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgk2/a$c;", "<unused var>", "Lgk2/b;", "Loq/i0;", "<anonymous>", "(Lgk2/a$c;Lgk2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<gk2.a.c, gk2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73512e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73512e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                gk2.a.b.ShowDialog showDialog = new gk2.a.b.ShowDialog(j.this.mapper.f(j.this.b9(gk2.a.d.f73476a)));
                this.f73512e = 1;
                if (jVar.F(showDialog, this) == objE) {
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
        public final Object w(gk2.a.c cVar, gk2.b bVar, tq.e<? super i0> eVar) {
            return j.this.new d(eVar).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, hk2.b bVar) {
        this.mapper = bVar;
        this.stateMachine = aVar.a(gk2.b.f73477a, new er.l() { // from class: gk2.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.o9(this.f73490a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gk2.c.Data m9() {
        return this.mapper.b(new hk2.b.Params(b9(gk2.a.C1680a.f73471a), b9(gk2.a.c.f73475a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final j jVar, v vVar) {
        vVar.c(q0.c(gk2.b.class), new er.l() { // from class: gk2.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.p9(this.f73491a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gk2.a.C1680a.class), oVar, bVar);
        zVar.x(q0.c(gk2.a.d.class), oVar, jVar.new c(null));
        zVar.x(q0.c(gk2.a.c.class), oVar, jVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<gk2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<gk2.b, gk2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gk2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(gk2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(gk2.c.Data data) {
        super.P5(data);
    }
}
