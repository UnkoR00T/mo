package de1;

import fr.k;
import fr.t;
import ld1.KrusOfficeModel;
import ld1.TaxOfficeModel;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: de1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jd\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b-\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b%\u00103¨\u00064"}, d2 = {"Lde1/e;", "", "Lde1/f;", "socialInsuranceQuestions", "Lde1/d;", "incomeTaxExceededInfo", "Lld1/i;", "krusOffice", "Lld1/r;", "taxOffice", "Lde1/b;", "incomeTaxExceededCertificateAnswer", "Lde1/c;", "incomeTaxExceededCertificateInfoAnswer", "Lde1/a;", "incomeTaxExceededAddFileModel", "<init>", "(Lde1/f;Lde1/d;Lld1/i;Lld1/r;Lde1/b;Lde1/c;Lde1/a;)V", "a", "(Lde1/f;Lde1/d;Lld1/i;Lld1/r;Lde1/b;Lde1/c;Lde1/a;)Lde1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lde1/f;", "h", "()Lde1/f;", "b", "Lde1/d;", "f", "()Lde1/d;", "c", "Lld1/i;", "g", "()Lld1/i;", "d", "Lld1/r;", "i", "()Lld1/r;", "e", "Lde1/b;", "()Lde1/b;", "Lde1/c;", "()Lde1/c;", "Lde1/a;", "()Lde1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KrusData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SocialInsuranceQuestions socialInsuranceQuestions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d incomeTaxExceededInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final KrusOfficeModel krusOffice;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxOfficeModel taxOffice;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b incomeTaxExceededCertificateAnswer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final c incomeTaxExceededCertificateInfoAnswer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel;

    public KrusData() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public static /* synthetic */ KrusData b(KrusData krusData, SocialInsuranceQuestions socialInsuranceQuestions, d dVar, KrusOfficeModel krusOfficeModel, TaxOfficeModel taxOfficeModel, b bVar, c cVar, IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            socialInsuranceQuestions = krusData.socialInsuranceQuestions;
        }
        if ((i15 & 2) != 0) {
            dVar = krusData.incomeTaxExceededInfo;
        }
        if ((i15 & 4) != 0) {
            krusOfficeModel = krusData.krusOffice;
        }
        if ((i15 & 8) != 0) {
            taxOfficeModel = krusData.taxOffice;
        }
        if ((i15 & 16) != 0) {
            bVar = krusData.incomeTaxExceededCertificateAnswer;
        }
        if ((i15 & 32) != 0) {
            cVar = krusData.incomeTaxExceededCertificateInfoAnswer;
        }
        if ((i15 & 64) != 0) {
            incomeTaxExceededAddFileModel = krusData.incomeTaxExceededAddFileModel;
        }
        c cVar2 = cVar;
        IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel2 = incomeTaxExceededAddFileModel;
        b bVar2 = bVar;
        KrusOfficeModel krusOfficeModel2 = krusOfficeModel;
        return krusData.a(socialInsuranceQuestions, dVar, krusOfficeModel2, taxOfficeModel, bVar2, cVar2, incomeTaxExceededAddFileModel2);
    }

    public final KrusData a(SocialInsuranceQuestions socialInsuranceQuestions, d incomeTaxExceededInfo, KrusOfficeModel krusOffice, TaxOfficeModel taxOffice, b incomeTaxExceededCertificateAnswer, c incomeTaxExceededCertificateInfoAnswer, IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel) {
        return new KrusData(socialInsuranceQuestions, incomeTaxExceededInfo, krusOffice, taxOffice, incomeTaxExceededCertificateAnswer, incomeTaxExceededCertificateInfoAnswer, incomeTaxExceededAddFileModel);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final IncomeTaxExceededAddFileModel getIncomeTaxExceededAddFileModel() {
        return this.incomeTaxExceededAddFileModel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getIncomeTaxExceededCertificateAnswer() {
        return this.incomeTaxExceededCertificateAnswer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getIncomeTaxExceededCertificateInfoAnswer() {
        return this.incomeTaxExceededCertificateInfoAnswer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KrusData)) {
            return false;
        }
        KrusData krusData = (KrusData) other;
        return t.c(this.socialInsuranceQuestions, krusData.socialInsuranceQuestions) && this.incomeTaxExceededInfo == krusData.incomeTaxExceededInfo && t.c(this.krusOffice, krusData.krusOffice) && t.c(this.taxOffice, krusData.taxOffice) && this.incomeTaxExceededCertificateAnswer == krusData.incomeTaxExceededCertificateAnswer && this.incomeTaxExceededCertificateInfoAnswer == krusData.incomeTaxExceededCertificateInfoAnswer && t.c(this.incomeTaxExceededAddFileModel, krusData.incomeTaxExceededAddFileModel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getIncomeTaxExceededInfo() {
        return this.incomeTaxExceededInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final KrusOfficeModel getKrusOffice() {
        return this.krusOffice;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final SocialInsuranceQuestions getSocialInsuranceQuestions() {
        return this.socialInsuranceQuestions;
    }

    public int hashCode() {
        SocialInsuranceQuestions socialInsuranceQuestions = this.socialInsuranceQuestions;
        int iHashCode = (socialInsuranceQuestions == null ? 0 : socialInsuranceQuestions.hashCode()) * 31;
        d dVar = this.incomeTaxExceededInfo;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        KrusOfficeModel krusOfficeModel = this.krusOffice;
        int iHashCode3 = (iHashCode2 + (krusOfficeModel == null ? 0 : krusOfficeModel.hashCode())) * 31;
        TaxOfficeModel taxOfficeModel = this.taxOffice;
        int iHashCode4 = (iHashCode3 + (taxOfficeModel == null ? 0 : taxOfficeModel.hashCode())) * 31;
        b bVar = this.incomeTaxExceededCertificateAnswer;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.incomeTaxExceededCertificateInfoAnswer;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel = this.incomeTaxExceededAddFileModel;
        return iHashCode6 + (incomeTaxExceededAddFileModel != null ? incomeTaxExceededAddFileModel.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TaxOfficeModel getTaxOffice() {
        return this.taxOffice;
    }

    public String toString() {
        return "KrusData(socialInsuranceQuestions=" + this.socialInsuranceQuestions + ", incomeTaxExceededInfo=" + this.incomeTaxExceededInfo + ", krusOffice=" + this.krusOffice + ", taxOffice=" + this.taxOffice + ", incomeTaxExceededCertificateAnswer=" + this.incomeTaxExceededCertificateAnswer + ", incomeTaxExceededCertificateInfoAnswer=" + this.incomeTaxExceededCertificateInfoAnswer + ", incomeTaxExceededAddFileModel=" + this.incomeTaxExceededAddFileModel + ')';
    }

    public KrusData(SocialInsuranceQuestions socialInsuranceQuestions, d dVar, KrusOfficeModel krusOfficeModel, TaxOfficeModel taxOfficeModel, b bVar, c cVar, IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel) {
        this.socialInsuranceQuestions = socialInsuranceQuestions;
        this.incomeTaxExceededInfo = dVar;
        this.krusOffice = krusOfficeModel;
        this.taxOffice = taxOfficeModel;
        this.incomeTaxExceededCertificateAnswer = bVar;
        this.incomeTaxExceededCertificateInfoAnswer = cVar;
        this.incomeTaxExceededAddFileModel = incomeTaxExceededAddFileModel;
    }

    public /* synthetic */ KrusData(SocialInsuranceQuestions socialInsuranceQuestions, d dVar, KrusOfficeModel krusOfficeModel, TaxOfficeModel taxOfficeModel, b bVar, c cVar, IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : socialInsuranceQuestions, (i15 & 2) != 0 ? null : dVar, (i15 & 4) != 0 ? null : krusOfficeModel, (i15 & 8) != 0 ? null : taxOfficeModel, (i15 & 16) != 0 ? null : bVar, (i15 & 32) != 0 ? null : cVar, (i15 & 64) != 0 ? null : incomeTaxExceededAddFileModel);
    }
}
