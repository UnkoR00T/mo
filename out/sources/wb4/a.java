package wb4;

import fr.t;
import iy.a0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwb4/a;", "Lqb4/a;", "Lpx/d;", "remoteLogger", "Lwy/a;", "masterKeyProvider", "Lqb4/b;", "authenticateWithBiometricUseCase", "Lqb4/i;", "setBiometricDataUseCase", "<init>", "(Lpx/d;Lwy/a;Lqb4/b;Lqb4/i;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lpb4/a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lpx/d;", "b", "Lwy/a;", "c", "Lqb4/b;", "d", "Lqb4/i;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements qb4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wy.a masterKeyProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qb4.b authenticateWithBiometricUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qb4.i setBiometricDataUseCase;

    /* JADX INFO: renamed from: wb4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5585a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211887g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f211889j;

        C5585a(tq.e<? super C5585a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211887g = obj;
            this.f211889j |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(px.d dVar, wy.a aVar, qb4.b bVar, qb4.i iVar) {
        this.remoteLogger = dVar;
        this.masterKeyProvider = aVar;
        this.authenticateWithBiometricUseCase = bVar;
        this.setBiometricDataUseCase = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends pb4.a>> eVar) throws Throwable {
        C5585a c5585a;
        a0 a0VarC;
        pb4.a aVar;
        if (eVar instanceof C5585a) {
            c5585a = (C5585a) eVar;
            int i15 = c5585a.f211889j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5585a.f211889j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5585a = new C5585a(eVar);
            }
        } else {
            c5585a = new C5585a(eVar);
        }
        Object objC = c5585a.f211887g;
        Object objE = uq.b.e();
        int i16 = c5585a.f211889j;
        if (i16 == 0) {
            u.b(objC);
            this.remoteLogger.F8("Activate biometric", px.d.a.GENERAL);
            a0VarC = this.masterKeyProvider.c();
            qb4.b bVar = this.authenticateWithBiometricUseCase;
            qb4.b.AbstractC4144b.Encrypt encrypt = new qb4.b.AbstractC4144b.Encrypt(a0VarC, qb4.b.a.CHECK, null, null, null, 28, null);
            c5585a.f211884d = j.a(c1792a);
            c5585a.f211885e = j.a(a0VarC);
            c5585a.f211889j = 1;
            objC = bVar.c(encrypt, c5585a);
            if (objC != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            a0 a0Var = (a0) c5585a.f211885e;
            gz.b.a.C1792a c1792a2 = (gz.b.a.C1792a) c5585a.f211884d;
            u.b(objC);
            a0VarC = a0Var;
            c1792a = c1792a2;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (pb4.a) c5585a.f211886f;
            u.b(objC);
        }
        return new dx.i.Right(aVar);
        pb4.a aVar2 = (pb4.a) objC;
        if (!(aVar2 instanceof pb4.a.AuthenticationSucceed)) {
            if (t.c(aVar2, pb4.a.d.f154081a) || t.c(aVar2, pb4.a.C3814a.f154078a)) {
                return new dx.i.Right(aVar2);
            }
            if (aVar2 instanceof pb4.a.Error) {
                return new dx.i.Left(((pb4.a.Error) aVar2).getErrorType());
            }
            throw new p();
        }
        qb4.i iVar = this.setBiometricDataUseCase;
        qb4.i.Params params = new qb4.i.Params(qy.b.b(((pb4.a.AuthenticationSucceed) aVar2).getResultData()), pb4.d.ENABLED, null);
        c5585a.f211884d = j.a(c1792a);
        c5585a.f211885e = j.a(a0VarC);
        c5585a.f211886f = aVar2;
        c5585a.f211889j = 2;
        if (iVar.c(params, c5585a) != objE) {
            aVar = aVar2;
            return new dx.i.Right(aVar);
        }
        return objE;
    }
}
