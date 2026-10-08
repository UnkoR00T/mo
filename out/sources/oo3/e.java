package oo3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Loo3/e;", "Ll00/e;", "Loo3/e$a;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Loo3/e$a;", "", "a", "b", "Loo3/e$a$a;", "Loo3/e$a$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: oo3.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loo3/e$a$a;", "Loo3/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C3672a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3672a f147909a = new C3672a();

            private C3672a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C3672a);
            }

            public int hashCode() {
                return -1630826157;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: oo3.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b)\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b-\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b%\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b5\u0010;R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b4\u0010,¨\u0006<"}, d2 = {"Loo3/e$a$b;", "Loo3/e$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lmx/a;", "process", "Lh30/a;", "nextButtonData", "Ln50/k;", "entity", "bulletList", "Ln30/b;", "documentSectionData", "Loo3/b;", "bottomSheetData", "Lj30/a;", "moreButtonTextData", "infoLabel", "<init>", "(Li50/a;Ler/a;Lmx/a;Lh30/a;Ln50/k;Ln50/k;Ln30/b;Loo3/b;Lj30/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "i", "()Ler/a;", "c", "Lmx/a;", "j", "()Lmx/a;", "d", "Lh30/a;", "h", "()Lh30/a;", "e", "Ln50/k;", "()Ln50/k;", "f", "g", "Ln30/b;", "()Ln30/b;", "Loo3/b;", "()Loo3/b;", "Lj30/a;", "()Lj30/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label process;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k entity;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k bulletList;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData documentSectionData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final PersonBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData moreButtonTextData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoLabel;

            public Initialized(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, Label label, ButtonData buttonData, n50.k kVar, n50.k kVar2, CardListData cardListData, PersonBottomSheetData personBottomSheetData, ButtonTextData buttonTextData, Label label2) {
                this.baseScaffoldData = baseScaffoldData;
                this.onBackClick = aVar;
                this.process = label;
                this.nextButtonData = buttonData;
                this.entity = kVar;
                this.bulletList = kVar2;
                this.documentSectionData = cardListData;
                this.bottomSheetData = personBottomSheetData;
                this.moreButtonTextData = buttonTextData;
                this.infoLabel = label2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final PersonBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final n50.k getBulletList() {
                return this.bulletList;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getDocumentSectionData() {
                return this.documentSectionData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final n50.k getEntity() {
                return this.entity;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.process, initialized.process) && fr.t.c(this.nextButtonData, initialized.nextButtonData) && fr.t.c(this.entity, initialized.entity) && fr.t.c(this.bulletList, initialized.bulletList) && fr.t.c(this.documentSectionData, initialized.documentSectionData) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.moreButtonTextData, initialized.moreButtonTextData) && fr.t.c(this.infoLabel, initialized.infoLabel);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getInfoLabel() {
                return this.infoLabel;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonTextData getMoreButtonTextData() {
                return this.moreButtonTextData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public int hashCode() {
                return (((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.process.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.entity.hashCode()) * 31) + this.bulletList.hashCode()) * 31) + this.documentSectionData.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.moreButtonTextData.hashCode()) * 31) + this.infoLabel.hashCode();
            }

            public final er.a<i0> i() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getProcess() {
                return this.process;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", process=" + this.process + ", nextButtonData=" + this.nextButtonData + ", entity=" + this.entity + ", bulletList=" + this.bulletList + ", documentSectionData=" + this.documentSectionData + ", bottomSheetData=" + this.bottomSheetData + ", moreButtonTextData=" + this.moreButtonTextData + ", infoLabel=" + this.infoLabel + ')';
            }
        }
    }
}
