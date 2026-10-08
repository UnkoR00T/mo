package wc3;

import er.l;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;
import uc3.PassportsData;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwc3/g;", "Lwc3/f;", "Lwc3/e;", "getPassportUC", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lwc3/e;Lac4/a;)V", "Lgz/b$a$a;", "params", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lwc3/e;", "b", "Lac4/a;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e getPassportUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends k implements l<tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212112e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212112e;
            if (i15 == 0) {
                u.b(obj);
                e eVar = g.this.getPassportUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f212112e = 1;
                obj = eVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return vq.b.a(false);
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new p();
            }
            PassportsData passportsData = (PassportsData) ((dx.i.Right) iVar).b();
            return vq.b.a((passportsData == null || passportsData.getGroupedPassports().d()) ? false : true);
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return g.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super Boolean> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public g(e eVar, ac4.a aVar) {
        this.getPassportUC = eVar;
        this.callActionWithLoaderUseCase = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }
}
