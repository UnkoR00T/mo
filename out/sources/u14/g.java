package u14;

import er.p;
import fr.t;
import ju.g1;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;
import w04.LocationData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lu14/g;", "Le14/h;", "Lgy/a;", "permissionManager", "<init>", "(Lgy/a;)V", "Lgz/b$a$a;", "params", "Lw04/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lgy/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements e14.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lw04/b;", "<anonymous>", "(Lju/p0;)Lw04/b;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super LocationData>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194380e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f194380e;
            if (i15 == 0) {
                u.b(obj);
                gy.a aVar = g.this.permissionManager;
                gy.d dVar = gy.d.GPS;
                this.f194380e = 1;
                obj = aVar.d(dVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return t.c((gy.c) obj, gy.c.a.f78236a) ? new LocationData(true) : new LocationData(false);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super LocationData> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return g.this.new a(eVar);
        }
    }

    public g(gy.a aVar) {
        this.permissionManager = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super LocationData> eVar) {
        return ju.i.g(g1.b(), new a(null), eVar);
    }
}
