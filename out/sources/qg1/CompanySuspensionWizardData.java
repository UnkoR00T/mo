package qg1;

import af1.PkdCodeMainSelectionContractData;
import bg1.CompanyShortNameContractData;
import de1.KrusData;
import df1.SocialInsuranceSelectionContractData;
import fr.k;
import fr.t;
import jg1.CompanyManagementEntryPointContractData;
import jg1.d;
import lf1.TaxOfficeContractData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rd1.EdorAddressData;
import rf1.CompanyDetailsContractData;
import xe1.PkdCodeContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: renamed from: qg1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u009e\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b1\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b=\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bC\u0010H\u001a\u0004\b3\u0010IR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bF\u0010J\u001a\u0004\b7\u0010KR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b5\u0010L\u001a\u0004\b;\u0010MR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b.\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lqg1/a;", "", "Lrf1/b;", "companyDetailsContractData", "Ljg1/d;", "suspensionPeriod", "Lzd1/b;", "homeAddressContractData", "Ldf1/b;", "socialInsuranceSelectionContractData", "Lrd1/b;", "edorAddressData", "Lde1/e;", "krusData", "Llf1/b;", "taxOfficeContractData", "Lxe1/b;", "pkdCodeContractData", "Laf1/b;", "pkdCodeMainSelectionContractData", "Ljg1/b;", "companyManagementEntryPointContractData", "Lbg1/b;", "companyShortNameContractData", "Ltf1/b;", "contactInfoContractData", "", "isCompanyNewContactEnabled", "<init>", "(Lrf1/b;Ljg1/d;Lzd1/b;Ldf1/b;Lrd1/b;Lde1/e;Llf1/b;Lxe1/b;Laf1/b;Ljg1/b;Lbg1/b;Ltf1/b;Z)V", "a", "(Lrf1/b;Ljg1/d;Lzd1/b;Ldf1/b;Lrd1/b;Lde1/e;Llf1/b;Lxe1/b;Laf1/b;Ljg1/b;Lbg1/b;Ltf1/b;Z)Lqg1/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrf1/b;", "c", "()Lrf1/b;", "b", "Ljg1/d;", "m", "()Ljg1/d;", "Lzd1/b;", "h", "()Lzd1/b;", "d", "Ldf1/b;", "l", "()Ldf1/b;", "e", "Lrd1/b;", "g", "()Lrd1/b;", "f", "Lde1/e;", "i", "()Lde1/e;", "Llf1/b;", "n", "()Llf1/b;", "Lxe1/b;", "j", "()Lxe1/b;", "Laf1/b;", "k", "()Laf1/b;", "Ljg1/b;", "()Ljg1/b;", "Lbg1/b;", "()Lbg1/b;", "Ltf1/b;", "()Ltf1/b;", "Z", "o", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanySuspensionWizardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CompanyDetailsContractData companyDetailsContractData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d suspensionPeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final HomeAddressContractData homeAddressContractData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final SocialInsuranceSelectionContractData socialInsuranceSelectionContractData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdorAddressData edorAddressData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final KrusData krusData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxOfficeContractData taxOfficeContractData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final PkdCodeContractData pkdCodeContractData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final CompanyManagementEntryPointContractData companyManagementEntryPointContractData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final CompanyShortNameContractData companyShortNameContractData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final tf1.b contactInfoContractData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCompanyNewContactEnabled;

    public CompanySuspensionWizardData(CompanyDetailsContractData companyDetailsContractData, d dVar, HomeAddressContractData homeAddressContractData, SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, EdorAddressData edorAddressData, KrusData krusData, TaxOfficeContractData taxOfficeContractData, PkdCodeContractData pkdCodeContractData, PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData, CompanyManagementEntryPointContractData companyManagementEntryPointContractData, CompanyShortNameContractData companyShortNameContractData, tf1.b bVar, boolean z15) {
        this.companyDetailsContractData = companyDetailsContractData;
        this.suspensionPeriod = dVar;
        this.homeAddressContractData = homeAddressContractData;
        this.socialInsuranceSelectionContractData = socialInsuranceSelectionContractData;
        this.edorAddressData = edorAddressData;
        this.krusData = krusData;
        this.taxOfficeContractData = taxOfficeContractData;
        this.pkdCodeContractData = pkdCodeContractData;
        this.pkdCodeMainSelectionContractData = pkdCodeMainSelectionContractData;
        this.companyManagementEntryPointContractData = companyManagementEntryPointContractData;
        this.companyShortNameContractData = companyShortNameContractData;
        this.contactInfoContractData = bVar;
        this.isCompanyNewContactEnabled = z15;
    }

    public static /* synthetic */ CompanySuspensionWizardData b(CompanySuspensionWizardData companySuspensionWizardData, CompanyDetailsContractData companyDetailsContractData, d dVar, HomeAddressContractData homeAddressContractData, SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, EdorAddressData edorAddressData, KrusData krusData, TaxOfficeContractData taxOfficeContractData, PkdCodeContractData pkdCodeContractData, PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData, CompanyManagementEntryPointContractData companyManagementEntryPointContractData, CompanyShortNameContractData companyShortNameContractData, tf1.b bVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            companyDetailsContractData = companySuspensionWizardData.companyDetailsContractData;
        }
        return companySuspensionWizardData.a(companyDetailsContractData, (i15 & 2) != 0 ? companySuspensionWizardData.suspensionPeriod : dVar, (i15 & 4) != 0 ? companySuspensionWizardData.homeAddressContractData : homeAddressContractData, (i15 & 8) != 0 ? companySuspensionWizardData.socialInsuranceSelectionContractData : socialInsuranceSelectionContractData, (i15 & 16) != 0 ? companySuspensionWizardData.edorAddressData : edorAddressData, (i15 & 32) != 0 ? companySuspensionWizardData.krusData : krusData, (i15 & 64) != 0 ? companySuspensionWizardData.taxOfficeContractData : taxOfficeContractData, (i15 & 128) != 0 ? companySuspensionWizardData.pkdCodeContractData : pkdCodeContractData, (i15 & 256) != 0 ? companySuspensionWizardData.pkdCodeMainSelectionContractData : pkdCodeMainSelectionContractData, (i15 & 512) != 0 ? companySuspensionWizardData.companyManagementEntryPointContractData : companyManagementEntryPointContractData, (i15 & 1024) != 0 ? companySuspensionWizardData.companyShortNameContractData : companyShortNameContractData, (i15 & 2048) != 0 ? companySuspensionWizardData.contactInfoContractData : bVar, (i15 & PKIFailureInfo.certConfirmed) != 0 ? companySuspensionWizardData.isCompanyNewContactEnabled : z15);
    }

    public final CompanySuspensionWizardData a(CompanyDetailsContractData companyDetailsContractData, d suspensionPeriod, HomeAddressContractData homeAddressContractData, SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, EdorAddressData edorAddressData, KrusData krusData, TaxOfficeContractData taxOfficeContractData, PkdCodeContractData pkdCodeContractData, PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData, CompanyManagementEntryPointContractData companyManagementEntryPointContractData, CompanyShortNameContractData companyShortNameContractData, tf1.b contactInfoContractData, boolean isCompanyNewContactEnabled) {
        return new CompanySuspensionWizardData(companyDetailsContractData, suspensionPeriod, homeAddressContractData, socialInsuranceSelectionContractData, edorAddressData, krusData, taxOfficeContractData, pkdCodeContractData, pkdCodeMainSelectionContractData, companyManagementEntryPointContractData, companyShortNameContractData, contactInfoContractData, isCompanyNewContactEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CompanyDetailsContractData getCompanyDetailsContractData() {
        return this.companyDetailsContractData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CompanyManagementEntryPointContractData getCompanyManagementEntryPointContractData() {
        return this.companyManagementEntryPointContractData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final CompanyShortNameContractData getCompanyShortNameContractData() {
        return this.companyShortNameContractData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanySuspensionWizardData)) {
            return false;
        }
        CompanySuspensionWizardData companySuspensionWizardData = (CompanySuspensionWizardData) other;
        return t.c(this.companyDetailsContractData, companySuspensionWizardData.companyDetailsContractData) && t.c(this.suspensionPeriod, companySuspensionWizardData.suspensionPeriod) && t.c(this.homeAddressContractData, companySuspensionWizardData.homeAddressContractData) && t.c(this.socialInsuranceSelectionContractData, companySuspensionWizardData.socialInsuranceSelectionContractData) && t.c(this.edorAddressData, companySuspensionWizardData.edorAddressData) && t.c(this.krusData, companySuspensionWizardData.krusData) && t.c(this.taxOfficeContractData, companySuspensionWizardData.taxOfficeContractData) && t.c(this.pkdCodeContractData, companySuspensionWizardData.pkdCodeContractData) && t.c(this.pkdCodeMainSelectionContractData, companySuspensionWizardData.pkdCodeMainSelectionContractData) && t.c(this.companyManagementEntryPointContractData, companySuspensionWizardData.companyManagementEntryPointContractData) && t.c(this.companyShortNameContractData, companySuspensionWizardData.companyShortNameContractData) && t.c(this.contactInfoContractData, companySuspensionWizardData.contactInfoContractData) && this.isCompanyNewContactEnabled == companySuspensionWizardData.isCompanyNewContactEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final tf1.b getContactInfoContractData() {
        return this.contactInfoContractData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EdorAddressData getEdorAddressData() {
        return this.edorAddressData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final HomeAddressContractData getHomeAddressContractData() {
        return this.homeAddressContractData;
    }

    public int hashCode() {
        int iHashCode = ((((((this.companyDetailsContractData.hashCode() * 31) + this.suspensionPeriod.hashCode()) * 31) + this.homeAddressContractData.hashCode()) * 31) + this.socialInsuranceSelectionContractData.hashCode()) * 31;
        EdorAddressData edorAddressData = this.edorAddressData;
        int iHashCode2 = (iHashCode + (edorAddressData == null ? 0 : edorAddressData.hashCode())) * 31;
        KrusData krusData = this.krusData;
        int iHashCode3 = (((iHashCode2 + (krusData == null ? 0 : krusData.hashCode())) * 31) + this.taxOfficeContractData.hashCode()) * 31;
        PkdCodeContractData pkdCodeContractData = this.pkdCodeContractData;
        int iHashCode4 = (iHashCode3 + (pkdCodeContractData == null ? 0 : pkdCodeContractData.hashCode())) * 31;
        PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData = this.pkdCodeMainSelectionContractData;
        int iHashCode5 = (((iHashCode4 + (pkdCodeMainSelectionContractData == null ? 0 : pkdCodeMainSelectionContractData.hashCode())) * 31) + this.companyManagementEntryPointContractData.hashCode()) * 31;
        CompanyShortNameContractData companyShortNameContractData = this.companyShortNameContractData;
        int iHashCode6 = (iHashCode5 + (companyShortNameContractData == null ? 0 : companyShortNameContractData.hashCode())) * 31;
        tf1.b bVar = this.contactInfoContractData;
        return ((iHashCode6 + (bVar != null ? bVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCompanyNewContactEnabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final KrusData getKrusData() {
        return this.krusData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final PkdCodeContractData getPkdCodeContractData() {
        return this.pkdCodeContractData;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final PkdCodeMainSelectionContractData getPkdCodeMainSelectionContractData() {
        return this.pkdCodeMainSelectionContractData;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final SocialInsuranceSelectionContractData getSocialInsuranceSelectionContractData() {
        return this.socialInsuranceSelectionContractData;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final d getSuspensionPeriod() {
        return this.suspensionPeriod;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TaxOfficeContractData getTaxOfficeContractData() {
        return this.taxOfficeContractData;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsCompanyNewContactEnabled() {
        return this.isCompanyNewContactEnabled;
    }

    public String toString() {
        return "CompanySuspensionWizardData(companyDetailsContractData=" + this.companyDetailsContractData + ", suspensionPeriod=" + this.suspensionPeriod + ", homeAddressContractData=" + this.homeAddressContractData + ", socialInsuranceSelectionContractData=" + this.socialInsuranceSelectionContractData + ", edorAddressData=" + this.edorAddressData + ", krusData=" + this.krusData + ", taxOfficeContractData=" + this.taxOfficeContractData + ", pkdCodeContractData=" + this.pkdCodeContractData + ", pkdCodeMainSelectionContractData=" + this.pkdCodeMainSelectionContractData + ", companyManagementEntryPointContractData=" + this.companyManagementEntryPointContractData + ", companyShortNameContractData=" + this.companyShortNameContractData + ", contactInfoContractData=" + this.contactInfoContractData + ", isCompanyNewContactEnabled=" + this.isCompanyNewContactEnabled + ')';
    }

    public /* synthetic */ CompanySuspensionWizardData(CompanyDetailsContractData companyDetailsContractData, d dVar, HomeAddressContractData homeAddressContractData, SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, EdorAddressData edorAddressData, KrusData krusData, TaxOfficeContractData taxOfficeContractData, PkdCodeContractData pkdCodeContractData, PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData, CompanyManagementEntryPointContractData companyManagementEntryPointContractData, CompanyShortNameContractData companyShortNameContractData, tf1.b bVar, boolean z15, int i15, k kVar) {
        this(companyDetailsContractData, dVar, homeAddressContractData, socialInsuranceSelectionContractData, edorAddressData, krusData, taxOfficeContractData, pkdCodeContractData, pkdCodeMainSelectionContractData, companyManagementEntryPointContractData, companyShortNameContractData, bVar, (i15 & PKIFailureInfo.certConfirmed) != 0 ? false : z15);
    }
}
