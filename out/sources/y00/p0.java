package y00;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly00/p0;", "Liy/g0;", "Liy/w;", "secureRandomFactory", "<init>", "(Liy/w;)V", "", "bytes", "Loq/i0;", "c", "([B)V", "", "b", "([B)Ljava/lang/String;", "a", "(Ltq/e;)Ljava/lang/Object;", "Liy/w;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 implements iy.g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f222827c = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.w secureRandomFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f222830e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f222832g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222830e = obj;
            this.f222832g |= PKIFailureInfo.systemUnavail;
            return p0.this.a(this);
        }
    }

    public p0(iy.w wVar) {
        this.secureRandomFactory = wVar;
    }

    private final String b(byte[] bytes) {
        StringBuilder sb5 = new StringBuilder(36);
        int length = bytes.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            byte b15 = bytes[i15];
            int i17 = i16 + 1;
            char[] cArr = f222827c;
            sb5.append(cArr[(b15 >>> 4) & 15]);
            sb5.append(cArr[b15 & 15]);
            if (i16 == 3 || i16 == 5 || i16 == 7 || i16 == 9) {
                sb5.append('-');
            }
            i15++;
            i16 = i17;
        }
        return sb5.toString();
    }

    private final void c(byte[] bytes) {
        bytes[6] = (byte) ((bytes[6] & 15) | 64);
        bytes[8] = (byte) ((bytes[8] & 63) | 128);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r6 == r1) goto L21;
     */
    @Override // iy.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(tq.e<? super java.lang.String> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof y00.p0.b
            if (r0 == 0) goto L13
            r0 = r6
            y00.p0$b r0 = (y00.p0.b) r0
            int r1 = r0.f222832g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f222832g = r1
            goto L18
        L13:
            y00.p0$b r0 = new y00.p0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f222830e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f222832g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f222829d
            byte[] r0 = (byte[]) r0
            oq.u.b(r6)
            goto L64
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            oq.u.b(r6)
            goto L4b
        L3c:
            oq.u.b(r6)
            iy.w r6 = r5.secureRandomFactory
            r0.f222832g = r4
            r2 = 0
            java.lang.Object r6 = iy.w.c(r6, r2, r0, r4, r2)
            if (r6 != r1) goto L4b
            goto L63
        L4b:
            java.security.SecureRandom r6 = (java.security.SecureRandom) r6
            r2 = 32
            byte[] r6 = r6.generateSeed(r2)
            iy.w r2 = r5.secureRandomFactory
            java.lang.Object r4 = vq.j.a(r6)
            r0.f222829d = r4
            r0.f222832g = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            java.security.SecureRandom r6 = (java.security.SecureRandom) r6
            r0 = 16
            byte[] r6 = iy.x.a(r6, r0)
            r5.c(r6)
            java.lang.String r6 = r5.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.p0.a(tq.e):java.lang.Object");
    }
}
