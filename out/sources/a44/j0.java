package a44;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k34.DocumentSummaryData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"La44/j0;", "Lq34/j0;", "Lu34/b;", "documentsSummaryLocalRepository", "Lez/c;", "dateConverter", "Lac4/d;", "getCurrentServerTimeUseCase", "<init>", "(Lu34/b;Lez/c;Lac4/d;)V", "Lq34/j0$a;", "params", "Ldx/i;", "Ldx/b;", "Ler0/h;", "d", "(Lq34/j0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lu34/b;", "b", "Lez/c;", "c", "Lac4/d;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 implements q34.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u34.b documentsSummaryLocalRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3104f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3106h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3104f = obj;
            this.f3106h |= PKIFailureInfo.systemUnavail;
            return j0.this.c(null, this);
        }
    }

    public j0(u34.b bVar, ez.c cVar, ac4.d dVar) {
        this.documentsSummaryLocalRepository = bVar;
        this.dateConverter = cVar;
        this.getCurrentServerTimeUseCase = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x013f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:0: B:50:0x00de->B:82:?, LOOP_END, SYNTHETIC] */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.j0.a aVar, tq.e<? super dx.i<? extends dx.b, ? extends er0.h>> eVar) throws Throwable {
        a aVar2;
        OffsetDateTime offsetDateTimeA;
        Object objF;
        Object next;
        er0.h documentStatus;
        LocalDate date;
        LocalDate date2;
        Iterator it;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f3106h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f3106h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object obj = aVar2.f3104f;
        Object objE = uq.b.e();
        int i16 = aVar2.f3106h;
        if (i16 == 0) {
            oq.u.b(obj);
            offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
            Date expirationDate = aVar.getExpirationDate();
            if (expirationDate != null && expirationDate.before(this.dateConverter.f(offsetDateTimeA.toLocalDate()))) {
                return new dx.i.Right(er0.h.EXPIRED);
            }
            u34.b bVar = this.documentsSummaryLocalRepository;
            rq0.b documentType = aVar.getDocumentType();
            aVar2.f3102d = aVar;
            aVar2.f3103e = offsetDateTimeA;
            aVar2.f3106h = 1;
            objF = bVar.f(documentType, aVar2);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OffsetDateTime offsetDateTime = (OffsetDateTime) aVar2.f3103e;
            q34.j0.a aVar3 = (q34.j0.a) aVar2.f3102d;
            oq.u.b(obj);
            offsetDateTimeA = offsetDateTime;
            aVar = aVar3;
            objF = obj;
        }
        dx.i iVar = (dx.i) objF;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        if (aVar.getDocumentIid() == null) {
            List list2 = list;
            boolean z15 = list2 instanceof Collection;
            if (!z15 || !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    fz.b.LocalDate expirationDate2 = ((DocumentSummaryData) it4.next()).getExpirationDate();
                    if (expirationDate2 != null && (date2 = expirationDate2.getDate()) != null && date2.isBefore(offsetDateTimeA.toLocalDate())) {
                        documentStatus = er0.h.EXPIRED;
                    }
                }
                if (z15 || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((DocumentSummaryData) it.next()).getDocumentStatus() != er0.h.ACTIVE) {
                            documentStatus = er0.h.INACTIVE;
                        }
                    }
                    documentStatus = er0.h.ACTIVE;
                } else {
                    documentStatus = er0.h.ACTIVE;
                }
            } else if (z15) {
                it = list2.iterator();
                while (it.hasNext()) {
                    if (((DocumentSummaryData) it.next()).getDocumentStatus() != er0.h.ACTIVE) {
                        documentStatus = er0.h.INACTIVE;
                    }
                }
                documentStatus = er0.h.ACTIVE;
            } else {
                it = list2.iterator();
                while (it.hasNext()) {
                    if (((DocumentSummaryData) it.next()).getDocumentStatus() != er0.h.ACTIVE) {
                        documentStatus = er0.h.INACTIVE;
                    }
                }
                documentStatus = er0.h.ACTIVE;
            }
        } else {
            Iterator it5 = list.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (!fr.t.c(((DocumentSummaryData) next).getDocumentIID(), aVar.getDocumentIid()));
            DocumentSummaryData documentSummaryData = (DocumentSummaryData) next;
            if (documentSummaryData == null) {
                documentStatus = er0.h.ACTIVE;
            } else {
                fz.b.LocalDate expirationDate3 = documentSummaryData.getExpirationDate();
                documentStatus = (expirationDate3 == null || (date = expirationDate3.getDate()) == null || !date.isBefore(offsetDateTimeA.toLocalDate())) ? documentSummaryData.getDocumentStatus() : er0.h.EXPIRED;
                if (documentStatus == null) {
                    documentStatus = er0.h.ACTIVE;
                }
            }
        }
        return new dx.i.Right(documentStatus);
    }
}
