package mj0;

import aj0.ElectronicCapabilityData;
import aj0.ElectronicCapabilityInfo;
import aj0.PersonalDocumentElectronicLayerSettingsInfo;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj0.CitizenAddressDto;
import nj0.CitizenDto;
import nj0.CitizenElectoralDataDto;
import nj0.DistrictDto;
import nj0.ElectionsAreaDto;
import nj0.ElectronicCapabilityResponseDto;
import nj0.PersonalDocumentElectronicLayerSettingsInfoDto;
import nj0.PersonalDocumentSignatureInfoDto;
import nj0.RegisteredAreaDto;
import nj0.ResidenceAddressDto;
import nj0.StatementDto;
import nj0.VoteRightDto;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import yi0.Citizen;
import yi0.CitizenAddress;
import yi0.CitizenElectoralData;
import yi0.District;
import yi0.ElectionsArea;
import yi0.RegisteredArea;
import yi0.ResidenceAddress;
import yi0.Statement;
import yi0.VoteRight;
import yi0.h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lnj0/f;", "Lyi0/b;", "g", "(Lnj0/f;)Lyi0/b;", "Lnj0/g;", "Lyi0/a;", "f", "(Lnj0/g;)Lyi0/a;", "Lnj0/k0;", "Lyi0/g;", "l", "(Lnj0/k0;)Lyi0/g;", "Lnj0/q;", "Laj0/a;", "a", "(Lnj0/q;)Laj0/a;", "Lnj0/g0;", "Laj0/b;", "b", "(Lnj0/g0;)Laj0/b;", "Lnj0/g0$a;", "Laj0/c;", "c", "(Lnj0/g0$a;)Laj0/c;", "Lnj0/f0;", "Laj0/d;", "d", "(Lnj0/f0;)Laj0/d;", "Lnj0/f0$a;", "Laj0/e;", "e", "(Lnj0/f0$a;)Laj0/e;", "Lnj0/h;", "Lyi0/c;", "h", "(Lnj0/h;)Lyi0/c;", "Lnj0/n0;", "Lyi0/j;", "o", "(Lnj0/n0;)Lyi0/j;", "Lnj0/n;", "Lyi0/d;", "i", "(Lnj0/n;)Lyi0/d;", "Lnj0/n0$a;", "Lyi0/h;", "m", "(Lnj0/n0$a;)Lyi0/h;", "Lnj0/l0;", "Lyi0/i;", "n", "(Lnj0/l0;)Lyi0/i;", "Lnj0/j0;", "Lyi0/f;", "k", "(Lnj0/j0;)Lyi0/f;", "Lnj0/p;", "Lyi0/e;", "j", "(Lnj0/p;)Lyi0/e;", "citizenservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f126720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f126721c;

        static {
            int[] iArr = new int[PersonalDocumentSignatureInfoDto.a.values().length];
            try {
                iArr[PersonalDocumentSignatureInfoDto.a.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalDocumentSignatureInfoDto.a.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PersonalDocumentSignatureInfoDto.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126719a = iArr;
            int[] iArr2 = new int[PersonalDocumentElectronicLayerSettingsInfoDto.a.values().length];
            try {
                iArr2[PersonalDocumentElectronicLayerSettingsInfoDto.a.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PersonalDocumentElectronicLayerSettingsInfoDto.a.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PersonalDocumentElectronicLayerSettingsInfoDto.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f126720b = iArr2;
            int[] iArr3 = new int[VoteRightDto.a.values().length];
            try {
                iArr3[VoteRightDto.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[VoteRightDto.a.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[VoteRightDto.a.MINOR_AGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f126721c = iArr3;
        }
    }

    public static final ElectronicCapabilityData a(ElectronicCapabilityResponseDto electronicCapabilityResponseDto) {
        return new ElectronicCapabilityData(b(electronicCapabilityResponseDto.getSignature()), d(electronicCapabilityResponseDto.getElectronicLayerSettings()));
    }

    public static final ElectronicCapabilityInfo b(PersonalDocumentSignatureInfoDto personalDocumentSignatureInfoDto) {
        return new ElectronicCapabilityInfo(personalDocumentSignatureInfoDto.getBlockedTitle(), personalDocumentSignatureInfoDto.getBlockedDescription(), null, c(personalDocumentSignatureInfoDto.getStatus()));
    }

    public static final aj0.c c(PersonalDocumentSignatureInfoDto.a aVar) {
        int i15 = a.f126719a[aVar.ordinal()];
        if (i15 == 1) {
            return aj0.c.AVAILABLE;
        }
        if (i15 == 2) {
            return aj0.c.BLOCKED;
        }
        if (i15 == 3) {
            return aj0.c.UNKNOWN;
        }
        throw new p();
    }

    public static final PersonalDocumentElectronicLayerSettingsInfo d(PersonalDocumentElectronicLayerSettingsInfoDto personalDocumentElectronicLayerSettingsInfoDto) {
        return new PersonalDocumentElectronicLayerSettingsInfo(e(personalDocumentElectronicLayerSettingsInfoDto.getStatus()), personalDocumentElectronicLayerSettingsInfoDto.getBlockedDescription(), personalDocumentElectronicLayerSettingsInfoDto.getBlockedTitle());
    }

    public static final aj0.e e(PersonalDocumentElectronicLayerSettingsInfoDto.a aVar) {
        int i15 = a.f126720b[aVar.ordinal()];
        if (i15 == 1) {
            return aj0.e.AVAILABLE;
        }
        if (i15 == 2) {
            return aj0.e.BLOCKED;
        }
        if (i15 == 3) {
            return aj0.e.UNKNOWN;
        }
        throw new p();
    }

    public static final Citizen f(CitizenDto citizenDto) {
        ArrayList arrayList;
        String additionalNames = citizenDto.getAdditionalNames();
        b0 b0VarG = additionalNames != null ? c0.g(additionalNames) : null;
        CitizenAddressDto address = citizenDto.getAddress();
        CitizenAddress citizenAddressG = address != null ? g(address) : null;
        LocalDate birthDate = citizenDto.getBirthDate();
        String citizenshipCode = citizenDto.getCitizenshipCode();
        String citizenshipDescription = citizenDto.getCitizenshipDescription();
        String documentNumber = citizenDto.getDocumentNumber();
        b0 b0VarG2 = documentNumber != null ? c0.g(documentNumber) : null;
        String documentType = citizenDto.getDocumentType();
        b0 b0VarG3 = documentType != null ? c0.g(documentType) : null;
        b0 b0VarG4 = c0.g(citizenDto.getFirstName());
        b0 b0VarG5 = c0.g(citizenDto.getLastName());
        b0 b0VarG6 = c0.g(citizenDto.getPesel());
        String registerCode = citizenDto.getRegisterCode();
        String registerName = citizenDto.getRegisterName();
        CitizenAddressDto registeredAddress = citizenDto.getRegisteredAddress();
        CitizenAddress citizenAddressG2 = registeredAddress != null ? g(registeredAddress) : null;
        List<ResidenceAddressDto> listN = citizenDto.n();
        if (listN != null) {
            List<ResidenceAddressDto> list = listN;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l((ResidenceAddressDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        String secondName = citizenDto.getSecondName();
        return new Citizen(b0VarG, citizenAddressG, birthDate, citizenshipCode, citizenshipDescription, b0VarG2, b0VarG3, b0VarG4, b0VarG5, b0VarG6, registerCode, registerName, citizenAddressG2, arrayList, secondName != null ? c0.g(secondName) : null);
    }

    public static final CitizenAddress g(CitizenAddressDto citizenAddressDto) {
        String street = citizenAddressDto.getStreet();
        b0 b0VarG = street != null ? c0.g(street) : null;
        String buildingNumber = citizenAddressDto.getBuildingNumber();
        b0 b0VarG2 = buildingNumber != null ? c0.g(buildingNumber) : null;
        String apartmentNumber = citizenAddressDto.getApartmentNumber();
        return new CitizenAddress(apartmentNumber != null ? c0.g(apartmentNumber) : null, b0VarG2, citizenAddressDto.getCity(), citizenAddressDto.getPostalCode(), b0VarG);
    }

    public static final CitizenElectoralData h(CitizenElectoralDataDto citizenElectoralDataDto) {
        ArrayList arrayList;
        Citizen citizenF = f(citizenElectoralDataDto.getCitizen());
        VoteRight voteRightO = o(citizenElectoralDataDto.getVoteRight());
        List<DistrictDto> listB = citizenElectoralDataDto.b();
        ArrayList arrayList2 = null;
        if (listB == null || !(!listB.isEmpty())) {
            arrayList = null;
        } else {
            List<DistrictDto> listB2 = citizenElectoralDataDto.b();
            arrayList = new ArrayList(v.y(listB2, 10));
            Iterator<T> it = listB2.iterator();
            while (it.hasNext()) {
                arrayList.add(i((DistrictDto) it.next()));
            }
        }
        RegisteredAreaDto registeredArea = citizenElectoralDataDto.getRegisteredArea();
        RegisteredArea registeredAreaK = registeredArea != null ? k(registeredArea) : null;
        List<ElectionsAreaDto> listC = citizenElectoralDataDto.c();
        if (listC != null && (!listC.isEmpty())) {
            List<ElectionsAreaDto> listC2 = citizenElectoralDataDto.c();
            arrayList2 = new ArrayList(v.y(listC2, 10));
            Iterator<T> it4 = listC2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(j((ElectionsAreaDto) it4.next()));
            }
        }
        return new CitizenElectoralData(citizenF, voteRightO, arrayList, registeredAreaK, arrayList2);
    }

    public static final District i(DistrictDto districtDto) {
        return new District(districtDto.getDistrictNumber(), districtDto.getElectionsType());
    }

    public static final ElectionsArea j(ElectionsAreaDto electionsAreaDto) {
        boolean changeVoteAreaAvailability = electionsAreaDto.getChangeVoteAreaAvailability();
        String commune = electionsAreaDto.getCommune();
        LocalDate electionsDate = electionsAreaDto.getElectionsDate();
        String electionsName = electionsAreaDto.getElectionsName();
        String number = electionsAreaDto.getNumber();
        CitizenAddress citizenAddressG = g(electionsAreaDto.getOkwAddress());
        String okwName = electionsAreaDto.getOkwName();
        CitizenAddressDto temporaryOkwAddress = electionsAreaDto.getTemporaryOkwAddress();
        return new ElectionsArea(changeVoteAreaAvailability, commune, electionsDate, electionsName, number, citizenAddressG, okwName, temporaryOkwAddress != null ? g(temporaryOkwAddress) : null, electionsAreaDto.getTemporaryOkwName());
    }

    public static final RegisteredArea k(RegisteredAreaDto registeredAreaDto) {
        return new RegisteredArea(registeredAreaDto.getCommune(), registeredAreaDto.getNumber(), g(registeredAreaDto.getOkwAddress()), registeredAreaDto.getOkwName());
    }

    public static final ResidenceAddress l(ResidenceAddressDto residenceAddressDto) {
        b0 b0VarG;
        String str;
        String apartmentNumber = residenceAddressDto.getApartmentNumber();
        b0 b0VarG2 = apartmentNumber != null ? c0.g(apartmentNumber) : null;
        String buildingNumber = residenceAddressDto.getBuildingNumber();
        b0 b0VarG3 = buildingNumber != null ? c0.g(buildingNumber) : null;
        String city = residenceAddressDto.getCity();
        b0 b0Var = b0VarG3;
        String country = residenceAddressDto.getCountry();
        String description = residenceAddressDto.getDescription();
        LocalDate electionsDate = residenceAddressDto.getElectionsDate();
        String electionsName = residenceAddressDto.getElectionsName();
        String foreignAddress = residenceAddressDto.getForeignAddress();
        b0 b0VarG4 = foreignAddress != null ? c0.g(foreignAddress) : null;
        String postalCode = residenceAddressDto.getPostalCode();
        String street = residenceAddressDto.getStreet();
        if (street != null) {
            str = postalCode;
            b0VarG = c0.g(street);
        } else {
            b0VarG = null;
            str = postalCode;
        }
        return new ResidenceAddress(b0VarG2, b0Var, city, country, description, electionsDate, electionsName, b0VarG4, str, b0VarG);
    }

    public static final h m(VoteRightDto.a aVar) {
        int i15 = a.f126721c[aVar.ordinal()];
        if (i15 == 1) {
            return h.ACTIVE;
        }
        if (i15 != 2) {
            return i15 != 3 ? h.UNKNOWN : h.MINOR_AGE;
        }
        return h.INACTIVE;
    }

    public static final Statement n(StatementDto statementDto) {
        return new Statement(statementDto.getCreationDate(), statementDto.getDeprivationPeriod(), statementDto.getFinalDate(), statementDto.getOrgan(), statementDto.getSignature());
    }

    public static final VoteRight o(VoteRightDto voteRightDto) {
        ArrayList arrayList;
        h hVarM = m(voteRightDto.getRightType());
        List<StatementDto> listB = voteRightDto.b();
        if (listB != null) {
            List<StatementDto> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n((StatementDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new VoteRight(hVarM, arrayList);
    }
}
