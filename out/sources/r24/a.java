package r24;

import dx.b;
import er.p;
import f24.c;
import ju.p0;
import k24.g;
import k24.i;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lr24/a;", "Ldx/a;", "Lk24/g;", "getMainCertificateTypeUC", "Ls24/a;", "containersErrorInteractor", "Lk24/i;", "hasAnyActiveCertificateUC", "<init>", "(Lk24/g;Ls24/a;Lk24/i;)V", "", "clearData", "Ldx/b;", "b", "(Z)Ldx/b;", "a", "Lk24/g;", "Ls24/a;", "c", "Lk24/i;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements dx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g getMainCertificateTypeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s24.a containersErrorInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i hasAnyActiveCertificateUC;

    /* JADX INFO: renamed from: r24.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ldx/b;", "<anonymous>", "(Lju/p0;)Ldx/b;"}, k = 3, mv = {2, 2, 0})
    static final class C4342a extends k implements p<p0, e<? super b>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f171245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f171246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f171247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f171248h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f171249j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f171250k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f171251l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f171252m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f171254p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4342a(boolean z15, e<? super C4342a> eVar) {
            super(2, eVar);
            this.f171254p = z15;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x009b  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean z15;
            c cVar;
            s24.a aVar;
            dx.i iVar;
            Object objB;
            Object objE = uq.b.e();
            int i15 = this.f171252m;
            if (i15 == 0) {
                u.b(obj);
                g gVar = a.this.getMainCertificateTypeUC;
                g.Params params = new g.Params(false);
                this.f171252m = 1;
                obj = gVar.c(params, this);
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
                z15 = this.f171251l;
                aVar = (s24.a) this.f171248h;
                cVar = (c) this.f171247g;
                u.b(obj);
            }
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                objB = vq.b.a(false);
            } else {
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVar).b();
            }
            return aVar.a(cVar, z15, ((Boolean) objB).booleanValue());
            dx.i iVar2 = (dx.i) obj;
            a aVar2 = a.this;
            boolean z16 = this.f171254p;
            if (iVar2 instanceof dx.i.Left) {
                return (b) ((dx.i.Left) iVar2).b();
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            c cVar2 = (c) ((dx.i.Right) iVar2).b();
            s24.a aVar3 = aVar2.containersErrorInteractor;
            i iVar3 = aVar2.hasAnyActiveCertificateUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f171245e = j.a(iVar2);
            this.f171246f = j.a(cVar2);
            this.f171247g = cVar2;
            this.f171248h = aVar3;
            this.f171249j = 0;
            this.f171250k = 0;
            this.f171251l = z16;
            this.f171252m = 2;
            obj = iVar3.c(c1792a, this);
            if (obj != objE) {
                z15 = z16;
                cVar = cVar2;
                aVar = aVar3;
                iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    objB = vq.b.a(false);
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVar).b();
                }
                return aVar.a(cVar, z15, ((Boolean) objB).booleanValue());
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super b> eVar) {
            return ((C4342a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return a.this.new C4342a(this.f171254p, eVar);
        }
    }

    public a(g gVar, s24.a aVar, i iVar) {
        this.getMainCertificateTypeUC = gVar;
        this.containersErrorInteractor = aVar;
        this.hasAnyActiveCertificateUC = iVar;
    }

    @Override // dx.a
    public b b(boolean clearData) {
        return (b) ju.j.b(null, new C4342a(clearData, null), 1, null);
    }
}
