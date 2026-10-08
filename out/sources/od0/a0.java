package od0;

import android.graphics.Bitmap;
import cg0.SchoolCardDocument;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001oB\u0083\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b)\u0010*J5\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u00020.2\u0006\u00108\u001a\u000207H\u0096\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010c\u001a\b\u0012\u0004\u0012\u00020^0]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR,\u0010i\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR \u0010'\u001a\b\u0012\u0004\u0012\u00020(0j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lod0/a0;", "Ll00/g;", "Ln20/b;", "Lod0/i;", "Ln20/a;", "Lod0/j;", "", "Li70/e;", "Ln20/j;", "stateMachineFactory", "Leg0/k;", "getSchoolCardUC", "Ldf0/n;", "requestDocumentUpdateUC", "Lnd0/i;", "schoolCardMapper", "Lnd0/j;", "verificationDataMapper", "Lb00/c;", "imageConverter", "Lo20/t2$a;", "deps", "Leg0/d;", "deleteDocumentByIDUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lnd0/b;", "schoolCardErrorMapper", "Lhb4/d;", "errorVMSFactory", "Leg0/n;", "isContainMultipleSchoolCardsUC", "globalSnackBarManager", "Lmx/c;", "labelProvider", "Lod0/a0$a$a;", "setupData", "<init>", "(Ln20/j;Leg0/k;Ldf0/n;Lnd0/i;Lnd0/j;Lb00/c;Lo20/t2$a;Leg0/d;Lac4/a;Lnd0/b;Lhb4/d;Leg0/n;Li70/e;Lmx/c;Lod0/a0$a$a;)V", "state", "Lod0/j$a;", "J9", "(Ln20/b;)Lod0/j$a;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "G9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "Ldx/b$c;", "F9", "()Ldx/b$c;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Leg0/k;", "c", "Ldf0/n;", "d", "Lnd0/i;", "e", "Lnd0/j;", "f", "Lb00/c;", "g", "Lo20/t2$a;", "h", "Leg0/d;", "j", "Lac4/a;", "k", "Lnd0/b;", "l", "Lhb4/d;", "m", "Leg0/n;", "n", "Li70/e;", "p", "Lmx/c;", "q", "Lod0/a0$a$a;", "Lod0/i$d;", "r", "Lod0/i$d;", "initialState", "Lxw/b;", "Lod0/e;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<State<od0.i>, n20.a> implements od0.j, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eg0.k getSchoolCardUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final df0.n requestDocumentUpdateUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nd0.i schoolCardMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final nd0.j verificationDataMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final eg0.d deleteDocumentByIDUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final nd0.b schoolCardErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final eg0.n isContainMultipleSchoolCardsUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final od0.i.Initial initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<od0.e> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<od0.i>, n20.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<od0.j.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lod0/a0$a;", "Lf00/j0;", "Lod0/a0$a$a;", "Lod0/a0;", "a", "schoolcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<SetupData, a0> {

        /* JADX INFO: renamed from: od0.a0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lod0/a0$a$a;", "", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "schoolcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static final class b implements mu.g<od0.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f144832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f144833b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f144834a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f144835b;

            /* JADX INFO: renamed from: od0.a0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3593a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f144836d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f144837e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f144838f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f144840h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f144841j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f144842k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f144843l;

                public C3593a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f144836d = obj;
                    this.f144837e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, a0 a0Var) {
                this.f144834a = hVar;
                this.f144835b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3593a c3593a;
                if (eVar instanceof C3593a) {
                    c3593a = (C3593a) eVar;
                    int i15 = c3593a.f144837e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3593a.f144837e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3593a = new C3593a(eVar);
                    }
                } else {
                    c3593a = new C3593a(eVar);
                }
                Object obj2 = c3593a.f144836d;
                Object objE = uq.b.e();
                int i16 = c3593a.f144837e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f144834a;
                    od0.j.a aVarJ9 = this.f144835b.J9((State) obj);
                    c3593a.f144838f = vq.j.a(obj);
                    c3593a.f144840h = vq.j.a(c3593a);
                    c3593a.f144841j = vq.j.a(obj);
                    c3593a.f144842k = vq.j.a(hVar);
                    c3593a.f144843l = 0;
                    c3593a.f144837e = 1;
                    if (hVar.F(aVarJ9, c3593a) == objE) {
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

        public b(mu.g gVar, a0 a0Var) {
            this.f144832a = gVar;
            this.f144833b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super od0.j.a> hVar, tq.e eVar) {
            Object objA = this.f144832a.a(new a(hVar, this.f144833b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lod0/a;", "<unused var>", "Lod0/i;", "Loq/i0;", "<anonymous>", "(Lod0/a;Lod0/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<od0.a, od0.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144844e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f144844e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<od0.e> bVarY1 = a0.this.Y1();
                od0.e.a aVar = od0.e.a.f144909a;
                this.f144844e = 1;
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
        public final Object w(od0.a aVar, od0.i iVar, tq.e<? super oq.i0> eVar) {
            return a0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lod0/i$d;", "state", "Lk10/l;", "Lod0/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<od0.i.Initial>, tq.e<? super k10.l<? extends od0.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f144846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f144847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f144848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f144849h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.z<od0.i.Initial, od0.i, n20.a> f144850j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a0 f144851k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lod0/i;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends od0.i>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f144852e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f144853f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f144854g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f144855h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f144856j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f144857k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f144858l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f144859m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ a0 f144860n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f144861p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<od0.i.Initial> f144862q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, String str, k10.c0<od0.i.Initial> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f144860n = a0Var;
                this.f144861p = str;
                this.f144862q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final od0.i.ErrorLoading Z(a0 a0Var, String str, od0.i.Initial initial) {
                return new od0.i.ErrorLoading(a0Var.errorVMSFactory.a(a0.H9(a0Var, a0Var.F9(), new er.a() { // from class: od0.f0
                    @Override // er.a
                    public final Object a() {
                        return a0.d.a.a0();
                    }
                }, null, 4, null)), str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 a0() {
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final od0.i b0(Bitmap bitmap, SchoolCardDocument schoolCardDocument, a0 a0Var, String str, od0.i.Initial initial) {
                return bitmap != null ? new od0.i.e.Displaying(bitmap, schoolCardDocument) : new od0.i.ErrorLoading(a0Var.errorVMSFactory.a(a0Var.G9(a0Var.F9(), new er.a() { // from class: od0.g0
                    @Override // er.a
                    public final Object a() {
                        return a0.d.a.c0();
                    }
                }, a0Var.b9(od0.b.f144903a))), str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 c0() {
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final a0 a0Var;
                k10.c0<od0.i.Initial> c0Var;
                final String str;
                final SchoolCardDocument schoolCardDocument;
                Object objE = uq.b.e();
                int i15 = this.f144859m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    eg0.k kVar = this.f144860n.getSchoolCardUC;
                    eg0.k.Params params = new eg0.k.Params(this.f144861p);
                    this.f144859m = 1;
                    obj = kVar.c(params, this);
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
                    schoolCardDocument = (SchoolCardDocument) this.f144856j;
                    str = (String) this.f144855h;
                    c0Var = (k10.c0) this.f144854g;
                    a0Var = (a0) this.f144853f;
                    oq.u.b(obj);
                }
                final Bitmap bitmap = (Bitmap) ((dx.i) obj).a();
                return c0Var.d(new er.l() { // from class: od0.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.d.a.b0(bitmap, schoolCardDocument, a0Var, str, (i.Initial) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                k10.c0<od0.i.Initial> c0Var2 = this.f144862q;
                a0Var = this.f144860n;
                final String str2 = this.f144861p;
                if (iVar instanceof dx.i.Left) {
                    return c0Var2.d(new er.l() { // from class: od0.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.d.a.Z(a0Var, str2, (i.Initial) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                SchoolCardDocument schoolCardDocument2 = (SchoolCardDocument) ((dx.i.Right) iVar).b();
                b00.c cVar = a0Var.imageConverter;
                String picture = schoolCardDocument2.getScopeData().getContainer().getPicture();
                this.f144852e = vq.j.a(iVar);
                this.f144853f = a0Var;
                this.f144854g = c0Var2;
                this.f144855h = str2;
                this.f144856j = schoolCardDocument2;
                this.f144857k = 0;
                this.f144858l = 0;
                this.f144859m = 2;
                obj = cVar.b(picture, this);
                if (obj != objE) {
                    c0Var = c0Var2;
                    str = str2;
                    schoolCardDocument = schoolCardDocument2;
                    final Bitmap bitmap2 = (Bitmap) ((dx.i) obj).a();
                    return c0Var.d(new er.l() { // from class: od0.e0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.d.a.b0(bitmap2, schoolCardDocument, a0Var, str, (i.Initial) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> X(tq.e<?> eVar) {
                return new a(this.f144860n, this.f144861p, this.f144862q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends od0.i>> eVar) {
                return ((a) X(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k10.z<od0.i.Initial, od0.i, n20.a> zVar, a0 a0Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f144850j = zVar;
            this.f144851k = a0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final od0.i.ErrorInitial V(a0 a0Var, od0.i.Initial initial) {
            return new od0.i.ErrorInitial(a0Var.errorVMSFactory.a(a0.H9(a0Var, new dx.b.Generic(null, 1, null), new er.a() { // from class: od0.c0
                @Override // er.a
                public final Object a() {
                    return a0.d.X();
                }
            }, null, 4, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d dVar;
            k10.c0 c0Var = (k10.c0) this.f144849h;
            Object objE = uq.b.e();
            int i15 = this.f144848g;
            if (i15 == 0) {
                oq.u.b(obj);
                String documentId = ((od0.i.Initial) c0Var.a()).getDocumentId();
                if (documentId != null) {
                    a0 a0Var = this.f144851k;
                    ac4.a aVar = a0Var.callActionWithLoaderUseCase;
                    a aVar2 = new a(a0Var, documentId, c0Var, null);
                    this.f144849h = c0Var;
                    this.f144846e = vq.j.a(documentId);
                    this.f144847f = 0;
                    this.f144848g = 1;
                    dVar = this;
                    obj = ac4.a.a(aVar, null, aVar2, dVar, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    dVar = this;
                }
                final a0 a0Var2 = dVar.f144851k;
                return c0Var.d(new er.l() { // from class: od0.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.d.V(a0Var2, (i.Initial) obj2);
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
            final a0 a0Var3 = dVar.f144851k;
            return c0Var.d(new er.l() { // from class: od0.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.d.V(a0Var3, (i.Initial) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<od0.i.Initial> c0Var, tq.e<? super k10.l<? extends od0.i>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f144850j, this.f144851k, eVar);
            dVar.f144849h = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lod0/f;", "<unused var>", "Lod0/i$e$a;", "Loq/i0;", "<anonymous>", "(Lod0/f;Lod0/i$e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<od0.f, od0.i.e.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144863e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f144863e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<od0.e> bVarY1 = a0.this.Y1();
                od0.e.ShowDialog showDialog = new od0.e.ShowDialog(a0.this.schoolCardMapper.H(a0.this.b9(od0.c.f144905a), new er.a() { // from class: od0.h0
                    @Override // er.a
                    public final Object a() {
                        return a0.e.O();
                    }
                }));
                this.f144863e = 1;
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(od0.f fVar, od0.i.e.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return a0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lod0/g;", "<unused var>", "Lod0/i$e$a;", "Loq/i0;", "<anonymous>", "(Lod0/g;Lod0/i$e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<od0.g, od0.i.e.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144865e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f144865e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<od0.e> bVarY1 = a0.this.Y1();
                od0.e.ShowDialog showDialog = new od0.e.ShowDialog(a0.this.schoolCardMapper.I());
                this.f144865e = 1;
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
        public final Object w(od0.g gVar, od0.i.e.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return a0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lod0/d;", "<unused var>", "Lod0/i$e$a;", "state", "Loq/i0;", "<anonymous>", "(Lod0/d;Lod0/i$e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<od0.d, od0.i.e.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144868f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            od0.i.e.Displaying displaying = (od0.i.e.Displaying) this.f144868f;
            Object objE = uq.b.e();
            int i15 = this.f144867e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<od0.e> bVarY1 = a0.this.Y1();
                od0.e.GoToVerification goToVerification = new od0.e.GoToVerification(a0.this.verificationDataMapper.b(new nd0.j.Params(displaying)));
                this.f144868f = vq.j.a(displaying);
                this.f144867e = 1;
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
        public final Object w(od0.d dVar, od0.i.e.Displaying displaying, tq.e<? super oq.i0> eVar) {
            g gVar = a0.this.new g(eVar);
            gVar.f144868f = displaying;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lod0/c;", "<unused var>", "Lk10/c0;", "Lod0/i$e$a;", "state", "Lk10/l;", "Lod0/i;", "<anonymous>", "(Lod0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<od0.c, k10.c0<od0.i.e.Displaying>, tq.e<? super k10.l<? extends od0.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144871f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final od0.i.DeleteDocument O(k10.c0 c0Var, od0.i.e.Displaying displaying) {
            return new od0.i.DeleteDocument(((od0.i.e.Displaying) c0Var.a()).getSchoolCardData().getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f144871f;
            uq.b.e();
            if (this.f144870e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: od0.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.h.O(c0Var, (i.e.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(od0.c cVar, k10.c0<od0.i.e.Displaying> c0Var, tq.e<? super k10.l<? extends od0.i>> eVar) {
            h hVar = new h(eVar);
            hVar.f144871f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lod0/h;", "action", "Lk10/c0;", "Lod0/i$e$a;", "state", "Lk10/l;", "Lod0/i;", "<anonymous>", "(Lod0/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<od0.h, k10.c0<od0.i.e.Displaying>, tq.e<? super k10.l<? extends od0.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144873f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final od0.i.e.Updating O(k10.c0 c0Var, od0.i.e.Displaying displaying) {
            return new od0.i.e.Updating(((od0.i.e.Displaying) c0Var.a()).getImageBitmap(), ((od0.i.e.Displaying) c0Var.a()).getSchoolCardData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f144873f;
            uq.b.e();
            if (this.f144872e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: od0.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.i.O(c0Var, (i.e.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(od0.h hVar, k10.c0<od0.i.e.Displaying> c0Var, tq.e<? super k10.l<? extends od0.i>> eVar) {
            i iVar = new i(eVar);
            iVar.f144873f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lod0/i$e$c;", "state", "Lk10/l;", "Lod0/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<od0.i.e.Updating>, tq.e<? super k10.l<? extends od0.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f144874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f144875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f144876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f144877h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f144878j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f144879k;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final od0.i.e.Error O(k10.c0 c0Var, a0 a0Var, dx.b bVar, od0.i.e.Updating updating) {
            return new od0.i.e.Error(((od0.i.e.Updating) c0Var.a()).getImageBitmap(), ((od0.i.e.Updating) c0Var.a()).getSchoolCardData(), a0Var.errorVMSFactory.a(a0Var.G9(bVar, a0Var.b9(od0.h.f144919a), a0Var.b9(od0.b.f144903a))));
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
        
            if (r2.F(r5, r7) == r1) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f144879k
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f144878j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L27
                if (r2 != r3) goto L1f
                java.lang.Object r1 = r7.f144875f
                df0.n$b r1 = (df0.n.Response) r1
                java.lang.Object r1 = r7.f144874e
                dx.i r1 = (dx.i) r1
                oq.u.b(r8)
                goto La3
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                oq.u.b(r8)
                goto L54
            L2b:
                oq.u.b(r8)
                od0.a0 r8 = od0.a0.this
                df0.n r8 = od0.a0.z9(r8)
                df0.n$a r2 = new df0.n$a
                cf0.c r5 = cf0.c.JUNIOR_STUDENT_CARD
                java.lang.Object r6 = r0.a()
                od0.i$e$c r6 = (od0.i.e.Updating) r6
                cg0.d r6 = r6.getSchoolCardData()
                java.lang.String r6 = r6.getDocumentId()
                r2.<init>(r5, r6)
                r7.f144879k = r0
                r7.f144878j = r4
                java.lang.Object r8 = r8.c(r2, r7)
                if (r8 != r1) goto L54
                goto La2
            L54:
                dx.i r8 = (dx.i) r8
                od0.a0 r2 = od0.a0.this
                boolean r4 = r8 instanceof dx.i.Left
                if (r4 == 0) goto L6d
                dx.i$b r8 = (dx.i.Left) r8
                java.lang.Object r8 = r8.b()
                dx.b r8 = (dx.b) r8
                od0.k0 r1 = new od0.k0
                r1.<init>()
                r0.d(r1)
                goto La3
            L6d:
                boolean r4 = r8 instanceof dx.i.Right
                if (r4 == 0) goto La8
                r4 = r8
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                df0.n$b r4 = (df0.n.Response) r4
                xw.b r2 = r2.Y1()
                od0.e$d r5 = new od0.e$d
                java.lang.String r6 = r4.getDocumentToGenerateId()
                r5.<init>(r6)
                r7.f144879k = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f144874e = r8
                java.lang.Object r8 = vq.j.a(r4)
                r7.f144875f = r8
                r8 = 0
                r7.f144876g = r8
                r7.f144877h = r8
                r7.f144878j = r3
                java.lang.Object r8 = r2.F(r5, r7)
                if (r8 != r1) goto La3
            La2:
                return r1
            La3:
                k10.l r8 = r0.c()
                return r8
            La8:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: od0.a0.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<od0.i.e.Updating> c0Var, tq.e<? super k10.l<? extends od0.i>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = a0.this.new j(eVar);
            jVar.f144879k = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lod0/h;", "action", "Lk10/c0;", "Lod0/i$e$b;", "state", "Lk10/l;", "Lod0/i;", "<anonymous>", "(Lod0/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<od0.h, k10.c0<od0.i.e.Error>, tq.e<? super k10.l<? extends od0.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144882f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final od0.i.e.Updating O(k10.c0 c0Var, od0.i.e.Error error) {
            return new od0.i.e.Updating(((od0.i.e.Error) c0Var.a()).getImageBitmap(), ((od0.i.e.Error) c0Var.a()).getSchoolCardData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f144882f;
            uq.b.e();
            if (this.f144881e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: od0.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.k.O(c0Var, (i.e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(od0.h hVar, k10.c0<od0.i.e.Error> c0Var, tq.e<? super k10.l<? extends od0.i>> eVar) {
            k kVar = new k(eVar);
            kVar.f144882f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lod0/b;", "action", "Lk10/c0;", "Lod0/i$e$b;", "state", "Lk10/l;", "Lod0/i;", "<anonymous>", "(Lod0/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<od0.b, k10.c0<od0.i.e.Error>, tq.e<? super k10.l<? extends od0.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144884f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final od0.i.e.Displaying O(k10.c0 c0Var, od0.i.e.Error error) {
            return new od0.i.e.Displaying(((od0.i.e.Error) c0Var.a()).getImageBitmap(), ((od0.i.e.Error) c0Var.a()).getSchoolCardData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f144884f;
            uq.b.e();
            if (this.f144883e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: od0.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.l.O(c0Var, (i.e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(od0.b bVar, k10.c0<od0.i.e.Error> c0Var, tq.e<? super k10.l<? extends od0.i>> eVar) {
            l lVar = new l(eVar);
            lVar.f144884f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lod0/c;", "<unused var>", "Lk10/c0;", "Lod0/i$c;", "state", "Lk10/l;", "Lod0/i;", "<anonymous>", "(Lod0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<od0.c, k10.c0<od0.i.ErrorLoading>, tq.e<? super k10.l<? extends od0.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144886f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final od0.i.DeleteDocument O(k10.c0 c0Var, od0.i.ErrorLoading errorLoading) {
            return new od0.i.DeleteDocument(((od0.i.ErrorLoading) c0Var.a()).getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f144886f;
            uq.b.e();
            if (this.f144885e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: od0.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.m.O(c0Var, (i.ErrorLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(od0.c cVar, k10.c0<od0.i.ErrorLoading> c0Var, tq.e<? super k10.l<? extends od0.i>> eVar) {
            m mVar = new m(eVar);
            mVar.f144886f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lod0/i$a;", "state", "Lk10/l;", "Lod0/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<k10.c0<od0.i.DeleteDocument>, tq.e<? super k10.l<? extends od0.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144888f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lod0/i;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends od0.i>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f144890e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f144891f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f144892g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f144893h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f144894j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f144895k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f144896l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f144897m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f144898n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            boolean f144899p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f144900q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a0 f144901r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ k10.c0<od0.i.DeleteDocument> f144902s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, k10.c0<od0.i.DeleteDocument> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f144901r = a0Var;
                this.f144902s = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final od0.i.ErrorInitial Z(a0 a0Var, dx.b bVar, od0.i.DeleteDocument deleteDocument) {
                return new od0.i.ErrorInitial(a0Var.errorVMSFactory.a(a0.H9(a0Var, bVar, new er.a() { // from class: od0.q0
                    @Override // er.a
                    public final Object a() {
                        return a0.n.a.a0();
                    }
                }, null, 4, null)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 a0() {
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final od0.i.ErrorInitial b0(a0 a0Var, dx.b bVar, od0.i.DeleteDocument deleteDocument) {
                return new od0.i.ErrorInitial(a0Var.errorVMSFactory.a(a0.H9(a0Var, bVar, new er.a() { // from class: od0.r0
                    @Override // er.a
                    public final Object a() {
                        return a0.n.a.c0();
                    }
                }, null, 4, null)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 c0() {
                return oq.i0.f148189a;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
            /* JADX WARN: Code duplicated, block: B:34:0x011d  */
            /* JADX WARN: Code duplicated, block: B:36:0x0121  */
            /* JADX WARN: Code duplicated, block: B:39:0x0140  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                final a0 a0Var;
                int i15;
                k10.c0<od0.i.DeleteDocument> c0Var;
                boolean z15;
                int i16;
                dx.i iVar2;
                xw.b<od0.e> bVarY1;
                od0.e.a aVar;
                boolean z16;
                a0 a0Var2;
                Object objE = uq.b.e();
                int i17 = this.f144900q;
                if (i17 == 0) {
                    oq.u.b(obj);
                    eg0.n nVar = this.f144901r.isContainMultipleSchoolCardsUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f144900q = 1;
                    obj = nVar.c(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i17 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i17 == 2) {
                        int i18 = this.f144896l;
                        z15 = this.f144899p;
                        int i19 = this.f144895k;
                        k10.c0<od0.i.DeleteDocument> c0Var2 = (k10.c0) this.f144892g;
                        a0Var = (a0) this.f144891f;
                        iVar = (dx.i) this.f144890e;
                        oq.u.b(obj);
                        i16 = i18;
                        c0Var = c0Var2;
                        i15 = i19;
                        iVar2 = (dx.i) obj;
                        if (iVar2 instanceof dx.i.Left) {
                            final dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
                            return c0Var.d(new er.l() { // from class: od0.p0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return a0.n.a.b0(a0Var, bVar, (i.DeleteDocument) obj2);
                                }
                            });
                        }
                        if (iVar2 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar2).b();
                        bVarY1 = a0Var.Y1();
                        aVar = od0.e.a.f144909a;
                        this.f144890e = vq.j.a(iVar);
                        this.f144891f = a0Var;
                        this.f144892g = c0Var;
                        this.f144893h = vq.j.a(iVar2);
                        this.f144894j = vq.j.a(i0Var);
                        this.f144895k = i15;
                        this.f144899p = z15;
                        this.f144896l = i16;
                        this.f144897m = 0;
                        this.f144898n = 0;
                        this.f144900q = 3;
                        if (bVarY1.F(aVar, this) != objE) {
                            z16 = z15;
                            a0Var2 = a0Var;
                        }
                        return objE;
                    }
                    if (i17 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z16 = this.f144899p;
                    c0Var = (k10.c0) this.f144892g;
                    a0Var2 = (a0) this.f144891f;
                    oq.u.b(obj);
                }
                if (z16) {
                    a0Var2.globalSnackBarManager.y(new p50.a.Default(a0Var2.labelProvider.c(jd0.b.f101877x), false, null, 6, null));
                }
                return c0Var.c();
                iVar = (dx.i) obj;
                k10.c0<od0.i.DeleteDocument> c0Var3 = this.f144902s;
                final a0 a0Var3 = this.f144901r;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var3.d(new er.l() { // from class: od0.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.n.a.Z(a0Var3, bVar2, (i.DeleteDocument) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
                eg0.d dVar = a0Var3.deleteDocumentByIDUC;
                eg0.d.Params params = new eg0.d.Params(c0Var3.a().getDocumentId());
                this.f144890e = vq.j.a(iVar);
                this.f144891f = a0Var3;
                this.f144892g = c0Var3;
                this.f144895k = 0;
                this.f144899p = zBooleanValue;
                this.f144896l = 0;
                this.f144900q = 2;
                Object objC = dVar.c(params, this);
                if (objC != objE) {
                    a0Var = a0Var3;
                    i15 = 0;
                    c0Var = c0Var3;
                    obj = objC;
                    z15 = zBooleanValue;
                    i16 = 0;
                    iVar2 = (dx.i) obj;
                    if (iVar2 instanceof dx.i.Left) {
                        final dx.b bVar3 = (dx.b) ((dx.i.Left) iVar2).b();
                        return c0Var.d(new er.l() { // from class: od0.p0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return a0.n.a.b0(a0Var, bVar3, (i.DeleteDocument) obj2);
                            }
                        });
                    }
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    oq.i0 i0Var2 = (oq.i0) ((dx.i.Right) iVar2).b();
                    bVarY1 = a0Var.Y1();
                    aVar = od0.e.a.f144909a;
                    this.f144890e = vq.j.a(iVar);
                    this.f144891f = a0Var;
                    this.f144892g = c0Var;
                    this.f144893h = vq.j.a(iVar2);
                    this.f144894j = vq.j.a(i0Var2);
                    this.f144895k = i15;
                    this.f144899p = z15;
                    this.f144896l = i16;
                    this.f144897m = 0;
                    this.f144898n = 0;
                    this.f144900q = 3;
                    if (bVarY1.F(aVar, this) != objE) {
                        z16 = z15;
                        a0Var2 = a0Var;
                        if (z16) {
                            a0Var2.globalSnackBarManager.y(new p50.a.Default(a0Var2.labelProvider.c(jd0.b.f101877x), false, null, 6, null));
                        }
                        return c0Var.c();
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> X(tq.e<?> eVar) {
                return new a(this.f144901r, this.f144902s, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends od0.i>> eVar) {
                return ((a) X(eVar)).J(oq.i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144888f;
            Object objE = uq.b.e();
            int i15 = this.f144887e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(a0.this, c0Var, null);
            this.f144888f = vq.j.a(c0Var);
            this.f144887e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<od0.i.DeleteDocument> c0Var, tq.e<? super k10.l<? extends od0.i>> eVar) {
            return ((n) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n nVar = a0.this.new n(eVar);
            nVar.f144888f = obj;
            return nVar;
        }
    }

    public a0(n20.j jVar, eg0.k kVar, df0.n nVar, nd0.i iVar, nd0.j jVar2, b00.c cVar, t2.a aVar, eg0.d dVar, ac4.a aVar2, nd0.b bVar, hb4.d dVar2, eg0.n nVar2, i70.e eVar, mx.c cVar2, a.SetupData setupData) {
        this.getSchoolCardUC = kVar;
        this.requestDocumentUpdateUC = nVar;
        this.schoolCardMapper = iVar;
        this.verificationDataMapper = jVar2;
        this.imageConverter = cVar;
        this.deps = aVar;
        this.deleteDocumentByIDUC = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.schoolCardErrorMapper = bVar;
        this.errorVMSFactory = dVar2;
        this.isContainMultipleSchoolCardsUC = nVar2;
        this.globalSnackBarManager = eVar;
        this.labelProvider = cVar2;
        this.setupData = setupData;
        od0.i.Initial initial = new od0.i.Initial(setupData.getDocumentId());
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(initial, new er.l() { // from class: od0.z
            @Override // er.l
            public final Object b(Object obj) {
                return a0.M9(this.f144964a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), od0.j.a.b.f144934a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business F9() {
        return new dx.b.Business(ld0.a.READ_DATA_ERROR, null, this.labelProvider.c(jd0.b.f101873t), this.labelProvider.c(jd0.b.f101872s), null, this.labelProvider.c(jd0.b.f101855b), this.labelProvider.c(jd0.b.f101857d), 18, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b G9(dx.b domainError, er.a<oq.i0> onRetry, er.a<oq.i0> onClose) {
        return this.schoolCardErrorMapper.b(new nd0.b.Params(domainError, onRetry, onClose, new er.a() { // from class: od0.y
            @Override // er.a
            public final Object a() {
                return a0.I9(this.f144963a);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ jb4.b H9(a0 a0Var, dx.b bVar, er.a aVar, er.a aVar2, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            aVar2 = a0Var.b9(od0.a.f144812a);
        }
        return a0Var.G9(bVar, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(a0 a0Var) {
        a0Var.d9(od0.c.f144905a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final od0.j.a J9(State<od0.i> state) {
        nd0.i iVar = this.schoolCardMapper;
        er.a<oq.i0> aVarB9 = b9(od0.a.f144812a);
        t2 t2Var = new t2(this.deps, androidx.p016lifecycle.u0.a(this));
        er.a<oq.i0> aVarB10 = b9(od0.g.f144918a);
        er.a<oq.i0> aVarB11 = b9(od0.h.f144919a);
        er.a<oq.i0> aVarB12 = b9(od0.f.f144917a);
        return iVar.b(new nd0.i.Params(state, aVarB9, t2Var, new er.l() { // from class: od0.q
            @Override // er.l
            public final Object b(Object obj) {
                return a0.K9((n20.a) obj);
            }
        }, aVarB10, aVarB11, b9(od0.d.f144906a), aVarB12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(n20.a aVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(final a0 a0Var, k10.v vVar) {
        vVar.c(fr.q0.c(od0.i.class), new er.l() { // from class: od0.r
            @Override // er.l
            public final Object b(Object obj) {
                return a0.N9(this.f144956a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(od0.i.Initial.class), new er.l() { // from class: od0.s
            @Override // er.l
            public final Object b(Object obj) {
                return a0.O9(this.f144957a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(od0.i.e.Displaying.class), new er.l() { // from class: od0.t
            @Override // er.l
            public final Object b(Object obj) {
                return a0.P9(this.f144958a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(od0.i.e.Updating.class), new er.l() { // from class: od0.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.Q9(this.f144960a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(od0.i.e.Error.class), new er.l() { // from class: od0.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.R9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(od0.i.ErrorLoading.class), new er.l() { // from class: od0.w
            @Override // er.l
            public final Object b(Object obj) {
                return a0.S9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(od0.i.DeleteDocument.class), new er.l() { // from class: od0.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.T9(this.f144962a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(a0 a0Var, k10.z zVar) {
        c cVar = a0Var.new c(null);
        zVar.x(fr.q0.c(od0.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(a0 a0Var, k10.z zVar) {
        zVar.A(new d(zVar, a0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(a0 a0Var, k10.z zVar) {
        e eVar = a0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(od0.f.class), oVar, eVar);
        zVar.x(fr.q0.c(od0.g.class), oVar, a0Var.new f(null));
        zVar.x(fr.q0.c(od0.d.class), oVar, a0Var.new g(null));
        zVar.v(fr.q0.c(od0.c.class), oVar, new h(null));
        zVar.v(fr.q0.c(od0.h.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(a0 a0Var, k10.z zVar) {
        zVar.A(a0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(k10.z zVar) {
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(od0.h.class), oVar, kVar);
        zVar.v(fr.q0.c(od0.b.class), oVar, new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(k10.z zVar) {
        m mVar = new m(null);
        zVar.v(fr.q0.c(od0.c.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(a0 a0Var, k10.z zVar) {
        zVar.A(a0Var.new n(null));
        return oq.i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(od0.j.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<od0.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<od0.i>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<od0.j.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
