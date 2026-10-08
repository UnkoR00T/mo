package q23;

import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lq23/f;", "Ll00/e;", "Lq23/f$a;", "a", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\u0004\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lq23/f$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBack", "c", "b", "Lq23/f$a$a;", "Lq23/f$a$b;", "Lq23/f$a$c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: q23.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lq23/f$a$a;", "Lq23/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Ler/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lhb4/c;", "()Lhb4/c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(er.a<i0> aVar, hb4.c cVar) {
                this.onBack = aVar;
                this.errorVMSAdapter = cVar;
            }

            @Override // q23.f.a
            public er.a<i0> a() {
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

        /* JADX INFO: renamed from: q23.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lq23/f$a$b;", "Lq23/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loading implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            public Loading(er.a<i0> aVar) {
                this.onBack = aVar;
            }

            @Override // q23.f.a
            public er.a<i0> a() {
                return this.onBack;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && fr.t.c(this.onBack, ((Loading) other).onBack);
            }

            public int hashCode() {
                return this.onBack.hashCode();
            }

            public String toString() {
                return "Loading(onBack=" + this.onBack + ')';
            }
        }

        /* JADX INFO: renamed from: q23.f$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b-\u00103R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00103R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b6\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b4\u00103R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b:\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00103R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b=\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b;\u00103R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b>\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b?\u00103R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\bA\u00103R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\b9\u00100R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\b8\u00103¨\u0006B"}, d2 = {"Lq23/f$a$c;", "Lq23/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lmx/a;", "number", "detailsTitle", "Ln30/b;", "details", "placeTitle", "place", "otherReportTitle", "otherReport", "productDataTitle", "productData", "placeOfPurchaseDataTitle", "placeOfPurchaseData", "sellerDataTitle", "sellerData", "supplierDataTitle", "supplierData", "personalTitle", "personal", "<init>", "(Ler/a;Li50/a;Lmx/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lmx/a;", "e", "()Lmx/a;", "d", "Ln30/b;", "()Ln30/b;", "f", "m", "g", "j", "h", "i", "o", "k", "n", "l", "q", "p", "s", "r", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen implements a {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final int f163892t = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label number;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label detailsTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData details;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label placeTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData place;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label otherReportTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData otherReport;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label productDataTitle;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData productData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label placeOfPurchaseDataTitle;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData placeOfPurchaseData;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label sellerDataTitle;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData sellerData;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label supplierDataTitle;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData supplierData;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label personalTitle;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData personal;

            public Screen(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, Label label, Label label2, CardListData cardListData, Label label3, CardListData cardListData2, Label label4, CardListData cardListData3, Label label5, CardListData cardListData4, Label label6, CardListData cardListData5, Label label7, CardListData cardListData6, Label label8, CardListData cardListData7, Label label9, CardListData cardListData8) {
                this.onBack = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.number = label;
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
                this.sellerDataTitle = label7;
                this.sellerData = cardListData6;
                this.supplierDataTitle = label8;
                this.supplierData = cardListData7;
                this.personalTitle = label9;
                this.personal = cardListData8;
            }

            @Override // q23.f.a
            public er.a<i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getDetails() {
                return this.details;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getDetailsTitle() {
                return this.detailsTitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getNumber() {
                return this.number;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.onBack, screen.onBack) && fr.t.c(this.baseScaffoldData, screen.baseScaffoldData) && fr.t.c(this.number, screen.number) && fr.t.c(this.detailsTitle, screen.detailsTitle) && fr.t.c(this.details, screen.details) && fr.t.c(this.placeTitle, screen.placeTitle) && fr.t.c(this.place, screen.place) && fr.t.c(this.otherReportTitle, screen.otherReportTitle) && fr.t.c(this.otherReport, screen.otherReport) && fr.t.c(this.productDataTitle, screen.productDataTitle) && fr.t.c(this.productData, screen.productData) && fr.t.c(this.placeOfPurchaseDataTitle, screen.placeOfPurchaseDataTitle) && fr.t.c(this.placeOfPurchaseData, screen.placeOfPurchaseData) && fr.t.c(this.sellerDataTitle, screen.sellerDataTitle) && fr.t.c(this.sellerData, screen.sellerData) && fr.t.c(this.supplierDataTitle, screen.supplierDataTitle) && fr.t.c(this.supplierData, screen.supplierData) && fr.t.c(this.personalTitle, screen.personalTitle) && fr.t.c(this.personal, screen.personal);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CardListData getOtherReport() {
                return this.otherReport;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getOtherReportTitle() {
                return this.otherReportTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final CardListData getPersonal() {
                return this.personal;
            }

            public int hashCode() {
                int iHashCode = ((((((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.number.hashCode()) * 31) + this.detailsTitle.hashCode()) * 31;
                CardListData cardListData = this.details;
                int iHashCode2 = (((iHashCode + (cardListData == null ? 0 : cardListData.hashCode())) * 31) + this.placeTitle.hashCode()) * 31;
                CardListData cardListData2 = this.place;
                int iHashCode3 = (((iHashCode2 + (cardListData2 == null ? 0 : cardListData2.hashCode())) * 31) + this.otherReportTitle.hashCode()) * 31;
                CardListData cardListData3 = this.otherReport;
                int iHashCode4 = (((iHashCode3 + (cardListData3 == null ? 0 : cardListData3.hashCode())) * 31) + this.productDataTitle.hashCode()) * 31;
                CardListData cardListData4 = this.productData;
                int iHashCode5 = (((iHashCode4 + (cardListData4 == null ? 0 : cardListData4.hashCode())) * 31) + this.placeOfPurchaseDataTitle.hashCode()) * 31;
                CardListData cardListData5 = this.placeOfPurchaseData;
                int iHashCode6 = (((iHashCode5 + (cardListData5 == null ? 0 : cardListData5.hashCode())) * 31) + this.sellerDataTitle.hashCode()) * 31;
                CardListData cardListData6 = this.sellerData;
                int iHashCode7 = (((iHashCode6 + (cardListData6 == null ? 0 : cardListData6.hashCode())) * 31) + this.supplierDataTitle.hashCode()) * 31;
                CardListData cardListData7 = this.supplierData;
                int iHashCode8 = (((iHashCode7 + (cardListData7 == null ? 0 : cardListData7.hashCode())) * 31) + this.personalTitle.hashCode()) * 31;
                CardListData cardListData8 = this.personal;
                return iHashCode8 + (cardListData8 != null ? cardListData8.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getPersonalTitle() {
                return this.personalTitle;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final CardListData getPlace() {
                return this.place;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final CardListData getPlaceOfPurchaseData() {
                return this.placeOfPurchaseData;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getPlaceOfPurchaseDataTitle() {
                return this.placeOfPurchaseDataTitle;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final Label getPlaceTitle() {
                return this.placeTitle;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final CardListData getProductData() {
                return this.productData;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final Label getProductDataTitle() {
                return this.productDataTitle;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final CardListData getSellerData() {
                return this.sellerData;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final Label getSellerDataTitle() {
                return this.sellerDataTitle;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final CardListData getSupplierData() {
                return this.supplierData;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final Label getSupplierDataTitle() {
                return this.supplierDataTitle;
            }

            public String toString() {
                return "Screen(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", number=" + this.number + ", detailsTitle=" + this.detailsTitle + ", details=" + this.details + ", placeTitle=" + this.placeTitle + ", place=" + this.place + ", otherReportTitle=" + this.otherReportTitle + ", otherReport=" + this.otherReport + ", productDataTitle=" + this.productDataTitle + ", productData=" + this.productData + ", placeOfPurchaseDataTitle=" + this.placeOfPurchaseDataTitle + ", placeOfPurchaseData=" + this.placeOfPurchaseData + ", sellerDataTitle=" + this.sellerDataTitle + ", sellerData=" + this.sellerData + ", supplierDataTitle=" + this.supplierDataTitle + ", supplierData=" + this.supplierData + ", personalTitle=" + this.personalTitle + ", personal=" + this.personal + ')';
            }
        }

        er.a<i0> a();
    }
}
