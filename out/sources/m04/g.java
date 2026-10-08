package m04;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lm04/g;", "Lg04/g;", "Lg04/f;", "checkBiometricRequirementsUseCase", "Lg04/i;", "deactivateBiometricUseCase", "Lf04/a;", "biometricRepository", "Lpx/d;", "remoteLogger", "Lmx/c;", "labelProvider", "<init>", "(Lg04/f;Lg04/i;Lf04/a;Lpx/d;Lmx/c;)V", "Lg04/g$a;", "params", "Ldx/i;", "Ldx/b;", "Le04/e;", "d", "(Lg04/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg04/f;", "b", "Lg04/i;", "c", "Lf04/a;", "Lpx/d;", "e", "Lmx/c;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements g04.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g04.f checkBiometricRequirementsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g04.i deactivateBiometricUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f04.a biometricRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f122224h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f122225j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f122226k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122228m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122226k = obj;
            this.f122228m |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(g04.f fVar, g04.i iVar, f04.a aVar, px.d dVar, mx.c cVar) {
        this.checkBiometricRequirementsUseCase = fVar;
        this.deactivateBiometricUseCase = iVar;
        this.biometricRepository = aVar;
        this.remoteLogger = dVar;
        this.labelProvider = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x0120  */
    /* JADX WARN: Code duplicated, block: B:43:0x0145  */
    /* JADX WARN: Code duplicated, block: B:45:0x0148  */
    /* JADX WARN: Code duplicated, block: B:48:0x014d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    /* JADX WARN: Code duplicated, block: B:57:0x0188  */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r5.c(r6, r2) == r3) goto L42;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(g04.g.Params r18, tq.e<? super dx.i<? extends dx.b, ? extends e04.e>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m04.g.c(g04.g$a, tq.e):java.lang.Object");
    }
}
