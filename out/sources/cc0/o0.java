package cc0;

import android.graphics.Bitmap;
import cb4.DialogData;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vb0.FamilyCardDocument;
import vb0.FamilyCardScope;
import vb0.FamilyDataContainer;
import vb0.MnemonicHeaderContainer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001}B\u008b\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020*2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b+\u0010,J6\u00105\u001a\u001a\u0012\u0004\u0012\u000201\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020402002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0082@¢\u0006\u0004\b5\u00106J+\u0010=\u001a\u00020<2\u0006\u00107\u001a\u0002012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08H\u0002¢\u0006\u0004\b=\u0010>J\u0018\u0010A\u001a\u00020:2\u0006\u0010@\u001a\u00020?H\u0096\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020:H\u0096\u0001¢\u0006\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR \u0010m\u001a\b\u0012\u0004\u0012\u00020h0g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR,\u0010s\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040n8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR \u0010)\u001a\b\u0012\u0004\u0012\u00020*0t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020z0y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010{¨\u0006~"}, d2 = {"Lcc0/o0;", "Ll00/g;", "Ln20/b;", "Lcc0/l;", "Ln20/a;", "Lcc0/m;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lu04/a;", "commonEndpoints", "Lo20/t2$a;", "deps", "Lcb4/j;", "dialogVmsFactory", "Lwb0/a;", "documentStorageInteractor", "Lhb4/d;", "errorVMSFactory", "Lac0/g;", "familyCardMapper", "Lac0/h;", "verificationDataMapper", "Lib4/c;", "genericDomainErrorMapper", "Lxb0/a;", "getFamilyCardUC", "Lb00/c;", "imageConverter", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lwz/a;", "barcodeGenerator", "Lcc0/o0$a$a;", "setupData", "<init>", "(Ln20/j;Lac4/a;Lu04/a;Lo20/t2$a;Lcb4/j;Lwb0/a;Lhb4/d;Lac0/g;Lac0/h;Lib4/c;Lxb0/a;Lb00/c;La14/w;Li70/n;Lwz/a;Lcc0/o0$a$a;)V", "state", "Lcc0/m$a;", "K9", "(Ln20/b;)Lcc0/m$a;", "", "Lvb0/b;", "cards", "Ldx/i;", "Ldx/b;", "", "", "Landroid/graphics/Bitmap;", "I9", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "domainError", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "Ljb4/b;", "J9", "(Ldx/b;Ler/l;)Ljb4/b;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lac4/a;", "c", "Lu04/a;", "d", "Lo20/t2$a;", "e", "Lcb4/j;", "f", "Lwb0/a;", "g", "Lhb4/d;", "h", "Lac0/g;", "j", "Lac0/h;", "k", "Lib4/c;", "l", "Lxb0/a;", "m", "Lb00/c;", "n", "La14/w;", "p", "Li70/n;", "q", "Lwz/a;", "r", "Lcc0/o0$a$a;", "Lcc0/l$c;", "s", "Lcc0/l$c;", "initialState", "Lxw/b;", "Lcc0/h;", "t", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends l00.g<State<cc0.l>, n20.a> implements cc0.m, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVmsFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wb0.a documentStorageInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac0.g familyCardMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac0.h verificationDataMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xb0.a getFamilyCardUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final cc0.l.Initial initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cc0.h> navAction;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<cc0.l>, n20.a> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<cc0.m.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcc0/o0$a;", "Lf00/j0;", "Lcc0/o0$a$a;", "Lcc0/o0;", "a", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<SetupData, o0> {

        /* JADX INFO: renamed from: cc0.o0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcc0/o0$a$a;", "", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f25274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f25275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f25276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f25277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f25278h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f25279j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f25280k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f25281l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f25282m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f25283n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f25284p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25285q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f25286r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f25287s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f25288t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f25289v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f25290w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f25291x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f25292y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f25293z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return o0.this.I9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<cc0.m.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f25294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f25295b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f25296a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f25297b;

            /* JADX INFO: renamed from: cc0.o0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0675a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f25298d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f25299e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f25300f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f25302h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f25303j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f25304k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f25305l;

                public C0675a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f25298d = obj;
                    this.f25299e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o0 o0Var) {
                this.f25296a = hVar;
                this.f25297b = o0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0675a c0675a;
                if (eVar instanceof C0675a) {
                    c0675a = (C0675a) eVar;
                    int i15 = c0675a.f25299e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0675a.f25299e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0675a = new C0675a(eVar);
                    }
                } else {
                    c0675a = new C0675a(eVar);
                }
                Object obj2 = c0675a.f25298d;
                Object objE = uq.b.e();
                int i16 = c0675a.f25299e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f25296a;
                    cc0.m.a aVarK9 = this.f25297b.K9((State) obj);
                    c0675a.f25300f = vq.j.a(obj);
                    c0675a.f25302h = vq.j.a(c0675a);
                    c0675a.f25303j = vq.j.a(obj);
                    c0675a.f25304k = vq.j.a(hVar);
                    c0675a.f25305l = 0;
                    c0675a.f25299e = 1;
                    if (hVar.F(aVarK9, c0675a) == objE) {
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

        public c(mu.g gVar, o0 o0Var) {
            this.f25294a = gVar;
            this.f25295b = o0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super cc0.m.a> hVar, tq.e eVar) {
            Object objA = this.f25294a.a(new a(hVar, this.f25295b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcc0/a;", "<unused var>", "Lcc0/l$c;", "Loq/i0;", "<anonymous>", "(Lcc0/a;Lcc0/l$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<cc0.a, cc0.l.Initial, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25306e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f25306e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cc0.h> bVarY1 = o0.this.Y1();
                cc0.h.a aVar = cc0.h.a.f25200a;
                this.f25306e = 1;
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
        public final Object w(cc0.a aVar, cc0.l.Initial initial, tq.e<? super oq.i0> eVar) {
            return o0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lcc0/l$c;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<cc0.l.Initial>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f25308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f25309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f25310g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f25311h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.z<cc0.l.Initial, cc0.l, n20.a> f25312j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ o0 f25313k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcc0/l;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends cc0.l>>, Object> {
            final /* synthetic */ o0 A;
            final /* synthetic */ String B;
            final /* synthetic */ k10.c0<cc0.l.Initial> C;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f25314e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f25315f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f25316g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f25317h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f25318j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f25319k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f25320l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f25321m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f25322n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f25323p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f25324q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f25325r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f25326s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f25327t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f25328v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            int f25329w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f25330x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f25331y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            int f25332z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, String str, k10.c0<cc0.l.Initial> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.A = o0Var;
                this.B = str;
                this.C = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cc0.l.b.ErrorLoading a0(final o0 o0Var, dx.b bVar, String str, cc0.l.Initial initial) {
                return new cc0.l.b.ErrorLoading(o0Var.errorVMSFactory.a(o0Var.J9(bVar, new er.l() { // from class: cc0.u0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o0.e.a.b0(o0Var, (ib4.c.b) obj);
                    }
                })), str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 b0(o0 o0Var, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.a.Close) {
                    o0Var.d9(cc0.a.f25177a);
                } else if (bVar instanceof ib4.c.b.a.Primary) {
                    o0Var.d9(cc0.f.f25192a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cc0.l.d.Displaying c0(Bitmap bitmap, xb0.a.FamilyCardData familyCardData, String str, Map map, cc0.l.Initial initial) {
                return new cc0.l.d.Displaying(null, new cc0.l.StateData(bitmap, familyCardData.getPhotoData(), familyCardData.getFamilyCards(), familyCardData.getFamilyCards().getOwnerCard(), y30.n.Switch.EnumC5973b.LEFT, false, str, map, 32, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cc0.l.b.ErrorLoading d0(final o0 o0Var, String str, cc0.l.Initial initial) {
                return new cc0.l.b.ErrorLoading(o0Var.errorVMSFactory.a(o0Var.J9(o0Var.getFamilyCardUC.d(), new er.l() { // from class: cc0.v0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o0.e.a.e0(o0Var, (ib4.c.b) obj);
                    }
                })), str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 e0(o0 o0Var, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.a.Close) {
                    o0Var.d9(cc0.a.f25177a);
                } else if (bVar instanceof ib4.c.b.a.Primary) {
                    o0Var.d9(cc0.f.f25192a);
                }
                return oq.i0.f148189a;
            }

            /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:49:0x01de  */
            /* JADX WARN: Code duplicated, block: B:78:0x0249  */
            /* JADX WARN: Code duplicated, block: B:81:0x025a  */
            /* JADX WARN: Code duplicated, block: B:82:0x0268  */
            /* JADX WARN: Code duplicated, block: B:84:0x026c  */
            /* JADX WARN: Code duplicated, block: B:88:0x027d  */
            /* JADX WARN: Code duplicated, block: B:89:0x028f  */
            /* JADX WARN: Code duplicated, block: B:91:0x0293  */
            /* JADX WARN: Code duplicated, block: B:94:0x029c  */
            /* JADX WARN: Code duplicated, block: B:96:0x02a2  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v13 */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v17 */
            /* JADX WARN: Type inference failed for: r3v18 */
            /* JADX WARN: Type inference failed for: r3v19 */
            /* JADX WARN: Type inference failed for: r3v22 */
            /* JADX WARN: Type inference failed for: r3v25 */
            /* JADX WARN: Type inference failed for: r3v9 */
            /* JADX WARN: Type inference failed for: r4v15 */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v21 */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v19 */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v20 */
            /* JADX WARN: Type inference failed for: r5v21 */
            /* JADX WARN: Type inference failed for: r5v22 */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v6 */
            /* JADX WARN: Type inference failed for: r5v7 */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            /* JADX WARN: Type inference failed for: r6v16 */
            /* JADX WARN: Type inference failed for: r6v4 */
            /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final o0 o0Var;
                k10.c0<cc0.l.Initial> c0Var;
                String message;
                dx.i iVarA;
                Object objB;
                dx.i left;
                final ?? r15;
                Object objB2;
                Object objE;
                ex.b aVar;
                int i15;
                dx.i iVar;
                final xb0.a.FamilyCardData familyCardData;
                Object obj2;
                String str;
                ex.b bVar;
                ex.b bVar2;
                int i16;
                int i17;
                int i18;
                int i19;
                k10.c0<cc0.l.Initial> c0Var2;
                o0 o0Var2;
                int i25;
                ?? r16;
                int i26;
                Bitmap bitmap;
                Object objI9;
                ?? r17;
                final Bitmap bitmap2;
                ex.b bVar3;
                Object objE2 = uq.b.e();
                int i27 = this.f25332z;
                ?? r18 = 3;
                final ?? r19 = 1;
                try {
                    try {
                        if (i27 == 0) {
                            oq.u.b(obj);
                            xb0.a aVar2 = this.A.getFamilyCardUC;
                            xb0.a.Params params = new xb0.a.Params(this.B);
                            this.f25332z = 1;
                            objE = aVar2.e(params, this);
                            if (objE != objE2) {
                            }
                            return objE2;
                        }
                        if (i27 != 1) {
                            if (i27 != 2) {
                                if (i27 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar3 = (ex.b) this.f25323p;
                                Bitmap bitmap3 = (Bitmap) this.f25322n;
                                dx.j jVar = (dx.j) this.f25319k;
                                xb0.a.FamilyCardData familyCardData2 = (xb0.a.FamilyCardData) this.f25318j;
                                r19 = (String) this.f25317h;
                                c0Var = (k10.c0) this.f25316g;
                                o0Var = (o0) this.f25315f;
                                try {
                                    oq.u.b(obj);
                                    familyCardData = familyCardData2;
                                    r17 = jVar;
                                    bitmap2 = bitmap3;
                                    objI9 = obj;
                                    r19 = r19;
                                    try {
                                        final Map map = (Map) bVar3.a((dx.i) objI9);
                                        left = new dx.i.Right(c0Var.d(new er.l() { // from class: cc0.s0
                                            @Override // er.l
                                            public final Object b(Object obj3) {
                                                return o0.e.a.c0(bitmap2, familyCardData, r19, map, (l.Initial) obj3);
                                            }
                                        }));
                                        r15 = r19;
                                    } catch (ex.c e15) {
                                        e = e15;
                                        left = new dx.i.Left((dx.b) ex.d.a(e));
                                        r15 = r19;
                                    } catch (CancellationException e16) {
                                        throw e16;
                                    } catch (Exception e17) {
                                        e = e17;
                                        r18 = r17;
                                        px.f fVar = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar.d(message, e, px.c.a(r18));
                                        iVarA = r18.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        left = new dx.i.Left(objB);
                                        r15 = r19;
                                    }
                                } catch (ex.c e18) {
                                    e = e18;
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                                if (left instanceof dx.i.Left) {
                                    objB2 = c0Var.d(new er.l() { // from class: cc0.t0
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return o0.e.a.d0(o0Var, r15, (l.Initial) obj3);
                                        }
                                    });
                                } else {
                                    if (!(left instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) left).b();
                                }
                                return (k10.l) objB2;
                            }
                            int i28 = this.f25331y;
                            int i29 = this.f25330x;
                            int i35 = this.f25329w;
                            int i36 = this.f25328v;
                            int i37 = this.f25327t;
                            int i38 = this.f25326s;
                            int i39 = this.f25325r;
                            String str2 = (String) this.f25323p;
                            ex.b bVar4 = (ex.b) this.f25322n;
                            ex.b bVar5 = (ex.b) this.f25321m;
                            ex.b bVar6 = (ex.b) this.f25320l;
                            dx.j jVar2 = (dx.j) this.f25319k;
                            familyCardData = (xb0.a.FamilyCardData) this.f25318j;
                            String str3 = (String) this.f25317h;
                            k10.c0<cc0.l.Initial> c0Var3 = (k10.c0) this.f25316g;
                            o0 o0Var3 = (o0) this.f25315f;
                            dx.i iVar2 = (dx.i) this.f25314e;
                            try {
                                oq.u.b(obj);
                                obj2 = obj;
                                iVar = iVar2;
                                i16 = i39;
                                i17 = i36;
                                r16 = str3;
                                r18 = jVar2;
                                i19 = i38;
                                c0Var2 = c0Var3;
                                i26 = i29;
                                bVar = bVar4;
                                aVar = bVar5;
                                i15 = i28;
                                str = str2;
                                o0Var2 = o0Var3;
                                bVar2 = bVar6;
                                i18 = i37;
                                i25 = i35;
                                try {
                                    bitmap = (Bitmap) bVar.a((dx.i) obj2);
                                    List<FamilyCardDocument> listA = familyCardData.getFamilyCards().a();
                                    this.f25314e = vq.j.a(iVar);
                                    this.f25315f = o0Var2;
                                    this.f25316g = c0Var2;
                                    this.f25317h = r16;
                                    this.f25318j = familyCardData;
                                    this.f25319k = r18;
                                    this.f25320l = vq.j.a(bVar2);
                                    this.f25321m = vq.j.a(aVar);
                                    this.f25322n = bitmap;
                                    this.f25323p = aVar;
                                    this.f25324q = vq.j.a(str);
                                    this.f25325r = i16;
                                    this.f25326s = i19;
                                    this.f25327t = i18;
                                    this.f25328v = i17;
                                    this.f25329w = i25;
                                    this.f25330x = i26;
                                    this.f25331y = i15;
                                    this.f25332z = 3;
                                    objI9 = o0Var2.I9(listA, this);
                                    if (objI9 == objE2) {
                                        return objE2;
                                    }
                                    r17 = r18;
                                    r19 = r16;
                                    c0Var = c0Var2;
                                    o0Var = o0Var2;
                                    bitmap2 = bitmap;
                                    bVar3 = aVar;
                                    final Map map2 = (Map) bVar3.a((dx.i) objI9);
                                    left = new dx.i.Right(c0Var.d(new er.l() { // from class: cc0.s0
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return o0.e.a.c0(bitmap2, familyCardData, r19, map2, (l.Initial) obj3);
                                        }
                                    }));
                                    r15 = r19;
                                    if (left instanceof dx.i.Left) {
                                        objB2 = c0Var.d(new er.l() { // from class: cc0.t0
                                            @Override // er.l
                                            public final Object b(Object obj3) {
                                                return o0.e.a.d0(o0Var, r15, (l.Initial) obj3);
                                            }
                                        });
                                    } else {
                                        if (!(left instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) left).b();
                                    }
                                    return (k10.l) objB2;
                                } catch (ex.c e25) {
                                    e = e25;
                                    r19 = r16;
                                    c0Var = c0Var2;
                                    o0Var = o0Var2;
                                } catch (CancellationException e26) {
                                    throw e26;
                                } catch (Exception e27) {
                                    e = e27;
                                    r19 = r16;
                                    c0Var = c0Var2;
                                    o0Var = o0Var2;
                                    px.f fVar2 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r18));
                                    iVarA = r18.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    left = new dx.i.Left(objB);
                                    r15 = r19;
                                    if (left instanceof dx.i.Left) {
                                        objB2 = c0Var.d(new er.l() { // from class: cc0.t0
                                            @Override // er.l
                                            public final Object b(Object obj3) {
                                                return o0.e.a.d0(o0Var, r15, (l.Initial) obj3);
                                            }
                                        });
                                    } else {
                                        if (!(left instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) left).b();
                                    }
                                    return (k10.l) objB2;
                                }
                            } catch (ex.c e28) {
                                e = e28;
                                r19 = str3;
                                c0Var = c0Var3;
                                o0Var = o0Var3;
                            } catch (CancellationException e29) {
                                throw e29;
                            } catch (Exception e35) {
                                e = e35;
                                r19 = str3;
                                r18 = jVar2;
                                c0Var = c0Var3;
                                o0Var = o0Var3;
                                px.f fVar3 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar3.d(message, e, px.c.a(r18));
                                iVarA = r18.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                                r15 = r19;
                                if (left instanceof dx.i.Left) {
                                    objB2 = c0Var.d(new er.l() { // from class: cc0.t0
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return o0.e.a.d0(o0Var, r15, (l.Initial) obj3);
                                        }
                                    });
                                } else {
                                    if (!(left instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) left).b();
                                }
                                return (k10.l) objB2;
                            }
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                            r15 = r19;
                            if (left instanceof dx.i.Left) {
                                objB2 = c0Var.d(new er.l() { // from class: cc0.t0
                                    @Override // er.l
                                    public final Object b(Object obj3) {
                                        return o0.e.a.d0(o0Var, r15, (l.Initial) obj3);
                                    }
                                });
                            } else {
                                if (!(left instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB2 = ((dx.i.Right) left).b();
                            }
                            return (k10.l) objB2;
                        }
                        oq.u.b(obj);
                        objE = obj;
                        dx.i iVar3 = (dx.i) objE;
                        c0Var = this.C;
                        o0Var = this.A;
                        r19 = this.B;
                        if (iVar3 instanceof dx.i.Left) {
                            final dx.b bVar7 = (dx.b) ((dx.i.Left) iVar3).b();
                            return c0Var.d(new er.l() { // from class: cc0.r0
                                @Override // er.l
                                public final Object b(Object obj3) {
                                    return o0.e.a.a0(o0Var, bVar7, r19, (l.Initial) obj3);
                                }
                            });
                        }
                        if (!(iVar3 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        xb0.a.FamilyCardData familyCardData3 = (xb0.a.FamilyCardData) ((dx.i.Right) iVar3).b();
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            String photo = familyCardData3.getPhotoData().getPhoto();
                            if (photo == null) {
                                aVar.b(new dx.b.Generic(new Exception("photo is null")));
                                throw new oq.g();
                            }
                            b00.c cVar = o0Var.imageConverter;
                            this.f25314e = vq.j.a(iVar3);
                            this.f25315f = o0Var;
                            this.f25316g = c0Var;
                            this.f25317h = r19;
                            this.f25318j = familyCardData3;
                            this.f25319k = jVarA;
                            this.f25320l = vq.j.a(aVar);
                            this.f25321m = aVar;
                            this.f25322n = aVar;
                            this.f25323p = vq.j.a(photo);
                            i15 = 0;
                            this.f25325r = 0;
                            this.f25326s = 0;
                            this.f25327t = 0;
                            this.f25328v = 0;
                            this.f25329w = 0;
                            this.f25330x = 0;
                            this.f25331y = 0;
                            this.f25332z = 2;
                            Object objB3 = cVar.b(photo, this);
                            if (objB3 != objE2) {
                                iVar = iVar3;
                                familyCardData = familyCardData3;
                                obj2 = objB3;
                                r18 = jVarA;
                                str = photo;
                                bVar = aVar;
                                bVar2 = bVar;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                c0Var2 = c0Var;
                                o0Var2 = o0Var;
                                i25 = 0;
                                r16 = r19;
                                i26 = 0;
                                bitmap = (Bitmap) bVar.a((dx.i) obj2);
                                List<FamilyCardDocument> listA2 = familyCardData.getFamilyCards().a();
                                this.f25314e = vq.j.a(iVar);
                                this.f25315f = o0Var2;
                                this.f25316g = c0Var2;
                                this.f25317h = r16;
                                this.f25318j = familyCardData;
                                this.f25319k = r18;
                                this.f25320l = vq.j.a(bVar2);
                                this.f25321m = vq.j.a(aVar);
                                this.f25322n = bitmap;
                                this.f25323p = aVar;
                                this.f25324q = vq.j.a(str);
                                this.f25325r = i16;
                                this.f25326s = i19;
                                this.f25327t = i18;
                                this.f25328v = i17;
                                this.f25329w = i25;
                                this.f25330x = i26;
                                this.f25331y = i15;
                                this.f25332z = 3;
                                objI9 = o0Var2.I9(listA2, this);
                                if (objI9 == objE2) {
                                    return objE2;
                                }
                                r17 = r18;
                                r19 = r16;
                                c0Var = c0Var2;
                                o0Var = o0Var2;
                                bitmap2 = bitmap;
                                bVar3 = aVar;
                                final Map map3 = (Map) bVar3.a((dx.i) objI9);
                                left = new dx.i.Right(c0Var.d(new er.l() { // from class: cc0.s0
                                    @Override // er.l
                                    public final Object b(Object obj3) {
                                        return o0.e.a.c0(bitmap2, familyCardData, r19, map3, (l.Initial) obj3);
                                    }
                                }));
                                r15 = r19;
                                if (left instanceof dx.i.Left) {
                                    objB2 = c0Var.d(new er.l() { // from class: cc0.t0
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return o0.e.a.d0(o0Var, r15, (l.Initial) obj3);
                                        }
                                    });
                                } else {
                                    if (!(left instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) left).b();
                                }
                                return (k10.l) objB2;
                            }
                            return objE2;
                        } catch (ex.c e36) {
                            e = e36;
                        } catch (CancellationException e37) {
                            throw e37;
                        } catch (Exception e38) {
                            e = e38;
                            r18 = jVarA;
                            px.f fVar4 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar4.d(message, e, px.c.a(r18));
                            iVarA = r18.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                            r15 = r19;
                            if (left instanceof dx.i.Left) {
                                objB2 = c0Var.d(new er.l() { // from class: cc0.t0
                                    @Override // er.l
                                    public final Object b(Object obj3) {
                                        return o0.e.a.d0(o0Var, r15, (l.Initial) obj3);
                                    }
                                });
                            } else {
                                if (!(left instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB2 = ((dx.i.Right) left).b();
                            }
                            return (k10.l) objB2;
                        }
                    } catch (CancellationException e39) {
                        throw e39;
                    }
                } catch (Exception e45) {
                    e = e45;
                }
            }

            public final tq.e<oq.i0> Y(tq.e<?> eVar) {
                return new a(this.A, this.B, this.C, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends cc0.l>> eVar) {
                return ((a) Y(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k10.z<cc0.l.Initial, cc0.l, n20.a> zVar, o0 o0Var, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f25312j = zVar;
            this.f25313k = o0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.b.ErrorInitial V(final o0 o0Var, cc0.l.Initial initial) {
            return new cc0.l.b.ErrorInitial(o0Var.errorVMSFactory.a(o0Var.J9(new dx.b.Generic(null, 1, null), new er.l() { // from class: cc0.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return o0.e.X(o0Var, (ib4.c.b) obj);
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(o0 o0Var, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                o0Var.d9(cc0.a.f25177a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e eVar;
            k10.c0 c0Var = (k10.c0) this.f25311h;
            Object objE = uq.b.e();
            int i15 = this.f25310g;
            if (i15 == 0) {
                oq.u.b(obj);
                String documentId = ((cc0.l.Initial) c0Var.a()).getDocumentId();
                if (documentId != null) {
                    o0 o0Var = this.f25313k;
                    ac4.a aVar = o0Var.callActionWithLoaderUseCase;
                    a aVar2 = new a(o0Var, documentId, c0Var, null);
                    this.f25311h = c0Var;
                    this.f25308e = vq.j.a(documentId);
                    this.f25309f = 0;
                    this.f25310g = 1;
                    eVar = this;
                    obj = ac4.a.a(aVar, null, aVar2, eVar, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    eVar = this;
                }
                final o0 o0Var2 = eVar.f25313k;
                return c0Var.d(new er.l() { // from class: cc0.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o0.e.V(o0Var2, (l.Initial) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            eVar = this;
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            final o0 o0Var3 = eVar.f25313k;
            return c0Var.d(new er.l() { // from class: cc0.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.e.V(o0Var3, (l.Initial) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<cc0.l.Initial> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f25312j, this.f25313k, eVar);
            eVar2.f25311h = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcc0/g;", "action", "Lcc0/l$d$a;", "state", "Loq/i0;", "<anonymous>", "(Lcc0/g;Lcc0/l$d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<GoToVerification, cc0.l.d.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25334f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cc0.l.d.Displaying displaying = (cc0.l.d.Displaying) this.f25334f;
            Object objE = uq.b.e();
            int i15 = this.f25333e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cc0.h> bVarY1 = o0.this.Y1();
                cc0.h.GoToVerification goToVerification = new cc0.h.GoToVerification(o0.this.verificationDataMapper.b(new ac0.h.Params(displaying)));
                this.f25334f = vq.j.a(displaying);
                this.f25333e = 1;
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
        public final Object w(GoToVerification goToVerification, cc0.l.d.Displaying displaying, tq.e<? super oq.i0> eVar) {
            f fVar = o0.this.new f(eVar);
            fVar.f25334f = displaying;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/a;", "<unused var>", "Lk10/c0;", "Lcc0/l$d$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<cc0.a, k10.c0<cc0.l.d.Displaying>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25337f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Displaying V(k10.c0 c0Var, cc0.l.d.Displaying displaying) {
            return cc0.l.d.Displaying.e(displaying, null, cc0.l.StateData.b(((cc0.l.d.Displaying) c0Var.a()).getStateData(), null, null, null, null, null, false, null, null, 223, null), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Displaying X(k10.c0 c0Var, cc0.l.d.Displaying displaying) {
            return cc0.l.d.Displaying.e(displaying, null, cc0.l.StateData.b(displaying.getStateData(), null, null, null, ((cc0.l.d.Displaying) c0Var.a()).getStateData().getFamilyCards().getOwnerCard(), null, false, null, null, 247, null), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            FamilyDataContainer data;
            final k10.c0 c0Var = (k10.c0) this.f25337f;
            Object objE = uq.b.e();
            int i15 = this.f25336e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (((cc0.l.d.Displaying) c0Var.a()).getStateData().getIsBottomSheetVisible()) {
                    return c0Var.b(new er.l() { // from class: cc0.w0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.g.V(c0Var, (l.d.Displaying) obj2);
                        }
                    });
                }
                FamilyCardScope scopeData = ((cc0.l.d.Displaying) c0Var.a()).getStateData().getSelectedCard().getScopeData();
                boolean z15 = false;
                if (scopeData != null && (data = scopeData.getData()) != null && data.g()) {
                    z15 = true;
                }
                if (!z15) {
                    if (z15) {
                        throw new oq.p();
                    }
                    return c0Var.b(new er.l() { // from class: cc0.x0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.g.X(c0Var, (l.d.Displaying) obj2);
                        }
                    });
                }
                xw.b<cc0.h> bVarY1 = o0.this.Y1();
                cc0.h.a aVar = cc0.h.a.f25200a;
                this.f25337f = c0Var;
                this.f25336e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(cc0.a aVar, k10.c0<cc0.l.d.Displaying> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            g gVar = o0.this.new g(eVar);
            gVar.f25337f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/b;", "action", "Lk10/c0;", "Lcc0/l$d$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ChangeBottomSheetVisibility, k10.c0<cc0.l.d.Displaying>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25340f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f25341g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Displaying O(k10.c0 c0Var, ChangeBottomSheetVisibility changeBottomSheetVisibility, cc0.l.d.Displaying displaying) {
            return cc0.l.d.Displaying.e(displaying, null, cc0.l.StateData.b(((cc0.l.d.Displaying) c0Var.a()).getStateData(), null, null, null, null, null, changeBottomSheetVisibility.getVisible(), null, null, 223, null), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeBottomSheetVisibility changeBottomSheetVisibility = (ChangeBottomSheetVisibility) this.f25340f;
            final k10.c0 c0Var = (k10.c0) this.f25341g;
            uq.b.e();
            if (this.f25339e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: cc0.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.h.O(c0Var, changeBottomSheetVisibility, (l.d.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeBottomSheetVisibility changeBottomSheetVisibility, k10.c0<cc0.l.d.Displaying> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            h hVar = new h(eVar);
            hVar.f25340f = changeBottomSheetVisibility;
            hVar.f25341g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/d;", "action", "Lk10/c0;", "Lcc0/l$d$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ChangeSwitchItem, k10.c0<cc0.l.d.Displaying>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f25344g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Displaying O(ChangeSwitchItem changeSwitchItem, cc0.l.d.Displaying displaying) {
            return cc0.l.d.Displaying.e(displaying, null, cc0.l.StateData.b(displaying.getStateData(), null, null, null, null, changeSwitchItem.getSwitchItem(), false, null, null, 239, null), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeSwitchItem changeSwitchItem = (ChangeSwitchItem) this.f25343f;
            k10.c0 c0Var = (k10.c0) this.f25344g;
            uq.b.e();
            if (this.f25342e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: cc0.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.i.O(changeSwitchItem, (l.d.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeSwitchItem changeSwitchItem, k10.c0<cc0.l.d.Displaying> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            i iVar = new i(eVar);
            iVar.f25343f = changeSwitchItem;
            iVar.f25344g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/c;", "action", "Lk10/c0;", "Lcc0/l$d$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ChangeCard, k10.c0<cc0.l.d.Displaying>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f25347g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Displaying O(ChangeCard changeCard, cc0.l.d.Displaying displaying) {
            return cc0.l.d.Displaying.e(displaying, null, cc0.l.StateData.b(displaying.getStateData(), null, null, null, changeCard.getCard(), null, false, null, null, 247, null), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeCard changeCard = (ChangeCard) this.f25346f;
            k10.c0 c0Var = (k10.c0) this.f25347g;
            uq.b.e();
            if (this.f25345e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: cc0.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.j.O(changeCard, (l.d.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeCard changeCard, k10.c0<cc0.l.d.Displaying> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            j jVar = new j(eVar);
            jVar.f25346f = changeCard;
            jVar.f25347g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/k;", "action", "Lk10/c0;", "Lcc0/l$d$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<cc0.k, k10.c0<cc0.l.d.Displaying>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25349f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Updating O(k10.c0 c0Var, cc0.l.d.Displaying displaying) {
            return new cc0.l.d.Updating(((cc0.l.d.Displaying) c0Var.a()).getDialogVMSAdapter(), ((cc0.l.d.Displaying) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            MnemonicHeaderContainer header;
            OffsetDateTime ts4;
            OffsetDateTime offsetDateTimePlus;
            final k10.c0 c0Var = (k10.c0) this.f25349f;
            uq.b.e();
            if (this.f25348e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            FamilyCardScope scopeData = ((cc0.l.d.Displaying) c0Var.a()).getStateData().getSelectedCard().getScopeData();
            if ((scopeData == null || (header = scopeData.getHeader()) == null || (ts4 = header.getTs()) == null || (offsetDateTimePlus = ts4.plus(5L, (TemporalUnit) ChronoUnit.MINUTES)) == null) ? true : offsetDateTimePlus.isBefore(OffsetDateTime.now())) {
                return c0Var.d(new er.l() { // from class: cc0.b1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o0.k.O(c0Var, (l.d.Displaying) obj2);
                    }
                });
            }
            o0.this.y(new p50.a.DefaultWithIcon(o0.this.familyCardMapper.q(), false, null, null, 14, null));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cc0.k kVar, k10.c0<cc0.l.d.Displaying> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            k kVar2 = o0.this.new k(eVar);
            kVar2.f25349f = c0Var;
            return kVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcc0/i;", "action", "Lcc0/l$d$a;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lcc0/i;Lcc0/l$d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<cc0.i, cc0.l.d.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25351e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f25351e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = o0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(o0.this.commonEndpoints.y(), false, 2, null);
                this.f25351e = 1;
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
            o0 o0Var = o0.this;
            if (iVar instanceof dx.i.Left) {
                o0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(oq.i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cc0.i iVar, cc0.l.d.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return o0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/j;", "action", "Lk10/c0;", "Lcc0/l$d$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ShowDialog, k10.c0<cc0.l.d.Displaying>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f25355g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Displaying O(o0 o0Var, ShowDialog showDialog, cc0.l.d.Displaying displaying) {
            return cc0.l.d.Displaying.e(displaying, o0Var.dialogVmsFactory.a(showDialog.getDialog()), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f25354f;
            k10.c0 c0Var = (k10.c0) this.f25355g;
            uq.b.e();
            if (this.f25353e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o0 o0Var = o0.this;
            return c0Var.d(new er.l() { // from class: cc0.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.m.O(o0Var, showDialog, (l.d.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<cc0.l.d.Displaying> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            m mVar = o0.this.new m(eVar);
            mVar.f25354f = showDialog;
            mVar.f25355g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/e;", "action", "Lk10/c0;", "Lcc0/l$d$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<cc0.e, k10.c0<cc0.l.d.Displaying>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25358f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Displaying O(cc0.l.d.Displaying displaying) {
            return cc0.l.d.Displaying.e(displaying, null, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f25358f;
            uq.b.e();
            if (this.f25357e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cc0.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.n.O((l.d.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cc0.e eVar, k10.c0<cc0.l.d.Displaying> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar2) {
            n nVar = new n(eVar2);
            nVar.f25358f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/f;", "action", "Lk10/c0;", "Lcc0/l$d$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<cc0.f, k10.c0<cc0.l.d.Displaying>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25360f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.DeleteDocument O(k10.c0 c0Var, cc0.l.d.Displaying displaying) {
            return new cc0.l.DeleteDocument(((cc0.l.d.Displaying) c0Var.a()).getStateData().getParentDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f25360f;
            uq.b.e();
            if (this.f25359e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cc0.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.o.O(c0Var, (l.d.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cc0.f fVar, k10.c0<cc0.l.d.Displaying> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            o oVar = new o(eVar);
            oVar.f25360f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lcc0/l$d$b;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<k10.c0<cc0.l.d.Updating>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25362f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcc0/l;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends cc0.l>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f25364e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f25365f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f25366g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f25367h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f25368j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f25369k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ o0 f25370l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<cc0.l.d.Updating> f25371m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, k10.c0<cc0.l.d.Updating> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f25370l = o0Var;
                this.f25371m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cc0.l.b.ErrorUpdating X(k10.c0 c0Var, final o0 o0Var, dx.b bVar, cc0.l.d.Updating updating) {
                return new cc0.l.b.ErrorUpdating(o0Var.errorVMSFactory.a(o0Var.J9(bVar, new er.l() { // from class: cc0.g1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o0.p.a.Y(o0Var, (ib4.c.b) obj);
                    }
                })), ((cc0.l.d.Updating) c0Var.a()).getDialogVMSAdapter(), ((cc0.l.d.Updating) c0Var.a()).getStateData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(o0 o0Var, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    o0Var.d9(cc0.k.f25210a);
                } else {
                    o0Var.d9(cc0.a.f25177a);
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<cc0.l.d.Updating> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f25369k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wb0.a aVar = this.f25370l.documentStorageInteractor;
                    String parentDocumentId = this.f25371m.a().getStateData().getParentDocumentId();
                    this.f25369k = 1;
                    obj = aVar.c(parentDocumentId, this);
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
                    c0Var = (k10.c0) this.f25365f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<cc0.l.d.Updating> c0Var2 = this.f25371m;
                final o0 o0Var = this.f25370l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: cc0.f1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.p.a.X(c0Var2, o0Var, bVar, (l.d.Updating) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                String str = (String) ((dx.i.Right) iVar).b();
                xw.b<cc0.h> bVarY1 = o0Var.Y1();
                cc0.h.ShowDocumentLoader showDocumentLoader = new cc0.h.ShowDocumentLoader(str);
                this.f25364e = vq.j.a(iVar);
                this.f25365f = c0Var2;
                this.f25366g = vq.j.a(str);
                this.f25367h = 0;
                this.f25368j = 0;
                this.f25369k = 2;
                if (bVarY1.F(showDocumentLoader, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f25370l, this.f25371m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends cc0.l>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f25362f;
            Object objE = uq.b.e();
            int i15 = this.f25361e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = o0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(o0.this, c0Var, null);
            this.f25362f = vq.j.a(c0Var);
            this.f25361e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<cc0.l.d.Updating> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            return ((p) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = o0.this.new p(eVar);
            pVar.f25362f = obj;
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/a;", "<unused var>", "Lk10/c0;", "Lcc0/l$b$c;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<cc0.a, k10.c0<cc0.l.b.ErrorUpdating>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25373f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Displaying O(k10.c0 c0Var, cc0.l.b.ErrorUpdating errorUpdating) {
            return new cc0.l.d.Displaying(null, ((cc0.l.b.ErrorUpdating) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f25373f;
            uq.b.e();
            if (this.f25372e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cc0.h1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.q.O(c0Var, (l.b.ErrorUpdating) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cc0.a aVar, k10.c0<cc0.l.b.ErrorUpdating> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            q qVar = new q(eVar);
            qVar.f25373f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/k;", "action", "Lk10/c0;", "Lcc0/l$b$c;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<cc0.k, k10.c0<cc0.l.b.ErrorUpdating>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25375f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.d.Updating O(k10.c0 c0Var, cc0.l.b.ErrorUpdating errorUpdating) {
            return new cc0.l.d.Updating(null, ((cc0.l.b.ErrorUpdating) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f25375f;
            uq.b.e();
            if (this.f25374e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cc0.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.r.O(c0Var, (l.b.ErrorUpdating) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cc0.k kVar, k10.c0<cc0.l.b.ErrorUpdating> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            r rVar = new r(eVar);
            rVar.f25375f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcc0/a;", "<unused var>", "Lcc0/l$b$a;", "Loq/i0;", "<anonymous>", "(Lcc0/a;Lcc0/l$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<cc0.a, cc0.l.b.ErrorInitial, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25376e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f25376e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cc0.h> bVarY1 = o0.this.Y1();
                cc0.h.a aVar = cc0.h.a.f25200a;
                this.f25376e = 1;
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
        public final Object w(cc0.a aVar, cc0.l.b.ErrorInitial errorInitial, tq.e<? super oq.i0> eVar) {
            return o0.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcc0/a;", "<unused var>", "Lcc0/l$b$b;", "Loq/i0;", "<anonymous>", "(Lcc0/a;Lcc0/l$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<cc0.a, cc0.l.b.ErrorLoading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25378e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f25378e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cc0.h> bVarY1 = o0.this.Y1();
                cc0.h.a aVar = cc0.h.a.f25200a;
                this.f25378e = 1;
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
        public final Object w(cc0.a aVar, cc0.l.b.ErrorLoading errorLoading, tq.e<? super oq.i0> eVar) {
            return o0.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcc0/f;", "action", "Lk10/c0;", "Lcc0/l$b$b;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lcc0/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<cc0.f, k10.c0<cc0.l.b.ErrorLoading>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25381f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cc0.l.DeleteDocument O(k10.c0 c0Var, cc0.l.b.ErrorLoading errorLoading) {
            return new cc0.l.DeleteDocument(((cc0.l.b.ErrorLoading) c0Var.a()).getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f25381f;
            uq.b.e();
            if (this.f25380e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cc0.j1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.u.O(c0Var, (l.b.ErrorLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cc0.f fVar, k10.c0<cc0.l.b.ErrorLoading> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            u uVar = new u(eVar);
            uVar.f25381f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lcc0/l$a;", "state", "Lk10/l;", "Lcc0/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.p<k10.c0<cc0.l.DeleteDocument>, tq.e<? super k10.l<? extends cc0.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25383f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcc0/l;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends cc0.l>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f25385e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f25386f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f25387g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f25388h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f25389j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f25390k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ o0 f25391l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<cc0.l.DeleteDocument> f25392m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, k10.c0<cc0.l.DeleteDocument> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f25391l = o0Var;
                this.f25392m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cc0.l.b.ErrorLoading X(final o0 o0Var, dx.b bVar, k10.c0 c0Var, cc0.l.DeleteDocument deleteDocument) {
                return new cc0.l.b.ErrorLoading(o0Var.errorVMSFactory.a(o0Var.J9(bVar, new er.l() { // from class: cc0.l1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o0.v.a.Y(o0Var, (ib4.c.b) obj);
                    }
                })), ((cc0.l.DeleteDocument) c0Var.a()).getDocumentId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(o0 o0Var, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    o0Var.d9(cc0.a.f25177a);
                } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    o0Var.d9(cc0.f.f25192a);
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<cc0.l.DeleteDocument> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f25390k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wb0.a aVar = this.f25391l.documentStorageInteractor;
                    String documentId = this.f25392m.a().getDocumentId();
                    this.f25390k = 1;
                    obj = aVar.b(documentId, this);
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
                    c0Var = (k10.c0) this.f25386f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<cc0.l.DeleteDocument> c0Var2 = this.f25392m;
                final o0 o0Var = this.f25391l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: cc0.k1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.v.a.X(o0Var, bVar, c0Var2, (l.DeleteDocument) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                xw.b<cc0.h> bVarY1 = o0Var.Y1();
                cc0.h.a aVar2 = cc0.h.a.f25200a;
                this.f25385e = vq.j.a(iVar);
                this.f25386f = c0Var2;
                this.f25387g = vq.j.a(i0Var);
                this.f25388h = 0;
                this.f25389j = 0;
                this.f25390k = 2;
                if (bVarY1.F(aVar2, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f25391l, this.f25392m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends cc0.l>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        v(tq.e<? super v> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f25383f;
            Object objE = uq.b.e();
            int i15 = this.f25382e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = o0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(o0.this, c0Var, null);
            this.f25383f = vq.j.a(c0Var);
            this.f25382e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<cc0.l.DeleteDocument> c0Var, tq.e<? super k10.l<? extends cc0.l>> eVar) {
            return ((v) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            v vVar = o0.this.new v(eVar);
            vVar.f25383f = obj;
            return vVar;
        }
    }

    public o0(n20.j jVar, ac4.a aVar, u04.a aVar2, t2.a aVar3, cb4.j jVar2, wb0.a aVar4, hb4.d dVar, ac0.g gVar, ac0.h hVar, ib4.c cVar, xb0.a aVar5, b00.c cVar2, a14.w wVar, i70.n nVar, wz.a aVar6, a.SetupData setupData) {
        this.callActionWithLoaderUseCase = aVar;
        this.commonEndpoints = aVar2;
        this.deps = aVar3;
        this.dialogVmsFactory = jVar2;
        this.documentStorageInteractor = aVar4;
        this.errorVMSFactory = dVar;
        this.familyCardMapper = gVar;
        this.verificationDataMapper = hVar;
        this.genericDomainErrorMapper = cVar;
        this.getFamilyCardUC = aVar5;
        this.imageConverter = cVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.barcodeGenerator = aVar6;
        this.setupData = setupData;
        cc0.l.Initial initial = new cc0.l.Initial(setupData.getDocumentId());
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(initial, new er.l() { // from class: cc0.e0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.S9(this.f25190a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), cc0.m.a.b.f25238a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00d1 A[Catch: Exception -> 0x016c, c -> 0x016e, CancellationException -> 0x0172, TryCatch #5 {c -> 0x016e, CancellationException -> 0x0172, Exception -> 0x016c, blocks: (B:31:0x0152, B:25:0x00cb, B:27:0x00d1, B:38:0x0176), top: B:59:0x0152 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x008a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:15:0x008a */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0148 -> B:59:0x0152). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object I9(java.util.List<vb0.FamilyCardDocument> r25, tq.e<? super dx.i<? extends dx.b, ? extends java.util.Map<java.lang.String, android.graphics.Bitmap>>> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc0.o0.I9(java.util.List, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b J9(dx.b domainError, er.l<? super ib4.c.b, oq.i0> resultAction) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, resultAction, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cc0.m.a K9(State<cc0.l> state) {
        return this.familyCardMapper.b(new ac0.g.Params(state, b9(cc0.a.f25177a), new t2(this.deps, androidx.p016lifecycle.u0.a(this)), new er.l() { // from class: cc0.l0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.L9(this.f25235a, (n20.a) obj);
            }
        }, new er.l() { // from class: cc0.m0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.M9(this.f25248a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: cc0.n0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.N9(this.f25251a, (String) obj);
            }
        }, new er.l() { // from class: cc0.b0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.O9(this.f25181a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: cc0.c0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.P9(this.f25184a, (FamilyCardDocument) obj);
            }
        }, b9(cc0.i.f25204a), b9(cc0.f.f25192a), new er.l() { // from class: cc0.d0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Q9(this.f25188a, (DialogData) obj);
            }
        }, b9(cc0.e.f25189a), b9(cc0.k.f25210a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(o0 o0Var, n20.a aVar) {
        o0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(o0 o0Var, boolean z15) {
        o0Var.d9(new ChangeBottomSheetVisibility(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(o0 o0Var, String str) {
        o0Var.d9(new GoToVerification(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(o0 o0Var, y30.n.Switch.EnumC5973b enumC5973b) {
        o0Var.d9(new ChangeSwitchItem(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(o0 o0Var, FamilyCardDocument familyCardDocument) {
        o0Var.d9(new ChangeCard(familyCardDocument));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(o0 o0Var, DialogData dialogData) {
        o0Var.d9(new ShowDialog(dialogData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(final o0 o0Var, k10.v vVar) {
        vVar.c(fr.q0.c(cc0.l.Initial.class), new er.l() { // from class: cc0.a0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.T9(this.f25178a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cc0.l.d.Displaying.class), new er.l() { // from class: cc0.f0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.U9(this.f25193a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cc0.l.d.Updating.class), new er.l() { // from class: cc0.g0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.V9(this.f25198a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cc0.l.b.ErrorUpdating.class), new er.l() { // from class: cc0.h0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.W9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cc0.l.b.ErrorInitial.class), new er.l() { // from class: cc0.i0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.X9(this.f25205a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cc0.l.b.ErrorLoading.class), new er.l() { // from class: cc0.j0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Y9(this.f25208a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cc0.l.DeleteDocument.class), new er.l() { // from class: cc0.k0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Z9(this.f25211a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(o0 o0Var, k10.z zVar) {
        d dVar = o0Var.new d(null);
        zVar.x(fr.q0.c(cc0.a.class), k10.o.CANCEL_PREVIOUS, dVar);
        zVar.A(new e(zVar, o0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(o0 o0Var, k10.z zVar) {
        g gVar = o0Var.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(cc0.a.class), oVar, gVar);
        zVar.v(fr.q0.c(ChangeBottomSheetVisibility.class), oVar, new h(null));
        zVar.v(fr.q0.c(ChangeSwitchItem.class), oVar, new i(null));
        zVar.v(fr.q0.c(ChangeCard.class), oVar, new j(null));
        zVar.v(fr.q0.c(cc0.k.class), oVar, o0Var.new k(null));
        zVar.x(fr.q0.c(cc0.i.class), oVar, o0Var.new l(null));
        zVar.v(fr.q0.c(ShowDialog.class), oVar, o0Var.new m(null));
        zVar.v(fr.q0.c(cc0.e.class), oVar, new n(null));
        zVar.v(fr.q0.c(cc0.f.class), oVar, new o(null));
        zVar.x(fr.q0.c(GoToVerification.class), oVar, o0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(k10.z zVar) {
        q qVar = new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(cc0.a.class), oVar, qVar);
        zVar.v(fr.q0.c(cc0.k.class), oVar, new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(o0 o0Var, k10.z zVar) {
        s sVar = o0Var.new s(null);
        zVar.x(fr.q0.c(cc0.a.class), k10.o.CANCEL_PREVIOUS, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(o0 o0Var, k10.z zVar) {
        t tVar = o0Var.new t(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(cc0.a.class), oVar, tVar);
        zVar.v(fr.q0.c(cc0.f.class), oVar, new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new v(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: R9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(cc0.m.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<cc0.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<cc0.l>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<cc0.m.a> getState() {
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
