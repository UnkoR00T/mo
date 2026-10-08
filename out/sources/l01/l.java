package l01;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Ll01/l;", "Ll00/g;", "Ll01/e;", "", "Ll01/f;", "Lyy/a;", "stateMachineFactory", "Lm01/a;", "reportMapper", "<init>", "(Lyy/a;Lm01/a;)V", "Ll01/f$a;", "j9", "()Ll01/f$a;", "b", "Lm01/a;", "Lxw/b;", "Ll01/c;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "()V", "state", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<e, Object> implements zx.d, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m01.a reportMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l01.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state = a9(new a(e9().getState(), this), j9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f113976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f113977b;

        /* JADX INFO: renamed from: l01.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2764a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f113978a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f113979b;

            /* JADX INFO: renamed from: l01.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2765a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f113980d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f113981e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f113982f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f113984h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f113985j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f113986k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f113987l;

                public C2765a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f113980d = obj;
                    this.f113981e |= PKIFailureInfo.systemUnavail;
                    return C2764a.this.F(null, this);
                }
            }

            public C2764a(mu.h hVar, l lVar) {
                this.f113978a = hVar;
                this.f113979b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2765a c2765a;
                if (eVar instanceof C2765a) {
                    c2765a = (C2765a) eVar;
                    int i15 = c2765a.f113981e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2765a.f113981e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2765a = new C2765a(eVar);
                    }
                } else {
                    c2765a = new C2765a(eVar);
                }
                Object obj2 = c2765a.f113980d;
                Object objE = uq.b.e();
                int i16 = c2765a.f113981e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f113978a;
                    f.Data dataJ9 = this.f113979b.j9();
                    c2765a.f113982f = vq.j.a(obj);
                    c2765a.f113984h = vq.j.a(c2765a);
                    c2765a.f113985j = vq.j.a(obj);
                    c2765a.f113986k = vq.j.a(hVar);
                    c2765a.f113987l = 0;
                    c2765a.f113981e = 1;
                    if (hVar.F(dataJ9, c2765a) == objE) {
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
            this.f113976a = gVar;
            this.f113977b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f113976a.a(new C2764a(hVar, this.f113977b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll01/a;", "<unused var>", "Ll01/e;", "Loq/i0;", "<anonymous>", "(Ll01/a;Ll01/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<l01.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113988e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113988e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<l01.c> bVarY1 = l.this.Y1();
                l01.c.a aVar = l01.c.a.f113960a;
                this.f113988e = 1;
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
        public final Object w(l01.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return l.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll01/b;", "<unused var>", "Ll01/e;", "Loq/i0;", "<anonymous>", "(Ll01/b;Ll01/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<l01.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113990e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113990e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<l01.c> bVarY1 = l.this.Y1();
                l01.c.b bVar = l01.c.b.f113961a;
                this.f113990e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(l01.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return l.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll01/d;", "<unused var>", "Ll01/e;", "Loq/i0;", "<anonymous>", "(Ll01/d;Ll01/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<l01.d, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113992e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113992e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<l01.c> bVarY1 = l.this.Y1();
                l01.c.C2763c c2763c = l01.c.C2763c.f113962a;
                this.f113992e = 1;
                if (bVarY1.F(c2763c, this) == objE) {
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
        public final Object w(l01.d dVar, e eVar, tq.e<? super i0> eVar2) {
            return l.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, m01.a aVar2) {
        this.reportMapper = aVar2;
        this.stateMachine = aVar.a(e.f113964a, new er.l() { // from class: l01.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f113970a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data j9() {
        return this.reportMapper.b(new m01.a.Params(b9(l01.a.f113958a), b9(l01.d.f113963a), b9(l01.b.f113959a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: l01.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f113971a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(l01.a.class), oVar, bVar);
        zVar.x(q0.c(l01.b.class), oVar, lVar.new c(null));
        zVar.x(q0.c(l01.d.class), oVar, lVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<l01.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
