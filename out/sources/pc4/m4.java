package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpc4/m4;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lhz1/a;", "a", "(Lc54/b;Lq34/x0;Lw24/x0;)Lhz1/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m4 f155274a = new m4();

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/m4$a", "Lhz1/a;", "Ldx/i;", "Ldx/b;", "Lgz1/b;", "c", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements hz1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.x0 f155276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.x0 f155277c;

        /* JADX INFO: renamed from: pc4.m4$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3849a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155278d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155280f;

            C3849a(tq.e<? super C3849a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155278d = obj;
                this.f155280f |= PKIFailureInfo.systemUnavail;
                return a.this.c(this);
            }
        }

        a(c54.b bVar, w24.x0 x0Var, q34.x0 x0Var2) {
            this.f155275a = bVar;
            this.f155276b = x0Var;
            this.f155277c = x0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // hz1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object c(tq.e<? super dx.i<? extends dx.b, gz1.PersonalData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.m4.a.c(tq.e):java.lang.Object");
        }
    }

    private m4() {
    }

    public final hz1.a a(c54.b isFeatureEnabledUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC) {
        return new a(isFeatureEnabledUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase);
    }
}
