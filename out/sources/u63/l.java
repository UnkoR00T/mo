package u63;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0019\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lu63/l;", "Ll00/g;", "Lu63/c;", "", "Lu63/d;", "Lv63/a;", "mapper", "Lyy/a;", "stateMachineFactory", "<init>", "(Lv63/a;Lyy/a;)V", "Lu63/d$a;", "j9", "()Lu63/d$a;", "b", "Lv63/a;", "c", "Lu63/c;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lu63/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v63.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<u63.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f195896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f195897b;

        /* JADX INFO: renamed from: u63.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5100a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f195898a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f195899b;

            /* JADX INFO: renamed from: u63.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5101a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f195900d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f195901e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f195902f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f195904h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f195905j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f195906k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f195907l;

                public C5101a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f195900d = obj;
                    this.f195901e |= PKIFailureInfo.systemUnavail;
                    return C5100a.this.F(null, this);
                }
            }

            public C5100a(mu.h hVar, l lVar) {
                this.f195898a = hVar;
                this.f195899b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5101a c5101a;
                if (eVar instanceof C5101a) {
                    c5101a = (C5101a) eVar;
                    int i15 = c5101a.f195901e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5101a.f195901e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5101a = new C5101a(eVar);
                    }
                } else {
                    c5101a = new C5101a(eVar);
                }
                Object obj2 = c5101a.f195900d;
                Object objE = uq.b.e();
                int i16 = c5101a.f195901e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f195898a;
                    d.Data dataJ9 = this.f195899b.j9();
                    c5101a.f195902f = vq.j.a(obj);
                    c5101a.f195904h = vq.j.a(c5101a);
                    c5101a.f195905j = vq.j.a(obj);
                    c5101a.f195906k = vq.j.a(hVar);
                    c5101a.f195907l = 0;
                    c5101a.f195901e = 1;
                    if (hVar.F(dataJ9, c5101a) == objE) {
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
            this.f195896a = gVar;
            this.f195897b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f195896a.a(new C5100a(hVar, this.f195897b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu63/a;", "<unused var>", "Lu63/c;", "Loq/i0;", "<anonymous>", "(Lu63/a;Lu63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<u63.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195908e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195908e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<u63.b> bVarY1 = l.this.Y1();
                u63.b.a aVar = u63.b.a.f195872a;
                this.f195908e = 1;
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
        public final Object w(u63.a aVar, c cVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    public l(v63.a aVar, yy.a aVar2) {
        this.mapper = aVar;
        c cVar = c.f195873a;
        this.initialState = cVar;
        this.stateMachine = aVar2.a(cVar, new er.l() { // from class: u63.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f195889a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9() {
        return this.mapper.b(new v63.a.Params(b9(u63.a.f195871a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: u63.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f195890a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(u63.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<u63.b> Y1() {
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
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
