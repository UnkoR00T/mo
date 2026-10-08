package rb4;

import oq.k;
import oq.l;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pb4.d;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lrb4/b;", "", "Lcz/c;", "storageFactory", "<init>", "(Lcz/c;)V", "Lpb4/d;", "biometricInAppStatus", "", "d", "(Lpb4/d;Ltq/e;)Ljava/lang/Object;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lcz/b;", "a", "Loq/k;", "c", "()Lcz/b;", "storage", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f173009c = cz.b.a.b("BIOMETRIC_DATA_SOURCE_BIOMETRIC_IN_APP_STATUS");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    /* JADX INFO: renamed from: rb4.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4418b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173011a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f173011a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f173012d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f173014f;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173012d = obj;
            this.f173014f |= PKIFailureInfo.systemUnavail;
            return b.this.b(this);
        }
    }

    public b(final cz.c cVar) {
        this.storage = l.a(new er.a() { // from class: rb4.a
            @Override // er.a
            public final Object a() {
                return b.e(cVar);
            }
        });
    }

    private final cz.b c() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b e(cz.c cVar) {
        return cVar.a("BIOMETRIC_DATA_SOURCE", cz.d.ENCRYPTED);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(e<? super d> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f173014f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f173014f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objH = cVar.f173012d;
        Object objE = uq.b.e();
        int i16 = cVar.f173014f;
        if (i16 == 0) {
            u.b(objH);
            cz.b bVarC = c();
            String str = f173009c;
            cVar.f173014f = 1;
            objH = bVarC.h(str, false, cVar);
            if (objH == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objH);
        }
        boolean zBooleanValue = ((Boolean) objH).booleanValue();
        if (zBooleanValue) {
            return d.ENABLED;
        }
        if (zBooleanValue) {
            throw new p();
        }
        return d.DISABLED;
    }

    public final Object d(d dVar, e<? super Boolean> eVar) {
        cz.b bVarC = c();
        String str = f173009c;
        int i15 = C4418b.f173011a[dVar.ordinal()];
        boolean z15 = true;
        if (i15 != 1) {
            if (i15 != 2) {
                throw new p();
            }
            z15 = false;
        }
        return bVarC.c(str, z15, eVar);
    }
}
