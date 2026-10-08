package m64;

import java.util.List;
import n64.SearchSectionEntity;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u0005J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lm64/f;", "", "", "Ln64/c;", "b", "(Ltq/e;)Ljava/lang/Object;", "sections", "Loq/i0;", "d", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "a", "c", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f123901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f123903f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f123905h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f123903f = obj;
            this.f123905h |= PKIFailureInfo.systemUnavail;
            return f.e(f.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r5.d(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(m64.f r5, java.util.List<n64.SearchSectionEntity> r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof m64.f.a
            if (r0 == 0) goto L13
            r0 = r7
            m64.f$a r0 = (m64.f.a) r0
            int r1 = r0.f123905h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f123905h = r1
            goto L18
        L13:
            m64.f$a r0 = new m64.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f123903f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f123905h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f123902e
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r0.f123901d
            m64.f r5 = (m64.f) r5
            oq.u.b(r7)
            goto L6e
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            java.lang.Object r5 = r0.f123902e
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.f123901d
            m64.f r5 = (m64.f) r5
            oq.u.b(r7)
            goto L59
        L49:
            oq.u.b(r7)
            r0.f123901d = r5
            r0.f123902e = r6
            r0.f123905h = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L59
            goto L6d
        L59:
            java.lang.Object r7 = vq.j.a(r5)
            r0.f123901d = r7
            java.lang.Object r7 = vq.j.a(r6)
            r0.f123902e = r7
            r0.f123905h = r3
            java.lang.Object r5 = r5.d(r6, r0)
            if (r5 != r1) goto L6e
        L6d:
            return r1
        L6e:
            oq.i0 r5 = oq.i0.f148189a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m64.f.e(m64.f, java.util.List, tq.e):java.lang.Object");
    }

    Object a(tq.e<? super i0> eVar);

    Object b(tq.e<? super List<SearchSectionEntity>> eVar);

    default Object c(List<SearchSectionEntity> list, tq.e<? super i0> eVar) {
        return e(this, list, eVar);
    }

    Object d(List<SearchSectionEntity> list, tq.e<? super i0> eVar);
}
