package sc4;

import fk0.BEApplicationAddress;
import fk0.BEApplicationAttachment;
import fk0.BEApplicationElectronicDelivery;
import fk0.BECompanyManagementEmail;
import fk0.BEGenerateApplicationResponse;
import fk0.BEManagementAccounting;
import fk0.BEManagementApplicantDetails;
import fk0.BEManagementCompanyDetails;
import fk0.BEManagementCompanyDetailsV2;
import fk0.BEManagementDetails;
import fk0.BEManagementInsurance;
import fk0.BEOrderApplicationResponse;
import fk0.BEResumptionRequest;
import fk0.BEResumptionRequestV2;
import fk0.BESuspensionPeriod;
import fk0.BESuspensionRequest;
import fk0.BESuspensionRequestV2;
import fk0.x0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.ElectronicDeliveryInput;
import jb1.InsuranceInput;
import jb1.KrusInput;
import jb1.OrderApplication;
import ld1.ApplicationXml;
import ld1.CompanyApplicationAddress;
import ld1.StatementAttachment;
import p071kotlin.Metadata;
import pf1.CompanyManagementApplication;
import pf1.ContactDetailsEmail;
import pf1.SuspensionApplicantDetails;
import pf1.SuspensionCompanyDetails;
import pf1.SuspensionManagementDetails;
import pq.v;
import qf1.SuspensionPeriod;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010%\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010)\u001a\u00020(*\u00020'H\u0002¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010,\u001a\u00020+*\u00020'H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u00020.*\u00020'H\u0002¢\u0006\u0004\b/\u00100\u001a\u0013\u00102\u001a\u000201*\u00020'H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Lfk0/p0;", "Lld1/a;", "u", "(Lfk0/p0;)Lld1/a;", "Lld1/c;", "Lfk0/b;", "g", "(Lld1/c;)Lfk0/b;", "Lpf1/d;", "Lfk0/s0;", "j", "(Lpf1/d;)Lfk0/s0;", "Lpf1/c;", "Lfk0/g1;", "q", "(Lpf1/c;)Lfk0/g1;", "Lpf1/f;", "Lfk0/v0;", "m", "(Lpf1/f;)Lfk0/v0;", "Ljb1/h;", "Lfk0/w0;", "n", "(Ljb1/h;)Lfk0/w0;", "Lpf1/e;", "Lfk0/t0;", "k", "(Lpf1/e;)Lfk0/t0;", "Lfk0/u0;", "l", "(Lpf1/e;)Lfk0/u0;", "Lpf1/b;", "Lfk0/d0;", "i", "(Lpf1/b;)Lfk0/d0;", "Lld1/n;", "Lfk0/d;", "h", "(Lld1/n;)Lfk0/d;", "Lpf1/a;", "Lfk0/c1;", "o", "(Lpf1/a;)Lfk0/c1;", "Lfk0/d1;", "p", "(Lpf1/a;)Lfk0/d1;", "Lfk0/h1;", "r", "(Lpf1/a;)Lfk0/h1;", "Lfk0/i1;", "s", "(Lpf1/a;)Lfk0/i1;", "Lfk0/z0;", "Ljb1/k;", "t", "(Lfk0/z0;)Ljb1/k;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final BEApplicationAddress g(CompanyApplicationAddress companyApplicationAddress) {
        return new BEApplicationAddress(companyApplicationAddress.getBuildingNumber(), companyApplicationAddress.getCity(), companyApplicationAddress.getCommune(), companyApplicationAddress.getCounty(), companyApplicationAddress.getPostalCode(), companyApplicationAddress.getSimc(), companyApplicationAddress.getTerc(), companyApplicationAddress.getVoivodeship(), companyApplicationAddress.getApartmentNumber(), companyApplicationAddress.getStreetName(), companyApplicationAddress.getStreetPrefix(), companyApplicationAddress.getUlic());
    }

    private static final BEApplicationAttachment h(StatementAttachment statementAttachment) {
        return new BEApplicationAttachment(statementAttachment.getContentBase64(), statementAttachment.getFileName(), statementAttachment.getFormat());
    }

    public static final BECompanyManagementEmail i(ContactDetailsEmail contactDetailsEmail) {
        return new BECompanyManagementEmail(contactDetailsEmail.getNoAddress(), contactDetailsEmail.getPublishConsent(), contactDetailsEmail.getEmail());
    }

    private static final BEManagementApplicantDetails j(SuspensionApplicantDetails suspensionApplicantDetails) {
        return new BEManagementApplicantDetails(suspensionApplicantDetails.getFirstName(), suspensionApplicantDetails.getPesel(), g(suspensionApplicantDetails.getResidentialAddress()), suspensionApplicantDetails.getSurname(), suspensionApplicantDetails.getBirthDate(), suspensionApplicantDetails.getGender(), suspensionApplicantDetails.getNip(), suspensionApplicantDetails.getRegon(), suspensionApplicantDetails.getSecondName());
    }

    private static final BEManagementCompanyDetails k(SuspensionCompanyDetails suspensionCompanyDetails) {
        BEManagementAccounting bEManagementAccounting = new BEManagementAccounting(suspensionCompanyDetails.getTaxOfficeHeadName());
        String entryId = suspensionCompanyDetails.getEntryId();
        String fullName = suspensionCompanyDetails.getFullName();
        BEManagementInsurance bEManagementInsuranceN = n(suspensionCompanyDetails.getInsurance());
        String abbreviatedName = suspensionCompanyDetails.getAbbreviatedName();
        List<String> listB = suspensionCompanyDetails.b();
        ElectronicDeliveryInput electronicDelivery = suspensionCompanyDetails.getElectronicDelivery();
        return new BEManagementCompanyDetails(bEManagementAccounting, entryId, fullName, bEManagementInsuranceN, abbreviatedName, listB, electronicDelivery != null ? i.b(electronicDelivery) : null, suspensionCompanyDetails.getMainActivityCategoryCode());
    }

    private static final BEManagementCompanyDetailsV2 l(SuspensionCompanyDetails suspensionCompanyDetails) {
        BEManagementAccounting bEManagementAccounting = new BEManagementAccounting(suspensionCompanyDetails.getTaxOfficeHeadName());
        String entryId = suspensionCompanyDetails.getEntryId();
        String fullName = suspensionCompanyDetails.getFullName();
        BEManagementInsurance bEManagementInsuranceN = n(suspensionCompanyDetails.getInsurance());
        String abbreviatedName = suspensionCompanyDetails.getAbbreviatedName();
        List<String> listB = suspensionCompanyDetails.b();
        ElectronicDeliveryInput electronicDelivery = suspensionCompanyDetails.getElectronicDelivery();
        BEApplicationElectronicDelivery bEApplicationElectronicDeliveryB = electronicDelivery != null ? i.b(electronicDelivery) : null;
        String mainActivityCategoryCode = suspensionCompanyDetails.getMainActivityCategoryCode();
        ContactDetailsEmail contactDetailsEmail = suspensionCompanyDetails.getContactDetailsEmail();
        return new BEManagementCompanyDetailsV2(bEManagementAccounting, entryId, fullName, bEManagementInsuranceN, abbreviatedName, listB, contactDetailsEmail != null ? i(contactDetailsEmail) : null, bEApplicationElectronicDeliveryB, mainActivityCategoryCode);
    }

    private static final BEManagementDetails m(SuspensionManagementDetails suspensionManagementDetails) {
        SuspensionPeriod changePeriod = suspensionManagementDetails.getChangePeriod();
        LocalDate from = changePeriod != null ? changePeriod.getFrom() : null;
        SuspensionPeriod changePeriod2 = suspensionManagementDetails.getChangePeriod();
        BESuspensionPeriod bESuspensionPeriod = new BESuspensionPeriod(from, changePeriod2 != null ? changePeriod2.getTo() : null);
        pf1.c currentSuspensionPeriod = suspensionManagementDetails.getCurrentSuspensionPeriod();
        return new BEManagementDetails(bESuspensionPeriod, currentSuspensionPeriod != null ? q(currentSuspensionPeriod) : null);
    }

    private static final BEManagementInsurance n(InsuranceInput insuranceInput) {
        x0 x0Var = insuranceInput.getKrusInput() == null ? x0.ZUS : x0.KRUS;
        KrusInput krusInput = insuranceInput.getKrusInput();
        return new BEManagementInsurance(x0Var, krusInput != null ? i.c(krusInput) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEResumptionRequest o(CompanyManagementApplication companyManagementApplication) {
        ArrayList arrayList;
        BEManagementApplicantDetails bEManagementApplicantDetailsJ = j(companyManagementApplication.getApplicantDetails());
        BEManagementDetails bEManagementDetailsM = m(companyManagementApplication.getManagementDetails());
        BEManagementCompanyDetails bEManagementCompanyDetailsK = k(companyManagementApplication.getCompanyDetails());
        List<StatementAttachment> listB = companyManagementApplication.b();
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
        return new BEResumptionRequest(bEManagementApplicantDetailsJ, bEManagementDetailsM, bEManagementCompanyDetailsK, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEResumptionRequestV2 p(CompanyManagementApplication companyManagementApplication) {
        ArrayList arrayList;
        BEManagementApplicantDetails bEManagementApplicantDetailsJ = j(companyManagementApplication.getApplicantDetails());
        BEManagementDetails bEManagementDetailsM = m(companyManagementApplication.getManagementDetails());
        BEManagementCompanyDetailsV2 bEManagementCompanyDetailsV2L = l(companyManagementApplication.getCompanyDetails());
        List<StatementAttachment> listB = companyManagementApplication.b();
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
        return new BEResumptionRequestV2(bEManagementApplicantDetailsJ, bEManagementDetailsM, bEManagementCompanyDetailsV2L, arrayList);
    }

    private static final BESuspensionPeriod q(pf1.c cVar) {
        return new BESuspensionPeriod(cVar.getFrom(), cVar.getTo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BESuspensionRequest r(CompanyManagementApplication companyManagementApplication) {
        ArrayList arrayList;
        BEManagementApplicantDetails bEManagementApplicantDetailsJ = j(companyManagementApplication.getApplicantDetails());
        BEManagementDetails bEManagementDetailsM = m(companyManagementApplication.getManagementDetails());
        BEManagementCompanyDetails bEManagementCompanyDetailsK = k(companyManagementApplication.getCompanyDetails());
        List<StatementAttachment> listB = companyManagementApplication.b();
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
        return new BESuspensionRequest(bEManagementApplicantDetailsJ, bEManagementDetailsM, bEManagementCompanyDetailsK, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BESuspensionRequestV2 s(CompanyManagementApplication companyManagementApplication) {
        ArrayList arrayList;
        BEManagementApplicantDetails bEManagementApplicantDetailsJ = j(companyManagementApplication.getApplicantDetails());
        BEManagementDetails bEManagementDetailsM = m(companyManagementApplication.getManagementDetails());
        BEManagementCompanyDetailsV2 bEManagementCompanyDetailsV2L = l(companyManagementApplication.getCompanyDetails());
        List<StatementAttachment> listB = companyManagementApplication.b();
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
        return new BESuspensionRequestV2(bEManagementApplicantDetailsJ, bEManagementDetailsM, bEManagementCompanyDetailsV2L, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderApplication t(BEOrderApplicationResponse bEOrderApplicationResponse) {
        return new OrderApplication(bEOrderApplicationResponse.getExternalApplicationId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApplicationXml u(BEGenerateApplicationResponse bEGenerateApplicationResponse) {
        return new ApplicationXml(bEGenerateApplicationResponse.getApplicationXml());
    }
}
