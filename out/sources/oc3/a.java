package oc3;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pc3.PassportsDataEntity;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\t\u0010\u0006J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\f\u0010\b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Loc3/a;", "", "Lpc3/a;", "passport", "Loq/i0;", "g", "(Lpc3/a;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "f", "b", "", "c", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: oc3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3590a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f144640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f144641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144642f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f144644h;

        C3590a(tq.e<? super C3590a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f144642f = obj;
            this.f144644h |= PKIFailureInfo.systemUnavail;
            return a.e(a.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r5.g(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(oc3.a r5, pc3.PassportsDataEntity r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof oc3.a.C3590a
            if (r0 == 0) goto L13
            r0 = r7
            oc3.a$a r0 = (oc3.a.C3590a) r0
            int r1 = r0.f144644h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f144644h = r1
            goto L18
        L13:
            oc3.a$a r0 = new oc3.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f144642f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f144644h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f144641e
            pc3.a r5 = (pc3.PassportsDataEntity) r5
            java.lang.Object r5 = r0.f144640d
            oc3.a r5 = (oc3.a) r5
            oq.u.b(r7)
            goto L6e
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            java.lang.Object r5 = r0.f144641e
            r6 = r5
            pc3.a r6 = (pc3.PassportsDataEntity) r6
            java.lang.Object r5 = r0.f144640d
            oc3.a r5 = (oc3.a) r5
            oq.u.b(r7)
            goto L59
        L49:
            oq.u.b(r7)
            r0.f144640d = r5
            r0.f144641e = r6
            r0.f144644h = r4
            java.lang.Object r7 = r5.d(r0)
            if (r7 != r1) goto L59
            goto L6d
        L59:
            java.lang.Object r7 = vq.j.a(r5)
            r0.f144640d = r7
            java.lang.Object r7 = vq.j.a(r6)
            r0.f144641e = r7
            r0.f144644h = r3
            java.lang.Object r5 = r5.g(r6, r0)
            if (r5 != r1) goto L6e
        L6d:
            return r1
        L6e:
            oq.i0 r5 = oq.i0.f148189a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oc3.a.e(oc3.a, pc3.a, tq.e):java.lang.Object");
    }

    Object b(tq.e<? super PassportsDataEntity> eVar);

    Object c(tq.e<? super Long> eVar);

    Object d(tq.e<? super i0> eVar);

    default Object f(PassportsDataEntity passportsDataEntity, tq.e<? super i0> eVar) {
        return e(this, passportsDataEntity, eVar);
    }

    Object g(PassportsDataEntity passportsDataEntity, tq.e<? super i0> eVar);
}
