package dm0;

import al0.BECommunityOffice;
import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import al0.ParentOrGuardData;
import dx.i;
import dx.j;
import ex.d;
import fl0.BEChildInvalidationGenerateXmlData;
import fl0.BEChildInvalidationSubmitXmlData;
import fl0.b;
import gm0.CommunityOfficeDto;
import gm0.FileInfoDto;
import gm0.FileV4Dto;
import gm0.GeneratePhysicalIdCardXmlInvalidationChildV4Request;
import gm0.PhysicalIdCardInvalidationChildApplicantDataDto;
import gm0.PhysicalIdCardInvalidationChildInitResponse;
import gm0.PhysicalIdCardInvalidationChildPersonalDataDto;
import gm0.PhysicalIdCardInvalidationChildXmlV4Response;
import gm0.PhysicalIdCardInvalidationParentsDataDto;
import gm0.SubmitPhysicalIdCardInvalidationChildV4Request;
import gm0.e2;
import gm0.p1;
import gm0.t2;
import il0.BeChildAndParentsData;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import px.f;
import xl0.e;
import xw.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010 \u001a\u00020\u001f*\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#*\u00020\"¢\u0006\u0004\b&\u0010'\u001a+\u0010+\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0(0#*\n\u0012\u0004\u0012\u00020)\u0018\u00010(¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010-\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*0#*\u00020)H\u0002¢\u0006\u0004\b-\u0010.\u001a\u001f\u00101\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u0002000#*\u00020/H\u0002¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"Lgm0/e6;", "Lil0/a;", "e", "(Lgm0/e6;)Lil0/a;", "Lfl0/a;", "Lgm0/f2;", "confirmationDocument", "Lgm0/k2;", "g", "(Lfl0/a;Lgm0/f2;)Lgm0/k2;", "Lfl0/b;", "Lgm0/t2;", "h", "(Lfl0/b;)Lgm0/t2;", "Lal0/j0;", "Lgm0/c6;", "i", "(Lal0/j0;)Lgm0/c6;", "Lil0/a$a;", "Lgm0/f6;", "j", "(Lil0/a$a;)Lgm0/f6;", "Lal0/i;", "Lgm0/q1;", "f", "(Lal0/i;)Lgm0/q1;", "Lil0/a$b;", "Lgm0/k6;", "k", "(Lil0/a$b;)Lgm0/k6;", "Lfl0/c;", "Lgm0/e7;", "l", "(Lfl0/c;)Lgm0/e7;", "Lgm0/g6;", "Ldx/i;", "Ldx/b;", "Lal0/m;", "c", "(Lgm0/g6;)Ldx/i;", "", "Lgm0/c2;", "Lal0/l;", "d", "(Ljava/util/List;)Ldx/i;", "a", "(Lgm0/c2;)Ldx/i;", "Lgm0/e2;", "Lal0/l$a;", "b", "(Lgm0/e2;)Ldx/i;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: dm0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0969a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43457b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Loss.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Damage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43456a = iArr;
            int[] iArr2 = new int[e2.values().length];
            try {
                iArr2[e2.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[e2.ATTACHMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[e2.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f43457b = iArr2;
        }
    }

    private static final i<dx.b, BEFileInfo> a(FileInfoDto fileInfoDto) {
        i iVarB = b(fileInfoDto.getType());
        if (iVarB instanceof i.Left) {
            return iVarB;
        }
        if (!(iVarB instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(new BEFileInfo(fileInfoDto.getId(), fileInfoDto.getName(), (BEFileInfo.a) ((i.Right) iVarB).b()));
    }

    private static final i<dx.b, BEFileInfo.a> b(e2 e2Var) {
        Object objB;
        BEFileInfo.a aVar;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar2 = new ex.a();
                    int i15 = C0969a.f43457b[e2Var.ordinal()];
                    if (i15 == 1) {
                        aVar = BEFileInfo.a.Photo;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar2.b(new dx.b.Parsing(null, 1, null));
                            throw new g();
                        }
                        aVar = BEFileInfo.a.Attachment;
                    }
                    return new i.Right(aVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, BEGenerateXmlResponse> c(PhysicalIdCardInvalidationChildXmlV4Response physicalIdCardInvalidationChildXmlV4Response) {
        i iVarD = d(physicalIdCardInvalidationChildXmlV4Response.b());
        if (iVarD instanceof i.Left) {
            return iVarD;
        }
        if (!(iVarD instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(new BEGenerateXmlResponse(ry.a.b(c0.g(physicalIdCardInvalidationChildXmlV4Response.getDocument())), (List) ((i.Right) iVarD).b(), null));
    }

    public static final i<dx.b, List<BEFileInfo>> d(List<FileInfoDto> list) {
        Object objB;
        List listN;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (list != null) {
                        List<FileInfoDto> list2 = list;
                        listN = new ArrayList(v.y(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            listN.add((BEFileInfo) aVar.a(a((FileInfoDto) it.next())));
                        }
                    } else {
                        listN = null;
                    }
                    if (listN == null) {
                        listN = v.n();
                    }
                    return new i.Right(listN);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final BeChildAndParentsData e(PhysicalIdCardInvalidationChildInitResponse physicalIdCardInvalidationChildInitResponse) {
        b0 b0VarG = c0.g(physicalIdCardInvalidationChildInitResponse.getFirstName());
        String secondName = physicalIdCardInvalidationChildInitResponse.getSecondName();
        b0 b0VarG2 = secondName != null ? c0.g(secondName) : null;
        b0 b0VarG3 = c0.g(physicalIdCardInvalidationChildInitResponse.getSurname());
        b0 b0VarG4 = c0.g(physicalIdCardInvalidationChildInitResponse.getMaidenName());
        fz.b.LocalDate localDate = new fz.b.LocalDate(physicalIdCardInvalidationChildInitResponse.getDateOfBirth());
        b0 b0VarG5 = null;
        String placeOfBirth = physicalIdCardInvalidationChildInitResponse.getPlaceOfBirth();
        String seriesAndNumber = physicalIdCardInvalidationChildInitResponse.getSeriesAndNumber();
        if (seriesAndNumber != null) {
            b0VarG5 = c0.g(seriesAndNumber);
        }
        return new BeChildAndParentsData(new BeChildAndParentsData.ChildData(b0VarG, b0VarG2, b0VarG3, b0VarG4, localDate, placeOfBirth, b0VarG5), new BeChildAndParentsData.ParentsData(c0.g(physicalIdCardInvalidationChildInitResponse.getFathersName()), c0.g(physicalIdCardInvalidationChildInitResponse.getMothersName()), c0.g(physicalIdCardInvalidationChildInitResponse.getMothersMaidenName())));
    }

    public static final CommunityOfficeDto f(BECommunityOffice bECommunityOffice) {
        return new CommunityOfficeDto(bECommunityOffice.getId(), bECommunityOffice.getEdorAddress());
    }

    public static final GeneratePhysicalIdCardXmlInvalidationChildV4Request g(BEChildInvalidationGenerateXmlData bEChildInvalidationGenerateXmlData, FileV4Dto fileV4Dto) {
        t2 t2VarH = h(bEChildInvalidationGenerateXmlData.getInvalidationReason());
        PhysicalIdCardInvalidationChildApplicantDataDto physicalIdCardInvalidationChildApplicantDataDtoI = i(bEChildInvalidationGenerateXmlData.getParentOrGuardData());
        PhysicalIdCardInvalidationChildPersonalDataDto physicalIdCardInvalidationChildPersonalDataDtoJ = j(bEChildInvalidationGenerateXmlData.getChildAndParentData().getChildData());
        CommunityOfficeDto communityOfficeDtoF = f(bEChildInvalidationGenerateXmlData.getCommunityOffice());
        p1 p1VarC = bm0.a.c(bEChildInvalidationGenerateXmlData.getDocumentDeliveryMethod());
        return new GeneratePhysicalIdCardXmlInvalidationChildV4Request(physicalIdCardInvalidationChildApplicantDataDtoI, bm0.a.b(bEChildInvalidationGenerateXmlData.getProcessType()), physicalIdCardInvalidationChildPersonalDataDtoJ, communityOfficeDtoF, p1VarC, t2VarH, xl0.f.k(bEChildInvalidationGenerateXmlData.getContactDetails()), fileV4Dto != null ? v.e(fileV4Dto) : null, k(bEChildInvalidationGenerateXmlData.getChildAndParentData().getParentsData()));
    }

    private static final t2 h(b bVar) {
        int i15 = C0969a.f43456a[bVar.ordinal()];
        if (i15 == 1) {
            return t2.LOSS;
        }
        if (i15 == 2) {
            return t2.DAMAGE;
        }
        throw new p();
    }

    private static final PhysicalIdCardInvalidationChildApplicantDataDto i(ParentOrGuardData parentOrGuardData) {
        return new PhysicalIdCardInvalidationChildApplicantDataDto(parentOrGuardData.getFirstName(), c0.e(parentOrGuardData.getIdentityCardSeriesAndNumber()), parentOrGuardData.getSurname(), parentOrGuardData.getSecondName());
    }

    private static final PhysicalIdCardInvalidationChildPersonalDataDto j(BeChildAndParentsData.ChildData childData) {
        LocalDate date = childData.getBirthDate().getDate();
        String strE = c0.e(childData.getFirstName());
        String strE2 = c0.e(childData.getFamilyName());
        String birthPlace = childData.getBirthPlace();
        String strE3 = c0.e(childData.getLastName());
        b0 secondName = childData.getSecondName();
        String strE4 = secondName != null ? c0.e(secondName) : null;
        b0 idSeriesAndNumber = childData.getIdSeriesAndNumber();
        return new PhysicalIdCardInvalidationChildPersonalDataDto(date, strE, strE2, birthPlace, strE3, strE4, idSeriesAndNumber != null ? c0.e(idSeriesAndNumber) : null);
    }

    private static final PhysicalIdCardInvalidationParentsDataDto k(BeChildAndParentsData.ParentsData parentsData) {
        return new PhysicalIdCardInvalidationParentsDataDto(c0.e(parentsData.getFathersName()), c0.e(parentsData.getMothersMaidenName()), c0.e(parentsData.getMothersName()));
    }

    public static final SubmitPhysicalIdCardInvalidationChildV4Request l(BEChildInvalidationSubmitXmlData bEChildInvalidationSubmitXmlData) {
        CommunityOfficeDto communityOfficeDtoF = f(bEChildInvalidationSubmitXmlData.getCommunityOffice());
        return new SubmitPhysicalIdCardInvalidationChildV4Request(bm0.a.b(bEChildInvalidationSubmitXmlData.getProcessType()), communityOfficeDtoF, bm0.a.c(bEChildInvalidationSubmitXmlData.getDocumentDeliveryMethod()), h(bEChildInvalidationSubmitXmlData.getInvalidationReason()), c0.e(bEChildInvalidationSubmitXmlData.getSignedDocument()), xl0.f.k(bEChildInvalidationSubmitXmlData.getContactDetails()), e.c(bEChildInvalidationSubmitXmlData.d()));
    }
}
