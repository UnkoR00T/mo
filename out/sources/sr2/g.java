package sr2;

import er.l;
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
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lsr2/g;", "Ll00/g;", "Lsr2/b;", "", "Lyy/a;", "stateMachineFactory", "Lsr2/d;", "mapper", "<init>", "(Lyy/a;Lsr2/d;)V", "state", "Lsr2/c;", "j9", "(Lsr2/b;)Lsr2/c;", "b", "Lsr2/d;", "c", "Lsr2/b;", "initialState", "Lxw/b;", "Lsr2/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "passportpickup_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends l00.g<sr2.b, Object> implements l00.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sr2.b initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sr2.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<sr2.b, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f183801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f183802b;

        /* JADX INFO: renamed from: sr2.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4732a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f183803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f183804b;

            /* JADX INFO: renamed from: sr2.g$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4733a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f183805d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f183806e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f183807f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f183809h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f183810j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f183811k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f183812l;

                public C4733a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f183805d = obj;
                    this.f183806e |= PKIFailureInfo.systemUnavail;
                    return C4732a.this.F(null, this);
                }
            }

            public C4732a(mu.h hVar, g gVar) {
                this.f183803a = hVar;
                this.f183804b = gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4733a c4733a;
                if (eVar instanceof C4733a) {
                    c4733a = (C4733a) eVar;
                    int i15 = c4733a.f183806e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4733a.f183806e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4733a = new C4733a(eVar);
                    }
                } else {
                    c4733a = new C4733a(eVar);
                }
                Object obj2 = c4733a.f183805d;
                Object objE = uq.b.e();
                int i16 = c4733a.f183806e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f183803a;
                    Data dataJ9 = this.f183804b.j9((sr2.b) obj);
                    c4733a.f183807f = vq.j.a(obj);
                    c4733a.f183809h = vq.j.a(c4733a);
                    c4733a.f183810j = vq.j.a(obj);
                    c4733a.f183811k = vq.j.a(hVar);
                    c4733a.f183812l = 0;
                    c4733a.f183806e = 1;
                    if (hVar.F(dataJ9, c4733a) == objE) {
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

        public a(mu.g gVar, g gVar2) {
            this.f183801a = gVar;
            this.f183802b = gVar2;
        }

        @Override // mu.g
        public Object a(mu.h<? super Data> hVar, tq.e eVar) {
            Object objA = this.f183801a.a(new C4732a(hVar, this.f183802b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsr2/a;", "action", "Lsr2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsr2/a;Lsr2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements q<sr2.a, sr2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183814f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sr2.a aVar = (sr2.a) this.f183814f;
            Object objE = uq.b.e();
            int i15 = this.f183813e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<sr2.a> bVarY1 = g.this.Y1();
                this.f183814f = vq.j.a(aVar);
                this.f183813e = 1;
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
        public final Object w(sr2.a aVar, sr2.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = g.this.new b(eVar);
            bVar2.f183814f = aVar;
            return bVar2.J(i0.f148189a);
        }
    }

    public g(yy.a aVar, d dVar) {
        this.mapper = dVar;
        sr2.b bVar = sr2.b.f183789a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new l() { // from class: sr2.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.l9(this.f183794a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Data j9(sr2.b state) {
        return this.mapper.b(new d.Params(state, b9(sr2.a.C4731a.f183788a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final g gVar, v vVar) {
        vVar.c(q0.c(sr2.b.class), new l() { // from class: sr2.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.m9(this.f183795a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(g gVar, z zVar) {
        b bVar = gVar.new b(null);
        zVar.x(q0.c(sr2.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sr2.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<sr2.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
