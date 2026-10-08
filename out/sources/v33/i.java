package v33;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import w30.CheckBoxSingleData;
import x33.SummaryContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lv33/i;", "Ll00/e;", "Lv33/i$a;", "a", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\u0004\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lv33/i$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBack", "c", "b", "Lv33/i$a$a;", "Lv33/i$a$b;", "Lv33/i$a$c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: v33.i$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lv33/i$a$a;", "Lv33/i$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Ler/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lhb4/c;", "()Lhb4/c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(er.a<oq.i0> aVar, hb4.c cVar) {
                this.onBack = aVar;
                this.errorVMSAdapter = cVar;
            }

            @Override // v33.i.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.onBack, error.onBack) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
            }

            public int hashCode() {
                return (this.onBack.hashCode() * 31) + this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "Error(onBack=" + this.onBack + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: v33.i$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lv33/i$a$b;", "Lv33/i$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Lx33/a;", "Lq40/f;", "iconPageData", "<init>", "(Ler/a;Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lq40/g;", "()Lq40/g;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f203554d = ((IconPageBottomContentData.f164663d | d40.b.f39676g) | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<SummaryContentData, IconPageBottomContentData> iconPageData;

            public Success(er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, IconPageData<SummaryContentData, IconPageBottomContentData> iconPageData) {
                this.onBack = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
            }

            @Override // v33.i.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final IconPageData<SummaryContentData, IconPageBottomContentData> c() {
                return this.iconPageData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return fr.t.c(this.onBack, success.onBack) && fr.t.c(this.baseScaffoldData, success.baseScaffoldData) && fr.t.c(this.iconPageData, success.iconPageData);
            }

            public int hashCode() {
                return (((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "Success(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }

        /* JADX INFO: renamed from: v33.i$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010 \u001a\u00020\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\"\u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b5\u0010BR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\b@\u0010?R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b<\u0010HR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bJ\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u0010HR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\bI\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bF\u0010HR\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bN\u0010=\u001a\u0004\bO\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010HR\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bP\u0010?R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bQ\u0010G\u001a\u0004\bN\u0010HR\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bO\u0010=\u001a\u0004\bR\u0010?R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bS\u0010G\u001a\u0004\bT\u0010HR\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bU\u0010=\u001a\u0004\bU\u0010?R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bT\u0010G\u001a\u0004\bS\u0010HR\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bR\u0010=\u001a\u0004\bV\u0010?R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bW\u0010G\u001a\u0004\bX\u0010HR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\bM\u0010?R\u0019\u0010!\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bX\u0010G\u001a\u0004\bK\u0010HR\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bV\u0010=\u001a\u0004\bY\u0010?R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bW\u0010\\¨\u0006]"}, d2 = {"Lv33/i$a$c;", "Lv33/i$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lcb4/i;", "dialogVMSAdapter", "Li50/a;", "baseScaffoldData", "Lmx/a;", "subtitle", "Lc30/b;", "alertData", "Lh30/a;", "nextButtonData", "detailsTitle", "Ln30/b;", "details", "placeTitle", "place", "otherReportTitle", "otherReport", "productDataTitle", "productData", "placeOfPurchaseDataTitle", "placeOfPurchaseData", "sellerOnlineDataTitle", "sellerOnlineData", "sellerOfflineDataTitle", "sellerOfflineData", "supplierDataTitle", "supplierData", "personalTitle", "personal", "statementTitle", "Lw30/a;", "statementCheckBoxSingleData", "<init>", "(Ler/a;Lcb4/i;Li50/a;Lmx/a;Lc30/b;Lh30/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Lw30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lcb4/i;", "f", "()Lcb4/i;", "c", "Li50/a;", "()Li50/a;", "d", "Lmx/a;", "w", "()Lmx/a;", "e", "Lc30/b;", "()Lc30/b;", "Lh30/a;", "g", "()Lh30/a;", "h", "Ln30/b;", "()Ln30/b;", "i", "o", "j", "l", "k", "m", "q", "n", "p", "u", "r", "t", "s", "y", "v", "x", "getStatementTitle", "z", "Lw30/a;", "()Lw30/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Summary implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subtitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label detailsTitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData details;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label placeTitle;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData place;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label otherReportTitle;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData otherReport;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label productDataTitle;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData productData;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label placeOfPurchaseDataTitle;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData placeOfPurchaseData;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label sellerOnlineDataTitle;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData sellerOnlineData;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label sellerOfflineDataTitle;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData sellerOfflineData;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label supplierDataTitle;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData supplierData;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label personalTitle;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData personal;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statementTitle;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData statementCheckBoxSingleData;

            public Summary(er.a<oq.i0> aVar, cb4.i iVar, BaseScaffoldData baseScaffoldData, Label label, c30.b bVar, ButtonData buttonData, Label label2, CardListData cardListData, Label label3, CardListData cardListData2, Label label4, CardListData cardListData3, Label label5, CardListData cardListData4, Label label6, CardListData cardListData5, Label label7, CardListData cardListData6, Label label8, CardListData cardListData7, Label label9, CardListData cardListData8, Label label10, CardListData cardListData9, Label label11, CheckBoxSingleData checkBoxSingleData) {
                this.onBack = aVar;
                this.dialogVMSAdapter = iVar;
                this.baseScaffoldData = baseScaffoldData;
                this.subtitle = label;
                this.alertData = bVar;
                this.nextButtonData = buttonData;
                this.detailsTitle = label2;
                this.details = cardListData;
                this.placeTitle = label3;
                this.place = cardListData2;
                this.otherReportTitle = label4;
                this.otherReport = cardListData3;
                this.productDataTitle = label5;
                this.productData = cardListData4;
                this.placeOfPurchaseDataTitle = label6;
                this.placeOfPurchaseData = cardListData5;
                this.sellerOnlineDataTitle = label7;
                this.sellerOnlineData = cardListData6;
                this.sellerOfflineDataTitle = label8;
                this.sellerOfflineData = cardListData7;
                this.supplierDataTitle = label9;
                this.supplierData = cardListData8;
                this.personalTitle = label10;
                this.personal = cardListData9;
                this.statementTitle = label11;
                this.statementCheckBoxSingleData = checkBoxSingleData;
            }

            @Override // v33.i.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getDetails() {
                return this.details;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getDetailsTitle() {
                return this.detailsTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Summary)) {
                    return false;
                }
                Summary summary = (Summary) other;
                return fr.t.c(this.onBack, summary.onBack) && fr.t.c(this.dialogVMSAdapter, summary.dialogVMSAdapter) && fr.t.c(this.baseScaffoldData, summary.baseScaffoldData) && fr.t.c(this.subtitle, summary.subtitle) && fr.t.c(this.alertData, summary.alertData) && fr.t.c(this.nextButtonData, summary.nextButtonData) && fr.t.c(this.detailsTitle, summary.detailsTitle) && fr.t.c(this.details, summary.details) && fr.t.c(this.placeTitle, summary.placeTitle) && fr.t.c(this.place, summary.place) && fr.t.c(this.otherReportTitle, summary.otherReportTitle) && fr.t.c(this.otherReport, summary.otherReport) && fr.t.c(this.productDataTitle, summary.productDataTitle) && fr.t.c(this.productData, summary.productData) && fr.t.c(this.placeOfPurchaseDataTitle, summary.placeOfPurchaseDataTitle) && fr.t.c(this.placeOfPurchaseData, summary.placeOfPurchaseData) && fr.t.c(this.sellerOnlineDataTitle, summary.sellerOnlineDataTitle) && fr.t.c(this.sellerOnlineData, summary.sellerOnlineData) && fr.t.c(this.sellerOfflineDataTitle, summary.sellerOfflineDataTitle) && fr.t.c(this.sellerOfflineData, summary.sellerOfflineData) && fr.t.c(this.supplierDataTitle, summary.supplierDataTitle) && fr.t.c(this.supplierData, summary.supplierData) && fr.t.c(this.personalTitle, summary.personalTitle) && fr.t.c(this.personal, summary.personal) && fr.t.c(this.statementTitle, summary.statementTitle) && fr.t.c(this.statementCheckBoxSingleData, summary.statementCheckBoxSingleData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final CardListData getOtherReport() {
                return this.otherReport;
            }

            public int hashCode() {
                int iHashCode = this.onBack.hashCode() * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                int iHashCode2 = (((((((((((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.baseScaffoldData.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.alertData.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.detailsTitle.hashCode()) * 31;
                CardListData cardListData = this.details;
                int iHashCode3 = (((iHashCode2 + (cardListData == null ? 0 : cardListData.hashCode())) * 31) + this.placeTitle.hashCode()) * 31;
                CardListData cardListData2 = this.place;
                int iHashCode4 = (((iHashCode3 + (cardListData2 == null ? 0 : cardListData2.hashCode())) * 31) + this.otherReportTitle.hashCode()) * 31;
                CardListData cardListData3 = this.otherReport;
                int iHashCode5 = (((iHashCode4 + (cardListData3 == null ? 0 : cardListData3.hashCode())) * 31) + this.productDataTitle.hashCode()) * 31;
                CardListData cardListData4 = this.productData;
                int iHashCode6 = (((iHashCode5 + (cardListData4 == null ? 0 : cardListData4.hashCode())) * 31) + this.placeOfPurchaseDataTitle.hashCode()) * 31;
                CardListData cardListData5 = this.placeOfPurchaseData;
                int iHashCode7 = (((iHashCode6 + (cardListData5 == null ? 0 : cardListData5.hashCode())) * 31) + this.sellerOnlineDataTitle.hashCode()) * 31;
                CardListData cardListData6 = this.sellerOnlineData;
                int iHashCode8 = (((iHashCode7 + (cardListData6 == null ? 0 : cardListData6.hashCode())) * 31) + this.sellerOfflineDataTitle.hashCode()) * 31;
                CardListData cardListData7 = this.sellerOfflineData;
                int iHashCode9 = (((iHashCode8 + (cardListData7 == null ? 0 : cardListData7.hashCode())) * 31) + this.supplierDataTitle.hashCode()) * 31;
                CardListData cardListData8 = this.supplierData;
                int iHashCode10 = (((iHashCode9 + (cardListData8 == null ? 0 : cardListData8.hashCode())) * 31) + this.personalTitle.hashCode()) * 31;
                CardListData cardListData9 = this.personal;
                return ((((iHashCode10 + (cardListData9 != null ? cardListData9.hashCode() : 0)) * 31) + this.statementTitle.hashCode()) * 31) + this.statementCheckBoxSingleData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getOtherReportTitle() {
                return this.otherReportTitle;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final CardListData getPersonal() {
                return this.personal;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getPersonalTitle() {
                return this.personalTitle;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final CardListData getPlace() {
                return this.place;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final CardListData getPlaceOfPurchaseData() {
                return this.placeOfPurchaseData;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final Label getPlaceOfPurchaseDataTitle() {
                return this.placeOfPurchaseDataTitle;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final Label getPlaceTitle() {
                return this.placeTitle;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final CardListData getProductData() {
                return this.productData;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final Label getProductDataTitle() {
                return this.productDataTitle;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final CardListData getSellerOfflineData() {
                return this.sellerOfflineData;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final Label getSellerOfflineDataTitle() {
                return this.sellerOfflineDataTitle;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final CardListData getSellerOnlineData() {
                return this.sellerOnlineData;
            }

            public String toString() {
                return "Summary(onBack=" + this.onBack + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", baseScaffoldData=" + this.baseScaffoldData + ", subtitle=" + this.subtitle + ", alertData=" + this.alertData + ", nextButtonData=" + this.nextButtonData + ", detailsTitle=" + this.detailsTitle + ", details=" + this.details + ", placeTitle=" + this.placeTitle + ", place=" + this.place + ", otherReportTitle=" + this.otherReportTitle + ", otherReport=" + this.otherReport + ", productDataTitle=" + this.productDataTitle + ", productData=" + this.productData + ", placeOfPurchaseDataTitle=" + this.placeOfPurchaseDataTitle + ", placeOfPurchaseData=" + this.placeOfPurchaseData + ", sellerOnlineDataTitle=" + this.sellerOnlineDataTitle + ", sellerOnlineData=" + this.sellerOnlineData + ", sellerOfflineDataTitle=" + this.sellerOfflineDataTitle + ", sellerOfflineData=" + this.sellerOfflineData + ", supplierDataTitle=" + this.supplierDataTitle + ", supplierData=" + this.supplierData + ", personalTitle=" + this.personalTitle + ", personal=" + this.personal + ", statementTitle=" + this.statementTitle + ", statementCheckBoxSingleData=" + this.statementCheckBoxSingleData + ')';
            }

            /* JADX INFO: renamed from: u, reason: from getter */
            public final Label getSellerOnlineDataTitle() {
                return this.sellerOnlineDataTitle;
            }

            /* JADX INFO: renamed from: v, reason: from getter */
            public final CheckBoxSingleData getStatementCheckBoxSingleData() {
                return this.statementCheckBoxSingleData;
            }

            /* JADX INFO: renamed from: w, reason: from getter */
            public final Label getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: x, reason: from getter */
            public final CardListData getSupplierData() {
                return this.supplierData;
            }

            /* JADX INFO: renamed from: y, reason: from getter */
            public final Label getSupplierDataTitle() {
                return this.supplierDataTitle;
            }
        }

        er.a<oq.i0> a();
    }
}
