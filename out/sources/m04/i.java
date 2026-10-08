package m04;

import er.p;
import iy.t;
import ju.g1;
import ju.l0;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import v64.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lm04/i;", "Lg04/i;", "Lac4/a;", "callActionWithLoaderUseCase", "Lv64/s;", "setBiometricPinProtectionUseCase", "Lf04/a;", "biometricRepository", "Liy/t;", "keyStoreProvider", "Lpx/d;", "remoteLogger", "Ll04/a;", "biometricUserInteractor", "Lg04/o;", "saveBiometricPinUC", "<init>", "(Lac4/a;Lv64/s;Lf04/a;Liy/t;Lpx/d;Ll04/a;Lg04/o;)V", "Lgz/b$a$a;", "params", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lac4/a;", "b", "Lv64/s;", "c", "Lf04/a;", "d", "Liy/t;", "e", "Lpx/d;", "f", "Ll04/a;", "g", "Lg04/o;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements g04.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s setBiometricPinProtectionUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f04.a biometricRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t keyStoreProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l04.a biometricUserInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g04.o saveBiometricPinUC;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.k implements er.l<tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122258e;

        /* JADX INFO: renamed from: m04.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
        static final class C2991a extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f122260e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f122261f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ i f122262g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2991a(i iVar, tq.e<? super C2991a> eVar) {
                super(2, eVar);
                this.f122262g = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00ab A[Catch: KeyStoreException -> 0x00b1, TRY_LEAVE, TryCatch #0 {KeyStoreException -> 0x00b1, blocks: (B:25:0x0093, B:27:0x00ab), top: B:35:0x0093 }] */
            /* JADX WARN: Code duplicated, block: B:34:0x00e9 A[RETURN] */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
            
                if (r13 == r2) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
            
                if (r13 == r2) goto L33;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 234
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m04.i.a.C2991a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
                return ((C2991a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C2991a c2991a = new C2991a(this.f122262g, eVar);
                c2991a.f122261f = obj;
                return c2991a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f122258e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            l0 l0VarB = g1.b();
            C2991a c2991a = new C2991a(i.this, null);
            this.f122258e = 1;
            Object objG = ju.i.g(l0VarB, c2991a, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super Boolean> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public i(ac4.a aVar, s sVar, f04.a aVar2, t tVar, px.d dVar, l04.a aVar3, g04.o oVar) {
        this.callActionWithLoaderUseCase = aVar;
        this.setBiometricPinProtectionUseCase = sVar;
        this.biometricRepository = aVar2;
        this.keyStoreProvider = tVar;
        this.remoteLogger = dVar;
        this.biometricUserInteractor = aVar3;
        this.saveBiometricPinUC = oVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }
}
