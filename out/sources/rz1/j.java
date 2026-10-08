package rz1;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lrz1/j;", "Ll00/g;", "Lrz1/c;", "", "Lrz1/d;", "Lsz1/a;", "mapper", "Lyy/a;", "stateMachineFactory", "<init>", "(Lsz1/a;Lyy/a;)V", "state", "Lrz1/d$a;", "k9", "(Lrz1/c;)Lrz1/d$a;", "b", "Lsz1/a;", "c", "Lrz1/c;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lrz1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sz1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rz1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f176946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f176947b;

        /* JADX INFO: renamed from: rz1.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4519a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f176948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f176949b;

            /* JADX INFO: renamed from: rz1.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4520a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f176950d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f176951e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f176952f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f176954h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f176955j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f176956k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f176957l;

                public C4520a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f176950d = obj;
                    this.f176951e |= PKIFailureInfo.systemUnavail;
                    return C4519a.this.F(null, this);
                }
            }

            public C4519a(mu.h hVar, j jVar) {
                this.f176948a = hVar;
                this.f176949b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4520a c4520a;
                if (eVar instanceof C4520a) {
                    c4520a = (C4520a) eVar;
                    int i15 = c4520a.f176951e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4520a.f176951e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4520a = new C4520a(eVar);
                    }
                } else {
                    c4520a = new C4520a(eVar);
                }
                Object obj2 = c4520a.f176950d;
                Object objE = uq.b.e();
                int i16 = c4520a.f176951e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f176948a;
                    d.Data dataK9 = this.f176949b.k9((c) obj);
                    c4520a.f176952f = vq.j.a(obj);
                    c4520a.f176954h = vq.j.a(c4520a);
                    c4520a.f176955j = vq.j.a(obj);
                    c4520a.f176956k = vq.j.a(hVar);
                    c4520a.f176957l = 0;
                    c4520a.f176951e = 1;
                    if (hVar.F(dataK9, c4520a) == objE) {
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
            this.f176946a = gVar;
            this.f176947b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f176946a.a(new C4519a(hVar, this.f176947b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrz1/a;", "<unused var>", "Lrz1/c;", "Loq/i0;", "<anonymous>", "(Lrz1/a;Lrz1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<rz1.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176958e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f176958e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                rz1.b.a aVar = rz1.b.a.f176931a;
                this.f176958e = 1;
                if (jVar.F(aVar, this) == objE) {
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
        public final Object w(rz1.a aVar, c cVar, tq.e<? super i0> eVar) {
            return j.this.new b(eVar).J(i0.f148189a);
        }
    }

    public j(sz1.a aVar, yy.a aVar2) {
        this.mapper = aVar;
        c cVar = c.f176932a;
        this.initialState = cVar;
        this.stateMachine = aVar2.a(cVar, new er.l() { // from class: rz1.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.m9(this.f176939a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data k9(c state) {
        return this.mapper.b(new sz1.a.Params(state, b9(rz1.a.f176930a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final j jVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: rz1.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.n9(this.f176940a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        zVar.x(q0.c(rz1.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<rz1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(rz1.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
