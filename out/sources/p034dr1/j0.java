package p034dr1;

import er.l;
import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import l00.g;
import mu.h;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00118\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ldr1/j0;", "Ll00/g;", "Ldr1/o;", "", "Ldr1/p;", "Lyy/a;", "stateMachineFactory", "Ldr1/v;", "mapper", "<init>", "(Lyy/a;Ldr1/v;)V", "state", "Ldr1/v$a;", "k9", "(Ldr1/o;)Ldr1/v$a;", "b", "Ldr1/v;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "Ldr1/p$a;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lxw/b;", "Ldr1/m;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 extends g<o, Object> implements p, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<o, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<p.Data> state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<p.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f44206b;

        /* JADX INFO: renamed from: dr1.j0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0994a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f44207a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f44208b;

            /* JADX INFO: renamed from: dr1.j0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0995a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44209d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44210e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44211f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44213h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44214j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44215k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44216l;

                public C0995a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44209d = obj;
                    this.f44210e |= PKIFailureInfo.systemUnavail;
                    return C0994a.this.F(null, this);
                }
            }

            public C0994a(h hVar, j0 j0Var) {
                this.f44207a = hVar;
                this.f44208b = j0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0995a c0995a;
                if (eVar instanceof C0995a) {
                    c0995a = (C0995a) eVar;
                    int i15 = c0995a.f44210e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0995a.f44210e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0995a = new C0995a(eVar);
                    }
                } else {
                    c0995a = new C0995a(eVar);
                }
                Object obj2 = c0995a.f44209d;
                Object objE = uq.b.e();
                int i16 = c0995a.f44210e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f44207a;
                    p.Data dataB = this.f44208b.mapper.b(this.f44208b.k9((o) obj));
                    c0995a.f44211f = j.a(obj);
                    c0995a.f44213h = j.a(c0995a);
                    c0995a.f44214j = j.a(obj);
                    c0995a.f44215k = j.a(hVar);
                    c0995a.f44216l = 0;
                    c0995a.f44210e = 1;
                    if (hVar.F(dataB, c0995a) == objE) {
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

        public a(mu.g gVar, j0 j0Var) {
            this.f44205a = gVar;
            this.f44206b = j0Var;
        }

        @Override // mu.g
        public Object a(h<? super p.Data> hVar, tq.e eVar) {
            Object objA = this.f44205a.a(new C0994a(hVar, this.f44206b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldr1/j;", "<unused var>", "Ldr1/o;", "Loq/i0;", "<anonymous>", "(Ldr1/j;Ldr1/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements q<j, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44217e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44217e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<m> bVarY1 = j0.this.Y1();
                m.a aVar = m.a.f44228a;
                this.f44217e = 1;
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
        public final Object w(j jVar, o oVar, tq.e<? super i0> eVar) {
            return j0.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldr1/n;", "<unused var>", "Ldr1/o;", "Loq/i0;", "<anonymous>", "(Ldr1/n;Ldr1/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements q<n, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44219e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44219e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<m> bVarY1 = j0.this.Y1();
                m.d dVar = m.d.f44231a;
                this.f44219e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(n nVar, o oVar, tq.e<? super i0> eVar) {
            return j0.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldr1/l;", "<unused var>", "Ldr1/o;", "Loq/i0;", "<anonymous>", "(Ldr1/l;Ldr1/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements q<l, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44221e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44221e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<m> bVarY1 = j0.this.Y1();
                m.c cVar = m.c.f44230a;
                this.f44221e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(l lVar, o oVar, tq.e<? super i0> eVar) {
            return j0.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldr1/k;", "<unused var>", "Ldr1/o;", "Loq/i0;", "<anonymous>", "(Ldr1/k;Ldr1/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements q<k, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44223e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44223e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<m> bVarY1 = j0.this.Y1();
                m.b bVar = m.b.f44229a;
                this.f44223e = 1;
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
        public final Object w(k kVar, o oVar, tq.e<? super i0> eVar) {
            return j0.this.new e(eVar).J(i0.f148189a);
        }
    }

    public j0(yy.a aVar, v vVar) {
        this.mapper = vVar;
        o oVar = o.f44234a;
        this.stateMachine = aVar.a(oVar, new l() { // from class: dr1.h0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.m9(this.f44192a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), vVar.b(k9(oVar)));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v.Params k9(o state) {
        return new v.Params(state, b9(j.f44200a), b9(n.f44233a), b9(l.f44226a), b9(k.f44225a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final j0 j0Var, v vVar) {
        vVar.c(q0.c(o.class), new l() { // from class: dr1.i0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.n9(this.f44199a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(j0 j0Var, z zVar) {
        b bVar = j0Var.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(j.class), oVar, bVar);
        zVar.x(q0.c(n.class), oVar, j0Var.new c(null));
        zVar.x(q0.c(l.class), oVar, j0Var.new d(null));
        zVar.x(q0.c(k.class), oVar, j0Var.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<m> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<o, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
