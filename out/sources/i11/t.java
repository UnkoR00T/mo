package i11;

import fr.q0;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vi0.MyCase;
import vi0.MyCasesPage;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001?B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Li11/t;", "Ll00/g;", "Li11/b;", "Li11/a;", "Li11/c;", "", "Lac4/a;", "callActionWithLoaderUseCase", "Ldj0/b;", "getCasesUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lk11/c;", "caseListScreenMapper", "Lyy/a;", "stateMachineFactory", "<init>", "(Lac4/a;Ldj0/b;Lib4/c;Lk11/c;Lyy/a;)V", "state", "Li11/c$a;", "w9", "(Li11/b;)Li11/c$a;", "Ldx/b;", "domainError", "Loq/i0;", "s9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "", "pageId", "v9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lk10/c0;", "Li11/b$b;", "Lk10/l;", "u9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "b", "Lac4/a;", "c", "Ldj0/b;", "d", "Lib4/c;", "e", "Lk11/c;", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Li11/a$f;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "j", "a", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<i11.b, a> implements i11.c, zx.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f88245k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dj0.b getCasesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k11.c caseListScreenMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<i11.b, a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<i11.c.a> state = a9(new d(e9().getState(), this), i11.c.a.b.f88211a);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Li11/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super k10.l<? extends i11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f88253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f88254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f88255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f88256h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f88257j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f88258k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c0<i11.b.C2076b> f88260m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c0<i11.b.C2076b> c0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f88260m = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i11.b V(MyCasesPage myCasesPage, i11.b.C2076b c2076b) {
            return !myCasesPage.b().isEmpty() ? new i11.b.Initialized(myCasesPage.b(), false, true, myCasesPage.getNextPageId(), null, false) : i11.b.a.f88199a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0<i11.b.C2076b> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f88258k;
            if (i15 == 0) {
                oq.u.b(obj);
                dj0.b bVar = t.this.getCasesUseCase;
                dj0.b.Params params = new dj0.b.Params(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
                this.f88258k = 1;
                obj = bVar.c(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (c0) this.f88254f;
                oq.u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            t tVar = t.this;
            c0<i11.b.C2076b> c0Var2 = this.f88260m;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final MyCasesPage myCasesPage = (MyCasesPage) ((dx.i.Right) iVar).b();
                return c0Var2.d(new er.l() { // from class: i11.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.b.V(myCasesPage, (b.C2076b) obj2);
                    }
                });
            }
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            this.f88253e = vq.j.a(iVar);
            this.f88254f = c0Var2;
            this.f88255g = vq.j.a(bVar2);
            this.f88256h = 0;
            this.f88257j = 0;
            this.f88258k = 2;
            if (tVar.s9(bVar2, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return t.this.new b(this.f88260m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<? extends i11.b>> eVar) {
            return ((b) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f88261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f88262e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f88264g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f88262e = obj;
            this.f88264g |= PKIFailureInfo.systemUnavail;
            return t.this.v9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<i11.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f88265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f88266b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f88267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f88268b;

            /* JADX INFO: renamed from: i11.t$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2079a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f88269d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f88270e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f88271f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f88273h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f88274j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f88275k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f88276l;

                public C2079a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f88269d = obj;
                    this.f88270e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f88267a = hVar;
                this.f88268b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2079a c2079a;
                if (eVar instanceof C2079a) {
                    c2079a = (C2079a) eVar;
                    int i15 = c2079a.f88270e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2079a.f88270e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2079a = new C2079a(eVar);
                    }
                } else {
                    c2079a = new C2079a(eVar);
                }
                Object obj2 = c2079a.f88269d;
                Object objE = uq.b.e();
                int i16 = c2079a.f88270e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f88267a;
                    i11.c.a aVarW9 = this.f88268b.w9((i11.b) obj);
                    c2079a.f88271f = vq.j.a(obj);
                    c2079a.f88273h = vq.j.a(c2079a);
                    c2079a.f88274j = vq.j.a(obj);
                    c2079a.f88275k = vq.j.a(hVar);
                    c2079a.f88276l = 0;
                    c2079a.f88270e = 1;
                    if (hVar.F(aVarW9, c2079a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public d(mu.g gVar, t tVar) {
            this.f88265a = gVar;
            this.f88266b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i11.c.a> hVar, tq.e eVar) {
            Object objA = this.f88265a.a(new a(hVar, this.f88266b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li11/a$a;", "<unused var>", "", "Loq/i0;", "<anonymous>", "(Li11/a$a;Ljava/lang/Object;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.C2074a, Object, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88277e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f88277e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.f> bVarY1 = t.this.Y1();
                a.f.C2075a c2075a = a.f.C2075a.f88193a;
                this.f88277e = 1;
                if (bVarY1.F(c2075a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C2074a c2074a, Object obj, tq.e<? super i0> eVar) {
            return t.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li11/b$b;", "it", "Loq/i0;", "<anonymous>", "(Li11/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<i11.b.C2076b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88279e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f88279e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(a.d.f88191a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i11.b.C2076b c2076b, tq.e<? super i0> eVar) {
            return ((f) v(c2076b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Li11/a$d;", "<unused var>", "Lk10/c0;", "Li11/b$b;", "state", "Lk10/l;", "Li11/b;", "<anonymous>", "(Li11/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.d, c0<i11.b.C2076b>, tq.e<? super k10.l<? extends i11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88282f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f88282f;
            Object objE = uq.b.e();
            int i15 = this.f88281e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            this.f88282f = vq.j.a(c0Var);
            this.f88281e = 1;
            Object objU9 = tVar.u9(c0Var, this);
            return objU9 == objE ? objE : objU9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, c0<i11.b.C2076b> c0Var, tq.e<? super k10.l<? extends i11.b>> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f88282f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li11/a$d;", "<unused var>", "Li11/b$c;", "state", "Loq/i0;", "<anonymous>", "(Li11/a$d;Li11/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.d, i11.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f88284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f88285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f88286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f88287h;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i11.b.Initialized initialized = (i11.b.Initialized) this.f88287h;
            Object objE = uq.b.e();
            int i15 = this.f88286g;
            if (i15 == 0) {
                oq.u.b(obj);
                String nextPageId = initialized.getNextPageId();
                if (nextPageId != null) {
                    t tVar = t.this;
                    this.f88287h = vq.j.a(initialized);
                    this.f88284e = vq.j.a(nextPageId);
                    this.f88285f = 0;
                    this.f88286g = 1;
                    if (tVar.v9(nextPageId, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, i11.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = t.this.new h(eVar);
            hVar.f88287h = initialized;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Li11/a$c;", "<unused var>", "Lk10/c0;", "Li11/b$c;", "state", "Lk10/l;", "Li11/b;", "<anonymous>", "(Li11/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.c, c0<i11.b.Initialized>, tq.e<? super k10.l<? extends i11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88290f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i11.b.Initialized O(i11.b.Initialized initialized) {
            return i11.b.Initialized.b(initialized, null, false, false, null, null, false, 59, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f88290f;
            uq.b.e();
            if (this.f88289e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i11.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.i.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.c cVar, c0<i11.b.Initialized> c0Var, tq.e<? super k10.l<? extends i11.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f88290f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li11/a$b;", "action", "Li11/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li11/a$b;Li11/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.GoToCaseItem, i11.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88292f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.GoToCaseItem goToCaseItem = (a.GoToCaseItem) this.f88292f;
            Object objE = uq.b.e();
            int i15 = this.f88291e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.f> bVarY1 = t.this.Y1();
                a.f.GoToCaseItem goToCaseItem2 = new a.f.GoToCaseItem(goToCaseItem.getCase());
                this.f88292f = vq.j.a(goToCaseItem);
                this.f88291e = 1;
                if (bVarY1.F(goToCaseItem2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.GoToCaseItem goToCaseItem, i11.b.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = t.this.new j(eVar);
            jVar.f88292f = goToCaseItem;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Li11/a$e;", "<destruct>", "Lk10/c0;", "Li11/b$c;", "state", "Lk10/l;", "Li11/b;", "<anonymous>", "(Li11/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a.LoadNextPage, c0<i11.b.Initialized>, tq.e<? super k10.l<? extends i11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88295f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f88296g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i11.b.Initialized O(MyCasesPage myCasesPage, List list, i11.b.Initialized initialized) {
            return i11.b.Initialized.b(initialized, list, myCasesPage.getLast(), false, myCasesPage.getNextPageId(), null, false, 20, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.LoadNextPage loadNextPage = (a.LoadNextPage) this.f88295f;
            c0 c0Var = (c0) this.f88296g;
            uq.b.e();
            if (this.f88294e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final MyCasesPage data = loadNextPage.getData();
            final List listL0 = pq.v.L0(((i11.b.Initialized) c0Var.a()).d(), data.b());
            return c0Var.b(new er.l() { // from class: i11.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.k.O(data, listL0, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.LoadNextPage loadNextPage, c0<i11.b.Initialized> c0Var, tq.e<? super k10.l<? extends i11.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f88295f = loadNextPage;
            kVar.f88296g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Li11/a$g;", "action", "Lk10/c0;", "Li11/b$c;", "state", "Lk10/l;", "Li11/b;", "<anonymous>", "(Li11/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.ShowPageError, c0<i11.b.Initialized>, tq.e<? super k10.l<? extends i11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f88299g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i11.b.Initialized O(a.ShowPageError showPageError, i11.b.Initialized initialized) {
            return i11.b.Initialized.b(initialized, null, true, false, null, showPageError.getDomainError(), false, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.ShowPageError showPageError = (a.ShowPageError) this.f88298f;
            c0 c0Var = (c0) this.f88299g;
            uq.b.e();
            if (this.f88297e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i11.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.l.O(showPageError, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ShowPageError showPageError, c0<i11.b.Initialized> c0Var, tq.e<? super k10.l<? extends i11.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f88298f = showPageError;
            lVar.f88299g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Li11/a$h;", "<unused var>", "Lk10/c0;", "Li11/b$c;", "state", "Lk10/l;", "Li11/b;", "<anonymous>", "(Li11/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.h, c0<i11.b.Initialized>, tq.e<? super k10.l<? extends i11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88301f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i11.b.Initialized O(i11.b.Initialized initialized) {
            return i11.b.Initialized.b(initialized, null, false, false, null, null, true, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f88301f;
            uq.b.e();
            if (this.f88300e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i11.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.m.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, c0<i11.b.Initialized> c0Var, tq.e<? super k10.l<? extends i11.b>> eVar) {
            m mVar = new m(eVar);
            mVar.f88301f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public t(ac4.a aVar, dj0.b bVar, ib4.c cVar, k11.c cVar2, yy.a aVar2) {
        this.callActionWithLoaderUseCase = aVar;
        this.getCasesUseCase = bVar;
        this.genericDomainErrorMapper = cVar;
        this.caseListScreenMapper = cVar2;
        this.stateMachine = aVar2.a(i11.b.C2076b.f88200a, new er.l() { // from class: i11.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f88238a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(t tVar, k10.z zVar) {
        e eVar = tVar.new e(null);
        zVar.x(q0.c(a.C2074a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, k10.z zVar) {
        zVar.C(tVar.new f(null));
        g gVar = tVar.new g(null);
        zVar.v(q0.c(a.d.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t tVar, k10.z zVar) {
        h hVar = tVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.d.class), oVar, hVar);
        zVar.v(q0.c(a.c.class), oVar, new i(null));
        zVar.x(q0.c(a.GoToCaseItem.class), oVar, tVar.new j(null));
        zVar.v(q0.c(a.LoadNextPage.class), oVar, new k(null));
        zVar.v(q0.c(a.ShowPageError.class), oVar, new l(null));
        zVar.v(q0.c(a.h.class), oVar, new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new a.f.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: i11.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f88243a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(t tVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            tVar.d9(a.C2074a.f88188a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            tVar.d9(a.d.f88191a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u9(c0<i11.b.C2076b> c0Var, tq.e<? super k10.l<? extends i11.b>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v9(String str, tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f88264g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f88264g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f88262e;
        Object objE = uq.b.e();
        int i16 = cVar.f88264g;
        if (i16 == 0) {
            oq.u.b(objC);
            d9(a.h.f88197a);
            dj0.b bVar = this.getCasesUseCase;
            dj0.b.Params params = new dj0.b.Params(str);
            cVar.f88261d = vq.j.a(str);
            cVar.f88264g = 1;
            objC = bVar.c(params, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            d9(new a.ShowPageError((dx.b) ((dx.i.Left) iVar).b()));
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            d9(new a.LoadNextPage((MyCasesPage) ((dx.i.Right) iVar).b()));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i11.c.a w9(i11.b state) {
        return this.caseListScreenMapper.b(new k11.c.Params(state, b9(a.C2074a.f88188a), b9(a.c.f88190a), b9(a.d.f88191a), new er.l() { // from class: i11.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f88239a, (MyCase) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, MyCase myCase) {
        tVar.d9(new a.GoToCaseItem(myCase));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(i11.b.class), new er.l() { // from class: i11.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f88240a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(i11.b.C2076b.class), new er.l() { // from class: i11.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f88241a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(i11.b.Initialized.class), new er.l() { // from class: i11.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(this.f88242a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<i11.b, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i11.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
