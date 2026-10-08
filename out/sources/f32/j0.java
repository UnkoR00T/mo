package f32;

import d12.OAuthWebViewData;
import eo0.AddressData;
import eo0.CentralTokens;
import eo0.OwTokens;
import eo0.OwnerAddress;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qp0.JWSSigningParams;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lf32/j0;", "Ll00/g;", "Lf32/d;", "Lf32/c;", "Lf32/r;", "", "Lyy/a;", "stateMachineFactory", "Lrp0/a;", "getJWSSigningParamsUC", "Lp02/k;", "fetchNativeCentralTokenUC", "Lgo0/y;", "beGetOwnerAddressUC", "Lp02/l0;", "saveOwnerAddressUC", "Lgo0/k;", "beFetchNativeOwTokenUC", "Ls02/k;", "saveTokensUseCase", "Ld12/c;", "setupData", "Lg32/a;", "nativeOAuthScreenMapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lyy/a;Lrp0/a;Lp02/k;Lgo0/y;Lp02/l0;Lgo0/k;Ls02/k;Ld12/c;Lg32/a;Lhb4/d;Lib4/c;)V", "state", "Lf32/r$a;", "G9", "(Lf32/d;)Lf32/r$a;", "Ldx/b;", "domainError", "Lhb4/c;", "E9", "(Ldx/b;)Lhb4/c;", "b", "Lrp0/a;", "c", "Lp02/k;", "d", "Lgo0/y;", "e", "Lp02/l0;", "f", "Lgo0/k;", "g", "Ls02/k;", "h", "Ld12/c;", "j", "Lg32/a;", "k", "Lhb4/d;", "l", "Lib4/c;", "m", "Lf32/d;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lf32/c$c;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 extends l00.g<f32.d, f32.c> implements r, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rp0.a getJWSSigningParamsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p02.k fetchNativeCentralTokenUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final go0.y beGetOwnerAddressUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p02.l0 saveOwnerAddressUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final go0.k beFetchNativeOwTokenUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final s02.k saveTokensUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final OAuthWebViewData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g32.a nativeOAuthScreenMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final f32.d initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<f32.d, f32.c> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f32.c.InterfaceC1319c> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<r.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<r.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f58911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f58912b;

        /* JADX INFO: renamed from: f32.j0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1321a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f58913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f58914b;

            /* JADX INFO: renamed from: f32.j0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1322a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f58915d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f58916e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f58917f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f58919h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f58920j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f58921k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f58922l;

                public C1322a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f58915d = obj;
                    this.f58916e |= PKIFailureInfo.systemUnavail;
                    return C1321a.this.F(null, this);
                }
            }

            public C1321a(mu.h hVar, j0 j0Var) {
                this.f58913a = hVar;
                this.f58914b = j0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1322a c1322a;
                if (eVar instanceof C1322a) {
                    c1322a = (C1322a) eVar;
                    int i15 = c1322a.f58916e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1322a.f58916e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1322a = new C1322a(eVar);
                    }
                } else {
                    c1322a = new C1322a(eVar);
                }
                Object obj2 = c1322a.f58915d;
                Object objE = uq.b.e();
                int i16 = c1322a.f58916e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f58913a;
                    r.a aVarG9 = this.f58914b.G9((f32.d) obj);
                    c1322a.f58917f = vq.j.a(obj);
                    c1322a.f58919h = vq.j.a(c1322a);
                    c1322a.f58920j = vq.j.a(obj);
                    c1322a.f58921k = vq.j.a(hVar);
                    c1322a.f58922l = 0;
                    c1322a.f58916e = 1;
                    if (hVar.F(aVarG9, c1322a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, j0 j0Var) {
            this.f58911a = gVar;
            this.f58912b = j0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super r.a> hVar, tq.e eVar) {
            Object objA = this.f58911a.a(new C1321a(hVar, this.f58912b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf32/c$a;", "<unused var>", "Lf32/d;", "Loq/i0;", "<anonymous>", "(Lf32/c$a;Lf32/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<f32.c.a, f32.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58923e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f58923e;
            if (i15 == 0) {
                oq.u.b(obj);
                j0 j0Var = j0.this;
                f32.c.InterfaceC1319c.b bVar = f32.c.InterfaceC1319c.b.f58882a;
                this.f58923e = 1;
                if (j0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f32.c.a aVar, f32.d dVar, tq.e<? super oq.i0> eVar) {
            return j0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf32/q;", "state", "Loq/i0;", "<anonymous>", "(Lf32/q;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<Saving, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f58926f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Saving saving = (Saving) this.f58926f;
            Object objE = uq.b.e();
            int i15 = this.f58925e;
            if (i15 == 0) {
                oq.u.b(obj);
                s02.k kVar = j0.this.saveTokensUseCase;
                s02.k.Params params = new s02.k.Params(saving.getData().getOwTokens().getAccess(), saving.getData().getOwTokens().getRefresh(), saving.getData().getCentralTokens().getAccess());
                this.f58926f = vq.j.a(saving);
                this.f58925e = 1;
                if (kVar.d(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            j0.this.d9(f32.c.b.f58880a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Saving saving, tq.e<? super oq.i0> eVar) {
            return ((c) v(saving, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = j0.this.new c(eVar);
            cVar.f58926f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf32/c$b;", "<unused var>", "Lf32/q;", "Loq/i0;", "<anonymous>", "(Lf32/c$b;Lf32/q;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<f32.c.b, Saving, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f58928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f58929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f58930g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r1.F(r2, r4) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            if (r5.F(r1, r4) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f58930g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L1b
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                java.lang.Object r0 = r4.f58928e
                er.a r0 = (er.a) r0
            L1b:
                oq.u.b(r5)
                goto L57
            L1f:
                oq.u.b(r5)
                f32.j0 r5 = f32.j0.this
                d12.c r5 = f32.j0.A9(r5)
                er.a r5 = r5.a()
                if (r5 == 0) goto L47
                f32.j0 r1 = f32.j0.this
                r5.a()
                f32.c$c$a r2 = f32.c.InterfaceC1319c.a.f58881a
                java.lang.Object r5 = vq.j.a(r5)
                r4.f58928e = r5
                r5 = 0
                r4.f58929f = r5
                r4.f58930g = r3
                java.lang.Object r5 = r1.F(r2, r4)
                if (r5 != r0) goto L57
                goto L56
            L47:
                f32.j0 r5 = f32.j0.this
                f32.c$c$c r1 = f32.c.InterfaceC1319c.C1320c.f58883a
                r3 = 0
                r4.f58928e = r3
                r4.f58930g = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L57
            L56:
                return r0
            L57:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f32.j0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f32.c.b bVar, Saving saving, tq.e<? super oq.i0> eVar) {
            return j0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lf32/l;", "state", "Lk10/l;", "Lf32/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<f32.l>, tq.e<? super k10.l<? extends f32.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f58933f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error V(j0 j0Var, dx.b bVar, f32.l lVar) {
            return new Error(j0Var.E9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching X(JWSSigningParams jWSSigningParams, f32.l lVar) {
            return new Fetching(new Data(jWSSigningParams));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f58933f;
            Object objE = uq.b.e();
            int i15 = this.f58932e;
            if (i15 == 0) {
                oq.u.b(obj);
                rp0.a aVar = j0.this.getJWSSigningParamsUC;
                rp0.a.Params params = new rp0.a.Params(qp0.b.ELECTRONIC_DELIVERY);
                this.f58933f = c0Var;
                this.f58932e = 1;
                obj = aVar.c(params, this);
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
            final j0 j0Var = j0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: f32.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j0.e.V(j0Var, bVar, (l) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final JWSSigningParams jWSSigningParams = (JWSSigningParams) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: f32.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.e.X(jWSSigningParams, (l) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<f32.l> c0Var, tq.e<? super k10.l<? extends f32.d>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = j0.this.new e(eVar);
            eVar2.f58933f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf32/c$e;", "<unused var>", "Lk10/c0;", "Lf32/k;", "state", "Lk10/l;", "Lf32/d;", "<anonymous>", "(Lf32/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<f32.c.e, k10.c0<Error>, tq.e<? super k10.l<? extends f32.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f58936f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f32.l O(Error error) {
            return f32.l.f58961a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f58936f;
            uq.b.e();
            if (this.f58935e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: f32.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f32.c.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends f32.d>> eVar2) {
            f fVar = new f(eVar2);
            fVar.f58936f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lf32/g;", "state", "Lk10/l;", "Lf32/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends f32.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f58938f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error V(k10.c0 c0Var, j0 j0Var, dx.b bVar, Fetching fetching) {
            return new Error(((Fetching) c0Var.a()).getData(), j0Var.E9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching X(CentralTokens centralTokens, Fetching fetching) {
            return new Fetching(new Data(centralTokens));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f58938f;
            Object objE = uq.b.e();
            int i15 = this.f58937e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.k kVar = j0.this.fetchNativeCentralTokenUC;
                p02.k.Params params = new p02.k.Params(((Fetching) c0Var.a()).getData().getJwsSigningParams());
                this.f58938f = c0Var;
                this.f58937e = 1;
                obj = kVar.d(params, this);
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
            final j0 j0Var = j0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: f32.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j0.g.V(c0Var, j0Var, bVar, (Fetching) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final CentralTokens centralTokens = (CentralTokens) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: f32.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.g.X(centralTokens, (Fetching) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends f32.d>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = j0.this.new g(eVar);
            gVar.f58938f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf32/c$e;", "<unused var>", "Lk10/c0;", "Lf32/f;", "state", "Lk10/l;", "Lf32/d;", "<anonymous>", "(Lf32/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<f32.c.e, k10.c0<Error>, tq.e<? super k10.l<? extends f32.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f58941f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f58941f;
            uq.b.e();
            if (this.f58940e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: f32.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.h.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f32.c.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends f32.d>> eVar2) {
            h hVar = new h(eVar2);
            hVar.f58941f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lf32/j;", "state", "Lk10/l;", "Lf32/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends f32.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f58942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f58943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f58944g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f58945h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f58946j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f58947k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f58948l;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error X(j0 j0Var, dx.b bVar, Fetching fetching) {
            return new Error(fetching.getData(), j0Var.E9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching Y(k10.c0 c0Var, AddressData addressData, Fetching fetching) {
            return new Fetching(new Data(((Fetching) c0Var.a()).getData().getCentralTokens(), addressData));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error Z(k10.c0 c0Var, j0 j0Var, Fetching fetching) {
            return new Error(((Fetching) c0Var.a()).getData(), j0Var.E9(new dx.b.Generic(new Exception("OwnerAddress contains no data"))));
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j0 j0Var;
            OwnerAddress ownerAddress;
            final k10.c0 c0Var = (k10.c0) this.f58948l;
            Object objE = uq.b.e();
            int i15 = this.f58947k;
            if (i15 == 0) {
                oq.u.b(obj);
                go0.y yVar = j0.this.beGetOwnerAddressUC;
                go0.y.Params params = new go0.y.Params(((Fetching) c0Var.a()).getData().getCentralTokens().getAccess());
                this.f58948l = c0Var;
                this.f58947k = 1;
                obj = yVar.c(params, this);
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
                ownerAddress = (OwnerAddress) this.f58944g;
                j0Var = (j0) this.f58943f;
                oq.u.b(obj);
            }
            final AddressData addressData = ownerAddress.getAddressData();
            return addressData != null ? c0Var.d(new er.l() { // from class: f32.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.i.Y(c0Var, addressData, (Fetching) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: f32.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.i.Z(c0Var, j0Var, (Fetching) obj2);
                }
            });
            dx.i iVar = (dx.i) obj;
            j0Var = j0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: f32.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j0.i.X(j0Var, bVar, (Fetching) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwnerAddress ownerAddress2 = (OwnerAddress) ((dx.i.Right) iVar).b();
            p02.l0 l0Var = j0Var.saveOwnerAddressUC;
            p02.l0.Params params2 = new p02.l0.Params(ownerAddress2);
            this.f58948l = c0Var;
            this.f58942e = vq.j.a(iVar);
            this.f58943f = j0Var;
            this.f58944g = ownerAddress2;
            this.f58945h = 0;
            this.f58946j = 0;
            this.f58947k = 2;
            if (l0Var.d(params2, this) != objE) {
                ownerAddress = ownerAddress2;
                final AddressData addressData2 = ownerAddress.getAddressData();
                if (addressData2 != null) {
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends f32.d>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = j0.this.new i(eVar);
            iVar.f58948l = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf32/c$e;", "<unused var>", "Lk10/c0;", "Lf32/i;", "state", "Lk10/l;", "Lf32/d;", "<anonymous>", "(Lf32/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<f32.c.e, k10.c0<Error>, tq.e<? super k10.l<? extends f32.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f58951f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f58951f;
            uq.b.e();
            if (this.f58950e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: f32.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.j.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f32.c.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends f32.d>> eVar2) {
            j jVar = new j(eVar2);
            jVar.f58951f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lf32/o;", "state", "Lk10/l;", "Lf32/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends f32.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f58952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f58953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f58954g;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error V(j0 j0Var, dx.b bVar, Fetching fetching) {
            return new Error(fetching.getData(), j0Var.E9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Saving X(k10.c0 c0Var, OwTokens owTokens, Fetching fetching) {
            return new Saving(new Data(((Fetching) c0Var.a()).getData().getCentralTokens(), owTokens));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f58954g;
            Object objE = uq.b.e();
            int i15 = this.f58953f;
            if (i15 == 0) {
                oq.u.b(obj);
                iy.b0 edorAddress = ((Fetching) c0Var.a()).getData().getElectronicDeliveryAddress().getEdorAddress();
                go0.k kVar = j0.this.beFetchNativeOwTokenUC;
                go0.k.Params params = new go0.k.Params(edorAddress != null ? iy.c0.e(edorAddress) : null, ((Fetching) c0Var.a()).getData().getCentralTokens().getAccess());
                this.f58954g = c0Var;
                this.f58952e = vq.j.a(edorAddress);
                this.f58953f = 1;
                obj = kVar.c(params, this);
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
            final j0 j0Var = j0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: f32.u0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j0.k.V(j0Var, bVar, (Fetching) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final OwTokens owTokens = (OwTokens) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: f32.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.k.X(c0Var, owTokens, (Fetching) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends f32.d>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = j0.this.new k(eVar);
            kVar.f58954g = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf32/c$e;", "<unused var>", "Lk10/c0;", "Lf32/n;", "state", "Lk10/l;", "Lf32/d;", "<anonymous>", "(Lf32/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<f32.c.e, k10.c0<Error>, tq.e<? super k10.l<? extends f32.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f58957f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f58957f;
            uq.b.e();
            if (this.f58956e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: f32.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.l.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f32.c.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends f32.d>> eVar2) {
            l lVar = new l(eVar2);
            lVar.f58957f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    public j0(yy.a aVar, rp0.a aVar2, p02.k kVar, go0.y yVar, p02.l0 l0Var, go0.k kVar2, s02.k kVar3, OAuthWebViewData oAuthWebViewData, g32.a aVar3, hb4.d dVar, ib4.c cVar) {
        this.getJWSSigningParamsUC = aVar2;
        this.fetchNativeCentralTokenUC = kVar;
        this.beGetOwnerAddressUC = yVar;
        this.saveOwnerAddressUC = l0Var;
        this.beFetchNativeOwTokenUC = kVar2;
        this.saveTokensUseCase = kVar3;
        this.setupData = oAuthWebViewData;
        this.nativeOAuthScreenMapper = aVar3;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        f32.l lVar = f32.l.f58961a;
        this.initialState = lVar;
        this.stateMachine = aVar.a(lVar, new er.l() { // from class: f32.z
            @Override // er.l
            public final Object b(Object obj) {
                return j0.J9(this.f58997a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), G9(lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c E9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: f32.y
            @Override // er.l
            public final Object b(Object obj) {
                return j0.F9(this.f58995a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(j0 j0Var, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            j0Var.d9(f32.c.e.f58885a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            j0Var.d9(f32.c.a.f58879a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r.a G9(f32.d state) {
        return this.nativeOAuthScreenMapper.b(new g32.a.Params(state, b9(f32.c.a.f58879a), new er.l() { // from class: f32.w
            @Override // er.l
            public final Object b(Object obj) {
                return j0.H9(this.f58993a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(j0 j0Var, String str) {
        j0Var.d9(new f32.c.OnLinkClick(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(final j0 j0Var, k10.v vVar) {
        vVar.c(fr.q0.c(f32.d.class), new er.l() { // from class: f32.a0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.K9(this.f58875a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(f32.l.class), new er.l() { // from class: f32.b0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.L9(this.f58878a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: f32.c0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.M9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: f32.d0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.N9(this.f58886a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: f32.e0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.O9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: f32.f0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.P9(this.f58890a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: f32.g0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.Q9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: f32.h0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.R9(this.f58893a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: f32.i0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.S9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Saving.class), new er.l() { // from class: f32.x
            @Override // er.l
            public final Object b(Object obj) {
                return j0.T9(this.f58994a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(j0 j0Var, k10.z zVar) {
        b bVar = j0Var.new b(null);
        zVar.x(fr.q0.c(f32.c.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(j0 j0Var, k10.z zVar) {
        zVar.A(j0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(k10.z zVar) {
        f fVar = new f(null);
        zVar.v(fr.q0.c(f32.c.e.class), k10.o.CANCEL_PREVIOUS, fVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(j0 j0Var, k10.z zVar) {
        zVar.A(j0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(k10.z zVar) {
        h hVar = new h(null);
        zVar.v(fr.q0.c(f32.c.e.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(j0 j0Var, k10.z zVar) {
        zVar.A(j0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(fr.q0.c(f32.c.e.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(j0 j0Var, k10.z zVar) {
        zVar.A(j0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(fr.q0.c(f32.c.e.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(j0 j0Var, k10.z zVar) {
        zVar.C(j0Var.new c(null));
        d dVar = j0Var.new d(null);
        zVar.x(fr.q0.c(f32.c.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(f32.c.InterfaceC1319c interfaceC1319c, tq.e<? super oq.i0> eVar) {
        return super.F(interfaceC1319c, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(OAuthWebViewData oAuthWebViewData) {
        super.P5(oAuthWebViewData);
    }

    @Override // zx.b
    public xw.b<f32.c.InterfaceC1319c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<f32.d, f32.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<r.a> getState() {
        return this.state;
    }
}
