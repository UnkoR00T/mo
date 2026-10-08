package em0;

import al0.z;
import gm0.PassportAgreementDto;
import gm0.PassportAgreementResponse;
import gm0.PassportChildAgreementApplicantDto;
import gm0.PassportChildAgreementAttachmentDto;
import gm0.PassportChildAgreementAttachmentsDto;
import gm0.PassportChildAgreementChildDto;
import gm0.PassportChildAgreementGetParentDataResponse;
import gm0.PassportChildAgreementXmlRequest;
import gm0.SubmitPassportChildAgreementRequest;
import gm0.VerifyPassportChildAgreementRequest;
import gm0.g2;
import gm0.j3;
import gm0.n1;
import gm0.n5;
import gm0.o3;
import gm0.y1;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jl0.BEPassportAgreement;
import jl0.PassportChildAgreementApplicant;
import jl0.PassportChildAgreementAttachment;
import jl0.PassportChildAgreementAttachments;
import jl0.PassportChildAgreementParentData;
import jl0.VerifyPassportChildApplicationAgreementRequest;
import jl0.m;
import jl0.n;
import jl0.p;
import jl0.t;
import p071kotlin.Metadata;
import pq.v;
import xw.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020201*\u000200¢\u0006\u0004\b3\u00104\u001a\u0011\u00106\u001a\u000202*\u000205¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lgm0/s3;", "Ljl0/w;", "e", "(Lgm0/s3;)Ljl0/w;", "Lgm0/g2;", "Lal0/z;", "a", "(Lgm0/g2;)Lal0/z;", "Ljl0/z;", "Lgm0/h7;", "o", "(Ljl0/z;)Lgm0/h7;", "Ljl0/n;", "Lgm0/n1;", "f", "(Ljl0/n;)Lgm0/n1;", "Ljl0/p;", "Lgm0/y1;", "g", "(Ljl0/p;)Lgm0/y1;", "Ljl0/q;", "Lgm0/l3;", "h", "(Ljl0/q;)Lgm0/l3;", "Ljl0/r;", "Lgm0/n3;", "i", "(Ljl0/r;)Lgm0/n3;", "Ljl0/u;", "Lgm0/p3;", "k", "(Ljl0/u;)Lgm0/p3;", "Ljl0/t;", "Lgm0/o3;", "j", "(Ljl0/t;)Lgm0/o3;", "Ljl0/v;", "Lgm0/q3;", "l", "(Ljl0/v;)Lgm0/q3;", "Ljl0/x;", "Lgm0/w3;", "m", "(Ljl0/x;)Lgm0/w3;", "Ljl0/y;", "Lgm0/z6;", "n", "(Ljl0/y;)Lgm0/z6;", "Lgm0/i3;", "", "Ljl0/a;", "b", "(Lgm0/i3;)Ljava/util/List;", "Lgm0/e3;", "c", "(Lgm0/e3;)Ljl0/a;", "Lgm0/j3;", "Ljl0/m;", "d", "(Lgm0/j3;)Ljl0/m;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f51941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f51942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f51943e;

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
            f51939a = iArr;
            int[] iArr2 = new int[n.values().length];
            try {
                iArr2[n.CHILD_WITH_PARENTIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n.CHILD_WITHOUT_PARENTIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f51940b = iArr2;
            int[] iArr3 = new int[p.values().length];
            try {
                iArr3[p.PHYSICAL_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[p.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[p.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[p.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f51941c = iArr3;
            int[] iArr4 = new int[t.values().length];
            try {
                iArr4[t.DIPLOMATIC_PASSPORT_ENTITLEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[t.BUSINESS_PASSPORT_ENTITLEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[t.CHILD_GUARDIAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[t.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f51942d = iArr4;
            int[] iArr5 = new int[j3.values().length];
            try {
                iArr5[j3.REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[j3.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[j3.ASSIGNED_TO_APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[j3.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            f51943e = iArr5;
        }
    }

    public static final z a(g2 g2Var) {
        int i15 = g2Var == null ? -1 : a.f51939a[g2Var.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? z.UNKNOWN : z.FEMALE;
        }
        return z.MALE;
    }

    public static final List<BEPassportAgreement> b(PassportAgreementResponse passportAgreementResponse) {
        List<PassportAgreementDto> listA = passportAgreementResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((PassportAgreementDto) it.next()));
        }
        return arrayList;
    }

    public static final BEPassportAgreement c(PassportAgreementDto passportAgreementDto) {
        return new BEPassportAgreement(passportAgreementDto.getAgreementNumber(), d(passportAgreementDto.getAgreementStatus()), passportAgreementDto.getFirstName(), passportAgreementDto.getLastName(), em0.a.c(passportAgreementDto.getPassportType()), new fz.b.OffsetDateTime(passportAgreementDto.getRegistrationDate()), passportAgreementDto.getMobywatelAgreementId());
    }

    public static final m d(j3 j3Var) {
        int i15 = a.f51943e[j3Var.ordinal()];
        if (i15 == 1) {
            return m.REGISTERED;
        }
        if (i15 == 2) {
            return m.REVOKED;
        }
        if (i15 == 3) {
            return m.ASSIGNED_TO_APPLICATION;
        }
        if (i15 == 4) {
            return m.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final PassportChildAgreementParentData e(PassportChildAgreementGetParentDataResponse passportChildAgreementGetParentDataResponse) {
        fz.b.LocalDate localDate = new fz.b.LocalDate(passportChildAgreementGetParentDataResponse.getDateOfBirth());
        b0 b0VarG = c0.g(passportChildAgreementGetParentDataResponse.getFirstName());
        String secondName = passportChildAgreementGetParentDataResponse.getSecondName();
        b0 b0VarG2 = secondName != null ? c0.g(secondName) : null;
        b0 b0VarG3 = c0.g(passportChildAgreementGetParentDataResponse.getSurname());
        z zVarA = a(passportChildAgreementGetParentDataResponse.getGender());
        b0 b0VarC = g.c(c0.g(passportChildAgreementGetParentDataResponse.getPesel()));
        String idCardSeriesAndNumber = passportChildAgreementGetParentDataResponse.getIdCardSeriesAndNumber();
        b0 b0VarG4 = idCardSeriesAndNumber != null ? c0.g(idCardSeriesAndNumber) : null;
        String placeOfBirth = passportChildAgreementGetParentDataResponse.getPlaceOfBirth();
        return new PassportChildAgreementParentData(localDate, b0VarG, b0VarC, zVarA, b0VarG3, b0VarG4, placeOfBirth != null ? c0.g(placeOfBirth) : null, b0VarG2, c0.g(passportChildAgreementGetParentDataResponse.getChecksum()), null);
    }

    public static final n1 f(n nVar) {
        int i15 = a.f51940b[nVar.ordinal()];
        if (i15 == 1) {
            return n1.CHILD_WITH_PARENTIZATION;
        }
        if (i15 == 2) {
            return n1.CHILD_WITHOUT_PARENTIZATION;
        }
        if (i15 == 3) {
            return n1.OTHER;
        }
        if (i15 == 4) {
            return n1.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final y1 g(p pVar) {
        int i15 = a.f51941c[pVar.ordinal()];
        if (i15 == 1) {
            return y1.PHYSICAL_ID_CARD;
        }
        if (i15 == 2) {
            return y1.PASSPORT;
        }
        if (i15 == 3) {
            return y1.OTHER;
        }
        if (i15 == 4) {
            return y1.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final PassportChildAgreementApplicantDto h(PassportChildAgreementApplicant passportChildAgreementApplicant) {
        String strE = c0.e(passportChildAgreementApplicant.getFirstName());
        String strE2 = c0.e(passportChildAgreementApplicant.getLastName());
        b0 secondName = passportChildAgreementApplicant.getSecondName();
        String strE3 = secondName != null ? c0.e(secondName) : null;
        String strE4 = c0.e(passportChildAgreementApplicant.getPesel());
        LocalDate date = passportChildAgreementApplicant.getBirthDate().getDate();
        String strE5 = c0.e(passportChildAgreementApplicant.getBirthPlace());
        String strE6 = c0.e(passportChildAgreementApplicant.getDocumentAndSeries());
        y1 y1VarG = g(passportChildAgreementApplicant.getDocumentType());
        b0 otherDocumentTypeDescription = passportChildAgreementApplicant.getOtherDocumentTypeDescription();
        return new PassportChildAgreementApplicantDto(date, strE5, c0.e(passportChildAgreementApplicant.getChecksum()), strE6, y1VarG, strE, strE2, strE4, otherDocumentTypeDescription != null ? c0.e(otherDocumentTypeDescription) : null, strE3);
    }

    public static final PassportChildAgreementAttachmentDto i(PassportChildAgreementAttachment passportChildAgreementAttachment) {
        return new PassportChildAgreementAttachmentDto(j(passportChildAgreementAttachment.getAgreementAttachmentType()), c0.e(passportChildAgreementAttachment.getFileEncryptionIV()), c0.e(passportChildAgreementAttachment.getFileName()));
    }

    public static final o3 j(t tVar) {
        int i15 = a.f51942d[tVar.ordinal()];
        if (i15 == 1) {
            return o3.DIPLOMATIC_PASSPORT_ENTITLEMENT;
        }
        if (i15 == 2) {
            return o3.BUSINESS_PASSPORT_ENTITLEMENT;
        }
        if (i15 == 3) {
            return o3.CHILD_GUARDIAN;
        }
        if (i15 == 4) {
            return o3.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final PassportChildAgreementAttachmentsDto k(PassportChildAgreementAttachments passportChildAgreementAttachments) {
        String strE = c0.e(passportChildAgreementAttachments.getFileEncryptionKey());
        List<PassportChildAgreementAttachment> listB = passportChildAgreementAttachments.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(i((PassportChildAgreementAttachment) it.next()));
        }
        return new PassportChildAgreementAttachmentsDto(strE, arrayList);
    }

    public static final PassportChildAgreementChildDto l(jl0.v vVar) {
        LocalDate date = vVar.getBirthDate().getDate();
        String strE = c0.e(vVar.getBirthPlace());
        b0 firstName = vVar.getFirstName();
        String strE2 = firstName != null ? c0.e(firstName) : null;
        b0 lastName = vVar.getLastName();
        String strE3 = lastName != null ? c0.e(lastName) : null;
        b0 otherNames = vVar.getOtherNames();
        String strE4 = otherNames != null ? c0.e(otherNames) : null;
        b0 pesel = vVar.getPesel();
        String strE5 = pesel != null ? c0.e(pesel) : null;
        b0 secondName = vVar.getSecondName();
        String strE6 = secondName != null ? c0.e(secondName) : null;
        b0 checksum = vVar.getChecksum();
        return new PassportChildAgreementChildDto(date, strE, checksum != null ? c0.e(checksum) : null, strE2, strE3, strE4, strE5, strE6);
    }

    public static final PassportChildAgreementXmlRequest m(jl0.PassportChildAgreementXmlRequest passportChildAgreementXmlRequest) {
        PassportChildAgreementApplicantDto passportChildAgreementApplicantDtoH = h(passportChildAgreementXmlRequest.getApplicant());
        PassportChildAgreementChildDto passportChildAgreementChildDtoL = l(passportChildAgreementXmlRequest.getChild());
        n1 n1VarF = f(passportChildAgreementXmlRequest.getChildStatus());
        n5 n5VarG = em0.a.g(passportChildAgreementXmlRequest.getPassportType());
        PassportChildAgreementAttachments attachments = passportChildAgreementXmlRequest.getAttachments();
        return new PassportChildAgreementXmlRequest(passportChildAgreementApplicantDtoH, passportChildAgreementChildDtoL, n1VarF, n5VarG, attachments != null ? k(attachments) : null, passportChildAgreementXmlRequest.getParentalStatement());
    }

    public static final SubmitPassportChildAgreementRequest n(jl0.SubmitPassportChildAgreementRequest submitPassportChildAgreementRequest) {
        return new SubmitPassportChildAgreementRequest(c0.e(submitPassportChildAgreementRequest.getSignedXml()));
    }

    public static final VerifyPassportChildAgreementRequest o(VerifyPassportChildApplicationAgreementRequest verifyPassportChildApplicationAgreementRequest) {
        return new VerifyPassportChildAgreementRequest(c0.e(verifyPassportChildApplicationAgreementRequest.getChildPesel()), verifyPassportChildApplicationAgreementRequest.getDateOfBirth().getDate(), c0.e(verifyPassportChildApplicationAgreementRequest.getFirstName()), c0.e(verifyPassportChildApplicationAgreementRequest.getPlaceOfBirth()), c0.e(verifyPassportChildApplicationAgreementRequest.getSurname()), c0.e(verifyPassportChildApplicationAgreementRequest.getSecondName()));
    }
}
