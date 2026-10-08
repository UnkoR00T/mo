package pl.gov.coi.mjunior.technical.async.data.storage;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import fr.k;
import gf0.AsyncErrorResponseDto;
import gf0.DocumentToGenerateEntity;
import gf0.DownloadTaskDataEntity;
import gf0.c;
import gf0.f;
import hf0.DownloadTaskWithDocuments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mu.g;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import ta.m;
import ta.q;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 K2\u00020\u0001:\u0001BB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\tH\u0096@¢\u0006\u0004\b\"\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u001d\u001a\u00020\tH\u0096@¢\u0006\u0004\b#\u0010 J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0$2\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0$2\u0006\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010&J\u001b\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140$H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rH\u0096@¢\u0006\u0004\b+\u0010\u001cJ\u0018\u0010,\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\tH\u0096@¢\u0006\u0004\b,\u0010 J\u0018\u0010-\u001a\u00020\r2\u0006\u0010'\u001a\u00020\tH\u0096@¢\u0006\u0004\b-\u0010 J(\u00102\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b2\u00103J \u00105\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u00104\u001a\u00020!H\u0096@¢\u0006\u0004\b5\u00106JR\u0010<\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\b\u00107\u001a\u0004\u0018\u00010\t2\b\u00108\u001a\u0004\u0018\u00010\t2\b\u00109\u001a\u0004\u0018\u00010\t2\b\u0010:\u001a\u0004\u0018\u00010\t2\b\u0010;\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lpl/gov/coi/mjunior/technical/async/data/storage/a;", "Lff0/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lya/b;", "_connection", "Lr0/a;", "", "", "Lgf0/d;", "_map", "Loq/i0;", i.f37087n, "(Lya/b;Lr0/a;)V", "Lgf0/g;", "task", "l", "(Lgf0/g;Ltq/e;)Ljava/lang/Object;", "", "docs", "m", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "documents", "o", "(Lgf0/g;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "q", "(Ltq/e;)Ljava/lang/Object;", "taskId", "Lhf0/a;", "u", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "p", "r", "Lmu/g;", "s", "(Ljava/lang/String;)Lmu/g;", "documentId", "h", "d", "()Lmu/g;", "a", "n", "b", "Lgf0/e;", "docType", "Lgf0/b;", "status", "t", "(Ljava/lang/String;Lgf0/e;Lgf0/b;Ltq/e;)Ljava/lang/Object;", "isCompleted", "i", "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "businessCode", "message", "technicalCode", "title", "traceId", "k", "(Ljava/lang/String;Lgf0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfDownloadTaskDataEntity", "c", "__insertAdapterOfDocumentToGenerateEntity", "Lgf0/f;", "Lgf0/f;", "__documentTypeDtoConverter", "Lgf0/c;", "e", "Lgf0/c;", "__documentStatusDtoConverter", "f", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ff0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f __documentTypeDtoConverter = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c __documentStatusDtoConverter = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<DownloadTaskDataEntity> __insertAdapterOfDownloadTaskDataEntity = new C3926a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oa.f<DocumentToGenerateEntity> __insertAdapterOfDocumentToGenerateEntity = new b();

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.async.data.storage.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mjunior/technical/async/data/storage/a$a", "Loa/f;", "Lgf0/g;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lgf0/g;)V", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3926a extends oa.f<DownloadTaskDataEntity> {
        C3926a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `download_task_data` (`taskId`,`documentDownloadMethod`,`startTimestamp`,`taskCompleted`,`mainDocumentAuthToken`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, DownloadTaskDataEntity entity) {
            statement.S0(1, entity.getTaskId());
            statement.S0(2, entity.getDocumentDownloadMethod());
            statement.f0(3, entity.getStartTimestamp());
            statement.f0(4, entity.getTaskCompleted() ? 1L : 0L);
            String mainDocumentAuthToken = entity.getMainDocumentAuthToken();
            if (mainDocumentAuthToken == null) {
                statement.i0(5);
            } else {
                statement.S0(5, mainDocumentAuthToken);
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mjunior/technical/async/data/storage/a$b", "Loa/f;", "Lgf0/d;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lgf0/d;)V", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends oa.f<DocumentToGenerateEntity> {
        b() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `included_documents` (`id`,`taskOwnerId`,`documentId`,`documentType`,`asyncDownloadTerminationInterval`,`multiDocument`,`documentStatus`,`previousDocumentId`,`documentDownloadMethod`,`error_businessCode`,`error_message`,`error_technicalCode`,`error_title`,`error_traceId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, DocumentToGenerateEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getTaskOwnerId());
            statement.S0(3, entity.getDocumentId());
            String strA = a.this.__documentTypeDtoConverter.a(entity.getDocumentType());
            if (strA == null) {
                statement.i0(4);
            } else {
                statement.S0(4, strA);
            }
            Long asyncDownloadTerminationInterval = entity.getAsyncDownloadTerminationInterval();
            if (asyncDownloadTerminationInterval == null) {
                statement.i0(5);
            } else {
                statement.f0(5, asyncDownloadTerminationInterval.longValue());
            }
            statement.f0(6, entity.getMultiDocument() ? 1L : 0L);
            String strA2 = a.this.__documentStatusDtoConverter.a(entity.getDocumentStatus());
            if (strA2 == null) {
                statement.i0(7);
            } else {
                statement.S0(7, strA2);
            }
            String previousDocumentId = entity.getPreviousDocumentId();
            if (previousDocumentId == null) {
                statement.i0(8);
            } else {
                statement.S0(8, previousDocumentId);
            }
            String documentDownloadMethod = entity.getDocumentDownloadMethod();
            if (documentDownloadMethod == null) {
                statement.i0(9);
            } else {
                statement.S0(9, documentDownloadMethod);
            }
            AsyncErrorResponseDto asyncErrorResponse = entity.getAsyncErrorResponse();
            if (asyncErrorResponse == null) {
                statement.i0(10);
                statement.i0(11);
                statement.i0(12);
                statement.i0(13);
                statement.i0(14);
                return;
            }
            String businessCode = asyncErrorResponse.getBusinessCode();
            if (businessCode == null) {
                statement.i0(10);
            } else {
                statement.S0(10, businessCode);
            }
            String message = asyncErrorResponse.getMessage();
            if (message == null) {
                statement.i0(11);
            } else {
                statement.S0(11, message);
            }
            String technicalCode = asyncErrorResponse.getTechnicalCode();
            if (technicalCode == null) {
                statement.i0(12);
            } else {
                statement.S0(12, technicalCode);
            }
            String title = asyncErrorResponse.getTitle();
            if (title == null) {
                statement.i0(13);
            } else {
                statement.S0(13, title);
            }
            String traceId = asyncErrorResponse.getTraceId();
            if (traceId == null) {
                statement.i0(14);
            } else {
                statement.S0(14, traceId);
            }
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.async.data.storage.a$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mjunior/technical/async/data/storage/a$c;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List<mr.c<?>> a() {
            return v.n();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158252e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DownloadTaskDataEntity f158254g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<DocumentToGenerateEntity> f158255h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(DownloadTaskDataEntity downloadTaskDataEntity, List<DocumentToGenerateEntity> list, e<? super d> eVar) {
            super(1, eVar);
            this.f158254g = downloadTaskDataEntity;
            this.f158255h = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158252e;
            if (i15 == 0) {
                oq.u.b(obj);
                a aVar = a.this;
                DownloadTaskDataEntity downloadTaskDataEntity = this.f158254g;
                List<DocumentToGenerateEntity> list = this.f158255h;
                this.f158252e = 1;
                if (a.super.o(downloadTaskDataEntity, list, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final e<i0> M(e<?> eVar) {
            return a.this.new d(this.f158254g, this.f158255h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i0> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public a(u uVar) {
        this.__db = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void H(final ya.b _connection, r0.a<String, List<DocumentToGenerateEntity>> _map) {
        AsyncErrorResponseDto asyncErrorResponseDto;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i15 = 1;
        if (_map.getSize() > 999) {
            ta.i.a(_map, true, new l() { // from class: ff0.c
                @Override // er.l
                public final Object b(Object obj) {
                    return pl.gov.coi.mjunior.technical.async.data.storage.a.I(this.f62125a, _connection, (r0.a) obj);
                }
            });
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT `id`,`taskOwnerId`,`documentId`,`documentType`,`asyncDownloadTerminationInterval`,`multiDocument`,`documentStatus`,`previousDocumentId`,`documentDownloadMethod`,`error_businessCode`,`error_message`,`error_technicalCode`,`error_title`,`error_traceId` FROM `included_documents` WHERE `taskOwnerId` IN (");
        q.a(sb5, setKeySet.size());
        sb5.append(")");
        ya.d dVarE4 = _connection.e4(sb5.toString());
        Iterator<String> it = setKeySet.iterator();
        int i16 = 1;
        while (it.hasNext()) {
            dVarE4.S0(i16, it.next());
            i16++;
        }
        try {
            int iC = m.c(dVarE4, "taskOwnerId");
            if (iC == -1) {
                dVarE4.close();
                return;
            }
            while (dVarE4.Y3()) {
                List<DocumentToGenerateEntity> list = _map.get(dVarE4.u3(iC));
                if (list != null) {
                    long j15 = dVarE4.getLong(0);
                    String strU3 = dVarE4.u3(i15);
                    String strU4 = dVarE4.u3(2);
                    gf0.e eVarB = this.__documentTypeDtoConverter.b(dVarE4.isNull(3) ? null : dVarE4.u3(3));
                    if (eVarB == null) {
                        throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.async.`data`.storage.entity.DocumentTypeDto', but it was NULL.");
                    }
                    Long lValueOf = dVarE4.isNull(4) ? null : Long.valueOf(dVarE4.getLong(4));
                    boolean z15 = ((int) dVarE4.getLong(5)) != 0 ? i15 : 0;
                    gf0.b bVarB = this.__documentStatusDtoConverter.b(dVarE4.isNull(6) ? null : dVarE4.u3(6));
                    if (bVarB == null) {
                        throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.async.`data`.storage.entity.DocumentStatusDto', but it was NULL.");
                    }
                    String strU5 = dVarE4.isNull(7) ? null : dVarE4.u3(7);
                    String strU6 = dVarE4.isNull(8) ? null : dVarE4.u3(8);
                    if (dVarE4.isNull(9) && dVarE4.isNull(10) && dVarE4.isNull(11) && dVarE4.isNull(12) && dVarE4.isNull(13)) {
                        asyncErrorResponseDto = null;
                    } else {
                        asyncErrorResponseDto = new AsyncErrorResponseDto(dVarE4.isNull(9) ? null : dVarE4.u3(9), dVarE4.isNull(10) ? null : dVarE4.u3(10), dVarE4.isNull(11) ? null : dVarE4.u3(11), dVarE4.isNull(12) ? null : dVarE4.u3(12), dVarE4.isNull(13) ? null : dVarE4.u3(13));
                    }
                    list.add(new DocumentToGenerateEntity(j15, strU3, strU4, eVarB, lValueOf, z15, bVarB, asyncErrorResponseDto, strU5, strU6));
                    i15 = 1;
                }
            }
            dVarE4.close();
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(a aVar, ya.b bVar, r0.a aVar2) {
        aVar.H(bVar, aVar2);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            boolean z15 = false;
            if (dVarE4.Y3()) {
                z15 = ((int) dVarE4.getLong(0)) != 0;
            }
            return z15;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Q(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "taskId");
            int iD2 = m.d(dVarE4, "documentDownloadMethod");
            int iD3 = m.d(dVarE4, "startTimestamp");
            int iD4 = m.d(dVarE4, "taskCompleted");
            int iD5 = m.d(dVarE4, "mainDocumentAuthToken");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                arrayList.add(new DownloadTaskDataEntity(dVarE4.u3(iD), dVarE4.u3(iD2), dVarE4.getLong(iD3), ((int) dVarE4.getLong(iD4)) != 0, dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)));
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List R(String str, String str2, a aVar, ya.b bVar) {
        int i15;
        AsyncErrorResponseDto asyncErrorResponseDto;
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "taskOwnerId");
            int iD3 = m.d(dVarE4, "documentId");
            int iD4 = m.d(dVarE4, "documentType");
            int iD5 = m.d(dVarE4, "asyncDownloadTerminationInterval");
            int iD6 = m.d(dVarE4, "multiDocument");
            int iD7 = m.d(dVarE4, "documentStatus");
            int iD8 = m.d(dVarE4, "previousDocumentId");
            int iD9 = m.d(dVarE4, "documentDownloadMethod");
            int iD10 = m.d(dVarE4, "error_businessCode");
            int iD11 = m.d(dVarE4, "error_message");
            int iD12 = m.d(dVarE4, "error_technicalCode");
            int iD13 = m.d(dVarE4, "error_title");
            int iD14 = m.d(dVarE4, "error_traceId");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                String strU4 = dVarE4.u3(iD3);
                int i16 = iD2;
                gf0.e eVarB = aVar.__documentTypeDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (eVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.async.`data`.storage.entity.DocumentTypeDto', but it was NULL.");
                }
                Long lValueOf = dVarE4.isNull(iD5) ? null : Long.valueOf(dVarE4.getLong(iD5));
                boolean z15 = ((int) dVarE4.getLong(iD6)) != 0;
                gf0.b bVarB = aVar.__documentStatusDtoConverter.b(dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7));
                if (bVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.async.`data`.storage.entity.DocumentStatusDto', but it was NULL.");
                }
                String strU5 = dVarE4.isNull(iD8) ? null : dVarE4.u3(iD8);
                String strU6 = dVarE4.isNull(iD9) ? null : dVarE4.u3(iD9);
                if (dVarE4.isNull(iD10) && dVarE4.isNull(iD11) && dVarE4.isNull(iD12) && dVarE4.isNull(iD13)) {
                    i15 = iD14;
                    if (dVarE4.isNull(i15)) {
                        asyncErrorResponseDto = null;
                    }
                    arrayList.add(new DocumentToGenerateEntity(j15, strU3, strU4, eVarB, lValueOf, z15, bVarB, asyncErrorResponseDto, strU5, strU6));
                    iD14 = i15;
                    iD2 = i16;
                    iD = iD;
                } else {
                    i15 = iD14;
                }
                asyncErrorResponseDto = new AsyncErrorResponseDto(dVarE4.isNull(iD10) ? null : dVarE4.u3(iD10), dVarE4.isNull(iD11) ? null : dVarE4.u3(iD11), dVarE4.isNull(iD12) ? null : dVarE4.u3(iD12), dVarE4.isNull(iD13) ? null : dVarE4.u3(iD13), dVarE4.isNull(i15) ? null : dVarE4.u3(i15));
                arrayList.add(new DocumentToGenerateEntity(j15, strU3, strU4, eVarB, lValueOf, z15, bVarB, asyncErrorResponseDto, strU5, strU6));
                iD14 = i15;
                iD2 = i16;
                iD = iD;
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadTaskWithDocuments S(String str, String str2, a aVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "taskId");
            int iD2 = m.d(dVarE4, "documentDownloadMethod");
            int iD3 = m.d(dVarE4, "startTimestamp");
            int iD4 = m.d(dVarE4, "taskCompleted");
            int iD5 = m.d(dVarE4, "mainDocumentAuthToken");
            r0.a<String, List<DocumentToGenerateEntity>> aVar2 = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                if (!aVar2.containsKey(strU3)) {
                    aVar2.put(strU3, new ArrayList());
                }
            }
            dVarE4.reset();
            aVar.H(bVar, aVar2);
            DownloadTaskWithDocuments downloadTaskWithDocuments = null;
            if (dVarE4.Y3()) {
                downloadTaskWithDocuments = new DownloadTaskWithDocuments(new DownloadTaskDataEntity(dVarE4.u3(iD), dVarE4.u3(iD2), dVarE4.getLong(iD3), ((int) dVarE4.getLong(iD4)) != 0, dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), (List) v0.j(aVar2, dVarE4.u3(iD)));
            }
            return downloadTaskWithDocuments;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(a aVar, List list, ya.b bVar) throws Exception {
        aVar.__insertAdapterOfDocumentToGenerateEntity.c(bVar, list);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(a aVar, DownloadTaskDataEntity downloadTaskDataEntity, ya.b bVar) throws Exception {
        aVar.__insertAdapterOfDownloadTaskDataEntity.d(bVar, downloadTaskDataEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(String str, boolean z15, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, z15 ? 1L : 0L);
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentToGenerateEntity W(String str, String str2, a aVar, ya.b bVar) {
        AsyncErrorResponseDto asyncErrorResponseDto;
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "taskOwnerId");
            int iD3 = m.d(dVarE4, "documentId");
            int iD4 = m.d(dVarE4, "documentType");
            int iD5 = m.d(dVarE4, "asyncDownloadTerminationInterval");
            int iD6 = m.d(dVarE4, "multiDocument");
            int iD7 = m.d(dVarE4, "documentStatus");
            int iD8 = m.d(dVarE4, "previousDocumentId");
            int iD9 = m.d(dVarE4, "documentDownloadMethod");
            int iD10 = m.d(dVarE4, "error_businessCode");
            int iD11 = m.d(dVarE4, "error_message");
            int iD12 = m.d(dVarE4, "error_technicalCode");
            int iD13 = m.d(dVarE4, "error_title");
            int iD14 = m.d(dVarE4, "error_traceId");
            DocumentToGenerateEntity documentToGenerateEntity = null;
            if (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                String strU4 = dVarE4.u3(iD3);
                gf0.e eVarB = aVar.__documentTypeDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (eVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.async.`data`.storage.entity.DocumentTypeDto', but it was NULL.");
                }
                Long lValueOf = dVarE4.isNull(iD5) ? null : Long.valueOf(dVarE4.getLong(iD5));
                boolean z15 = ((int) dVarE4.getLong(iD6)) != 0;
                gf0.b bVarB = aVar.__documentStatusDtoConverter.b(dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7));
                if (bVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.async.`data`.storage.entity.DocumentStatusDto', but it was NULL.");
                }
                String strU5 = dVarE4.isNull(iD8) ? null : dVarE4.u3(iD8);
                String strU6 = dVarE4.isNull(iD9) ? null : dVarE4.u3(iD9);
                if (dVarE4.isNull(iD10) && dVarE4.isNull(iD11) && dVarE4.isNull(iD12) && dVarE4.isNull(iD13) && dVarE4.isNull(iD14)) {
                    asyncErrorResponseDto = null;
                } else {
                    asyncErrorResponseDto = new AsyncErrorResponseDto(dVarE4.isNull(iD10) ? null : dVarE4.u3(iD10), dVarE4.isNull(iD11) ? null : dVarE4.u3(iD11), dVarE4.isNull(iD12) ? null : dVarE4.u3(iD12), dVarE4.isNull(iD13) ? null : dVarE4.u3(iD13), dVarE4.isNull(iD14) ? null : dVarE4.u3(iD14));
                }
                documentToGenerateEntity = new DocumentToGenerateEntity(j15, strU3, strU4, eVarB, lValueOf, z15, bVarB, asyncErrorResponseDto, strU5, strU6);
            }
            dVarE4.close();
            return documentToGenerateEntity;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List X(String str, a aVar, ya.b bVar) {
        int i15;
        AsyncErrorResponseDto asyncErrorResponseDto;
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "taskOwnerId");
            int iD3 = m.d(dVarE4, "documentId");
            int iD4 = m.d(dVarE4, "documentType");
            int iD5 = m.d(dVarE4, "asyncDownloadTerminationInterval");
            int iD6 = m.d(dVarE4, "multiDocument");
            int iD7 = m.d(dVarE4, "documentStatus");
            int iD8 = m.d(dVarE4, "previousDocumentId");
            int iD9 = m.d(dVarE4, "documentDownloadMethod");
            int iD10 = m.d(dVarE4, "error_businessCode");
            int iD11 = m.d(dVarE4, "error_message");
            int iD12 = m.d(dVarE4, "error_technicalCode");
            int iD13 = m.d(dVarE4, "error_title");
            int iD14 = m.d(dVarE4, "error_traceId");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                String strU4 = dVarE4.u3(iD3);
                int i16 = iD2;
                gf0.e eVarB = aVar.__documentTypeDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (eVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.async.`data`.storage.entity.DocumentTypeDto', but it was NULL.");
                }
                Long lValueOf = dVarE4.isNull(iD5) ? null : Long.valueOf(dVarE4.getLong(iD5));
                boolean z15 = ((int) dVarE4.getLong(iD6)) != 0;
                gf0.b bVarB = aVar.__documentStatusDtoConverter.b(dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7));
                if (bVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.async.`data`.storage.entity.DocumentStatusDto', but it was NULL.");
                }
                String strU5 = dVarE4.isNull(iD8) ? null : dVarE4.u3(iD8);
                String strU6 = dVarE4.isNull(iD9) ? null : dVarE4.u3(iD9);
                if (dVarE4.isNull(iD10) && dVarE4.isNull(iD11) && dVarE4.isNull(iD12) && dVarE4.isNull(iD13)) {
                    i15 = iD14;
                    if (dVarE4.isNull(i15)) {
                        asyncErrorResponseDto = null;
                    }
                    arrayList.add(new DocumentToGenerateEntity(j15, strU3, strU4, eVarB, lValueOf, z15, bVarB, asyncErrorResponseDto, strU5, strU6));
                    iD14 = i15;
                    iD2 = i16;
                    iD = iD;
                } else {
                    i15 = iD14;
                }
                asyncErrorResponseDto = new AsyncErrorResponseDto(dVarE4.isNull(iD10) ? null : dVarE4.u3(iD10), dVarE4.isNull(iD11) ? null : dVarE4.u3(iD11), dVarE4.isNull(iD12) ? null : dVarE4.u3(iD12), dVarE4.isNull(iD13) ? null : dVarE4.u3(iD13), dVarE4.isNull(i15) ? null : dVarE4.u3(i15));
                arrayList.add(new DocumentToGenerateEntity(j15, strU3, strU4, eVarB, lValueOf, z15, bVarB, asyncErrorResponseDto, strU5, strU6));
                iD14 = i15;
                iD2 = i16;
                iD = iD;
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadTaskWithDocuments Y(String str, String str2, a aVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "taskId");
            int iD2 = m.d(dVarE4, "documentDownloadMethod");
            int iD3 = m.d(dVarE4, "startTimestamp");
            int iD4 = m.d(dVarE4, "taskCompleted");
            int iD5 = m.d(dVarE4, "mainDocumentAuthToken");
            r0.a<String, List<DocumentToGenerateEntity>> aVar2 = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                if (!aVar2.containsKey(strU3)) {
                    aVar2.put(strU3, new ArrayList());
                }
            }
            dVarE4.reset();
            aVar.H(bVar, aVar2);
            DownloadTaskWithDocuments downloadTaskWithDocuments = null;
            if (dVarE4.Y3()) {
                downloadTaskWithDocuments = new DownloadTaskWithDocuments(new DownloadTaskDataEntity(dVarE4.u3(iD), dVarE4.u3(iD2), dVarE4.getLong(iD3), ((int) dVarE4.getLong(iD4)) != 0, dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), (List) v0.j(aVar2, dVarE4.u3(iD)));
            }
            return downloadTaskWithDocuments;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar, gf0.e eVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            if (str2 == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, str2);
            }
            if (str3 == null) {
                dVarE4.i0(2);
            } else {
                dVarE4.S0(2, str3);
            }
            if (str4 == null) {
                dVarE4.i0(3);
            } else {
                dVarE4.S0(3, str4);
            }
            if (str5 == null) {
                dVarE4.i0(4);
            } else {
                dVarE4.S0(4, str5);
            }
            if (str6 == null) {
                dVarE4.i0(5);
            } else {
                dVarE4.S0(5, str6);
            }
            dVarE4.S0(6, str7);
            String strA = aVar.__documentTypeDtoConverter.a(eVar);
            if (strA == null) {
                dVarE4.i0(7);
            } else {
                dVarE4.S0(7, strA);
            }
            dVarE4.Y3();
            dVarE4.close();
            return i0.f148189a;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(String str, a aVar, gf0.b bVar, String str2, gf0.e eVar, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            String strA = aVar.__documentStatusDtoConverter.a(bVar);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            dVarE4.S0(2, str2);
            String strA2 = aVar.__documentTypeDtoConverter.a(eVar);
            if (strA2 == null) {
                dVarE4.i0(3);
            } else {
                dVarE4.S0(3, strA2);
            }
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    @Override // ff0.a
    public Object a(e<? super i0> eVar) {
        final String str = "DELETE FROM download_task_data";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ff0.n
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.M(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ff0.a
    public Object b(final String str, e<? super i0> eVar) {
        final String str2 = "DELETE FROM included_documents WHERE documentId = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ff0.m
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.N(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ff0.a
    public g<List<DocumentToGenerateEntity>> d() {
        final String str = "SELECT * FROM included_documents";
        return qa.k.a(this.__db, false, new String[]{"included_documents"}, new l() { // from class: ff0.h
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.X(str, this, (ya.b) obj);
            }
        });
    }

    @Override // ff0.a
    public g<DocumentToGenerateEntity> h(final String documentId) {
        final String str = "SELECT * FROM included_documents WHERE documentId = ? LIMIT 1";
        return qa.k.a(this.__db, false, new String[]{"included_documents"}, new l() { // from class: ff0.i
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.W(str, documentId, this, (ya.b) obj);
            }
        });
    }

    @Override // ff0.a
    public Object i(final String str, final boolean z15, e<? super i0> eVar) {
        final String str2 = "\n    UPDATE download_task_data \n    SET taskCompleted = ? \n    WHERE taskId = ?\n";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ff0.q
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.V(str2, z15, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ff0.a
    public Object k(final String str, final gf0.e eVar, final String str2, final String str3, final String str4, final String str5, final String str6, e<? super i0> eVar2) {
        final String str7 = "UPDATE included_documents SET error_businessCode = ?, error_message = ?, error_technicalCode = ?, error_title = ?, error_traceId = ? WHERE taskOwnerId = ? AND documentType = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ff0.o
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.Z(str7, str2, str3, str4, str5, str6, str, this, eVar, (ya.b) obj);
            }
        }, eVar2);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ff0.a
    public Object l(final DownloadTaskDataEntity downloadTaskDataEntity, e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ff0.f
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.U(this.f62131a, downloadTaskDataEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ff0.a
    public Object m(final List<DocumentToGenerateEntity> list, e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ff0.g
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.T(this.f62133a, list, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ff0.a
    public Object n(final String str, e<? super i0> eVar) {
        final String str2 = "DELETE FROM download_task_data WHERE taskId = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ff0.e
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.O(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ff0.a
    public Object o(DownloadTaskDataEntity downloadTaskDataEntity, List<DocumentToGenerateEntity> list, e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new d(downloadTaskDataEntity, list, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // ff0.a
    public Object p(final String str, e<? super Boolean> eVar) {
        final String str2 = "SELECT EXISTS(SELECT 1 FROM download_task_data WHERE taskId = ?)";
        return ta.a.e(this.__db, true, false, new l() { // from class: ff0.d
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(pl.gov.coi.mjunior.technical.async.data.storage.a.P(str2, str, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // ff0.a
    public Object q(e<? super List<DownloadTaskDataEntity>> eVar) {
        final String str = "SELECT * FROM download_task_data";
        return ta.a.e(this.__db, true, false, new l() { // from class: ff0.k
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.Q(str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // ff0.a
    public Object r(final String str, e<? super List<DocumentToGenerateEntity>> eVar) {
        final String str2 = "SELECT * FROM included_documents WHERE taskOwnerId = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: ff0.j
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.R(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // ff0.a
    public g<DownloadTaskWithDocuments> s(final String taskId) {
        final String str = "SELECT * FROM download_task_data WHERE taskId = ? LIMIT 1";
        return qa.k.a(this.__db, true, new String[]{"included_documents", "download_task_data"}, new l() { // from class: ff0.b
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.Y(str, taskId, this, (ya.b) obj);
            }
        });
    }

    @Override // ff0.a
    public Object t(final String str, final gf0.e eVar, final gf0.b bVar, e<? super i0> eVar2) {
        final String str2 = "\n    UPDATE included_documents \n    SET documentStatus = ? \n    WHERE taskOwnerId = ? AND documentType = ?\n";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ff0.l
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.a0(str2, this, bVar, str, eVar, (ya.b) obj);
            }
        }, eVar2);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ff0.a
    public Object u(final String str, e<? super DownloadTaskWithDocuments> eVar) {
        final String str2 = "SELECT * FROM download_task_data WHERE taskId = ? LIMIT 1";
        return ta.a.e(this.__db, true, true, new l() { // from class: ff0.p
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.async.data.storage.a.S(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }
}
