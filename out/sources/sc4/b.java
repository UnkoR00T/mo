package sc4;

import fk0.BEApplicationAccounting;
import fk0.BEApplicationAddress;
import fk0.BEApplicationApplicantDetails;
import fk0.BEApplicationAttachment;
import fk0.BEApplicationCompanyDetails;
import fk0.BEApplicationContactDetails;
import fk0.BEApplicationCorrespondence;
import fk0.BEApplicationElectronicDelivery;
import fk0.BEApplicationInsurance;
import fk0.BEApplicationKrusInput;
import fk0.BEApplicationPostOfficeBox;
import fk0.BEApplicationZusInput;
import fk0.BECitizenAddress;
import fk0.BECitizenData;
import fk0.BEGenerateApplicationRequest;
import fk0.BEGenerateApplicationResponse;
import fk0.BEOrderApplicationResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AccountingInput;
import jb1.ApplicantDetails;
import jb1.CompanyApplication;
import jb1.CompanyDetails;
import jb1.ContactDetailsInput;
import jb1.CorrespondenceInput;
import jb1.InsuranceInput;
import jb1.KrusInput;
import jb1.OrderApplication;
import jb1.PostOfficeBoxAddress;
import jb1.ZusInput;
import jb1.n;
import ld1.ApplicationXml;
import ld1.CompanyApplicationAddress;
import ld1.CompanyApplicationCitizenAddress;
import ld1.CompanyApplicationCitizenData;
import ld1.StatementAttachment;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010.\u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b.\u0010/\u001a\u0013\u00102\u001a\u000201*\u000200H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u0010:\u001a\u000209*\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010>\u001a\u00020=*\u00020<H\u0002¢\u0006\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lfk0/q;", "Lld1/d;", "r", "(Lfk0/q;)Lld1/d;", "Lfk0/r;", "Lld1/e;", "s", "(Lfk0/r;)Lld1/e;", "Lfk0/p0;", "Lld1/a;", "q", "(Lfk0/p0;)Lld1/a;", "Lfk0/z0;", "Ljb1/k;", "p", "(Lfk0/z0;)Ljb1/k;", "Lld1/c;", "Lfk0/b;", "f", "(Lld1/c;)Lfk0/b;", "Ljb1/n;", "Lfk0/n;", "n", "(Ljb1/n;)Lfk0/n;", "Ljb1/a;", "Lfk0/a;", "e", "(Ljb1/a;)Lfk0/a;", "Ljb1/e;", "Lfk0/f;", "j", "(Ljb1/e;)Lfk0/f;", "Ljb1/l;", "Lfk0/l;", "m", "(Ljb1/l;)Lfk0/l;", "Ljb1/f;", "Lfk0/g;", "k", "(Ljb1/f;)Lfk0/g;", "Ljb1/o;", "Lfk0/o;", "o", "(Ljb1/o;)Lfk0/o;", "Ljb1/h;", "Lfk0/j;", "l", "(Ljb1/h;)Lfk0/j;", "Ljb1/d;", "Lfk0/e;", "i", "(Ljb1/d;)Lfk0/e;", "Ljb1/b;", "Lfk0/c;", "g", "(Ljb1/b;)Lfk0/c;", "Lld1/n;", "Lfk0/d;", "h", "(Lld1/n;)Lfk0/d;", "Ljb1/c;", "Lfk0/o0;", "t", "(Ljb1/c;)Lfk0/o0;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180168a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.ON_GENERAL_TERMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.FLAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.LUMP_SUM_FROM_RECORDED_REVENUES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.NOT_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f180168a = iArr;
        }
    }

    private static final BEApplicationAccounting e(AccountingInput accountingInput) {
        return new BEApplicationAccounting(f(accountingInput.getDocumentationStorageAddress()), accountingInput.getTaxOfficeHeadName(), n(accountingInput.getTaxType()), accountingInput.getExternalOperatorName(), accountingInput.getExternalOperatorNip());
    }

    private static final BEApplicationAddress f(CompanyApplicationAddress companyApplicationAddress) {
        return new BEApplicationAddress(companyApplicationAddress.getBuildingNumber(), companyApplicationAddress.getCity(), companyApplicationAddress.getCommune(), companyApplicationAddress.getCounty(), companyApplicationAddress.getPostalCode(), companyApplicationAddress.getSimc(), companyApplicationAddress.getTerc(), companyApplicationAddress.getVoivodeship(), companyApplicationAddress.getApartmentNumber(), companyApplicationAddress.getStreetName(), companyApplicationAddress.getStreetPrefix(), companyApplicationAddress.getUlic());
    }

    private static final BEApplicationApplicantDetails g(ApplicantDetails applicantDetails) {
        return new BEApplicationApplicantDetails(applicantDetails.getBirthPlace(), applicantDetails.getFirstName(), applicantDetails.getMobileIdCardNumber(), applicantDetails.getPesel(), f(applicantDetails.getResidentialAddress()), applicantDetails.getSurname(), applicantDetails.getBirthDate(), applicantDetails.getFamilyName(), applicantDetails.getFatherName(), applicantDetails.getGender(), applicantDetails.getMotherName(), applicantDetails.getSecondName());
    }

    private static final BEApplicationAttachment h(StatementAttachment statementAttachment) {
        return new BEApplicationAttachment(statementAttachment.getContentBase64(), statementAttachment.getFileName(), statementAttachment.getFormat());
    }

    private static final BEApplicationCompanyDetails i(CompanyDetails companyDetails) {
        String abbreviatedName = companyDetails.getAbbreviatedName();
        BEApplicationAccounting bEApplicationAccountingE = e(companyDetails.getAccounting());
        List<String> listC = companyDetails.c();
        LocalDate activityCommencementDate = companyDetails.getActivityCommencementDate();
        BEApplicationContactDetails bEApplicationContactDetailsJ = j(companyDetails.getContactDetails());
        BEApplicationCorrespondence bEApplicationCorrespondenceK = k(companyDetails.getCorrespondenceData());
        BEApplicationElectronicDelivery bEApplicationElectronicDeliveryB = i.b(companyDetails.getElectronicDelivery());
        String fullName = companyDetails.getFullName();
        BEApplicationInsurance bEApplicationInsuranceL = l(companyDetails.getInsurance());
        String mainActivityCategoryCode = companyDetails.getMainActivityCategoryCode();
        int plannedNumberOfEmployees = companyDetails.getPlannedNumberOfEmployees();
        CompanyApplicationAddress companyActivityAddress = companyDetails.getCompanyActivityAddress();
        return new BEApplicationCompanyDetails(abbreviatedName, bEApplicationAccountingE, listC, activityCommencementDate, bEApplicationContactDetailsJ, bEApplicationCorrespondenceK, bEApplicationElectronicDeliveryB, fullName, bEApplicationInsuranceL, mainActivityCategoryCode, plannedNumberOfEmployees, companyActivityAddress != null ? f(companyActivityAddress) : null);
    }

    private static final BEApplicationContactDetails j(ContactDetailsInput contactDetailsInput) {
        return new BEApplicationContactDetails(contactDetailsInput.getConsentToPublishData(), contactDetailsInput.getEmail(), contactDetailsInput.getPublishEmailConsent(), contactDetailsInput.getPublishPhoneNumberConsent(), contactDetailsInput.getPublishWebAddressConsent(), contactDetailsInput.getPhoneNumber(), contactDetailsInput.getWebAddress());
    }

    private static final BEApplicationCorrespondence k(CorrespondenceInput correspondenceInput) {
        CompanyApplicationAddress correspondenceAddress = correspondenceInput.getCorrespondenceAddress();
        BEApplicationAddress bEApplicationAddressF = correspondenceAddress != null ? f(correspondenceAddress) : null;
        PostOfficeBoxAddress postOfficeBoxAddress = correspondenceInput.getPostOfficeBoxAddress();
        return new BEApplicationCorrespondence(bEApplicationAddressF, postOfficeBoxAddress != null ? m(postOfficeBoxAddress) : null, correspondenceInput.getRecipientName());
    }

    private static final BEApplicationInsurance l(InsuranceInput insuranceInput) {
        KrusInput krusInput = insuranceInput.getKrusInput();
        BEApplicationKrusInput bEApplicationKrusInputC = krusInput != null ? i.c(krusInput) : null;
        ZusInput zusInput = insuranceInput.getZusInput();
        return new BEApplicationInsurance(bEApplicationKrusInputC, zusInput != null ? o(zusInput) : null);
    }

    private static final BEApplicationPostOfficeBox m(PostOfficeBoxAddress postOfficeBoxAddress) {
        return new BEApplicationPostOfficeBox(postOfficeBoxAddress.getCity(), postOfficeBoxAddress.getNumber(), postOfficeBoxAddress.getPostalCode(), postOfficeBoxAddress.getPostOfficeName());
    }

    private static final fk0.n n(n nVar) {
        int i15 = a.f180168a[nVar.ordinal()];
        if (i15 == 1) {
            return fk0.n.ON_GENERAL_TERMS;
        }
        if (i15 == 2) {
            return fk0.n.FLAT;
        }
        if (i15 == 3) {
            return fk0.n.LUMP_SUM_FROM_RECORDED_REVENUES;
        }
        if (i15 == 4) {
            return fk0.n.NOT_DEFINED;
        }
        if (i15 == 5) {
            return fk0.n.UNKNOWN;
        }
        throw new p();
    }

    private static final BEApplicationZusInput o(ZusInput zusInput) {
        return new BEApplicationZusInput(zusInput.getPaymentStartDate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderApplication p(BEOrderApplicationResponse bEOrderApplicationResponse) {
        return new OrderApplication(bEOrderApplicationResponse.getExternalApplicationId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApplicationXml q(BEGenerateApplicationResponse bEGenerateApplicationResponse) {
        return new ApplicationXml(bEGenerateApplicationResponse.getApplicationXml());
    }

    private static final CompanyApplicationCitizenAddress r(BECitizenAddress bECitizenAddress) {
        return new CompanyApplicationCitizenAddress(bECitizenAddress.getSimc(), bECitizenAddress.getTerc(), bECitizenAddress.getApartmentNumber(), bECitizenAddress.getCity(), bECitizenAddress.getCommune(), bECitizenAddress.getCounty(), bECitizenAddress.getHouseNumber(), bECitizenAddress.getPostalCode(), bECitizenAddress.getStreetName(), bECitizenAddress.getStreetPrefix(), bECitizenAddress.getUlic(), bECitizenAddress.getVoivodeship());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompanyApplicationCitizenData s(BECitizenData bECitizenData) {
        String pesel = bECitizenData.getPesel();
        String birthDate = bECitizenData.getBirthDate();
        String birthPlace = bECitizenData.getBirthPlace();
        String citizenship = bECitizenData.getCitizenship();
        String familyName = bECitizenData.getFamilyName();
        String fatherName = bECitizenData.getFatherName();
        String firstName = bECitizenData.getFirstName();
        String gender = bECitizenData.getGender();
        String motherName = bECitizenData.getMotherName();
        BECitizenAddress permanentAddress = bECitizenData.getPermanentAddress();
        return new CompanyApplicationCitizenData(pesel, birthDate, birthPlace, citizenship, familyName, fatherName, firstName, gender, motherName, permanentAddress != null ? r(permanentAddress) : null, bECitizenData.getSecondName(), bECitizenData.getSurname());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEGenerateApplicationRequest t(CompanyApplication companyApplication) {
        ArrayList arrayList;
        BEApplicationApplicantDetails bEApplicationApplicantDetailsG = g(companyApplication.getApplicantDetails());
        BEApplicationCompanyDetails bEApplicationCompanyDetailsI = i(companyApplication.getCompanyDetails());
        List<StatementAttachment> listB = companyApplication.b();
        if (listB != null) {
            List<StatementAttachment> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(h((StatementAttachment) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new BEGenerateApplicationRequest(bEApplicationApplicantDetailsG, bEApplicationCompanyDetailsI, arrayList, companyApplication.getUseNewContactFormat());
    }
}
