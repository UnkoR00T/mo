package uv3;

import fr.q0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Luv3/t;", "Ll00/g;", "Luv3/f;", "", "Luv3/g;", "Lmv3/c;", "Lyy/a;", "stateMachineFactory", "Lnv3/c;", "interactor", "Lmv3/a;", "data", "<init>", "(Lyy/a;Lnv3/c;Lmv3/a;)V", "Loq/i0;", "close", "()V", "A", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Z", "b", "Lnv3/c;", "c", "Lmv3/a;", "getData", "()Lmv3/a;", "Lxw/b;", "Lmv3/c$a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Luv3/g$a;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<f, Object> implements g, mv3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nv3.c interactor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mv3.a data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<f, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mv3.c.a> navAction = new xw.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<g.a> state = a9(new a(e9().getState()), g.a.f201781a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f201798a;

        /* JADX INFO: renamed from: uv3.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5239a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f201799a;

            /* JADX INFO: renamed from: uv3.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5240a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f201800d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f201801e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f201802f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f201804h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f201805j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f201806k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f201807l;

                public C5240a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f201800d = obj;
                    this.f201801e |= PKIFailureInfo.systemUnavail;
                    return C5239a.this.F(null, this);
                }
            }

            public C5239a(mu.h hVar) {
                this.f201799a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5240a c5240a;
                if (eVar instanceof C5240a) {
                    c5240a = (C5240a) eVar;
                    int i15 = c5240a.f201801e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5240a.f201801e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5240a = new C5240a(eVar);
                    }
                } else {
                    c5240a = new C5240a(eVar);
                }
                Object obj2 = c5240a.f201800d;
                Object objE = uq.b.e();
                int i16 = c5240a.f201801e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f201799a;
                    g.a aVar = g.a.f201781a;
                    c5240a.f201802f = vq.j.a(obj);
                    c5240a.f201804h = vq.j.a(c5240a);
                    c5240a.f201805j = vq.j.a(obj);
                    c5240a.f201806k = vq.j.a(hVar);
                    c5240a.f201807l = 0;
                    c5240a.f201801e = 1;
                    if (hVar.F(aVar, c5240a) == objE) {
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

        public a(mu.g gVar) {
            this.f201798a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.a> hVar, tq.e eVar) {
            Object objA = this.f201798a.a(new C5239a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luv3/e;", "<unused var>", "Luv3/f;", "Loq/i0;", "<anonymous>", "(Luv3/e;Luv3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201808e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201808e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mv3.c.a> bVarY1 = t.this.Y1();
                mv3.c.a.b bVar = mv3.c.a.b.f128687a;
                this.f201808e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(e eVar, f fVar, tq.e<? super i0> eVar2) {
            return t.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luv3/d;", "<unused var>", "Luv3/f;", "Loq/i0;", "<anonymous>", "(Luv3/d;Luv3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<d, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201810e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201810e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mv3.c.a> bVarY1 = t.this.Y1();
                mv3.c.a.C3193a c3193a = mv3.c.a.C3193a.f128686a;
                this.f201810e = 1;
                if (bVarY1.F(c3193a, this) == objE) {
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
        public final Object w(d dVar, f fVar, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    public t(yy.a aVar, nv3.c cVar, mv3.a aVar2) {
        this.interactor = cVar;
        this.data = aVar2;
        this.stateMachine = aVar.a(f.f201780a, new er.l() { // from class: uv3.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.j9(this.f201792a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(f.class), new er.l() { // from class: uv3.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.k9(this.f201791a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9(t tVar, z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e.class), oVar, bVar);
        zVar.x(q0.c(d.class), oVar, tVar.new c(null));
        return i0.f148189a;
    }

    @Override // uv3.g
    public void A() {
        d9(d.f201778a);
    }

    @Override // uv3.g
    public boolean L() {
        return this.interactor.L();
    }

    @Override // zx.b
    public xw.b<mv3.c.a> Y1() {
        return this.navAction;
    }

    @Override // uv3.g
    public void close() {
        d9(e.f201779a);
    }

    @Override // l00.g
    protected k10.t<f, Object> e9() {
        return this.stateMachine;
    }

    @Override // uv3.g
    public mv3.a getData() {
        return this.data;
    }

    @Override // l00.e
    public p0<g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mv3.a aVar) {
        super.P5(aVar);
    }
}
