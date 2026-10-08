package yp2;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lyp2/p;", "Ll00/g;", "Lyp2/d;", "Lyp2/c;", "Lyp2/e;", "", "Lyy/a;", "stateMachineFactory", "Lml0/u;", "isAdultUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lzp2/a;", "mapper", "Lib4/c;", "genericErrorMapper", "<init>", "(Lyy/a;Lml0/u;Lac4/a;Lzp2/a;Lib4/c;)V", "state", "Lyp2/e$a;", "p9", "(Lyp2/d;)Lyp2/e$a;", "b", "Lml0/u;", "c", "Lac4/a;", "d", "Lzp2/a;", "e", "Lib4/c;", "Lyp2/d$a;", "f", "Lyp2/d$a;", "initialState", "Lxw/b;", "Lyp2/c$d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<yp2.d, yp2.c> implements yp2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ml0.u isAdultUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zp2.a mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yp2.d.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yp2.c.d> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yp2.d, yp2.c> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<yp2.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<yp2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f228438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f228439b;

        /* JADX INFO: renamed from: yp2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6141a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f228440a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f228441b;

            /* JADX INFO: renamed from: yp2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6142a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f228442d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f228443e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f228444f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f228446h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f228447j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f228448k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f228449l;

                public C6142a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f228442d = obj;
                    this.f228443e |= PKIFailureInfo.systemUnavail;
                    return C6141a.this.F(null, this);
                }
            }

            public C6141a(mu.h hVar, p pVar) {
                this.f228440a = hVar;
                this.f228441b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6142a c6142a;
                if (eVar instanceof C6142a) {
                    c6142a = (C6142a) eVar;
                    int i15 = c6142a.f228443e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6142a.f228443e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6142a = new C6142a(eVar);
                    }
                } else {
                    c6142a = new C6142a(eVar);
                }
                Object obj2 = c6142a.f228442d;
                Object objE = uq.b.e();
                int i16 = c6142a.f228443e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f228440a;
                    yp2.e.a aVarP9 = this.f228441b.p9((yp2.d) obj);
                    c6142a.f228444f = vq.j.a(obj);
                    c6142a.f228446h = vq.j.a(c6142a);
                    c6142a.f228447j = vq.j.a(obj);
                    c6142a.f228448k = vq.j.a(hVar);
                    c6142a.f228449l = 0;
                    c6142a.f228443e = 1;
                    if (hVar.F(aVarP9, c6142a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f228438a = gVar;
            this.f228439b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yp2.e.a> hVar, tq.e eVar) {
            Object objA = this.f228438a.a(new C6141a(hVar, this.f228439b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyp2/c$b;", "<unused var>", "Lyp2/d;", "Loq/i0;", "<anonymous>", "(Lyp2/c$b;Lyp2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<yp2.c.b, yp2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f228450e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f228450e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yp2.c.d> bVarY1 = p.this.Y1();
                yp2.c.d.a aVar = yp2.c.d.a.f228399a;
                this.f228450e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(yp2.c.b bVar, yp2.d dVar, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyp2/d$a;", "it", "Loq/i0;", "<anonymous>", "(Lyp2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<yp2.d.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f228452e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f228452e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(yp2.c.a.f228396a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(yp2.d.a aVar, tq.e<? super i0> eVar) {
            return ((c) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyp2/c$a;", "<unused var>", "Lk10/c0;", "Lyp2/d$a;", "state", "Lk10/l;", "Lyp2/d;", "<anonymous>", "(Lyp2/c$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yp2.c.a, c0<yp2.d.a>, tq.e<? super k10.l<? extends yp2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f228454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f228455f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyp2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yp2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f228457e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f228458f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<yp2.d.a> f228459g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<yp2.d.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f228458f = pVar;
                this.f228459g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final yp2.d.b X(yp2.d.a aVar) {
                return yp2.d.b.f228404a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final yp2.d.c Y(yp2.d.a aVar) {
                return yp2.d.c.f228405a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f228457e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.u uVar = this.f228458f.isAdultUC;
                    ml0.u.Params params = new ml0.u.Params(null, 1, null);
                    this.f228457e = 1;
                    obj = uVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                p pVar = this.f228458f;
                c0<yp2.d.a> c0Var = this.f228459g;
                if (iVar instanceof dx.i.Left) {
                    pVar.d9(new yp2.c.HandleGenericError((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (iVar instanceof dx.i.Right) {
                    return ((Boolean) ((dx.i.Right) iVar).b()).booleanValue() ? c0Var.d(new er.l() { // from class: yp2.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.d.a.X((d.a) obj2);
                        }
                    }) : c0Var.d(new er.l() { // from class: yp2.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.d.a.Y((d.a) obj2);
                        }
                    });
                }
                throw new oq.p();
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f228458f, this.f228459g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends yp2.d>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f228455f;
            Object objE = uq.b.e();
            int i15 = this.f228454e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p.this, c0Var, null);
            this.f228455f = vq.j.a(c0Var);
            this.f228454e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yp2.c.a aVar, c0<yp2.d.a> c0Var, tq.e<? super k10.l<? extends yp2.d>> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f228455f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyp2/c$c;", "action", "Lyp2/d$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyp2/c$c;Lyp2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yp2.c.HandleGenericError, yp2.d.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f228460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f228461f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    pVar.d9(yp2.c.a.f228396a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                        throw new oq.p();
                    }
                    pVar.d9(yp2.c.b.f228397a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yp2.c.HandleGenericError handleGenericError = (yp2.c.HandleGenericError) this.f228461f;
            Object objE = uq.b.e();
            int i15 = this.f228460e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yp2.c.d> bVarY1 = p.this.Y1();
                ib4.c cVar = p.this.genericErrorMapper;
                dx.b domainError = handleGenericError.getDomainError();
                final p pVar = p.this;
                yp2.c.d.HandleGenericError handleGenericError2 = new yp2.c.d.HandleGenericError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: yp2.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.e.O(pVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f228461f = vq.j.a(handleGenericError);
                this.f228460e = 1;
                if (bVarY1.F(handleGenericError2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yp2.c.HandleGenericError handleGenericError, yp2.d.a aVar, tq.e<? super i0> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f228461f = handleGenericError;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyp2/c$e;", "<unused var>", "Lyp2/d$b;", "Loq/i0;", "<anonymous>", "(Lyp2/c$e;Lyp2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yp2.c.e, yp2.d.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f228463e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f228463e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yp2.c.d> bVarY1 = p.this.Y1();
                yp2.c.d.C6139c c6139c = yp2.c.d.C6139c.f228401a;
                this.f228463e = 1;
                if (bVarY1.F(c6139c, this) == objE) {
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
        public final Object w(yp2.c.e eVar, yp2.d.b bVar, tq.e<? super i0> eVar2) {
            return p.this.new f(eVar2).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ml0.u uVar, ac4.a aVar2, zp2.a aVar3, ib4.c cVar) {
        this.isAdultUC = uVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.mapper = aVar3;
        this.genericErrorMapper = cVar;
        yp2.d.a aVar4 = yp2.d.a.f228403a;
        this.initialState = aVar4;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: yp2.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f228426a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yp2.e.a p9(yp2.d state) {
        return this.mapper.b(new zp2.a.Params(state, b9(yp2.c.e.f228402a), b9(yp2.c.b.f228397a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(yp2.d.class), new er.l() { // from class: yp2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f228427a, (z) obj);
            }
        });
        vVar.c(q0.c(yp2.d.a.class), new er.l() { // from class: yp2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f228428a, (z) obj);
            }
        });
        vVar.c(q0.c(yp2.d.b.class), new er.l() { // from class: yp2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f228429a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(yp2.c.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, z zVar) {
        zVar.C(pVar.new c(null));
        d dVar = pVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yp2.c.a.class), oVar, dVar);
        zVar.x(q0.c(yp2.c.HandleGenericError.class), oVar, pVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(p pVar, z zVar) {
        f fVar = pVar.new f(null);
        zVar.x(q0.c(yp2.c.e.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<yp2.c.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yp2.d, yp2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yp2.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
