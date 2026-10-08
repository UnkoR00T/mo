package ij3;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lij3/k;", "Ll00/g;", "Lij3/c;", "", "Lij3/d;", "Lyy/a;", "stateMachineFactory", "Ljj3/a;", "vehicleHistoryAbroadInfoAboutDataMapper", "<init>", "(Lyy/a;Ljj3/a;)V", "state", "Lij3/d$a;", "j9", "(Lij3/c;)Lij3/d$a;", "b", "Ljj3/a;", "c", "Lij3/c;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lij3/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jj3.a vehicleHistoryAbroadInfoAboutDataMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ij3.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f93162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f93163b;

        /* JADX INFO: renamed from: ij3.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2196a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f93164a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f93165b;

            /* JADX INFO: renamed from: ij3.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2197a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f93166d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f93167e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f93168f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f93170h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f93171j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f93172k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f93173l;

                public C2197a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f93166d = obj;
                    this.f93167e |= PKIFailureInfo.systemUnavail;
                    return C2196a.this.F(null, this);
                }
            }

            public C2196a(mu.h hVar, k kVar) {
                this.f93164a = hVar;
                this.f93165b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2197a c2197a;
                if (eVar instanceof C2197a) {
                    c2197a = (C2197a) eVar;
                    int i15 = c2197a.f93167e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2197a.f93167e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2197a = new C2197a(eVar);
                    }
                } else {
                    c2197a = new C2197a(eVar);
                }
                Object obj2 = c2197a.f93166d;
                Object objE = uq.b.e();
                int i16 = c2197a.f93167e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f93164a;
                    d.Data dataJ9 = this.f93165b.j9((c) obj);
                    c2197a.f93168f = vq.j.a(obj);
                    c2197a.f93170h = vq.j.a(c2197a);
                    c2197a.f93171j = vq.j.a(obj);
                    c2197a.f93172k = vq.j.a(hVar);
                    c2197a.f93173l = 0;
                    c2197a.f93167e = 1;
                    if (hVar.F(dataJ9, c2197a) == objE) {
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
            this.f93162a = gVar;
            this.f93163b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f93162a.a(new C2196a(hVar, this.f93163b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lij3/a;", "<unused var>", "Lij3/c;", "Loq/i0;", "<anonymous>", "(Lij3/a;Lij3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<ij3.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93174e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93174e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ij3.b> bVarY1 = k.this.Y1();
                ij3.b.a aVar = ij3.b.a.f93142a;
                this.f93174e = 1;
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
        public final Object w(ij3.a aVar, c cVar, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    public k(yy.a aVar, jj3.a aVar2) {
        this.vehicleHistoryAbroadInfoAboutDataMapper = aVar2;
        c cVar = c.f93143a;
        this.initialState = cVar;
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: ij3.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.l9(this.f93155a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(c state) {
        return this.vehicleHistoryAbroadInfoAboutDataMapper.b(new jj3.a.Params(state, b9(ij3.a.f93141a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final k kVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: ij3.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f93156a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(ij3.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ij3.b> Y1() {
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
