package q11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s11.CertificateInfoData;
import th0.UserCertificateMobileApi;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006By\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010+\u001a\u00020**\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b+\u0010,J\u0015\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00101J\u0018\u00104\u001a\u00020/2\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010X\u001a\b\u0012\u0004\u0012\u00020S0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR&\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030Y8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010$\u001a\b\u0012\u0004\u0012\u00020%0_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020e0d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010f¨\u0006h"}, d2 = {"Lq11/d0;", "Ll00/g;", "Lq11/b;", "Lq11/a;", "Lq11/c;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "snackBarManagerStateHolder", "Luh0/m;", "getUserCertificatesUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lr11/b;", "certificatesMapper", "Lib4/c;", "errorMapper", "Lug1/d;", "setCertUpdateRecommendationDisplayUC", "Lwz3/b;", "certGenerateAndSaveNewUC", "Lug1/b;", "displayCertUpdateRecommendationUC", "Lwz3/f;", "idCardCertShouldRenewUC", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Lez/b;", "dateCalculator", "Lhb4/d;", "errorVMSFactory", "<init>", "(Lyy/a;Li70/n;Luh0/m;Lac4/a;Lr11/b;Lib4/c;Lug1/d;Lwz3/b;Lug1/b;Lwz3/f;Lmx/c;Lez/c;Lez/b;Lhb4/d;)V", "state", "Lq11/c$a;", "E9", "(Lq11/b;)Lq11/c$a;", "", "Ls11/a;", "", "D9", "(Ljava/util/List;)J", "Ls11/d;", "result", "Loq/i0;", "H9", "(Ls11/d;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Li70/n;", "c", "Luh0/m;", "d", "Lac4/a;", "e", "Lr11/b;", "f", "Lib4/c;", "g", "Lug1/d;", "h", "Lwz3/b;", "j", "Lug1/b;", "k", "Lwz3/f;", "l", "Lmx/c;", "m", "Lez/c;", "n", "Lez/b;", "p", "Lhb4/d;", "Lxw/b;", "Lq11/a$h;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<q11.b, q11.a> implements q11.c, zx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uh0.m getUserCertificatesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r11.b certificatesMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ug1.d setCertUpdateRecommendationDisplayUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wz3.b certGenerateAndSaveNewUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ug1.b displayCertUpdateRecommendationUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wz3.f idCardCertShouldRenewUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<q11.a.h> navAction = new xw.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<q11.b, q11.a> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<q11.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<q11.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f163623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f163624b;

        /* JADX INFO: renamed from: q11.d0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4066a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f163625a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f163626b;

            /* JADX INFO: renamed from: q11.d0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4067a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f163627d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f163628e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f163629f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f163631h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f163632j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f163633k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f163634l;

                public C4067a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f163627d = obj;
                    this.f163628e |= PKIFailureInfo.systemUnavail;
                    return C4066a.this.F(null, this);
                }
            }

            public C4066a(mu.h hVar, d0 d0Var) {
                this.f163625a = hVar;
                this.f163626b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4067a c4067a;
                if (eVar instanceof C4067a) {
                    c4067a = (C4067a) eVar;
                    int i15 = c4067a.f163628e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4067a.f163628e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4067a = new C4067a(eVar);
                    }
                } else {
                    c4067a = new C4067a(eVar);
                }
                Object obj2 = c4067a.f163627d;
                Object objE = uq.b.e();
                int i16 = c4067a.f163628e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f163625a;
                    q11.c.a aVarE9 = this.f163626b.E9((q11.b) obj);
                    c4067a.f163629f = vq.j.a(obj);
                    c4067a.f163631h = vq.j.a(c4067a);
                    c4067a.f163632j = vq.j.a(obj);
                    c4067a.f163633k = vq.j.a(hVar);
                    c4067a.f163634l = 0;
                    c4067a.f163628e = 1;
                    if (hVar.F(aVarE9, c4067a) == objE) {
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

        public a(mu.g gVar, d0 d0Var) {
            this.f163623a = gVar;
            this.f163624b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super q11.c.a> hVar, tq.e eVar) {
            Object objA = this.f163623a.a(new C4066a(hVar, this.f163624b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lq11/b$b;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<q11.b.C4062b>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163636f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.d O(q11.b.C4062b c4062b) {
            return q11.b.d.f163592a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f163636f;
            uq.b.e();
            if (this.f163635e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: q11.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.b.O((b.C4062b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<q11.b.C4062b> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            return ((b) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f163636f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq11/a$a;", "<unused var>", "Lq11/b$c$a;", "Loq/i0;", "<anonymous>", "(Lq11/a$a;Lq11/b$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<q11.a.C4058a, q11.b.c.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163637e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f163637e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q11.a.h> bVarY1 = d0.this.Y1();
                q11.a.h.C4059a c4059a = q11.a.h.C4059a.f163580a;
                this.f163637e = 1;
                if (bVarY1.F(c4059a, this) == objE) {
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
        public final Object w(q11.a.C4058a c4058a, q11.b.c.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return d0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq11/a$f;", "action", "Lq11/b$c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq11/a$f;Lq11/b$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<q11.a.GoToCertificateDetails, q11.b.c.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163640f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q11.a.GoToCertificateDetails goToCertificateDetails = (q11.a.GoToCertificateDetails) this.f163640f;
            Object objE = uq.b.e();
            int i15 = this.f163639e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q11.a.h> bVarY1 = d0.this.Y1();
                q11.a.h.GoToCertificateDetails goToCertificateDetails2 = new q11.a.h.GoToCertificateDetails(goToCertificateDetails.getCertificate());
                this.f163640f = vq.j.a(goToCertificateDetails);
                this.f163639e = 1;
                if (bVarY1.F(goToCertificateDetails2, this) == objE) {
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
        public final Object w(q11.a.GoToCertificateDetails goToCertificateDetails, q11.b.c.Displaying displaying, tq.e<? super oq.i0> eVar) {
            d dVar = d0.this.new d(eVar);
            dVar.f163640f = goToCertificateDetails;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq11/a$b;", "action", "Lk10/c0;", "Lq11/b$c$a;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lq11/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<q11.a.ChangeSelectedTab, k10.c0<q11.b.c.Displaying>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f163644g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.c.Displaying O(k10.c0 c0Var, q11.a.ChangeSelectedTab changeSelectedTab, q11.b.c.Displaying displaying) {
            return ((q11.b.c.Displaying) c0Var.a()).b(q11.b.StateData.b(((q11.b.c.Displaying) c0Var.a()).getData(), changeSelectedTab.getSelectedTab(), null, false, false, 0L, 30, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final q11.a.ChangeSelectedTab changeSelectedTab = (q11.a.ChangeSelectedTab) this.f163643f;
            final k10.c0 c0Var = (k10.c0) this.f163644g;
            uq.b.e();
            if (this.f163642e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q11.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.e.O(c0Var, changeSelectedTab, (b.c.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q11.a.ChangeSelectedTab changeSelectedTab, k10.c0<q11.b.c.Displaying> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f163643f = changeSelectedTab;
            eVar2.f163644g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq11/a$g;", "<unused var>", "Lk10/c0;", "Lq11/b$c$a;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lq11/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<q11.a.g, k10.c0<q11.b.c.Displaying>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163646f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.c.Displaying O(k10.c0 c0Var, q11.b.c.Displaying displaying) {
            return displaying.b(q11.b.StateData.b(((q11.b.c.Displaying) c0Var.a()).getData(), null, null, true, false, 0L, 27, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f163646f;
            uq.b.e();
            if (this.f163645e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q11.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.f.O(c0Var, (b.c.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q11.a.g gVar, k10.c0<q11.b.c.Displaying> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f163646f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq11/a$c;", "<unused var>", "Lk10/c0;", "Lq11/b$c$a;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lq11/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<q11.a.c, k10.c0<q11.b.c.Displaying>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163648f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.c.Displaying O(k10.c0 c0Var, q11.b.c.Displaying displaying) {
            return displaying.b(q11.b.StateData.b(((q11.b.c.Displaying) c0Var.a()).getData(), null, null, false, false, 0L, 27, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f163648f;
            uq.b.e();
            if (this.f163647e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q11.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.g.O(c0Var, (b.c.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q11.a.c cVar, k10.c0<q11.b.c.Displaying> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f163648f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq11/a$e;", "<unused var>", "Lk10/c0;", "Lq11/b$c$a;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lq11/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<q11.a.e, k10.c0<q11.b.c.Displaying>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163650f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.c.GettingNewCertificate O(k10.c0 c0Var, q11.b.c.Displaying displaying) {
            return new q11.b.c.GettingNewCertificate(((q11.b.c.Displaying) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f163650f;
            uq.b.e();
            if (this.f163649e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: q11.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.h.O(c0Var, (b.c.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q11.a.e eVar, k10.c0<q11.b.c.Displaying> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar2) {
            h hVar = new h(eVar2);
            hVar.f163650f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq11/a$d;", "<unused var>", "Lk10/c0;", "Lq11/b$c$a;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lq11/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<q11.a.d, k10.c0<q11.b.c.Displaying>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163652f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.c.Displaying O(k10.c0 c0Var, q11.b.c.Displaying displaying) {
            return displaying.b(q11.b.StateData.b(((q11.b.c.Displaying) c0Var.a()).getData(), null, null, false, false, 0L, 23, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f163652f;
            Object objE = uq.b.e();
            int i15 = this.f163651e;
            if (i15 == 0) {
                oq.u.b(obj);
                ug1.d dVar = d0.this.setCertUpdateRecommendationDisplayUC;
                ug1.d.Params params = new ug1.d.Params(false);
                this.f163652f = c0Var;
                this.f163651e = 1;
                if (dVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: q11.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.i.O(c0Var, (b.c.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q11.a.d dVar, k10.c0<q11.b.c.Displaying> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            i iVar = d0.this.new i(eVar);
            iVar.f163652f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq11/a$i;", "<unused var>", "Lk10/c0;", "Lq11/b$c$a;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lq11/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<q11.a.i, k10.c0<q11.b.c.Displaying>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163655f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.d O(q11.b.c.Displaying displaying) {
            return q11.b.d.f163592a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f163655f;
            uq.b.e();
            if (this.f163654e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: q11.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.j.O((b.c.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q11.a.i iVar, k10.c0<q11.b.c.Displaying> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f163655f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lq11/b$c$b;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<q11.b.c.GettingNewCertificate>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163657f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lq11/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends q11.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f163659e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f163660f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f163661g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f163662h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f163663j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f163664k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f163665l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ d0 f163666m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<q11.b.c.GettingNewCertificate> f163667n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<q11.b.c.GettingNewCertificate> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f163666m = d0Var;
                this.f163667n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q11.b.a.GeneralError Y(k10.c0 c0Var, final d0 d0Var, dx.b bVar, q11.b.c.GettingNewCertificate gettingNewCertificate) {
                return new q11.b.a.GeneralError(((q11.b.c.GettingNewCertificate) c0Var.a()).getData(), d0Var.errorVMSFactory.a(d0Var.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: q11.n0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.k.a.Z(d0Var, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Z(d0 d0Var, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    d0Var.d9(q11.a.j.f163583a);
                } else {
                    d0Var.d9(q11.a.C4058a.f163573a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q11.b.d a0(q11.b.c.GettingNewCertificate gettingNewCertificate) {
                return q11.b.d.f163592a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<q11.b.c.GettingNewCertificate> c0Var;
                d0 d0Var;
                Object objE = uq.b.e();
                int i15 = this.f163665l;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wz3.b bVar = this.f163666m.certGenerateAndSaveNewUC;
                    wz3.b.Params params = new wz3.b.Params(rq0.b.d.ID_CARD);
                    this.f163665l = 1;
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
                    c0Var = (k10.c0) this.f163661g;
                    d0Var = (d0) this.f163660f;
                    oq.u.b(obj);
                }
                d0Var.y(new p50.a.DefaultWithIcon(d0Var.labelProvider.c(m11.b.f122470h), false, null, null, 14, null));
                return c0Var.d(new er.l() { // from class: q11.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.k.a.a0((b.c.GettingNewCertificate) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                final k10.c0<q11.b.c.GettingNewCertificate> c0Var2 = this.f163667n;
                final d0 d0Var2 = this.f163666m;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: q11.l0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.k.a.Y(c0Var2, d0Var2, bVar2, (b.c.GettingNewCertificate) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                ug1.d dVar = d0Var2.setCertUpdateRecommendationDisplayUC;
                ug1.d.Params params2 = new ug1.d.Params(false);
                this.f163659e = vq.j.a(iVar);
                this.f163660f = d0Var2;
                this.f163661g = c0Var2;
                this.f163662h = vq.j.a(i0Var);
                this.f163663j = 0;
                this.f163664k = 0;
                this.f163665l = 2;
                if (dVar.c(params2, this) != objE) {
                    c0Var = c0Var2;
                    d0Var = d0Var2;
                    d0Var.y(new p50.a.DefaultWithIcon(d0Var.labelProvider.c(m11.b.f122470h), false, null, null, 14, null));
                    return c0Var.d(new er.l() { // from class: q11.m0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.k.a.a0((b.c.GettingNewCertificate) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f163666m, this.f163667n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends q11.b>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f163657f;
            Object objE = uq.b.e();
            int i15 = this.f163656e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, c0Var, null);
            this.f163657f = vq.j.a(c0Var);
            this.f163656e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<q11.b.c.GettingNewCertificate> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = d0.this.new k(eVar);
            kVar.f163657f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lq11/b$d;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<q11.b.d>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163669f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lq11/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends q11.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f163671e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f163672f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f163673g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f163674h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f163675j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f163676k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f163677l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f163678m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ d0 f163679n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<q11.b.d> f163680p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<q11.b.d> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f163679n = d0Var;
                this.f163680p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q11.b.a.LoadCertificatesError Y(final d0 d0Var, dx.b bVar, q11.b.d dVar) {
                return new q11.b.a.LoadCertificatesError(d0Var.errorVMSFactory.a(d0Var.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: q11.q0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.l.a.Z(d0Var, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Z(d0 d0Var, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    d0Var.d9(q11.a.C4058a.f163573a);
                } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    d0Var.d9(q11.a.k.f163584a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q11.b.c.Displaying a0(d0 d0Var, List list, boolean z15, q11.b.d dVar) {
                return new q11.b.c.Displaying(new q11.b.StateData(null, list, false, z15, d0Var.D9(list), 5, null));
            }

            /* JADX WARN: Code duplicated, block: B:31:0x010f  */
            /* JADX WARN: Code duplicated, block: B:34:0x0134  */
            /* JADX WARN: Code duplicated, block: B:37:0x013d  */
            /* JADX WARN: Code duplicated, block: B:38:0x013f  */
            /* JADX WARN: Code duplicated, block: B:39:0x0140 A[PHI: r2 r7 r10
              0x0140: PHI (r2v7 k10.c0<q11.b$d>) = (r2v6 k10.c0<q11.b$d>), (r2v9 k10.c0<q11.b$d>) binds: [B:30:0x010d, B:38:0x013f] A[DONT_GENERATE, DONT_INLINE]
              0x0140: PHI (r7v4 java.util.List) = (r7v3 java.util.List), (r7v5 java.util.List) binds: [B:30:0x010d, B:38:0x013f] A[DONT_GENERATE, DONT_INLINE]
              0x0140: PHI (r10v3 q11.d0) = (r10v2 q11.d0), (r10v5 q11.d0) binds: [B:30:0x010d, B:38:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objC;
                dx.i iVar;
                k10.c0<q11.b.d> c0Var;
                Object objC2;
                final d0 d0Var;
                List list;
                int i15;
                List list2;
                int i16;
                Object objC3;
                final List list3;
                Object objE = uq.b.e();
                int i17 = this.f163678m;
                final boolean z15 = false;
                if (i17 == 0) {
                    oq.u.b(obj);
                    uh0.m mVar = this.f163679n.getUserCertificatesUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f163678m = 1;
                    objC = mVar.c(c1792a, this);
                    if (objC != objE) {
                    }
                    return objE;
                }
                if (i17 == 1) {
                    oq.u.b(obj);
                    objC = obj;
                } else {
                    if (i17 == 2) {
                        int i18 = this.f163677l;
                        int i19 = this.f163676k;
                        list = (List) this.f163675j;
                        List list4 = (List) this.f163674h;
                        k10.c0<q11.b.d> c0Var2 = (k10.c0) this.f163673g;
                        d0Var = (d0) this.f163672f;
                        iVar = (dx.i) this.f163671e;
                        oq.u.b(obj);
                        i15 = i18;
                        c0Var = c0Var2;
                        list2 = list4;
                        i16 = i19;
                        objC2 = obj;
                        if (((Boolean) objC2).booleanValue()) {
                            ug1.b bVar = d0Var.displayCertUpdateRecommendationUC;
                            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                            this.f163671e = vq.j.a(iVar);
                            this.f163672f = d0Var;
                            this.f163673g = c0Var;
                            this.f163674h = vq.j.a(list2);
                            this.f163675j = list;
                            this.f163676k = i16;
                            this.f163677l = i15;
                            this.f163678m = 3;
                            objC3 = bVar.c(c1792a2, this);
                            if (objC3 != objE) {
                                list3 = list;
                            }
                            return objE;
                        }
                        list3 = list;
                        return c0Var.d(new er.l() { // from class: q11.p0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return d0.l.a.a0(d0Var, list3, z15, (b.d) obj2);
                            }
                        });
                    }
                    if (i17 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.f163675j;
                    c0Var = (k10.c0) this.f163673g;
                    d0 d0Var2 = (d0) this.f163672f;
                    oq.u.b(obj);
                    d0Var = d0Var2;
                    objC3 = obj;
                }
                if (((Boolean) objC3).booleanValue()) {
                    z15 = true;
                } else {
                    list = list3;
                    list3 = list;
                }
                return c0Var.d(new er.l() { // from class: q11.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.l.a.a0(d0Var, list3, z15, (b.d) obj2);
                    }
                });
                iVar = (dx.i) objC;
                c0Var = this.f163680p;
                final d0 d0Var3 = this.f163679n;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: q11.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.l.a.Y(d0Var3, bVar2, (b.d) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                List list5 = (List) ((dx.i.Right) iVar).b();
                List<UserCertificateMobileApi> list6 = list5;
                ArrayList arrayList = new ArrayList(pq.v.y(list6, 10));
                for (UserCertificateMobileApi userCertificateMobileApi : list6) {
                    arrayList.add(new CertificateInfoData(userCertificateMobileApi, d0Var3.dateCalculator.e(d0Var3.dateConverter.d(userCertificateMobileApi.getValidTo()))));
                }
                wz3.f fVar = d0Var3.idCardCertShouldRenewUC;
                gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                this.f163671e = vq.j.a(iVar);
                this.f163672f = d0Var3;
                this.f163673g = c0Var;
                this.f163674h = vq.j.a(list5);
                this.f163675j = arrayList;
                this.f163676k = 0;
                this.f163677l = 0;
                this.f163678m = 2;
                objC2 = fVar.c(c1792a3, this);
                if (objC2 != objE) {
                    d0Var = d0Var3;
                    list = arrayList;
                    i15 = 0;
                    list2 = list5;
                    i16 = 0;
                    if (((Boolean) objC2).booleanValue()) {
                        ug1.b bVar3 = d0Var.displayCertUpdateRecommendationUC;
                        gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                        this.f163671e = vq.j.a(iVar);
                        this.f163672f = d0Var;
                        this.f163673g = c0Var;
                        this.f163674h = vq.j.a(list2);
                        this.f163675j = list;
                        this.f163676k = i16;
                        this.f163677l = i15;
                        this.f163678m = 3;
                        objC3 = bVar3.c(c1792a4, this);
                        if (objC3 != objE) {
                            list3 = list;
                            if (((Boolean) objC3).booleanValue()) {
                                z15 = true;
                            } else {
                                list = list3;
                                list3 = list;
                            }
                        }
                    } else {
                        list3 = list;
                    }
                    return c0Var.d(new er.l() { // from class: q11.p0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.l.a.a0(d0Var, list3, z15, (b.d) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f163679n, this.f163680p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends q11.b>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f163669f;
            Object objE = uq.b.e();
            int i15 = this.f163668e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, c0Var, null);
            this.f163669f = vq.j.a(c0Var);
            this.f163668e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<q11.b.d> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            return ((l) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l lVar = d0.this.new l(eVar);
            lVar.f163669f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq11/a$a;", "<unused var>", "Lq11/b$a$b;", "Loq/i0;", "<anonymous>", "(Lq11/a$a;Lq11/b$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<q11.a.C4058a, q11.b.a.LoadCertificatesError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163681e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f163681e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q11.a.h> bVarY1 = d0.this.Y1();
                q11.a.h.C4059a c4059a = q11.a.h.C4059a.f163580a;
                this.f163681e = 1;
                if (bVarY1.F(c4059a, this) == objE) {
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
        public final Object w(q11.a.C4058a c4058a, q11.b.a.LoadCertificatesError loadCertificatesError, tq.e<? super oq.i0> eVar) {
            return d0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq11/a$k;", "<unused var>", "Lk10/c0;", "Lq11/b$a$b;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lq11/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<q11.a.k, k10.c0<q11.b.a.LoadCertificatesError>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163684f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.d O(q11.b.a.LoadCertificatesError loadCertificatesError) {
            return q11.b.d.f163592a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f163684f;
            uq.b.e();
            if (this.f163683e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: q11.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.n.O((b.a.LoadCertificatesError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q11.a.k kVar, k10.c0<q11.b.a.LoadCertificatesError> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f163684f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq11/a$a;", "<unused var>", "Lq11/b$a$a;", "Loq/i0;", "<anonymous>", "(Lq11/a$a;Lq11/b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<q11.a.C4058a, q11.b.a.GeneralError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163685e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f163685e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q11.a.h> bVarY1 = d0.this.Y1();
                q11.a.h.C4059a c4059a = q11.a.h.C4059a.f163580a;
                this.f163685e = 1;
                if (bVarY1.F(c4059a, this) == objE) {
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
        public final Object w(q11.a.C4058a c4058a, q11.b.a.GeneralError generalError, tq.e<? super oq.i0> eVar) {
            return d0.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq11/a$j;", "<unused var>", "Lk10/c0;", "Lq11/b$a$a;", "state", "Lk10/l;", "Lq11/b;", "<anonymous>", "(Lq11/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<q11.a.j, k10.c0<q11.b.a.GeneralError>, tq.e<? super k10.l<? extends q11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163688f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q11.b.c.GettingNewCertificate O(k10.c0 c0Var, q11.b.a.GeneralError generalError) {
            return new q11.b.c.GettingNewCertificate(((q11.b.a.GeneralError) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f163688f;
            uq.b.e();
            if (this.f163687e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: q11.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.p.O(c0Var, (b.a.GeneralError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q11.a.j jVar, k10.c0<q11.b.a.GeneralError> c0Var, tq.e<? super k10.l<? extends q11.b>> eVar) {
            p pVar = new p(eVar);
            pVar.f163688f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    public d0(yy.a aVar, i70.n nVar, uh0.m mVar, ac4.a aVar2, r11.b bVar, ib4.c cVar, ug1.d dVar, wz3.b bVar2, ug1.b bVar3, wz3.f fVar, mx.c cVar2, ez.c cVar3, ez.b bVar4, hb4.d dVar2) {
        this.snackBarManagerStateHolder = nVar;
        this.getUserCertificatesUseCase = mVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.certificatesMapper = bVar;
        this.errorMapper = cVar;
        this.setCertUpdateRecommendationDisplayUC = dVar;
        this.certGenerateAndSaveNewUC = bVar2;
        this.displayCertUpdateRecommendationUC = bVar3;
        this.idCardCertShouldRenewUC = fVar;
        this.labelProvider = cVar2;
        this.dateConverter = cVar3;
        this.dateCalculator = bVar4;
        this.errorVMSFactory = dVar2;
        q11.b.C4062b c4062b = q11.b.C4062b.f163589a;
        this.stateMachine = aVar.a(c4062b, new er.l() { // from class: q11.u
            @Override // er.l
            public final Object b(Object obj) {
                return d0.J9(this.f163731a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), E9(c4062b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D9(List<CertificateInfoData> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((CertificateInfoData) obj).getCertificate().getType() == UserCertificateMobileApi.b.CITIZEN) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CertificateInfoData) next).getCertificate().getStatus() != UserCertificateMobileApi.a.ACTIVE);
        CertificateInfoData certificateInfoData = (CertificateInfoData) next;
        if (certificateInfoData != null) {
            return certificateInfoData.getValidityDaysLeft();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q11.c.a E9(q11.b state) {
        r11.b bVar = this.certificatesMapper;
        er.a<oq.i0> aVarB9 = b9(q11.a.d.f163576a);
        er.a<oq.i0> aVarB10 = b9(q11.a.e.f163577a);
        er.a<oq.i0> aVarB11 = b9(q11.a.g.f163579a);
        return bVar.b(new r11.b.CertificatesParams(state, new er.l() { // from class: q11.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.F9(this.f163733a, (UserCertificateMobileApi) obj);
            }
        }, new er.l() { // from class: q11.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.G9(this.f163735a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, aVarB9, aVarB10, b9(q11.a.C4058a.f163573a), aVarB11, b9(q11.a.c.f163575a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(d0 d0Var, UserCertificateMobileApi userCertificateMobileApi) {
        d0Var.d9(new q11.a.GoToCertificateDetails(userCertificateMobileApi));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(d0 d0Var, y30.n.Switch.EnumC5973b enumC5973b) {
        d0Var.d9(new q11.a.ChangeSelectedTab(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(final d0 d0Var, k10.v vVar) {
        vVar.c(fr.q0.c(q11.b.C4062b.class), new er.l() { // from class: q11.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.K9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(q11.b.c.Displaying.class), new er.l() { // from class: q11.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.L9(this.f163736a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(q11.b.c.GettingNewCertificate.class), new er.l() { // from class: q11.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.M9(this.f163737a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(q11.b.d.class), new er.l() { // from class: q11.a0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.N9(this.f163585a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(q11.b.a.LoadCertificatesError.class), new er.l() { // from class: q11.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.O9(this.f163598a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(q11.b.a.GeneralError.class), new er.l() { // from class: q11.c0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.P9(this.f163603a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(k10.z zVar) {
        zVar.A(new b(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(d0 d0Var, k10.z zVar) {
        c cVar = d0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(q11.a.C4058a.class), oVar, cVar);
        zVar.x(fr.q0.c(q11.a.GoToCertificateDetails.class), oVar, d0Var.new d(null));
        zVar.v(fr.q0.c(q11.a.ChangeSelectedTab.class), oVar, new e(null));
        zVar.v(fr.q0.c(q11.a.g.class), oVar, new f(null));
        zVar.v(fr.q0.c(q11.a.c.class), oVar, new g(null));
        zVar.v(fr.q0.c(q11.a.e.class), oVar, new h(null));
        zVar.v(fr.q0.c(q11.a.d.class), oVar, d0Var.new i(null));
        zVar.v(fr.q0.c(q11.a.i.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(d0 d0Var, k10.z zVar) {
        m mVar = d0Var.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(q11.a.C4058a.class), oVar, mVar);
        zVar.v(fr.q0.c(q11.a.k.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(d0 d0Var, k10.z zVar) {
        o oVar = d0Var.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(q11.a.C4058a.class), oVar2, oVar);
        zVar.v(fr.q0.c(q11.a.j.class), oVar2, new p(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    public final void H9(s11.d result) {
        if (!fr.t.c(result, s11.d.a.f177428a)) {
            throw new oq.p();
        }
        d9(q11.a.i.f163582a);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(q11.c.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<q11.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<q11.b, q11.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<q11.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
