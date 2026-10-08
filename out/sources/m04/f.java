package m04;

import iy.r;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import py.KeyStoreKeySpec;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lm04/f;", "Lg04/f;", "Lax/e;", "biometricManager", "Lpy/i;", "keyStoreAesKeyGenerator", "<init>", "(Lax/e;Lpy/i;)V", "Ldx/i;", "Ldx/b$b$a$f;", "Loq/i0;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lg04/f$a;", "params", "Ldx/b;", "f", "(Lg04/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lax/e;", "b", "Lpy/i;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements g04.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ax.e biometricManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final py.i keyStoreAesKeyGenerator;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f122204d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f122206f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122204d = obj;
            this.f122206f |= PKIFailureInfo.systemUnavail;
            return f.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f122210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f122211h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f122212j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122214l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122212j = obj;
            this.f122214l |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(ax.e eVar, py.i iVar) {
        this.biometricManager = eVar;
        this.keyStoreAesKeyGenerator = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(tq.e<? super dx.i<dx.b.InterfaceC1027b.a.f, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f122206f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f122206f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f122204d;
        Object objE = uq.b.e();
        int i16 = aVar.f122206f;
        if (i16 == 0) {
            u.b(objB);
            py.i iVar = this.keyStoreAesKeyGenerator;
            KeyStoreKeySpec keyStoreKeySpec = new KeyStoreKeySpec("TestBiometricKey", new iy.h.a.b(0, new r.a(0, 1, null), 0, 1, null), 0, py.g.STRONG_BIOMETRIC, v.e(py.h.ENCRYPT_AND_DECRYPT), null, false, null, 228, null);
            aVar.f122206f = 1;
            objB = iVar.b(keyStoreKeySpec, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return new dx.i.Left(dx.b.InterfaceC1027b.a.f.f45028a);
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(g04.f.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f122214l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f122214l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objE = bVar.f122212j;
        Object objE2 = uq.b.e();
        int i16 = bVar.f122214l;
        if (i16 == 0) {
            u.b(objE);
            dx.i<dx.b, i0> iVarD = this.biometricManager.d(e04.b.a(), params.getVerifyKeyPresence() ? "BiometricKey" : "");
            if (iVarD instanceof dx.i.Left) {
                return iVarD;
            }
            if (!(iVarD instanceof dx.i.Right)) {
                throw new p();
            }
            i0 i0Var = (i0) ((dx.i.Right) iVarD).b();
            if (!params.getCheckBiometricKeyGeneration()) {
                return new dx.i.Right(i0Var);
            }
            bVar.f122207d = vq.j.a(params);
            bVar.f122208e = vq.j.a(iVarD);
            bVar.f122209f = i0Var;
            bVar.f122210g = 0;
            bVar.f122211h = 0;
            bVar.f122214l = 1;
            objE = e(bVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objE);
        }
        dx.i iVar = (dx.i) objE;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        return new dx.i.Right(i0.f148189a);
    }
}
