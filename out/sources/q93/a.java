package q93;

import er.l;
import er.p;
import fr.t;
import mu.g;
import mu.i;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lq93/a;", "Lf93/a;", "Lac4/a;", "callActionWithLoaderUseCase", "Lc54/b;", "isFeatureEnabledUseCase", "Ld93/b;", "threatDetectionManager", "<init>", "(Lac4/a;Lc54/b;Ld93/b;)V", "Lgz/b$a$a;", "params", "Le93/c;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lac4/a;", "b", "Lc54/b;", "c", "Ld93/b;", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f93.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d93.b threatDetectionManager;

    /* JADX INFO: renamed from: q93.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le93/c;", "<anonymous>", "()Le93/c;"}, k = 3, mv = {2, 2, 0})
    static final class C4126a extends k implements l<e<? super e93.c>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165398e;

        /* JADX INFO: renamed from: q93.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le93/c;", "threatDetectionState", "", "<anonymous>", "(Le93/c;)Z"}, k = 3, mv = {2, 2, 0})
        static final class C4127a extends k implements p<e93.c, e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f165400e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f165401f;

            C4127a(e<? super C4127a> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                e93.c cVar = (e93.c) this.f165401f;
                uq.b.e();
                if (this.f165400e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return vq.b.a(!t.c(cVar, e93.c.b.f48791a));
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(e93.c cVar, e<? super Boolean> eVar) {
                return ((C4127a) v(cVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                C4127a c4127a = new C4127a(eVar);
                c4127a.f165401f = obj;
                return c4127a;
            }
        }

        C4126a(e<? super C4126a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f165398e;
            if (i15 == 0) {
                u.b(obj);
                if (!a.this.isFeatureEnabledUseCase.a(b54.c.THREAT_DETECTION).booleanValue()) {
                    return e93.c.d.f48793a;
                }
                g<e93.c> gVarA = a.this.threatDetectionManager.a();
                C4127a c4127a = new C4127a(null);
                this.f165398e = 1;
                obj = i.y(gVarA, c4127a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return (e93.c) obj;
        }

        public final e<i0> M(e<?> eVar) {
            return a.this.new C4126a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super e93.c> eVar) {
            return ((C4126a) M(eVar)).J(i0.f148189a);
        }
    }

    public a(ac4.a aVar, c54.b bVar, d93.b bVar2) {
        this.callActionWithLoaderUseCase = aVar;
        this.isFeatureEnabledUseCase = bVar;
        this.threatDetectionManager = bVar2;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super e93.c> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new C4126a(null), eVar, 1, null);
    }
}
