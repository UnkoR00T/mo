package l62;

import j62.FamilyCardData;
import j62.FamilyCardFullData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007B\u0081\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b.\u0010)J\u001d\u00101\u001a\u0002002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b1\u00102J \u00107\u001a\u0004\u0018\u000106*\u0002032\b\u00105\u001a\u0004\u0018\u000104H\u0082@¢\u0006\u0004\b7\u00108J\"\u0010<\u001a\u00020'2\b\u00109\u001a\u0004\u0018\u0001042\u0006\u0010;\u001a\u00020:H\u0082@¢\u0006\u0004\b<\u0010=J0\u0010C\u001a\u001a\u0012\u0004\u0012\u00020@\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020B0A0?2\u0006\u0010>\u001a\u000203H\u0082@¢\u0006\u0004\bC\u0010DJ \u0010F\u001a\u00020'2\u0006\u0010E\u001a\u00020@2\u0006\u0010;\u001a\u00020:H\u0082@¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020'2\u0006\u0010E\u001a\u00020@H\u0082@¢\u0006\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR \u0010t\u001a\b\u0012\u0004\u0012\u00020o0n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR,\u0010z\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040u8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR \u0010/\u001a\b\u0012\u0004\u0012\u0002000{8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u001e\u0010\u0083\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bX\u0010\u0082\u0001¨\u0006\u0084\u0001"}, d2 = {"Ll62/p0;", "Ll00/g;", "Ln20/b;", "Ll62/n;", "Ln20/a;", "Ll62/o;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lm62/p;", "familyCardDocumentMapper", "Lm62/b;", "familyCardDialogMapper", "Lib4/c;", "errorMapper", "Lc54/b;", "isFeatureEnabledUseCase", "La14/w;", "openUrlIntentUseCase", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lo20/t2$a;", "deps", "Lmx/c;", "labelProvider", "snackBarManagerStateHolder", "Lu04/a;", "commonEndpoints", "Lwz/a;", "barcodeGenerator", "Li62/a;", "familyCardContainersInteractor", "<init>", "(Ln20/j;Lac4/a;Lm62/p;Lm62/b;Lib4/c;Lc54/b;La14/w;Lmz3/z;Lmz3/w;Lo20/t2$a;Lmx/c;Li70/n;Lu04/a;Lwz/a;Li62/a;)V", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "state", "Ll62/o$a;", "P9", "(Ln20/b;)Ll62/o$a;", "Lj62/f;", "", "documentShortName", "Ll62/n$a;", "Y9", "(Lj62/f;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentId", "Lmz3/z$b;", "updateMethodType", "ea", "(Ljava/lang/String;Lmz3/z$b;Ltq/e;)Ljava/lang/Object;", "cards", "Ldx/i;", "Ldx/b;", "", "Landroid/graphics/Bitmap;", "K9", "(Lj62/f;Ltq/e;)Ljava/lang/Object;", "domainError", "N9", "(Ldx/b;Lmz3/z$b;Ltq/e;)Ljava/lang/Object;", "L9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lac4/a;", "c", "Lm62/p;", "d", "Lm62/b;", "e", "Lib4/c;", "f", "Lc54/b;", "g", "La14/w;", "h", "Lmz3/z;", "j", "Lmz3/w;", "k", "Lo20/t2$a;", "l", "Lmx/c;", "m", "Li70/n;", "n", "Lu04/a;", "p", "Lwz/a;", "q", "Li62/a;", "Lrq0/b$d;", "r", "Lrq0/b$d;", "documentType", "Ll62/n$b;", "s", "Ll62/n$b;", "initialState", "Lxw/b;", "Ll62/i;", "t", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 extends l00.g<State<l62.n>, n20.a> implements l62.o, zx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m62.p familyCardDocumentMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m62.b familyCardDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final i62.a familyCardContainersInteractor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final rq0.b.d documentType = rq0.b.d.FAMILY_CARD;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final l62.n.b initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l62.i> navAction;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<l62.n>, n20.a> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<l62.o.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116581h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f116582j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f116583k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f116584l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f116585m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f116586n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f116587p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f116588q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f116589r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f116590s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f116591t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f116592v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f116593w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f116594x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f116595y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f116596z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return p0.this.K9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116599f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116600g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f116601h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f116603k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116601h = obj;
            this.f116603k |= PKIFailureInfo.systemUnavail;
            return p0.this.Y9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<l62.o.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f116604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f116605b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f116606a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f116607b;

            /* JADX INFO: renamed from: l62.p0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2821a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f116608d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f116609e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f116610f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f116612h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f116613j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f116614k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f116615l;

                public C2821a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f116608d = obj;
                    this.f116609e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p0 p0Var) {
                this.f116606a = hVar;
                this.f116607b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2821a c2821a;
                if (eVar instanceof C2821a) {
                    c2821a = (C2821a) eVar;
                    int i15 = c2821a.f116609e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2821a.f116609e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2821a = new C2821a(eVar);
                    }
                } else {
                    c2821a = new C2821a(eVar);
                }
                Object obj2 = c2821a.f116608d;
                Object objE = uq.b.e();
                int i16 = c2821a.f116609e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f116606a;
                    l62.o.a aVarP9 = this.f116607b.P9((State) obj);
                    c2821a.f116610f = vq.j.a(obj);
                    c2821a.f116612h = vq.j.a(c2821a);
                    c2821a.f116613j = vq.j.a(obj);
                    c2821a.f116614k = vq.j.a(hVar);
                    c2821a.f116615l = 0;
                    c2821a.f116609e = 1;
                    if (hVar.F(aVarP9, c2821a) == objE) {
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

        public c(mu.g gVar, p0 p0Var) {
            this.f116604a = gVar;
            this.f116605b = p0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super l62.o.a> hVar, tq.e eVar) {
            Object objA = this.f116604a.a(new a(hVar, this.f116605b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll62/n$b;", "it", "Loq/i0;", "<anonymous>", "(Ll62/n$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<l62.n.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116616e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
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
                int r1 = r6.f116616e
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                oq.u.b(r7)
                goto L70
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L3b
            L1e:
                oq.u.b(r7)
                l62.p0 r7 = l62.p0.this
                mz3.w r7 = l62.p0.D9(r7)
                mz3.w$a r1 = new mz3.w$a
                l62.p0 r4 = l62.p0.this
                rq0.b$d r4 = l62.p0.z9(r4)
                r1.<init>(r4)
                r6.f116616e = r2
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L3b
                goto L60
            L3b:
                mz3.w$b r7 = (mz3.w.b) r7
                boolean r1 = r7 instanceof mz3.w.b.NotReady
                if (r1 == 0) goto L61
                l62.p0 r7 = l62.p0.this
                xw.b r7 = r7.Y1()
                l62.i$d r1 = new l62.i$d
                gv3.b$b r2 = new gv3.b$b
                l62.p0 r4 = l62.p0.this
                rq0.b$d r4 = l62.p0.z9(r4)
                r5 = 0
                r2.<init>(r4, r5, r3, r5)
                r1.<init>(r2)
                r6.f116616e = r3
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto L70
            L60:
                return r0
            L61:
                mz3.w$b$b r0 = mz3.w.b.C3231b.f129717a
                boolean r7 = fr.t.c(r7, r0)
                if (r7 == 0) goto L73
                l62.p0 r7 = l62.p0.this
                l62.h r0 = l62.h.f116521a
                l62.p0.v9(r7, r0)
            L70:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L73:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l62.p0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(l62.n.b bVar, tq.e<? super oq.i0> eVar) {
            return ((d) v(bVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return p0.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll62/f;", "<unused var>", "Ll62/n$b;", "Loq/i0;", "<anonymous>", "(Ll62/f;Ll62/n$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<l62.f, l62.n.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116618e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f116618e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l62.i> bVarY1 = p0.this.Y1();
                l62.i.b bVar = l62.i.b.f116524a;
                this.f116618e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(l62.f fVar, l62.n.b bVar, tq.e<? super oq.i0> eVar) {
            return p0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll62/e;", "<unused var>", "Ll62/n$b;", "Loq/i0;", "<anonymous>", "(Ll62/e;Ll62/n$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<l62.e, l62.n.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116620e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f116622e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f116623f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f116623f = p0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f116622e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                i62.a aVar = this.f116623f.familyCardContainersInteractor;
                this.f116622e = 1;
                Object objB = aVar.b(null, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f116623f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
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
                int r1 = r10.f116620e
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
                l62.p0 r11 = l62.p0.this
                ac4.a r4 = l62.p0.x9(r11)
                l62.p0$f$a r6 = new l62.p0$f$a
                l62.p0 r11 = l62.p0.this
                r1 = 0
                r6.<init>(r11, r1)
                r10.f116620e = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L3e
                goto L4e
            L3e:
                l62.p0 r11 = l62.p0.this
                xw.b r11 = r11.Y1()
                l62.i$b r1 = l62.i.b.f116524a
                r7.f116620e = r2
                java.lang.Object r11 = r11.F(r1, r10)
                if (r11 != r0) goto L4f
            L4e:
                return r0
            L4f:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: l62.p0.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l62.e eVar, l62.n.b bVar, tq.e<? super oq.i0> eVar2) {
            return p0.this.new f(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll62/c;", "event", "Lk10/c0;", "Ll62/n$a;", "state", "Lk10/l;", "Ll62/n;", "<anonymous>", "(Ll62/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ChangeSwitchItem, k10.c0<l62.n.DataLoaded>, tq.e<? super k10.l<? extends l62.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116626g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l62.n.DataLoaded O(ChangeSwitchItem changeSwitchItem, l62.n.DataLoaded dataLoaded) {
            return l62.n.DataLoaded.b(dataLoaded, null, null, null, changeSwitchItem.getNewItem(), false, false, null, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeSwitchItem changeSwitchItem = (ChangeSwitchItem) this.f116625f;
            k10.c0 c0Var = (k10.c0) this.f116626g;
            uq.b.e();
            if (this.f116624e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l62.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.g.O(changeSwitchItem, (n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeSwitchItem changeSwitchItem, k10.c0<l62.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends l62.n>> eVar) {
            g gVar = new g(eVar);
            gVar.f116625f = changeSwitchItem;
            gVar.f116626g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll62/f;", "<unused var>", "Lk10/c0;", "Ll62/n$a;", "state", "Lk10/l;", "Ll62/n;", "<anonymous>", "(Ll62/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<l62.f, k10.c0<l62.n.DataLoaded>, tq.e<? super k10.l<? extends l62.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116628f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l62.n.DataLoaded V(l62.n.DataLoaded dataLoaded) {
            return l62.n.DataLoaded.b(dataLoaded, null, null, null, null, false, false, null, null, 223, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l62.n.DataLoaded X(k10.c0 c0Var, l62.n.DataLoaded dataLoaded) {
            return l62.n.DataLoaded.b(dataLoaded, null, null, ((l62.n.DataLoaded) c0Var.a()).getOwnCard(), null, false, false, null, null, 251, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f116628f;
            Object objE = uq.b.e();
            int i15 = this.f116627e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (((l62.n.DataLoaded) c0Var.a()).getIsBottomSheetVisible()) {
                    return c0Var.b(new er.l() { // from class: l62.r0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.h.V((n.DataLoaded) obj2);
                        }
                    });
                }
                boolean zG = ((l62.n.DataLoaded) c0Var.a()).getSelectedCard().getScope().getData().g();
                if (!zG) {
                    if (zG) {
                        throw new oq.p();
                    }
                    return c0Var.b(new er.l() { // from class: l62.s0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.h.X(c0Var, (n.DataLoaded) obj2);
                        }
                    });
                }
                xw.b<l62.i> bVarY1 = p0.this.Y1();
                l62.i.b bVar = l62.i.b.f116524a;
                this.f116628f = c0Var;
                this.f116627e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(l62.f fVar, k10.c0<l62.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends l62.n>> eVar) {
            h hVar = p0.this.new h(eVar);
            hVar.f116628f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll62/e;", "<unused var>", "Ll62/n$a;", "state", "Loq/i0;", "<anonymous>", "(Ll62/e;Ll62/n$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<l62.e, l62.n.DataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116631f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f116633e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f116634f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l62.n.DataLoaded f116635g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, l62.n.DataLoaded dataLoaded, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f116634f = p0Var;
                this.f116635g = dataLoaded;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f116633e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                i62.a aVar = this.f116634f.familyCardContainersInteractor;
                String parentId = this.f116635g.getFamilyCardData().getParentId();
                this.f116633e = 1;
                Object objB = aVar.b(parentId, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f116634f, this.f116635g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
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
                java.lang.Object r0 = r11.f116631f
                l62.n$a r0 = (l62.n.DataLoaded) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f116630e
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
                l62.p0 r12 = l62.p0.this
                ac4.a r5 = l62.p0.x9(r12)
                l62.p0$i$a r7 = new l62.p0$i$a
                l62.p0 r12 = l62.p0.this
                r2 = 0
                r7.<init>(r12, r0, r2)
                java.lang.Object r12 = vq.j.a(r0)
                r11.f116631f = r12
                r11.f116630e = r4
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r1) goto L48
                goto L5e
            L48:
                l62.p0 r12 = l62.p0.this
                xw.b r12 = r12.Y1()
                l62.i$b r2 = l62.i.b.f116524a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f116631f = r0
                r8.f116630e = r3
                java.lang.Object r12 = r12.F(r2, r11)
                if (r12 != r1) goto L5f
            L5e:
                return r1
            L5f:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: l62.p0.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l62.e eVar, l62.n.DataLoaded dataLoaded, tq.e<? super oq.i0> eVar2) {
            i iVar = p0.this.new i(eVar2);
            iVar.f116631f = dataLoaded;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll62/b;", "event", "Lk10/c0;", "Ll62/n$a;", "state", "Lk10/l;", "Ll62/n;", "<anonymous>", "(Ll62/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ChangeCard, k10.c0<l62.n.DataLoaded>, tq.e<? super k10.l<? extends l62.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116638g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l62.n.DataLoaded O(ChangeCard changeCard, l62.n.DataLoaded dataLoaded) {
            return l62.n.DataLoaded.b(dataLoaded, null, null, changeCard.getCard(), null, false, false, null, null, 251, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeCard changeCard = (ChangeCard) this.f116637f;
            k10.c0 c0Var = (k10.c0) this.f116638g;
            uq.b.e();
            if (this.f116636e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l62.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.j.O(changeCard, (n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeCard changeCard, k10.c0<l62.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends l62.n>> eVar) {
            j jVar = new j(eVar);
            jVar.f116637f = changeCard;
            jVar.f116638g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll62/d;", "<unused var>", "Lk10/c0;", "Ll62/n$a;", "state", "Lk10/l;", "Ll62/n;", "<anonymous>", "(Ll62/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<l62.d, k10.c0<l62.n.DataLoaded>, tq.e<? super k10.l<? extends l62.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116640f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l62.n.DataLoaded O(l62.n.DataLoaded dataLoaded) {
            return l62.n.DataLoaded.b(dataLoaded, null, null, null, null, false, false, null, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f116640f;
            uq.b.e();
            if (this.f116639e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l62.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.k.O((n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l62.d dVar, k10.c0<l62.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends l62.n>> eVar) {
            k kVar = new k(eVar);
            kVar.f116640f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll62/m;", "event", "Ll62/n$a;", "state", "Loq/i0;", "<anonymous>", "(Ll62/m;Ll62/n$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<UpdateDocument, l62.n.DataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116643g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            UpdateDocument updateDocument = (UpdateDocument) this.f116642f;
            l62.n.DataLoaded dataLoaded = (l62.n.DataLoaded) this.f116643g;
            Object objE = uq.b.e();
            int i15 = this.f116641e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.z.b updateMethodType = updateDocument.getUpdateMethodType();
                String parentId = dataLoaded.getFamilyCardData().getParentId();
                p0 p0Var = p0.this;
                this.f116642f = vq.j.a(updateDocument);
                this.f116643g = vq.j.a(dataLoaded);
                this.f116641e = 1;
                if (p0Var.ea(parentId, updateMethodType, this) == objE) {
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
        public final Object w(UpdateDocument updateDocument, l62.n.DataLoaded dataLoaded, tq.e<? super oq.i0> eVar) {
            l lVar = p0.this.new l(eVar);
            lVar.f116642f = updateDocument;
            lVar.f116643g = dataLoaded;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll62/j;", "<unused var>", "Ll62/n$a;", "Loq/i0;", "<anonymous>", "(Ll62/j;Ll62/n$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<l62.j, l62.n.DataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116645e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f116645e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = p0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(p0.this.commonEndpoints.y(), false, 2, null);
                this.f116645e = 1;
                obj = wVar.c(params, this);
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
            p0 p0Var = p0.this;
            if (iVar instanceof dx.i.Left) {
                p0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(oq.i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l62.j jVar, l62.n.DataLoaded dataLoaded, tq.e<? super oq.i0> eVar) {
            return p0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll62/g;", "event", "Ll62/n$a;", "state", "Loq/i0;", "<anonymous>", "(Ll62/g;Ll62/n$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<GoToVerificationProcess, l62.n.DataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116649g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        
            if (r9.F(r3, r8) == r2) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
        
            if (r9.F(r3, r8) == r2) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
        
            return r2;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f116648f
                l62.g r0 = (l62.GoToVerificationProcess) r0
                java.lang.Object r1 = r8.f116649g
                l62.n$a r1 = (l62.n.DataLoaded) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f116647e
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L24
                if (r3 == r5) goto L1f
                if (r3 != r4) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                oq.u.b(r9)
                goto La0
            L24:
                oq.u.b(r9)
                l62.p0 r9 = l62.p0.this
                c54.b r9 = l62.p0.F9(r9)
                b54.c r3 = b54.c.ALERT_ON_VERIFICATION
                java.lang.Object r9 = r9.a(r3)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L7c
                j62.e r9 = r1.getSelectedCard()
                j62.c r9 = r9.getDocumentStatus()
                boolean r9 = r9.e()
                if (r9 != 0) goto L7c
                l62.p0 r9 = l62.p0.this
                xw.b r9 = r9.Y1()
                l62.i$e r3 = new l62.i$e
                l62.p0 r4 = l62.p0.this
                m62.b r4 = l62.p0.B9(r4)
                m62.c$a r6 = new m62.c$a
                er.a r7 = r0.b()
                r6.<init>(r7)
                cb4.d r4 = r4.b(r6)
                r3.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f116648f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r8.f116649g = r0
                r8.f116647e = r5
                java.lang.Object r9 = r9.F(r3, r8)
                if (r9 != r2) goto La0
                goto L9f
            L7c:
                l62.p0 r9 = l62.p0.this
                xw.b r9 = r9.Y1()
                l62.i$c r3 = new l62.i$c
                java.lang.String r5 = r0.getCardNumber()
                r3.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f116648f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r8.f116649g = r0
                r8.f116647e = r4
                java.lang.Object r9 = r9.F(r3, r8)
                if (r9 != r2) goto La0
            L9f:
                return r2
            La0:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: l62.p0.n.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToVerificationProcess goToVerificationProcess, l62.n.DataLoaded dataLoaded, tq.e<? super oq.i0> eVar) {
            n nVar = p0.this.new n(eVar);
            nVar.f116648f = goToVerificationProcess;
            nVar.f116649g = dataLoaded;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll62/a;", "action", "Lk10/c0;", "Ll62/n$a;", "state", "Lk10/l;", "Ll62/n;", "<anonymous>", "(Ll62/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ChangeBottomSheetVisibility, k10.c0<l62.n.DataLoaded>, tq.e<? super k10.l<? extends l62.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116653g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l62.n.DataLoaded O(ChangeBottomSheetVisibility changeBottomSheetVisibility, l62.n.DataLoaded dataLoaded) {
            return l62.n.DataLoaded.b(dataLoaded, null, null, null, null, false, changeBottomSheetVisibility.getVisible(), null, null, 223, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeBottomSheetVisibility changeBottomSheetVisibility = (ChangeBottomSheetVisibility) this.f116652f;
            k10.c0 c0Var = (k10.c0) this.f116653g;
            uq.b.e();
            if (this.f116651e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l62.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.o.O(changeBottomSheetVisibility, (n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeBottomSheetVisibility changeBottomSheetVisibility, k10.c0<l62.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends l62.n>> eVar) {
            o oVar = new o(eVar);
            oVar.f116652f = changeBottomSheetVisibility;
            oVar.f116653g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll62/k;", "<unused var>", "Ll62/n;", "Loq/i0;", "<anonymous>", "(Ll62/k;Ll62/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<l62.k, l62.n, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116656g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f116657h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f116658j;

        p(tq.e<? super p> eVar) {
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
                int r1 = r5.f116658j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f116655f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r5.f116654e
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
                l62.p0 r6 = l62.p0.this
                i62.a r6 = l62.p0.A9(r6)
                l62.p0 r1 = l62.p0.this
                l62.e r4 = l62.e.f116513a
                er.a r1 = l62.p0.u9(r1, r4)
                r5.f116658j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L40
                goto L6b
            L40:
                dx.i r6 = (dx.i) r6
                l62.p0 r1 = l62.p0.this
                boolean r3 = r6 instanceof dx.i.Right
                if (r3 == 0) goto L6c
                r3 = r6
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                l62.i$e r4 = new l62.i$e
                r4.<init>(r3)
                r5.f116654e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f116655f = r6
                r6 = 0
                r5.f116656g = r6
                r5.f116657h = r6
                r5.f116658j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L6c
            L6b:
                return r0
            L6c:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l62.p0.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l62.k kVar, l62.n nVar, tq.e<? super oq.i0> eVar) {
            return p0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll62/h;", "<unused var>", "Lk10/c0;", "Ll62/n;", "state", "Lk10/l;", "<anonymous>", "(Ll62/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<l62.h, k10.c0<l62.n>, tq.e<? super k10.l<? extends l62.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116661f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ll62/n;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends l62.n>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f116663e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f116664f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f116665g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f116666h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f116667j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f116668k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f116669l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ p0 f116670m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<l62.n> f116671n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, k10.c0<l62.n> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f116670m = p0Var;
                this.f116671n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final l62.n.DataLoaded V(l62.n.DataLoaded dataLoaded, l62.n nVar) {
                return dataLoaded;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                p0 p0Var;
                FamilyCardFullData familyCardFullData;
                int i15;
                k10.c0<l62.n> c0Var;
                int i16;
                k10.c0<l62.n> c0Var2;
                k10.c0<l62.n> c0Var3;
                Object objD;
                Object objE = uq.b.e();
                int i17 = this.f116669l;
                if (i17 == 0) {
                    oq.u.b(obj);
                    i62.a aVar = this.f116670m.familyCardContainersInteractor;
                    this.f116669l = 1;
                    obj = aVar.e(this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        c0Var2 = (k10.c0) this.f116664f;
                        oq.u.b(obj);
                        return c0Var2.c();
                    }
                    if (i17 == 3) {
                        i16 = this.f116668k;
                        i15 = this.f116667j;
                        familyCardFullData = (FamilyCardFullData) this.f116666h;
                        c0Var = (k10.c0) this.f116665g;
                        p0Var = (p0) this.f116664f;
                        iVar = (dx.i) this.f116663e;
                        oq.u.b(obj);
                        String str = (String) ((dx.i) obj).a();
                        this.f116663e = vq.j.a(iVar);
                        this.f116664f = c0Var;
                        this.f116665g = vq.j.a(familyCardFullData);
                        this.f116666h = vq.j.a(str);
                        this.f116667j = i15;
                        this.f116668k = i16;
                        this.f116669l = 4;
                        obj = p0Var.Y9(familyCardFullData, str, this);
                        if (obj != objE) {
                            c0Var3 = c0Var;
                        }
                        return objE;
                    }
                    if (i17 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var3 = (k10.c0) this.f116664f;
                    oq.u.b(obj);
                    final l62.n.DataLoaded dataLoaded = (l62.n.DataLoaded) obj;
                    return (dataLoaded != null || (objD = c0Var3.d(new er.l() { // from class: l62.w0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.q.a.V(dataLoaded, (n) obj2);
                        }
                    })) == null) ? c0Var3.c() : objD;
                }
                oq.u.b(obj);
                iVar = (dx.i) obj;
                p0Var = this.f116670m;
                k10.c0<l62.n> c0Var4 = this.f116671n;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    this.f116663e = vq.j.a(iVar);
                    this.f116664f = c0Var4;
                    this.f116665g = vq.j.a(bVar);
                    this.f116667j = 0;
                    this.f116668k = 0;
                    this.f116669l = 2;
                    if (p0Var.L9(bVar, this) != objE) {
                        c0Var2 = c0Var4;
                        return c0Var2.c();
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    familyCardFullData = (FamilyCardFullData) ((dx.i.Right) iVar).b();
                    i62.a aVar2 = p0Var.familyCardContainersInteractor;
                    this.f116663e = vq.j.a(iVar);
                    this.f116664f = p0Var;
                    this.f116665g = c0Var4;
                    this.f116666h = familyCardFullData;
                    this.f116667j = 0;
                    this.f116668k = 0;
                    this.f116669l = 3;
                    Object objD2 = aVar2.d(this);
                    if (objD2 != objE) {
                        i15 = 0;
                        c0Var = c0Var4;
                        obj = objD2;
                        i16 = 0;
                        String str2 = (String) ((dx.i) obj).a();
                        this.f116663e = vq.j.a(iVar);
                        this.f116664f = c0Var;
                        this.f116665g = vq.j.a(familyCardFullData);
                        this.f116666h = vq.j.a(str2);
                        this.f116667j = i15;
                        this.f116668k = i16;
                        this.f116669l = 4;
                        obj = p0Var.Y9(familyCardFullData, str2, this);
                        if (obj != objE) {
                            c0Var3 = c0Var;
                            final l62.n.DataLoaded dataLoaded2 = (l62.n.DataLoaded) obj;
                            if (dataLoaded2 != null) {
                            }
                        }
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f116670m, this.f116671n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends l62.n>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f116661f;
            Object objE = uq.b.e();
            int i15 = this.f116660e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p0.this, c0Var, null);
            this.f116661f = vq.j.a(c0Var);
            this.f116660e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l62.h hVar, k10.c0<l62.n> c0Var, tq.e<? super k10.l<? extends l62.n>> eVar) {
            q qVar = p0.this.new q(eVar);
            qVar.f116661f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll62/l;", "event", "Ll62/n;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ll62/l;Ll62/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ShowFamilyCardDialog, l62.n, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116673f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowFamilyCardDialog showFamilyCardDialog = (ShowFamilyCardDialog) this.f116673f;
            Object objE = uq.b.e();
            int i15 = this.f116672e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l62.i> bVarY1 = p0.this.Y1();
                l62.i.ShowDialog showDialog = new l62.i.ShowDialog(p0.this.familyCardDialogMapper.b(showFamilyCardDialog.getDialogType()));
                this.f116673f = vq.j.a(showFamilyCardDialog);
                this.f116672e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(ShowFamilyCardDialog showFamilyCardDialog, l62.n nVar, tq.e<? super oq.i0> eVar) {
            r rVar = p0.this.new r(eVar);
            rVar.f116673f = showFamilyCardDialog;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116677f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116678g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116679h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f116680j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f116681k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f116682l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f116684n;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116682l = obj;
            this.f116684n |= PKIFailureInfo.systemUnavail;
            return p0.this.ea(null, null, this);
        }
    }

    public p0(n20.j jVar, ac4.a aVar, m62.p pVar, m62.b bVar, ib4.c cVar, c54.b bVar2, a14.w wVar, mz3.z zVar, mz3.w wVar2, t2.a aVar2, mx.c cVar2, i70.n nVar, u04.a aVar3, wz.a aVar4, i62.a aVar5) {
        this.callActionWithLoaderUseCase = aVar;
        this.familyCardDocumentMapper = pVar;
        this.familyCardDialogMapper = bVar;
        this.errorMapper = cVar;
        this.isFeatureEnabledUseCase = bVar2;
        this.openUrlIntentUseCase = wVar;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar2;
        this.deps = aVar2;
        this.labelProvider = cVar2;
        this.snackBarManagerStateHolder = nVar;
        this.commonEndpoints = aVar3;
        this.barcodeGenerator = aVar4;
        this.familyCardContainersInteractor = aVar5;
        l62.n.b bVar3 = l62.n.b.f116545a;
        this.initialState = bVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(bVar3, new er.l() { // from class: l62.b0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.aa(this.f116509a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), l62.o.a.b.f116556a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7 A[Catch: Exception -> 0x0172, c -> 0x0174, CancellationException -> 0x0178, TryCatch #5 {c -> 0x0174, CancellationException -> 0x0178, Exception -> 0x0172, blocks: (B:31:0x0158, B:25:0x00d1, B:27:0x00d7, B:38:0x017c), top: B:59:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x014e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x008a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:15:0x008a */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x014e -> B:59:0x0158). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object K9(j62.FamilyCardFullData r25, tq.e<? super dx.i<? extends dx.b, ? extends java.util.Map<java.lang.String, android.graphics.Bitmap>>> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l62.p0.K9(j62.f, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L9(dx.b bVar, tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new l62.i.Error(this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: l62.f0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.M9(this.f116517a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(p0 p0Var, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            p0Var.d9(l62.e.f116513a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new oq.p();
            }
            p0Var.d9(l62.f.f116516a);
        }
        return oq.i0.f148189a;
    }

    private final Object N9(dx.b bVar, final mz3.z.b bVar2, tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new l62.i.Error(this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: l62.e0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.O9(this.f116514a, bVar2, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(p0 p0Var, mz3.z.b bVar, ib4.c.b bVar2) {
        if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            p0Var.d9(new UpdateDocument(bVar));
        } else if (!(bVar2 instanceof ib4.c.b.AbstractC2161b.a) && !(bVar2 instanceof ib4.c.b.a.Close) && !(bVar2 instanceof ib4.c.b.a.Primary) && !(bVar2 instanceof ib4.c.b.a.Secondary)) {
            throw new oq.p();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l62.o.a P9(State<l62.n> state) {
        return this.familyCardDocumentMapper.b(new m62.p.Params(state, new er.l() { // from class: l62.j0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Q9(this.f116530a, (String) obj);
            }
        }, new er.a() { // from class: l62.k0
            @Override // er.a
            public final Object a() {
                return p0.R9(this.f116532a);
            }
        }, new er.l() { // from class: l62.l0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.S9(this.f116534a, (mz3.z.b) obj);
            }
        }, b9(l62.k.f116531a), b9(l62.f.f116516a), b9(l62.d.f116512a), new er.l() { // from class: l62.m0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.T9(this.f116536a, (n20.a) obj);
            }
        }, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), new er.l() { // from class: l62.n0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.U9(this.f116546a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: l62.o0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.V9(this.f116557a, (FamilyCardData) obj);
            }
        }, new er.l() { // from class: l62.c0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.W9(this.f116511a, ((Boolean) obj).booleanValue());
            }
        }, new er.a() { // from class: l62.d0
            @Override // er.a
            public final Object a() {
                return p0.X9();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(p0 p0Var, String str) {
        p0Var.d9(new GoToVerificationProcess(str, p0Var.b9(new UpdateDocument(mz3.z.b.UPDATE))));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(p0 p0Var) {
        p0Var.d9(l62.j.f116529a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(p0 p0Var, mz3.z.b bVar) {
        p0Var.d9(new UpdateDocument(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(p0 p0Var, n20.a aVar) {
        p0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(p0 p0Var, y30.n.Switch.EnumC5973b enumC5973b) {
        p0Var.d9(new ChangeSwitchItem(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(p0 p0Var, FamilyCardData familyCardData) {
        p0Var.d9(new ChangeCard(familyCardData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(p0 p0Var, boolean z15) {
        p0Var.d9(new ChangeBottomSheetVisibility(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object Y9(FamilyCardFullData familyCardFullData, String str, tq.e<? super l62.n.DataLoaded> eVar) throws Throwable {
        b bVar;
        Object next;
        FamilyCardData familyCardData;
        String str2;
        FamilyCardFullData familyCardFullData2 = familyCardFullData;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f116603k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f116603k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f116601h;
        Object objE = uq.b.e();
        int i16 = bVar.f116603k;
        if (i16 == 0) {
            oq.u.b(obj);
            Iterator<T> it = familyCardFullData2.c().values().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((FamilyCardData) next).getScope().getData().g());
            FamilyCardData familyCardData2 = (FamilyCardData) next;
            if (familyCardData2 == null) {
                return null;
            }
            bVar.f116597d = familyCardFullData2;
            bVar.f116598e = str;
            bVar.f116599f = familyCardData2;
            bVar.f116600g = 0;
            bVar.f116603k = 1;
            Object objK9 = K9(familyCardFullData2, bVar);
            if (objK9 == objE) {
                return objE;
            }
            familyCardData = familyCardData2;
            obj = objK9;
            str2 = str;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FamilyCardData familyCardData3 = (FamilyCardData) bVar.f116599f;
            String str3 = (String) bVar.f116598e;
            FamilyCardFullData familyCardFullData3 = (FamilyCardFullData) bVar.f116597d;
            oq.u.b(obj);
            familyCardData = familyCardData3;
            familyCardFullData2 = familyCardFullData3;
            str2 = str3;
        }
        Map map = (Map) ((dx.i) obj).a();
        if (map == null) {
            return null;
        }
        Map<String, FamilyCardData> mapC = familyCardFullData2.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, FamilyCardData> entry : mapC.entrySet()) {
            if (!entry.getValue().getScope().getData().g()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new l62.n.DataLoaded(FamilyCardFullData.b(familyCardFullData2, null, linkedHashMap, 1, null), familyCardData, familyCardData, y30.n.Switch.EnumC5973b.LEFT, false, false, str2, map, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(final p0 p0Var, k10.v vVar) {
        vVar.c(fr.q0.c(l62.n.b.class), new er.l() { // from class: l62.g0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ba(this.f116520a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(l62.n.DataLoaded.class), new er.l() { // from class: l62.h0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ca(this.f116522a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(l62.n.class), new er.l() { // from class: l62.i0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.da(this.f116528a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(p0 p0Var, k10.z zVar) {
        zVar.C(p0Var.new d(null));
        e eVar = p0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(l62.f.class), oVar, eVar);
        zVar.x(fr.q0.c(l62.e.class), oVar, p0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(p0 p0Var, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ChangeSwitchItem.class), oVar, gVar);
        zVar.v(fr.q0.c(l62.f.class), oVar, p0Var.new h(null));
        zVar.x(fr.q0.c(l62.e.class), oVar, p0Var.new i(null));
        zVar.v(fr.q0.c(ChangeCard.class), oVar, new j(null));
        zVar.v(fr.q0.c(l62.d.class), oVar, new k(null));
        zVar.x(fr.q0.c(UpdateDocument.class), oVar, p0Var.new l(null));
        zVar.x(fr.q0.c(l62.j.class), oVar, p0Var.new m(null));
        zVar.x(fr.q0.c(GoToVerificationProcess.class), oVar, p0Var.new n(null));
        zVar.v(fr.q0.c(ChangeBottomSheetVisibility.class), oVar, new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(p0 p0Var, k10.z zVar) {
        p pVar = p0Var.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(l62.k.class), oVar, pVar);
        zVar.v(fr.q0.c(l62.h.class), oVar, p0Var.new q(null));
        zVar.x(fr.q0.c(ShowFamilyCardDialog.class), oVar, p0Var.new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        if (F(r6, r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:
    
        if (N9(r8, r10, r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a3, code lost:
    
        if (r6.F(r7, r2) == r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ea(java.lang.String r21, mz3.z.b r22, tq.e<? super oq.i0> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l62.p0.ea(java.lang.String, mz3.z$b, tq.e):java.lang.Object");
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(l62.i iVar, tq.e<? super oq.i0> eVar) {
        return super.F(iVar, eVar);
    }

    @Override // l62.o
    public void P() {
        d9(l62.f.f116516a);
    }

    @Override // zx.b
    public xw.b<l62.i> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // l00.g
    protected k10.t<State<l62.n>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<l62.o.a> getState() {
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
