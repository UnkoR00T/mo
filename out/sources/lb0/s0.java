package lb0;

import android.graphics.Bitmap;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vf0.MainDocumentPhotoData;
import xf0.DrivingLicenceDocument;
import xf0.DrivingLicenceScope;
import xf0.MnemonicHeaderContainerDL;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u0080\u0001B\u009b\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0001\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020.2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b/\u00100J+\u00108\u001a\u0002072\u0006\u00102\u001a\u0002012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u0002072\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0018\u0010A\u001a\u0002052\u0006\u0010@\u001a\u00020?H\u0096\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u000205H\u0096\u0001¢\u0006\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR \u0010q\u001a\b\u0012\u0004\u0012\u00020l0k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR,\u0010w\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR \u0010-\u001a\b\u0012\u0004\u0012\u00020.0x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010y\u001a\u0004\bz\u0010{R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020}0|8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010~¨\u0006\u0081\u0001"}, d2 = {"Llb0/s0;", "Ll00/g;", "Ln20/b;", "Llb0/m;", "Ln20/a;", "Llb0/n;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Leg0/f;", "getDrivingLicenceUC", "Leg0/j;", "getPhotoFromMainDocumentUC", "Lkb0/f;", "drivingLicenceMapper", "Lkb0/i;", "verificationDataMapper", "Lb00/c;", "imageConverter", "Lo20/t2$a;", "deps", "Leg0/d;", "deleteDocumentByIDUC", "Lac4/a;", "callActionWithLoaderUseCase", "Ldf0/n;", "requestDocumentUpdateUC", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVmsFactory", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lmx/c;", "labelProvider", "Lib0/a;", "defineMainDrivingLicenceUC", "Lib4/c;", "genericDomainErrorMapper", "Llb0/s0$a$a;", "setupData", "<init>", "(Ln20/j;Leg0/f;Leg0/j;Lkb0/f;Lkb0/i;Lb00/c;Lo20/t2$a;Leg0/d;Lac4/a;Ldf0/n;Lhb4/d;Lcb4/j;La14/w;Li70/n;Lmx/c;Lib0/a;Lib4/c;Llb0/s0$a$a;)V", "state", "Llb0/n$a;", "R9", "(Ln20/b;)Llb0/n$a;", "Ldx/b;", "domainError", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "Ljb4/b;", "O9", "(Ldx/b;Ler/l;)Ljb4/b;", "P9", "(Ldx/b;)Ljb4/b;", "Ldx/b$c;", "N9", "()Ldx/b$c;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Leg0/f;", "c", "Leg0/j;", "d", "Lkb0/f;", "e", "Lkb0/i;", "f", "Lb00/c;", "g", "Lo20/t2$a;", "h", "Leg0/d;", "j", "Lac4/a;", "k", "Ldf0/n;", "l", "Lhb4/d;", "m", "Lcb4/j;", "n", "La14/w;", "p", "Li70/n;", "q", "Lmx/c;", "r", "Lib0/a;", "s", "Lib4/c;", "t", "Llb0/s0$a$a;", "Llb0/m$f;", "v", "Llb0/m$f;", "initialState", "Lxw/b;", "Llb0/h;", "w", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 extends l00.g<State<lb0.m>, n20.a> implements lb0.n, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eg0.f getDrivingLicenceUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final eg0.j getPhotoFromMainDocumentUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kb0.f drivingLicenceMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final kb0.i verificationDataMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final eg0.d deleteDocumentByIDUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final df0.n requestDocumentUpdateUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVmsFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final ib0.a defineMainDrivingLicenceUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final lb0.m.Initial initialState;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lb0.h> navAction;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<lb0.m>, n20.a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<lb0.n.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Llb0/s0$a;", "Lf00/j0;", "Llb0/s0$a$a;", "Llb0/s0;", "a", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<SetupData, s0> {

        /* JADX INFO: renamed from: lb0.s0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Llb0/s0$a$a;", "", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            public SetupData(String str) {
                this.documentId = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupData) && fr.t.c(this.documentId, ((SetupData) other).documentId);
            }

            public int hashCode() {
                String str = this.documentId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetupData(documentId=" + this.documentId + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<lb0.n.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f117570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0 f117571b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f117572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s0 f117573b;

            /* JADX INFO: renamed from: lb0.s0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2853a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f117574d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f117575e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f117576f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f117578h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f117579j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f117580k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f117581l;

                public C2853a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f117574d = obj;
                    this.f117575e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s0 s0Var) {
                this.f117572a = hVar;
                this.f117573b = s0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2853a c2853a;
                if (eVar instanceof C2853a) {
                    c2853a = (C2853a) eVar;
                    int i15 = c2853a.f117575e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2853a.f117575e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2853a = new C2853a(eVar);
                    }
                } else {
                    c2853a = new C2853a(eVar);
                }
                Object obj2 = c2853a.f117574d;
                Object objE = uq.b.e();
                int i16 = c2853a.f117575e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f117572a;
                    lb0.n.a aVarR9 = this.f117573b.R9((State) obj);
                    c2853a.f117576f = vq.j.a(obj);
                    c2853a.f117578h = vq.j.a(c2853a);
                    c2853a.f117579j = vq.j.a(obj);
                    c2853a.f117580k = vq.j.a(hVar);
                    c2853a.f117581l = 0;
                    c2853a.f117575e = 1;
                    if (hVar.F(aVarR9, c2853a) == objE) {
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

        public b(mu.g gVar, s0 s0Var) {
            this.f117570a = gVar;
            this.f117571b = s0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super lb0.n.a> hVar, tq.e eVar) {
            Object objA = this.f117570a.a(new a(hVar, this.f117571b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llb0/a;", "<unused var>", "Llb0/m;", "Loq/i0;", "<anonymous>", "(Llb0/a;Llb0/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<lb0.a, lb0.m, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117582e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f117582e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<lb0.h> bVarY1 = s0.this.Y1();
                lb0.h.a aVar = lb0.h.a.f117476a;
                this.f117582e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(lb0.a aVar, lb0.m mVar, tq.e<? super oq.i0> eVar) {
            return s0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Llb0/m$f;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<lb0.m.Initial>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f117584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f117585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f117586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f117587h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.z<lb0.m.Initial, lb0.m, n20.a> f117588j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ s0 f117589k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Llb0/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends lb0.m>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f117590e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f117591f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f117592g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f117593h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f117594j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f117595k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f117596l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f117597m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f117598n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f117599p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f117600q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f117601r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ s0 f117602s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f117603t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ k10.c0<lb0.m.Initial> f117604v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s0 s0Var, String str, k10.c0<lb0.m.Initial> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f117602s = s0Var;
                this.f117603t = str;
                this.f117604v = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final lb0.m.ErrorLoading a0(final s0 s0Var, String str, lb0.m.Initial initial) {
                return new lb0.m.ErrorLoading(s0Var.errorVMSFactory.a(s0Var.O9(s0Var.N9(), new er.l() { // from class: lb0.y0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s0.d.a.b0(s0Var, (ib4.c.b) obj);
                    }
                })), str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 b0(s0 s0Var, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    s0Var.d9(lb0.a.f117453a);
                } else if (bVar instanceof ib4.c.b.a.Primary) {
                    s0Var.d9(lb0.c.f117462a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final lb0.m.ErrorLoading c0(final s0 s0Var, dx.b bVar, String str, lb0.m.Initial initial) {
                return new lb0.m.ErrorLoading(s0Var.errorVMSFactory.a(s0Var.O9(bVar, new er.l() { // from class: lb0.z0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s0.d.a.d0(s0Var, (ib4.c.b) obj);
                    }
                })), str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 d0(s0 s0Var, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    s0Var.d9(lb0.a.f117453a);
                } else if (bVar instanceof ib4.c.b.a.Primary) {
                    s0Var.d9(lb0.c.f117462a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final lb0.m.g.Displaying e0(xf0.d dVar, Bitmap bitmap, MainDocumentPhotoData mainDocumentPhotoData, DrivingLicenceDocument drivingLicenceDocument, List list, lb0.m.Initial initial) {
                return new lb0.m.g.Displaying(null, new lb0.m.StateData(bitmap, mainDocumentPhotoData, drivingLicenceDocument, list, dVar.getDocumentId()));
            }

            /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:29:0x0101  */
            /* JADX WARN: Code duplicated, block: B:32:0x010c  */
            /* JADX WARN: Code duplicated, block: B:34:0x011e  */
            /* JADX WARN: Code duplicated, block: B:36:0x0122  */
            /* JADX WARN: Code duplicated, block: B:39:0x015b  */
            /* JADX WARN: Code duplicated, block: B:42:0x0166  */
            /* JADX WARN: Code duplicated, block: B:44:0x0178  */
            /* JADX WARN: Code duplicated, block: B:46:0x017c  */
            /* JADX WARN: Code duplicated, block: B:48:0x019c  */
            /* JADX WARN: Code duplicated, block: B:50:0x01a2  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objC;
                Object objB;
                final s0 s0Var;
                final String str;
                k10.c0<lb0.m.Initial> c0Var;
                MainDocumentPhotoData mainDocumentPhotoData;
                int i15;
                Bitmap bitmap;
                Object objC2;
                int i16;
                Bitmap bitmap2;
                MainDocumentPhotoData mainDocumentPhotoData2;
                int i17;
                dx.i iVar;
                xf0.d dVar;
                Object objE;
                final MainDocumentPhotoData mainDocumentPhotoData3;
                k10.c0<lb0.m.Initial> c0Var2;
                final xf0.d dVar2;
                final Bitmap bitmap3;
                dx.i iVar2;
                Object objE2 = uq.b.e();
                int i18 = this.f117601r;
                if (i18 == 0) {
                    oq.u.b(obj);
                    eg0.j jVar = this.f117602s.getPhotoFromMainDocumentUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f117601r = 1;
                    objC = jVar.c(c1792a, this);
                    if (objC != objE2) {
                    }
                    return objE2;
                }
                if (i18 == 1) {
                    oq.u.b(obj);
                    objC = obj;
                } else {
                    if (i18 == 2) {
                        i15 = this.f117597m;
                        MainDocumentPhotoData mainDocumentPhotoData4 = (MainDocumentPhotoData) this.f117593h;
                        k10.c0<lb0.m.Initial> c0Var3 = (k10.c0) this.f117592g;
                        String str2 = (String) this.f117591f;
                        s0 s0Var2 = (s0) this.f117590e;
                        oq.u.b(obj);
                        s0Var = s0Var2;
                        str = str2;
                        c0Var = c0Var3;
                        mainDocumentPhotoData = mainDocumentPhotoData4;
                        objB = obj;
                        bitmap = (Bitmap) ((dx.i) objB).a();
                        if (bitmap != null) {
                            eg0.f fVar = s0Var.getDrivingLicenceUC;
                            eg0.f.Params params = new eg0.f.Params(str);
                            this.f117590e = s0Var;
                            this.f117591f = str;
                            this.f117592g = c0Var;
                            this.f117593h = mainDocumentPhotoData;
                            this.f117594j = bitmap;
                            this.f117597m = i15;
                            this.f117598n = 0;
                            this.f117601r = 3;
                            objC2 = fVar.c(params, this);
                            if (objC2 != objE2) {
                                MainDocumentPhotoData mainDocumentPhotoData5 = mainDocumentPhotoData;
                                i16 = i15;
                                bitmap2 = bitmap;
                                mainDocumentPhotoData2 = mainDocumentPhotoData5;
                                i17 = 0;
                                iVar = (dx.i) objC2;
                                if (iVar instanceof dx.i.Left) {
                                    return c0Var.d(new er.l() { // from class: lb0.v0
                                        @Override // er.l
                                        public final Object b(Object obj2) {
                                            return s0.d.a.a0(s0Var, str, (m.Initial) obj2);
                                        }
                                    });
                                }
                                if (!(iVar instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                dVar = (xf0.d) ((dx.i.Right) iVar).b();
                                ib0.a aVar = s0Var.defineMainDrivingLicenceUC;
                                ib0.a.Params params2 = new ib0.a.Params(dVar.a());
                                this.f117590e = s0Var;
                                this.f117591f = str;
                                this.f117592g = c0Var;
                                this.f117593h = mainDocumentPhotoData2;
                                this.f117594j = bitmap2;
                                this.f117595k = vq.j.a(iVar);
                                this.f117596l = dVar;
                                this.f117597m = i16;
                                this.f117598n = i17;
                                this.f117599p = 0;
                                this.f117600q = 0;
                                this.f117601r = 4;
                                objE = aVar.e(params2, this);
                                if (objE != objE2) {
                                    mainDocumentPhotoData3 = mainDocumentPhotoData2;
                                    c0Var2 = c0Var;
                                    dVar2 = dVar;
                                }
                            }
                            return objE2;
                        }
                        return null;
                    }
                    if (i18 == 3) {
                        int i19 = this.f117598n;
                        int i25 = this.f117597m;
                        Bitmap bitmap4 = (Bitmap) this.f117594j;
                        mainDocumentPhotoData2 = (MainDocumentPhotoData) this.f117593h;
                        k10.c0<lb0.m.Initial> c0Var4 = (k10.c0) this.f117592g;
                        String str3 = (String) this.f117591f;
                        s0 s0Var3 = (s0) this.f117590e;
                        oq.u.b(obj);
                        i17 = i19;
                        bitmap2 = bitmap4;
                        s0Var = s0Var3;
                        str = str3;
                        c0Var = c0Var4;
                        i16 = i25;
                        objC2 = obj;
                        iVar = (dx.i) objC2;
                        if (iVar instanceof dx.i.Left) {
                            return c0Var.d(new er.l() { // from class: lb0.v0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return s0.d.a.a0(s0Var, str, (m.Initial) obj2);
                                }
                            });
                        }
                        if (!(iVar instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        dVar = (xf0.d) ((dx.i.Right) iVar).b();
                        ib0.a aVar2 = s0Var.defineMainDrivingLicenceUC;
                        ib0.a.Params params3 = new ib0.a.Params(dVar.a());
                        this.f117590e = s0Var;
                        this.f117591f = str;
                        this.f117592g = c0Var;
                        this.f117593h = mainDocumentPhotoData2;
                        this.f117594j = bitmap2;
                        this.f117595k = vq.j.a(iVar);
                        this.f117596l = dVar;
                        this.f117597m = i16;
                        this.f117598n = i17;
                        this.f117599p = 0;
                        this.f117600q = 0;
                        this.f117601r = 4;
                        objE = aVar2.e(params3, this);
                        if (objE != objE2) {
                            mainDocumentPhotoData3 = mainDocumentPhotoData2;
                            c0Var2 = c0Var;
                            dVar2 = dVar;
                        }
                        return objE2;
                    }
                    if (i18 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xf0.d dVar3 = (xf0.d) this.f117596l;
                    bitmap2 = (Bitmap) this.f117594j;
                    MainDocumentPhotoData mainDocumentPhotoData6 = (MainDocumentPhotoData) this.f117593h;
                    k10.c0<lb0.m.Initial> c0Var5 = (k10.c0) this.f117592g;
                    String str4 = (String) this.f117591f;
                    s0 s0Var4 = (s0) this.f117590e;
                    oq.u.b(obj);
                    mainDocumentPhotoData3 = mainDocumentPhotoData6;
                    str = str4;
                    s0Var = s0Var4;
                    objE = obj;
                    dVar2 = dVar3;
                    c0Var2 = c0Var5;
                }
                bitmap3 = bitmap2;
                iVar2 = (dx.i) objE;
                if (iVar2 instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
                    return c0Var2.d(new er.l() { // from class: lb0.w0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s0.d.a.c0(s0Var, bVar, str, (m.Initial) obj2);
                        }
                    });
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                final DrivingLicenceDocument drivingLicenceDocument = (DrivingLicenceDocument) ((dx.i.Right) iVar2).b();
                final List listI1 = pq.v.i1(dVar2.a());
                listI1.remove(drivingLicenceDocument);
                return c0Var2.d(new er.l() { // from class: lb0.x0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s0.d.a.e0(dVar2, bitmap3, mainDocumentPhotoData3, drivingLicenceDocument, listI1, (m.Initial) obj2);
                    }
                });
                MainDocumentPhotoData mainDocumentPhotoData7 = (MainDocumentPhotoData) ((dx.i) objC).a();
                if (mainDocumentPhotoData7 != null) {
                    s0 s0Var5 = this.f117602s;
                    String str5 = this.f117603t;
                    k10.c0<lb0.m.Initial> c0Var6 = this.f117604v;
                    b00.c cVar = s0Var5.imageConverter;
                    String photo = mainDocumentPhotoData7.getPhoto();
                    this.f117590e = s0Var5;
                    this.f117591f = str5;
                    this.f117592g = c0Var6;
                    this.f117593h = mainDocumentPhotoData7;
                    this.f117597m = 0;
                    this.f117601r = 2;
                    objB = cVar.b(photo, this);
                    if (objB != objE2) {
                        s0Var = s0Var5;
                        str = str5;
                        c0Var = c0Var6;
                        mainDocumentPhotoData = mainDocumentPhotoData7;
                        i15 = 0;
                        bitmap = (Bitmap) ((dx.i) objB).a();
                        if (bitmap != null) {
                            eg0.f fVar2 = s0Var.getDrivingLicenceUC;
                            eg0.f.Params params4 = new eg0.f.Params(str);
                            this.f117590e = s0Var;
                            this.f117591f = str;
                            this.f117592g = c0Var;
                            this.f117593h = mainDocumentPhotoData;
                            this.f117594j = bitmap;
                            this.f117597m = i15;
                            this.f117598n = 0;
                            this.f117601r = 3;
                            objC2 = fVar2.c(params4, this);
                            if (objC2 != objE2) {
                                MainDocumentPhotoData mainDocumentPhotoData8 = mainDocumentPhotoData;
                                i16 = i15;
                                bitmap2 = bitmap;
                                mainDocumentPhotoData2 = mainDocumentPhotoData8;
                                i17 = 0;
                                iVar = (dx.i) objC2;
                                if (iVar instanceof dx.i.Left) {
                                    return c0Var.d(new er.l() { // from class: lb0.v0
                                        @Override // er.l
                                        public final Object b(Object obj2) {
                                            return s0.d.a.a0(s0Var, str, (m.Initial) obj2);
                                        }
                                    });
                                }
                                if (!(iVar instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                dVar = (xf0.d) ((dx.i.Right) iVar).b();
                                ib0.a aVar3 = s0Var.defineMainDrivingLicenceUC;
                                ib0.a.Params params5 = new ib0.a.Params(dVar.a());
                                this.f117590e = s0Var;
                                this.f117591f = str;
                                this.f117592g = c0Var;
                                this.f117593h = mainDocumentPhotoData2;
                                this.f117594j = bitmap2;
                                this.f117595k = vq.j.a(iVar);
                                this.f117596l = dVar;
                                this.f117597m = i16;
                                this.f117598n = i17;
                                this.f117599p = 0;
                                this.f117600q = 0;
                                this.f117601r = 4;
                                objE = aVar3.e(params5, this);
                                if (objE != objE2) {
                                    mainDocumentPhotoData3 = mainDocumentPhotoData2;
                                    c0Var2 = c0Var;
                                    dVar2 = dVar;
                                    bitmap3 = bitmap2;
                                    iVar2 = (dx.i) objE;
                                    if (iVar2 instanceof dx.i.Left) {
                                        final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar2).b();
                                        return c0Var2.d(new er.l() { // from class: lb0.w0
                                            @Override // er.l
                                            public final Object b(Object obj2) {
                                                return s0.d.a.c0(s0Var, bVar2, str, (m.Initial) obj2);
                                            }
                                        });
                                    }
                                    if (iVar2 instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    final DrivingLicenceDocument drivingLicenceDocument2 = (DrivingLicenceDocument) ((dx.i.Right) iVar2).b();
                                    final List listI2 = pq.v.i1(dVar2.a());
                                    listI2.remove(drivingLicenceDocument2);
                                    return c0Var2.d(new er.l() { // from class: lb0.x0
                                        @Override // er.l
                                        public final Object b(Object obj2) {
                                            return s0.d.a.e0(dVar2, bitmap3, mainDocumentPhotoData3, drivingLicenceDocument2, listI2, (m.Initial) obj2);
                                        }
                                    });
                                }
                            }
                        }
                    }
                    return objE2;
                }
                return null;
            }

            public final tq.e<oq.i0> Y(tq.e<?> eVar) {
                return new a(this.f117602s, this.f117603t, this.f117604v, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends lb0.m>> eVar) {
                return ((a) Y(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k10.z<lb0.m.Initial, lb0.m, n20.a> zVar, s0 s0Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f117588j = zVar;
            this.f117589k = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.ErrorInitial V(final s0 s0Var, lb0.m.Initial initial) {
            return new lb0.m.ErrorInitial(s0Var.errorVMSFactory.a(s0Var.O9(new dx.b.Generic(null, 1, null), new er.l() { // from class: lb0.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.d.X(s0Var, (ib4.c.b) obj);
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(s0 s0Var, ib4.c.b bVar) {
            s0Var.d9(lb0.a.f117453a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d dVar;
            k10.c0 c0Var = (k10.c0) this.f117587h;
            Object objE = uq.b.e();
            int i15 = this.f117586g;
            if (i15 == 0) {
                oq.u.b(obj);
                String documentId = ((lb0.m.Initial) c0Var.a()).getDocumentId();
                if (documentId != null) {
                    s0 s0Var = this.f117589k;
                    ac4.a aVar = s0Var.callActionWithLoaderUseCase;
                    a aVar2 = new a(s0Var, documentId, c0Var, null);
                    this.f117587h = c0Var;
                    this.f117584e = vq.j.a(documentId);
                    this.f117585f = 0;
                    this.f117586g = 1;
                    dVar = this;
                    obj = ac4.a.a(aVar, null, aVar2, dVar, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    dVar = this;
                }
                final s0 s0Var2 = dVar.f117589k;
                return c0Var.d(new er.l() { // from class: lb0.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s0.d.V(s0Var2, (m.Initial) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dVar = this;
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            final s0 s0Var3 = dVar.f117589k;
            return c0Var.d(new er.l() { // from class: lb0.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.d.V(s0Var3, (m.Initial) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<lb0.m.Initial> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f117588j, this.f117589k, eVar);
            dVar.f117587h = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Llb0/m$g$c;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<lb0.m.g.Updating>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117606f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Llb0/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends lb0.m>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f117608e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f117609f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f117610g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f117611h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f117612j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f117613k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ s0 f117614l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<lb0.m.g.Updating> f117615m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s0 s0Var, k10.c0<lb0.m.g.Updating> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f117614l = s0Var;
                this.f117615m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final lb0.m.g.ErrorUpdating V(k10.c0 c0Var, s0 s0Var, dx.b bVar, lb0.m.g.Updating updating) {
                return new lb0.m.g.ErrorUpdating(((lb0.m.g.Updating) c0Var.a()).getDialogVMSAdapter(), ((lb0.m.g.Updating) c0Var.a()).getStateData(), s0Var.errorVMSFactory.a(s0Var.P9(bVar)));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<lb0.m.g.Updating> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f117613k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    df0.n nVar = this.f117614l.requestDocumentUpdateUC;
                    df0.n.Params params = new df0.n.Params(cf0.c.DRIVING_LICENCE, this.f117615m.a().getStateData().getParentDocumentId());
                    this.f117613k = 1;
                    obj = nVar.c(params, this);
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
                    c0Var = (k10.c0) this.f117609f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<lb0.m.g.Updating> c0Var2 = this.f117615m;
                final s0 s0Var = this.f117614l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: lb0.a1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s0.e.a.V(c0Var2, s0Var, bVar, (m.g.Updating) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                df0.n.Response response = (df0.n.Response) ((dx.i.Right) iVar).b();
                xw.b<lb0.h> bVarY1 = s0Var.Y1();
                lb0.h.ShowDocumentLoader showDocumentLoader = new lb0.h.ShowDocumentLoader(response.getDocumentToGenerateId());
                this.f117608e = vq.j.a(iVar);
                this.f117609f = c0Var2;
                this.f117610g = vq.j.a(response);
                this.f117611h = 0;
                this.f117612j = 0;
                this.f117613k = 2;
                if (bVarY1.F(showDocumentLoader, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f117614l, this.f117615m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends lb0.m>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117606f;
            Object objE = uq.b.e();
            int i15 = this.f117605e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(s0.this, c0Var, null);
            this.f117606f = vq.j.a(c0Var);
            this.f117605e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<lb0.m.g.Updating> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = s0.this.new e(eVar);
            eVar2.f117606f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/f;", "action", "Lk10/c0;", "Llb0/m$g$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<lb0.f, k10.c0<lb0.m.g.Displaying>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117617f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.InfoPage O(k10.c0 c0Var, lb0.m.g.Displaying displaying) {
            return new lb0.m.InfoPage(((lb0.m.g.Displaying) c0Var.a()).getStateData(), ((lb0.m.g.Displaying) c0Var.a()).getStateData().getParentDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f117617f;
            uq.b.e();
            if (this.f117616e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.f.O(c0Var, (m.g.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.f fVar, k10.c0<lb0.m.g.Displaying> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            f fVar2 = new f(eVar);
            fVar2.f117617f = c0Var;
            return fVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/d;", "action", "Lk10/c0;", "Llb0/m$g$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<lb0.d, k10.c0<lb0.m.g.Displaying>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117619f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.d.List O(k10.c0 c0Var, lb0.m.g.Displaying displaying) {
            return new lb0.m.d.List(((lb0.m.g.Displaying) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f117619f;
            uq.b.e();
            if (this.f117618e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.g.O(c0Var, (m.g.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.d dVar, k10.c0<lb0.m.g.Displaying> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            g gVar = new g(eVar);
            gVar.f117619f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/j;", "action", "Lk10/c0;", "Llb0/m$g$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<lb0.j, k10.c0<lb0.m.g.Displaying>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117621f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.g.Displaying O(s0 s0Var, lb0.m.g.Displaying displaying) {
            return lb0.m.g.Displaying.d(displaying, s0Var.dialogVmsFactory.a(s0Var.drivingLicenceMapper.v(s0Var.b9(lb0.c.f117462a), s0Var.b9(lb0.b.f117459a))), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117621f;
            uq.b.e();
            if (this.f117620e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final s0 s0Var = s0.this;
            return c0Var.d(new er.l() { // from class: lb0.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.h.O(s0Var, (m.g.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.j jVar, k10.c0<lb0.m.g.Displaying> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            h hVar = s0.this.new h(eVar);
            hVar.f117621f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/k;", "action", "Lk10/c0;", "Llb0/m$g$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<lb0.k, k10.c0<lb0.m.g.Displaying>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117624f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.g.Displaying O(s0 s0Var, lb0.m.g.Displaying displaying) {
            return lb0.m.g.Displaying.d(displaying, s0Var.dialogVmsFactory.a(s0Var.drivingLicenceMapper.x(s0Var.b9(lb0.l.f117490a), s0Var.b9(lb0.b.f117459a))), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117624f;
            uq.b.e();
            if (this.f117623e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final s0 s0Var = s0.this;
            return c0Var.d(new er.l() { // from class: lb0.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.i.O(s0Var, (m.g.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.k kVar, k10.c0<lb0.m.g.Displaying> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            i iVar = s0.this.new i(eVar);
            iVar.f117624f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/b;", "action", "Lk10/c0;", "Llb0/m$g$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<lb0.b, k10.c0<lb0.m.g.Displaying>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117627f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.g.Displaying O(lb0.m.g.Displaying displaying) {
            return lb0.m.g.Displaying.d(displaying, null, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117627f;
            uq.b.e();
            if (this.f117626e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.f1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.j.O((m.g.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.b bVar, k10.c0<lb0.m.g.Displaying> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            j jVar = new j(eVar);
            jVar.f117627f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/c;", "action", "Lk10/c0;", "Llb0/m$g$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<lb0.c, k10.c0<lb0.m.g.Displaying>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117629f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.DeleteDocument O(k10.c0 c0Var, lb0.m.g.Displaying displaying) {
            return new lb0.m.DeleteDocument(((lb0.m.g.Displaying) c0Var.a()).getStateData().getDrivingLicenceData().getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f117629f;
            uq.b.e();
            if (this.f117628e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.g1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.k.O(c0Var, (m.g.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.c cVar, k10.c0<lb0.m.g.Displaying> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            k kVar = new k(eVar);
            kVar.f117629f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/l;", "action", "Lk10/c0;", "Llb0/m$g$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<lb0.l, k10.c0<lb0.m.g.Displaying>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117631f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.g.Updating O(k10.c0 c0Var, lb0.m.g.Displaying displaying) {
            return new lb0.m.g.Updating(null, ((lb0.m.g.Displaying) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            MnemonicHeaderContainerDL mnemonicHeaderContainerDL;
            OffsetDateTime ts4;
            OffsetDateTime offsetDateTimePlus;
            final k10.c0 c0Var = (k10.c0) this.f117631f;
            uq.b.e();
            if (this.f117630e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            DrivingLicenceScope scopeData = ((lb0.m.g.Displaying) c0Var.a()).getStateData().getDrivingLicenceData().getScopeData();
            if ((scopeData == null || (mnemonicHeaderContainerDL = scopeData.getMnemonicHeaderContainerDL()) == null || (ts4 = mnemonicHeaderContainerDL.getTs()) == null || (offsetDateTimePlus = ts4.plus(5L, (TemporalUnit) ChronoUnit.MINUTES)) == null) ? true : offsetDateTimePlus.isBefore(OffsetDateTime.now())) {
                return c0Var.d(new er.l() { // from class: lb0.h1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s0.l.O(c0Var, (m.g.Displaying) obj2);
                    }
                });
            }
            s0.this.y(new p50.a.DefaultWithIcon(s0.this.labelProvider.c(fb0.a.f60713g), false, null, null, 14, null));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.l lVar, k10.c0<lb0.m.g.Displaying> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            l lVar2 = s0.this.new l(eVar);
            lVar2.f117631f = c0Var;
            return lVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llb0/i;", "action", "Llb0/m$g$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llb0/i;Llb0/m$g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ReportMistake, lb0.m.g.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117634f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ReportMistake reportMistake = (ReportMistake) this.f117634f;
            Object objE = uq.b.e();
            int i15 = this.f117633e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = s0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(reportMistake.getUrl(), false, 2, null);
                this.f117634f = vq.j.a(reportMistake);
                this.f117633e = 1;
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
            s0 s0Var = s0.this;
            if (iVar instanceof dx.i.Left) {
                s0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(oq.i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ReportMistake reportMistake, lb0.m.g.Displaying displaying, tq.e<? super oq.i0> eVar) {
            m mVar = s0.this.new m(eVar);
            mVar.f117634f = reportMistake;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llb0/g;", "action", "Llb0/m$g$a;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Llb0/g;Llb0/m$g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<lb0.g, lb0.m.g.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117637f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lb0.m.g.Displaying displaying = (lb0.m.g.Displaying) this.f117637f;
            Object objE = uq.b.e();
            int i15 = this.f117636e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<lb0.h> bVarY1 = s0.this.Y1();
                lb0.h.GoToVerification goToVerification = new lb0.h.GoToVerification(s0.this.verificationDataMapper.b(new kb0.i.Params(displaying)));
                this.f117637f = vq.j.a(displaying);
                this.f117636e = 1;
                if (bVarY1.F(goToVerification, this) == objE) {
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
        public final Object w(lb0.g gVar, lb0.m.g.Displaying displaying, tq.e<? super oq.i0> eVar) {
            n nVar = s0.this.new n(eVar);
            nVar.f117637f = displaying;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/a;", "action", "Lk10/c0;", "Llb0/m$e;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<lb0.a, k10.c0<lb0.m.InfoPage>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117640f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.g.Displaying O(k10.c0 c0Var, lb0.m.InfoPage infoPage) {
            return new lb0.m.g.Displaying(null, ((lb0.m.InfoPage) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f117640f;
            uq.b.e();
            if (this.f117639e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.o.O(c0Var, (m.InfoPage) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.a aVar, k10.c0<lb0.m.InfoPage> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            o oVar = new o(eVar);
            oVar.f117640f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Llb0/m$d$b;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<k10.c0<lb0.m.d.List>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117642f;

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.d.Details O(k10.c0 c0Var, lb0.m.d.List list) {
            return new lb0.m.d.Details((DrivingLicenceDocument) pq.v.l0(((lb0.m.d.List) c0Var.a()).getStateData().a()), ((lb0.m.d.List) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f117642f;
            uq.b.e();
            if (this.f117641e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return ((lb0.m.d.List) c0Var.a()).getStateData().a().size() == 1 ? c0Var.d(new er.l() { // from class: lb0.j1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.p.O(c0Var, (m.d.List) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<lb0.m.d.List> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            return ((p) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = new p(eVar);
            pVar.f117642f = obj;
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/a;", "action", "Lk10/c0;", "Llb0/m$d$b;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<lb0.a, k10.c0<lb0.m.d.List>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117644f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.g.Displaying O(k10.c0 c0Var, lb0.m.d.List list) {
            return new lb0.m.g.Displaying(null, ((lb0.m.d.List) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f117644f;
            uq.b.e();
            if (this.f117643e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.k1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.q.O(c0Var, (m.d.List) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.a aVar, k10.c0<lb0.m.d.List> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            q qVar = new q(eVar);
            qVar.f117644f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/e;", "action", "Lk10/c0;", "Llb0/m$d$b;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<GoToHistoryDetails, k10.c0<lb0.m.d.List>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f117647g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.d.Details O(GoToHistoryDetails goToHistoryDetails, k10.c0 c0Var, lb0.m.d.List list) {
            return new lb0.m.d.Details(goToHistoryDetails.getDrivingLicenceDocument(), ((lb0.m.d.List) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final GoToHistoryDetails goToHistoryDetails = (GoToHistoryDetails) this.f117646f;
            final k10.c0 c0Var = (k10.c0) this.f117647g;
            uq.b.e();
            if (this.f117645e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.l1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.r.O(goToHistoryDetails, c0Var, (m.d.List) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToHistoryDetails goToHistoryDetails, k10.c0<lb0.m.d.List> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            r rVar = new r(eVar);
            rVar.f117646f = goToHistoryDetails;
            rVar.f117647g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/a;", "action", "Lk10/c0;", "Llb0/m$d$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<lb0.a, k10.c0<lb0.m.d.Details>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117649f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m O(k10.c0 c0Var, lb0.m.d.Details details) {
            return ((lb0.m.d.Details) c0Var.a()).getStateData().a().size() > 1 ? new lb0.m.d.List(((lb0.m.d.Details) c0Var.a()).getStateData()) : new lb0.m.g.Displaying(null, ((lb0.m.d.Details) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f117649f;
            uq.b.e();
            if (this.f117648e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.m1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.s.O(c0Var, (m.d.Details) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.a aVar, k10.c0<lb0.m.d.Details> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            s sVar = new s(eVar);
            sVar.f117649f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llb0/a;", "<unused var>", "Llb0/m$a;", "Loq/i0;", "<anonymous>", "(Llb0/a;Llb0/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<lb0.a, lb0.m.DeleteDocument, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117650e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f117650e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<lb0.h> bVarY1 = s0.this.Y1();
                lb0.h.a aVar = lb0.h.a.f117476a;
                this.f117650e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(lb0.a aVar, lb0.m.DeleteDocument deleteDocument, tq.e<? super oq.i0> eVar) {
            return s0.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Llb0/m$a;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.p<k10.c0<lb0.m.DeleteDocument>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117653f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Llb0/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends lb0.m>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f117655e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f117656f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f117657g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f117658h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f117659j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f117660k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ s0 f117661l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<lb0.m.DeleteDocument> f117662m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s0 s0Var, k10.c0<lb0.m.DeleteDocument> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f117661l = s0Var;
                this.f117662m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final lb0.m.ErrorLoading X(final s0 s0Var, dx.b bVar, k10.c0 c0Var, lb0.m.DeleteDocument deleteDocument) {
                return new lb0.m.ErrorLoading(s0Var.errorVMSFactory.a(s0Var.O9(bVar, new er.l() { // from class: lb0.o1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s0.u.a.Y(s0Var, (ib4.c.b) obj);
                    }
                })), ((lb0.m.DeleteDocument) c0Var.a()).getDocumentId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(s0 s0Var, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    s0Var.d9(lb0.c.f117462a);
                } else {
                    s0Var.d9(lb0.a.f117453a);
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<lb0.m.DeleteDocument> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f117660k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    eg0.d dVar = this.f117661l.deleteDocumentByIDUC;
                    eg0.d.Params params = new eg0.d.Params(this.f117662m.a().getDocumentId());
                    this.f117660k = 1;
                    obj = dVar.c(params, this);
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
                    c0Var = (k10.c0) this.f117656f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<lb0.m.DeleteDocument> c0Var2 = this.f117662m;
                final s0 s0Var = this.f117661l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: lb0.n1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s0.u.a.X(s0Var, bVar, c0Var2, (m.DeleteDocument) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                xw.b<lb0.h> bVarY1 = s0Var.Y1();
                lb0.h.a aVar = lb0.h.a.f117476a;
                this.f117655e = vq.j.a(iVar);
                this.f117656f = c0Var2;
                this.f117657g = vq.j.a(i0Var);
                this.f117658h = 0;
                this.f117659j = 0;
                this.f117660k = 2;
                if (bVarY1.F(aVar, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f117661l, this.f117662m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends lb0.m>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        u(tq.e<? super u> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117653f;
            Object objE = uq.b.e();
            int i15 = this.f117652e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(s0.this, c0Var, null);
            this.f117653f = vq.j.a(c0Var);
            this.f117652e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<lb0.m.DeleteDocument> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            return ((u) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            u uVar = s0.this.new u(eVar);
            uVar.f117653f = obj;
            return uVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llb0/c;", "<unused var>", "Lk10/c0;", "Llb0/m$c;", "state", "Lk10/l;", "Llb0/m;", "<anonymous>", "(Llb0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<lb0.c, k10.c0<lb0.m.ErrorLoading>, tq.e<? super k10.l<? extends lb0.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117664f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lb0.m.DeleteDocument O(k10.c0 c0Var, lb0.m.ErrorLoading errorLoading) {
            return new lb0.m.DeleteDocument(((lb0.m.ErrorLoading) c0Var.a()).getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f117664f;
            uq.b.e();
            if (this.f117663e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lb0.p1
                @Override // er.l
                public final Object b(Object obj2) {
                    return s0.v.O(c0Var, (m.ErrorLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lb0.c cVar, k10.c0<lb0.m.ErrorLoading> c0Var, tq.e<? super k10.l<? extends lb0.m>> eVar) {
            v vVar = new v(eVar);
            vVar.f117664f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    public s0(n20.j jVar, eg0.f fVar, eg0.j jVar2, kb0.f fVar2, kb0.i iVar, b00.c cVar, t2.a aVar, eg0.d dVar, ac4.a aVar2, df0.n nVar, hb4.d dVar2, cb4.j jVar3, a14.w wVar, i70.n nVar2, mx.c cVar2, ib0.a aVar3, ib4.c cVar3, a.SetupData setupData) {
        this.getDrivingLicenceUC = fVar;
        this.getPhotoFromMainDocumentUC = jVar2;
        this.drivingLicenceMapper = fVar2;
        this.verificationDataMapper = iVar;
        this.imageConverter = cVar;
        this.deps = aVar;
        this.deleteDocumentByIDUC = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.requestDocumentUpdateUC = nVar;
        this.errorVMSFactory = dVar2;
        this.dialogVmsFactory = jVar3;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar2;
        this.labelProvider = cVar2;
        this.defineMainDrivingLicenceUC = aVar3;
        this.genericDomainErrorMapper = cVar3;
        this.setupData = setupData;
        lb0.m.Initial initial = new lb0.m.Initial(setupData.getDocumentId());
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(initial, new er.l() { // from class: lb0.i0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.W9(this.f117482a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), lb0.n.a.c.f117526a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business N9() {
        return new dx.b.Business(hb0.a.READ_DATA_ERROR, null, this.labelProvider.c(fb0.a.f60708d0), this.labelProvider.c(fb0.a.f60706c0), null, this.labelProvider.c(fb0.a.f60703b), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b O9(dx.b domainError, er.l<? super ib4.c.b, oq.i0> resultAction) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, resultAction, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b P9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: lb0.h0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.Q9(this.f117479a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(s0 s0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            s0Var.d9(lb0.a.f117453a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            s0Var.d9(lb0.l.f117490a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lb0.n.a R9(State<lb0.m> state) {
        return this.drivingLicenceMapper.b(new kb0.f.Params(state, b9(lb0.a.f117453a), new t2(this.deps, androidx.p016lifecycle.u0.a(this)), new er.l() { // from class: lb0.r0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.S9(this.f117545a, (n20.a) obj);
            }
        }, b9(lb0.f.f117471a), new er.l() { // from class: lb0.f0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.T9(this.f117472a, (String) obj);
            }
        }, b9(lb0.l.f117490a), b9(lb0.j.f117484a), b9(lb0.g.f117473a), b9(lb0.k.f117487a), b9(lb0.d.f117466a), new er.l() { // from class: lb0.g0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.U9(this.f117474a, (DrivingLicenceDocument) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(s0 s0Var, n20.a aVar) {
        s0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(s0 s0Var, String str) {
        s0Var.d9(new ReportMistake(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(s0 s0Var, DrivingLicenceDocument drivingLicenceDocument) {
        s0Var.d9(new GoToHistoryDetails(drivingLicenceDocument));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(final s0 s0Var, k10.v vVar) {
        vVar.c(fr.q0.c(lb0.m.class), new er.l() { // from class: lb0.e0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.X9(this.f117469a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(lb0.m.Initial.class), new er.l() { // from class: lb0.j0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.Y9(this.f117485a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(lb0.m.g.Updating.class), new er.l() { // from class: lb0.k0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.Z9(this.f117488a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(lb0.m.g.Displaying.class), new er.l() { // from class: lb0.l0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.aa(this.f117491a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(lb0.m.InfoPage.class), new er.l() { // from class: lb0.m0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.ba((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(lb0.m.d.List.class), new er.l() { // from class: lb0.n0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.ca((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(lb0.m.d.Details.class), new er.l() { // from class: lb0.o0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.da((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(lb0.m.DeleteDocument.class), new er.l() { // from class: lb0.p0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.ea(this.f117540a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(lb0.m.ErrorLoading.class), new er.l() { // from class: lb0.q0
            @Override // er.l
            public final Object b(Object obj) {
                return s0.fa((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(s0 s0Var, k10.z zVar) {
        c cVar = s0Var.new c(null);
        zVar.x(fr.q0.c(lb0.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(s0 s0Var, k10.z zVar) {
        zVar.A(new d(zVar, s0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(s0 s0Var, k10.z zVar) {
        zVar.A(s0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(s0 s0Var, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(lb0.f.class), oVar, fVar);
        zVar.v(fr.q0.c(lb0.d.class), oVar, new g(null));
        zVar.v(fr.q0.c(lb0.j.class), oVar, s0Var.new h(null));
        zVar.v(fr.q0.c(lb0.k.class), oVar, s0Var.new i(null));
        zVar.v(fr.q0.c(lb0.b.class), oVar, new j(null));
        zVar.v(fr.q0.c(lb0.c.class), oVar, new k(null));
        zVar.v(fr.q0.c(lb0.l.class), oVar, s0Var.new l(null));
        zVar.x(fr.q0.c(ReportMistake.class), oVar, s0Var.new m(null));
        zVar.x(fr.q0.c(lb0.g.class), oVar, s0Var.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(k10.z zVar) {
        o oVar = new o(null);
        zVar.v(fr.q0.c(lb0.a.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(k10.z zVar) {
        zVar.A(new p(null));
        q qVar = new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(lb0.a.class), oVar, qVar);
        zVar.v(fr.q0.c(GoToHistoryDetails.class), oVar, new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(k10.z zVar) {
        s sVar = new s(null);
        zVar.v(fr.q0.c(lb0.a.class), k10.o.CANCEL_PREVIOUS, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(s0 s0Var, k10.z zVar) {
        t tVar = s0Var.new t(null);
        zVar.x(fr.q0.c(lb0.a.class), k10.o.CANCEL_PREVIOUS, tVar);
        zVar.A(s0Var.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(k10.z zVar) {
        v vVar = new v(null);
        zVar.v(fr.q0.c(lb0.c.class), k10.o.CANCEL_PREVIOUS, vVar);
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: V9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(lb0.n.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<lb0.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<lb0.m>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<lb0.n.a> getState() {
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
