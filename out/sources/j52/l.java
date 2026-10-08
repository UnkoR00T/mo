package j52;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lj52/l;", "Ll00/g;", "Lj52/d;", "", "Lj52/e;", "Lyy/a;", "stateMachineFactory", "Lk52/a;", "mapper", "<init>", "(Lyy/a;Lk52/a;)V", "Lj52/e$a;", "k9", "()Lj52/e$a;", "b", "Lk52/a;", "Lxw/b;", "Lj52/b;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k52.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j52.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state = a9(new a(e9().getState(), this), k9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f99551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f99552b;

        /* JADX INFO: renamed from: j52.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2333a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f99553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f99554b;

            /* JADX INFO: renamed from: j52.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2334a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f99555d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f99556e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f99557f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f99559h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f99560j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f99561k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f99562l;

                public C2334a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f99555d = obj;
                    this.f99556e |= PKIFailureInfo.systemUnavail;
                    return C2333a.this.F(null, this);
                }
            }

            public C2333a(mu.h hVar, l lVar) {
                this.f99553a = hVar;
                this.f99554b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2334a c2334a;
                if (eVar instanceof C2334a) {
                    c2334a = (C2334a) eVar;
                    int i15 = c2334a.f99556e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2334a.f99556e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2334a = new C2334a(eVar);
                    }
                } else {
                    c2334a = new C2334a(eVar);
                }
                Object obj2 = c2334a.f99555d;
                Object objE = uq.b.e();
                int i16 = c2334a.f99556e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f99553a;
                    e.Data dataK9 = this.f99554b.k9();
                    c2334a.f99557f = vq.j.a(obj);
                    c2334a.f99559h = vq.j.a(c2334a);
                    c2334a.f99560j = vq.j.a(obj);
                    c2334a.f99561k = vq.j.a(hVar);
                    c2334a.f99562l = 0;
                    c2334a.f99556e = 1;
                    if (hVar.F(dataK9, c2334a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f99551a = gVar;
            this.f99552b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f99551a.a(new C2333a(hVar, this.f99552b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj52/a;", "<unused var>", "Lj52/d;", "Loq/i0;", "<anonymous>", "(Lj52/a;Lj52/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<j52.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99563e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f99563e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<j52.b> bVarY1 = l.this.Y1();
                j52.b.a aVar = j52.b.a.f99530a;
                this.f99563e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(j52.a aVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj52/c;", "<unused var>", "Lj52/d;", "Loq/i0;", "<anonymous>", "(Lj52/c;Lj52/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<j52.c, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99565e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f99565e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                j52.b.C2332b c2332b = j52.b.C2332b.f99531a;
                this.f99565e = 1;
                if (lVar.F(c2332b, this) == objE) {
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
        public final Object w(j52.c cVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, k52.a aVar2) {
        this.mapper = aVar2;
        this.stateMachine = aVar.a(d.f99533a, new er.l() { // from class: j52.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f99545a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data k9() {
        return this.mapper.b(new k52.a.Params(b9(j52.a.f99529a), b9(j52.c.f99532a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: j52.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f99546a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(j52.a.class), oVar, bVar);
        zVar.x(q0.c(j52.c.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<j52.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(j52.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
