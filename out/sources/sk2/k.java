package sk2;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lsk2/k;", "Ll00/g;", "Lsk2/g;", "", "Lsk2/h;", "Lyy/a;", "stateMachineFactory", "Ltk2/a;", "mobileIdCardInfoScreenMapper", "<init>", "(Lyy/a;Ltk2/a;)V", "Lsk2/h$a;", "j9", "()Lsk2/h$a;", "b", "Ltk2/a;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsk2/f;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<g, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tk2.a mobileIdCardInfoScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<g, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state = a9(new a(e9().getState(), this), j9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f182141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f182142b;

        /* JADX INFO: renamed from: sk2.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4685a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f182143a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f182144b;

            /* JADX INFO: renamed from: sk2.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4686a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f182145d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f182146e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f182147f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f182149h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f182150j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f182151k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f182152l;

                public C4686a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f182145d = obj;
                    this.f182146e |= PKIFailureInfo.systemUnavail;
                    return C4685a.this.F(null, this);
                }
            }

            public C4685a(mu.h hVar, k kVar) {
                this.f182143a = hVar;
                this.f182144b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4686a c4686a;
                if (eVar instanceof C4686a) {
                    c4686a = (C4686a) eVar;
                    int i15 = c4686a.f182146e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4686a.f182146e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4686a = new C4686a(eVar);
                    }
                } else {
                    c4686a = new C4686a(eVar);
                }
                Object obj2 = c4686a.f182145d;
                Object objE = uq.b.e();
                int i16 = c4686a.f182146e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f182143a;
                    h.Data dataJ9 = this.f182144b.j9();
                    c4686a.f182147f = vq.j.a(obj);
                    c4686a.f182149h = vq.j.a(c4686a);
                    c4686a.f182150j = vq.j.a(obj);
                    c4686a.f182151k = vq.j.a(hVar);
                    c4686a.f182152l = 0;
                    c4686a.f182146e = 1;
                    if (hVar.F(dataJ9, c4686a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f182141a = gVar;
            this.f182142b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f182141a.a(new C4685a(hVar, this.f182142b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsk2/e;", "<unused var>", "Lsk2/g;", "Loq/i0;", "<anonymous>", "(Lsk2/e;Lsk2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<e, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182153e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f182153e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<f> bVarY1 = k.this.Y1();
                f.a aVar = f.a.f182129a;
                this.f182153e = 1;
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
        public final Object w(e eVar, g gVar, tq.e<? super i0> eVar2) {
            return k.this.new b(eVar2).J(i0.f148189a);
        }
    }

    public k(yy.a aVar, tk2.a aVar2) {
        this.mobileIdCardInfoScreenMapper = aVar2;
        this.stateMachine = aVar.a(g.f182130a, new er.l() { // from class: sk2.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.l9(this.f182135a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data j9() {
        return this.mobileIdCardInfoScreenMapper.b(new tk2.a.Params(b9(e.f182128a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final k kVar, v vVar) {
        vVar.c(q0.c(g.class), new er.l() { // from class: sk2.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f182136a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(e.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<g, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
