package gg0;

import hg0.DocumentEntity;
import hg0.SchemaEntity;
import hg0.ScopeEntity;
import ig0.DocumentWithScopes;
import ig0.DocumentWithScopesAndSchemas;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityStatus;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0097@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u001e\u001a\u00020\u0015H§@¢\u0006\u0004\b\u001f\u0010\u0019J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010\u001e\u001a\u00020\u0015H§@¢\u0006\u0004\b \u0010\u0019J \u0010\"\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H§@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH§@¢\u0006\u0004\b$\u0010\u001dJ\u001b\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0%H'¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b(\u0010\u0019J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010*\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b*\u0010\u0019J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0097@¢\u0006\u0004\b,\u0010\u0019J \u0010/\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H§@¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b2\u0010\u0019J\u0010\u00103\u001a\u00020\u0004H§@¢\u0006\u0004\b3\u0010\u001d¨\u00064À\u0006\u0003"}, d2 = {"Lgg0/l;", "", "Lhg0/c;", "document", "Loq/i0;", "m", "(Lhg0/c;Ltq/e;)Ljava/lang/Object;", "Lhg0/g;", "scope", "v", "(Lhg0/g;Ltq/e;)Ljava/lang/Object;", "Lhg0/f;", "schema", "j", "(Lhg0/f;Ltq/e;)Ljava/lang/Object;", "", "scopes", "u", "(Lhg0/c;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "r", "(Lhg0/c;Lhg0/g;Lhg0/f;Ltq/e;)Ljava/lang/Object;", "", "documentId", "Lig0/a;", "f", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lig0/b;", "b", "i", "(Ltq/e;)Ljava/lang/Object;", "parentId", "t", "o", "name", "p", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "Lmu/g;", "h", "()Lmu/g;", "g", "s", "q", "parentOrChildId", "w", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;", "newStatus", "n", "(Ljava/lang/String;Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;Ltq/e;)Ljava/lang/Object;", "", "d", "e", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f72783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f72784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f72785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f72786h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f72788k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f72786h = obj;
            this.f72788k |= PKIFailureInfo.systemUnavail;
            return l.l(l.this, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f72790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f72791f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f72792g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f72793h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f72795k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f72793h = obj;
            this.f72795k |= PKIFailureInfo.systemUnavail;
            return l.k(l.this, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f72797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f72798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f72799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f72800h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f72801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f72802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f72803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f72804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f72805n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f72807q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f72805n = obj;
            this.f72807q |= PKIFailureInfo.systemUnavail;
            return l.x(l.this, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        if (r10.j(r7, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object k(gg0.l r7, hg0.DocumentEntity r8, hg0.ScopeEntity r9, hg0.SchemaEntity r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.l.k(gg0.l, hg0.c, hg0.g, hg0.f, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r5.s(r2, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object l(gg0.l r5, java.lang.String r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof gg0.l.a
            if (r0 == 0) goto L13
            r0 = r7
            gg0.l$a r0 = (gg0.l.a) r0
            int r1 = r0.f72788k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72788k = r1
            goto L18
        L13:
            gg0.l$a r0 = new gg0.l$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f72786h
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f72788k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r5 = r0.f72785g
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f72784f
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f72783e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f72782d
            gg0.l r5 = (gg0.l) r5
            oq.u.b(r7)
            goto L89
        L3c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L44:
            java.lang.Object r5 = r0.f72783e
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f72782d
            gg0.l r5 = (gg0.l) r5
            oq.u.b(r7)
            goto L61
        L51:
            oq.u.b(r7)
            r0.f72782d = r5
            r0.f72783e = r6
            r0.f72788k = r4
            java.lang.Object r7 = r5.q(r6, r0)
            if (r7 != r1) goto L61
            goto L88
        L61:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L67
            r2 = r6
            goto L68
        L67:
            r2 = r7
        L68:
            java.lang.Object r4 = vq.j.a(r5)
            r0.f72782d = r4
            java.lang.Object r6 = vq.j.a(r6)
            r0.f72783e = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f72784f = r6
            java.lang.Object r6 = vq.j.a(r2)
            r0.f72785g = r6
            r0.f72788k = r3
            java.lang.Object r5 = r5.s(r2, r0)
            if (r5 != r1) goto L89
        L88:
            return r1
        L89:
            oq.i0 r5 = oq.i0.f148189a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.l.l(gg0.l, java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x0084->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r9.m(r10, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object x(gg0.l r9, hg0.DocumentEntity r10, java.util.List<hg0.ScopeEntity> r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof gg0.l.c
            if (r0 == 0) goto L13
            r0 = r12
            gg0.l$c r0 = (gg0.l.c) r0
            int r1 = r0.f72807q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72807q = r1
            goto L18
        L13:
            gg0.l$c r0 = new gg0.l$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f72805n
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f72807q
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L61
            if (r2 == r5) goto L4f
            if (r2 != r4) goto L47
            int r9 = r0.f72803l
            java.lang.Object r10 = r0.f72802k
            hg0.g r10 = (hg0.ScopeEntity) r10
            java.lang.Object r10 = r0.f72800h
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r0.f72799g
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r2 = r0.f72798f
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.f72797e
            hg0.c r5 = (hg0.DocumentEntity) r5
            java.lang.Object r6 = r0.f72796d
            gg0.l r6 = (gg0.l) r6
            oq.u.b(r12)
            goto L84
        L47:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4f:
            java.lang.Object r9 = r0.f72798f
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r9 = r0.f72797e
            r10 = r9
            hg0.c r10 = (hg0.DocumentEntity) r10
            java.lang.Object r9 = r0.f72796d
            gg0.l r9 = (gg0.l) r9
            oq.u.b(r12)
            goto L77
        L61:
            oq.u.b(r12)
            r0.f72796d = r9
            java.lang.Object r12 = vq.j.a(r10)
            r0.f72797e = r12
            r0.f72798f = r11
            r0.f72807q = r5
            java.lang.Object r12 = r9.m(r10, r0)
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
            hg0.g r7 = (hg0.ScopeEntity) r7
            r0.f72796d = r6
            java.lang.Object r8 = vq.j.a(r5)
            r0.f72797e = r8
            java.lang.Object r8 = vq.j.a(r2)
            r0.f72798f = r8
            java.lang.Object r8 = vq.j.a(r11)
            r0.f72799g = r8
            r0.f72800h = r10
            java.lang.Object r12 = vq.j.a(r12)
            r0.f72801j = r12
            java.lang.Object r12 = vq.j.a(r7)
            r0.f72802k = r12
            r0.f72803l = r9
            r0.f72804m = r3
            r0.f72807q = r4
            java.lang.Object r12 = r6.v(r7, r0)
            if (r12 != r1) goto L84
        Lbf:
            return r1
        Lc0:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.l.x(gg0.l, hg0.c, java.util.List, tq.e):java.lang.Object");
    }

    Object a(tq.e<? super List<DocumentEntity>> eVar);

    Object b(String str, tq.e<? super DocumentWithScopesAndSchemas> eVar);

    Object d(String str, tq.e<? super Integer> eVar);

    Object e(tq.e<? super i0> eVar);

    Object f(String str, tq.e<? super DocumentWithScopes> eVar);

    Object g(String str, tq.e<? super i0> eVar);

    mu.g<List<DocumentEntity>> h();

    Object i(tq.e<? super DocumentWithScopes> eVar);

    Object j(SchemaEntity schemaEntity, tq.e<? super i0> eVar);

    Object m(DocumentEntity documentEntity, tq.e<? super i0> eVar);

    Object n(String str, DocumentEntityStatus documentEntityStatus, tq.e<? super i0> eVar);

    Object o(String str, tq.e<? super List<DocumentWithScopesAndSchemas>> eVar);

    Object p(String str, String str2, tq.e<? super ScopeEntity> eVar);

    Object q(String str, tq.e<? super String> eVar);

    default Object r(DocumentEntity documentEntity, ScopeEntity scopeEntity, SchemaEntity schemaEntity, tq.e<? super i0> eVar) {
        return k(this, documentEntity, scopeEntity, schemaEntity, eVar);
    }

    Object s(String str, tq.e<? super i0> eVar);

    Object t(String str, tq.e<? super List<DocumentWithScopes>> eVar);

    default Object u(DocumentEntity documentEntity, List<ScopeEntity> list, tq.e<? super i0> eVar) {
        return x(this, documentEntity, list, eVar);
    }

    Object v(ScopeEntity scopeEntity, tq.e<? super i0> eVar);

    default Object w(String str, tq.e<? super i0> eVar) {
        return l(this, str, eVar);
    }
}
