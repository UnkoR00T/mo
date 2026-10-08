package y00;

import java.security.SecureRandom;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0017"}, d2 = {"Ly00/r;", "Liy/p;", "Liy/w;", "secureRandomFactory", "Ly00/c0;", "securityExceptionParser", "<init>", "(Liy/w;Ly00/c0;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i$b;", "Ldx/b;", "b", "(Ljava/lang/Exception;)Ldx/i$b;", "", "ivBytesLength", "Ldx/i;", "", "a", "(ILtq/e;)Ljava/lang/Object;", "Liy/w;", "Ly00/c0;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements iy.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.w secureRandomFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f222838e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f222840g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222838e = obj;
            this.f222840g |= PKIFailureInfo.systemUnavail;
            return r.this.a(0, this);
        }
    }

    public r(iy.w wVar, c0 c0Var) {
        this.secureRandomFactory = wVar;
        this.securityExceptionParser = c0Var;
    }

    private final dx.i.Left<dx.b> b(Exception e15) {
        dx.i<Exception, dx.b> iVarA = this.securityExceptionParser.a(e15);
        if (iVarA instanceof dx.i.Right) {
            return new dx.i.Left<>(((dx.i.Right) iVarA).b());
        }
        if (iVarA instanceof dx.i.Left) {
            return new dx.i.Left<>(new dx.b.Generic((Throwable) ((dx.i.Left) iVarA).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy.p
    public Object a(int i15, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f222840g;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f222840g = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f222838e;
        Object objE = uq.b.e();
        int i17 = aVar.f222840g;
        try {
            if (i17 == 0) {
                oq.u.b(objC);
                iy.w wVar = this.secureRandomFactory;
                aVar.f222837d = i15;
                aVar.f222840g = 1;
                objC = iy.w.c(wVar, null, aVar, 1, null);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i15 = aVar.f222837d;
                oq.u.b(objC);
            }
            byte[] bArr = new byte[i15];
            ((SecureRandom) objC).nextBytes(bArr);
            return new dx.i.Right(bArr);
        } catch (IllegalArgumentException e15) {
            return b(e15);
        } catch (IndexOutOfBoundsException e16) {
            return b(e16);
        }
    }
}
