package e61;

import mu.g;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Le61/b;", "", "Lcz/a;", "storage", "<init>", "(Lcz/a;)V", "", "draftTimestamp", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lcz/a;", "Lmu/g;", "b", "Lmu/g;", "()Lmu/g;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f47680d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cz.a storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g<String> draftTimestamp;

    /* JADX INFO: renamed from: e61.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1099b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f47683d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f47685f;

        C1099b(e<? super C1099b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f47683d = obj;
            this.f47685f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    public b(cz.a aVar) {
        this.storage = aVar;
        aVar.c("CHILD_PASSPORT_APPLICATION_DATA_STORE_FILE_NAME");
        this.draftTimestamp = aVar.e(cz.a.C0833a.a("CHILD_PASSPORT_APPLICATION_TIMESTAMP_KEY"), "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6.a(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e61.b.C1099b
            if (r0 == 0) goto L13
            r0 = r6
            e61.b$b r0 = (e61.b.C1099b) r0
            int r1 = r0.f47685f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47685f = r1
            goto L18
        L13:
            e61.b$b r0 = new e61.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f47683d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f47685f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            oq.u.b(r6)
            goto L46
        L38:
            oq.u.b(r6)
            r0.f47685f = r4
            java.lang.String r6 = ""
            java.lang.Object r6 = r5.c(r6, r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            cz.a r6 = r5.storage
            r0.f47685f = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e61.b.a(tq.e):java.lang.Object");
    }

    public final g<String> b() {
        return this.draftTimestamp;
    }

    public final Object c(String str, e<? super i0> eVar) {
        Object objD = this.storage.d(cz.a.C0833a.a("CHILD_PASSPORT_APPLICATION_TIMESTAMP_KEY"), str, eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }
}
