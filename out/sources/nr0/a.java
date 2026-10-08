package nr0;

import er0.BEDocumentToDownload;
import fr0.BEAsyncDocumentGenerationResult;
import fr0.BEAsyncErrorResponse;
import gr0.DocumentSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import or0.AsyncDocumentGenerationResultDtoDto;
import or0.AsyncErrorResponseDtoDto;
import or0.DocumentSchemaDtoDto;
import or0.DocumentToDownloadDtoDto;
import or0.LabelDtoDto;
import or0.MultiDocumentSchemaDtoDto;
import or0.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lor0/d;", "Lfr0/d;", "c", "(Lor0/d;)Lfr0/d;", "Lor0/e;", "Lfr0/e;", "d", "(Lor0/e;)Lfr0/e;", "Lor0/i0;", "Ler0/d;", "a", "(Lor0/i0;)Ler0/d;", "Lor0/p;", "Lfr0/d$a;", "b", "(Lor0/p;)Lfr0/d$a;", "offlinedocumentsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: nr0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3400a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137834a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.TO_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ALREADY_DOWNLOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.CREATING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.ALL_DOWNLOADED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.MULTI_DOCUMENT_GENERATION_FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.RETRY_GLOBAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.TERMINAL_GLOBAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f137834a = iArr;
        }
    }

    public static final BEDocumentToDownload a(DocumentToDownloadDtoDto documentToDownloadDtoDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String documentId = documentToDownloadDtoDto.getDocumentId();
        rq0.b bVarI = g.i(documentToDownloadDtoDto.getDocumentType(), documentToDownloadDtoDto.getSubtype());
        String encryptedScopes = documentToDownloadDtoDto.getEncryptedScopes();
        String subtype = documentToDownloadDtoDto.getSubtype();
        LocalDate expirationDate = documentToDownloadDtoDto.getExpirationDate();
        ArrayList arrayList3 = null;
        fz.b.LocalDate localDate = expirationDate != null ? new fz.b.LocalDate(expirationDate) : null;
        List<LabelDtoDto> listA = documentToDownloadDtoDto.a();
        if (listA != null) {
            List<LabelDtoDto> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e.c((LabelDtoDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<LabelDtoDto> listI = documentToDownloadDtoDto.i();
        if (listI != null) {
            List<LabelDtoDto> list2 = listI;
            arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(e.c((LabelDtoDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<LabelDtoDto> listF = documentToDownloadDtoDto.f();
        if (listF != null) {
            List<LabelDtoDto> list3 = listF;
            arrayList3 = new ArrayList(v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(e.c((LabelDtoDto) it5.next()));
            }
        }
        return new BEDocumentToDownload(documentId, bVarI, subtype, encryptedScopes, localDate, arrayList, arrayList2, arrayList3, documentToDownloadDtoDto.getParentDocumentId(), documentToDownloadDtoDto.h());
    }

    public static final BEAsyncDocumentGenerationResult.a b(p pVar) {
        switch (C3400a.f137834a[pVar.ordinal()]) {
            case 1:
                return BEAsyncDocumentGenerationResult.a.TO_DOWNLOAD;
            case 2:
                return BEAsyncDocumentGenerationResult.a.ALREADY_DOWNLOADED;
            case 3:
                return BEAsyncDocumentGenerationResult.a.CREATING_ERROR;
            case 4:
                return BEAsyncDocumentGenerationResult.a.ALL_DOWNLOADED;
            case 5:
                return BEAsyncDocumentGenerationResult.a.MULTI_DOCUMENT_GENERATION_FINISHED;
            case 6:
                return BEAsyncDocumentGenerationResult.a.RETRY_GLOBAL_ERROR;
            case 7:
                return BEAsyncDocumentGenerationResult.a.TERMINAL_GLOBAL_ERROR;
            case 8:
                return BEAsyncDocumentGenerationResult.a.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final BEAsyncDocumentGenerationResult c(AsyncDocumentGenerationResultDtoDto asyncDocumentGenerationResultDtoDto) {
        BEAsyncDocumentGenerationResult.a aVarB = b(asyncDocumentGenerationResultDtoDto.getStatus());
        DocumentToDownloadDtoDto documentToDownload = asyncDocumentGenerationResultDtoDto.getDocumentToDownload();
        BEDocumentToDownload bEDocumentToDownloadA = documentToDownload != null ? a(documentToDownload) : null;
        AsyncErrorResponseDtoDto downloadingErrorMessage = asyncDocumentGenerationResultDtoDto.getDownloadingErrorMessage();
        BEAsyncErrorResponse bEAsyncErrorResponseD = downloadingErrorMessage != null ? d(downloadingErrorMessage) : null;
        DocumentSchemaDtoDto documentSchema = asyncDocumentGenerationResultDtoDto.getDocumentSchema();
        DocumentSchema documentSchemaF = documentSchema != null ? d.f(documentSchema) : null;
        MultiDocumentSchemaDtoDto multiDocumentSchema = asyncDocumentGenerationResultDtoDto.getMultiDocumentSchema();
        return new BEAsyncDocumentGenerationResult(aVarB, bEDocumentToDownloadA, bEAsyncErrorResponseD, documentSchemaF, multiDocumentSchema != null ? d.w(multiDocumentSchema) : null);
    }

    public static final BEAsyncErrorResponse d(AsyncErrorResponseDtoDto asyncErrorResponseDtoDto) {
        return new BEAsyncErrorResponse(asyncErrorResponseDtoDto.getBusinessCode(), asyncErrorResponseDtoDto.getTechnicalCode(), asyncErrorResponseDtoDto.getMessage(), asyncErrorResponseDtoDto.getTitle(), asyncErrorResponseDtoDto.getTraceId());
    }
}
