package ps2;

import fr.q0;
import iy.b0;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ju.g1;
import ju.l0;
import k10.c0;
import mu.p0;
import mx.Label;
import ns2.Document;
import ns2.PensionerCardData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 o2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001pBq\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\"\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0082@¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020/2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00109\u001a\u000206*\u0002062\b\b\u0001\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0018\u0010=\u001a\u00020/2\u0006\u0010<\u001a\u00020;H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b?\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010_\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030`8\u0014X\u0094\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR \u0010'\u001a\b\u0012\u0004\u0012\u00020(0f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020l0k8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010m¨\u0006q"}, d2 = {"Lps2/w;", "Ll00/g;", "Lps2/k;", "Ln20/a;", "Lps2/l;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "snackBarManagerStateHolder", "Lqs2/g;", "pensionerCardMapper", "Lqs2/j;", "pensionerDialogMapper", "Lqs2/d;", "pensionerCardErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lh64/r;", "loadServicesUseCase", "Lbv3/b;", "documentCardVMSFactory", "Lms2/a;", "pensionerCardContainersInteractor", "<init>", "(Lyy/a;Lmx/c;Lez/e;Li70/n;Lqs2/g;Lqs2/j;Lqs2/d;Lac4/a;Lmz3/z;Lmz3/w;Lh64/r;Lbv3/b;Lms2/a;)V", "Lns2/e;", "data", "Lbv3/a;", "y9", "(Lns2/e;)Lbv3/a;", "state", "Lps2/l$a;", "A9", "(Lps2/k;)Lps2/l$a;", "Lmz3/z$b;", "updateMethodType", "", "documentId", "Loq/i0;", "J9", "(Lmz3/z$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lmz3/z$c;", "result", "E9", "(Lmz3/z$c;)V", "Lmx/a;", "", "tagId", "K9", "(Lmx/a;I)Lmx/a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "Lez/e;", "d", "Li70/n;", "e", "Lqs2/g;", "f", "Lqs2/j;", "g", "Lqs2/d;", "h", "Lac4/a;", "j", "Lmz3/z;", "k", "Lmz3/w;", "l", "Lh64/r;", "m", "Lbv3/b;", "n", "Lms2/a;", "Lxw/b;", "Lps2/f;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "s", "a", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<ps2.k, n20.a> implements ps2.l, zx.b, i70.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f162309t = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final rq0.b.d f162310v = rq0.b.d.PENSIONER_CARD;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qs2.g pensionerCardMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final qs2.j pensionerDialogMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final qs2.d pensionerCardErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final bv3.b documentCardVMSFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ms2.a pensionerCardContainersInteractor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ps2.k, n20.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ps2.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<ps2.l.a> state = a9(new b(e9().getState(), this), ps2.l.a.C4002a.f162293a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ps2.l.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f162327b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162328a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f162329b;

            /* JADX INFO: renamed from: ps2.w$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4003a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162330d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162331e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162332f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f162334h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162335j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162336k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f162337l;

                public C4003a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162330d = obj;
                    this.f162331e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f162328a = hVar;
                this.f162329b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4003a c4003a;
                if (eVar instanceof C4003a) {
                    c4003a = (C4003a) eVar;
                    int i15 = c4003a.f162331e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4003a.f162331e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4003a = new C4003a(eVar);
                    }
                } else {
                    c4003a = new C4003a(eVar);
                }
                Object obj2 = c4003a.f162330d;
                Object objE = uq.b.e();
                int i16 = c4003a.f162331e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f162328a;
                    ps2.l.a aVarA9 = this.f162329b.A9((ps2.k) obj);
                    c4003a.f162332f = vq.j.a(obj);
                    c4003a.f162334h = vq.j.a(c4003a);
                    c4003a.f162335j = vq.j.a(obj);
                    c4003a.f162336k = vq.j.a(hVar);
                    c4003a.f162337l = 0;
                    c4003a.f162331e = 1;
                    if (hVar.F(aVarA9, c4003a) == objE) {
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

        public b(mu.g gVar, w wVar) {
            this.f162326a = gVar;
            this.f162327b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ps2.l.a> hVar, tq.e eVar) {
            Object objA = this.f162326a.a(new a(hVar, this.f162327b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lps2/k$b;", "it", "Loq/i0;", "<anonymous>", "(Lps2/k$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<ps2.k.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162338e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r7.F(r1, r6) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f162338e
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                oq.u.b(r7)
                goto L6c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L39
            L1e:
                oq.u.b(r7)
                ps2.w r7 = ps2.w.this
                mz3.w r7 = ps2.w.v9(r7)
                mz3.w$a r1 = new mz3.w$a
                rq0.b$d r4 = ps2.w.q9()
                r1.<init>(r4)
                r6.f162338e = r2
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L39
                goto L5c
            L39:
                mz3.w$b r7 = (mz3.w.b) r7
                boolean r1 = r7 instanceof mz3.w.b.NotReady
                if (r1 == 0) goto L5d
                ps2.w r7 = ps2.w.this
                xw.b r7 = r7.Y1()
                ps2.f$d r1 = new ps2.f$d
                gv3.b$b r2 = new gv3.b$b
                rq0.b$d r4 = ps2.w.q9()
                r5 = 0
                r2.<init>(r4, r5, r3, r5)
                r1.<init>(r2)
                r6.f162338e = r3
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto L6c
            L5c:
                return r0
            L5d:
                mz3.w$b$b r0 = mz3.w.b.C3231b.f129717a
                boolean r7 = fr.t.c(r7, r0)
                if (r7 == 0) goto L6f
                ps2.w r7 = ps2.w.this
                ps2.e r0 = ps2.e.f162277a
                ps2.w.o9(r7, r0)
            L6c:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L6f:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ps2.w.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ps2.k.b bVar, tq.e<? super i0> eVar) {
            return ((c) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return w.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lps2/b;", "<unused var>", "Lps2/k$b;", "Loq/i0;", "<anonymous>", "(Lps2/b;Lps2/k$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ps2.b, ps2.k.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162340e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f162342e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f162343f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f162343f = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f162342e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                ms2.a aVar = this.f162343f.pensionerCardContainersInteractor;
                this.f162342e = 1;
                Object objB = aVar.b(null, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f162343f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r11.F(r1, r10) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r10.f162340e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                oq.u.b(r11)
                r7 = r10
                goto L4f
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                oq.u.b(r11)
                r7 = r10
                goto L3e
            L20:
                oq.u.b(r11)
                ps2.w r11 = ps2.w.this
                ac4.a r4 = ps2.w.p9(r11)
                ps2.w$d$a r6 = new ps2.w$d$a
                ps2.w r11 = ps2.w.this
                r1 = 0
                r6.<init>(r11, r1)
                r10.f162340e = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L3e
                goto L4e
            L3e:
                ps2.w r11 = ps2.w.this
                xw.b r11 = r11.Y1()
                ps2.f$a r1 = ps2.f.a.f162278a
                r7.f162340e = r2
                java.lang.Object r11 = r11.F(r1, r10)
                if (r11 != r0) goto L4f
            L4e:
                return r0
            L4f:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ps2.w.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ps2.b bVar, ps2.k.b bVar2, tq.e<? super i0> eVar) {
            return w.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lps2/c;", "action", "Lps2/k$a;", "state", "Loq/i0;", "<anonymous>", "(Lps2/c;Lps2/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<GoToVerificationProcess, ps2.k.DataSet, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162346g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToVerificationProcess goToVerificationProcess = (GoToVerificationProcess) this.f162345f;
            ps2.k.DataSet dataSet = (ps2.k.DataSet) this.f162346g;
            Object objE = uq.b.e();
            int i15 = this.f162344e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (dataSet.getPensionerCardDocumentData().getStatus().e()) {
                    xw.b<ps2.f> bVarY1 = w.this.Y1();
                    ps2.f.b bVar = ps2.f.b.f162279a;
                    this.f162345f = vq.j.a(goToVerificationProcess);
                    this.f162346g = vq.j.a(dataSet);
                    this.f162344e = 1;
                    if (bVarY1.F(bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    w.this.d9(new ShowPensionerDialog(new qs2.h.Refresh(goToVerificationProcess.a())));
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
        public final Object w(GoToVerificationProcess goToVerificationProcess, ps2.k.DataSet dataSet, tq.e<? super i0> eVar) {
            e eVar2 = w.this.new e(eVar);
            eVar2.f162345f = goToVerificationProcess;
            eVar2.f162346g = dataSet;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lps2/j;", "event", "Lps2/k$a;", "state", "Loq/i0;", "<anonymous>", "(Lps2/j;Lps2/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<UpdatePensionerCard, ps2.k.DataSet, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162350g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f162352e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f162353f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ UpdatePensionerCard f162354g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ ps2.k.DataSet f162355h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, UpdatePensionerCard updatePensionerCard, ps2.k.DataSet dataSet, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f162353f = wVar;
                this.f162354g = updatePensionerCard;
                this.f162355h = dataSet;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f162352e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    w wVar = this.f162353f;
                    mz3.z.b updateMethodType = this.f162354g.getUpdateMethodType();
                    Document document = this.f162355h.getPensionerCardDocumentData().getDocument();
                    String documentId = document != null ? document.getDocumentId() : null;
                    this.f162352e = 1;
                    if (wVar.J9(updateMethodType, documentId, this) == objE) {
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f162353f, this.f162354g, this.f162355h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            UpdatePensionerCard updatePensionerCard = (UpdatePensionerCard) this.f162349f;
            ps2.k.DataSet dataSet = (ps2.k.DataSet) this.f162350g;
            Object objE = uq.b.e();
            int i15 = this.f162348e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = w.this.callActionWithLoaderUseCase;
                a aVar2 = new a(w.this, updatePensionerCard, dataSet, null);
                this.f162349f = vq.j.a(updatePensionerCard);
                this.f162350g = vq.j.a(dataSet);
                this.f162348e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(UpdatePensionerCard updatePensionerCard, ps2.k.DataSet dataSet, tq.e<? super i0> eVar) {
            f fVar = w.this.new f(eVar);
            fVar.f162349f = updatePensionerCard;
            fVar.f162350g = dataSet;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lps2/b;", "<unused var>", "Lps2/k$a;", "state", "Loq/i0;", "<anonymous>", "(Lps2/b;Lps2/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ps2.b, ps2.k.DataSet, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162357f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f162359e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f162360f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ps2.k.DataSet f162361g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, ps2.k.DataSet dataSet, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f162360f = wVar;
                this.f162361g = dataSet;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f162359e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                ms2.a aVar = this.f162360f.pensionerCardContainersInteractor;
                Document document = this.f162361g.getPensionerCardDocumentData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                this.f162359e = 1;
                Object objB = aVar.b(documentId, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f162360f, this.f162361g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (r12.F(r2, r11) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f162357f
                ps2.k$a r0 = (ps2.k.DataSet) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f162356e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L24
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                oq.u.b(r12)
                r8 = r11
                goto L5f
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                oq.u.b(r12)
                r8 = r11
                goto L48
            L24:
                oq.u.b(r12)
                ps2.w r12 = ps2.w.this
                ac4.a r5 = ps2.w.p9(r12)
                ps2.w$g$a r7 = new ps2.w$g$a
                ps2.w r12 = ps2.w.this
                r2 = 0
                r7.<init>(r12, r0, r2)
                java.lang.Object r12 = vq.j.a(r0)
                r11.f162357f = r12
                r11.f162356e = r4
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r1) goto L48
                goto L5e
            L48:
                ps2.w r12 = ps2.w.this
                xw.b r12 = r12.Y1()
                ps2.f$a r2 = ps2.f.a.f162278a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f162357f = r0
                r8.f162356e = r3
                java.lang.Object r12 = r12.F(r2, r11)
                if (r12 != r1) goto L5f
            L5e:
                return r1
            L5f:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ps2.w.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ps2.b bVar, ps2.k.DataSet dataSet, tq.e<? super i0> eVar) {
            g gVar = w.this.new g(eVar);
            gVar.f162357f = dataSet;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lps2/g;", "<unused var>", "Lps2/k;", "Loq/i0;", "<anonymous>", "(Lps2/g;Lps2/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ps2.g, ps2.k, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f162363f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f162365h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f162366j;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            if (r1.F(r4, r5) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f162366j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f162363f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r5.f162362e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L6c
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L40
            L26:
                oq.u.b(r6)
                ps2.w r6 = ps2.w.this
                ms2.a r6 = ps2.w.s9(r6)
                ps2.w r1 = ps2.w.this
                ps2.b r4 = ps2.b.f162274a
                er.a r1 = ps2.w.n9(r1, r4)
                r5.f162366j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L40
                goto L6b
            L40:
                dx.i r6 = (dx.i) r6
                ps2.w r1 = ps2.w.this
                boolean r3 = r6 instanceof dx.i.Right
                if (r3 == 0) goto L6c
                r3 = r6
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                ps2.f$e r4 = new ps2.f$e
                r4.<init>(r3)
                r5.f162362e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f162363f = r6
                r6 = 0
                r5.f162364g = r6
                r5.f162365h = r6
                r5.f162366j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L6c
            L6b:
                return r0
            L6c:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ps2.w.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ps2.g gVar, ps2.k kVar, tq.e<? super i0> eVar) {
            return w.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lps2/i;", "action", "Lps2/k;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lps2/i;Lps2/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ShowPensionerDialog, ps2.k, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162369f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowPensionerDialog showPensionerDialog = (ShowPensionerDialog) this.f162369f;
            Object objE = uq.b.e();
            int i15 = this.f162368e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ps2.f> bVarY1 = w.this.Y1();
                ps2.f.ShowDialog showDialog = new ps2.f.ShowDialog(w.this.pensionerDialogMapper.b(new qs2.j.Params(showPensionerDialog.getDialog())));
                this.f162369f = vq.j.a(showPensionerDialog);
                this.f162368e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(ShowPensionerDialog showPensionerDialog, ps2.k kVar, tq.e<? super i0> eVar) {
            i iVar = w.this.new i(eVar);
            iVar.f162369f = showPensionerDialog;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lps2/h;", "action", "Lps2/k;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lps2/h;Lps2/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ShowError, ps2.k, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162372f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowError showError = (ShowError) this.f162372f;
            Object objE = uq.b.e();
            int i15 = this.f162371e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ps2.f> bVarY1 = w.this.Y1();
                ps2.f.ShowError showError2 = new ps2.f.ShowError(w.this.pensionerCardErrorMapper.b(showError.getError()));
                this.f162372f = vq.j.a(showError);
                this.f162371e = 1;
                if (bVarY1.F(showError2, this) == objE) {
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
        public final Object w(ShowError showError, ps2.k kVar, tq.e<? super i0> eVar) {
            j jVar = w.this.new j(eVar);
            jVar.f162372f = showError;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lps2/d;", "<unused var>", "Lps2/k;", "Loq/i0;", "<anonymous>", "(Lps2/d;Lps2/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ps2.d, ps2.k, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f162375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162376g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f162377h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f162378j;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f162378j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f162375f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r0 = r6.f162375f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r6.f162374e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto L98
            L2a:
                oq.u.b(r7)
                goto L40
            L2e:
                oq.u.b(r7)
                ps2.w r7 = ps2.w.this
                ms2.a r7 = ps2.w.s9(r7)
                r6.f162378j = r4
                java.lang.Object r7 = r7.d(r6)
                if (r7 != r0) goto L40
                goto L97
            L40:
                dx.i r7 = (dx.i) r7
                ps2.w r1 = ps2.w.this
                boolean r4 = r7 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L6d
                r2 = r7
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                ps2.f$c r4 = ps2.f.c.f162280a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f162374e = r7
                java.lang.Object r7 = vq.j.a(r2)
                r6.f162375f = r7
                r6.f162376g = r5
                r6.f162377h = r5
                r6.f162378j = r3
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto L98
                goto L97
            L6d:
                boolean r3 = r7 instanceof dx.i.Right
                if (r3 == 0) goto L9b
                r3 = r7
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                ps2.f$e r4 = new ps2.f$e
                r4.<init>(r3)
                java.lang.Object r7 = vq.j.a(r7)
                r6.f162374e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f162375f = r7
                r6.f162376g = r5
                r6.f162377h = r5
                r6.f162378j = r2
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto L98
            L97:
                return r0
            L98:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L9b:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ps2.w.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ps2.d dVar, ps2.k kVar, tq.e<? super i0> eVar) {
            return w.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lps2/a;", "<unused var>", "Lps2/k;", "Loq/i0;", "<anonymous>", "(Lps2/a;Lps2/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a, ps2.k, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162380e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162380e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ps2.f> bVarY1 = w.this.Y1();
                ps2.f.a aVar = ps2.f.a.f162278a;
                this.f162380e = 1;
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
        public final Object w(a aVar, ps2.k kVar, tq.e<? super i0> eVar) {
            return w.this.new l(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lps2/e;", "<unused var>", "Lk10/c0;", "Lps2/k;", "state", "Lk10/l;", "<anonymous>", "(Lps2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ps2.e, c0<ps2.k>, tq.e<? super k10.l<? extends ps2.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f162383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f162384g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f162385h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f162386j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f162387k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f162388l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f162389m;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lns2/e;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends PensionerCardData>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f162391e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f162392f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f162392f = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f162391e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                ms2.a aVar = this.f162392f.pensionerCardContainersInteractor;
                this.f162391e = 1;
                Object objF = aVar.f(this);
                return objF == objE ? objE : objF;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f162392f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, PensionerCardData>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ps2.k.DataSet O(PensionerCardData pensionerCardData, List list, String str, w wVar, ps2.k kVar) {
            return new ps2.k.DataSet(pensionerCardData, iq0.q.a(list, rq0.c.ZUS_VISIT), str, wVar.y9(pensionerCardData));
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00ee  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar;
            final PensionerCardData pensionerCardData;
            int i15;
            w wVar;
            int i16;
            List list;
            Object objE;
            final List list2;
            final w wVar2;
            c0 c0Var = (c0) this.f162389m;
            Object objE2 = uq.b.e();
            int i17 = this.f162388l;
            if (i17 == 0) {
                oq.u.b(obj);
                ac4.a aVar = w.this.callActionWithLoaderUseCase;
                l0 l0VarB = g1.b();
                a aVar2 = new a(w.this, null);
                this.f162389m = c0Var;
                this.f162388l = 1;
                obj = aVar.b(l0VarB, aVar2, this);
                if (obj != objE2) {
                }
                return objE2;
            }
            if (i17 == 1) {
                oq.u.b(obj);
            } else {
                if (i17 == 2) {
                    int i18 = this.f162387k;
                    i16 = this.f162386j;
                    PensionerCardData pensionerCardData2 = (PensionerCardData) this.f162384g;
                    wVar = (w) this.f162383f;
                    iVar = (dx.i) this.f162382e;
                    oq.u.b(obj);
                    i15 = i18;
                    pensionerCardData = pensionerCardData2;
                    list = (List) obj;
                    ms2.a aVar3 = wVar.pensionerCardContainersInteractor;
                    this.f162389m = c0Var;
                    this.f162382e = vq.j.a(iVar);
                    this.f162383f = wVar;
                    this.f162384g = pensionerCardData;
                    this.f162385h = list;
                    this.f162386j = i16;
                    this.f162387k = i15;
                    this.f162388l = 3;
                    objE = aVar3.e(this);
                    if (objE != objE2) {
                        list2 = list;
                        obj = objE;
                        wVar2 = wVar;
                    }
                    return objE2;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.f162385h;
                pensionerCardData = (PensionerCardData) this.f162384g;
                wVar2 = (w) this.f162383f;
                oq.u.b(obj);
            }
            final String str = (String) ((dx.i) obj).a();
            return c0Var.d(new er.l() { // from class: ps2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.m.O(pensionerCardData, list2, str, wVar2, (k) obj2);
                }
            });
            iVar = (dx.i) obj;
            w wVar3 = w.this;
            if (iVar instanceof dx.i.Left) {
                wVar3.d9(new ShowError(new qs2.d.a.GetDocument((dx.b) ((dx.i.Left) iVar).b(), wVar3.b9(ps2.b.f162274a), wVar3.b9(ps2.a.f162272a))));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            pensionerCardData = (PensionerCardData) ((dx.i.Right) iVar).b();
            h64.r rVar = wVar3.loadServicesUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f162389m = c0Var;
            this.f162382e = vq.j.a(iVar);
            this.f162383f = wVar3;
            this.f162384g = pensionerCardData;
            i15 = 0;
            this.f162386j = 0;
            this.f162387k = 0;
            this.f162388l = 2;
            Object objC = rVar.c(c1792a, this);
            if (objC != objE2) {
                wVar = wVar3;
                obj = objC;
                i16 = 0;
                list = (List) obj;
                ms2.a aVar4 = wVar.pensionerCardContainersInteractor;
                this.f162389m = c0Var;
                this.f162382e = vq.j.a(iVar);
                this.f162383f = wVar;
                this.f162384g = pensionerCardData;
                this.f162385h = list;
                this.f162386j = i16;
                this.f162387k = i15;
                this.f162388l = 3;
                objE = aVar4.e(this);
                if (objE != objE2) {
                    list2 = list;
                    obj = objE;
                    wVar2 = wVar;
                    final String str2 = (String) ((dx.i) obj).a();
                    return c0Var.d(new er.l() { // from class: ps2.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.m.O(pensionerCardData, list2, str2, wVar2, (k) obj2);
                        }
                    });
                }
            }
            return objE2;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ps2.e eVar, c0<ps2.k> c0Var, tq.e<? super k10.l<? extends ps2.k>> eVar2) {
            m mVar = w.this.new m(eVar2);
            mVar.f162389m = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f162395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f162396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f162397h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f162398j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f162399k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f162400l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f162402n;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162400l = obj;
            this.f162402n |= PKIFailureInfo.systemUnavail;
            return w.this.J9(null, null, this);
        }
    }

    public w(yy.a aVar, mx.c cVar, ez.e eVar, i70.n nVar, qs2.g gVar, qs2.j jVar, qs2.d dVar, ac4.a aVar2, mz3.z zVar, mz3.w wVar, h64.r rVar, bv3.b bVar, ms2.a aVar3) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.snackBarManagerStateHolder = nVar;
        this.pensionerCardMapper = gVar;
        this.pensionerDialogMapper = jVar;
        this.pensionerCardErrorMapper = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar;
        this.loadServicesUseCase = rVar;
        this.documentCardVMSFactory = bVar;
        this.pensionerCardContainersInteractor = aVar3;
        this.stateMachine = aVar.a(ps2.k.b.f162292a, new er.l() { // from class: ps2.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.F9(this.f162302a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ps2.l.a A9(ps2.k state) {
        qs2.g gVar = this.pensionerCardMapper;
        er.a<i0> aVarB9 = b9(new GoToVerificationProcess(b9(new UpdatePensionerCard(mz3.z.b.UPDATE))));
        er.a<i0> aVarB10 = b9(ps2.g.f162284a);
        er.a<i0> aVarB11 = b9(a.f162272a);
        return gVar.b(new qs2.g.PensionerCardMapperParams(state, new er.l() { // from class: ps2.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.B9(this.f162303a, (mz3.z.b) obj);
            }
        }, aVarB9, b9(ps2.d.f162276a), aVarB10, aVarB11, new er.l() { // from class: ps2.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.C9(this.f162304a, (n20.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(w wVar, mz3.z.b bVar) {
        wVar.d9(new UpdatePensionerCard(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(w wVar, n20.a aVar) {
        wVar.d9(aVar);
        return i0.f148189a;
    }

    private final void E9(mz3.z.c result) {
        Label labelC;
        if (fr.t.c(result, mz3.z.c.a.f129731a)) {
            labelC = this.labelProvider.c(ks2.a.f112597b);
        } else {
            if (!(result instanceof mz3.z.c.UpdateStarted)) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(ks2.a.f112599d);
        }
        y(new p50.a.DefaultWithIcon(labelC, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(ps2.k.b.class), new er.l() { // from class: ps2.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.G9(this.f162305a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ps2.k.DataSet.class), new er.l() { // from class: ps2.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.H9(this.f162306a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ps2.k.class), new er.l() { // from class: ps2.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.I9(this.f162307a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(w wVar, k10.z zVar) {
        zVar.C(wVar.new c(null));
        d dVar = wVar.new d(null);
        zVar.x(q0.c(ps2.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(w wVar, k10.z zVar) {
        e eVar = wVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(GoToVerificationProcess.class), oVar, eVar);
        zVar.x(q0.c(UpdatePensionerCard.class), oVar, wVar.new f(null));
        zVar.x(q0.c(ps2.b.class), oVar, wVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(w wVar, k10.z zVar) {
        h hVar = wVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ps2.g.class), oVar, hVar);
        zVar.x(q0.c(ShowPensionerDialog.class), oVar, wVar.new i(null));
        zVar.x(q0.c(ShowError.class), oVar, wVar.new j(null));
        zVar.x(q0.c(ps2.d.class), oVar, wVar.new k(null));
        zVar.x(q0.c(a.class), oVar, wVar.new l(null));
        zVar.v(q0.c(ps2.e.class), oVar, wVar.new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        if (F(r11, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0175, code lost:
    
        if (r9.F(r11, r2) == r3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J9(mz3.z.b r17, java.lang.String r18, tq.e<? super oq.i0> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.w.J9(mz3.z$b, java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bv3.a y9(PensionerCardData data) {
        bv3.c.e notValid;
        Label labelB;
        bv3.b bVar = this.documentCardVMSFactory;
        List listQ = pq.v.q(new bv3.c.InterfaceC0572c.Flag(bv3.c.a.Poland, this.labelProvider.c(ks2.a.f112600e)), bv3.c.InterfaceC0572c.b.f21778a);
        String backgroundId = o20.p.z.f140976c.getBackgroundId();
        b0 b0VarB = ry.a.b(iy.c0.g(data.getScope().getData().getPhoto()));
        boolean zE = data.getStatus().e();
        if (zE) {
            notValid = new bv3.c.e.Valid(this.labelProvider.c(ks2.a.f112605j));
        } else {
            if (zE) {
                throw new oq.p();
            }
            notValid = new bv3.c.e.NotValid(this.labelProvider.c(ks2.a.f112602g));
        }
        bv3.c.e eVar = notValid;
        bv3.c.KeyValueItem keyValueItem = new bv3.c.KeyValueItem(K9(mx.b.d(data.getScope().getData().getNames(), ""), ks2.a.f112606k), this.labelProvider.c(ks2.a.f112606k), false, 4, null);
        bv3.c.KeyValueItem keyValueItem2 = new bv3.c.KeyValueItem(K9(mx.b.d(data.getScope().getData().getLastName(), ""), ks2.a.f112608m), this.labelProvider.c(ks2.a.f112608m), false, 4, null);
        bv3.c.KeyValueItem keyValueItem3 = new bv3.c.KeyValueItem(K9(mx.b.d(data.getScope().getData().getPesel(), ""), ks2.a.f112607l), this.labelProvider.c(ks2.a.f112607l), true);
        String type = data.getScope().getData().getType();
        bv3.c.KeyValueItem keyValueItem4 = new bv3.c.KeyValueItem(K9(mx.b.d(type != null ? type.toUpperCase(Locale.ROOT) : null, ""), ks2.a.f112619x), this.labelProvider.c(ks2.a.f112619x), false, 4, null);
        bv3.c.KeyValueItem keyValueItem5 = new bv3.c.KeyValueItem(K9(mx.b.d(data.getScope().getData().getNumber(), ""), ks2.a.f112614s), this.labelProvider.c(ks2.a.f112614s), true);
        Date expiredDate = data.getScope().getData().getExpiredDate();
        if (expiredDate == null || (labelB = K9(mx.b.b(this.dateFormatter.d(new fz.b.Date(expiredDate), fz.c.DOTTED), "expiredData"), ks2.a.f112615t)) == null) {
            labelB = mx.b.b(this.labelProvider.c(ks2.a.f112616u).getText().toUpperCase(Locale.ROOT), "indefinite");
        }
        return bVar.a(new bv3.c(listQ, backgroundId, b0VarB, eVar, null, pq.v.q(keyValueItem, keyValueItem2, keyValueItem3, keyValueItem4, keyValueItem5, new bv3.c.KeyValueItem(labelB, this.labelProvider.c(ks2.a.f112615t), false, 4, null)), 16, null));
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ps2.l.a aVar) {
        super.P5(aVar);
    }

    public final Label K9(Label label, int i15) {
        return Label.f(this.labelProvider.b(label.getText(), i15), "Value", null, 2, null);
    }

    @Override // zx.b
    public xw.b<ps2.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ps2.k, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ps2.l.a> getState() {
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

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ps2.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }
}
