package nt2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import pt2.PeselRestrictionData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lnt2/d;", "Ll00/e;", "Lnt2/d$a;", "Li70/n;", "a", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lnt2/d$a;", "", "a", "b", "c", "Lnt2/d$a$a;", "Lnt2/d$a$b;", "Lnt2/d$a$c;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: nt2.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnt2/d$a$a;", "Lnt2/d$a;", "Lcb4/i;", "dialogVMS", "<init>", "(Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "()Lcb4/i;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Initial(cb4.i iVar) {
                this.dialogVMS = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initial) && fr.t.c(this.dialogVMS, ((Initial) other).dialogVMS);
            }

            public int hashCode() {
                cb4.i iVar = this.dialogVMS;
                if (iVar == null) {
                    return 0;
                }
                return iVar.hashCode();
            }

            public String toString() {
                return "Initial(dialogVMS=" + this.dialogVMS + ')';
            }
        }

        /* JADX INFO: renamed from: nt2.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b.\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b'\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b \u00100¨\u00061"}, d2 = {"Lnt2/d$a$b;", "Lnt2/d$a;", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lpt2/a;", "peselRestrictionData", "", "isRefreshing", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "refreshAction", "hideSnackBar", "Lcb4/i;", "dialogVMS", "<init>", "(Li50/a;Lo40/a;Lpt2/a;ZLer/a;Ler/a;Ler/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a;", "c", "()Lo40/a;", "Lpt2/a;", "f", "()Lpt2/a;", "d", "Z", "h", "()Z", "e", "Ler/a;", "()Ler/a;", "g", "Lcb4/i;", "()Lcb4/i;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PeselRestrictionData peselRestrictionData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRefreshing;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> refreshAction;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> hideSnackBar;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Initialized(BaseScaffoldData baseScaffoldData, o40.a aVar, PeselRestrictionData peselRestrictionData, boolean z15, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3, er.a<oq.i0> aVar4, cb4.i iVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.peselRestrictionData = peselRestrictionData;
                this.isRefreshing = z15;
                this.onBackClick = aVar2;
                this.refreshAction = aVar3;
                this.hideSnackBar = aVar4;
                this.dialogVMS = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            public final er.a<oq.i0> d() {
                return this.hideSnackBar;
            }

            public final er.a<oq.i0> e() {
                return this.onBackClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerData, initialized.headerData) && fr.t.c(this.peselRestrictionData, initialized.peselRestrictionData) && this.isRefreshing == initialized.isRefreshing && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.refreshAction, initialized.refreshAction) && fr.t.c(this.hideSnackBar, initialized.hideSnackBar) && fr.t.c(this.dialogVMS, initialized.dialogVMS);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final PeselRestrictionData getPeselRestrictionData() {
                return this.peselRestrictionData;
            }

            public final er.a<oq.i0> g() {
                return this.refreshAction;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getIsRefreshing() {
                return this.isRefreshing;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.peselRestrictionData.hashCode()) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + this.onBackClick.hashCode()) * 31) + this.refreshAction.hashCode()) * 31) + this.hideSnackBar.hashCode()) * 31;
                cb4.i iVar = this.dialogVMS;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", peselRestrictionData=" + this.peselRestrictionData + ", isRefreshing=" + this.isRefreshing + ", onBackClick=" + this.onBackClick + ", refreshAction=" + this.refreshAction + ", hideSnackBar=" + this.hideSnackBar + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }

        /* JADX INFO: renamed from: nt2.d$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lnt2/d$a$c;", "Lnt2/d$a;", "Lq40/g;", "Loq/i0;", "iconPageData", "Lh30/a;", "bottomButtonData", "Li50/a;", "scaffoldData", "<init>", "(Lq40/g;Lh30/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq40/g;", "b", "()Lq40/g;", "Lh30/a;", "()Lh30/a;", "c", "Li50/a;", "()Li50/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Underage implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f138441d = BaseScaffoldData.f89350g | IconPageData.f164667h;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, oq.i0> iconPageData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData bottomButtonData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Underage(IconPageData<oq.i0, oq.i0> iconPageData, ButtonData buttonData, BaseScaffoldData baseScaffoldData) {
                this.iconPageData = iconPageData;
                this.bottomButtonData = buttonData;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getBottomButtonData() {
                return this.bottomButtonData;
            }

            public final IconPageData<oq.i0, oq.i0> b() {
                return this.iconPageData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Underage)) {
                    return false;
                }
                Underage underage = (Underage) other;
                return fr.t.c(this.iconPageData, underage.iconPageData) && fr.t.c(this.bottomButtonData, underage.bottomButtonData) && fr.t.c(this.scaffoldData, underage.scaffoldData);
            }

            public int hashCode() {
                return (((this.iconPageData.hashCode() * 31) + this.bottomButtonData.hashCode()) * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Underage(iconPageData=" + this.iconPageData + ", bottomButtonData=" + this.bottomButtonData + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }
    }
}
