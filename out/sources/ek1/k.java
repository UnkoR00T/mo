package ek1;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lek1/k;", "Ll00/g;", "Lek1/c;", "", "Lek1/d;", "Lyy/a;", "stateMachineFactory", "Lfk1/a;", "mapper", "<init>", "(Lyy/a;Lfk1/a;)V", "Lek1/d$a;", "j9", "(Lek1/c;)Lek1/d$a;", "b", "Lfk1/a;", "c", "Lek1/c;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lek1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fk1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ek1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f51787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f51788b;

        /* JADX INFO: renamed from: ek1.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1220a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f51789a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f51790b;

            /* JADX INFO: renamed from: ek1.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1221a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f51791d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f51792e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f51793f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f51795h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f51796j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f51797k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f51798l;

                public C1221a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f51791d = obj;
                    this.f51792e |= PKIFailureInfo.systemUnavail;
                    return C1220a.this.F(null, this);
                }
            }

            public C1220a(mu.h hVar, k kVar) {
                this.f51789a = hVar;
                this.f51790b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1221a c1221a;
                if (eVar instanceof C1221a) {
                    c1221a = (C1221a) eVar;
                    int i15 = c1221a.f51792e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1221a.f51792e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1221a = new C1221a(eVar);
                    }
                } else {
                    c1221a = new C1221a(eVar);
                }
                Object obj2 = c1221a.f51791d;
                Object objE = uq.b.e();
                int i16 = c1221a.f51792e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f51789a;
                    d.Data dataJ9 = this.f51790b.j9((c) obj);
                    c1221a.f51793f = vq.j.a(obj);
                    c1221a.f51795h = vq.j.a(c1221a);
                    c1221a.f51796j = vq.j.a(obj);
                    c1221a.f51797k = vq.j.a(hVar);
                    c1221a.f51798l = 0;
                    c1221a.f51792e = 1;
                    if (hVar.F(dataJ9, c1221a) == objE) {
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
            this.f51787a = gVar;
            this.f51788b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f51787a.a(new C1220a(hVar, this.f51788b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lek1/a;", "<unused var>", "Lek1/c;", "Loq/i0;", "<anonymous>", "(Lek1/a;Lek1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<ek1.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51799e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f51799e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ek1.b> bVarY1 = k.this.Y1();
                ek1.b.a aVar = ek1.b.a.f51767a;
                this.f51799e = 1;
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
        public final Object w(ek1.a aVar, c cVar, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    public k(yy.a aVar, fk1.a aVar2) {
        this.mapper = aVar2;
        c cVar = c.f51768a;
        this.initialState = cVar;
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: ek1.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.l9(this.f51780a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(c cVar) {
        return this.mapper.b(new fk1.a.Params(cVar, b9(ek1.a.f51766a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final k kVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: ek1.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f51781a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(ek1.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ek1.b> Y1() {
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
