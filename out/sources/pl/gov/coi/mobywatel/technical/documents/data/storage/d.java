package pl.gov.coi.mobywatel.technical.documents.data.storage;

import ay.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k34.o;
import mu.a0;
import mu.h0;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0017\u001a\u00020\r2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00140\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u0013J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001f\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/storage/d;", "Lpl/gov/coi/mobywatel/technical/documents/data/storage/b;", "Lcz/c;", "storageFactory", "Lay/j;", "jsonSerializer", "<init>", "(Lcz/c;Lay/j;)V", "Lmu/g;", "Lk34/o;", "b", "()Lmu/g;", "value", "Loq/i0;", "c", "(Lk34/o;Ltq/e;)Ljava/lang/Object;", "", "Lrq0/b;", "e", "(Ltq/e;)Ljava/lang/Object;", "", "Lk34/n;", "data", "d", "(Ljava/util/Map;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "f", "documentType", "g", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "a", "Lay/j;", "Lmu/a0;", "Lmu/a0;", "documentSummaryDataChanged", "Lcz/b;", "Loq/k;", "i", "()Lcz/b;", "storage", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements pl.gov.coi.mobywatel.technical.documents.data.storage.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0<o> documentSummaryDataChanged = h0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f159165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f159166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f159167f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f159168g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f159169h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f159170j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f159171k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f159172l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f159173m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f159174n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f159175p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f159176q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f159177r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f159178s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f159179t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f159180v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f159182x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159180v = obj;
            this.f159182x |= PKIFailureInfo.systemUnavail;
            return d.this.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f159183d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f159185f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159183d = obj;
            this.f159185f |= PKIFailureInfo.systemUnavail;
            return d.this.e(this);
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.documents.data.storage.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3946d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f159186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f159187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f159188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f159189g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f159190h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f159191j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f159192k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f159193l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f159194m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f159196p;

        C3946d(tq.e<? super C3946d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159194m = obj;
            this.f159196p |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    public d(final cz.c cVar, j jVar) {
        this.jsonSerializer = jVar;
        this.storage = l.a(new er.a() { // from class: pl.gov.coi.mobywatel.technical.documents.data.storage.c
            @Override // er.a
            public final Object a() {
                return d.j(cVar);
            }
        });
    }

    private final cz.b i() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b j(cz.c cVar) {
        return cVar.a("ESP_DOCUMENTS_SUMMARY_LOCAL_FILE_NAME", cz.d.ENCRYPTED);
    }

    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.b
    public Object a(tq.e<? super i0> eVar) {
        Object objA = i().a(eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.b
    public mu.g<o> b() {
        return this.documentSummaryDataChanged;
    }

    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.b
    public Object c(o oVar, tq.e<? super i0> eVar) {
        Object objF = this.documentSummaryDataChanged.F(oVar, eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x009f A[LOOP:0: B:18:0x0099->B:20:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e8 -> B:24:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.b
    public java.lang.Object d(java.util.Map<rq0.b, ? extends java.util.List<k34.DocumentSummaryData>> r18, tq.e<? super oq.i0> r19) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.documents.data.storage.d.d(java.util.Map, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.b
    public Object e(tq.e<? super List<? extends rq0.b>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f159185f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f159185f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objI = cVar.f159183d;
        Object objE = uq.b.e();
        int i16 = cVar.f159185f;
        if (i16 == 0) {
            u.b(objI);
            cz.b bVarI = i();
            cVar.f159185f = 1;
            objI = bVarI.i(cVar);
            if (objI == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objI);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objI).iterator();
        while (it.hasNext()) {
            rq0.b bVarA = rq0.b.INSTANCE.a(((cz.b.a) it.next()).getKey());
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0104  */
    /* JADX WARN: Code duplicated, block: B:35:0x0152  */
    /* JADX WARN: Code duplicated, block: B:38:0x0166 A[Catch: CancellationException -> 0x00bb, Exception -> 0x019f, TryCatch #0 {Exception -> 0x019f, blocks: (B:36:0x0162, B:38:0x0166, B:39:0x0177, B:41:0x017d, B:44:0x01b3, B:46:0x01bb, B:47:0x01c0, B:48:0x01c7), top: B:68:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x017d A[Catch: CancellationException -> 0x00bb, Exception -> 0x019f, LOOP:0: B:39:0x0177->B:41:0x017d, LOOP_END, TryCatch #0 {Exception -> 0x019f, blocks: (B:36:0x0162, B:38:0x0166, B:39:0x0177, B:41:0x017d, B:44:0x01b3, B:46:0x01bb, B:47:0x01c0, B:48:0x01c7), top: B:68:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x01bb A[Catch: CancellationException -> 0x00bb, Exception -> 0x019f, TryCatch #0 {Exception -> 0x019f, blocks: (B:36:0x0162, B:38:0x0166, B:39:0x0177, B:41:0x017d, B:44:0x01b3, B:46:0x01bb, B:47:0x01c0, B:48:0x01c7), top: B:68:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01c0 A[Catch: CancellationException -> 0x00bb, Exception -> 0x019f, TryCatch #0 {Exception -> 0x019f, blocks: (B:36:0x0162, B:38:0x0166, B:39:0x0177, B:41:0x017d, B:44:0x01b3, B:46:0x01bb, B:47:0x01c0, B:48:0x01c7), top: B:68:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x022b  */
    /* JADX WARN: Code duplicated, block: B:60:0x024b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, dx.b$i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x022b -> B:58:0x0233). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.b
    public java.lang.Object f(tq.e<? super dx.i<? extends dx.b, ? extends java.util.Map<rq0.b, ? extends java.util.List<k34.DocumentSummaryData>>>> r25) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.documents.data.storage.d.f(tq.e):java.lang.Object");
    }

    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.b
    public Object g(rq0.b bVar, tq.e<? super i0> eVar) {
        Object objK = i().k(cz.b.a.b(bVar.getReferenceName()), eVar);
        return objK == uq.b.e() ? objK : i0.f148189a;
    }
}
