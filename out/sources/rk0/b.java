package rk0;

import dx.i;
import jk0.ExternalQualifiedSignatureAuthorizationStatusResponse;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lrk0/b;", "Lkk0/b;", "Lqk0/b;", "repository", "Lmx/c;", "labelProvider", "<init>", "(Lqk0/b;Lmx/c;)V", "Lkk0/b$a;", "params", "Ldx/i;", "Ldx/b;", "Lkk0/b$b;", "d", "(Lkk0/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lqk0/b;", "Ldx/b$c;", "b", "Ldx/b$c;", "defaultError", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements kk0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final qk0.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f174675a;

        static {
            int[] iArr = new int[jk0.e.values().length];
            try {
                iArr[jk0.e.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jk0.e.CONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jk0.e.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jk0.e.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jk0.e.NOT_PRESENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[jk0.e.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f174675a = iArr;
        }
    }

    /* JADX INFO: renamed from: rk0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4454b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f174676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f174677e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f174679g;

        C4454b(tq.e<? super C4454b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f174677e = obj;
            this.f174679g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(qk0.b bVar, mx.c cVar) {
        this.repository = bVar;
        this.defaultError = new dx.b.Business(null, null, cVar.c(ik0.a.f93181b), cVar.c(ik0.a.f93182c), null, cVar.c(ik0.a.f93180a), null, 83, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(kk0.b.Params params, tq.e<? super i<? extends dx.b, ? extends kk0.b.EnumC2687b>> eVar) throws Throwable {
        C4454b c4454b;
        if (eVar instanceof C4454b) {
            c4454b = (C4454b) eVar;
            int i15 = c4454b.f174679g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4454b.f174679g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4454b = new C4454b(eVar);
            }
        } else {
            c4454b = new C4454b(eVar);
        }
        Object objE = c4454b.f174677e;
        Object objE2 = uq.b.e();
        int i16 = c4454b.f174679g;
        if (i16 == 0) {
            u.b(objE);
            qk0.b bVar = this.repository;
            String authorizationId = params.getAuthorizationId();
            String processId = params.getProcessId();
            c4454b.f174676d = j.a(params);
            c4454b.f174679g = 1;
            objE = bVar.e(processId, authorizationId, c4454b);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objE);
        }
        i iVar = (i) objE;
        if (iVar instanceof i.Left) {
            return new i.Left((dx.b) ((i.Left) iVar).b());
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        switch (a.f174675a[((ExternalQualifiedSignatureAuthorizationStatusResponse) ((i.Right) iVar).b()).getStatus().ordinal()]) {
            case 1:
                return new i.Right(kk0.b.EnumC2687b.ACTIVE);
            case 2:
                return new i.Right(kk0.b.EnumC2687b.CONFIRMED);
            case 3:
                return new i.Right(kk0.b.EnumC2687b.REJECTED);
            case 4:
                return new i.Right(kk0.b.EnumC2687b.EXPIRED);
            case 5:
            case 6:
                return new i.Left(this.defaultError);
            default:
                throw new p();
        }
    }
}
