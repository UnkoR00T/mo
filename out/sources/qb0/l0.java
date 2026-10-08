package qb0;

import ag0.DynamicDocument;
import ag0.DynamicParentDocument;
import cb4.DialogData;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sb0.BitmapsByFieldReference;
import sb0.DynamicDocumentBottomSheetData;
import yf0.DocumentSchema;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001kB\u0083\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u000200H\u0096\u0001¢\u0006\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010[\u001a\b\u0012\u0004\u0012\u00020V0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR,\u0010a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\\8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010'\u001a\b\u0012\u0004\u0012\u00020(0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020h0g8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010i¨\u0006l"}, d2 = {"Lqb0/l0;", "Ll00/g;", "Ln20/b;", "Lqb0/k;", "Ln20/a;", "Lqb0/p;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lrb0/h;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Leg0/g;", "getDynamicDocumentUC", "Leg0/d;", "deleteDocumentByIDUC", "Lo20/t2$a;", "deps", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lrb0/l;", "verificationDataMapper", "Lmx/c;", "labelProvider", "Ldf0/n;", "requestDocumentUpdateUC", "Lcb4/j;", "dialogVmsFactory", "snackBarManagerStateHolder", "Lrb0/a;", "dynamicDocumentBitmapDecoder", "Lqb0/l0$a$a;", "setupData", "<init>", "(Ln20/j;Lrb0/h;Lac4/a;Leg0/g;Leg0/d;Lo20/t2$a;Lhb4/d;Lib4/c;Lrb0/l;Lmx/c;Ldf0/n;Lcb4/j;Li70/n;Lrb0/a;Lqb0/l0$a$a;)V", "state", "Lqb0/p$a;", "F9", "(Ln20/b;)Lqb0/p$a;", "Ldx/b$c;", "E9", "()Ldx/b$c;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lrb0/h;", "c", "Lac4/a;", "d", "Leg0/g;", "e", "Leg0/d;", "f", "Lo20/t2$a;", "g", "Lhb4/d;", "h", "Lib4/c;", "j", "Lrb0/l;", "k", "Lmx/c;", "l", "Ldf0/n;", "m", "Lcb4/j;", "n", "Li70/n;", "p", "Lrb0/a;", "q", "Lqb0/l0$a$a;", "Lqb0/k$d;", "r", "Lqb0/k$d;", "initialState", "Lxw/b;", "Lqb0/f;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 extends l00.g<State<qb0.k>, n20.a> implements qb0.p, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rb0.h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final eg0.g getDynamicDocumentUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final eg0.d deleteDocumentByIDUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final rb0.l verificationDataMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final df0.n requestDocumentUpdateUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVmsFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final rb0.a dynamicDocumentBitmapDecoder;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final qb0.k.LoadingDocument initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qb0.f> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<qb0.k>, n20.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<qb0.p.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lqb0/l0$a;", "Lf00/j0;", "Lqb0/l0$a$a;", "Lqb0/l0;", "a", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<SetupData, l0> {

        /* JADX INFO: renamed from: qb0.l0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lqb0/l0$a$a;", "", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static final class b implements mu.g<qb0.p.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f165761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f165762b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f165763a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f165764b;

            /* JADX INFO: renamed from: qb0.l0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4139a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f165765d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f165766e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f165767f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f165769h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f165770j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f165771k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f165772l;

                public C4139a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f165765d = obj;
                    this.f165766e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l0 l0Var) {
                this.f165763a = hVar;
                this.f165764b = l0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4139a c4139a;
                if (eVar instanceof C4139a) {
                    c4139a = (C4139a) eVar;
                    int i15 = c4139a.f165766e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4139a.f165766e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4139a = new C4139a(eVar);
                    }
                } else {
                    c4139a = new C4139a(eVar);
                }
                Object obj2 = c4139a.f165765d;
                Object objE = uq.b.e();
                int i16 = c4139a.f165766e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f165763a;
                    qb0.p.a aVarF9 = this.f165764b.F9((State) obj);
                    c4139a.f165767f = vq.j.a(obj);
                    c4139a.f165769h = vq.j.a(c4139a);
                    c4139a.f165770j = vq.j.a(obj);
                    c4139a.f165771k = vq.j.a(hVar);
                    c4139a.f165772l = 0;
                    c4139a.f165766e = 1;
                    if (hVar.F(aVarF9, c4139a) == objE) {
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

        public b(mu.g gVar, l0 l0Var) {
            this.f165761a = gVar;
            this.f165762b = l0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super qb0.p.a> hVar, tq.e eVar) {
            Object objA = this.f165761a.a(new a(hVar, this.f165762b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqb0/a;", "<unused var>", "Lqb0/k;", "Loq/i0;", "<anonymous>", "(Lqb0/a;Lqb0/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<qb0.a, qb0.k, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165773e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f165773e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qb0.f> bVarY1 = l0.this.Y1();
                qb0.f.a aVar = qb0.f.a.f165709a;
                this.f165773e = 1;
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
        public final Object w(qb0.a aVar, qb0.k kVar, tq.e<? super oq.i0> eVar) {
            return l0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqb0/k$d;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<qb0.k.LoadingDocument>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f165776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f165777g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f165778h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.z<qb0.k.LoadingDocument, qb0.k, n20.a> f165779j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ l0 f165780k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqb0/k;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qb0.k>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f165781e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f165782f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f165783g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f165784h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f165785j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f165786k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f165787l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f165788m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ l0 f165789n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f165790p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<qb0.k.LoadingDocument> f165791q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k10.z<qb0.k.LoadingDocument, qb0.k, n20.a> f165792r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, String str, k10.c0<qb0.k.LoadingDocument> c0Var, k10.z<qb0.k.LoadingDocument, qb0.k, n20.a> zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f165789n = l0Var;
                this.f165790p = str;
                this.f165791q = c0Var;
                this.f165792r = zVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ErrorLoading a0(final l0 l0Var, qb0.k.LoadingDocument loadingDocument) {
                return new ErrorLoading(l0Var.errorVMSFactory.a(l0Var.genericDomainErrorMapper.b(new ib4.c.Params(l0Var.E9(), false, new er.l() { // from class: qb0.s0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l0.d.a.b0(l0Var, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 b0(l0 l0Var, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.a.Primary) {
                    l0Var.d9(qb0.c.f165699a);
                } else {
                    if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                        throw new oq.p();
                    }
                    l0Var.d9(qb0.a.f165694a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qb0.k.DocumentDisplayed c0(DynamicParentDocument dynamicParentDocument, BitmapsByFieldReference bitmapsByFieldReference, qb0.k.LoadingDocument loadingDocument) {
                String documentId = ((DynamicDocument) pq.v.l0(dynamicParentDocument.c())).getDocumentId();
                String documentId2 = dynamicParentDocument.getDocumentId();
                vf0.d documentType = dynamicParentDocument.getDocumentType();
                DocumentSchema schemaData = ((DynamicDocument) pq.v.l0(dynamicParentDocument.c())).getSchemaData();
                iy.b0 rawScopeData = ((DynamicDocument) pq.v.l0(dynamicParentDocument.c())).getRawScopeData();
                return new qb0.k.DocumentDisplayed(null, null, null, new qb0.k.DocumentData(documentId, documentId2, documentType, dynamicParentDocument.getDocumentPhoto(), ((DynamicDocument) pq.v.l0(dynamicParentDocument.c())).getDocumentStatus(), schemaData, ((DynamicDocument) pq.v.l0(dynamicParentDocument.c())).getScopeName(), rawScopeData, bitmapsByFieldReference), 7, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ErrorLoading d0(final l0 l0Var, qb0.k.LoadingDocument loadingDocument) {
                return new ErrorLoading(l0Var.errorVMSFactory.a(l0Var.genericDomainErrorMapper.b(new ib4.c.Params(l0Var.E9(), false, new er.l() { // from class: qb0.r0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l0.d.a.e0(l0Var, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 e0(l0 l0Var, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.a.Primary) {
                    l0Var.d9(qb0.c.f165699a);
                } else {
                    if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                        throw new oq.p();
                    }
                    l0Var.d9(qb0.a.f165694a);
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<qb0.k.LoadingDocument> c0Var;
                final DynamicParentDocument dynamicParentDocument;
                Object objE = uq.b.e();
                int i15 = this.f165788m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    eg0.g gVar = this.f165789n.getDynamicDocumentUC;
                    eg0.g.Params params = new eg0.g.Params(this.f165790p);
                    this.f165788m = 1;
                    obj = gVar.c(params, this);
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
                    dynamicParentDocument = (DynamicParentDocument) this.f165783g;
                    c0Var = (k10.c0) this.f165782f;
                    oq.u.b(obj);
                }
                final BitmapsByFieldReference bitmapsByFieldReference = (BitmapsByFieldReference) obj;
                return c0Var.d(new er.l() { // from class: qb0.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.d.a.c0(dynamicParentDocument, bitmapsByFieldReference, (k.LoadingDocument) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                c0Var = this.f165791q;
                final l0 l0Var = this.f165789n;
                k10.z<qb0.k.LoadingDocument, qb0.k, n20.a> zVar = this.f165792r;
                if (iVar instanceof dx.i.Left) {
                    return c0Var.d(new er.l() { // from class: qb0.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.d.a.a0(l0Var, (k.LoadingDocument) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                DynamicParentDocument dynamicParentDocument2 = (DynamicParentDocument) ((dx.i.Right) iVar).b();
                if (dynamicParentDocument2.c().size() != 1) {
                    return c0Var.d(new er.l() { // from class: qb0.q0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.d.a.d0(l0Var, (k.LoadingDocument) obj2);
                        }
                    });
                }
                rb0.a aVar = l0Var.dynamicDocumentBitmapDecoder;
                DocumentSchema schemaData = ((DynamicDocument) pq.v.l0(dynamicParentDocument2.c())).getSchemaData();
                iy.b0 rawScopeData = ((DynamicDocument) pq.v.l0(dynamicParentDocument2.c())).getRawScopeData();
                this.f165781e = vq.j.a(iVar);
                this.f165782f = c0Var;
                this.f165783g = dynamicParentDocument2;
                this.f165784h = vq.j.a(zVar);
                this.f165785j = 0;
                this.f165786k = 0;
                this.f165787l = 0;
                this.f165788m = 2;
                obj = aVar.a(schemaData, rawScopeData, this);
                if (obj != objE) {
                    dynamicParentDocument = dynamicParentDocument2;
                    final BitmapsByFieldReference bitmapsByFieldReference2 = (BitmapsByFieldReference) obj;
                    return c0Var.d(new er.l() { // from class: qb0.p0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.d.a.c0(dynamicParentDocument, bitmapsByFieldReference2, (k.LoadingDocument) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> Y(tq.e<?> eVar) {
                return new a(this.f165789n, this.f165790p, this.f165791q, this.f165792r, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends qb0.k>> eVar) {
                return ((a) Y(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k10.z<qb0.k.LoadingDocument, qb0.k, n20.a> zVar, l0 l0Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f165779j = zVar;
            this.f165780k = l0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ErrorInitial V(final l0 l0Var, qb0.k.LoadingDocument loadingDocument) {
            return new ErrorInitial(l0Var.errorVMSFactory.a(l0Var.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: qb0.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.d.X(l0Var, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(l0 l0Var, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            l0Var.d9(qb0.a.f165694a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d dVar;
            k10.c0 c0Var = (k10.c0) this.f165778h;
            Object objE = uq.b.e();
            int i15 = this.f165777g;
            if (i15 == 0) {
                oq.u.b(obj);
                String documentId = ((qb0.k.LoadingDocument) c0Var.a()).getDocumentId();
                if (documentId != null) {
                    l0 l0Var = this.f165780k;
                    k10.z<qb0.k.LoadingDocument, qb0.k, n20.a> zVar = this.f165779j;
                    ac4.a aVar = l0Var.callActionWithLoaderUseCase;
                    a aVar2 = new a(l0Var, documentId, c0Var, zVar, null);
                    this.f165778h = c0Var;
                    this.f165775e = vq.j.a(documentId);
                    this.f165776f = 0;
                    this.f165777g = 1;
                    dVar = this;
                    obj = ac4.a.a(aVar, null, aVar2, dVar, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    dVar = this;
                }
                final l0 l0Var2 = dVar.f165780k;
                return c0Var.d(new er.l() { // from class: qb0.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.d.V(l0Var2, (k.LoadingDocument) obj2);
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
            final l0 l0Var3 = dVar.f165780k;
            return c0Var.d(new er.l() { // from class: qb0.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.d.V(l0Var3, (k.LoadingDocument) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<qb0.k.LoadingDocument> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f165779j, this.f165780k, eVar);
            dVar.f165778h = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqb0/k$e;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<qb0.k.UpdatingDocument>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165794f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqb0/k;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qb0.k>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f165796e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f165797f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f165798g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f165799h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f165800j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f165801k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ l0 f165802l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<qb0.k.UpdatingDocument> f165803m;

            /* JADX INFO: renamed from: qb0.l0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C4140a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f165804a;

                static {
                    int[] iArr = new int[vf0.d.values().length];
                    try {
                        iArr[vf0.d.SCHOOL_CARD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[vf0.d.FAMILY_CARD.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[vf0.d.UUT_CARD.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f165804a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, k10.c0<qb0.k.UpdatingDocument> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f165802l = l0Var;
                this.f165803m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ErrorUpdating X(k10.c0 c0Var, final l0 l0Var, dx.b bVar, qb0.k.UpdatingDocument updatingDocument) {
                return new ErrorUpdating(l0Var.errorVMSFactory.a(l0Var.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: qb0.u0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l0.e.a.Y(l0Var, (ib4.c.b) obj);
                    }
                }, 2, null))), ((qb0.k.UpdatingDocument) c0Var.a()).getData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(l0 l0Var, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    l0Var.d9(qb0.j.f165721a);
                } else {
                    l0Var.d9(qb0.a.f165694a);
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                cf0.c cVar;
                k10.c0<qb0.k.UpdatingDocument> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f165801k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    df0.n nVar = this.f165802l.requestDocumentUpdateUC;
                    df0.n.Params params = new df0.n.Params(cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD, this.f165803m.a().getData().getParentDocumentId());
                    this.f165801k = 1;
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
                    c0Var = (k10.c0) this.f165797f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<qb0.k.UpdatingDocument> c0Var2 = this.f165803m;
                final l0 l0Var = this.f165802l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: qb0.t0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.e.a.X(c0Var2, l0Var, bVar, (k.UpdatingDocument) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                df0.n.Response response = (df0.n.Response) ((dx.i.Right) iVar).b();
                xw.b<qb0.f> bVarY1 = l0Var.Y1();
                String documentToGenerateId = response.getDocumentToGenerateId();
                int i16 = C4140a.f165804a[c0Var2.a().getData().getDocumentType().ordinal()];
                if (i16 == 1) {
                    cVar = cf0.c.JUNIOR_STUDENT_CARD;
                } else if (i16 == 2) {
                    cVar = cf0.c.DRIVING_LICENCE;
                } else if (i16 == 3) {
                    cVar = cf0.c.FAMILY_CARD;
                } else if (i16 == 4) {
                    cVar = cf0.c.UUT_CARD;
                } else {
                    if (i16 != 5) {
                        throw new oq.p();
                    }
                    cVar = cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD;
                }
                qb0.f.ShowDocumentLoader showDocumentLoader = new qb0.f.ShowDocumentLoader(documentToGenerateId, cVar);
                this.f165796e = vq.j.a(iVar);
                this.f165797f = c0Var2;
                this.f165798g = vq.j.a(response);
                this.f165799h = 0;
                this.f165800j = 0;
                this.f165801k = 2;
                if (bVarY1.F(showDocumentLoader, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f165802l, this.f165803m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends qb0.k>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f165794f;
            Object objE = uq.b.e();
            int i15 = this.f165793e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = l0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(l0.this, c0Var, null);
            this.f165794f = vq.j.a(c0Var);
            this.f165793e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<qb0.k.UpdatingDocument> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = l0.this.new e(eVar);
            eVar2.f165794f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqb0/j;", "<unused var>", "Lk10/c0;", "Lqb0/o;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lqb0/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qb0.j, k10.c0<ErrorUpdating>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165806f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0.k.UpdatingDocument O(k10.c0 c0Var, ErrorUpdating errorUpdating) {
            return new qb0.k.UpdatingDocument(((ErrorUpdating) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f165806f;
            uq.b.e();
            if (this.f165805e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qb0.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.f.O(c0Var, (ErrorUpdating) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qb0.j jVar, k10.c0<ErrorUpdating> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            f fVar = new f(eVar);
            fVar.f165806f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqb0/c;", "<unused var>", "Lk10/c0;", "Lqb0/k$c;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lqb0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qb0.c, k10.c0<qb0.k.DocumentDisplayed>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165808f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0.k.DeletingDocument O(k10.c0 c0Var, qb0.k.DocumentDisplayed documentDisplayed) {
            return new qb0.k.DeletingDocument(((qb0.k.DocumentDisplayed) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f165808f;
            uq.b.e();
            if (this.f165807e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qb0.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.g.O(c0Var, (k.DocumentDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qb0.c cVar, k10.c0<qb0.k.DocumentDisplayed> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            g gVar = new g(eVar);
            gVar.f165808f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqb0/h;", "action", "Lk10/c0;", "Lqb0/k$c;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lqb0/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ShowDialog, k10.c0<qb0.k.DocumentDisplayed>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f165811g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0.k.DocumentDisplayed O(l0 l0Var, ShowDialog showDialog, qb0.k.DocumentDisplayed documentDisplayed) {
            return qb0.k.DocumentDisplayed.b(documentDisplayed, l0Var.dialogVmsFactory.a(showDialog.getDialog()), null, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f165810f;
            k10.c0 c0Var = (k10.c0) this.f165811g;
            uq.b.e();
            if (this.f165809e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final l0 l0Var = l0.this;
            return c0Var.d(new er.l() { // from class: qb0.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.h.O(l0Var, showDialog, (k.DocumentDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<qb0.k.DocumentDisplayed> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            h hVar = l0.this.new h(eVar);
            hVar.f165810f = showDialog;
            hVar.f165811g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqb0/b;", "<unused var>", "Lk10/c0;", "Lqb0/k$c;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lqb0/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qb0.b, k10.c0<qb0.k.DocumentDisplayed>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165814f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0.k.DocumentDisplayed O(qb0.k.DocumentDisplayed documentDisplayed) {
            return qb0.k.DocumentDisplayed.b(documentDisplayed, null, null, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f165814f;
            uq.b.e();
            if (this.f165813e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qb0.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.i.O((k.DocumentDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qb0.b bVar, k10.c0<qb0.k.DocumentDisplayed> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            i iVar = new i(eVar);
            iVar.f165814f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqb0/j;", "<unused var>", "Lk10/c0;", "Lqb0/k$c;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lqb0/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<qb0.j, k10.c0<qb0.k.DocumentDisplayed>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165816f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0.k.UpdatingDocument O(k10.c0 c0Var, qb0.k.DocumentDisplayed documentDisplayed) {
            return new qb0.k.UpdatingDocument(((qb0.k.DocumentDisplayed) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f165816f;
            uq.b.e();
            if (this.f165815e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qb0.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.j.O(c0Var, (k.DocumentDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qb0.j jVar, k10.c0<qb0.k.DocumentDisplayed> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            j jVar2 = new j(eVar);
            jVar2.f165816f = c0Var;
            return jVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqb0/d;", "<unused var>", "Lqb0/k$c;", "state", "Loq/i0;", "<anonymous>", "(Lqb0/d;Lqb0/k$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<qb0.d, qb0.k.DocumentDisplayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165818f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qb0.k.DocumentDisplayed documentDisplayed = (qb0.k.DocumentDisplayed) this.f165818f;
            Object objE = uq.b.e();
            int i15 = this.f165817e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qb0.f> bVarY1 = l0.this.Y1();
                qb0.f.GoToVerification goToVerification = new qb0.f.GoToVerification(l0.this.verificationDataMapper.b(new rb0.l.Params(documentDisplayed)));
                this.f165818f = vq.j.a(documentDisplayed);
                this.f165817e = 1;
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
        public final Object w(qb0.d dVar, qb0.k.DocumentDisplayed documentDisplayed, tq.e<? super oq.i0> eVar) {
            k kVar = l0.this.new k(eVar);
            kVar.f165818f = documentDisplayed;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqb0/i;", "action", "Lqb0/k$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqb0/i;Lqb0/k$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ShowSnackBar, qb0.k.DocumentDisplayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165821f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowSnackBar showSnackBar = (ShowSnackBar) this.f165821f;
            uq.b.e();
            if (this.f165820e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            l0.this.y(showSnackBar.getSnackBar());
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowSnackBar showSnackBar, qb0.k.DocumentDisplayed documentDisplayed, tq.e<? super oq.i0> eVar) {
            l lVar = l0.this.new l(eVar);
            lVar.f165821f = showSnackBar;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqb0/g;", "action", "Lk10/c0;", "Lqb0/k$c;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lqb0/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ShowBottomSheet, k10.c0<qb0.k.DocumentDisplayed>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f165825g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0.k.DocumentDisplayed O(ShowBottomSheet showBottomSheet, qb0.k.DocumentDisplayed documentDisplayed) {
            return qb0.k.DocumentDisplayed.b(documentDisplayed, null, g30.v.EXPANDED, showBottomSheet.getBottomSheetData(), null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowBottomSheet showBottomSheet = (ShowBottomSheet) this.f165824f;
            k10.c0 c0Var = (k10.c0) this.f165825g;
            uq.b.e();
            if (this.f165823e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: qb0.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.m.O(showBottomSheet, (k.DocumentDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowBottomSheet showBottomSheet, k10.c0<qb0.k.DocumentDisplayed> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            m mVar = new m(eVar);
            mVar.f165824f = showBottomSheet;
            mVar.f165825g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqb0/e;", "<unused var>", "Lk10/c0;", "Lqb0/k$c;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lqb0/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<qb0.e, k10.c0<qb0.k.DocumentDisplayed>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165827f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0.k.DocumentDisplayed O(qb0.k.DocumentDisplayed documentDisplayed) {
            return qb0.k.DocumentDisplayed.b(documentDisplayed, null, g30.v.HIDDEN, null, null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f165827f;
            uq.b.e();
            if (this.f165826e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: qb0.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.n.O((k.DocumentDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qb0.e eVar, k10.c0<qb0.k.DocumentDisplayed> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar2) {
            n nVar = new n(eVar2);
            nVar.f165827f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqb0/c;", "<unused var>", "Lk10/c0;", "Lqb0/l;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lqb0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<qb0.c, k10.c0<ErrorDeleting>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165829f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0.k.DeletingDocument O(k10.c0 c0Var, ErrorDeleting errorDeleting) {
            return new qb0.k.DeletingDocument(((ErrorDeleting) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f165829f;
            uq.b.e();
            if (this.f165828e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qb0.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.o.O(c0Var, (ErrorDeleting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qb0.c cVar, k10.c0<ErrorDeleting> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            o oVar = new o(eVar);
            oVar.f165829f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqb0/k$a;", "state", "Lk10/l;", "Lqb0/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<k10.c0<qb0.k.DeletingDocument>, tq.e<? super k10.l<? extends qb0.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165831f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqb0/k;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qb0.k>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f165833e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l0 f165834f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<qb0.k.DeletingDocument> f165835g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, k10.c0<qb0.k.DeletingDocument> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f165834f = l0Var;
                this.f165835g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ErrorDeleting X(k10.c0 c0Var, final l0 l0Var, dx.b bVar, qb0.k.DeletingDocument deletingDocument) {
                return new ErrorDeleting(l0Var.errorVMSFactory.a(l0Var.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: qb0.e1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l0.p.a.Y(l0Var, (ib4.c.b) obj);
                    }
                }, 2, null))), ((qb0.k.DeletingDocument) c0Var.a()).getData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(l0 l0Var, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    l0Var.d9(qb0.a.f165694a);
                } else {
                    if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                        throw new oq.p();
                    }
                    l0Var.d9(qb0.c.f165699a);
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f165833e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    eg0.d dVar = this.f165834f.deleteDocumentByIDUC;
                    eg0.d.Params params = new eg0.d.Params(this.f165835g.a().getData().getDocumentId());
                    this.f165833e = 1;
                    obj = dVar.c(params, this);
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
                final k10.c0<qb0.k.DeletingDocument> c0Var = this.f165835g;
                final l0 l0Var = this.f165834f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: qb0.d1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.p.a.X(c0Var, l0Var, bVar, (k.DeletingDocument) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                l0Var.d9(qb0.a.f165694a);
                return c0Var.c();
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f165834f, this.f165835g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends qb0.k>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f165831f;
            Object objE = uq.b.e();
            int i15 = this.f165830e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = l0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(l0.this, c0Var, null);
            this.f165831f = vq.j.a(c0Var);
            this.f165830e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<qb0.k.DeletingDocument> c0Var, tq.e<? super k10.l<? extends qb0.k>> eVar) {
            return ((p) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = l0.this.new p(eVar);
            pVar.f165831f = obj;
            return pVar;
        }
    }

    public l0(n20.j jVar, rb0.h hVar, ac4.a aVar, eg0.g gVar, eg0.d dVar, t2.a aVar2, hb4.d dVar2, ib4.c cVar, rb0.l lVar, mx.c cVar2, df0.n nVar, cb4.j jVar2, i70.n nVar2, rb0.a aVar3, a.SetupData setupData) {
        this.mapper = hVar;
        this.callActionWithLoaderUseCase = aVar;
        this.getDynamicDocumentUC = gVar;
        this.deleteDocumentByIDUC = dVar;
        this.deps = aVar2;
        this.errorVMSFactory = dVar2;
        this.genericDomainErrorMapper = cVar;
        this.verificationDataMapper = lVar;
        this.labelProvider = cVar2;
        this.requestDocumentUpdateUC = nVar;
        this.dialogVmsFactory = jVar2;
        this.snackBarManagerStateHolder = nVar2;
        this.dynamicDocumentBitmapDecoder = aVar3;
        this.setupData = setupData;
        qb0.k.LoadingDocument loadingDocument = new qb0.k.LoadingDocument(setupData.getDocumentId());
        this.initialState = loadingDocument;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(loadingDocument, new er.l() { // from class: qb0.b0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.L9(this.f165698a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), F9(new State<>(loadingDocument, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business E9() {
        return new dx.b.Business(ob0.a.READ_DATA_ERROR, null, this.labelProvider.c(mb0.a.f125249r), this.labelProvider.c(mb0.a.f125248q), null, this.labelProvider.c(mb0.a.f125233b), this.labelProvider.c(mb0.a.f125235d), 18, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qb0.p.a F9(State<qb0.k> state) {
        rb0.h hVar = this.mapper;
        er.a<oq.i0> aVarB9 = b9(qb0.a.f165694a);
        t2 t2Var = new t2(this.deps, androidx.p016lifecycle.u0.a(this));
        qb0.j jVar = qb0.j.f165721a;
        return hVar.b(new rb0.h.Params(state, t2Var, aVarB9, new er.l() { // from class: qb0.i0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.G9(this.f165720a, (n20.a) obj);
            }
        }, b9(jVar), b9(qb0.d.f165702a), b9(jVar), new er.l() { // from class: qb0.j0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.H9(this.f165722a, (p50.a) obj);
            }
        }, b9(qb0.c.f165699a), new er.l() { // from class: qb0.k0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.I9(this.f165739a, (DynamicDocumentBottomSheetData) obj);
            }
        }, b9(qb0.e.f165707a), new er.l() { // from class: qb0.a0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.J9(this.f165695a, (DialogData) obj);
            }
        }, b9(qb0.b.f165697a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(l0 l0Var, n20.a aVar) {
        l0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(l0 l0Var, p50.a aVar) {
        l0Var.d9(new ShowSnackBar(aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(l0 l0Var, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData) {
        l0Var.d9(new ShowBottomSheet(dynamicDocumentBottomSheetData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(l0 l0Var, DialogData dialogData) {
        l0Var.d9(new ShowDialog(dialogData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(final l0 l0Var, k10.v vVar) {
        vVar.c(fr.q0.c(qb0.k.class), new er.l() { // from class: qb0.z
            @Override // er.l
            public final Object b(Object obj) {
                return l0.M9(this.f165876a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(qb0.k.LoadingDocument.class), new er.l() { // from class: qb0.c0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.N9(this.f165700a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(qb0.k.UpdatingDocument.class), new er.l() { // from class: qb0.d0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.O9(this.f165703a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ErrorUpdating.class), new er.l() { // from class: qb0.e0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.P9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(qb0.k.DocumentDisplayed.class), new er.l() { // from class: qb0.f0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.Q9(this.f165713a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ErrorDeleting.class), new er.l() { // from class: qb0.g0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.R9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(qb0.k.DeletingDocument.class), new er.l() { // from class: qb0.h0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.S9(this.f165717a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(l0 l0Var, k10.z zVar) {
        c cVar = l0Var.new c(null);
        zVar.x(fr.q0.c(qb0.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(l0 l0Var, k10.z zVar) {
        zVar.A(new d(zVar, l0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(l0 l0Var, k10.z zVar) {
        zVar.A(l0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(k10.z zVar) {
        f fVar = new f(null);
        zVar.v(fr.q0.c(qb0.j.class), k10.o.CANCEL_PREVIOUS, fVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(l0 l0Var, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(qb0.c.class), oVar, gVar);
        zVar.v(fr.q0.c(ShowDialog.class), oVar, l0Var.new h(null));
        zVar.v(fr.q0.c(qb0.b.class), oVar, new i(null));
        zVar.v(fr.q0.c(qb0.j.class), oVar, new j(null));
        zVar.x(fr.q0.c(qb0.d.class), oVar, l0Var.new k(null));
        zVar.x(fr.q0.c(ShowSnackBar.class), oVar, l0Var.new l(null));
        zVar.v(fr.q0.c(ShowBottomSheet.class), oVar, new m(null));
        zVar.v(fr.q0.c(qb0.e.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(k10.z zVar) {
        o oVar = new o(null);
        zVar.v(fr.q0.c(qb0.c.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(l0 l0Var, k10.z zVar) {
        zVar.A(l0Var.new p(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(qb0.p.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<qb0.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<qb0.k>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<qb0.p.a> getState() {
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
