package wc3;

import er.l;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;
import uc3.GroupedPassports;
import uc3.PassportsData;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwc3/a;", "", "Lgz/b$a$a;", "Luc3/i;", "Lwc3/h;", "savePassportsUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lez/a;", "currentTimeProvider", "Ltc3/a;", "userDataBackendInteractor", "<init>", "(Lwc3/h;Lac4/a;Lez/a;Ltc3/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lwc3/h;", "b", "Lac4/a;", "c", "Lez/a;", "d", "Ltc3/a;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h savePassportsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tc3.a userDataBackendInteractor;

    /* JADX INFO: renamed from: wc3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Luc3/i;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C5589a extends k implements l<tq.e<? super dx.i<? extends dx.b, ? extends PassportsData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212073g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f212074h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f212075j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f212076k;

        C5589a(tq.e<? super C5589a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            PassportsData passportsData;
            Object objE = uq.b.e();
            int i15 = this.f212076k;
            if (i15 == 0) {
                u.b(obj);
                tc3.a aVar = a.this.userDataBackendInteractor;
                this.f212076k = 1;
                obj = aVar.a(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                passportsData = (PassportsData) this.f212073g;
                u.b(obj);
            }
            return new dx.i.Right(passportsData);
            dx.i iVar = (dx.i) obj;
            a aVar2 = a.this;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new p();
            }
            GroupedPassports groupedPassports = (GroupedPassports) ((dx.i.Right) iVar).b();
            PassportsData passportsData2 = new PassportsData(new fz.b.OffsetDateTime(aVar2.currentTimeProvider.f()), groupedPassports);
            h hVar = aVar2.savePassportsUseCase;
            h.Params params = new h.Params(passportsData2);
            this.f212071e = j.a(iVar);
            this.f212072f = j.a(groupedPassports);
            this.f212073g = passportsData2;
            this.f212074h = 0;
            this.f212075j = 0;
            this.f212076k = 2;
            if (hVar.e(params, this) != objE) {
                passportsData = passportsData2;
                return new dx.i.Right(passportsData);
            }
            return objE;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return a.this.new C5589a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, PassportsData>> eVar) {
            return ((C5589a) M(eVar)).J(i0.f148189a);
        }
    }

    public a(h hVar, ac4.a aVar, ez.a aVar2, tc3.a aVar3) {
        this.savePassportsUseCase = hVar;
        this.callActionWithLoaderUseCase = aVar;
        this.currentTimeProvider = aVar2;
        this.userDataBackendInteractor = aVar3;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, PassportsData>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new C5589a(null), eVar, 1, null);
    }
}
