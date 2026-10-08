package ff0;

import cf0.AsyncDocumentToGenerate;
import cf0.AsyncErrorResponse;
import cf0.DownloadTaskData;
import gf0.AsyncErrorResponseDto;
import gf0.DocumentToGenerateEntity;
import gf0.DownloadTaskDataEntity;
import iy.b0;
import iy.c0;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0006*\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\f*\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u001b\u001a\u00020\u0012*\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010!\u001a\u00020 *\u00020\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u001e¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010#\u001a\u00020\u001d*\u00020 ¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lgf0/e;", "Lcf0/c;", "b", "(Lgf0/e;)Lcf0/c;", "i", "(Lcf0/c;)Lgf0/e;", "Lgf0/b;", "Lcf0/a;", "a", "(Lgf0/b;)Lcf0/a;", "g", "(Lcf0/a;)Lgf0/b;", "Lgf0/a;", "Lcf0/d;", "c", "(Lgf0/a;)Lcf0/d;", "f", "(Lcf0/d;)Lgf0/a;", "Lgf0/d;", "Loq/r;", "Lcf0/b;", "e", "(Lgf0/d;)Loq/r;", "", "taskId", "type", "documentDownloadMethod", "h", "(Lcf0/b;Ljava/lang/String;Lcf0/c;Ljava/lang/String;)Lgf0/d;", "Lgf0/g;", "", "included", "Lcf0/f;", "d", "(Lgf0/g;Ljava/util/Map;)Lcf0/f;", "j", "(Lcf0/f;)Lgf0/g;", "async_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f62169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f62170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f62171d;

        static {
            int[] iArr = new int[gf0.e.values().length];
            try {
                iArr[gf0.e.STUDENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gf0.e.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gf0.e.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gf0.e.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gf0.e.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f62168a = iArr;
            int[] iArr2 = new int[cf0.c.values().length];
            try {
                iArr2[cf0.c.JUNIOR_STUDENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[cf0.c.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[cf0.c.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[cf0.c.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f62169b = iArr2;
            int[] iArr3 = new int[gf0.b.values().length];
            try {
                iArr3[gf0.b.ALREADY_DOWNLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[gf0.b.CREATING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[gf0.b.NOT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[gf0.b.TAKES_TOO_LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f62170c = iArr3;
            int[] iArr4 = new int[cf0.a.values().length];
            try {
                iArr4[cf0.a.ALREADY_DOWNLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[cf0.a.CREATING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[cf0.a.NOT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[cf0.a.TAKES_TOO_LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            f62171d = iArr4;
        }
    }

    public static final cf0.a a(gf0.b bVar) {
        int i15 = a.f62170c[bVar.ordinal()];
        if (i15 == 1) {
            return cf0.a.ALREADY_DOWNLOADED;
        }
        if (i15 == 2) {
            return cf0.a.CREATING_ERROR;
        }
        if (i15 == 3) {
            return cf0.a.NOT_READY;
        }
        if (i15 == 4) {
            return cf0.a.TAKES_TOO_LONG;
        }
        throw new oq.p();
    }

    public static final cf0.c b(gf0.e eVar) {
        int i15 = a.f62168a[eVar.ordinal()];
        if (i15 == 1) {
            return cf0.c.JUNIOR_STUDENT_CARD;
        }
        if (i15 == 2) {
            return cf0.c.DRIVING_LICENCE;
        }
        if (i15 == 3) {
            return cf0.c.FAMILY_CARD;
        }
        if (i15 == 4) {
            return cf0.c.UUT_CARD;
        }
        if (i15 == 5) {
            return cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD;
        }
        throw new oq.p();
    }

    public static final AsyncErrorResponse c(AsyncErrorResponseDto asyncErrorResponseDto) {
        return new AsyncErrorResponse(asyncErrorResponseDto.getBusinessCode(), asyncErrorResponseDto.getTechnicalCode(), asyncErrorResponseDto.getMessage(), asyncErrorResponseDto.getTitle(), asyncErrorResponseDto.getTraceId());
    }

    public static final DownloadTaskData d(DownloadTaskDataEntity downloadTaskDataEntity, Map<cf0.c, AsyncDocumentToGenerate> map) {
        String taskId = downloadTaskDataEntity.getTaskId();
        long startTimestamp = downloadTaskDataEntity.getStartTimestamp();
        cf0.e eVarA = cf0.e.INSTANCE.a(downloadTaskDataEntity.getDocumentDownloadMethod());
        if (eVarA == null) {
            eVarA = cf0.e.FIRST_DOWNLOAD;
        }
        boolean taskCompleted = downloadTaskDataEntity.getTaskCompleted();
        String mainDocumentAuthToken = downloadTaskDataEntity.getMainDocumentAuthToken();
        return new DownloadTaskData(taskId, startTimestamp, eVarA, taskCompleted, mainDocumentAuthToken != null ? c0.g(mainDocumentAuthToken) : null, map);
    }

    public static final oq.r<cf0.c, AsyncDocumentToGenerate> e(DocumentToGenerateEntity documentToGenerateEntity) {
        cf0.c cVarB = b(documentToGenerateEntity.getDocumentType());
        String documentId = documentToGenerateEntity.getDocumentId();
        Long asyncDownloadTerminationInterval = documentToGenerateEntity.getAsyncDownloadTerminationInterval();
        long jLongValue = asyncDownloadTerminationInterval != null ? asyncDownloadTerminationInterval.longValue() : 0L;
        boolean multiDocument = documentToGenerateEntity.getMultiDocument();
        cf0.a aVarA = a(documentToGenerateEntity.getDocumentStatus());
        AsyncErrorResponseDto asyncErrorResponse = documentToGenerateEntity.getAsyncErrorResponse();
        AsyncErrorResponse asyncErrorResponseC = asyncErrorResponse != null ? c(asyncErrorResponse) : null;
        String previousDocumentId = documentToGenerateEntity.getPreviousDocumentId();
        cf0.e.Companion companion = cf0.e.INSTANCE;
        String documentDownloadMethod = documentToGenerateEntity.getDocumentDownloadMethod();
        if (documentDownloadMethod == null) {
            documentDownloadMethod = cf0.e.FIRST_DOWNLOAD.getReferenceName();
        }
        return y.a(cVarB, new AsyncDocumentToGenerate(documentId, cVarB, jLongValue, multiDocument, aVarA, asyncErrorResponseC, previousDocumentId, companion.a(documentDownloadMethod)));
    }

    public static final AsyncErrorResponseDto f(AsyncErrorResponse asyncErrorResponse) {
        return new AsyncErrorResponseDto(asyncErrorResponse.getBusinessCode(), asyncErrorResponse.getMessage(), asyncErrorResponse.getTechnicalCode(), asyncErrorResponse.getTitle(), asyncErrorResponse.getTraceId());
    }

    public static final gf0.b g(cf0.a aVar) {
        int i15 = a.f62171d[aVar.ordinal()];
        if (i15 == 1) {
            return gf0.b.ALREADY_DOWNLOADED;
        }
        if (i15 == 2) {
            return gf0.b.CREATING_ERROR;
        }
        if (i15 == 3) {
            return gf0.b.NOT_READY;
        }
        if (i15 == 4) {
            return gf0.b.TAKES_TOO_LONG;
        }
        throw new oq.p();
    }

    public static final DocumentToGenerateEntity h(AsyncDocumentToGenerate asyncDocumentToGenerate, String str, cf0.c cVar, String str2) {
        gf0.e eVarI = i(cVar);
        String documentId = asyncDocumentToGenerate.getDocumentId();
        long asyncDownloadTerminationInterval = asyncDocumentToGenerate.getAsyncDownloadTerminationInterval();
        AsyncErrorResponse asyncErrorResponse = asyncDocumentToGenerate.getAsyncErrorResponse();
        AsyncErrorResponseDto asyncErrorResponseDtoF = asyncErrorResponse != null ? f(asyncErrorResponse) : null;
        return new DocumentToGenerateEntity(0L, str, documentId, eVarI, Long.valueOf(asyncDownloadTerminationInterval), asyncDocumentToGenerate.getMultiDocument(), g(asyncDocumentToGenerate.getStatus()), asyncErrorResponseDtoF, asyncDocumentToGenerate.getPreviousDocumentId(), str2, 1, null);
    }

    public static final gf0.e i(cf0.c cVar) {
        int i15 = a.f62169b[cVar.ordinal()];
        if (i15 == 1) {
            return gf0.e.STUDENT_CARD;
        }
        if (i15 == 2) {
            return gf0.e.DRIVING_LICENCE;
        }
        if (i15 == 3) {
            return gf0.e.FAMILY_CARD;
        }
        if (i15 == 4) {
            return gf0.e.UUT_CARD;
        }
        if (i15 == 5) {
            return gf0.e.DISABLED_PERSON_IDENTIFICATION_CARD;
        }
        throw new oq.p();
    }

    public static final DownloadTaskDataEntity j(DownloadTaskData downloadTaskData) {
        String taskId = downloadTaskData.getTaskId();
        String referenceName = downloadTaskData.getDocumentDownloadMethod().getReferenceName();
        long startTimestamp = downloadTaskData.getStartTimestamp();
        boolean taskCompleted = downloadTaskData.getTaskCompleted();
        b0 mainDocumentAuthToken = downloadTaskData.getMainDocumentAuthToken();
        return new DownloadTaskDataEntity(taskId, referenceName, startTimestamp, taskCompleted, mainDocumentAuthToken != null ? c0.e(mainDocumentAuthToken) : null);
    }
}
