package v90;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lv90/c;", "Ll00/e;", "Lv90/c$a;", "a", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lv90/c$a;", "", "a", "c", "b", "Lv90/c$a$a;", "Lv90/c$a$b;", "Lv90/c$a$c;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: v90.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv90/c$a$a;", "Lv90/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: v90.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv90/c$a$b;", "Lv90/c$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "<init>", "(Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FailureScreenData implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f205328c = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> iconPageData;

            public FailureScreenData(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, IconPageBottomContentData> iconPageData) {
                this.scaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> a() {
                return this.iconPageData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FailureScreenData)) {
                    return false;
                }
                FailureScreenData failureScreenData = (FailureScreenData) other;
                return fr.t.c(this.scaffoldData, failureScreenData.scaffoldData) && fr.t.c(this.iconPageData, failureScreenData.iconPageData);
            }

            public int hashCode() {
                return (this.scaffoldData.hashCode() * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "FailureScreenData(scaffoldData=" + this.scaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }

        /* JADX INFO: renamed from: v90.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0019\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\u001d\u0010'¨\u0006("}, d2 = {"Lv90/c$a$c;", "Lv90/c$a;", "Li50/a;", "scaffoldData", "Lo40/a$a;", "headerData", "Lmx/a;", "description", "Lh30/a;", "terminateButton", "Lcb4/i;", "dialogVMS", "<init>", "(Li50/a;Lo40/a$a;Lmx/a;Lh30/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lo40/a$a;", "c", "()Lo40/a$a;", "Lmx/a;", "()Lmx/a;", "Lh30/a;", "e", "()Lh30/a;", "Lcb4/i;", "()Lcb4/i;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LoadingScreenData implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a.Icon headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData terminateButton;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public LoadingScreenData(BaseScaffoldData baseScaffoldData, o40.a.Icon icon, Label label, ButtonData buttonData, cb4.i iVar) {
                this.scaffoldData = baseScaffoldData;
                this.headerData = icon;
                this.description = label;
                this.terminateButton = buttonData;
                this.dialogVMS = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final o40.a.Icon getHeaderData() {
                return this.headerData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getTerminateButton() {
                return this.terminateButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingScreenData)) {
                    return false;
                }
                LoadingScreenData loadingScreenData = (LoadingScreenData) other;
                return fr.t.c(this.scaffoldData, loadingScreenData.scaffoldData) && fr.t.c(this.headerData, loadingScreenData.headerData) && fr.t.c(this.description, loadingScreenData.description) && fr.t.c(this.terminateButton, loadingScreenData.terminateButton) && fr.t.c(this.dialogVMS, loadingScreenData.dialogVMS);
            }

            public int hashCode() {
                int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.description.hashCode()) * 31;
                ButtonData buttonData = this.terminateButton;
                int iHashCode2 = (iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
                cb4.i iVar = this.dialogVMS;
                return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
            }

            public String toString() {
                return "LoadingScreenData(scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ", description=" + this.description + ", terminateButton=" + this.terminateButton + ", dialogVMS=" + this.dialogVMS + ')';
            }

            public /* synthetic */ LoadingScreenData(BaseScaffoldData baseScaffoldData, o40.a.Icon icon, Label label, ButtonData buttonData, cb4.i iVar, int i15, fr.k kVar) {
                this(baseScaffoldData, icon, label, (i15 & 8) != 0 ? null : buttonData, (i15 & 16) != 0 ? null : iVar);
            }
        }
    }
}
