package v03;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lv03/l;", "Ll00/g;", "Lv03/e;", "", "Lv03/f;", "Lyy/a;", "stateMachineFactory", "Lw03/a;", "safeBusNoDataMapper", "<init>", "(Lyy/a;Lw03/a;)V", "Lv03/f$a;", "j9", "()Lv03/f$a;", "b", "Lw03/a;", "c", "Lv03/e;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lv03/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w03.a safeBusNoDataMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f202984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f202985b;

        /* JADX INFO: renamed from: v03.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5274a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f202986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f202987b;

            /* JADX INFO: renamed from: v03.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5275a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f202988d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f202989e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f202990f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f202992h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f202993j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f202994k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f202995l;

                public C5275a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f202988d = obj;
                    this.f202989e |= PKIFailureInfo.systemUnavail;
                    return C5274a.this.F(null, this);
                }
            }

            public C5274a(mu.h hVar, l lVar) {
                this.f202986a = hVar;
                this.f202987b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5275a c5275a;
                if (eVar instanceof C5275a) {
                    c5275a = (C5275a) eVar;
                    int i15 = c5275a.f202989e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5275a.f202989e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5275a = new C5275a(eVar);
                    }
                } else {
                    c5275a = new C5275a(eVar);
                }
                Object obj2 = c5275a.f202988d;
                Object objE = uq.b.e();
                int i16 = c5275a.f202989e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f202986a;
                    f.Data dataJ9 = this.f202987b.j9();
                    c5275a.f202990f = vq.j.a(obj);
                    c5275a.f202992h = vq.j.a(c5275a);
                    c5275a.f202993j = vq.j.a(obj);
                    c5275a.f202994k = vq.j.a(hVar);
                    c5275a.f202995l = 0;
                    c5275a.f202989e = 1;
                    if (hVar.F(dataJ9, c5275a) == objE) {
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
            this.f202984a = gVar;
            this.f202985b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f202984a.a(new C5274a(hVar, this.f202985b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv03/c;", "<unused var>", "Lv03/e;", "Loq/i0;", "<anonymous>", "(Lv03/c;Lv03/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<c, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f202996e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f202996e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<d> bVarY1 = l.this.Y1();
                d.a aVar = d.a.f202969a;
                this.f202996e = 1;
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
        public final Object w(c cVar, e eVar, tq.e<? super i0> eVar2) {
            return l.this.new b(eVar2).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, w03.a aVar2) {
        this.safeBusNoDataMapper = aVar2;
        e eVar = e.f202970a;
        this.initialState = eVar;
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: v03.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f202977a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data j9() {
        return this.safeBusNoDataMapper.b(new w03.a.Params(b9(c.f202968a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: v03.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f202978a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d> Y1() {
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
