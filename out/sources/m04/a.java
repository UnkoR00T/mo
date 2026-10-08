package m04;

import fr.t;
import g04.p;
import iy.a0;
import iy.b0;
import iy.w;
import iy.x;
import java.security.SecureRandom;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v64.s;
import y00.c0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001'B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010!\u001a\u00020 H\u0096B¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010:¨\u0006<"}, d2 = {"Lm04/a;", "Lg04/a;", "Lg04/b;", "authenticateWithBiometricUseCase", "Lg04/p;", "xorPasswordWithPinUseCase", "Lv64/s;", "setBiometricPinProtectionUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lf04/a;", "biometricRepository", "Liy/c;", "bytesConverter", "Liy/w;", "secureRandomFactory", "Ly00/c0;", "securityExceptionParser", "Ll04/a;", "biometricUserInteractor", "Lg04/o;", "saveBiometricPinUC", "Lg04/m;", "hashPinUseCase", "<init>", "(Lg04/b;Lg04/p;Lv64/s;Lac4/a;Lf04/a;Liy/c;Liy/w;Ly00/c0;Ll04/a;Lg04/o;Lg04/m;)V", "Liy/b0;", "password", "pin", "Liy/a0;", "k", "(Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lg04/a$a;", "params", "Ldx/i;", "Ldx/b;", "Le04/a;", "j", "(Lg04/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg04/b;", "b", "Lg04/p;", "c", "Lv64/s;", "d", "Lac4/a;", "e", "Lf04/a;", "f", "Liy/c;", "g", "Liy/w;", "h", "Ly00/c0;", "i", "Ll04/a;", "Lg04/o;", "Lg04/m;", "l", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements g04.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g04.b authenticateWithBiometricUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p xorPasswordWithPinUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s setBiometricPinProtectionUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f04.a biometricRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w secureRandomFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l04.a biometricUserInteractor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g04.o saveBiometricPinUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g04.m hashPinUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122073g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f122074h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f122075j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f122076k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122077l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122078m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122079n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f122080p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f122082r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122080p = obj;
            this.f122082r |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ldx/i$c;", "Le04/a$b;", "<anonymous>", "()Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super dx.i.Right<e04.a.AuthenticationSucceed>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f122085g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ g04.a.Params f122087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ e04.a f122088k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f122089l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(g04.a.Params params, e04.a aVar, ex.b<? super dx.b> bVar, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f122087j = params;
            this.f122088k = aVar;
            this.f122089l = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:53:0x0128  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
        
            if (r10 == r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
        
            if (r10 == r0) goto L49;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: m04.a.c.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return a.this.new c(this.f122087j, this.f122088k, this.f122089l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i.Right<e04.a.AuthenticationSucceed>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f122093g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f122094h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f122096k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122094h = obj;
            this.f122096k |= PKIFailureInfo.systemUnavail;
            return a.this.k(null, null, this);
        }
    }

    public a(g04.b bVar, p pVar, s sVar, ac4.a aVar, f04.a aVar2, iy.c cVar, w wVar, c0 c0Var, l04.a aVar3, g04.o oVar, g04.m mVar) {
        this.authenticateWithBiometricUseCase = bVar;
        this.xorPasswordWithPinUseCase = pVar;
        this.setBiometricPinProtectionUseCase = sVar;
        this.callActionWithLoaderUseCase = aVar;
        this.biometricRepository = aVar2;
        this.bytesConverter = cVar;
        this.secureRandomFactory = wVar;
        this.securityExceptionParser = c0Var;
        this.biometricUserInteractor = aVar3;
        this.saveBiometricPinUC = oVar;
        this.hashPinUseCase = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(b0 b0Var, b0 b0Var2, tq.e<? super a0> eVar) throws Throwable {
        d dVar;
        a0 a0Var;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f122096k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f122096k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f122094h;
        Object objE = uq.b.e();
        int i16 = dVar.f122096k;
        if (i16 == 0) {
            u.b(objC);
            p pVar = this.xorPasswordWithPinUseCase;
            p.a.Chars chars = new p.a.Chars(b0Var, b0Var2);
            dVar.f122090d = vq.j.a(b0Var);
            dVar.f122091e = vq.j.a(b0Var2);
            dVar.f122096k = 1;
            objC = pVar.c(chars, dVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            b0Var2 = (b0) dVar.f122091e;
            b0Var = (b0) dVar.f122090d;
            u.b(objC);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (a0) dVar.f122092f;
            u.b(objC);
        }
        return new a0(pq.n.H(x.a((SecureRandom) objC, 12), a0Var.getData()));
        a0 a0Var2 = (a0) objC;
        w wVar = this.secureRandomFactory;
        dVar.f122090d = vq.j.a(b0Var);
        dVar.f122091e = vq.j.a(b0Var2);
        dVar.f122092f = a0Var2;
        dVar.f122093g = 0;
        dVar.f122096k = 2;
        Object objC2 = w.c(wVar, null, dVar, 1, null);
        if (objC2 != objE) {
            objC = objC2;
            a0Var = a0Var2;
            return new a0(pq.n.H(x.a((SecureRandom) objC, 12), a0Var.getData()));
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:0x017d A[Catch: Exception -> 0x0089, c -> 0x008d, CancellationException -> 0x0091, TRY_LEAVE, TryCatch #6 {c -> 0x008d, CancellationException -> 0x0091, Exception -> 0x0089, blocks: (B:26:0x007b, B:54:0x0176, B:56:0x017d, B:62:0x01c0, B:64:0x01c4, B:67:0x01c9, B:69:0x01cd, B:71:0x01d9, B:72:0x01de, B:73:0x01df, B:36:0x00ad), top: B:94:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c0 A[Catch: Exception -> 0x0089, c -> 0x008d, CancellationException -> 0x0091, TRY_ENTER, TryCatch #6 {c -> 0x008d, CancellationException -> 0x0091, Exception -> 0x0089, blocks: (B:26:0x007b, B:54:0x0176, B:56:0x017d, B:62:0x01c0, B:64:0x01c4, B:67:0x01c9, B:69:0x01cd, B:71:0x01d9, B:72:0x01de, B:73:0x01df, B:36:0x00ad), top: B:94:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c4 A[Catch: Exception -> 0x0089, c -> 0x008d, CancellationException -> 0x0091, TryCatch #6 {c -> 0x008d, CancellationException -> 0x0091, Exception -> 0x0089, blocks: (B:26:0x007b, B:54:0x0176, B:56:0x017d, B:62:0x01c0, B:64:0x01c4, B:67:0x01c9, B:69:0x01cd, B:71:0x01d9, B:72:0x01de, B:73:0x01df, B:36:0x00ad), top: B:94:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01cd A[Catch: Exception -> 0x0089, c -> 0x008d, CancellationException -> 0x0091, TryCatch #6 {c -> 0x008d, CancellationException -> 0x0091, Exception -> 0x0089, blocks: (B:26:0x007b, B:54:0x0176, B:56:0x017d, B:62:0x01c0, B:64:0x01c4, B:67:0x01c9, B:69:0x01cd, B:71:0x01d9, B:72:0x01de, B:73:0x01df, B:36:0x00ad), top: B:94:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01d9 A[Catch: Exception -> 0x0089, c -> 0x008d, CancellationException -> 0x0091, TryCatch #6 {c -> 0x008d, CancellationException -> 0x0091, Exception -> 0x0089, blocks: (B:26:0x007b, B:54:0x0176, B:56:0x017d, B:62:0x01c0, B:64:0x01c4, B:67:0x01c9, B:69:0x01cd, B:71:0x01d9, B:72:0x01de, B:73:0x01df, B:36:0x00ad), top: B:94:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:85:0x021b  */
    /* JADX WARN: Code duplicated, block: B:87:0x021f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x022c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x008a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:30:0x008a */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x008e: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:32:0x008e */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0092: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:34:0x0092 */
    /* JADX WARN: Type inference failed for: r23v0, types: [m04.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object c(g04.a.Params params, tq.e<? super dx.i<? extends dx.b, ? extends e04.a>> eVar) throws Throwable {
        b bVar;
        Object obj;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j jVar;
        int i15;
        a0 a0VarA;
        int i16;
        int i17;
        ex.b bVar2;
        g04.a.Params params2;
        int i18;
        ex.b bVar3;
        ex.b bVar4;
        dx.j jVar2;
        int i19;
        int i25;
        ex.b bVar5;
        g04.a.Params params3;
        int i26;
        e04.a aVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i27 = bVar.f122082r;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f122082r = i27 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar6 = bVar;
        Object objK = bVar6.f122080p;
        Object objE = uq.b.e();
        ?? r15 = bVar6.f122082r;
        try {
            try {
                try {
                    if (r15 != 0) {
                        if (r15 != 1) {
                            try {
                                if (r15 == 2) {
                                    int i28 = bVar6.f122079n;
                                    i16 = bVar6.f122078m;
                                    int i29 = bVar6.f122077l;
                                    int i35 = bVar6.f122076k;
                                    a0 a0Var = (a0) bVar6.f122074h;
                                    ex.b bVar7 = (ex.b) bVar6.f122073g;
                                    ex.b bVar8 = (ex.b) bVar6.f122072f;
                                    jVar2 = (dx.j) bVar6.f122071e;
                                    g04.a.Params params4 = (g04.a.Params) bVar6.f122070d;
                                    u.b(objK);
                                    i25 = i29;
                                    bVar5 = bVar7;
                                    a0VarA = a0Var;
                                    i15 = i28;
                                    params3 = params4;
                                    bVar4 = bVar8;
                                    i19 = i35;
                                    i26 = i16;
                                    aVar = (e04.a) objK;
                                    if (!(aVar instanceof e04.a.AuthenticationSucceed)) {
                                        if (!(aVar instanceof e04.a.C1055a) && !(aVar instanceof e04.a.d)) {
                                            if (aVar instanceof e04.a.Error) {
                                                return new dx.i.Left(((e04.a.Error) aVar).getErrorType());
                                            }
                                            throw new oq.p();
                                        }
                                        return new dx.i.Right(aVar);
                                    }
                                    ac4.a aVar2 = this.callActionWithLoaderUseCase;
                                    c cVar = new c(params3, aVar, bVar5, null);
                                    bVar6.f122070d = vq.j.a(params3);
                                    bVar6.f122071e = jVar2;
                                    bVar6.f122072f = vq.j.a(bVar4);
                                    bVar6.f122073g = vq.j.a(bVar5);
                                    bVar6.f122074h = vq.j.a(aVar);
                                    bVar6.f122075j = vq.j.a(a0VarA);
                                    bVar6.f122076k = i19;
                                    bVar6.f122077l = i25;
                                    bVar6.f122078m = i26;
                                    bVar6.f122079n = i15;
                                    bVar6.f122082r = 3;
                                    objK = ac4.a.a(aVar2, null, cVar, bVar6, 1, null);
                                    if (objK != objE) {
                                    }
                                    return objE;
                                }
                                if (r15 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                u.b(objK);
                            } catch (CancellationException e15) {
                                throw e15;
                            }
                        } else {
                            int i36 = bVar6.f122079n;
                            i16 = bVar6.f122078m;
                            i17 = bVar6.f122077l;
                            int i37 = bVar6.f122076k;
                            ex.b bVar9 = (ex.b) bVar6.f122073g;
                            ex.b bVar10 = (ex.b) bVar6.f122072f;
                            dx.j jVar3 = (dx.j) bVar6.f122071e;
                            params2 = (g04.a.Params) bVar6.f122070d;
                            u.b(objK);
                            i15 = i36;
                            jVar = jVar3;
                            bVar2 = bVar10;
                            bVar3 = bVar9;
                            i18 = i37;
                        }
                        return (dx.i) objK;
                    }
                    u.b(objK);
                    jVar = this.securityExceptionParser;
                    ex.a aVar3 = new ex.a();
                    e04.e.b biometricStatus = params.getBiometricStatus();
                    i15 = 0;
                    if (!t.c(biometricStatus, e04.e.b.C1057b.f46689a)) {
                        if (t.c(biometricStatus, e04.e.b.a.f46688a)) {
                            b0 password = params.getPassword();
                            b0 pin = params.getPin();
                            bVar6.f122070d = params;
                            bVar6.f122071e = jVar;
                            bVar6.f122072f = vq.j.a(aVar3);
                            bVar6.f122073g = aVar3;
                            bVar6.f122076k = 0;
                            bVar6.f122077l = 0;
                            bVar6.f122078m = 0;
                            bVar6.f122079n = 0;
                            bVar6.f122082r = 1;
                            objK = k(password, pin, bVar6);
                            if (objK != objE) {
                                i16 = 0;
                                i17 = 0;
                                bVar2 = aVar3;
                                params2 = params;
                                i18 = 0;
                                bVar3 = bVar2;
                            }
                        } else {
                            a0VarA = a0.INSTANCE.a();
                            i16 = 0;
                            i17 = 0;
                            bVar2 = aVar3;
                            params2 = params;
                            i18 = 0;
                            bVar3 = bVar2;
                        }
                        return objE;
                    }
                    params2 = params;
                    a0VarA = new a0(iy.c.b(this.bytesConverter, params.getPassword().getData(), null, 2, null));
                    i16 = 0;
                    i17 = 0;
                    bVar3 = aVar3;
                    bVar2 = bVar3;
                    i18 = 0;
                    g04.b bVar11 = this.authenticateWithBiometricUseCase;
                    g04.b.AbstractC1552b.Encrypt encrypt = new g04.b.AbstractC1552b.Encrypt(a0VarA, g04.b.a.CHECK, null, null, null, 28, null);
                    bVar6.f122070d = params2;
                    bVar6.f122071e = jVar;
                    bVar6.f122072f = vq.j.a(bVar2);
                    bVar6.f122073g = bVar3;
                    bVar6.f122074h = vq.j.a(a0VarA);
                    bVar6.f122076k = i18;
                    bVar6.f122077l = i17;
                    bVar6.f122078m = i16;
                    bVar6.f122079n = i15;
                    bVar6.f122082r = 2;
                    objK = bVar11.c(encrypt, bVar6);
                    if (objK != objE) {
                        ex.b bVar12 = bVar2;
                        jVar2 = jVar;
                        params3 = params2;
                        bVar4 = bVar12;
                        bVar5 = bVar3;
                        i19 = i18;
                        i25 = i17;
                        i26 = i16;
                        aVar = (e04.a) objK;
                        if (!(aVar instanceof e04.a.AuthenticationSucceed)) {
                            if (!(aVar instanceof e04.a.C1055a)) {
                                if (aVar instanceof e04.a.Error) {
                                    return new dx.i.Left(((e04.a.Error) aVar).getErrorType());
                                }
                                throw new oq.p();
                            }
                            return new dx.i.Right(aVar);
                        }
                        ac4.a aVar4 = this.callActionWithLoaderUseCase;
                        c cVar2 = new c(params3, aVar, bVar5, null);
                        bVar6.f122070d = vq.j.a(params3);
                        bVar6.f122071e = jVar2;
                        bVar6.f122072f = vq.j.a(bVar4);
                        bVar6.f122073g = vq.j.a(bVar5);
                        bVar6.f122074h = vq.j.a(aVar);
                        bVar6.f122075j = vq.j.a(a0VarA);
                        bVar6.f122076k = i19;
                        bVar6.f122077l = i25;
                        bVar6.f122078m = i26;
                        bVar6.f122079n = i15;
                        bVar6.f122082r = 3;
                        objK = ac4.a.a(aVar4, null, cVar2, bVar6, 1, null);
                        if (objK != objE) {
                            return (dx.i) objK;
                        }
                    }
                    return objE;
                    a0VarA = (a0) objK;
                    g04.b bVar13 = this.authenticateWithBiometricUseCase;
                    g04.b.AbstractC1552b.Encrypt encrypt2 = new g04.b.AbstractC1552b.Encrypt(a0VarA, g04.b.a.CHECK, null, null, null, 28, null);
                    bVar6.f122070d = params2;
                    bVar6.f122071e = jVar;
                    bVar6.f122072f = vq.j.a(bVar2);
                    bVar6.f122073g = bVar3;
                    bVar6.f122074h = vq.j.a(a0VarA);
                    bVar6.f122076k = i18;
                    bVar6.f122077l = i17;
                    bVar6.f122078m = i16;
                    bVar6.f122079n = i15;
                    bVar6.f122082r = 2;
                    objK = bVar13.c(encrypt2, bVar6);
                    if (objK != objE) {
                        ex.b bVar14 = bVar2;
                        jVar2 = jVar;
                        params3 = params2;
                        bVar4 = bVar14;
                        bVar5 = bVar3;
                        i19 = i18;
                        i25 = i17;
                        i26 = i16;
                        aVar = (e04.a) objK;
                        if (!(aVar instanceof e04.a.AuthenticationSucceed)) {
                            if (!(aVar instanceof e04.a.C1055a)) {
                                if (aVar instanceof e04.a.Error) {
                                    return new dx.i.Left(((e04.a.Error) aVar).getErrorType());
                                }
                                throw new oq.p();
                            }
                            return new dx.i.Right(aVar);
                        }
                        ac4.a aVar5 = this.callActionWithLoaderUseCase;
                        c cVar3 = new c(params3, aVar, bVar5, null);
                        bVar6.f122070d = vq.j.a(params3);
                        bVar6.f122071e = jVar2;
                        bVar6.f122072f = vq.j.a(bVar4);
                        bVar6.f122073g = vq.j.a(bVar5);
                        bVar6.f122074h = vq.j.a(aVar);
                        bVar6.f122075j = vq.j.a(a0VarA);
                        bVar6.f122076k = i19;
                        bVar6.f122077l = i25;
                        bVar6.f122078m = i26;
                        bVar6.f122079n = i15;
                        bVar6.f122082r = 3;
                        objK = ac4.a.a(aVar5, null, cVar3, bVar6, 1, null);
                        if (objK != objE) {
                            return (dx.i) objK;
                        }
                    }
                    return objE;
                } catch (Exception e16) {
                    e = e16;
                    px.f fVar = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(r15));
                    iVarA = r15.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e17) {
                e = e17;
                return new dx.i.Left((dx.b) ex.d.a(e));
            } catch (CancellationException e18) {
                throw e18;
            } catch (Exception e19) {
                e = e19;
                r15 = obj;
                px.f fVar2 = px.f.f163100a;
                message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar2.d(message, e, px.c.a(r15));
                iVarA = r15.a(e);
                if (iVarA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                } else {
                    if (iVarA instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVarA).b();
                }
                return new dx.i.Left(objB);
            }
        } catch (ex.c e25) {
            e = e25;
            return new dx.i.Left((dx.b) ex.d.a(e));
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
