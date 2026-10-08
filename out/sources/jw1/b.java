package jw1;

import er.l;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import gv1.DocumentActionAttribute;
import iw1.c;
import iy.b0;
import mv1.DynamicDocumentData;
import mx.Label;
import n20.State;
import o20.s2;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import wv1.DynamicDocumentBottomSheetData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljw1/b;", "Lxw/f;", "Ljw1/b$a;", "Liw1/c$a;", "Lmx/c;", "labelProvider", "Lvv1/f;", "dynamicDocumentMapper", "<init>", "(Lmx/c;Lvv1/f;)V", "params", "q", "(Ljw1/b$a;)Liw1/c$a;", "Lmx/a;", "l", "()Lmx/a;", "i", "m", "e", "f", "h", "a", "Lmx/c;", "b", "Lvv1/f;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vv1.f dynamicDocumentMapper;

    /* JADX INFO: renamed from: jw1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b%\u0010/R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010/R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b2\u0010/R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010/R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b4\u0010/R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b)\u0010/R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b9\u00108R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b0\u00108R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b-\u0010/R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b:\u00108R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b5\u0010/¨\u0006;"}, d2 = {"Ljw1/b$a;", "", "Ln20/b;", "Liw1/b;", "state", "Lo20/s2;", "documentVMS", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "hideSnackBarAction", "downloadDocumentAction", "updateDocumentAction", "goToSafeBus", "Lkotlin/Function1;", "Lgv1/c$a;", "onHandleActionType", "confirmDocumentAction", "", "openAnnotationLink", "Ln20/a;", "dispatchAction", "deleteDocumentAction", "Lwv1/b;", "showBottomSheet", "hideBottomSheet", "<init>", "(Ln20/b;Lo20/s2;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "m", "()Ln20/b;", "b", "Lo20/s2;", "e", "()Lo20/s2;", "c", "Ler/a;", "()Ler/a;", "d", "i", "f", "n", "g", "h", "Ler/l;", "j", "()Ler/l;", "k", "l", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<iw1.b> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBarAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadDocumentAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> updateDocumentAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSafeBus;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DocumentActionAttribute.a, i0> onHandleActionType;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> confirmDocumentAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openAnnotationLink;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDocumentAction;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DynamicDocumentBottomSheetData, i0> showBottomSheet;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideBottomSheet;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<iw1.b> state, s2 s2Var, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, l<? super DocumentActionAttribute.a, i0> lVar, er.a<i0> aVar6, l<? super String, i0> lVar2, l<? super n20.a, i0> lVar3, er.a<i0> aVar7, l<? super DynamicDocumentBottomSheetData, i0> lVar4, er.a<i0> aVar8) {
            this.state = state;
            this.documentVMS = s2Var;
            this.closeAction = aVar;
            this.hideSnackBarAction = aVar2;
            this.downloadDocumentAction = aVar3;
            this.updateDocumentAction = aVar4;
            this.goToSafeBus = aVar5;
            this.onHandleActionType = lVar;
            this.confirmDocumentAction = aVar6;
            this.openAnnotationLink = lVar2;
            this.dispatchAction = lVar3;
            this.deleteDocumentAction = aVar7;
            this.showBottomSheet = lVar4;
            this.hideBottomSheet = aVar8;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.confirmDocumentAction;
        }

        public final er.a<i0> c() {
            return this.deleteDocumentAction;
        }

        public final l<n20.a, i0> d() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.documentVMS, params.documentVMS) && t.c(this.closeAction, params.closeAction) && t.c(this.hideSnackBarAction, params.hideSnackBarAction) && t.c(this.downloadDocumentAction, params.downloadDocumentAction) && t.c(this.updateDocumentAction, params.updateDocumentAction) && t.c(this.goToSafeBus, params.goToSafeBus) && t.c(this.onHandleActionType, params.onHandleActionType) && t.c(this.confirmDocumentAction, params.confirmDocumentAction) && t.c(this.openAnnotationLink, params.openAnnotationLink) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.deleteDocumentAction, params.deleteDocumentAction) && t.c(this.showBottomSheet, params.showBottomSheet) && t.c(this.hideBottomSheet, params.hideBottomSheet);
        }

        public final er.a<i0> f() {
            return this.downloadDocumentAction;
        }

        public final er.a<i0> g() {
            return this.goToSafeBus;
        }

        public final er.a<i0> h() {
            return this.hideBottomSheet;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.state.hashCode() * 31) + this.documentVMS.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.hideSnackBarAction.hashCode()) * 31) + this.downloadDocumentAction.hashCode()) * 31) + this.updateDocumentAction.hashCode()) * 31) + this.goToSafeBus.hashCode()) * 31) + this.onHandleActionType.hashCode()) * 31) + this.confirmDocumentAction.hashCode()) * 31) + this.openAnnotationLink.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.deleteDocumentAction.hashCode()) * 31) + this.showBottomSheet.hashCode()) * 31) + this.hideBottomSheet.hashCode();
        }

        public final er.a<i0> i() {
            return this.hideSnackBarAction;
        }

        public final l<DocumentActionAttribute.a, i0> j() {
            return this.onHandleActionType;
        }

        public final l<String, i0> k() {
            return this.openAnnotationLink;
        }

        public final l<DynamicDocumentBottomSheetData, i0> l() {
            return this.showBottomSheet;
        }

        public final State<iw1.b> m() {
            return this.state;
        }

        public final er.a<i0> n() {
            return this.updateDocumentAction;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentVMS=" + this.documentVMS + ", closeAction=" + this.closeAction + ", hideSnackBarAction=" + this.hideSnackBarAction + ", downloadDocumentAction=" + this.downloadDocumentAction + ", updateDocumentAction=" + this.updateDocumentAction + ", goToSafeBus=" + this.goToSafeBus + ", onHandleActionType=" + this.onHandleActionType + ", confirmDocumentAction=" + this.confirmDocumentAction + ", openAnnotationLink=" + this.openAnnotationLink + ", dispatchAction=" + this.dispatchAction + ", deleteDocumentAction=" + this.deleteDocumentAction + ", showBottomSheet=" + this.showBottomSheet + ", hideBottomSheet=" + this.hideBottomSheet + ')';
        }
    }

    /* JADX INFO: renamed from: jw1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2523b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106258a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f106258a = iArr;
        }
    }

    public b(mx.c cVar, vv1.f fVar) {
        this.labelProvider = cVar;
        this.dynamicDocumentMapper = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, v vVar) {
        int i15 = C2523b.f106258a[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new p();
            }
            params.h().a();
        }
        return i0.f148189a;
    }

    public final Label e() {
        return this.labelProvider.c(dv1.a.f44627c);
    }

    public final Label f() {
        return this.labelProvider.c(dv1.a.f44648m0);
    }

    public final Label h() {
        return this.labelProvider.c(dv1.a.f44633f);
    }

    public final Label i() {
        return this.labelProvider.c(dv1.a.f44644k0);
    }

    public final Label l() {
        return this.labelProvider.c(dv1.a.f44646l0);
    }

    public final Label m() {
        return this.labelProvider.c(dv1.a.f44659s);
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        iw1.b bVarD = params.m().d();
        if (t.c(bVarD, iw1.b.a.f97285a)) {
            return c.a.C2283a.f97295a;
        }
        if (!(bVarD instanceof iw1.b.Initialized)) {
            throw new p();
        }
        vv1.f fVar = this.dynamicDocumentMapper;
        State<iw1.b> stateM = params.m();
        iw1.b.Initialized initialized = (iw1.b.Initialized) bVarD;
        DynamicDocumentData multiDocumentData = initialized.getMultiDocumentData();
        boolean zE = initialized.getMultiDocumentData().getStatus().e();
        b0 mainDocumentPhoto = initialized.getMainDocumentPhoto();
        b0 mainDocumentPesel = initialized.getMainDocumentPesel();
        er.a<i0> aVarA = params.a();
        er.a<i0> aVarI = params.i();
        er.a<i0> aVarF = params.f();
        er.a<i0> aVarN = params.n();
        er.a<i0> aVarB = params.b();
        er.a<i0> aVarG = params.g();
        l<DocumentActionAttribute.a, i0> lVarJ = params.j();
        l<String, i0> lVarK = params.k();
        er.a<i0> aVarC = params.c();
        l<n20.a, i0> lVarD = params.d();
        l<DynamicDocumentBottomSheetData, i0> lVarL = params.l();
        er.a<i0> aVarH = params.h();
        return new c.a.Initialized(fVar.b(new vv1.f.Params(stateM, initialized.getDocumentShortName(), multiDocumentData, zE, mainDocumentPhoto, mainDocumentPesel, params.getDocumentVMS(), initialized.getBitmapsByFieldReference(), aVarA, aVarI, aVarF, aVarN, aVarB, aVarG, lVarJ, lVarK, lVarL, aVarH, aVarC, lVarD)), new ModalBottomSheetData(new ModalSheetState(initialized.getBottomSheetValue(), false, new l() { // from class: jw1.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.r(params, (v) obj);
            }
        }, 2, null), this.labelProvider.c(dv1.a.f44623a), null, null, 12, null), params.i(), initialized.getBottomSheetContentData());
    }
}
