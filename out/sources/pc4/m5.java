package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpc4/m5;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lef2/a;", "a", "(Lc54/b;Lq34/x0;Lw24/x0;)Lef2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m5 f155281a = new m5();

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/m5$a", "Lef2/a;", "Ldx/i;", "Ldx/b;", "Lff2/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements ef2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.x0 f155283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.x0 f155284c;

        /* JADX INFO: renamed from: pc4.m5$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3850a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155285d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155287f;

            C3850a(tq.e<? super C3850a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155285d = obj;
                this.f155287f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        a(c54.b bVar, w24.x0 x0Var, q34.x0 x0Var2) {
            this.f155282a = bVar;
            this.f155283b = x0Var;
            this.f155284c = x0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // ef2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(tq.e<? super dx.i<? extends dx.b, ff2.UserDocumentData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.m5.a.a(tq.e):java.lang.Object");
        }
    }

    private m5() {
    }

    public final ef2.a a(c54.b isFeatureEnabledUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC) {
        return new a(isFeatureEnabledUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase);
    }
}
