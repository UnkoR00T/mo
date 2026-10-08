package ty1;

import dx.i;
import er.l;
import gz.b;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;
import yi0.CitizenElectoralData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lty1/a;", "", "Lgz/b$a$a;", "Lsy1/a;", "Lgj0/a;", "getCitizenElectoralDataUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lgj0/a;Lac4/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lgj0/a;", "b", "Lac4/a;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gj0.a getCitizenElectoralDataUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: ty1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lsy1/a;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C5039a extends k implements l<e<? super i<? extends dx.b, ? extends sy1.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192610e;

        C5039a(e<? super C5039a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f192610e;
            if (i15 == 0) {
                u.b(obj);
                gj0.a aVar = a.this.getCitizenElectoralDataUseCase;
                b.a.C1792a c1792a = b.a.C1792a.f78542a;
                this.f192610e = 1;
                obj = aVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            i iVar = (i) obj;
            if (iVar instanceof i.Left) {
                dx.b bVar = (dx.b) ((i.Left) iVar).b();
                return bVar instanceof dx.b.g.c ? new i.Right(sy1.a.b.f185669a) : new i.Left(bVar);
            }
            if (iVar instanceof i.Right) {
                return new i.Right(new sy1.a.DataWrapped((CitizenElectoralData) ((i.Right) iVar).b()));
            }
            throw new p();
        }

        public final e<i0> M(e<?> eVar) {
            return a.this.new C5039a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i<? extends dx.b, ? extends sy1.a>> eVar) {
            return ((C5039a) M(eVar)).J(i0.f148189a);
        }
    }

    public a(gj0.a aVar, ac4.a aVar2) {
        this.getCitizenElectoralDataUseCase = aVar;
        this.callActionWithLoaderUseCase = aVar2;
    }

    public Object a(b.a.C1792a c1792a, e<? super i<? extends dx.b, ? extends sy1.a>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new C5039a(null), eVar, 1, null);
    }
}
