package z11;

import b30.AccordionData;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import n50.k;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z11.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\"\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b/\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b)\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b&\u00104¨\u00065"}, d2 = {"Lz11/b;", "", "Li50/a;", "scaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lmx/a;", "detailsHeader", "Ln30/b;", "detailsSection", "Lb30/a;", "issuerAccordionData", "userAccordionData", "Ln50/k;", "invalidateSingleCardData", "Lc30/b$c;", "infoAlertData", "<init>", "(Li50/a;Ler/a;Lmx/a;Ln30/b;Lb30/a;Lb30/a;Ln50/k;Lc30/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Ler/a;", "getOnBackClick", "()Ler/a;", "c", "Lmx/a;", "()Lmx/a;", "d", "Ln30/b;", "()Ln30/b;", "e", "Lb30/a;", "()Lb30/a;", "g", "Ln50/k;", "()Ln50/k;", "h", "Lc30/b$c;", "()Lc30/b$c;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificateDetailsScreenModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onBackClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label detailsHeader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData detailsSection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionData issuerAccordionData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionData userAccordionData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final k invalidateSingleCardData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final c30.b.c infoAlertData;

    public CertificateDetailsScreenModel(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, Label label, CardListData cardListData, AccordionData accordionData, AccordionData accordionData2, k kVar, c30.b.c cVar) {
        this.scaffoldData = baseScaffoldData;
        this.onBackClick = aVar;
        this.detailsHeader = label;
        this.detailsSection = cardListData;
        this.issuerAccordionData = accordionData;
        this.userAccordionData = accordionData2;
        this.invalidateSingleCardData = kVar;
        this.infoAlertData = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDetailsHeader() {
        return this.detailsHeader;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CardListData getDetailsSection() {
        return this.detailsSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c30.b.c getInfoAlertData() {
        return this.infoAlertData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getInvalidateSingleCardData() {
        return this.invalidateSingleCardData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AccordionData getIssuerAccordionData() {
        return this.issuerAccordionData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateDetailsScreenModel)) {
            return false;
        }
        CertificateDetailsScreenModel certificateDetailsScreenModel = (CertificateDetailsScreenModel) other;
        return t.c(this.scaffoldData, certificateDetailsScreenModel.scaffoldData) && t.c(this.onBackClick, certificateDetailsScreenModel.onBackClick) && t.c(this.detailsHeader, certificateDetailsScreenModel.detailsHeader) && t.c(this.detailsSection, certificateDetailsScreenModel.detailsSection) && t.c(this.issuerAccordionData, certificateDetailsScreenModel.issuerAccordionData) && t.c(this.userAccordionData, certificateDetailsScreenModel.userAccordionData) && t.c(this.invalidateSingleCardData, certificateDetailsScreenModel.invalidateSingleCardData) && t.c(this.infoAlertData, certificateDetailsScreenModel.infoAlertData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AccordionData getUserAccordionData() {
        return this.userAccordionData;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.scaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.detailsHeader.hashCode()) * 31) + this.detailsSection.hashCode()) * 31) + this.issuerAccordionData.hashCode()) * 31) + this.userAccordionData.hashCode()) * 31;
        k kVar = this.invalidateSingleCardData;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        c30.b.c cVar = this.infoAlertData;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "CertificateDetailsScreenModel(scaffoldData=" + this.scaffoldData + ", onBackClick=" + this.onBackClick + ", detailsHeader=" + this.detailsHeader + ", detailsSection=" + this.detailsSection + ", issuerAccordionData=" + this.issuerAccordionData + ", userAccordionData=" + this.userAccordionData + ", invalidateSingleCardData=" + this.invalidateSingleCardData + ", infoAlertData=" + this.infoAlertData + ')';
    }
}
