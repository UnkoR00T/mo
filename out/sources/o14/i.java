package o14;

import iy.a0;
import iy.w;
import java.security.SecureRandom;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo14/i;", "La14/j;", "Lpy/b;", "aesKeyGenerator", "Liy/w;", "secureRandomFactory", "<init>", "(Lpy/b;Liy/w;)V", "La14/j$a$b;", "params", "Liy/a0;", "f", "(La14/j$a$b;Ltq/e;)Ljava/lang/Object;", "La14/j$a;", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "e", "(La14/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpy/b;", "b", "Liy/w;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements a14.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final py.b aesKeyGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w secureRandomFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f140621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f140622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f140623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140624g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f140626j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f140624g = obj;
            this.f140626j |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f140627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f140628e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f140630g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f140628e = obj;
            this.f140630g |= PKIFailureInfo.systemUnavail;
            return i.this.f(null, this);
        }
    }

    public i(py.b bVar, w wVar) {
        this.aesKeyGenerator = bVar;
        this.secureRandomFactory = wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(a14.j.a.b bVar, tq.e<? super a0> eVar) throws Throwable {
        b bVar2;
        if (eVar instanceof b) {
            bVar2 = (b) eVar;
            int i15 = bVar2.f140630g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f140630g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar2 = new b(eVar);
            }
        } else {
            bVar2 = new b(eVar);
        }
        Object objA = bVar2.f140628e;
        Object objE = uq.b.e();
        int i16 = bVar2.f140630g;
        if (i16 == 0) {
            u.b(objA);
            w wVar = this.secureRandomFactory;
            byte[] data = bVar.getSeed().getData();
            bVar2.f140627d = bVar;
            bVar2.f140630g = 1;
            objA = wVar.a(data, bVar2);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (a14.j.a.b) bVar2.f140627d;
            u.b(objA);
        }
        byte[] bArr = new byte[bVar.getSaltLength()];
        ((SecureRandom) objA).nextBytes(bArr);
        return new a0(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (r13 == r1) goto L28;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a14.j.a r12, tq.e<? super dx.i<? extends dx.b, ? extends javax.crypto.SecretKey>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o14.i.c(a14.j$a, tq.e):java.lang.Object");
    }
}
