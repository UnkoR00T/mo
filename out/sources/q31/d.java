package q31;

import bl0.BEChildBirthChildData;
import bl0.BEChildBirthParents;
import bl0.BEChildBirthRegistration;
import bl0.BEChildBirthRegistrationApplicantAddress;
import bl0.BEChildBirthRegistrationInitial;
import bl0.g;
import bl0.m;
import bl0.s;
import g51.ReceiveDocumentAddressData;
import iy.b0;
import iy.c0;
import java.util.List;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormVMSSetupData;
import st3.AddressTerytDetail;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lbl0/i;", "Lst3/i$a;", "f", "(Lbl0/i;)Lst3/i$a;", "Lbl0/n;", "Lbl0/h$a;", "b", "(Lbl0/n;)Lbl0/h$a;", "Lu51/a$a;", "Lbl0/h;", "c", "(Lu51/a$a;)Lbl0/h;", "Lst3/b;", "Lbl0/h$c;", "e", "(Lst3/b;)Lbl0/h$c;", "Lst3/l;", "Lbl0/h$f;", "d", "(Lst3/l;)Lbl0/h$f;", "Liy/b0;", "Lst3/l$a;", "a", "(Liy/b0;)Ljava/lang/String;", "childbirthregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    private static final String a(b0 b0Var) {
        return AddressTerytDetail.a.a(c0.e(b0Var));
    }

    public static final BEChildBirthRegistration.BEApplicantData b(BEChildBirthRegistrationInitial bEChildBirthRegistrationInitial) {
        return new BEChildBirthRegistration.BEApplicantData(bEChildBirthRegistrationInitial.getBirth().getGender(), bEChildBirthRegistrationInitial.getBirth().getDate(), bEChildBirthRegistrationInitial.getBirth().getPlace(), bEChildBirthRegistrationInitial.getFamilyName(), bEChildBirthRegistrationInitial.getFirstName(), bEChildBirthRegistrationInitial.getNationality(), bEChildBirthRegistrationInitial.getPesel(), bEChildBirthRegistrationInitial.getSurname(), bEChildBirthRegistrationInitial.getNextNames(), bEChildBirthRegistrationInitial.getPermanentAddress(), bEChildBirthRegistrationInitial.getSecondName(), bEChildBirthRegistrationInitial.getTemporaryAddress(), bEChildBirthRegistrationInitial.getRequiredPeselDataChecksum(), null);
    }

    public static final BEChildBirthRegistration c(u51.a.Data data) {
        BEChildBirthRegistration.BEApplicantData applicantData = data.getApplicantData();
        BEChildBirthParents parentData = data.getParentData();
        List<BEChildBirthChildData> listD = data.d();
        bl0.d maritalStatusType = data.getMaritalStatusType();
        BEChildBirthRegistration.BETerytLocationXml bETerytLocationXmlD = d(data.getBirthPlaceCity().getProvince());
        BEChildBirthRegistration.BETerytLocationXml bETerytLocationXmlD2 = d(data.getBirthPlaceCity().getCounty());
        BEChildBirthRegistration.BETerytLocationXml bETerytLocationXmlD3 = d(data.getBirthPlaceCity().getCommunity());
        BEChildBirthRegistration.BETerytLocationXml bETerytLocationXmlD4 = d(data.getBirthPlaceCity().getCity());
        c41.a.InterfaceC0617a birthPlaceType = data.getBirthPlaceType();
        c41.a.InterfaceC0617a.MedicalCenter medicalCenter = birthPlaceType instanceof c41.a.InterfaceC0617a.MedicalCenter ? (c41.a.InterfaceC0617a.MedicalCenter) birthPlaceType : null;
        BEChildBirthRegistration.BEChildBirthPlace bEChildBirthPlace = new BEChildBirthRegistration.BEChildBirthPlace(bETerytLocationXmlD, bETerytLocationXmlD2, bETerytLocationXmlD3, bETerytLocationXmlD4, medicalCenter != null ? medicalCenter.getFacilityName() : null);
        g receivedDocumentsMethod = data.getReceivedDocumentsMethod();
        s typeAddressChild = data.getTypeAddressChild();
        m contactData = data.getContactData();
        BEChildBirthRegistration.BEChildRegisteredAddress bEChildRegisteredAddress = data.getRegisteredAddress() != null ? new BEChildBirthRegistration.BEChildRegisteredAddress(e(data.getRegisteredAddress().getAddressData()), data.getRegisteredAddress().getTemporaryAddressEndDate()) : null;
        ReceiveDocumentAddressData receiveDocumentAddress = data.getReceiveDocumentAddress();
        return new BEChildBirthRegistration(applicantData, parentData, listD, maritalStatusType, bEChildBirthPlace, receivedDocumentsMethod, typeAddressChild, contactData, bEChildRegisteredAddress, receiveDocumentAddress != null ? new BEChildBirthRegistration.BEReceiveDocumentAddress(receiveDocumentAddress.getName(), receiveDocumentAddress.getSurname(), e(receiveDocumentAddress.getAddress())) : null, data.getRegistrationOffice(), data.getEdorAddress());
    }

    private static final BEChildBirthRegistration.BETerytLocationXml d(AddressTerytDetail addressTerytDetail) {
        return new BEChildBirthRegistration.BETerytLocationXml(addressTerytDetail.getId(), addressTerytDetail.getName(), addressTerytDetail.getDescription());
    }

    private static final BEChildBirthRegistration.BEChildBirthRegistrationAddress e(AddressData addressData) {
        BEChildBirthRegistration.BETerytLocationXml bETerytLocationXmlD = d(addressData.getProvince());
        BEChildBirthRegistration.BETerytLocationXml bETerytLocationXmlD2 = d(addressData.getCity());
        BEChildBirthRegistration.BETerytLocationXml bETerytLocationXmlD3 = d(addressData.getCounty());
        AddressTerytDetail street = addressData.getStreet();
        BEChildBirthRegistration.BETerytLocationXml bETerytLocationXmlD4 = street != null ? d(street) : null;
        return new BEChildBirthRegistration.BEChildBirthRegistrationAddress(bETerytLocationXmlD, bETerytLocationXmlD3, d(addressData.getCommunity()), bETerytLocationXmlD2, c0.g(addressData.getPostalCode()), bETerytLocationXmlD4, c0.g(addressData.getBuildingNumber()), !(addressData.getApartmentNumber().length() == 0) ? c0.g(addressData.getApartmentNumber()) : null);
    }

    public static final AddressFormVMSSetupData.a f(BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress) {
        b0 voivodeshipId = bEChildBirthRegistrationApplicantAddress.getVoivodeshipId();
        String strA = voivodeshipId != null ? a(voivodeshipId) : null;
        b0 countyId = bEChildBirthRegistrationApplicantAddress.getCountyId();
        String strA2 = countyId != null ? a(countyId) : null;
        b0 communityId = bEChildBirthRegistrationApplicantAddress.getCommunityId();
        String strA3 = communityId != null ? a(communityId) : null;
        b0 cityId = bEChildBirthRegistrationApplicantAddress.getCityId();
        String strA4 = cityId != null ? a(cityId) : null;
        b0 postCode = bEChildBirthRegistrationApplicantAddress.getPostCode();
        String strE = postCode != null ? c0.e(postCode) : null;
        b0 streetId = bEChildBirthRegistrationApplicantAddress.getStreetId();
        String strA5 = streetId != null ? a(streetId) : null;
        b0 houseNumber = bEChildBirthRegistrationApplicantAddress.getHouseNumber();
        String strE2 = houseNumber != null ? c0.e(houseNumber) : null;
        b0 apartmentNumber = bEChildBirthRegistrationApplicantAddress.getApartmentNumber();
        return new AddressFormVMSSetupData.a(strA, strA2, strA3, strA4, strE, strA5, strE2, apartmentNumber != null ? c0.e(apartmentNumber) : null, null);
    }
}
