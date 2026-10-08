package e34;

import er.p;
import ju.g1;
import ju.i;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.j;
import vq.k;
import z24.CTLogInfoDomain;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le34/a;", "Ly24/a;", "Le34/b;", "ctLogListRepository", "<init>", "(Le34/b;)V", "Ly24/a$a;", "params", "Lz24/a;", "e", "(Ly24/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Le34/b;", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements y24.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b ctLogListRepository;

    /* JADX INFO: renamed from: e34.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lz24/a;", "<anonymous>", "(Lju/p0;)Lz24/a;"}, k = 3, mv = {2, 2, 0})
    static final class C1082a extends k implements p<p0, e<? super CTLogInfoDomain>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f47168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f47169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f47170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y24.a.C5971a f47171h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f47172j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1082a(y24.a.C5971a c5971a, a aVar, e<? super C1082a> eVar) {
            super(2, eVar);
            this.f47171h = c5971a;
            this.f47172j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f47170g;
            if (i15 == 0) {
                u.b(obj);
                byte[] logId = this.f47171h.getLogId();
                if (logId == null) {
                    return null;
                }
                b bVar = this.f47172j.ctLogListRepository;
                this.f47168e = j.a(logId);
                this.f47169f = 0;
                this.f47170g = 1;
                obj = bVar.a(logId, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return (CTLogInfoDomain) obj;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super CTLogInfoDomain> eVar) {
            return ((C1082a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new C1082a(this.f47171h, this.f47172j, eVar);
        }
    }

    public a(b bVar) {
        this.ctLogListRepository = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(y24.a.C5971a c5971a, e<? super CTLogInfoDomain> eVar) {
        return i.g(g1.b(), new C1082a(c5971a, this, null), eVar);
    }
}
