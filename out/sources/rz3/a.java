package rz3;

import er0.BEDocumentToGenerate;
import fr0.BEAsyncDocumentGenerationResponse;
import fr0.BEAsyncErrorResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lz3.AsyncDocumentGenerationResponse;
import lz3.AsyncErrorResponse;
import lz3.DocumentToGenerate;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfr0/c;", "Llz3/a;", "a", "(Lfr0/c;)Llz3/a;", "Ler0/e;", "Llz3/g;", "d", "(Ler0/e;)Llz3/g;", "Ler0/e$a;", "Llz3/g$a;", "c", "(Ler0/e$a;)Llz3/g$a;", "Lfr0/e;", "Llz3/b;", "b", "(Lfr0/e;)Llz3/b;", "async_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: rz3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4521a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176971a;

        static {
            int[] iArr = new int[BEDocumentToGenerate.a.values().length];
            try {
                iArr[BEDocumentToGenerate.a.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BEDocumentToGenerate.a.CREATING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BEDocumentToGenerate.a.SCOPES_CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BEDocumentToGenerate.a.SCOPES_CREATING_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BEDocumentToGenerate.a.SIGNED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BEDocumentToGenerate.a.SIGNING_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BEDocumentToGenerate.a.READY_FOR_DOWNLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BEDocumentToGenerate.a.ENCRYPTING_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BEDocumentToGenerate.a.DOWNLOADED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BEDocumentToGenerate.a.DOWNLOADING_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BEDocumentToGenerate.a.MULTI_DOCUMENT_GENERATION_FINISHED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BEDocumentToGenerate.a.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f176971a = iArr;
        }
    }

    public static final AsyncDocumentGenerationResponse a(BEAsyncDocumentGenerationResponse bEAsyncDocumentGenerationResponse) {
        String taskId = bEAsyncDocumentGenerationResponse.getTaskId();
        List<BEDocumentToGenerate> listA = bEAsyncDocumentGenerationResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(d((BEDocumentToGenerate) it.next()));
        }
        return new AsyncDocumentGenerationResponse(taskId, arrayList);
    }

    public static final AsyncErrorResponse b(BEAsyncErrorResponse bEAsyncErrorResponse) {
        return new AsyncErrorResponse(bEAsyncErrorResponse.getBusinessCode(), bEAsyncErrorResponse.getTechnicalCode(), bEAsyncErrorResponse.getMessage(), bEAsyncErrorResponse.getTitle(), bEAsyncErrorResponse.getTraceId());
    }

    public static final DocumentToGenerate.a c(BEDocumentToGenerate.a aVar) {
        switch (C4521a.f176971a[aVar.ordinal()]) {
            case 1:
                return DocumentToGenerate.a.CREATED;
            case 2:
                return DocumentToGenerate.a.CREATING_ERROR;
            case 3:
                return DocumentToGenerate.a.SCOPES_CREATED;
            case 4:
                return DocumentToGenerate.a.SCOPES_CREATING_ERROR;
            case 5:
                return DocumentToGenerate.a.SIGNED;
            case 6:
                return DocumentToGenerate.a.SIGNING_ERROR;
            case 7:
                return DocumentToGenerate.a.READY_FOR_DOWNLOAD;
            case 8:
                return DocumentToGenerate.a.ENCRYPTING_ERROR;
            case 9:
                return DocumentToGenerate.a.DOWNLOADED;
            case 10:
                return DocumentToGenerate.a.DOWNLOADING_ERROR;
            case 11:
                return DocumentToGenerate.a.MULTI_DOCUMENT_GENERATION_FINISHED;
            case 12:
                return DocumentToGenerate.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final DocumentToGenerate d(BEDocumentToGenerate bEDocumentToGenerate) {
        return new DocumentToGenerate(bEDocumentToGenerate.getAsyncDownloadTerminationInterval(), bEDocumentToGenerate.getDocumentId(), bEDocumentToGenerate.getDocumentType(), c(bEDocumentToGenerate.getGenerationStatus()), bEDocumentToGenerate.getSubType(), bEDocumentToGenerate.getMultiDocument());
    }
}
