package po3;

import androidx.compose.ui.graphics.Color;
import co3.n;
import eo3.DocumentConfigLabel;
import eo3.MultiDocumentSelectorLabel;
import er.p;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oo3.PersonBottomSheetData;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v0;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001BB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u001f\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010&\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00170\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010 J%\u0010'\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010-\u001a\u00020,2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b-\u0010.JA\u00100\u001a\b\u0012\u0004\u0012\u00020/0)*\b\u0012\u0004\u0012\u00020\u001d0)2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u0004\u0018\u00010!*\u00020$2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u00103J'\u00106\u001a\b\u0012\u0004\u0012\u00020$0)*\b\u0012\u0004\u0012\u00020$0)2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107JI\u00108\u001a\b\u0012\u0004\u0012\u00020/0)*\b\u0012\u0004\u0012\u00020$0)2\u0006\u00105\u001a\u0002042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020!*\u00020$H\u0002¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\u0004\u0018\u00010=*\n\u0012\u0004\u0012\u00020<\u0018\u00010)H\u0002¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lpo3/m;", "Lxw/f;", "Lpo3/m$a;", "Loo3/e$a;", "Lmx/c;", "labelProvider", "Llo3/b;", "documentRemoteResourcesMapper", "Llo3/e;", "documentSectionMapper", "Llo3/f;", "entitySectionMapper", "Llo3/a;", "bulletSectionMapper", "<init>", "(Lmx/c;Llo3/b;Llo3/e;Llo3/f;Llo3/a;)V", "Loo3/d$b;", "state", "params", "Loo3/b;", "G", "(Loo3/d$b;Lpo3/m$a;)Loo3/b;", "Lkotlin/Function0;", "Loq/i0;", "onHideBottomSheet", "Lg30/u;", "I", "(Loo3/d$b;Ler/a;)Lg30/u;", "Lkotlin/Function1;", "Lk34/g;", "changeDocument", "v", "(Ler/a;Ler/l;Loo3/d$b;)Loo3/b;", "Lmx/a;", "K", "(Loo3/d$b;)Lmx/a;", "Lco3/n;", "changeSubDocument", "z", "u", "(Loo3/d$b;Ler/a;)Loo3/b;", "", "", "availableDocumentList", "", "Q", "(Ljava/util/List;)Z", "Ln50/g;", "T", "(Ljava/util/List;Ler/l;Ler/a;)Ljava/util/List;", "F", "(Lco3/n;Loo3/d$b;)Lmx/a;", "Lrq0/b;", "documentType", "V", "(Ljava/util/List;Lrq0/b;)Ljava/util/List;", "R", "(Ljava/util/List;Lrq0/b;Ler/l;Ler/a;)Ljava/util/List;", "W", "(Lco3/n;)Lmx/a;", "Leo3/a;", "", "X", "(Ljava/util/List;)Ljava/lang/String;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lpo3/m$a;)Loo3/e$a;", "a", "Lmx/c;", "b", "Llo3/b;", "c", "Llo3/e;", "d", "Llo3/f;", "e", "Llo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements xw.f<Params, oo3.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lo3.b documentRemoteResourcesMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lo3.e documentSectionMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lo3.f entitySectionMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lo3.a bulletSectionMapper;

    /* JADX INFO: renamed from: po3.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b \u0010&R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010&R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b'\u0010#¨\u0006)"}, d2 = {"Lpo3/m$a;", "", "Loo3/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "navigateBack", "navigateToNext", "Lkotlin/Function1;", "Lk34/g;", "changeDocument", "Lco3/n;", "changeSubDocument", "Ljo3/b;", "onShowBottomSheet", "onHideBottomSheet", "<init>", "(Loo3/d;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loo3/d;", "g", "()Loo3/d;", "b", "Ler/a;", "c", "()Ler/a;", "d", "Ler/l;", "()Ler/l;", "e", "f", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final oo3.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateToNext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<k34.g, i0> changeDocument;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n, i0> changeSubDocument;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<jo3.b, i0> onShowBottomSheet;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHideBottomSheet;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(oo3.d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.l<? super k34.g, i0> lVar, er.l<? super n, i0> lVar2, er.l<? super jo3.b, i0> lVar3, er.a<i0> aVar3) {
            this.state = dVar;
            this.navigateBack = aVar;
            this.navigateToNext = aVar2;
            this.changeDocument = lVar;
            this.changeSubDocument = lVar2;
            this.onShowBottomSheet = lVar3;
            this.onHideBottomSheet = aVar3;
        }

        public final er.l<k34.g, i0> a() {
            return this.changeDocument;
        }

        public final er.l<n, i0> b() {
            return this.changeSubDocument;
        }

        public final er.a<i0> c() {
            return this.navigateBack;
        }

        public final er.a<i0> d() {
            return this.navigateToNext;
        }

        public final er.a<i0> e() {
            return this.onHideBottomSheet;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.navigateBack, params.navigateBack) && t.c(this.navigateToNext, params.navigateToNext) && t.c(this.changeDocument, params.changeDocument) && t.c(this.changeSubDocument, params.changeSubDocument) && t.c(this.onShowBottomSheet, params.onShowBottomSheet) && t.c(this.onHideBottomSheet, params.onHideBottomSheet);
        }

        public final er.l<jo3.b, i0> f() {
            return this.onShowBottomSheet;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final oo3.d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.navigateBack.hashCode()) * 31) + this.navigateToNext.hashCode()) * 31) + this.changeDocument.hashCode()) * 31) + this.changeSubDocument.hashCode()) * 31) + this.onShowBottomSheet.hashCode()) * 31) + this.onHideBottomSheet.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", navigateBack=" + this.navigateBack + ", navigateToNext=" + this.navigateToNext + ", changeDocument=" + this.changeDocument + ", changeSubDocument=" + this.changeSubDocument + ", onShowBottomSheet=" + this.onShowBottomSheet + ", onHideBottomSheet=" + this.onHideBottomSheet + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f161577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f161578c;

        static {
            int[] iArr = new int[jo3.b.values().length];
            try {
                iArr[jo3.b.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jo3.b.SUBDOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jo3.b.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jo3.b.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f161576a = iArr;
            int[] iArr2 = new int[v.values().length];
            try {
                iArr2[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f161577b = iArr2;
            int[] iArr3 = new int[wn3.a.values().length];
            try {
                iArr3[wn3.a.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[wn3.a.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f161578c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f161579a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1412806462);
            if (p076m2.t.k()) {
                p076m2.t.o(1412806462, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.documentdetail.person.mapper.PersonScreenMapper.getChangeDocumentBottomSheetData.<anonymous> (PersonScreenMapper.kt:193)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f161580a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(2119103498);
            if (p076m2.t.k()) {
                p076m2.t.o(2119103498, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.documentdetail.person.mapper.PersonScreenMapper.getChangeSubDocumentBottomSheetData.<anonymous> (PersonScreenMapper.kt:248)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ rq0.b f161581a;

        public e(rq0.b bVar) {
            this.f161581a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            n nVar = (n) t15;
            boolean z15 = true;
            Boolean boolValueOf = Boolean.valueOf(!nVar.getIsOwner() || (nVar instanceof n.DrivingLicenceDocument) || (nVar instanceof n.RailwayDocument) || this.f161581a == rq0.b.c.TEACHER);
            n nVar2 = (n) t16;
            if (nVar2.getIsOwner() && !(nVar2 instanceof n.DrivingLicenceDocument) && !(nVar2 instanceof n.RailwayDocument) && this.f161581a != rq0.b.c.TEACHER) {
                z15 = false;
            }
            return sq.a.e(boolValueOf, Boolean.valueOf(z15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f161582a;

        public f(Comparator comparator) {
            this.f161582a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            int iCompare = this.f161582a.compare(t15, t16);
            return iCompare != 0 ? iCompare : sq.a.e(((n) t15).getName(), ((n) t16).getName());
        }
    }

    public m(mx.c cVar, lo3.b bVar, lo3.e eVar, lo3.f fVar, lo3.a aVar) {
        this.labelProvider = cVar;
        this.documentRemoteResourcesMapper = bVar;
        this.documentSectionMapper = eVar;
        this.entitySectionMapper = fVar;
        this.bulletSectionMapper = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(er.l lVar, n nVar) {
        lVar.b(nVar);
        return i0.f148189a;
    }

    private final Label F(n nVar, oo3.d.Initialized initialized) {
        List<DocumentConfigLabel> listA;
        String strX;
        if (nVar instanceof n.d) {
            MultiDocumentSelectorLabel multiDocumentSelectorLabel = initialized.getMultiDocumentSelectorLabel();
            if (multiDocumentSelectorLabel == null || (listA = multiDocumentSelectorLabel.a()) == null || (strX = X(listA)) == null) {
                return null;
            }
            return mx.b.b(strX, "selectorInfoText");
        }
        if ((nVar instanceof n.DiiaDocument) || (nVar instanceof n.KdrDocument) || (nVar instanceof n.DynamicDocument)) {
            return this.labelProvider.c(un3.b.f199414e2);
        }
        if (nVar instanceof n.DrivingLicenceDocument) {
            return this.labelProvider.c(un3.b.f199428h1);
        }
        if (nVar instanceof n.RailwayDocument) {
            return this.labelProvider.c(un3.b.X2);
        }
        throw new oq.p();
    }

    private final PersonBottomSheetData G(oo3.d.Initialized state, Params params) {
        int i15 = b.f161576a[state.getOpenedSheetType().ordinal()];
        if (i15 == 1) {
            return v(params.e(), params.a(), state);
        }
        if (i15 == 2) {
            return z(params.e(), params.b(), state);
        }
        if (i15 == 3) {
            return u(state, params.e());
        }
        if (i15 == 4) {
            return new PersonBottomSheetData(null, new ModalBottomSheetData(new ModalSheetState(v.HIDDEN, false, new er.l() { // from class: po3.c
                @Override // er.l
                public final Object b(Object obj) {
                    return m.H((v) obj);
                }
            }, 2, null), null, null, null, 14, null));
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(v vVar) {
        return i0.f148189a;
    }

    private final ModalSheetState I(oo3.d.Initialized state, final er.a<i0> onHideBottomSheet) {
        return new ModalSheetState(state.getModalBottomSheetValue(), false, new er.l() { // from class: po3.d
            @Override // er.l
            public final Object b(Object obj) {
                return m.J(onHideBottomSheet, (v) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(er.a aVar, v vVar) {
        int i15 = b.f161577b[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    private final Label K(oo3.d.Initialized state) {
        List<DocumentConfigLabel> listB;
        String strX;
        Label labelB;
        if (state.getSelectedDocument().getType() instanceof rq0.b.c) {
            MultiDocumentSelectorLabel multiDocumentSelectorLabel = state.getMultiDocumentSelectorLabel();
            return (multiDocumentSelectorLabel == null || (listB = multiDocumentSelectorLabel.b()) == null || (strX = X(listB)) == null || (labelB = mx.b.b(strX, "selectionLabel")) == null) ? this.labelProvider.c(un3.b.Y2) : labelB;
        }
        if (state.getSubDocument() instanceof n.DrivingLicenceDocument) {
            return this.labelProvider.c(un3.b.E0);
        }
        return ((state.getSubDocument() instanceof n.RailwayDocument) && ((n.RailwayDocument) state.getSubDocument()).getIsOwner() && ((n.RailwayDocument) state.getSubDocument()).getIsFamily()) ? this.labelProvider.c(un3.b.X2) : this.labelProvider.c(un3.b.Y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params) {
        params.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params) {
        params.f().b(jo3.b.DOCUMENT);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(Params params) {
        params.f().b(jo3.b.SUBDOCUMENT);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(Params params) {
        params.f().b(jo3.b.INFO);
        return i0.f148189a;
    }

    private final boolean Q(List<? extends Object> availableDocumentList) {
        return !availableDocumentList.isEmpty() && availableDocumentList.size() > 1;
    }

    private final List<DefaultSingleCardData> R(List<? extends n> list, rq0.b bVar, final er.l<? super n, i0> lVar, final er.a<i0> aVar) {
        List<? extends n> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        for (final n nVar : list2) {
            n50.b.Title title = new n50.b.Title(new SingleCardLabel((!nVar.getIsOwner() || (nVar instanceof n.DynamicDocument) || (nVar instanceof n.DrivingLicenceDocument) || (nVar instanceof n.RailwayDocument) || bVar == rq0.b.c.TEACHER || bVar == rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION || bVar == rq0.b.c.ELECTRONIC_DIPLOMA_PHD || bVar == rq0.b.c.ELECTRONIC_DIPLOMA_DSC) ? W(nVar) : this.labelProvider.e(un3.b.f199419f2, nVar.getName()), null, null, 0, 0, null, 62, null));
            String body = nVar.getBody();
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: po3.h
                @Override // er.a
                public final Object a() {
                    return m.S(aVar, lVar, nVar);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, body != null ? new SingleCardLabel(mx.b.b(body, "body"), null, null, 0, 0, null, 62, null) : null, 1, null), nVar instanceof n.DrivingLicenceDocument ? new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(jz.a.M2, null, 2, null), null, null, 6, null), 3, null) : new LeadingSection(false, null, null, 7, null), null, null, 3325, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(er.a aVar, er.l lVar, n nVar) {
        aVar.a();
        lVar.b(nVar);
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> T(List<? extends k34.g> list, final er.l<? super k34.g, i0> lVar, final er.a<i0> aVar) {
        List<? extends k34.g> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        for (final k34.g gVar : list2) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: po3.g
                @Override // er.a
                public final Object a() {
                    return m.U(aVar, lVar, gVar);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(gVar.getName()), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(gVar.getIcons().getIcon(), null, 2, null), null, null, 6, null), 3, null), null, null, 3325, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(er.a aVar, er.l lVar, k34.g gVar) {
        aVar.a();
        lVar.b(gVar);
        return i0.f148189a;
    }

    private final List<n> V(List<? extends n> list, rq0.b bVar) {
        return pq.v.U0(list, new f(new e(bVar)));
    }

    private final Label W(n nVar) {
        if (!(nVar instanceof n.DrivingLicenceDocument)) {
            if (nVar instanceof n.RailwayDocument) {
                n.RailwayDocument railwayDocument = (n.RailwayDocument) nVar;
                if (railwayDocument.getIsOwner() && railwayDocument.getIsFamily()) {
                    return new Label(dz.e.b(railwayDocument.getCategory().getValue(), null, 1, null), "railwayCategory");
                }
            }
            return new Label(nVar.getName(), "holderName");
        }
        int i15 = b.f161578c[((n.DrivingLicenceDocument) nVar).getSubtype().ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(un3.b.f199433i1);
        }
        if (i15 == 2) {
            return this.labelProvider.c(un3.b.f199438j1);
        }
        throw new oq.p();
    }

    private final String X(List<DocumentConfigLabel> list) {
        if (list != null) {
            return this.documentRemoteResourcesMapper.a(list);
        }
        return null;
    }

    private final PersonBottomSheetData u(oo3.d.Initialized state, er.a<i0> onHideBottomSheet) {
        return new PersonBottomSheetData(new oo3.c.Info(this.labelProvider.c(un3.b.f199400b3)), new ModalBottomSheetData(I(state, onHideBottomSheet), this.labelProvider.c(un3.b.f199405c3), onHideBottomSheet, null, 8, null));
    }

    private final PersonBottomSheetData v(er.a<i0> onHideBottomSheet, final er.l<? super k34.g, i0> changeDocument, oo3.d.Initialized state) {
        return new PersonBottomSheetData(new oo3.c.Document(T(state.d(), new er.l() { // from class: po3.f
            @Override // er.l
            public final Object b(Object obj) {
                return m.x(changeDocument, (k34.g) obj);
            }
        }, onHideBottomSheet)), new ModalBottomSheetData(I(state, onHideBottomSheet), this.labelProvider.c(un3.b.E0), onHideBottomSheet, c.f161579a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(er.l lVar, k34.g gVar) {
        lVar.b(gVar);
        return i0.f148189a;
    }

    private final PersonBottomSheetData z(er.a<i0> onHideBottomSheet, final er.l<? super n, i0> changeSubDocument, oo3.d.Initialized state) {
        List<DefaultSingleCardData> listN;
        List<n> listP = state.p();
        if (listP == null || (listN = R(V(listP, state.getSelectedDocument().getType()), state.getSelectedDocument().getType(), new er.l() { // from class: po3.e
            @Override // er.l
            public final Object b(Object obj) {
                return m.E(changeSubDocument, (n) obj);
            }
        }, onHideBottomSheet)) == null) {
            listN = pq.v.n();
        }
        return new PersonBottomSheetData(new oo3.c.Document(listN), new ModalBottomSheetData(I(state, onHideBottomSheet), K(state), onHideBottomSheet, d.f161580a));
    }

    @Override // er.l
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public oo3.e.a b(final Params params) {
        oo3.d state = params.getState();
        if ((state instanceof oo3.d.a) || (state instanceof oo3.d.Loading)) {
            return oo3.e.a.C3672a.f147909a;
        }
        if (!(state instanceof oo3.d.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(un3.b.f199517z0), null, null, null, 28, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: po3.i
            @Override // er.a
            public final Object a() {
                return m.M(params);
            }
        })), null, null, 53, null);
        er.a<i0> aVarC = params.c();
        Label labelC = this.labelProvider.c(un3.b.D0);
        lo3.e.AdditionalData additionalData = null;
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(un3.b.f199395a3), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null);
        n50.k kVarB = this.entitySectionMapper.b(new lo3.f.Params(lo3.f.a.b.f119034a));
        n50.k kVarB2 = this.bulletSectionMapper.b(new lo3.a.Params(((oo3.d.Initialized) params.getState()).g()));
        lo3.e eVar = this.documentSectionMapper;
        lo3.e.MainData mainData = new lo3.e.MainData(Q(((oo3.d.Initialized) params.getState()).d()), ((oo3.d.Initialized) params.getState()).getSelectedDocument(), ((oo3.d.Initialized) params.getState()).l().c(), new er.a() { // from class: po3.j
            @Override // er.a
            public final Object a() {
                return m.N(params);
            }
        });
        n subDocument = ((oo3.d.Initialized) params.getState()).getSubDocument();
        if (subDocument != null) {
            List<n> listP = ((oo3.d.Initialized) params.getState()).p();
            if (listP == null) {
                listP = pq.v.n();
            }
            additionalData = new lo3.e.AdditionalData(Q(listP), params.getState().a(), subDocument, F(subDocument, (oo3.d.Initialized) params.getState()), new er.a() { // from class: po3.k
                @Override // er.a
                public final Object a() {
                    return m.O(params);
                }
            });
        }
        return new oo3.e.a.Initialized(baseScaffoldData, aVarC, labelC, buttonData, kVarB, kVarB2, eVar.b(new lo3.e.Params(mainData, additionalData)), G((oo3.d.Initialized) params.getState(), params), new ButtonTextData(null, this.labelProvider.c(un3.b.f199431i), null, null, new er.a() { // from class: po3.l
            @Override // er.a
            public final Object a() {
                return m.P(params);
            }
        }, 13, null), this.labelProvider.c(un3.b.f199405c3));
    }
}
