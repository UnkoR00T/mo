package fz0;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lfz0/j;", "Ll00/g;", "Lfz0/c;", "", "Lfz0/d;", "Lyy/a;", "stateMachineFactory", "Lgz0/a;", "savePointSuccessScreenMapper", "<init>", "(Lyy/a;Lgz0/a;)V", "state", "Lfz0/d$a;", "j9", "(Lfz0/c;)Lfz0/d$a;", "b", "Lgz0/a;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lfz0/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gz0.a savePointSuccessScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fz0.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f68920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f68921b;

        /* JADX INFO: renamed from: fz0.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1546a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f68922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f68923b;

            /* JADX INFO: renamed from: fz0.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1547a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f68924d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f68925e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f68926f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f68928h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f68929j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f68930k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f68931l;

                public C1547a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f68924d = obj;
                    this.f68925e |= PKIFailureInfo.systemUnavail;
                    return C1546a.this.F(null, this);
                }
            }

            public C1546a(mu.h hVar, j jVar) {
                this.f68922a = hVar;
                this.f68923b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1547a c1547a;
                if (eVar instanceof C1547a) {
                    c1547a = (C1547a) eVar;
                    int i15 = c1547a.f68925e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1547a.f68925e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1547a = new C1547a(eVar);
                    }
                } else {
                    c1547a = new C1547a(eVar);
                }
                Object obj2 = c1547a.f68924d;
                Object objE = uq.b.e();
                int i16 = c1547a.f68925e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f68922a;
                    d.Data dataJ9 = this.f68923b.j9((c) obj);
                    c1547a.f68926f = vq.j.a(obj);
                    c1547a.f68928h = vq.j.a(c1547a);
                    c1547a.f68929j = vq.j.a(obj);
                    c1547a.f68930k = vq.j.a(hVar);
                    c1547a.f68931l = 0;
                    c1547a.f68925e = 1;
                    if (hVar.F(dataJ9, c1547a) == objE) {
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
            this.f68920a = gVar;
            this.f68921b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f68920a.a(new C1546a(hVar, this.f68921b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfz0/a;", "<unused var>", "Lfz0/c;", "Loq/i0;", "<anonymous>", "(Lfz0/a;Lfz0/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<fz0.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68932e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f68932e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<fz0.b> bVarY1 = j.this.Y1();
                fz0.b.a aVar = fz0.b.a.f68908a;
                this.f68932e = 1;
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
        public final Object w(fz0.a aVar, c cVar, tq.e<? super i0> eVar) {
            return j.this.new b(eVar).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, gz0.a aVar2) {
        this.savePointSuccessScreenMapper = aVar2;
        c cVar = c.f68909a;
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: fz0.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.l9(this.f68914a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(cVar));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(c state) {
        return this.savePointSuccessScreenMapper.b(new gz0.a.Params(state, b9(fz0.a.f68907a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final j jVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: fz0.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.m9(this.f68915a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        zVar.x(q0.c(fz0.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<fz0.b> Y1() {
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
