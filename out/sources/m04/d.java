package m04;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lm04/d;", "Lg04/d;", "Lg04/g;", "checkBiometricStatusUseCase", "Lg04/a;", "activateBiometricUseCase", "<init>", "(Lg04/g;Lg04/a;)V", "Lg04/d$a;", "params", "Ldx/i;", "Ldx/b;", "Le04/a;", "d", "(Lg04/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg04/g;", "b", "Lg04/a;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements g04.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g04.a activateBiometricUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f122192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f122193h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f122194j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122196l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122194j = obj;
            this.f122196l |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(g04.g gVar, g04.a aVar) {
        this.checkBiometricStatusUseCase = gVar;
        this.activateBiometricUseCase = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (r11 == r1) goto L29;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(g04.d.Params r10, tq.e<? super dx.i<? extends dx.b, ? extends e04.a>> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m04.d.c(g04.d$a, tq.e):java.lang.Object");
    }
}
