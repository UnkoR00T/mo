package d83;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ld83/l;", "Ll00/g;", "Ld83/c;", "", "Ld83/d;", "Lyy/a;", "stateMachineFactory", "Le83/a;", "juniorQrCodeInfoMapper", "<init>", "(Lyy/a;Le83/a;)V", "state", "Ld83/d$a;", "j9", "(Ld83/c;)Ld83/d$a;", "b", "Le83/a;", "c", "Ld83/c;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ld83/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e83.a juniorQrCodeInfoMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d83.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f40365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f40366b;

        /* JADX INFO: renamed from: d83.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0882a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f40367a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f40368b;

            /* JADX INFO: renamed from: d83.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0883a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f40369d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f40370e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f40371f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f40373h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f40374j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f40375k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f40376l;

                public C0883a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f40369d = obj;
                    this.f40370e |= PKIFailureInfo.systemUnavail;
                    return C0882a.this.F(null, this);
                }
            }

            public C0882a(mu.h hVar, l lVar) {
                this.f40367a = hVar;
                this.f40368b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0883a c0883a;
                if (eVar instanceof C0883a) {
                    c0883a = (C0883a) eVar;
                    int i15 = c0883a.f40370e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0883a.f40370e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0883a = new C0883a(eVar);
                    }
                } else {
                    c0883a = new C0883a(eVar);
                }
                Object obj2 = c0883a.f40369d;
                Object objE = uq.b.e();
                int i16 = c0883a.f40370e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f40367a;
                    d.Data dataJ9 = this.f40368b.j9((c) obj);
                    c0883a.f40371f = vq.j.a(obj);
                    c0883a.f40373h = vq.j.a(c0883a);
                    c0883a.f40374j = vq.j.a(obj);
                    c0883a.f40375k = vq.j.a(hVar);
                    c0883a.f40376l = 0;
                    c0883a.f40370e = 1;
                    if (hVar.F(dataJ9, c0883a) == objE) {
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
            this.f40365a = gVar;
            this.f40366b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f40365a.a(new C0882a(hVar, this.f40366b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld83/a;", "<unused var>", "Ld83/c;", "Loq/i0;", "<anonymous>", "(Ld83/a;Ld83/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<d83.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40377e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40377e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<d83.b> bVarY1 = l.this.Y1();
                d83.b.a aVar = d83.b.a.f40344a;
                this.f40377e = 1;
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
        public final Object w(d83.a aVar, c cVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, e83.a aVar2) {
        this.juniorQrCodeInfoMapper = aVar2;
        c cVar = c.f40345a;
        this.initialState = cVar;
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: d83.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f40358a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(c state) {
        return this.juniorQrCodeInfoMapper.b(new e83.a.Params(state, b9(d83.a.f40343a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: d83.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f40359a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(d83.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d83.b> Y1() {
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
