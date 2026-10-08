package re2;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lre2/f;", "Ll00/e;", "Lre2/f$a;", "a", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0004\u0007\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lre2/f$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBackClick", "c", "b", "Lre2/f$a$a;", "Lre2/f$a$b;", "Lre2/f$a$c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: re2.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lre2/f$a$a;", "Lre2/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Empty implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            public Empty(er.a<oq.i0> aVar) {
                this.onBackClick = aVar;
            }

            @Override // re2.f.a
            public er.a<oq.i0> a() {
                return this.onBackClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Empty) && fr.t.c(this.onBackClick, ((Empty) other).onBackClick);
            }

            public int hashCode() {
                return this.onBackClick.hashCode();
            }

            public String toString() {
                return "Empty(onBackClick=" + this.onBackClick + ')';
            }
        }

        /* JADX INFO: renamed from: re2.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lre2/f$a$b;", "Lre2/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lhb4/c;", "error", "<init>", "(Ler/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lhb4/c;", "()Lhb4/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c error;

            public Error(er.a<oq.i0> aVar, hb4.c cVar) {
                this.onBackClick = aVar;
                this.error = cVar;
            }

            @Override // re2.f.a
            public er.a<oq.i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.onBackClick, error.onBackClick) && fr.t.c(this.error, error.error);
            }

            public int hashCode() {
                return (this.onBackClick.hashCode() * 31) + this.error.hashCode();
            }

            public String toString() {
                return "Error(onBackClick=" + this.onBackClick + ", error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: re2.f$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b,\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\b(\u00105R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b0\u0010:¨\u0006;"}, d2 = {"Lre2/f$a$c;", "Lre2/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Li50/a;", "baseScaffoldData", "Lh30/a;", "nextButtonData", "Lmx/a;", "title", "description", "Ln40/c;", "filePickerData", "Lg30/n;", "bottomSheetData", "", "Lz30/a;", "pickers", "Lcb4/i;", "dialogVMS", "<init>", "(Ler/a;Li50/a;Lh30/a;Lmx/a;Lmx/a;Ln40/c;Lg30/n;Ljava/util/List;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lh30/a;", "g", "()Lh30/a;", "d", "Lmx/a;", "i", "()Lmx/a;", "e", "f", "Ln40/c;", "()Ln40/c;", "Lg30/n;", "()Lg30/n;", "h", "Ljava/util/List;", "()Ljava/util/List;", "Lcb4/i;", "()Lcb4/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final FilePickerData filePickerData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<FileBottomSheetItemData> pickers;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Initialized(er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, ButtonData buttonData, Label label, Label label2, FilePickerData filePickerData, ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list, cb4.i iVar) {
                this.onBackClick = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.nextButtonData = buttonData;
                this.title = label;
                this.description = label2;
                this.filePickerData = filePickerData;
                this.bottomSheetData = modalBottomSheetData;
                this.pickers = list;
                this.dialogVMS = iVar;
            }

            @Override // re2.f.a
            public er.a<oq.i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.nextButtonData, initialized.nextButtonData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.description, initialized.description) && fr.t.c(this.filePickerData, initialized.filePickerData) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.pickers, initialized.pickers) && fr.t.c(this.dialogVMS, initialized.dialogVMS);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final FilePickerData getFilePickerData() {
                return this.filePickerData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public final List<FileBottomSheetItemData> h() {
                return this.pickers;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((this.onBackClick.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.filePickerData.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.pickers.hashCode()) * 31;
                cb4.i iVar = this.dialogVMS;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public String toString() {
                return "Initialized(onBackClick=" + this.onBackClick + ", baseScaffoldData=" + this.baseScaffoldData + ", nextButtonData=" + this.nextButtonData + ", title=" + this.title + ", description=" + this.description + ", filePickerData=" + this.filePickerData + ", bottomSheetData=" + this.bottomSheetData + ", pickers=" + this.pickers + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }

        er.a<oq.i0> a();
    }
}
