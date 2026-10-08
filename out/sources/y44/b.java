package y44;

import es0.e;
import h64.n;
import h64.r;
import iq0.q;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import yr0.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ly44/b;", "Lr44/c;", "Lx44/c;", "paymentsWidgetRepository", "Lh64/n;", "isServiceTemporaryInterruptedUC", "Lh64/r;", "loadServicesUseCase", "Les0/e;", "getPaymentsWidgetDataUC", "<init>", "(Lx44/c;Lh64/n;Lh64/r;Les0/e;)V", "", "e", "(Ltq/e;)Ljava/lang/Object;", "Lgz/b$a$a;", "params", "Lq44/c;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lyr0/m;", "Lq44/b;", "f", "(Lyr0/m;)Lq44/b;", "Lx44/c;", "b", "Lh64/n;", "c", "Lh64/r;", "d", "Les0/e;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements r44.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x44.c paymentsWidgetRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n isServiceTemporaryInterruptedUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r loadServicesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e getPaymentsWidgetDataUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f224215b;

        static {
            int[] iArr = new int[yr0.d.values().length];
            try {
                iArr[yr0.d.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yr0.d.MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yr0.d.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f224214a = iArr;
            int[] iArr2 = new int[m.values().length];
            try {
                iArr2[m.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m.IN_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[m.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[m.OVERDUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[m.REMITTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[m.ENFORCEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[m.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[m.WITHDRAWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[m.REGISTERED.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[m.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            f224215b = iArr2;
        }
    }

    /* JADX INFO: renamed from: y44.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6003b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f224217e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f224219g;

        C6003b(tq.e<? super C6003b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224217e = obj;
            this.f224219g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f224220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f224221e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f224223g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224221e = obj;
            this.f224223g |= PKIFailureInfo.systemUnavail;
            return b.this.e(this);
        }
    }

    public b(x44.c cVar, n nVar, r rVar, e eVar) {
        this.paymentsWidgetRepository = cVar;
        this.isServiceTemporaryInterruptedUC = nVar;
        this.loadServicesUseCase = rVar;
        this.getPaymentsWidgetDataUC = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(tq.e<? super Boolean> eVar) throws Throwable {
        c cVar;
        int i15;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i16 = cVar.f224223g;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f224223g = i16 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f224221e;
        Object objE = uq.b.e();
        int i17 = cVar.f224223g;
        boolean z15 = false;
        if (i17 == 0) {
            u.b(objC);
            r rVar = this.loadServicesUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f224223g = 1;
            objC = rVar.c(c1792a, cVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i17 == 1) {
            u.b(objC);
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = cVar.f224220d;
            u.b(objC);
        }
        boolean zBooleanValue = ((Boolean) objC).booleanValue();
        if (i15 != 0 && !zBooleanValue) {
            z15 = true;
        }
        return vq.b.a(z15);
        List list = (List) objC;
        int i18 = (list == null || !q.a(list, rq0.c.E_PAYMENTS)) ? 0 : 1;
        n nVar = this.isServiceTemporaryInterruptedUC;
        n.Params params = new n.Params(rq0.c.E_PAYMENTS);
        cVar.f224220d = i18;
        cVar.f224223g = 2;
        Object objC2 = nVar.c(params, cVar);
        if (objC2 != objE) {
            i15 = i18;
            objC = objC2;
            boolean zBooleanValue2 = ((Boolean) objC).booleanValue();
            if (i15 != 0) {
                z15 = true;
            }
            return vq.b.a(z15);
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r7 == r1) goto L27;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r6, tq.e<? super q44.c> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y44.b.c(gz.b$a$a, tq.e):java.lang.Object");
    }

    public final q44.b f(m mVar) {
        switch (a.f224215b[mVar.ordinal()]) {
            case 1:
                return q44.b.NEW;
            case 2:
                return q44.b.IN_PAYMENT;
            case 3:
                return q44.b.COMPLETED;
            case 4:
                return q44.b.OVERDUE;
            case 5:
                return q44.b.REMITTED;
            case 6:
                return q44.b.ENFORCEMENT;
            case 7:
                return q44.b.EXPIRED;
            case 8:
                return q44.b.WITHDRAWN;
            case 9:
                return q44.b.REGISTERED;
            case 10:
                return q44.b.UNKNOWN;
            default:
                throw new p();
        }
    }
}
