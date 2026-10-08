package xl0;

import al0.ApplicantDataModel;
import al0.ApplicantDataResultData;
import al0.ApplicationReason;
import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.BEGenerateXmlResponse;
import al0.ChildData;
import al0.DMSTerytDetail;
import fu.r;
import gm0.AddressDataDto;
import gm0.ApplicationReasonDto;
import gm0.ApplicationReasonInfoTipDto;
import gm0.ContactDetailsDto;
import gm0.PersonalDataDto;
import gm0.PhoneContactDetailDto;
import gm0.PhysicalIdCardApplicationChildDataRequest;
import gm0.PhysicalIdCardApplicationInitResponse;
import gm0.PhysicalIdCardXmlApplicationV4Response;
import gm0.g2;
import iy.c0;
import java.time.LocalDate;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010(\u001a\u00020'*\u00020&¢\u0006\u0004\b(\u0010)\u001a\u0011\u0010*\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u00020\u001a*\u00020\u0017¢\u0006\u0004\b4\u00105¨\u00066"}, d2 = {"Lgm0/u5;", "Lal0/e;", "c", "(Lgm0/u5;)Lal0/e;", "Lgm0/g2;", "Lal0/e$a;", "b", "(Lgm0/g2;)Lal0/e$a;", "Lgm0/x6;", "Ldx/i;", "Ldx/b;", "Lal0/m;", "h", "(Lgm0/x6;)Ldx/i;", "Lal0/u;", "Lgm0/t5;", "n", "(Lal0/u;)Lgm0/t5;", "Lal0/g;", "Lgm0/c;", "a", "(Lal0/g;)Lgm0/c;", "Lgm0/f;", "Lal0/h;", "g", "(Lgm0/f;)Lal0/h;", "Lgm0/i;", "Lal0/h$b;", "f", "(Lgm0/i;)Lal0/h$b;", "Lgm0/g;", "Lal0/h$a;", "e", "(Lgm0/g;)Lal0/h$a;", "Lgm0/h;", "Lal0/h$a$a;", "d", "(Lgm0/h;)Lal0/h$a$a;", "Lal0/f;", "Lgm0/r5;", "m", "(Lal0/f;)Lgm0/r5;", "l", "(Lal0/e$a;)Lgm0/g2;", "Lal0/j;", "Lgm0/u1;", "k", "(Lal0/j;)Lgm0/u1;", "Lal0/k;", "Lgm0/a;", "i", "(Lal0/k;)Lgm0/a;", "j", "(Lal0/h;)Lgm0/i;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f219286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f219287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f219288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f219289e;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g2.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f219285a = iArr;
            int[] iArr2 = new int[gm0.i.values().length];
            try {
                iArr2[gm0.i.FIRST_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[gm0.i.CHANGE_OF_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[gm0.i.EXPIRY_OF_VALIDITY_PERIOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[gm0.i.EXPIRY_OF_SUSPENSION_PERIOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[gm0.i.LOSS_OF_DOCUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[gm0.i.CHANGE_OF_FACIAL_APPEARANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[gm0.i.DOCUMENT_DAMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[gm0.i.REPLACEMENT_OF_DOCUMENT_WITHOUT_ELECTRONIC_LAYER.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[gm0.i.INABILITY_TO_IDENTIFY_OR_AUTHENTICATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[gm0.i.LACK_OF_CERTIFICATE_FOR_IDENTIFICATION_OR_SIGNATURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[gm0.i.IDENTITY_THEFT.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[gm0.i.REPLACEMENT_OF_DOCUMENT_WITHOUT_FINGERPRINTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[gm0.i.COMPLAINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[gm0.i.OTHER.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[gm0.i.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            f219286b = iArr2;
            int[] iArr3 = new int[gm0.h.values().length];
            try {
                iArr3[gm0.h.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[gm0.h.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            f219287c = iArr3;
            int[] iArr4 = new int[ApplicantDataModel.a.values().length];
            try {
                iArr4[ApplicantDataModel.a.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[ApplicantDataModel.a.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[ApplicantDataModel.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            f219288d = iArr4;
            int[] iArr5 = new int[ApplicationReason.b.values().length];
            try {
                iArr5[ApplicationReason.b.FIRST_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[ApplicationReason.b.CHANGE_OF_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[ApplicationReason.b.EXPIRY_OF_VALIDITY_PERIOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[ApplicationReason.b.EXPIRY_OF_SUSPENSION_PERIOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[ApplicationReason.b.LOSS_OF_DOCUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[ApplicationReason.b.CHANGE_OF_FACIAL_APPEARANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[ApplicationReason.b.DOCUMENT_DAMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[ApplicationReason.b.REPLACEMENT_OF_DOCUMENT_WITHOUT_ELECTRONIC_LAYER.ordinal()] = 8;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[ApplicationReason.b.INABILITY_TO_IDENTIFY_OR_AUTHENTICATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[ApplicationReason.b.LACK_OF_CERTIFICATE_FOR_IDENTIFICATION_OR_SIGNATURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[ApplicationReason.b.IDENTITY_THEFT.ordinal()] = 11;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[ApplicationReason.b.REPLACEMENT_OF_DOCUMENT_WITHOUT_FINGERPRINTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[ApplicationReason.b.COMPLAINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[ApplicationReason.b.OTHER.ordinal()] = 14;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[ApplicationReason.b.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused38) {
            }
            f219289e = iArr5;
        }
    }

    public static final gm0.c a(al0.g gVar) {
        if (gVar instanceof al0.g.b) {
            return gm0.c.ADULT;
        }
        if (gVar instanceof al0.g.Child) {
            al0.g.Child child = (al0.g.Child) gVar;
            if (child.getAge() == 12) {
                return gm0.c.CHILD_BETWEEN_12_13;
            }
            return child.getAge() < 12 ? gm0.c.CHILD_UNDER_12 : gm0.c.CHILD_ABOVE_13;
        }
        if (!(gVar instanceof al0.g.Ward)) {
            throw new p();
        }
        al0.g.Ward ward = (al0.g.Ward) gVar;
        if (ward.getAge() == 12) {
            return gm0.c.CHILD_BETWEEN_12_13;
        }
        return ward.getIsElectronicSignatureRequired() ? gm0.c.CHILD_ABOVE_13 : gm0.c.CHILD_UNDER_12;
    }

    public static final ApplicantDataModel.a b(g2 g2Var) {
        int i15 = a.f219285a[g2Var.ordinal()];
        if (i15 == 1) {
            return ApplicantDataModel.a.MALE;
        }
        if (i15 == 2) {
            return ApplicantDataModel.a.FEMALE;
        }
        if (i15 == 3) {
            return ApplicantDataModel.a.UNKNOWN;
        }
        throw new p();
    }

    public static final ApplicantDataModel c(PhysicalIdCardApplicationInitResponse physicalIdCardApplicationInitResponse) {
        return new ApplicantDataModel(physicalIdCardApplicationInitResponse.getPersonalId(), physicalIdCardApplicationInitResponse.getFirstName(), physicalIdCardApplicationInitResponse.getSurname(), physicalIdCardApplicationInitResponse.getMaidenName(), c0.g(physicalIdCardApplicationInitResponse.getPesel()), b(physicalIdCardApplicationInitResponse.getGender()), physicalIdCardApplicationInitResponse.getPlaceOfBirth(), physicalIdCardApplicationInitResponse.getDateOfBirth(), physicalIdCardApplicationInitResponse.getNationality(), physicalIdCardApplicationInitResponse.getFathersName(), physicalIdCardApplicationInitResponse.getMothersName(), physicalIdCardApplicationInitResponse.getMothersMaidenName(), physicalIdCardApplicationInitResponse.getSecondName());
    }

    private static final ApplicationReason.InfoTip.EnumC0167a d(gm0.h hVar) {
        int i15 = a.f219287c[hVar.ordinal()];
        if (i15 == 1) {
            return ApplicationReason.InfoTip.EnumC0167a.WARNING;
        }
        if (i15 == 2) {
            return ApplicationReason.InfoTip.EnumC0167a.UNKNOWN;
        }
        throw new p();
    }

    private static final ApplicationReason.InfoTip e(ApplicationReasonInfoTipDto applicationReasonInfoTipDto) {
        return new ApplicationReason.InfoTip(applicationReasonInfoTipDto.getDescription(), applicationReasonInfoTipDto.getLink(), applicationReasonInfoTipDto.getLinkLabel(), d(applicationReasonInfoTipDto.getType()));
    }

    private static final ApplicationReason.b f(gm0.i iVar) {
        switch (a.f219286b[iVar.ordinal()]) {
            case 1:
                return ApplicationReason.b.FIRST_ID_CARD;
            case 2:
                return ApplicationReason.b.CHANGE_OF_DATA;
            case 3:
                return ApplicationReason.b.EXPIRY_OF_VALIDITY_PERIOD;
            case 4:
                return ApplicationReason.b.EXPIRY_OF_SUSPENSION_PERIOD;
            case 5:
                return ApplicationReason.b.LOSS_OF_DOCUMENT;
            case 6:
                return ApplicationReason.b.CHANGE_OF_FACIAL_APPEARANCE;
            case 7:
                return ApplicationReason.b.DOCUMENT_DAMAGE;
            case 8:
                return ApplicationReason.b.REPLACEMENT_OF_DOCUMENT_WITHOUT_ELECTRONIC_LAYER;
            case 9:
                return ApplicationReason.b.INABILITY_TO_IDENTIFY_OR_AUTHENTICATE;
            case 10:
                return ApplicationReason.b.LACK_OF_CERTIFICATE_FOR_IDENTIFICATION_OR_SIGNATURE;
            case 11:
                return ApplicationReason.b.IDENTITY_THEFT;
            case 12:
                return ApplicationReason.b.REPLACEMENT_OF_DOCUMENT_WITHOUT_FINGERPRINTS;
            case 13:
                return ApplicationReason.b.COMPLAINT;
            case 14:
                return ApplicationReason.b.OTHER;
            case 15:
                return ApplicationReason.b.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final ApplicationReason g(ApplicationReasonDto applicationReasonDto) {
        String description = applicationReasonDto.getDescription();
        ApplicationReason.b bVarF = f(applicationReasonDto.getType());
        ApplicationReasonInfoTipDto applicationReasonInfoTip = applicationReasonDto.getApplicationReasonInfoTip();
        return new ApplicationReason(description, bVarF, applicationReasonInfoTip != null ? e(applicationReasonInfoTip) : null);
    }

    public static final dx.i<dx.b, BEGenerateXmlResponse> h(PhysicalIdCardXmlApplicationV4Response physicalIdCardXmlApplicationV4Response) {
        dx.i iVarD = dm0.a.d(physicalIdCardXmlApplicationV4Response.b());
        if (iVarD instanceof dx.i.Left) {
            return iVarD;
        }
        if (!(iVarD instanceof dx.i.Right)) {
            throw new p();
        }
        return new dx.i.Right(new BEGenerateXmlResponse(ry.a.b(c0.g(physicalIdCardXmlApplicationV4Response.getDocument())), (List) ((dx.i.Right) iVarD).b(), null));
    }

    public static final AddressDataDto i(BECorrespondenceAddressData bECorrespondenceAddressData) {
        String name = bECorrespondenceAddressData.getProvince().getName();
        String name2 = bECorrespondenceAddressData.getCounty().getName();
        String name3 = bECorrespondenceAddressData.getCommunity().getName();
        String name4 = bECorrespondenceAddressData.getCity().getName();
        DMSTerytDetail street = bECorrespondenceAddressData.getStreet();
        return new AddressDataDto(name4, name3, name2, bECorrespondenceAddressData.getBuildingNumber(), bECorrespondenceAddressData.getPostalCode(), name, bECorrespondenceAddressData.getApartmentNumber(), street != null ? street.getName() : null);
    }

    public static final gm0.i j(ApplicationReason applicationReason) {
        switch (a.f219289e[applicationReason.getType().ordinal()]) {
            case 1:
                return gm0.i.FIRST_ID_CARD;
            case 2:
                return gm0.i.CHANGE_OF_DATA;
            case 3:
                return gm0.i.EXPIRY_OF_VALIDITY_PERIOD;
            case 4:
                return gm0.i.EXPIRY_OF_SUSPENSION_PERIOD;
            case 5:
                return gm0.i.LOSS_OF_DOCUMENT;
            case 6:
                return gm0.i.CHANGE_OF_FACIAL_APPEARANCE;
            case 7:
                return gm0.i.DOCUMENT_DAMAGE;
            case 8:
                return gm0.i.REPLACEMENT_OF_DOCUMENT_WITHOUT_ELECTRONIC_LAYER;
            case 9:
                return gm0.i.INABILITY_TO_IDENTIFY_OR_AUTHENTICATE;
            case 10:
                return gm0.i.LACK_OF_CERTIFICATE_FOR_IDENTIFICATION_OR_SIGNATURE;
            case 11:
                return gm0.i.IDENTITY_THEFT;
            case 12:
                return gm0.i.REPLACEMENT_OF_DOCUMENT_WITHOUT_FINGERPRINTS;
            case 13:
                return gm0.i.COMPLAINT;
            case 14:
                return gm0.i.OTHER;
            case 15:
                return gm0.i.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final ContactDetailsDto k(BEContactDetailsData bEContactDetailsData) {
        String strE = c0.e(bEContactDetailsData.getEmailAddress());
        PhoneContactDetailDto phoneContactDetailDto = null;
        if (r.t0(strE)) {
            strE = null;
        }
        String strE2 = c0.e(bEContactDetailsData.getPhoneNumber().g());
        if (r.t0(strE2)) {
            strE2 = null;
        }
        if (strE2 != null) {
            phoneContactDetailDto = new PhoneContactDetailDto(c0.e(bEContactDetailsData.getPhoneNumber().g()), c0.e(bEContactDetailsData.getPhoneNumber().h()));
        }
        return new ContactDetailsDto(strE, phoneContactDetailDto);
    }

    public static final g2 l(ApplicantDataModel.a aVar) {
        int i15 = a.f219288d[aVar.ordinal()];
        if (i15 == 1) {
            return g2.MALE;
        }
        if (i15 == 2) {
            return g2.FEMALE;
        }
        if (i15 == 3) {
            return g2.UNKNOWN;
        }
        throw new p();
    }

    public static final PersonalDataDto m(ApplicantDataResultData applicantDataResultData) {
        String personalId = applicantDataResultData.getPersonalId();
        String firstName = applicantDataResultData.getBasicInfo().getFirstName();
        String surname = applicantDataResultData.getBasicInfo().getSurname();
        String familyName = applicantDataResultData.getBasicInfo().getFamilyName();
        String strE = c0.e(applicantDataResultData.getBasicInfo().getPesel());
        g2 g2VarL = l(applicantDataResultData.getBasicInfo().getGender());
        String placeOfBirth = applicantDataResultData.getBasicInfo().getPlaceOfBirth();
        LocalDate dateOfBirth = applicantDataResultData.getBasicInfo().getDateOfBirth();
        String nationality = applicantDataResultData.getBasicInfo().getNationality();
        return new PersonalDataDto(dateOfBirth, applicantDataResultData.getParentInfo().getFathersName(), firstName, g2VarL, familyName, applicantDataResultData.getParentInfo().getMothersMaidenName(), applicantDataResultData.getParentInfo().getMothersName(), nationality, personalId, strE, placeOfBirth, surname, applicantDataResultData.getBasicInfo().getSecondName());
    }

    public static final PhysicalIdCardApplicationChildDataRequest n(ChildData childData) {
        return new PhysicalIdCardApplicationChildDataRequest(childData.getFirstName(), childData.getSurname(), c0.e(childData.getPesel()));
    }
}
