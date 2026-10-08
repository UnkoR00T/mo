package pl.gov.coi.mobywatel.technical.async.data.storage;

import ay.j;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lz3.DocumentDownloadSingleStatus;
import lz3.DocumentDownloadStatus;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0012*\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b$\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lpl/gov/coi/mobywatel/technical/async/data/storage/f;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/d;", "Lcz/c;", "storageFactory", "Lay/j;", "jsonSerializer", "<init>", "(Lcz/c;Lay/j;)V", "Lrq0/b;", "documentType", "Llz3/h;", "oldStatus", "Llz3/f;", "d", "(Lrq0/b;Llz3/h;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/c;", "l", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/c;)Llz3/f;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/b;", "Llz3/e;", "f", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/b;)Llz3/e;", "n", "(Llz3/f;)Lpl/gov/coi/mobywatel/technical/async/data/storage/c;", "m", "(Llz3/e;)Lpl/gov/coi/mobywatel/technical/async/data/storage/b;", "documentDownloadStatus", "Loq/i0;", "i", "(Lrq0/b;Llz3/f;Ltq/e;)Ljava/lang/Object;", "", "j", "(Ltq/e;)Ljava/lang/Object;", "h", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "k", "g", "a", "Lay/j;", "Lcz/b;", "b", "Loq/k;", "c", "()Lcz/b;", "storage", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements pl.gov.coi.mobywatel.technical.async.data.storage.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        int A;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158877h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158878j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158879k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158880l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f158881m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f158882n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f158883p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f158884q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f158885r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f158886s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f158887t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f158888v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f158889w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f158890x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f158891y;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158891y = obj;
            this.A |= PKIFailureInfo.systemUnavail;
            return f.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158896g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158897h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f158898j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158900l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158898j = obj;
            this.f158900l |= PKIFailureInfo.systemUnavail;
            return f.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f158903f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158905h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158903f = obj;
            this.f158905h |= PKIFailureInfo.systemUnavail;
            return f.this.d(null, null, this);
        }
    }

    public f(final cz.c cVar, j jVar) {
        this.jsonSerializer = jVar;
        this.storage = l.a(new er.a() { // from class: pl.gov.coi.mobywatel.technical.async.data.storage.e
            @Override // er.a
            public final Object a() {
                return f.e(cVar);
            }
        });
    }

    private final cz.b c() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(rq0.b bVar, lz3.h hVar, tq.e<? super DocumentDownloadStatus> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f158905h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f158905h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f158903f;
        Object objE = uq.b.e();
        int i16 = dVar.f158905h;
        if (i16 == 0) {
            u.b(obj);
            DocumentDownloadStatus documentDownloadStatus = new DocumentDownloadStatus(v.e(new DocumentDownloadSingleStatus(bVar, "", hVar)));
            dVar.f158901d = bVar;
            dVar.f158902e = vq.j.a(hVar);
            dVar.f158905h = 1;
            if (i(bVar, documentDownloadStatus, dVar) != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return obj;
        }
        hVar = (lz3.h) dVar.f158902e;
        bVar = (rq0.b) dVar.f158901d;
        u.b(obj);
        dVar.f158901d = vq.j.a(bVar);
        dVar.f158902e = vq.j.a(hVar);
        dVar.f158905h = 2;
        Object objH = h(bVar, dVar);
        return objH == objE ? objE : objH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b e(cz.c cVar) {
        return cVar.a("shared_prefs_documents_status", cz.d.ENCRYPTED);
    }

    private final DocumentDownloadSingleStatus f(DocumentDownloadSingleStatusDto documentDownloadSingleStatusDto) throws Exception {
        String documentIID = documentDownloadSingleStatusDto.getDocumentIID();
        rq0.b bVarA = rq0.b.INSTANCE.a(documentDownloadSingleStatusDto.getDocumentType());
        if (bVarA != null) {
            return new DocumentDownloadSingleStatus(bVarA, documentIID, documentDownloadSingleStatusDto.getStatus());
        }
        throw new Exception("Invalid documentType");
    }

    private final DocumentDownloadStatus l(DocumentDownloadStatusDto documentDownloadStatusDto) {
        List<DocumentDownloadSingleStatusDto> listA = documentDownloadStatusDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f((DocumentDownloadSingleStatusDto) it.next()));
        }
        return new DocumentDownloadStatus(arrayList);
    }

    private final DocumentDownloadSingleStatusDto m(DocumentDownloadSingleStatus documentDownloadSingleStatus) {
        return new DocumentDownloadSingleStatusDto(documentDownloadSingleStatus.getDocumentType().getReferenceName(), documentDownloadSingleStatus.getDocumentIID(), documentDownloadSingleStatus.getStatus());
    }

    private final DocumentDownloadStatusDto n(DocumentDownloadStatus documentDownloadStatus) {
        List<DocumentDownloadSingleStatus> listB = documentDownloadStatus.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(m((DocumentDownloadSingleStatus) it.next()));
        }
        return new DocumentDownloadStatusDto(arrayList);
    }

    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.d
    public Object g(tq.e<? super i0> eVar) {
        Object objA = c().a(eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        if (k(r6, r0) == r1) goto L49;
     */
    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(rq0.b r10, tq.e<? super lz3.DocumentDownloadStatus> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.data.storage.f.h(rq0.b, tq.e):java.lang.Object");
    }

    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.d
    public Object i(rq0.b bVar, DocumentDownloadStatus documentDownloadStatus, tq.e<? super i0> eVar) {
        Object objE = c().e(cz.b.a.b(bVar.getReferenceName()), this.jsonSerializer.b(n(documentDownloadStatus), q0.n(DocumentDownloadStatusDto.class)), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x011f  */
    /* JADX WARN: Code duplicated, block: B:30:0x012e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0132  */
    /* JADX WARN: Code duplicated, block: B:33:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0291  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0279 -> B:66:0x0283). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.d
    public java.lang.Object j(tq.e<? super java.util.Map<rq0.b, lz3.DocumentDownloadStatus>> r25) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.data.storage.f.j(tq.e):java.lang.Object");
    }

    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.d
    public Object k(rq0.b bVar, tq.e<? super i0> eVar) {
        Object objK = c().k(cz.b.a.b(bVar.getReferenceName()), eVar);
        return objK == uq.b.e() ? objK : i0.f148189a;
    }
}
