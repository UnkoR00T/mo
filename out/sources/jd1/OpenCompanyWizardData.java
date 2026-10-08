package jd1;

import af1.PkdCodeMainSelectionContractData;
import cc1.BusinessAddressAvailabilityContractData;
import de1.KrusData;
import df1.SocialInsuranceSelectionContractData;
import fc1.CompanyNameContractData;
import fr.k;
import fr.t;
import lc1.CorrespondenceAddressSelectionContractData;
import ld1.KnownUserDataModel;
import lf1.TaxOfficeContractData;
import oc1.CorrespondencePostOfficeBoxContractData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rd1.EdorAddressData;
import sb1.AccountingDocumentAddressSelectionContractData;
import tc1.IncomeTaxFormSelectionContractData;
import wb1.AccountingDocumentSelectionContractData;
import xe1.PkdCodeContractData;
import zb1.BusinessAddressSelectionContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: renamed from: jd1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b=\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JÌ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010J\u001a\u0004\bB\u0010KR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b@\u0010L\u001a\u0004\bF\u0010MR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bN\u0010PR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b8\u0010U\u001a\u0004\bQ\u0010VR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b4\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\\\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bD\u0010a\u001a\u0004\b>\u0010bR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bH\u0010c\u001a\u0004\b:\u0010dR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bS\u0010e\u001a\u0004\bW\u0010fR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bY\u0010g\u001a\u0004\bh\u0010i¨\u0006j"}, d2 = {"Ljd1/a;", "", "Lld1/h;", "knownUserData", "Lzd1/b;", "homeAddressContractData", "Lfc1/b;", "companyNameContractData", "Lic1/b;", "contactInfoContractData", "Lxe1/b;", "pkdCodeContractData", "Laf1/b;", "pkdCodeMainSelectionContractData", "Lcc1/b;", "businessAddressAvailabilityContractData", "Lzb1/b;", "businessAddressSelectionContractData", "Llc1/b;", "correspondenceAddressSelectionContractData", "Loc1/b;", "postOfficeBoxContractData", "Lrd1/b;", "edorAddressData", "Ldf1/b;", "socialInsuranceSelectionContractData", "Lde1/e;", "krusData", "Llf1/b;", "taxOfficeContractData", "Lwb1/b;", "accountingDocumentSelectionContractData", "Lsb1/b;", "accountingDocumentAddressSelectionContractData", "Ltc1/b;", "incomeTaxFormSelectionContractData", "", "isCompanyNewContactEnabled", "<init>", "(Lld1/h;Lzd1/b;Lfc1/b;Lic1/b;Lxe1/b;Laf1/b;Lcc1/b;Lzb1/b;Llc1/b;Loc1/b;Lrd1/b;Ldf1/b;Lde1/e;Llf1/b;Lwb1/b;Lsb1/b;Ltc1/b;Z)V", "a", "(Lld1/h;Lzd1/b;Lfc1/b;Lic1/b;Lxe1/b;Laf1/b;Lcc1/b;Lzb1/b;Llc1/b;Loc1/b;Lrd1/b;Ldf1/b;Lde1/e;Llf1/b;Lwb1/b;Lsb1/b;Ltc1/b;Z)Ljd1/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lld1/h;", "m", "()Lld1/h;", "b", "Lzd1/b;", "k", "()Lzd1/b;", "c", "Lfc1/b;", "g", "()Lfc1/b;", "d", "Lic1/b;", "h", "()Lic1/b;", "e", "Lxe1/b;", "o", "()Lxe1/b;", "f", "Laf1/b;", "p", "()Laf1/b;", "Lcc1/b;", "()Lcc1/b;", "Lzb1/b;", "()Lzb1/b;", "i", "Llc1/b;", "()Llc1/b;", "j", "Loc1/b;", "q", "()Loc1/b;", "Lrd1/b;", "()Lrd1/b;", "l", "Ldf1/b;", "r", "()Ldf1/b;", "Lde1/e;", "n", "()Lde1/e;", "Llf1/b;", "s", "()Llf1/b;", "Lwb1/b;", "()Lwb1/b;", "Lsb1/b;", "()Lsb1/b;", "Ltc1/b;", "()Ltc1/b;", "Z", "t", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenCompanyWizardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final KnownUserDataModel knownUserData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HomeAddressContractData homeAddressContractData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CompanyNameContractData companyNameContractData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ic1.b contactInfoContractData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PkdCodeContractData pkdCodeContractData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BusinessAddressAvailabilityContractData businessAddressAvailabilityContractData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final BusinessAddressSelectionContractData businessAddressSelectionContractData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final CorrespondencePostOfficeBoxContractData postOfficeBoxContractData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdorAddressData edorAddressData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final SocialInsuranceSelectionContractData socialInsuranceSelectionContractData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final KrusData krusData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxOfficeContractData taxOfficeContractData;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccountingDocumentSelectionContractData accountingDocumentSelectionContractData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final IncomeTaxFormSelectionContractData incomeTaxFormSelectionContractData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCompanyNewContactEnabled;

    public OpenCompanyWizardData(KnownUserDataModel knownUserDataModel, HomeAddressContractData homeAddressContractData, CompanyNameContractData companyNameContractData, ic1.b bVar, PkdCodeContractData pkdCodeContractData, PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData, BusinessAddressAvailabilityContractData businessAddressAvailabilityContractData, BusinessAddressSelectionContractData businessAddressSelectionContractData, CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractData, CorrespondencePostOfficeBoxContractData correspondencePostOfficeBoxContractData, EdorAddressData edorAddressData, SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, KrusData krusData, TaxOfficeContractData taxOfficeContractData, AccountingDocumentSelectionContractData accountingDocumentSelectionContractData, AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractData, IncomeTaxFormSelectionContractData incomeTaxFormSelectionContractData, boolean z15) {
        this.knownUserData = knownUserDataModel;
        this.homeAddressContractData = homeAddressContractData;
        this.companyNameContractData = companyNameContractData;
        this.contactInfoContractData = bVar;
        this.pkdCodeContractData = pkdCodeContractData;
        this.pkdCodeMainSelectionContractData = pkdCodeMainSelectionContractData;
        this.businessAddressAvailabilityContractData = businessAddressAvailabilityContractData;
        this.businessAddressSelectionContractData = businessAddressSelectionContractData;
        this.correspondenceAddressSelectionContractData = correspondenceAddressSelectionContractData;
        this.postOfficeBoxContractData = correspondencePostOfficeBoxContractData;
        this.edorAddressData = edorAddressData;
        this.socialInsuranceSelectionContractData = socialInsuranceSelectionContractData;
        this.krusData = krusData;
        this.taxOfficeContractData = taxOfficeContractData;
        this.accountingDocumentSelectionContractData = accountingDocumentSelectionContractData;
        this.accountingDocumentAddressSelectionContractData = accountingDocumentAddressSelectionContractData;
        this.incomeTaxFormSelectionContractData = incomeTaxFormSelectionContractData;
        this.isCompanyNewContactEnabled = z15;
    }

    public static /* synthetic */ OpenCompanyWizardData b(OpenCompanyWizardData openCompanyWizardData, KnownUserDataModel knownUserDataModel, HomeAddressContractData homeAddressContractData, CompanyNameContractData companyNameContractData, ic1.b bVar, PkdCodeContractData pkdCodeContractData, PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData, BusinessAddressAvailabilityContractData businessAddressAvailabilityContractData, BusinessAddressSelectionContractData businessAddressSelectionContractData, CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractData, CorrespondencePostOfficeBoxContractData correspondencePostOfficeBoxContractData, EdorAddressData edorAddressData, SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, KrusData krusData, TaxOfficeContractData taxOfficeContractData, AccountingDocumentSelectionContractData accountingDocumentSelectionContractData, AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractData, IncomeTaxFormSelectionContractData incomeTaxFormSelectionContractData, boolean z15, int i15, Object obj) {
        boolean z16;
        IncomeTaxFormSelectionContractData incomeTaxFormSelectionContractData2;
        KnownUserDataModel knownUserDataModel2 = (i15 & 1) != 0 ? openCompanyWizardData.knownUserData : knownUserDataModel;
        HomeAddressContractData homeAddressContractData2 = (i15 & 2) != 0 ? openCompanyWizardData.homeAddressContractData : homeAddressContractData;
        CompanyNameContractData companyNameContractData2 = (i15 & 4) != 0 ? openCompanyWizardData.companyNameContractData : companyNameContractData;
        ic1.b bVar2 = (i15 & 8) != 0 ? openCompanyWizardData.contactInfoContractData : bVar;
        PkdCodeContractData pkdCodeContractData2 = (i15 & 16) != 0 ? openCompanyWizardData.pkdCodeContractData : pkdCodeContractData;
        PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData2 = (i15 & 32) != 0 ? openCompanyWizardData.pkdCodeMainSelectionContractData : pkdCodeMainSelectionContractData;
        BusinessAddressAvailabilityContractData businessAddressAvailabilityContractData2 = (i15 & 64) != 0 ? openCompanyWizardData.businessAddressAvailabilityContractData : businessAddressAvailabilityContractData;
        BusinessAddressSelectionContractData businessAddressSelectionContractData2 = (i15 & 128) != 0 ? openCompanyWizardData.businessAddressSelectionContractData : businessAddressSelectionContractData;
        CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractData2 = (i15 & 256) != 0 ? openCompanyWizardData.correspondenceAddressSelectionContractData : correspondenceAddressSelectionContractData;
        CorrespondencePostOfficeBoxContractData correspondencePostOfficeBoxContractData2 = (i15 & 512) != 0 ? openCompanyWizardData.postOfficeBoxContractData : correspondencePostOfficeBoxContractData;
        EdorAddressData edorAddressData2 = (i15 & 1024) != 0 ? openCompanyWizardData.edorAddressData : edorAddressData;
        SocialInsuranceSelectionContractData socialInsuranceSelectionContractData2 = (i15 & 2048) != 0 ? openCompanyWizardData.socialInsuranceSelectionContractData : socialInsuranceSelectionContractData;
        KrusData krusData2 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? openCompanyWizardData.krusData : krusData;
        TaxOfficeContractData taxOfficeContractData2 = (i15 & PKIFailureInfo.certRevoked) != 0 ? openCompanyWizardData.taxOfficeContractData : taxOfficeContractData;
        KnownUserDataModel knownUserDataModel3 = knownUserDataModel2;
        AccountingDocumentSelectionContractData accountingDocumentSelectionContractData2 = (i15 & 16384) != 0 ? openCompanyWizardData.accountingDocumentSelectionContractData : accountingDocumentSelectionContractData;
        AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractData2 = (i15 & 32768) != 0 ? openCompanyWizardData.accountingDocumentAddressSelectionContractData : accountingDocumentAddressSelectionContractData;
        IncomeTaxFormSelectionContractData incomeTaxFormSelectionContractData3 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? openCompanyWizardData.incomeTaxFormSelectionContractData : incomeTaxFormSelectionContractData;
        if ((i15 & PKIFailureInfo.unsupportedVersion) != 0) {
            incomeTaxFormSelectionContractData2 = incomeTaxFormSelectionContractData3;
            z16 = openCompanyWizardData.isCompanyNewContactEnabled;
        } else {
            z16 = z15;
            incomeTaxFormSelectionContractData2 = incomeTaxFormSelectionContractData3;
        }
        return openCompanyWizardData.a(knownUserDataModel3, homeAddressContractData2, companyNameContractData2, bVar2, pkdCodeContractData2, pkdCodeMainSelectionContractData2, businessAddressAvailabilityContractData2, businessAddressSelectionContractData2, correspondenceAddressSelectionContractData2, correspondencePostOfficeBoxContractData2, edorAddressData2, socialInsuranceSelectionContractData2, krusData2, taxOfficeContractData2, accountingDocumentSelectionContractData2, accountingDocumentAddressSelectionContractData2, incomeTaxFormSelectionContractData2, z16);
    }

    public final OpenCompanyWizardData a(KnownUserDataModel knownUserData, HomeAddressContractData homeAddressContractData, CompanyNameContractData companyNameContractData, ic1.b contactInfoContractData, PkdCodeContractData pkdCodeContractData, PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData, BusinessAddressAvailabilityContractData businessAddressAvailabilityContractData, BusinessAddressSelectionContractData businessAddressSelectionContractData, CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractData, CorrespondencePostOfficeBoxContractData postOfficeBoxContractData, EdorAddressData edorAddressData, SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, KrusData krusData, TaxOfficeContractData taxOfficeContractData, AccountingDocumentSelectionContractData accountingDocumentSelectionContractData, AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractData, IncomeTaxFormSelectionContractData incomeTaxFormSelectionContractData, boolean isCompanyNewContactEnabled) {
        return new OpenCompanyWizardData(knownUserData, homeAddressContractData, companyNameContractData, contactInfoContractData, pkdCodeContractData, pkdCodeMainSelectionContractData, businessAddressAvailabilityContractData, businessAddressSelectionContractData, correspondenceAddressSelectionContractData, postOfficeBoxContractData, edorAddressData, socialInsuranceSelectionContractData, krusData, taxOfficeContractData, accountingDocumentSelectionContractData, accountingDocumentAddressSelectionContractData, incomeTaxFormSelectionContractData, isCompanyNewContactEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AccountingDocumentAddressSelectionContractData getAccountingDocumentAddressSelectionContractData() {
        return this.accountingDocumentAddressSelectionContractData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AccountingDocumentSelectionContractData getAccountingDocumentSelectionContractData() {
        return this.accountingDocumentSelectionContractData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BusinessAddressAvailabilityContractData getBusinessAddressAvailabilityContractData() {
        return this.businessAddressAvailabilityContractData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenCompanyWizardData)) {
            return false;
        }
        OpenCompanyWizardData openCompanyWizardData = (OpenCompanyWizardData) other;
        return t.c(this.knownUserData, openCompanyWizardData.knownUserData) && t.c(this.homeAddressContractData, openCompanyWizardData.homeAddressContractData) && t.c(this.companyNameContractData, openCompanyWizardData.companyNameContractData) && t.c(this.contactInfoContractData, openCompanyWizardData.contactInfoContractData) && t.c(this.pkdCodeContractData, openCompanyWizardData.pkdCodeContractData) && t.c(this.pkdCodeMainSelectionContractData, openCompanyWizardData.pkdCodeMainSelectionContractData) && t.c(this.businessAddressAvailabilityContractData, openCompanyWizardData.businessAddressAvailabilityContractData) && t.c(this.businessAddressSelectionContractData, openCompanyWizardData.businessAddressSelectionContractData) && t.c(this.correspondenceAddressSelectionContractData, openCompanyWizardData.correspondenceAddressSelectionContractData) && t.c(this.postOfficeBoxContractData, openCompanyWizardData.postOfficeBoxContractData) && t.c(this.edorAddressData, openCompanyWizardData.edorAddressData) && t.c(this.socialInsuranceSelectionContractData, openCompanyWizardData.socialInsuranceSelectionContractData) && t.c(this.krusData, openCompanyWizardData.krusData) && t.c(this.taxOfficeContractData, openCompanyWizardData.taxOfficeContractData) && t.c(this.accountingDocumentSelectionContractData, openCompanyWizardData.accountingDocumentSelectionContractData) && t.c(this.accountingDocumentAddressSelectionContractData, openCompanyWizardData.accountingDocumentAddressSelectionContractData) && t.c(this.incomeTaxFormSelectionContractData, openCompanyWizardData.incomeTaxFormSelectionContractData) && this.isCompanyNewContactEnabled == openCompanyWizardData.isCompanyNewContactEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BusinessAddressSelectionContractData getBusinessAddressSelectionContractData() {
        return this.businessAddressSelectionContractData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final CompanyNameContractData getCompanyNameContractData() {
        return this.companyNameContractData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ic1.b getContactInfoContractData() {
        return this.contactInfoContractData;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.knownUserData.hashCode() * 31) + this.homeAddressContractData.hashCode()) * 31) + this.companyNameContractData.hashCode()) * 31) + this.contactInfoContractData.hashCode()) * 31) + this.pkdCodeContractData.hashCode()) * 31) + this.pkdCodeMainSelectionContractData.hashCode()) * 31) + this.businessAddressAvailabilityContractData.hashCode()) * 31;
        BusinessAddressSelectionContractData businessAddressSelectionContractData = this.businessAddressSelectionContractData;
        int iHashCode2 = (((iHashCode + (businessAddressSelectionContractData == null ? 0 : businessAddressSelectionContractData.hashCode())) * 31) + this.correspondenceAddressSelectionContractData.hashCode()) * 31;
        CorrespondencePostOfficeBoxContractData correspondencePostOfficeBoxContractData = this.postOfficeBoxContractData;
        int iHashCode3 = (((((iHashCode2 + (correspondencePostOfficeBoxContractData == null ? 0 : correspondencePostOfficeBoxContractData.hashCode())) * 31) + this.edorAddressData.hashCode()) * 31) + this.socialInsuranceSelectionContractData.hashCode()) * 31;
        KrusData krusData = this.krusData;
        int iHashCode4 = (((((iHashCode3 + (krusData == null ? 0 : krusData.hashCode())) * 31) + this.taxOfficeContractData.hashCode()) * 31) + this.accountingDocumentSelectionContractData.hashCode()) * 31;
        AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractData = this.accountingDocumentAddressSelectionContractData;
        return ((((iHashCode4 + (accountingDocumentAddressSelectionContractData != null ? accountingDocumentAddressSelectionContractData.hashCode() : 0)) * 31) + this.incomeTaxFormSelectionContractData.hashCode()) * 31) + Boolean.hashCode(this.isCompanyNewContactEnabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final CorrespondenceAddressSelectionContractData getCorrespondenceAddressSelectionContractData() {
        return this.correspondenceAddressSelectionContractData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EdorAddressData getEdorAddressData() {
        return this.edorAddressData;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final HomeAddressContractData getHomeAddressContractData() {
        return this.homeAddressContractData;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final IncomeTaxFormSelectionContractData getIncomeTaxFormSelectionContractData() {
        return this.incomeTaxFormSelectionContractData;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final KnownUserDataModel getKnownUserData() {
        return this.knownUserData;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final KrusData getKrusData() {
        return this.krusData;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final PkdCodeContractData getPkdCodeContractData() {
        return this.pkdCodeContractData;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final PkdCodeMainSelectionContractData getPkdCodeMainSelectionContractData() {
        return this.pkdCodeMainSelectionContractData;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final CorrespondencePostOfficeBoxContractData getPostOfficeBoxContractData() {
        return this.postOfficeBoxContractData;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final SocialInsuranceSelectionContractData getSocialInsuranceSelectionContractData() {
        return this.socialInsuranceSelectionContractData;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final TaxOfficeContractData getTaxOfficeContractData() {
        return this.taxOfficeContractData;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsCompanyNewContactEnabled() {
        return this.isCompanyNewContactEnabled;
    }

    public String toString() {
        return "OpenCompanyWizardData(knownUserData=" + this.knownUserData + ", homeAddressContractData=" + this.homeAddressContractData + ", companyNameContractData=" + this.companyNameContractData + ", contactInfoContractData=" + this.contactInfoContractData + ", pkdCodeContractData=" + this.pkdCodeContractData + ", pkdCodeMainSelectionContractData=" + this.pkdCodeMainSelectionContractData + ", businessAddressAvailabilityContractData=" + this.businessAddressAvailabilityContractData + ", businessAddressSelectionContractData=" + this.businessAddressSelectionContractData + ", correspondenceAddressSelectionContractData=" + this.correspondenceAddressSelectionContractData + ", postOfficeBoxContractData=" + this.postOfficeBoxContractData + ", edorAddressData=" + this.edorAddressData + ", socialInsuranceSelectionContractData=" + this.socialInsuranceSelectionContractData + ", krusData=" + this.krusData + ", taxOfficeContractData=" + this.taxOfficeContractData + ", accountingDocumentSelectionContractData=" + this.accountingDocumentSelectionContractData + ", accountingDocumentAddressSelectionContractData=" + this.accountingDocumentAddressSelectionContractData + ", incomeTaxFormSelectionContractData=" + this.incomeTaxFormSelectionContractData + ", isCompanyNewContactEnabled=" + this.isCompanyNewContactEnabled + ')';
    }

    public /* synthetic */ OpenCompanyWizardData(KnownUserDataModel knownUserDataModel, HomeAddressContractData homeAddressContractData, CompanyNameContractData companyNameContractData, ic1.b bVar, PkdCodeContractData pkdCodeContractData, PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData, BusinessAddressAvailabilityContractData businessAddressAvailabilityContractData, BusinessAddressSelectionContractData businessAddressSelectionContractData, CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractData, CorrespondencePostOfficeBoxContractData correspondencePostOfficeBoxContractData, EdorAddressData edorAddressData, SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, KrusData krusData, TaxOfficeContractData taxOfficeContractData, AccountingDocumentSelectionContractData accountingDocumentSelectionContractData, AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractData, IncomeTaxFormSelectionContractData incomeTaxFormSelectionContractData, boolean z15, int i15, k kVar) {
        this(knownUserDataModel, homeAddressContractData, companyNameContractData, bVar, pkdCodeContractData, pkdCodeMainSelectionContractData, businessAddressAvailabilityContractData, businessAddressSelectionContractData, correspondenceAddressSelectionContractData, correspondencePostOfficeBoxContractData, edorAddressData, socialInsuranceSelectionContractData, krusData, taxOfficeContractData, accountingDocumentSelectionContractData, accountingDocumentAddressSelectionContractData, incomeTaxFormSelectionContractData, (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? false : z15);
    }
}
