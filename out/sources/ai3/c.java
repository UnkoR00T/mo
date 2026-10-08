package ai3;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lai3/c;", "Ll00/e;", "Lai3/c$a;", "a", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lai3/c$a;", "", "a", "b", "Lai3/c$a$a;", "Lai3/c$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ai3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lai3/c$a$a;", "Lai3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0140a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0140a f6454a = new C0140a();

            private C0140a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0140a);
            }

            public int hashCode() {
                return -1336984041;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: ai3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b-\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b)\u00106R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b4\u00109R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010,R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b7\u0010>R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b<\u0010>R\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b?\u0010>R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b+\u0010=\u001a\u0004\b:\u0010>R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lai3/c$a$b;", "Lai3/c$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "description", "Ln40/c;", "filePickerData", "Lh30/a;", "buttonNext", "Lg30/n;", "bottomSheetData", "", "Lz30/a;", "pickers", "tipTitle", "Lai3/c$b;", "tipItemDataFirst", "tipItemDataSecond", "tipItemDataThird", "tipItemDataFourth", "Lkotlin/Function0;", "Loq/i0;", "onGoToNextStep", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ln40/c;Lh30/a;Lg30/n;Ljava/util/List;Lmx/a;Lai3/c$b;Lai3/c$b;Lai3/c$b;Lai3/c$b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "l", "()Lmx/a;", "c", "d", "Ln40/c;", "e", "()Ln40/c;", "Lh30/a;", "()Lh30/a;", "f", "Lg30/n;", "()Lg30/n;", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "k", "i", "Lai3/c$b;", "()Lai3/c$b;", "j", "m", "Ler/a;", "getOnGoToNextStep", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final FilePickerData filePickerData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonNext;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<FileBottomSheetItemData> pickers;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label tipTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final TipItemData tipItemDataFirst;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final TipItemData tipItemDataSecond;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final TipItemData tipItemDataThird;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final TipItemData tipItemDataFourth;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGoToNextStep;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, FilePickerData filePickerData, ButtonData buttonData, ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list, Label label3, TipItemData tipItemData, TipItemData tipItemData2, TipItemData tipItemData3, TipItemData tipItemData4, er.a<i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.filePickerData = filePickerData;
                this.buttonNext = buttonData;
                this.bottomSheetData = modalBottomSheetData;
                this.pickers = list;
                this.tipTitle = label3;
                this.tipItemDataFirst = tipItemData;
                this.tipItemDataSecond = tipItemData2;
                this.tipItemDataThird = tipItemData3;
                this.tipItemDataFourth = tipItemData4;
                this.onGoToNextStep = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getButtonNext() {
                return this.buttonNext;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final FilePickerData getFilePickerData() {
                return this.filePickerData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.description, initialized.description) && fr.t.c(this.filePickerData, initialized.filePickerData) && fr.t.c(this.buttonNext, initialized.buttonNext) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.pickers, initialized.pickers) && fr.t.c(this.tipTitle, initialized.tipTitle) && fr.t.c(this.tipItemDataFirst, initialized.tipItemDataFirst) && fr.t.c(this.tipItemDataSecond, initialized.tipItemDataSecond) && fr.t.c(this.tipItemDataThird, initialized.tipItemDataThird) && fr.t.c(this.tipItemDataFourth, initialized.tipItemDataFourth) && fr.t.c(this.onGoToNextStep, initialized.onGoToNextStep);
            }

            public final List<FileBottomSheetItemData> f() {
                return this.pickers;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TipItemData getTipItemDataFirst() {
                return this.tipItemDataFirst;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final TipItemData getTipItemDataFourth() {
                return this.tipItemDataFourth;
            }

            public int hashCode() {
                return (((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.filePickerData.hashCode()) * 31) + this.buttonNext.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.pickers.hashCode()) * 31) + this.tipTitle.hashCode()) * 31) + this.tipItemDataFirst.hashCode()) * 31) + this.tipItemDataSecond.hashCode()) * 31) + this.tipItemDataThird.hashCode()) * 31) + this.tipItemDataFourth.hashCode()) * 31) + this.onGoToNextStep.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TipItemData getTipItemDataSecond() {
                return this.tipItemDataSecond;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final TipItemData getTipItemDataThird() {
                return this.tipItemDataThird;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getTipTitle() {
                return this.tipTitle;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", description=" + this.description + ", filePickerData=" + this.filePickerData + ", buttonNext=" + this.buttonNext + ", bottomSheetData=" + this.bottomSheetData + ", pickers=" + this.pickers + ", tipTitle=" + this.tipTitle + ", tipItemDataFirst=" + this.tipItemDataFirst + ", tipItemDataSecond=" + this.tipItemDataSecond + ", tipItemDataThird=" + this.tipItemDataThird + ", tipItemDataFourth=" + this.tipItemDataFourth + ", onGoToNextStep=" + this.onGoToNextStep + ')';
            }
        }
    }

    /* JADX INFO: renamed from: ai3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lai3/c$b;", "", "", "imageResId", "Lmx/a;", AnnotatedPrivateKey.LABEL, "<init>", "(ILmx/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx/a;", "()Lmx/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TipItemData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int imageResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        public TipItemData(int i15, Label label) {
            this.imageResId = i15;
            this.label = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getImageResId() {
            return this.imageResId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TipItemData)) {
                return false;
            }
            TipItemData tipItemData = (TipItemData) other;
            return this.imageResId == tipItemData.imageResId && fr.t.c(this.label, tipItemData.label);
        }

        public int hashCode() {
            return (Integer.hashCode(this.imageResId) * 31) + this.label.hashCode();
        }

        public String toString() {
            return "TipItemData(imageResId=" + this.imageResId + ", label=" + this.label + ')';
        }
    }
}
