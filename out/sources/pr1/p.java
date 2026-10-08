package pr1;

import android.text.Spanned;
import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R&\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0'8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010%\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lpr1/p;", "Ll00/g;", "Lpr1/d;", "", "Lpr1/e;", "Lyy/a;", "stateMachineFactory", "Lpr1/f;", "mapper", "Lu10/d;", "markdownParser", "<init>", "(Lyy/a;Lpr1/f;Lu10/d;)V", "data", "Lpr1/e$a;", "m9", "(Lpr1/d;)Lpr1/e$a;", "b", "Lpr1/f;", "c", "Lu10/d;", "d", "Lpr1/d;", "initialState", "Lxw/b;", "Lpr1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<Data, Object> implements e, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u10.d markdownParser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Data initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pr1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<Data, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f162154b;

        /* JADX INFO: renamed from: pr1.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3994a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162155a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f162156b;

            /* JADX INFO: renamed from: pr1.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3995a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162157d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162158e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162159f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f162161h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162162j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162163k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f162164l;

                public C3995a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162157d = obj;
                    this.f162158e |= PKIFailureInfo.systemUnavail;
                    return C3994a.this.F(null, this);
                }
            }

            public C3994a(mu.h hVar, p pVar) {
                this.f162155a = hVar;
                this.f162156b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3995a c3995a;
                if (eVar instanceof C3995a) {
                    c3995a = (C3995a) eVar;
                    int i15 = c3995a.f162158e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3995a.f162158e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3995a = new C3995a(eVar);
                    }
                } else {
                    c3995a = new C3995a(eVar);
                }
                Object obj2 = c3995a.f162157d;
                Object objE = uq.b.e();
                int i16 = c3995a.f162158e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f162155a;
                    e.Data dataM9 = this.f162156b.m9((Data) obj);
                    c3995a.f162159f = vq.j.a(obj);
                    c3995a.f162161h = vq.j.a(c3995a);
                    c3995a.f162162j = vq.j.a(obj);
                    c3995a.f162163k = vq.j.a(hVar);
                    c3995a.f162164l = 0;
                    c3995a.f162158e = 1;
                    if (hVar.F(dataM9, c3995a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f162153a = gVar;
            this.f162154b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f162153a.a(new C3994a(hVar, this.f162154b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpr1/a;", "<unused var>", "Lpr1/d;", "Loq/i0;", "<anonymous>", "(Lpr1/a;Lpr1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<pr1.a, Data, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162165e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162165e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<pr1.b> bVarY1 = p.this.Y1();
                pr1.b.a aVar = pr1.b.a.f162125a;
                this.f162165e = 1;
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
        public final Object w(pr1.a aVar, Data data, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpr1/c;", "action", "Lk10/c0;", "Lpr1/d;", "data", "Lk10/l;", "<anonymous>", "(Lpr1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<pr1.c, c0<Data>, tq.e<? super k10.l<? extends Data>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162169g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Data O(pr1.c cVar, Spanned spanned, Data data) {
            return data.a(cVar.getText(), spanned);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final pr1.c cVar = (pr1.c) this.f162168f;
            c0 c0Var = (c0) this.f162169g;
            uq.b.e();
            if (this.f162167e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final Spanned spanned = p.this.markdownParser.parse(cVar.getText());
            return c0Var.b(new er.l() { // from class: pr1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(cVar, spanned, (Data) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(pr1.c cVar, c0<Data> c0Var, tq.e<? super k10.l<Data>> eVar) {
            c cVar2 = p.this.new c(eVar);
            cVar2.f162168f = cVar;
            cVar2.f162169g = c0Var;
            return cVar2.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, f fVar, u10.d dVar) {
        this.mapper = fVar;
        this.markdownParser = dVar;
        Data data = new Data(null, null, 3, null);
        this.initialState = data;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(data, new er.l() { // from class: pr1.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f162143a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(data));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data m9(Data data) {
        return this.mapper.b(new f.Params(data, b9(pr1.a.f162124a), new er.l() { // from class: pr1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f162144a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, String str) {
        pVar.d9(new pr1.c(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final p pVar, v vVar) {
        vVar.c(q0.c(Data.class), new er.l() { // from class: pr1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f162145a, (z) obj);
            }
        });
        vVar.c(q0.c(Data.class), new er.l() { // from class: pr1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f162146a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(pr1.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, z zVar) {
        c cVar = pVar.new c(null);
        zVar.v(q0.c(pr1.c.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<pr1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<Data, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
