package e12;

import er.p;
import er.q;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00128\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Le12/k;", "Ll00/g;", "Le12/b;", "Le12/a;", "Le12/c;", "", "Lyy/a;", "stateMachineFactory", "Lf12/a;", "agreementDetailsScreenMapper", "", "fullDescription", "<init>", "(Lyy/a;Lf12/a;Ljava/lang/String;)V", "b", "Lf12/a;", "c", "Ljava/lang/String;", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Le12/a$b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Le12/c$a;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<e12.b, e12.a> implements e12.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f12.a agreementDetailsScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String fullDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<e12.b, e12.a> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e12.a.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e12.c.a> state = a9(new a(e9().getState(), this), e12.c.a.C1064a.f46824a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e12.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f46842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f46843b;

        /* JADX INFO: renamed from: e12.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1065a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f46844a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f46845b;

            /* JADX INFO: renamed from: e12.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1066a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f46846d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f46847e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f46848f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f46850h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f46851j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f46852k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f46853l;

                public C1066a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f46846d = obj;
                    this.f46847e |= PKIFailureInfo.systemUnavail;
                    return C1065a.this.F(null, this);
                }
            }

            public C1065a(mu.h hVar, k kVar) {
                this.f46844a = hVar;
                this.f46845b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1066a c1066a;
                if (eVar instanceof C1066a) {
                    c1066a = (C1066a) eVar;
                    int i15 = c1066a.f46847e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1066a.f46847e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1066a = new C1066a(eVar);
                    }
                } else {
                    c1066a = new C1066a(eVar);
                }
                Object obj2 = c1066a.f46846d;
                Object objE = uq.b.e();
                int i16 = c1066a.f46847e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f46844a;
                    e12.c.a aVarB = this.f46845b.agreementDetailsScreenMapper.b(new f12.a.Params((e12.b) obj, this.f46845b.b9(e12.a.C1061a.f46820a)));
                    c1066a.f46848f = vq.j.a(obj);
                    c1066a.f46850h = vq.j.a(c1066a);
                    c1066a.f46851j = vq.j.a(obj);
                    c1066a.f46852k = vq.j.a(hVar);
                    c1066a.f46853l = 0;
                    c1066a.f46847e = 1;
                    if (hVar.F(aVarB, c1066a) == objE) {
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
            this.f46842a = gVar;
            this.f46843b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e12.c.a> hVar, tq.e eVar) {
            Object objA = this.f46842a.a(new C1065a(hVar, this.f46843b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le12/a$a;", "<unused var>", "Le12/b;", "Loq/i0;", "<anonymous>", "(Le12/a$a;Le12/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<e12.a.C1061a, e12.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46854e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46854e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<e12.a.b> bVarY1 = k.this.Y1();
                e12.a.b.C1062a c1062a = e12.a.b.C1062a.f46821a;
                this.f46854e = 1;
                if (bVarY1.F(c1062a, this) == objE) {
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
        public final Object w(e12.a.C1061a c1061a, e12.b bVar, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Le12/b$a;", "state", "Lk10/l;", "Le12/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<c0<e12.b.a>, tq.e<? super k10.l<? extends e12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f46857f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e12.b.Initialized O(k kVar, e12.b.a aVar) {
            return new e12.b.Initialized(kVar.fullDescription);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f46857f;
            uq.b.e();
            if (this.f46856e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final k kVar = k.this;
            return c0Var.d(new er.l() { // from class: e12.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.c.O(kVar, (b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<e12.b.a> c0Var, tq.e<? super k10.l<? extends e12.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f46857f = obj;
            return cVar;
        }
    }

    public k(yy.a aVar, f12.a aVar2, String str) {
        this.agreementDetailsScreenMapper = aVar2;
        this.fullDescription = str;
        this.stateMachine = aVar.a(e12.b.a.f46822a, new er.l() { // from class: e12.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.n9(this.f46836a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final k kVar, v vVar) {
        vVar.c(q0.c(e12.b.class), new er.l() { // from class: e12.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.o9(this.f46834a, (z) obj);
            }
        });
        vVar.c(q0.c(e12.b.a.class), new er.l() { // from class: e12.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f46835a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(e12.a.C1061a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(k kVar, z zVar) {
        zVar.A(kVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<e12.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e12.b, e12.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e12.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(String str) {
        super.P5(str);
    }
}
