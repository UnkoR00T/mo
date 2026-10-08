package rj2;

import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import n50.k;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rj2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b\u001f\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b%\u0010,¨\u0006-"}, d2 = {"Lrj2/c;", "", "Li50/a;", "scaffoldData", "", "newsletterUrl", "", "Ln50/k;", "additionalInformationContent", "Lrj2/a;", "mObywatelProfileRegulationsModel", "Lrj2/b;", "bottomSheetState", "Lkotlin/Function0;", "Loq/i0;", "onBottomSheetClosed", "<init>", "(Li50/a;Ljava/lang/String;Ljava/util/List;Lrj2/a;Lrj2/b;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Ljava/lang/String;", "getNewsletterUrl", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lrj2/a;", "()Lrj2/a;", "Lrj2/b;", "()Lrj2/b;", "f", "Ler/a;", "()Ler/a;", "legalinformation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LegalInformationScreenModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String newsletterUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<k> additionalInformationContent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LegalInformationBottomSheetModel mObywatelProfileRegulationsModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b bottomSheetState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onBottomSheetClosed;

    /* JADX WARN: Multi-variable type inference failed */
    public LegalInformationScreenModel(BaseScaffoldData baseScaffoldData, String str, List<? extends k> list, LegalInformationBottomSheetModel legalInformationBottomSheetModel, b bVar, er.a<i0> aVar) {
        this.scaffoldData = baseScaffoldData;
        this.newsletterUrl = str;
        this.additionalInformationContent = list;
        this.mObywatelProfileRegulationsModel = legalInformationBottomSheetModel;
        this.bottomSheetState = bVar;
        this.onBottomSheetClosed = aVar;
    }

    public final List<k> a() {
        return this.additionalInformationContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LegalInformationBottomSheetModel getMObywatelProfileRegulationsModel() {
        return this.mObywatelProfileRegulationsModel;
    }

    public final er.a<i0> d() {
        return this.onBottomSheetClosed;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalInformationScreenModel)) {
            return false;
        }
        LegalInformationScreenModel legalInformationScreenModel = (LegalInformationScreenModel) other;
        return t.c(this.scaffoldData, legalInformationScreenModel.scaffoldData) && t.c(this.newsletterUrl, legalInformationScreenModel.newsletterUrl) && t.c(this.additionalInformationContent, legalInformationScreenModel.additionalInformationContent) && t.c(this.mObywatelProfileRegulationsModel, legalInformationScreenModel.mObywatelProfileRegulationsModel) && t.c(this.bottomSheetState, legalInformationScreenModel.bottomSheetState) && t.c(this.onBottomSheetClosed, legalInformationScreenModel.onBottomSheetClosed);
    }

    public int hashCode() {
        return (((((((((this.scaffoldData.hashCode() * 31) + this.newsletterUrl.hashCode()) * 31) + this.additionalInformationContent.hashCode()) * 31) + this.mObywatelProfileRegulationsModel.hashCode()) * 31) + this.bottomSheetState.hashCode()) * 31) + this.onBottomSheetClosed.hashCode();
    }

    public String toString() {
        return "LegalInformationScreenModel(scaffoldData=" + this.scaffoldData + ", newsletterUrl=" + this.newsletterUrl + ", additionalInformationContent=" + this.additionalInformationContent + ", mObywatelProfileRegulationsModel=" + this.mObywatelProfileRegulationsModel + ", bottomSheetState=" + this.bottomSheetState + ", onBottomSheetClosed=" + this.onBottomSheetClosed + ')';
    }
}
