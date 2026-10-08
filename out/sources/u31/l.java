package u31;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lu31/l;", "Ll00/g;", "Lu31/b;", "", "Lu31/c;", "Lyy/a;", "stateMachineFactory", "Lv31/a;", "mapper", "<init>", "(Lyy/a;Lv31/a;)V", "Lu31/c$a;", "j9", "(Lu31/b;)Lu31/c$a;", "b", "Lv31/a;", "c", "Lu31/b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lu31/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<u31.b, Object> implements c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v31.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u31.b initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<u31.b, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<u31.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f194983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f194984b;

        /* JADX INFO: renamed from: u31.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5077a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f194985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f194986b;

            /* JADX INFO: renamed from: u31.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5078a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f194987d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f194988e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f194989f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f194991h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f194992j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f194993k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f194994l;

                public C5078a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f194987d = obj;
                    this.f194988e |= PKIFailureInfo.systemUnavail;
                    return C5077a.this.F(null, this);
                }
            }

            public C5077a(mu.h hVar, l lVar) {
                this.f194985a = hVar;
                this.f194986b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5078a c5078a;
                if (eVar instanceof C5078a) {
                    c5078a = (C5078a) eVar;
                    int i15 = c5078a.f194988e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5078a.f194988e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5078a = new C5078a(eVar);
                    }
                } else {
                    c5078a = new C5078a(eVar);
                }
                Object obj2 = c5078a.f194987d;
                Object objE = uq.b.e();
                int i16 = c5078a.f194988e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f194985a;
                    c.Data dataJ9 = this.f194986b.j9((u31.b) obj);
                    c5078a.f194989f = vq.j.a(obj);
                    c5078a.f194991h = vq.j.a(c5078a);
                    c5078a.f194992j = vq.j.a(obj);
                    c5078a.f194993k = vq.j.a(hVar);
                    c5078a.f194994l = 0;
                    c5078a.f194988e = 1;
                    if (hVar.F(dataJ9, c5078a) == objE) {
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
            this.f194983a = gVar;
            this.f194984b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c.Data> hVar, tq.e eVar) {
            Object objA = this.f194983a.a(new C5077a(hVar, this.f194984b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu31/a;", "action", "Lu31/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lu31/a;Lu31/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<u31.a, u31.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194996f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u31.a aVar = (u31.a) this.f194996f;
            Object objE = uq.b.e();
            int i15 = this.f194995e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<u31.a> bVarY1 = l.this.Y1();
                this.f194996f = vq.j.a(aVar);
                this.f194995e = 1;
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
        public final Object w(u31.a aVar, u31.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = l.this.new b(eVar);
            bVar2.f194996f = aVar;
            return bVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, v31.a aVar2) {
        this.mapper = aVar2;
        u31.b bVar = u31.b.f194964a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: u31.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f194976a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.Data j9(u31.b bVar) {
        return this.mapper.b(new v31.a.Params(bVar, b9(u31.a.C5076a.f194963a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(u31.b.class), new er.l() { // from class: u31.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f194977a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(u31.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<u31.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<u31.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
