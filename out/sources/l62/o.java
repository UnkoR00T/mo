package l62;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n62.FamilyCardBottomSheetData;
import o20.BaseDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ll62/o;", "Ll00/e;", "Ll62/o$a;", "Li70/n;", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()V", "a", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ll62/o$a;", "", "b", "a", "Ll62/o$a$a;", "Ll62/o$a$b;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: l62.o$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b#\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b+\u00108R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b'\u0010;R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00148\u0006¢\u0006\f\n\u0004\b)\u0010<\u001a\u0004\b9\u0010=¨\u0006>"}, d2 = {"Ll62/o$a$a;", "Ll62/o$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "updateButtonLabel", "Lkotlin/Function0;", "Loq/i0;", "onUpdateButtonClicked", "Ly30/n$b;", "controllersData", "", "Ln50/k;", "familyMembers", "Lo20/k;", "baseDocumentData", "Lg30/n;", "bottomSheetData", "Ln62/a;", "bottomSheetContentData", "Lkotlin/Function1;", "", "showCodeBottomSheet", "<init>", "(Li50/a;Lmx/a;Ler/a;Ly30/n$b;Ljava/util/List;Lo20/k;Lg30/n;Ln62/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lmx/a;", "i", "()Lmx/a;", "c", "Ler/a;", "f", "()Ler/a;", "d", "Ly30/n$b;", "()Ly30/n$b;", "e", "Ljava/util/List;", "()Ljava/util/List;", "Lo20/k;", "()Lo20/k;", "Lg30/n;", "()Lg30/n;", "h", "Ln62/a;", "()Ln62/a;", "Ler/l;", "()Ler/l;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DataLoaded implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label updateButtonLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onUpdateButtonClicked;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> familyMembers;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseDocumentData baseDocumentData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final FamilyCardBottomSheetData bottomSheetContentData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, oq.i0> showCodeBottomSheet;

            /* JADX WARN: Multi-variable type inference failed */
            public DataLoaded(BaseScaffoldData baseScaffoldData, Label label, er.a<oq.i0> aVar, y30.n.Switch r15, List<? extends n50.k> list, BaseDocumentData baseDocumentData, ModalBottomSheetData modalBottomSheetData, FamilyCardBottomSheetData familyCardBottomSheetData, er.l<? super Boolean, oq.i0> lVar) {
                this.scaffoldData = baseScaffoldData;
                this.updateButtonLabel = label;
                this.onUpdateButtonClicked = aVar;
                this.controllersData = r15;
                this.familyMembers = list;
                this.baseDocumentData = baseDocumentData;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetContentData = familyCardBottomSheetData;
                this.showCodeBottomSheet = lVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseDocumentData getBaseDocumentData() {
                return this.baseDocumentData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final FamilyCardBottomSheetData getBottomSheetContentData() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            public final List<n50.k> e() {
                return this.familyMembers;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DataLoaded)) {
                    return false;
                }
                DataLoaded dataLoaded = (DataLoaded) other;
                return fr.t.c(this.scaffoldData, dataLoaded.scaffoldData) && fr.t.c(this.updateButtonLabel, dataLoaded.updateButtonLabel) && fr.t.c(this.onUpdateButtonClicked, dataLoaded.onUpdateButtonClicked) && fr.t.c(this.controllersData, dataLoaded.controllersData) && fr.t.c(this.familyMembers, dataLoaded.familyMembers) && fr.t.c(this.baseDocumentData, dataLoaded.baseDocumentData) && fr.t.c(this.bottomSheetData, dataLoaded.bottomSheetData) && fr.t.c(this.bottomSheetContentData, dataLoaded.bottomSheetContentData) && fr.t.c(this.showCodeBottomSheet, dataLoaded.showCodeBottomSheet);
            }

            public final er.a<oq.i0> f() {
                return this.onUpdateButtonClicked;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public final er.l<Boolean, oq.i0> h() {
                return this.showCodeBottomSheet;
            }

            public int hashCode() {
                int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.updateButtonLabel.hashCode()) * 31) + this.onUpdateButtonClicked.hashCode()) * 31;
                y30.n.Switch r15 = this.controllersData;
                return ((((((((((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.familyMembers.hashCode()) * 31) + this.baseDocumentData.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.showCodeBottomSheet.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getUpdateButtonLabel() {
                return this.updateButtonLabel;
            }

            public String toString() {
                return "DataLoaded(scaffoldData=" + this.scaffoldData + ", updateButtonLabel=" + this.updateButtonLabel + ", onUpdateButtonClicked=" + this.onUpdateButtonClicked + ", controllersData=" + this.controllersData + ", familyMembers=" + this.familyMembers + ", baseDocumentData=" + this.baseDocumentData + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll62/o$a$b;", "Ll62/o$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f116556a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1398473098;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    void P();
}
