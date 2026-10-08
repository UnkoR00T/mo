package bm0;

import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import al0.IdCardSuspensionChildData;
import al0.ParentOrGuardData;
import dx.b;
import dx.i;
import fr.t;
import gl0.GenerateChildXmlData;
import gl0.SubmitChildXmlData;
import gl0.c;
import gm0.CommunityOfficeDto;
import gm0.FileV4Dto;
import gm0.GeneratePhysicalIdCardXmlSuspensionChildV4Request;
import gm0.PhysicalIdCardSuspensionChildApplicantDataDto;
import gm0.PhysicalIdCardSuspensionChildPersonalDataDto;
import gm0.PhysicalIdCardSuspensionChildXmlV4Response;
import gm0.SubmitPhysicalIdCardSuspensionChildV4Request;
import gm0.m1;
import gm0.o2;
import gm0.p1;
import iy.b0;
import iy.c0;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import xl0.e;
import xl0.f;
import xl0.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 *\u00020\u001f¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lgl0/b;", "", "Lgm0/f2;", "attachments", "Lgm0/l2;", "e", "(Lgl0/b;Ljava/util/List;)Lgm0/l2;", "Lal0/j0;", "Lgm0/n6;", "f", "(Lal0/j0;)Lgm0/n6;", "Lal0/d0;", "Lgm0/q6;", "g", "(Lal0/d0;)Lgm0/q6;", "Lgl0/a;", "Lgm0/p1;", "c", "(Lgl0/a;)Lgm0/p1;", "Lgl0/c;", "Lgm0/m1;", "b", "(Lgl0/c;)Lgm0/m1;", "Lgl0/d;", "Lgm0/f7;", "h", "(Lgl0/d;)Lgm0/f7;", "Lgl0/d$a;", "Lgm0/q1;", "d", "(Lgl0/d$a;)Lgm0/q1;", "Lgm0/r6;", "Ldx/i;", "Ldx/b;", "Lal0/m;", "a", "(Lgm0/r6;)Ldx/i;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: bm0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0520a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20102a;

        static {
            int[] iArr = new int[gl0.a.values().length];
            try {
                iArr[gl0.a.OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gl0.a.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gl0.a.EDOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20102a = iArr;
        }
    }

    public static final i<b, BEGenerateXmlResponse> a(PhysicalIdCardSuspensionChildXmlV4Response physicalIdCardSuspensionChildXmlV4Response) {
        i iVarD = dm0.a.d(physicalIdCardSuspensionChildXmlV4Response.b());
        if (iVarD instanceof i.Left) {
            return iVarD;
        }
        if (!(iVarD instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(new BEGenerateXmlResponse(ry.a.b(c0.g(physicalIdCardSuspensionChildXmlV4Response.getDocument())), (List) ((i.Right) iVarD).b(), null));
    }

    public static final m1 b(c cVar) {
        if (cVar == c.a.Parentization) {
            return m1.CHILD_WITH_PARENTIZATION;
        }
        if (cVar == c.a.WithoutParentization) {
            return m1.CHILD_WITHOUT_PARENTIZATION;
        }
        if (t.c(cVar, c.b.f73564a)) {
            return m1.WARD;
        }
        throw new p();
    }

    public static final p1 c(gl0.a aVar) {
        int i15 = C0520a.f20102a[aVar.ordinal()];
        if (i15 == 1) {
            return p1.PERSONALLY;
        }
        if (i15 == 2) {
            return p1.NO_DOCUMENT;
        }
        if (i15 == 3) {
            return p1.EPUAP_EDOR_BOX;
        }
        throw new p();
    }

    private static final CommunityOfficeDto d(SubmitChildXmlData.Office office) {
        return new CommunityOfficeDto(office.getId(), office.getEdorAddress());
    }

    public static final GeneratePhysicalIdCardXmlSuspensionChildV4Request e(GenerateChildXmlData generateChildXmlData, List<FileV4Dto> list) {
        return new GeneratePhysicalIdCardXmlSuspensionChildV4Request(j.d(generateChildXmlData.getAction()), f(generateChildXmlData.getApplicantData()), b(generateChildXmlData.getProcessType()), g(generateChildXmlData.getChildData()), c(generateChildXmlData.getCertDeliveryMethod()), generateChildXmlData.getOffice().getId(), f.k(generateChildXmlData.getContactDetails()), list);
    }

    private static final PhysicalIdCardSuspensionChildApplicantDataDto f(ParentOrGuardData parentOrGuardData) {
        return new PhysicalIdCardSuspensionChildApplicantDataDto(parentOrGuardData.getFirstName(), c0.e(parentOrGuardData.getIdentityCardSeriesAndNumber()), parentOrGuardData.getSurname(), parentOrGuardData.getSecondName());
    }

    private static final PhysicalIdCardSuspensionChildPersonalDataDto g(IdCardSuspensionChildData idCardSuspensionChildData) {
        String strE = c0.e(idCardSuspensionChildData.getFirstName());
        String strE2 = c0.e(idCardSuspensionChildData.getPesel());
        String strE3 = c0.e(idCardSuspensionChildData.getSurname());
        b0 secondName = idCardSuspensionChildData.getSecondName();
        String strE4 = secondName != null ? c0.e(secondName) : null;
        b0 seriesAndNumber = idCardSuspensionChildData.getSeriesAndNumber();
        return new PhysicalIdCardSuspensionChildPersonalDataDto(strE, strE2, strE3, strE4, seriesAndNumber != null ? c0.e(seriesAndNumber) : null);
    }

    public static final SubmitPhysicalIdCardSuspensionChildV4Request h(SubmitChildXmlData submitChildXmlData) {
        o2 o2VarD = j.d(submitChildXmlData.getAction());
        m1 m1VarB = b(submitChildXmlData.getProcessType());
        p1 p1VarC = c(submitChildXmlData.getCertDeliveryMethod());
        CommunityOfficeDto communityOfficeDtoD = d(submitChildXmlData.getOffice());
        String strE = c0.e(submitChildXmlData.getSignedXml());
        List<BEFileInfo> listD = submitChildXmlData.d();
        return new SubmitPhysicalIdCardSuspensionChildV4Request(o2VarD, m1VarB, communityOfficeDtoD, p1VarC, strE, f.k(submitChildXmlData.getContactDetails()), listD != null ? e.c(listD) : null);
    }
}
