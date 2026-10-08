package y61;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ly61/d;", "Ll00/e;", "Ly61/d$a;", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ly61/d$a;", "", "b", "c", "a", "d", "Ly61/d$a$a;", "Ly61/d$a$b;", "Ly61/d$a$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: y61.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly61/d$a$a;", "Ly61/d$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly61/d$a$b;", "Ly61/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f224579a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1403861249;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: y61.d$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b*\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b&\u00109R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b0\u0010=\u001a\u0004\b2\u0010>¨\u0006?"}, d2 = {"Ly61/d$a$c;", "Ly61/d$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerLabel", "messageLabel", "Ln40/c;", "filePickerData", "Ly61/d$a$d;", "statementData", "Lh30/a;", "nextButton", "Lg30/n;", "bottomSheetData", "Lz61/d;", "bottomSheetContentData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lt40/b;", "infoRowListData", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ln40/c;Ly61/d$a$d;Lh30/a;Lg30/n;Lz61/d;Ler/a;Lt40/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "e", "()Lmx/a;", "c", "g", "d", "Ln40/c;", "()Ln40/c;", "Ly61/d$a$d;", "j", "()Ly61/d$a$d;", "f", "Lh30/a;", "h", "()Lh30/a;", "Lg30/n;", "()Lg30/n;", "Lz61/d;", "()Lz61/d;", "i", "Ler/a;", "()Ler/a;", "Lt40/b;", "()Lt40/b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f224580k = (((InfoRowListData.f187643b | ModalBottomSheetData.f70192e) | CheckBoxSingleData.f210090f) | FilePickerData.f131319k) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messageLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final FilePickerData filePickerData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final StatementData statementData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final z61.d bottomSheetContentData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData infoRowListData;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, FilePickerData filePickerData, StatementData statementData, ButtonData buttonData, ModalBottomSheetData modalBottomSheetData, z61.d dVar, er.a<oq.i0> aVar, InfoRowListData infoRowListData) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerLabel = label;
                this.messageLabel = label2;
                this.filePickerData = filePickerData;
                this.statementData = statementData;
                this.nextButton = buttonData;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetContentData = dVar;
                this.onBackClick = aVar;
                this.infoRowListData = infoRowListData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final z61.d getBottomSheetContentData() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final FilePickerData getFilePickerData() {
                return this.filePickerData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerLabel, initialized.headerLabel) && fr.t.c(this.messageLabel, initialized.messageLabel) && fr.t.c(this.filePickerData, initialized.filePickerData) && fr.t.c(this.statementData, initialized.statementData) && fr.t.c(this.nextButton, initialized.nextButton) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.bottomSheetContentData, initialized.bottomSheetContentData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.infoRowListData, initialized.infoRowListData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final InfoRowListData getInfoRowListData() {
                return this.infoRowListData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getMessageLabel() {
                return this.messageLabel;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public int hashCode() {
                int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.headerLabel.hashCode()) * 31;
                Label label = this.messageLabel;
                int iHashCode2 = (((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.filePickerData.hashCode()) * 31;
                StatementData statementData = this.statementData;
                int iHashCode3 = (((((iHashCode2 + (statementData == null ? 0 : statementData.hashCode())) * 31) + this.nextButton.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31;
                z61.d dVar = this.bottomSheetContentData;
                int iHashCode4 = (((iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.onBackClick.hashCode()) * 31;
                InfoRowListData infoRowListData = this.infoRowListData;
                return iHashCode4 + (infoRowListData != null ? infoRowListData.hashCode() : 0);
            }

            public final er.a<oq.i0> i() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final StatementData getStatementData() {
                return this.statementData;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerLabel=" + this.headerLabel + ", messageLabel=" + this.messageLabel + ", filePickerData=" + this.filePickerData + ", statementData=" + this.statementData + ", nextButton=" + this.nextButton + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", onBackClick=" + this.onBackClick + ", infoRowListData=" + this.infoRowListData + ')';
            }
        }

        /* JADX INFO: renamed from: y61.d$a$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly61/d$a$d;", "", "Lmx/a;", "header", "Lw30/a;", "checkBoxData", "<init>", "(Lmx/a;Lw30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Lw30/a;", "()Lw30/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StatementData {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f224591c = CheckBoxSingleData.f210090f;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData checkBoxData;

            public StatementData(Label label, CheckBoxSingleData checkBoxSingleData) {
                this.header = label;
                this.checkBoxData = checkBoxSingleData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CheckBoxSingleData getCheckBoxData() {
                return this.checkBoxData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatementData)) {
                    return false;
                }
                StatementData statementData = (StatementData) other;
                return fr.t.c(this.header, statementData.header) && fr.t.c(this.checkBoxData, statementData.checkBoxData);
            }

            public int hashCode() {
                return (this.header.hashCode() * 31) + this.checkBoxData.hashCode();
            }

            public String toString() {
                return "StatementData(header=" + this.header + ", checkBoxData=" + this.checkBoxData + ')';
            }
        }
    }
}
