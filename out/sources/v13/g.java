package v13;

import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lv13/g;", "Ll00/e;", "Lv13/g$a;", "a", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: v13.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001b\u0010$R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b%\u0010(\"\u0004\b,\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b+\u0010.¨\u0006/"}, d2 = {"Lv13/g$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "description", "backpackItemsHeader", "Ln30/b;", "backpackGroups", "Ln50/k;", "setupNotification", "downloadPdf", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ln30/b;Ln50/k;Ln50/k;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "e", "Ln50/k;", "g", "()Ln50/k;", "setSetupNotification", "(Ln50/k;)V", "f", "setDownloadPdf", "Ler/a;", "()Ler/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label backpackItemsHeader;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData backpackGroups;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private n50.k setupNotification;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private n50.k downloadPdf;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, CardListData cardListData, n50.k kVar, n50.k kVar2, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.description = label;
            this.backpackItemsHeader = label2;
            this.backpackGroups = cardListData;
            this.setupNotification = kVar;
            this.downloadPdf = kVar2;
            this.onBackAction = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getBackpackGroups() {
            return this.backpackGroups;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getBackpackItemsHeader() {
            return this.backpackItemsHeader;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final n50.k getDownloadPdf() {
            return this.downloadPdf;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.description, data.description) && fr.t.c(this.backpackItemsHeader, data.backpackItemsHeader) && fr.t.c(this.backpackGroups, data.backpackGroups) && fr.t.c(this.setupNotification, data.setupNotification) && fr.t.c(this.downloadPdf, data.downloadPdf) && fr.t.c(this.onBackAction, data.onBackAction);
        }

        public final er.a<i0> f() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final n50.k getSetupNotification() {
            return this.setupNotification;
        }

        public int hashCode() {
            return (((((((((((this.baseScaffoldData.hashCode() * 31) + this.description.hashCode()) * 31) + this.backpackItemsHeader.hashCode()) * 31) + this.backpackGroups.hashCode()) * 31) + this.setupNotification.hashCode()) * 31) + this.downloadPdf.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", description=" + this.description + ", backpackItemsHeader=" + this.backpackItemsHeader + ", backpackGroups=" + this.backpackGroups + ", setupNotification=" + this.setupNotification + ", downloadPdf=" + this.downloadPdf + ", onBackAction=" + this.onBackAction + ')';
        }
    }
}
