package m04;

import iy.a0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lm04/c;", "Lg04/c;", "Lg04/b;", "authenticateWithBiometricUseCase", "Lg04/j;", "getBiometricEncryptedCredentialUseCase", "<init>", "(Lg04/b;Lg04/j;)V", "Lgz/b$a$a;", "params", "Le04/a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lg04/b;", "b", "Lg04/j;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements g04.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g04.b authenticateWithBiometricUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g04.j getBiometricEncryptedCredentialUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122183e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122184f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f122186h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122184f = obj;
            this.f122186h |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(g04.b bVar, g04.j jVar) {
        this.authenticateWithBiometricUseCase = bVar;
        this.getBiometricEncryptedCredentialUseCase = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super e04.a> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f122186h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f122186h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f122184f;
        Object objE = uq.b.e();
        int i16 = aVar.f122186h;
        if (i16 == 0) {
            u.b(objC);
            g04.j jVar = this.getBiometricEncryptedCredentialUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f122182d = vq.j.a(c1792a);
            aVar.f122186h = 1;
            objC = jVar.c(c1792a2, aVar);
            if (objC != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
            return objC;
        }
        c1792a = (gz.b.a.C1792a) aVar.f122182d;
        u.b(objC);
        a0 a0Var = (a0) objC;
        g04.b bVar = this.authenticateWithBiometricUseCase;
        g04.b.AbstractC1552b.Decrypt decrypt = new g04.b.AbstractC1552b.Decrypt(a0Var, g04.b.a.LOGIN, null, null, null, 28, null);
        aVar.f122182d = vq.j.a(c1792a);
        aVar.f122183e = vq.j.a(a0Var);
        aVar.f122186h = 2;
        Object objC2 = bVar.c(decrypt, aVar);
        return objC2 == objE ? objE : objC2;
    }
}
