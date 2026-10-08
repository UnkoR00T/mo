package cm0;

import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import dx.i;
import gm0.FileV4Dto;
import gm0.GeneratePhysicalIdCardXmlIdentityTheftV4Request;
import gm0.PhysicalIdCardIdentityTheftXmlV4Response;
import gm0.PhysicalIdCardInvalidationApplicantDataDto;
import gm0.PhysicalIdCardInvalidationApplicantInitDataDto;
import gm0.PhysicalIdCardInvalidationInitResponse;
import gm0.PhysicalIdCardInvalidationOfficeDataDto;
import gm0.PhysicalIdCardInvalidationOfficeLinkDto;
import gm0.PhysicalIdCardInvalidationParentsDataDto;
import gm0.PhysicalIdCardInvalidationV3Request;
import gm0.SubmitPhysicalIdCardIdentityTheftV4Request;
import gm0.t2;
import hl0.IdCardInvalidationInitData;
import iy.b0;
import iy.c0;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import xl0.e;
import xl0.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\"\u001a\u00020!*\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\"\u0010#\u001a'\u0010(\u001a\u00020'*\u00020\u001d2\u0006\u0010%\u001a\u00020$2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020&0\u001e¢\u0006\u0004\b(\u0010)\u001a\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+*\u00020*¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lgm0/h6;", "Lhl0/b;", "f", "(Lgm0/h6;)Lhl0/b;", "Lgm0/k6;", "Lhl0/b$d;", "e", "(Lgm0/k6;)Lhl0/b$d;", "Lgm0/j6;", "Lhl0/b$c;", "d", "(Lgm0/j6;)Lhl0/b$c;", "Lgm0/i6;", "Lhl0/b$b;", "c", "(Lgm0/i6;)Lhl0/b$b;", "Lgm0/b6;", "Lhl0/b$a;", "b", "(Lgm0/b6;)Lhl0/b$a;", "Lhl0/a$c;", "Lgm0/l6;", "j", "(Lhl0/a$c;)Lgm0/l6;", "Lgm0/a6;", "h", "(Lhl0/b$a;)Lgm0/a6;", "i", "(Lhl0/b$d;)Lgm0/k6;", "Lhl0/a$d;", "", "Lgm0/f2;", "files", "Lgm0/j2;", "g", "(Lhl0/a$d;Ljava/util/List;)Lgm0/j2;", "Lry/a;", "signedBase64Xml", "Lal0/l;", "Lgm0/d7;", "k", "(Lhl0/a$d;Liy/b0;Ljava/util/List;)Lgm0/d7;", "Lgm0/z5;", "Ldx/i;", "Ldx/b;", "Lal0/m;", "a", "(Lgm0/z5;)Ldx/i;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final i<dx.b, BEGenerateXmlResponse> a(PhysicalIdCardIdentityTheftXmlV4Response physicalIdCardIdentityTheftXmlV4Response) {
        i iVarD = dm0.a.d(physicalIdCardIdentityTheftXmlV4Response.b());
        if (iVarD instanceof i.Left) {
            return iVarD;
        }
        if (!(iVarD instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(new BEGenerateXmlResponse(ry.a.b(c0.g(physicalIdCardIdentityTheftXmlV4Response.getDocument())), (List) ((i.Right) iVarD).b(), null));
    }

    private static final IdCardInvalidationInitData.ApplicantData b(PhysicalIdCardInvalidationApplicantInitDataDto physicalIdCardInvalidationApplicantInitDataDto) {
        return new IdCardInvalidationInitData.ApplicantData(physicalIdCardInvalidationApplicantInitDataDto.getFirstName(), physicalIdCardInvalidationApplicantInitDataDto.getSecondName(), physicalIdCardInvalidationApplicantInitDataDto.getSurname(), new fz.b.LocalDate(physicalIdCardInvalidationApplicantInitDataDto.getDateOfBirth()), physicalIdCardInvalidationApplicantInitDataDto.getMaidenName(), c0.g(physicalIdCardInvalidationApplicantInitDataDto.getNumber()), physicalIdCardInvalidationApplicantInitDataDto.getPlaceOfBirth(), c0.g(physicalIdCardInvalidationApplicantInitDataDto.getSeries()), new fz.b.LocalDate(physicalIdCardInvalidationApplicantInitDataDto.getIssuedDate()));
    }

    private static final IdCardInvalidationInitData.OfficeData c(PhysicalIdCardInvalidationOfficeDataDto physicalIdCardInvalidationOfficeDataDto) {
        return new IdCardInvalidationInitData.OfficeData(physicalIdCardInvalidationOfficeDataDto.getDescriptiveOrganizationName(), c0.g(physicalIdCardInvalidationOfficeDataDto.getTerc()));
    }

    private static final IdCardInvalidationInitData.OfficeLink d(PhysicalIdCardInvalidationOfficeLinkDto physicalIdCardInvalidationOfficeLinkDto) {
        return new IdCardInvalidationInitData.OfficeLink(physicalIdCardInvalidationOfficeLinkDto.getInfoTip(), physicalIdCardInvalidationOfficeLinkDto.getInfoTipDescription(), physicalIdCardInvalidationOfficeLinkDto.getLink(), physicalIdCardInvalidationOfficeLinkDto.getLinkLabel());
    }

    private static final IdCardInvalidationInitData.ParentsData e(PhysicalIdCardInvalidationParentsDataDto physicalIdCardInvalidationParentsDataDto) {
        return new IdCardInvalidationInitData.ParentsData(physicalIdCardInvalidationParentsDataDto.getFathersName(), physicalIdCardInvalidationParentsDataDto.getMothersMaidenName(), physicalIdCardInvalidationParentsDataDto.getMothersName());
    }

    public static final IdCardInvalidationInitData f(PhysicalIdCardInvalidationInitResponse physicalIdCardInvalidationInitResponse) {
        return new IdCardInvalidationInitData(b(physicalIdCardInvalidationInitResponse.getApplicantData()), c(physicalIdCardInvalidationInitResponse.getOfficeData()), d(physicalIdCardInvalidationInitResponse.getOfficeLink()), e(physicalIdCardInvalidationInitResponse.getParentsData()));
    }

    public static final GeneratePhysicalIdCardXmlIdentityTheftV4Request g(hl0.a.Theft theft, List<FileV4Dto> list) {
        return new GeneratePhysicalIdCardXmlIdentityTheftV4Request(h(theft.getInitData().getApplicantData()), dm0.a.f(theft.getCommunityOffice()), f.k(theft.getContactDetails()), list, theft.getInitData().getApplicantData().getIssueDate().getDate(), i(theft.getInitData().getParentsData()), theft.getDescriptionData().getDescription());
    }

    public static final PhysicalIdCardInvalidationApplicantDataDto h(IdCardInvalidationInitData.ApplicantData applicantData) {
        return new PhysicalIdCardInvalidationApplicantDataDto(applicantData.getBirthDate().getDate(), applicantData.getMaidenName(), c0.e(applicantData.getNumber()), applicantData.getBirthPlace(), c0.e(applicantData.getSeries()));
    }

    public static final PhysicalIdCardInvalidationParentsDataDto i(IdCardInvalidationInitData.ParentsData parentsData) {
        return new PhysicalIdCardInvalidationParentsDataDto(parentsData.getFathersName(), parentsData.getMothersMaidenName(), parentsData.getMothersName());
    }

    public static final PhysicalIdCardInvalidationV3Request j(hl0.a.c cVar) {
        t2 t2Var;
        PhysicalIdCardInvalidationApplicantDataDto physicalIdCardInvalidationApplicantDataDtoH = h(cVar.getInitData().getApplicantData());
        String strE = c0.e(cVar.getInitData().getOfficeData().getTerytCode());
        if (cVar instanceof hl0.a.Damage) {
            t2Var = t2.DAMAGE;
        } else {
            if (!(cVar instanceof hl0.a.Loss)) {
                throw new p();
            }
            t2Var = t2.LOSS;
        }
        return new PhysicalIdCardInvalidationV3Request(physicalIdCardInvalidationApplicantDataDtoH, strE, t2Var, null, null, i(cVar.getInitData().getParentsData()), 16, null);
    }

    public static final SubmitPhysicalIdCardIdentityTheftV4Request k(hl0.a.Theft theft, b0 b0Var, List<BEFileInfo> list) {
        return new SubmitPhysicalIdCardIdentityTheftV4Request(dm0.a.f(theft.getCommunityOffice()), c0.e(b0Var), f.k(theft.getContactDetails()), e.c(list));
    }
}
