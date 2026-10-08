package jd3;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import ld3.UutCardBottomSheetData;
import mx.Label;
import o20.BaseDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ljd3/o;", "Ll00/e;", "Ljd3/o$a;", "Li70/n;", "a", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ljd3/o$a;", "", "b", "a", "Ljd3/o$a$a;", "Ljd3/o$a$b;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: jd3.o$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b*\u00100R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b&\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\b\"\u0010:R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b.\u0010-¨\u0006;"}, d2 = {"Ljd3/o$a$a;", "Ljd3/o$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "updateButtonLabel", "Lkotlin/Function0;", "Loq/i0;", "onUpdateButtonClicked", "Ly30/n$b;", "controllersData", "", "Ln50/k;", "uutMembers", "Lo20/k;", "screenData", "Lg30/n;", "bottomSheetData", "Lld3/a;", "bottomSheetContentData", "onBackAction", "<init>", "(Li50/a;Lmx/a;Ler/a;Ly30/n$b;Ljava/util/List;Lo20/k;Lg30/n;Lld3/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lmx/a;", "h", "()Lmx/a;", "c", "Ler/a;", "e", "()Ler/a;", "d", "Ly30/n$b;", "()Ly30/n$b;", "Ljava/util/List;", "i", "()Ljava/util/List;", "Lo20/k;", "g", "()Lo20/k;", "Lg30/n;", "()Lg30/n;", "Lld3/a;", "()Lld3/a;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            private final List<n50.k> uutMembers;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseDocumentData screenData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final UutCardBottomSheetData bottomSheetContentData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX WARN: Multi-variable type inference failed */
            public DataLoaded(BaseScaffoldData baseScaffoldData, Label label, er.a<oq.i0> aVar, y30.n.Switch r15, List<? extends n50.k> list, BaseDocumentData baseDocumentData, ModalBottomSheetData modalBottomSheetData, UutCardBottomSheetData uutCardBottomSheetData, er.a<oq.i0> aVar2) {
                this.scaffoldData = baseScaffoldData;
                this.updateButtonLabel = label;
                this.onUpdateButtonClicked = aVar;
                this.controllersData = r15;
                this.uutMembers = list;
                this.screenData = baseDocumentData;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetContentData = uutCardBottomSheetData;
                this.onBackAction = aVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final UutCardBottomSheetData getBottomSheetContentData() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            public final er.a<oq.i0> d() {
                return this.onBackAction;
            }

            public final er.a<oq.i0> e() {
                return this.onUpdateButtonClicked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DataLoaded)) {
                    return false;
                }
                DataLoaded dataLoaded = (DataLoaded) other;
                return fr.t.c(this.scaffoldData, dataLoaded.scaffoldData) && fr.t.c(this.updateButtonLabel, dataLoaded.updateButtonLabel) && fr.t.c(this.onUpdateButtonClicked, dataLoaded.onUpdateButtonClicked) && fr.t.c(this.controllersData, dataLoaded.controllersData) && fr.t.c(this.uutMembers, dataLoaded.uutMembers) && fr.t.c(this.screenData, dataLoaded.screenData) && fr.t.c(this.bottomSheetData, dataLoaded.bottomSheetData) && fr.t.c(this.bottomSheetContentData, dataLoaded.bottomSheetContentData) && fr.t.c(this.onBackAction, dataLoaded.onBackAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseDocumentData getScreenData() {
                return this.screenData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getUpdateButtonLabel() {
                return this.updateButtonLabel;
            }

            public int hashCode() {
                int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.updateButtonLabel.hashCode()) * 31) + this.onUpdateButtonClicked.hashCode()) * 31;
                y30.n.Switch r15 = this.controllersData;
                int iHashCode2 = (((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.uutMembers.hashCode()) * 31;
                BaseDocumentData baseDocumentData = this.screenData;
                int iHashCode3 = (((iHashCode2 + (baseDocumentData == null ? 0 : baseDocumentData.hashCode())) * 31) + this.bottomSheetData.hashCode()) * 31;
                UutCardBottomSheetData uutCardBottomSheetData = this.bottomSheetContentData;
                return ((iHashCode3 + (uutCardBottomSheetData != null ? uutCardBottomSheetData.hashCode() : 0)) * 31) + this.onBackAction.hashCode();
            }

            public final List<n50.k> i() {
                return this.uutMembers;
            }

            public String toString() {
                return "DataLoaded(scaffoldData=" + this.scaffoldData + ", updateButtonLabel=" + this.updateButtonLabel + ", onUpdateButtonClicked=" + this.onUpdateButtonClicked + ", controllersData=" + this.controllersData + ", uutMembers=" + this.uutMembers + ", screenData=" + this.screenData + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljd3/o$a$b;", "Ljd3/o$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f102116a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 164984385;
            }

            public String toString() {
                return "Loading";
            }
        }
    }
}
