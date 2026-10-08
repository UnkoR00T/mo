package m64;

import g64.GlobalSearchDocumentResult;
import iq0.a0;
import java.util.List;
import n64.ChecksumEntity;
import n64.SearchTagEntity;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u0004J\u001e\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0010\u0010\u0004J&\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0097@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\u001d\u0010\u0004¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lm64/k;", "", "", "d", "(Ltq/e;)Ljava/lang/Object;", "Ln64/a;", "checksum", "Loq/i0;", "j", "(Ln64/a;Ltq/e;)Ljava/lang/Object;", "e", "", "Ln64/d;", "tags", "f", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "h", "l", "(Ln64/a;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "query", "Liq0/a0;", "language", "Lo64/c;", "mainType", "Lg64/a;", "k", "(Ljava/lang/String;Liq0/a0;Lo64/c;Ltq/e;)Ljava/lang/Object;", "", "b", "a", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f123919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f123920e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f123922g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f123920e = obj;
            this.f123922g |= PKIFailureInfo.systemUnavail;
            return k.g(k.this, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f123923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f123925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f123926g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f123928j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f123926g = obj;
            this.f123928j |= PKIFailureInfo.systemUnavail;
            return k.i(k.this, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r5.h(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object g(m64.k r5, tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof m64.k.a
            if (r0 == 0) goto L13
            r0 = r6
            m64.k$a r0 = (m64.k.a) r0
            int r1 = r0.f123922g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f123922g = r1
            goto L18
        L13:
            m64.k$a r0 = new m64.k$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f123920e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f123922g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f123919d
            m64.k r5 = (m64.k) r5
            oq.u.b(r6)
            goto L5d
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.f123919d
            m64.k r5 = (m64.k) r5
            oq.u.b(r6)
            goto L4e
        L40:
            oq.u.b(r6)
            r0.f123919d = r5
            r0.f123922g = r4
            java.lang.Object r6 = r5.e(r0)
            if (r6 != r1) goto L4e
            goto L5c
        L4e:
            java.lang.Object r6 = vq.j.a(r5)
            r0.f123919d = r6
            r0.f123922g = r3
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto L5d
        L5c:
            return r1
        L5d:
            oq.i0 r5 = oq.i0.f148189a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m64.k.g(m64.k, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[PHI: r8 r9 r10
      0x00b0: PHI (r8v4 java.util.List<n64.d>) = (r8v3 java.util.List<n64.d>), (r8v14 java.util.List<n64.d>) binds: [B:28:0x00ad, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r9v3 n64.a) = (r9v2 n64.a), (r9v11 n64.a) binds: [B:28:0x00ad, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r10v4 m64.k) = (r10v3 m64.k), (r10v10 m64.k) binds: [B:28:0x00ad, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r10.f(r8, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object i(m64.k r8, n64.ChecksumEntity r9, java.util.List<n64.SearchTagEntity> r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m64.k.i(m64.k, n64.a, java.util.List, tq.e):java.lang.Object");
    }

    default Object a(tq.e<? super i0> eVar) {
        return g(this, eVar);
    }

    Object b(tq.e<? super Boolean> eVar);

    Object d(tq.e<? super String> eVar);

    Object e(tq.e<? super i0> eVar);

    Object f(List<SearchTagEntity> list, tq.e<? super i0> eVar);

    Object h(tq.e<? super i0> eVar);

    Object j(ChecksumEntity checksumEntity, tq.e<? super i0> eVar);

    Object k(String str, a0 a0Var, o64.c cVar, tq.e<? super List<GlobalSearchDocumentResult>> eVar);

    default Object l(ChecksumEntity checksumEntity, List<SearchTagEntity> list, tq.e<? super i0> eVar) {
        return i(this, checksumEntity, list, eVar);
    }
}
