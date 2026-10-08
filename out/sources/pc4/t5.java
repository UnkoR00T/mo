package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpc4/t5;", "", "<init>", "()V", "Lab4/a;", "getApplicationLockStateUseCase", "Lab4/c;", "handleFailedAttemptUseCase", "Lab4/d;", "resetLockUseCase", "Lsj2/a;", "a", "(Lab4/a;Lab4/c;Lab4/d;)Lsj2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t5 f156380a = new t5();

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"pc4/t5$a", "Lsj2/a;", "", "c", "(Ltq/e;)Ljava/lang/Object;", "b", "Loq/i0;", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements sj2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ab4.a f156381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ab4.c f156382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ab4.d f156383c;

        /* JADX INFO: renamed from: pc4.t5$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3872a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156384a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f156385b;

            static {
                int[] iArr = new int[za4.a.values().length];
                try {
                    iArr[za4.a.LOCKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[za4.a.UNLOCKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f156384a = iArr;
                int[] iArr2 = new int[za4.b.values().length];
                try {
                    iArr2[za4.b.WITHIN_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[za4.b.EXCEEDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f156385b = iArr2;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156386d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156388f;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156386d = obj;
                this.f156388f |= PKIFailureInfo.systemUnavail;
                return a.this.c(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156389d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156391f;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156389d = obj;
                this.f156391f |= PKIFailureInfo.systemUnavail;
                return a.this.b(this);
            }
        }

        a(ab4.a aVar, ab4.c cVar, ab4.d dVar) {
            this.f156381a = aVar;
            this.f156382b = cVar;
            this.f156383c = dVar;
        }

        @Override // sj2.a
        public Object a(tq.e<? super oq.i0> eVar) {
            Object objA = this.f156383c.a(eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj2.a
        public Object b(tq.e<? super Boolean> eVar) throws Throwable {
            c cVar;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f156391f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f156391f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objA = cVar.f156389d;
            Object objE = uq.b.e();
            int i16 = cVar.f156391f;
            boolean z15 = true;
            if (i16 == 0) {
                oq.u.b(objA);
                ab4.c cVar2 = this.f156382b;
                cVar.f156391f = 1;
                objA = cVar2.a(cVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            int i17 = C3872a.f156385b[((za4.b) objA).ordinal()];
            if (i17 == 1) {
                z15 = false;
            } else if (i17 != 2) {
                throw new oq.p();
            }
            return vq.b.a(z15);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj2.a
        public Object c(tq.e<? super Boolean> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f156388f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f156388f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objA = bVar.f156386d;
            Object objE = uq.b.e();
            int i16 = bVar.f156388f;
            boolean z15 = true;
            if (i16 == 0) {
                oq.u.b(objA);
                ab4.a aVar = this.f156381a;
                bVar.f156388f = 1;
                objA = aVar.a(bVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            int i17 = C3872a.f156384a[((za4.a) objA).ordinal()];
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new oq.p();
                }
                z15 = false;
            }
            return vq.b.a(z15);
        }
    }

    private t5() {
    }

    public final sj2.a a(ab4.a getApplicationLockStateUseCase, ab4.c handleFailedAttemptUseCase, ab4.d resetLockUseCase) {
        return new a(getApplicationLockStateUseCase, handleFailedAttemptUseCase, resetLockUseCase);
    }
}
