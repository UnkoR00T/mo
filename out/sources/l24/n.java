package l24;

import java.time.LocalDate;
import java.util.List;
import m24.DocumentEntity;
import m24.DocumentSchemaEntity;
import m24.DocumentScopeEntity;
import m24.DocumentWithScopes;
import m24.DocumentWithScopesAndSchemas;
import m24.ParentDocumentWithCertificate;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityType;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0097@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0013\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b \u0010\u0019J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b&\u0010\u0019J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b'\u0010\u001dJ\u0018\u0010(\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b(\u0010\u0019J\u0018\u0010)\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b)\u0010\u001dJ \u0010,\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J \u00100\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H§@¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\u001aH§@¢\u0006\u0004\b4\u0010\u001dJ\u0018\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020!H§@¢\u0006\u0004\b6\u0010$J \u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020!2\u0006\u00105\u001a\u00020!H§@¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u0004\u0018\u00010\u00072\u0006\u0010:\u001a\u00020\u0016H§@¢\u0006\u0004\b;\u0010\u0019J\u001a\u0010<\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b<\u0010\u0019J\u001a\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b>\u0010\u0019J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b?\u0010\u001d¨\u0006@À\u0006\u0003"}, d2 = {"Ll24/n;", "", "Lm24/e;", "document", "Loq/i0;", "y", "(Lm24/e;Ltq/e;)Ljava/lang/Object;", "Lm24/i;", "documentScope", "t", "(Lm24/i;Ltq/e;)Ljava/lang/Object;", "Lm24/h;", "schema", "j", "(Lm24/h;Ltq/e;)Ljava/lang/Object;", "", "documentScopes", "v", "(Lm24/e;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "documentSchema", "s", "(Lm24/e;Ljava/util/List;Lm24/h;Ltq/e;)Ljava/lang/Object;", "", "documentId", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;", "documentType", "k", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "c", "", "certificateId", "h", "(ILtq/e;)Ljava/lang/Object;", "Lm24/j;", "f", "q", "d", "l", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;", "newStatus", "w", "(Ljava/lang/String;Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "newExpirationDate", "o", "(Ljava/lang/String;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "documentEntityType", "Lm24/l;", "n", "newId", "p", "oldId", "x", "(IILtq/e;)Ljava/lang/Object;", "scopeName", "m", "e", "Lm24/k;", "b", "u", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f115492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f115493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f115494f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f115495g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f115496h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f115497j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f115498k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f115499l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f115500m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115501n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115502p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115504r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f115502p = obj;
            this.f115504r |= PKIFailureInfo.systemUnavail;
            return n.r(n.this, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f115505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f115506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f115507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f115508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f115509h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f115510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f115511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f115512l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f115513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f115514n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f115516q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f115514n = obj;
            this.f115516q |= PKIFailureInfo.systemUnavail;
            return n.i(n.this, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x0084->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r9.y(r10, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object i(l24.n r9, m24.DocumentEntity r10, java.util.List<m24.DocumentScopeEntity> r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof l24.n.b
            if (r0 == 0) goto L13
            r0 = r12
            l24.n$b r0 = (l24.n.b) r0
            int r1 = r0.f115516q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115516q = r1
            goto L18
        L13:
            l24.n$b r0 = new l24.n$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f115514n
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f115516q
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L61
            if (r2 == r5) goto L4f
            if (r2 != r4) goto L47
            int r9 = r0.f115512l
            java.lang.Object r10 = r0.f115511k
            m24.i r10 = (m24.DocumentScopeEntity) r10
            java.lang.Object r10 = r0.f115509h
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r0.f115508g
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r2 = r0.f115507f
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.f115506e
            m24.e r5 = (m24.DocumentEntity) r5
            java.lang.Object r6 = r0.f115505d
            l24.n r6 = (l24.n) r6
            oq.u.b(r12)
            goto L84
        L47:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4f:
            java.lang.Object r9 = r0.f115507f
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r9 = r0.f115506e
            r10 = r9
            m24.e r10 = (m24.DocumentEntity) r10
            java.lang.Object r9 = r0.f115505d
            l24.n r9 = (l24.n) r9
            oq.u.b(r12)
            goto L77
        L61:
            oq.u.b(r12)
            r0.f115505d = r9
            java.lang.Object r12 = vq.j.a(r10)
            r0.f115506e = r12
            r0.f115507f = r11
            r0.f115516q = r5
            java.lang.Object r12 = r9.y(r10, r0)
            if (r12 != r1) goto L77
            goto Lbf
        L77:
            r12 = r11
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r2 = r12.iterator()
            r6 = r9
            r5 = r10
            r10 = r2
            r9 = r3
            r2 = r11
            r11 = r12
        L84:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lc0
            java.lang.Object r12 = r10.next()
            r7 = r12
            m24.i r7 = (m24.DocumentScopeEntity) r7
            r0.f115505d = r6
            java.lang.Object r8 = vq.j.a(r5)
            r0.f115506e = r8
            java.lang.Object r8 = vq.j.a(r2)
            r0.f115507f = r8
            java.lang.Object r8 = vq.j.a(r11)
            r0.f115508g = r8
            r0.f115509h = r10
            java.lang.Object r12 = vq.j.a(r12)
            r0.f115510j = r12
            java.lang.Object r12 = vq.j.a(r7)
            r0.f115511k = r12
            r0.f115512l = r9
            r0.f115513m = r3
            r0.f115516q = r4
            java.lang.Object r12 = r6.t(r7, r0)
            if (r12 != r1) goto L84
        Lbf:
            return r1
        Lc0:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l24.n.i(l24.n, m24.e, java.util.List, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:22:0x00a8->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        if (r10.y(r11, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010d, code lost:
    
        if (r7.j(r13, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object r(l24.n r10, m24.DocumentEntity r11, java.util.List<m24.DocumentScopeEntity> r12, m24.DocumentSchemaEntity r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l24.n.r(l24.n, m24.e, java.util.List, m24.h, tq.e):java.lang.Object");
    }

    Object a(tq.e<? super List<DocumentEntity>> eVar);

    Object b(String str, tq.e<? super DocumentWithScopesAndSchemas> eVar);

    Object c(String str, tq.e<? super DocumentEntity> eVar);

    Object d(String str, tq.e<? super Integer> eVar);

    Object e(String str, tq.e<? super DocumentScopeEntity> eVar);

    Object f(String str, tq.e<? super DocumentWithScopes> eVar);

    Object g(String str, tq.e<? super oq.i0> eVar);

    Object h(int i15, tq.e<? super List<DocumentEntity>> eVar);

    Object j(DocumentSchemaEntity documentSchemaEntity, tq.e<? super oq.i0> eVar);

    Object k(DocumentEntityType documentEntityType, tq.e<? super oq.i0> eVar);

    Object l(DocumentEntityType documentEntityType, tq.e<? super Integer> eVar);

    Object m(String str, tq.e<? super DocumentScopeEntity> eVar);

    Object n(DocumentEntityType documentEntityType, tq.e<? super ParentDocumentWithCertificate> eVar);

    Object o(String str, LocalDate localDate, tq.e<? super oq.i0> eVar);

    Object p(int i15, tq.e<? super oq.i0> eVar);

    Object q(DocumentEntityType documentEntityType, tq.e<? super List<DocumentWithScopes>> eVar);

    default Object s(DocumentEntity documentEntity, List<DocumentScopeEntity> list, DocumentSchemaEntity documentSchemaEntity, tq.e<? super oq.i0> eVar) {
        return r(this, documentEntity, list, documentSchemaEntity, eVar);
    }

    Object t(DocumentScopeEntity documentScopeEntity, tq.e<? super oq.i0> eVar);

    Object u(DocumentEntityType documentEntityType, tq.e<? super List<DocumentWithScopesAndSchemas>> eVar);

    default Object v(DocumentEntity documentEntity, List<DocumentScopeEntity> list, tq.e<? super oq.i0> eVar) {
        return i(this, documentEntity, list, eVar);
    }

    Object w(String str, DocumentEntityStatus documentEntityStatus, tq.e<? super oq.i0> eVar);

    Object x(int i15, int i16, tq.e<? super oq.i0> eVar);

    Object y(DocumentEntity documentEntity, tq.e<? super oq.i0> eVar);
}
