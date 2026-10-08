package t34;

import er0.g;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import jr0.HeaderContainer;
import jr0.MnemonicHeaderContainer;
import jr0.MobileIdCardContainer;
import jr0.MobileIdCardPersonalDataContainer;
import jr0.PersonalAddressContainer;
import jr0.PersonalDataContainer;
import jr0.PersonalDataScope8;
import jr0.PersonalDataScope8DataContainer;
import jr0.PersonalDataScope9;
import jr0.PersonalDataScope9DataContainer;
import jr0.PersonalIdCardContainer;
import jr0.r;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.HeaderContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.MnemonicHeaderContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.MobileIdCardContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.MobileIdCardPersonalDataContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalAddressContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope4DataContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope8DataContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope8Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope9DataContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope9Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalIdCardContainerDto;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8Dto;", "Ljr0/m;", "i", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8Dto;)Ljr0/m;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8DataContainerDto;", "Ljr0/n;", "j", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8DataContainerDto;)Ljr0/n;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardPersonalDataContainerDto;", "Ljr0/h;", "f", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardPersonalDataContainerDto;)Ljr0/h;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope9Dto;", "Ljr0/o;", "k", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope9Dto;)Ljr0/o;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope9DataContainerDto;", "Ljr0/p;", "l", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope9DataContainerDto;)Ljr0/p;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto;", "Ljr0/l;", "h", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto;)Ljr0/l;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalAddressContainerDto;", "Ljr0/k;", "g", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalAddressContainerDto;)Ljr0/k;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto;", "Ljr0/q;", "m", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto;)Ljr0/q;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto$Status;", "Ljr0/r;", "n", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto$Status;)Ljr0/r;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto$Gender;", "Ler0/g;", "a", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto$Gender;)Ler0/g;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto;", "Ljr0/e;", "c", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto;)Ljr0/e;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto$DocumentType;", "Ljr0/b;", "b", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto$DocumentType;)Ljr0/b;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;", "Ljr0/f;", "d", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;)Ljr0/f;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;", "Ljr0/g;", "e", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;)Ljr0/g;", "documents_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f187594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f187595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f187596d;

        static {
            int[] iArr = new int[PersonalIdCardContainerDto.Status.values().length];
            try {
                iArr[PersonalIdCardContainerDto.Status.NOT_ISSUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalIdCardContainerDto.Status.ISSUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PersonalIdCardContainerDto.Status.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PersonalIdCardContainerDto.Status.SUSPENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PersonalIdCardContainerDto.Status.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f187593a = iArr;
            int[] iArr2 = new int[PersonalDataContainerDto.Gender.values().length];
            try {
                iArr2[PersonalDataContainerDto.Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PersonalDataContainerDto.Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PersonalDataContainerDto.Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f187594b = iArr2;
            int[] iArr3 = new int[PersonalDataScope4DataContainerDto.Sex.values().length];
            try {
                iArr3[PersonalDataScope4DataContainerDto.Sex.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PersonalDataScope4DataContainerDto.Sex.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PersonalDataScope4DataContainerDto.Sex.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f187595c = iArr3;
            int[] iArr4 = new int[HeaderContainerDto.DocumentType.values().length];
            try {
                iArr4[HeaderContainerDto.DocumentType.MOBILE_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[HeaderContainerDto.DocumentType.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[HeaderContainerDto.DocumentType.TEMPORARY_DRIVING_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[HeaderContainerDto.DocumentType.DEPUTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[HeaderContainerDto.DocumentType.NURSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[HeaderContainerDto.DocumentType.MIDWIFE.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[HeaderContainerDto.DocumentType.PENSIONER.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[HeaderContainerDto.DocumentType.DOCTOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            f187596d = iArr4;
        }
    }

    public static final g a(PersonalDataContainerDto.Gender gender) {
        int i15 = a.f187594b[gender.ordinal()];
        if (i15 == 1) {
            return g.MALE;
        }
        if (i15 == 2) {
            return g.FEMALE;
        }
        if (i15 == 3) {
            return g.DEFAULT;
        }
        throw new p();
    }

    public static final jr0.b b(HeaderContainerDto.DocumentType documentType) {
        switch (a.f187596d[documentType.ordinal()]) {
            case 1:
                return jr0.b.MOBILE_ID_CARD;
            case 2:
                return jr0.b.DRIVING_LICENCE;
            case 3:
                return jr0.b.TEMPORARY_DRIVING_LICENCE;
            case 4:
                return jr0.b.DEPUTY;
            case 5:
                return jr0.b.NURSE;
            case 6:
                return jr0.b.MIDWIFE;
            case 7:
                return jr0.b.PENSIONER;
            case 8:
                return jr0.b.DOCTOR;
            default:
                return jr0.b.UNKNOWN;
        }
    }

    public static final HeaderContainer c(HeaderContainerDto headerContainerDto) {
        return new HeaderContainer(headerContainerDto.getPesel(), headerContainerDto.getInternalDocumentId(), headerContainerDto.getVersion(), b(headerContainerDto.getDocumentType()), headerContainerDto.getDocumentVersion(), headerContainerDto.getCertificateSubjectDn(), headerContainerDto.getCertificateSerialNumber(), headerContainerDto.getCertificateIssuerDn(), headerContainerDto.getCreationTimestamp(), headerContainerDto.getDocumentIssuer(), headerContainerDto.getDocumentSubtype());
    }

    public static final MnemonicHeaderContainer d(MnemonicHeaderContainerDto mnemonicHeaderContainerDto) {
        return new MnemonicHeaderContainer(mnemonicHeaderContainerDto.getTp(), mnemonicHeaderContainerDto.getStp(), mnemonicHeaderContainerDto.getVer(), mnemonicHeaderContainerDto.getDn(), mnemonicHeaderContainerDto.getSn(), mnemonicHeaderContainerDto.getIsr(), mnemonicHeaderContainerDto.getTs(), mnemonicHeaderContainerDto.getRId(), mnemonicHeaderContainerDto.getIid(), c0.g(mnemonicHeaderContainerDto.getPe()), mnemonicHeaderContainerDto.getIn(), mnemonicHeaderContainerDto.getId());
    }

    public static final MobileIdCardContainer e(MobileIdCardContainerDto mobileIdCardContainerDto) {
        return new MobileIdCardContainer(mobileIdCardContainerDto.getNumber(), mobileIdCardContainerDto.getValidFrom(), mobileIdCardContainerDto.getValidTo());
    }

    public static final MobileIdCardPersonalDataContainer f(MobileIdCardPersonalDataContainerDto mobileIdCardPersonalDataContainerDto) {
        return new MobileIdCardPersonalDataContainer(mobileIdCardPersonalDataContainerDto.getName(), mobileIdCardPersonalDataContainerDto.getSurname(), mobileIdCardPersonalDataContainerDto.getFatherName(), mobileIdCardPersonalDataContainerDto.getMotherName(), mobileIdCardPersonalDataContainerDto.getPesel(), mobileIdCardPersonalDataContainerDto.getBirthDate(), mobileIdCardPersonalDataContainerDto.getCitizenship(), mobileIdCardPersonalDataContainerDto.getPicture(), mobileIdCardPersonalDataContainerDto.getSecondName());
    }

    public static final PersonalAddressContainer g(PersonalAddressContainerDto personalAddressContainerDto) {
        String streetPrefix = personalAddressContainerDto.getStreetPrefix();
        b0 b0VarG = streetPrefix != null ? c0.g(streetPrefix) : null;
        String streetName = personalAddressContainerDto.getStreetName();
        b0 b0VarG2 = streetName != null ? c0.g(streetName) : null;
        String houseNumber = personalAddressContainerDto.getHouseNumber();
        b0 b0VarG3 = houseNumber != null ? c0.g(houseNumber) : null;
        String postalCode = personalAddressContainerDto.getPostalCode();
        b0 b0VarG4 = postalCode != null ? c0.g(postalCode) : null;
        String localityTerritoryCode = personalAddressContainerDto.getLocalityTerritoryCode();
        b0 b0VarG5 = localityTerritoryCode != null ? c0.g(localityTerritoryCode) : null;
        String locality = personalAddressContainerDto.getLocality();
        b0 b0VarG6 = locality != null ? c0.g(locality) : null;
        String municipality = personalAddressContainerDto.getMunicipality();
        b0 b0VarG7 = municipality != null ? c0.g(municipality) : null;
        String voivodeship = personalAddressContainerDto.getVoivodeship();
        b0 b0VarG8 = voivodeship != null ? c0.g(voivodeship) : null;
        LocalDate permanentAddressRegistrationDate = personalAddressContainerDto.getPermanentAddressRegistrationDate();
        String apartmentNumber = personalAddressContainerDto.getApartmentNumber();
        return new PersonalAddressContainer(b0VarG, b0VarG2, b0VarG3, b0VarG4, b0VarG5, b0VarG6, b0VarG7, b0VarG8, permanentAddressRegistrationDate, apartmentNumber != null ? c0.g(apartmentNumber) : null);
    }

    public static final PersonalDataContainer h(PersonalDataContainerDto personalDataContainerDto) {
        b0 b0VarG = c0.g(personalDataContainerDto.getName());
        String secondName = personalDataContainerDto.getSecondName();
        b0 b0VarG2 = secondName != null ? c0.g(secondName) : null;
        b0 b0VarG3 = c0.g(personalDataContainerDto.getSurname());
        String familyName = personalDataContainerDto.getFamilyName();
        b0 b0VarG4 = familyName != null ? c0.g(familyName) : null;
        b0 b0VarG5 = c0.g(personalDataContainerDto.getFatherName());
        String fatherFamilySurname = personalDataContainerDto.getFatherFamilySurname();
        b0 b0VarG6 = fatherFamilySurname != null ? c0.g(fatherFamilySurname) : null;
        b0 b0VarG7 = c0.g(personalDataContainerDto.getMotherName());
        String motherFamilySurname = personalDataContainerDto.getMotherFamilySurname();
        b0 b0VarG8 = motherFamilySurname != null ? c0.g(motherFamilySurname) : null;
        b0 b0VarG9 = c0.g(personalDataContainerDto.getPesel());
        b0 b0Var = b0VarG4;
        b0 b0Var2 = b0VarG6;
        b0 b0Var3 = b0VarG8;
        LocalDate birthDate = personalDataContainerDto.getBirthDate();
        String birthPlace = personalDataContainerDto.getBirthPlace();
        PersonalAddressContainer personalAddressContainerG = null;
        String birthCountry = personalDataContainerDto.getBirthCountry();
        PersonalDataContainerDto.Gender gender = personalDataContainerDto.getGender();
        g gVarA = gender != null ? a(gender) : null;
        String citizenship = personalDataContainerDto.getCitizenship();
        PersonalAddressContainerDto permanentAddress = personalDataContainerDto.getPermanentAddress();
        if (permanentAddress != null) {
            personalAddressContainerG = g(permanentAddress);
        }
        return new PersonalDataContainer(b0VarG, b0VarG2, b0VarG3, b0Var, b0VarG5, b0Var2, b0VarG7, b0Var3, b0VarG9, birthDate, birthPlace, birthCountry, gVarA, citizenship, personalAddressContainerG);
    }

    public static final PersonalDataScope8 i(PersonalDataScope8Dto personalDataScope8Dto) {
        return new PersonalDataScope8(c(personalDataScope8Dto.getHeader()), j(personalDataScope8Dto.getData()));
    }

    public static final PersonalDataScope8DataContainer j(PersonalDataScope8DataContainerDto personalDataScope8DataContainerDto) {
        return new PersonalDataScope8DataContainer(e(personalDataScope8DataContainerDto.getMobileIdCard()), f(personalDataScope8DataContainerDto.getPersonalData()));
    }

    public static final PersonalDataScope9 k(PersonalDataScope9Dto personalDataScope9Dto) {
        return new PersonalDataScope9(c(personalDataScope9Dto.getHeader()), d(personalDataScope9Dto.getDh()), l(personalDataScope9Dto.getData()));
    }

    public static final PersonalDataScope9DataContainer l(PersonalDataScope9DataContainerDto personalDataScope9DataContainerDto) {
        return new PersonalDataScope9DataContainer(e(personalDataScope9DataContainerDto.getMobileIdCard()), h(personalDataScope9DataContainerDto.getPersonalData()), m(personalDataScope9DataContainerDto.getPersonalIdCard()));
    }

    public static final PersonalIdCardContainer m(PersonalIdCardContainerDto personalIdCardContainerDto) {
        r rVarN;
        b0 b0VarG = c0.g(personalIdCardContainerDto.getPicture());
        String number = personalIdCardContainerDto.getNumber();
        String issuer = personalIdCardContainerDto.getIssuer();
        LocalDate validTo = personalIdCardContainerDto.getValidTo();
        LocalDate creationDate = personalIdCardContainerDto.getCreationDate();
        LocalDate suspensionDate = personalIdCardContainerDto.getSuspensionDate();
        LocalDate revocationDate = personalIdCardContainerDto.getRevocationDate();
        PersonalIdCardContainerDto.Status status = personalIdCardContainerDto.getStatus();
        if (status == null || (rVarN = n(status)) == null) {
            rVarN = r.UNKNOWN;
        }
        return new PersonalIdCardContainer(b0VarG, number, issuer, validTo, creationDate, suspensionDate, revocationDate, rVarN);
    }

    public static final r n(PersonalIdCardContainerDto.Status status) {
        int i15 = a.f187593a[status.ordinal()];
        if (i15 == 1) {
            return r.NOT_ISSUED;
        }
        if (i15 == 2) {
            return r.ISSUED;
        }
        if (i15 == 3) {
            return r.REVOKED;
        }
        if (i15 == 4) {
            return r.SUSPENDED;
        }
        if (i15 == 5) {
            return r.UNKNOWN;
        }
        throw new p();
    }
}
