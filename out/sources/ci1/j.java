package ci1;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lci1/j;", "Ll00/g;", "Lci1/b;", "", "Lci1/c;", "Lyy/a;", "stateMachineFactory", "Ldi1/a;", "servicesAdjustScreenMapper", "<init>", "(Lyy/a;Ldi1/a;)V", "state", "Ldi1/a$a;", "l9", "(Lci1/b;)Ldi1/a$a;", "b", "Ldi1/a;", "c", "Lci1/b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lci1/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lci1/c$a;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<ci1.b, Object> implements ci1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final di1.a servicesAdjustScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ci1.b initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<ci1.b, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ci1.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<ci1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ci1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f27172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f27173b;

        /* JADX INFO: renamed from: ci1.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0699a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f27174a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f27175b;

            /* JADX INFO: renamed from: ci1.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0700a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f27176d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f27177e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f27178f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f27180h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f27181j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f27182k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f27183l;

                public C0700a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f27176d = obj;
                    this.f27177e |= PKIFailureInfo.systemUnavail;
                    return C0699a.this.F(null, this);
                }
            }

            public C0699a(mu.h hVar, j jVar) {
                this.f27174a = hVar;
                this.f27175b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0700a c0700a;
                if (eVar instanceof C0700a) {
                    c0700a = (C0700a) eVar;
                    int i15 = c0700a.f27177e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0700a.f27177e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0700a = new C0700a(eVar);
                    }
                } else {
                    c0700a = new C0700a(eVar);
                }
                Object obj2 = c0700a.f27176d;
                Object objE = uq.b.e();
                int i16 = c0700a.f27177e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f27174a;
                    ci1.c.Data dataB = this.f27175b.servicesAdjustScreenMapper.b(this.f27175b.l9((ci1.b) obj));
                    c0700a.f27178f = vq.j.a(obj);
                    c0700a.f27180h = vq.j.a(c0700a);
                    c0700a.f27181j = vq.j.a(obj);
                    c0700a.f27182k = vq.j.a(hVar);
                    c0700a.f27183l = 0;
                    c0700a.f27177e = 1;
                    if (hVar.F(dataB, c0700a) == objE) {
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
            this.f27172a = gVar;
            this.f27173b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ci1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f27172a.a(new C0699a(hVar, this.f27173b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lci1/a$c;", "<unused var>", "Lci1/b;", "Loq/i0;", "<anonymous>", "(Lci1/a$c;Lci1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<ci1.a.c, ci1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27184e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f27184e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                ci1.a.c cVar = ci1.a.c.f27154a;
                this.f27184e = 1;
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
        public final Object w(ci1.a.c cVar, ci1.b bVar, tq.e<? super i0> eVar) {
            return j.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lci1/a$b;", "<unused var>", "Lci1/b;", "Loq/i0;", "<anonymous>", "(Lci1/a$b;Lci1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ci1.a.b, ci1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27186e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f27186e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                ci1.a.b bVar = ci1.a.b.f27153a;
                this.f27186e = 1;
                if (jVar.F(bVar, this) == objE) {
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
        public final Object w(ci1.a.b bVar, ci1.b bVar2, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lci1/a$a;", "<unused var>", "Lci1/b;", "Loq/i0;", "<anonymous>", "(Lci1/a$a;Lci1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<ci1.a.C0698a, ci1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27188e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f27188e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                ci1.a.C0698a c0698a = ci1.a.C0698a.f27152a;
                this.f27188e = 1;
                if (jVar.F(c0698a, this) == objE) {
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
        public final Object w(ci1.a.C0698a c0698a, ci1.b bVar, tq.e<? super i0> eVar) {
            return j.this.new d(eVar).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, di1.a aVar2) {
        this.servicesAdjustScreenMapper = aVar2;
        ci1.b bVar = ci1.b.f27155a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: ci1.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.n9(this.f27165a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), aVar2.b(l9(bVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final di1.a.Params l9(ci1.b state) {
        return new di1.a.Params(state, b9(ci1.a.b.f27153a), b9(ci1.a.c.f27154a), b9(ci1.a.C0698a.f27152a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final j jVar, v vVar) {
        vVar.c(q0.c(ci1.b.class), new er.l() { // from class: ci1.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.o9(this.f27166a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ci1.a.c.class), oVar, bVar);
        zVar.x(q0.c(ci1.a.b.class), oVar, jVar.new c(null));
        zVar.x(q0.c(ci1.a.C0698a.class), oVar, jVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ci1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<ci1.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ci1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ci1.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
