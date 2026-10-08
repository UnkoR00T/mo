package yo1;

import er.q;
import fr.q0;
import iy.c0;
import k10.o;
import k10.t;
import k10.z;
import mu.p0;
import mx.Label;
import o20.p;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lyo1/j;", "Ll00/g;", "Lyo1/b;", "", "Lyo1/c;", "Lyy/a;", "stateMachineFactory", "Lzo1/a;", "mapper", "Lmx/c;", "labelProvider", "Lbv3/b;", "documentCardVMSFactory", "<init>", "(Lyy/a;Lzo1/a;Lmx/c;Lbv3/b;)V", "Lyo1/c$a;", "j9", "(Lyo1/b;)Lyo1/c$a;", "b", "Lzo1/a;", "c", "Lyo1/b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lyo1/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, Object> implements c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zo1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yo1.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f228323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f228324b;

        /* JADX INFO: renamed from: yo1.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6133a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f228325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f228326b;

            /* JADX INFO: renamed from: yo1.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6134a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f228327d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f228328e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f228329f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f228331h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f228332j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f228333k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f228334l;

                public C6134a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f228327d = obj;
                    this.f228328e |= PKIFailureInfo.systemUnavail;
                    return C6133a.this.F(null, this);
                }
            }

            public C6133a(mu.h hVar, j jVar) {
                this.f228325a = hVar;
                this.f228326b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6134a c6134a;
                if (eVar instanceof C6134a) {
                    c6134a = (C6134a) eVar;
                    int i15 = c6134a.f228328e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6134a.f228328e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6134a = new C6134a(eVar);
                    }
                } else {
                    c6134a = new C6134a(eVar);
                }
                Object obj2 = c6134a.f228327d;
                Object objE = uq.b.e();
                int i16 = c6134a.f228328e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f228325a;
                    c.Data dataJ9 = this.f228326b.j9((State) obj);
                    c6134a.f228329f = vq.j.a(obj);
                    c6134a.f228331h = vq.j.a(c6134a);
                    c6134a.f228332j = vq.j.a(obj);
                    c6134a.f228333k = vq.j.a(hVar);
                    c6134a.f228334l = 0;
                    c6134a.f228328e = 1;
                    if (hVar.F(dataJ9, c6134a) == objE) {
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
            this.f228323a = gVar;
            this.f228324b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c.Data> hVar, tq.e eVar) {
            Object objA = this.f228323a.a(new C6133a(hVar, this.f228324b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyo1/a;", "action", "Lyo1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyo1/a;Lyo1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<yo1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f228335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f228336f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yo1.a aVar = (yo1.a) this.f228336f;
            Object objE = uq.b.e();
            int i15 = this.f228335e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<yo1.a> bVarY1 = j.this.Y1();
                this.f228336f = vq.j.a(aVar);
                this.f228335e = 1;
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
        public final Object w(yo1.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = j.this.new b(eVar);
            bVar.f228336f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, zo1.a aVar2, mx.c cVar, bv3.b bVar) {
        this.mapper = aVar2;
        State state = new State(bVar.a(new bv3.c(v.e(new bv3.c.InterfaceC0572c.Flag(bv3.c.a.Poland, Label.INSTANCE.c())), p.x.f140968c.getBackgroundId(), ry.a.b(c0.g("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\n")), new bv3.c.e.Valid(cVar.c(io1.b.f96037d)), null, v.q(new bv3.c.KeyValueItem(mx.b.b("Jan", ""), mx.b.b("Imię", ""), false, 4, null), new bv3.c.KeyValueItem(mx.b.b("Kowalski", ""), mx.b.b("Nazwisko", ""), false, 4, null), new bv3.c.KeyValueItem(mx.b.b("12345678910", ""), mx.b.b("PESEL", ""), false, 4, null)), 16, null)));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: yo1.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.l9(this.f228316a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.Data j9(State state) {
        return this.mapper.b(new zo1.a.Params(state, b9(yo1.a.C6132a.f228306a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final j jVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: yo1.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.m9(this.f228317a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        zVar.x(q0.c(yo1.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<yo1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
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
