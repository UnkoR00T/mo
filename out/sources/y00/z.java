package y00;

import java.security.SecureRandom;
import ju.g1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ly00/z;", "Liy/w;", "Liy/e;", "bytesManager", "<init>", "(Liy/e;)V", "", "seed", "Ljava/security/SecureRandom;", "b", "([BLtq/e;)Ljava/lang/Object;", "a", "Liy/e;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements iy.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.e bytesManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f222856e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f222858g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222856e = obj;
            this.f222858g |= PKIFailureInfo.systemUnavail;
            return z.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lorg/bouncycastle/crypto/prng/SP800SecureRandom;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Lorg/bouncycastle/crypto/prng/SP800SecureRandom;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super SP800SecureRandom>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f222862h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f222863j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f222864k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ byte[] f222866m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(byte[] bArr, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f222866m = bArr;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            byte[] bArr;
            byte[] bArr2;
            Object objE = uq.b.e();
            int i15 = this.f222864k;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                this.f222864k = 1;
                obj = iy.w.c(zVar, null, this, 1, null);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = (byte[]) this.f222862h;
                bArr2 = (byte[]) this.f222861g;
                oq.u.b(obj);
            }
            return new SP800SecureRandomBuilder((SecureRandom) obj, true).setSecurityStrength(256).setEntropyBitsRequired(256).setPersonalizationString(bArr).buildHash(new SHA256Digest(), bArr2, true);
            SecureRandom secureRandom = (SecureRandom) obj;
            byte[] bArrGenerateSeed = secureRandom.generateSeed(this.f222866m.length);
            byte[] bArr3 = new byte[16];
            byte[] bArr4 = new byte[16];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr4);
            byte[] bArrC = z.this.bytesManager.c(this.f222866m, bArrGenerateSeed);
            z zVar2 = z.this;
            this.f222859e = vq.j.a(secureRandom);
            this.f222860f = vq.j.a(bArrGenerateSeed);
            this.f222861g = bArr3;
            this.f222862h = bArr4;
            this.f222863j = vq.j.a(bArrC);
            this.f222864k = 2;
            obj = zVar2.b(bArrC, this);
            if (obj != objE) {
                bArr = bArr4;
                bArr2 = bArr3;
                return new SP800SecureRandomBuilder((SecureRandom) obj, true).setSecurityStrength(256).setEntropyBitsRequired(256).setPersonalizationString(bArr).buildHash(new SHA256Digest(), bArr2, true);
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super SP800SecureRandom> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new c(this.f222866m, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ljava/security/SecureRandom;", "<anonymous>", "(Lju/p0;)Ljava/security/SecureRandom;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super SecureRandom>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f222868f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(byte[] bArr, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f222868f = bArr;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f222867e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return new SecureRandom(this.f222868f);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super SecureRandom> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f222868f, eVar);
        }
    }

    public z(iy.e eVar) {
        this.bytesManager = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy.w
    public Object a(byte[] bArr, tq.e<? super SecureRandom> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f222858g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f222858g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objG = bVar.f222856e;
        Object objE = uq.b.e();
        int i16 = bVar.f222858g;
        if (i16 == 0) {
            oq.u.b(objG);
            ju.l0 l0VarA = g1.a();
            c cVar = new c(bArr, null);
            bVar.f222855d = vq.j.a(bArr);
            bVar.f222858g = 1;
            objG = ju.i.g(l0VarA, cVar, bVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objG);
        }
        return objG;
    }

    @Override // iy.w
    public Object b(byte[] bArr, tq.e<? super SecureRandom> eVar) {
        return ju.i.g(g1.a(), new d(bArr, null), eVar);
    }
}
