package y00;

import java.security.SecureRandom;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly00/g;", "Liy/d;", "Liy/w;", "secureRandomFactory", "Liy/a;", "base64Coder", "Liy/c;", "bytesConverter", "<init>", "(Liy/w;Liy/a;Liy/c;)V", "", "seed", "", "size", "a", "([BILtq/e;)Ljava/lang/Object;", "Liy/w;", "b", "Liy/a;", "c", "Liy/c;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements iy.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.w secureRandomFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222659f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f222661h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222659f = obj;
            this.f222661h |= PKIFailureInfo.systemUnavail;
            return g.this.a(null, 0, this);
        }
    }

    public g(iy.w wVar, iy.a aVar, iy.c cVar) {
        this.secureRandomFactory = wVar;
        this.base64Coder = aVar;
        this.bytesConverter = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy.d
    public Object a(byte[] bArr, int i15, tq.e<? super byte[]> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f222661h;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f222661h = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f222659f;
        Object objE = uq.b.e();
        int i17 = aVar.f222661h;
        if (i17 == 0) {
            oq.u.b(objB);
            iy.w wVar = this.secureRandomFactory;
            aVar.f222657d = vq.j.a(bArr);
            aVar.f222658e = i15;
            aVar.f222661h = 1;
            objB = wVar.b(bArr, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = aVar.f222658e;
            oq.u.b(objB);
        }
        return iy.c.b(this.bytesConverter, iy.a.e(this.base64Coder, iy.x.a((SecureRandom) objB, i15), null, 2, null).toCharArray(), null, 2, null);
    }
}
