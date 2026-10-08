package ef0;

import cf0.AsyncErrorResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf0.AsyncDocumentGenerationResult;
import kf0.DocumentConfigLabel;
import kf0.DocumentGenerationResponse;
import kf0.DocumentToDownload;
import kf0.DocumentToGenerate;
import kf0.DocumentUpdateResponse;
import kf0.g;
import oq.p;
import p071kotlin.Metadata;
import pt3.AsyncDocumentGenerationResponse;
import pt3.AsyncErrorResponseDto;
import pt3.AsyncUpdateDocumentResponse;
import pt3.DocumentToDownloadDto;
import pt3.DocumentToGenerateDto;
import pt3.LabelDto;
import pt3.i;
import pt3.k;
import pt3.q;
import pt3.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001c\u001a\u00020\u001b*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010 \u001a\u00020\u001f*\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u0011\u0010$\u001a\u00020#*\u00020\"¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010(\u001a\u00020'*\u00020&¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lpt3/i;", "Lkf0/b$a;", "c", "(Lpt3/i;)Lkf0/b$a;", "Lpt3/n;", "Lkf0/e;", "g", "(Lpt3/n;)Lkf0/e;", "Lpt3/q;", "Lcf0/c;", "a", "(Lpt3/q;)Lcf0/c;", "k", "(Lcf0/c;)Lpt3/q;", "Lpt3/u;", "Lkf0/c;", "e", "(Lpt3/u;)Lkf0/c;", "Lpt3/v;", "Lkf0/c$a;", "d", "(Lpt3/v;)Lkf0/c$a;", "Lpt3/d;", "Lcf0/d;", "b", "(Lpt3/d;)Lcf0/d;", "Lpt3/b;", "Lkf0/d;", "f", "(Lpt3/b;)Lkf0/d;", "Lpt3/f;", "Lkf0/h;", "j", "(Lpt3/f;)Lkf0/h;", "Lpt3/o;", "Lkf0/f;", "h", "(Lpt3/o;)Lkf0/f;", "Lpt3/k;", "Lkf0/g;", "i", "(Lpt3/k;)Lkf0/g;", "async_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f49820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f49821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f49822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f49823e;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.TO_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.ALREADY_DOWNLOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.CREATING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.ALL_DOWNLOADED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.MULTI_DOCUMENT_GENERATION_FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.RETRY_GLOBAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.TERMINAL_GLOBAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f49819a = iArr;
            int[] iArr2 = new int[q.values().length];
            try {
                iArr2[q.JUNIOR_SCHOOL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[q.TEMPORARY_DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[q.DRIVING_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[q.FAMILY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[q.UUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[q.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f49820b = iArr2;
            int[] iArr3 = new int[cf0.c.values().length];
            try {
                iArr3[cf0.c.JUNIOR_STUDENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[cf0.c.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[cf0.c.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[cf0.c.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            f49821c = iArr3;
            int[] iArr4 = new int[v.values().length];
            try {
                iArr4[v.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[v.UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[v.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[v.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            f49822d = iArr4;
            int[] iArr5 = new int[k.values().length];
            try {
                iArr5[k.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[k.CREATING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[k.SCOPES_CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[k.SCOPES_CREATING_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[k.SIGNED.ordinal()] = 5;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[k.SIGNING_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[k.READY_FOR_DOWNLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[k.ENCRYPTING_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[k.DOWNLOADED.ordinal()] = 9;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[k.DOWNLOADING_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[k.MULTI_DOCUMENT_GENERATION_FINISHED.ordinal()] = 11;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[k.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused35) {
            }
            f49823e = iArr5;
        }
    }

    public static final cf0.c a(q qVar) {
        switch (a.f49820b[qVar.ordinal()]) {
            case 1:
                return cf0.c.JUNIOR_STUDENT_CARD;
            case 2:
            case 3:
                return cf0.c.DRIVING_LICENCE;
            case 4:
                return cf0.c.FAMILY_CARD;
            case 5:
                return cf0.c.UUT_CARD;
            case 6:
                return cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD;
            default:
                return null;
        }
    }

    public static final AsyncErrorResponse b(AsyncErrorResponseDto asyncErrorResponseDto) {
        return new AsyncErrorResponse(asyncErrorResponseDto.getBusinessCode(), asyncErrorResponseDto.getTechnicalCode(), asyncErrorResponseDto.getMessage(), asyncErrorResponseDto.getTitle(), asyncErrorResponseDto.getTraceId());
    }

    public static final AsyncDocumentGenerationResult.a c(i iVar) {
        switch (a.f49819a[iVar.ordinal()]) {
            case 1:
                return AsyncDocumentGenerationResult.a.TO_DOWNLOAD;
            case 2:
                return AsyncDocumentGenerationResult.a.ALREADY_DOWNLOADED;
            case 3:
                return AsyncDocumentGenerationResult.a.CREATING_ERROR;
            case 4:
                return AsyncDocumentGenerationResult.a.ALL_DOWNLOADED;
            case 5:
                return AsyncDocumentGenerationResult.a.MULTI_DOCUMENT_GENERATION_FINISHED;
            case 6:
                return AsyncDocumentGenerationResult.a.RETRY_GLOBAL_ERROR;
            case 7:
                return AsyncDocumentGenerationResult.a.TERMINAL_GLOBAL_ERROR;
            case 8:
                return AsyncDocumentGenerationResult.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final DocumentConfigLabel.a d(v vVar) {
        int i15 = a.f49822d[vVar.ordinal()];
        if (i15 == 1) {
            return DocumentConfigLabel.a.PL;
        }
        if (i15 == 2) {
            return DocumentConfigLabel.a.UK;
        }
        if (i15 == 3) {
            return DocumentConfigLabel.a.EN;
        }
        if (i15 == 4) {
            return DocumentConfigLabel.a.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentConfigLabel e(LabelDto labelDto) {
        return new DocumentConfigLabel(d(labelDto.getLanguage()), labelDto.getValue());
    }

    public static final DocumentGenerationResponse f(AsyncDocumentGenerationResponse asyncDocumentGenerationResponse) {
        String taskId = asyncDocumentGenerationResponse.getTaskId();
        List<DocumentToGenerateDto> listA = asyncDocumentGenerationResponse.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(h((DocumentToGenerateDto) it.next()));
        }
        return new DocumentGenerationResponse(arrayList, taskId);
    }

    public static final DocumentToDownload g(DocumentToDownloadDto documentToDownloadDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String documentId = documentToDownloadDto.getDocumentId();
        cf0.c cVarA = a(documentToDownloadDto.getDocumentType());
        String encryptedScopes = documentToDownloadDto.getEncryptedScopes();
        String subtype = documentToDownloadDto.getSubtype();
        LocalDate expirationDate = documentToDownloadDto.getExpirationDate();
        ArrayList arrayList3 = null;
        fz.b.LocalDate localDate = expirationDate != null ? new fz.b.LocalDate(expirationDate) : null;
        List<LabelDto> listA = documentToDownloadDto.a();
        if (listA != null) {
            List<LabelDto> list = listA;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e((LabelDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<LabelDto> listI = documentToDownloadDto.i();
        if (listI != null) {
            List<LabelDto> list2 = listI;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(e((LabelDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<LabelDto> listF = documentToDownloadDto.f();
        if (listF != null) {
            List<LabelDto> list3 = listF;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(e((LabelDto) it5.next()));
            }
        }
        return new DocumentToDownload(documentId, cVarA, subtype, encryptedScopes, localDate, arrayList, arrayList2, arrayList3, documentToDownloadDto.getParentDocumentId(), documentToDownloadDto.h());
    }

    public static final DocumentToGenerate h(DocumentToGenerateDto documentToGenerateDto) {
        return new DocumentToGenerate(documentToGenerateDto.getAsyncDownloadTerminationInterval(), documentToGenerateDto.getDocumentId(), a(documentToGenerateDto.getDocumentType()), i(documentToGenerateDto.getGenerationStatus()), documentToGenerateDto.getMultiDocument(), documentToGenerateDto.getSubType());
    }

    public static final g i(k kVar) {
        switch (a.f49823e[kVar.ordinal()]) {
            case 1:
                return g.CREATED;
            case 2:
                return g.CREATING_ERROR;
            case 3:
                return g.SCOPES_CREATED;
            case 4:
                return g.SCOPES_CREATING_ERROR;
            case 5:
                return g.SIGNED;
            case 6:
                return g.SIGNING_ERROR;
            case 7:
                return g.READY_FOR_DOWNLOAD;
            case 8:
                return g.ENCRYPTING_ERROR;
            case 9:
                return g.DOWNLOADED;
            case 10:
                return g.DOWNLOADING_ERROR;
            case 11:
                return g.MULTI_DOCUMENT_GENERATION_FINISHED;
            case 12:
                return g.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final DocumentUpdateResponse j(AsyncUpdateDocumentResponse asyncUpdateDocumentResponse) {
        return new DocumentUpdateResponse(h(asyncUpdateDocumentResponse.getDocumentToGenerateDto()), asyncUpdateDocumentResponse.getTaskId());
    }

    public static final q k(cf0.c cVar) {
        int i15 = a.f49821c[cVar.ordinal()];
        if (i15 == 1) {
            return q.JUNIOR_SCHOOL_CARD;
        }
        if (i15 == 2) {
            return q.DRIVING_LICENCE;
        }
        if (i15 == 3) {
            return q.FAMILY_CARD;
        }
        if (i15 == 4) {
            return q.UUT;
        }
        if (i15 == 5) {
            return q.DISABLED_PERSON_IDENTIFICATION_CARD;
        }
        throw new p();
    }
}
