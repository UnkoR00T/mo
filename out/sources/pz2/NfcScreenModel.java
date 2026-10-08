package pz2;

import fr.k;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pz2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b \u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u0018\u0010%¨\u0006&"}, d2 = {"Lpz2/a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "progress", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "", "areAnimationsEnabled", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Ler/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "d", "Ler/a;", "()Ler/a;", "Z", "()Z", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NfcScreenModel {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f163343g = BaseScaffoldData.f89350g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label progress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onBackAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean areAnimationsEnabled;

    public NfcScreenModel(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, er.a<i0> aVar, boolean z15) {
        this.scaffoldData = baseScaffoldData;
        this.title = label;
        this.description = label2;
        this.progress = label3;
        this.onBackAction = aVar;
        this.areAnimationsEnabled = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAreAnimationsEnabled() {
        return this.areAnimationsEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    public final er.a<i0> c() {
        return this.onBackAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcScreenModel)) {
            return false;
        }
        NfcScreenModel nfcScreenModel = (NfcScreenModel) other;
        return t.c(this.scaffoldData, nfcScreenModel.scaffoldData) && t.c(this.title, nfcScreenModel.title) && t.c(this.description, nfcScreenModel.description) && t.c(this.progress, nfcScreenModel.progress) && t.c(this.onBackAction, nfcScreenModel.onBackAction) && this.areAnimationsEnabled == nfcScreenModel.areAnimationsEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Label label = this.progress;
        return ((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.onBackAction.hashCode()) * 31) + Boolean.hashCode(this.areAnimationsEnabled);
    }

    public String toString() {
        return "NfcScreenModel(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", progress=" + this.progress + ", onBackAction=" + this.onBackAction + ", areAnimationsEnabled=" + this.areAnimationsEnabled + ')';
    }

    public /* synthetic */ NfcScreenModel(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, er.a aVar, boolean z15, int i15, k kVar) {
        this(baseScaffoldData, label, label2, (i15 & 8) != 0 ? null : label3, aVar, z15);
    }
}
