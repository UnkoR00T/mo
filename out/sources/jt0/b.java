package jt0;

import dx.i;
import fr.t;
import ht0.BEPlaceDetails;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import vy.Coordinates;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljt0/b;", "Ljt0/a;", "Lit0/a;", "repository", "<init>", "(Lit0/a;)V", "Ljt0/a$a;", "params", "Ldx/i;", "Ldx/b;", "Ljt0/a$b;", "d", "(Ljt0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lit0/a;", "places_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements jt0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final it0.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f105221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f105222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f105223g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f105225j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105223g = obj;
            this.f105225j |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(it0.a aVar) {
        this.repository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(jt0.a.Params params, tq.e<? super i<? extends dx.b, ? extends jt0.a.b>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f105225j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f105225j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f105223g;
        Object objE = uq.b.e();
        int i16 = aVar.f105225j;
        if (i16 == 0) {
            u.b(objA);
            it0.a aVar2 = this.repository;
            Coordinates coordinates = params.getCoordinates();
            aVar.f105220d = j.a(params);
            aVar.f105221e = params;
            aVar.f105222f = 0;
            aVar.f105225j = 1;
            objA = aVar2.a(coordinates, aVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (jt0.a.Params) aVar.f105221e;
            u.b(objA);
        }
        Object right = (i) objA;
        if (!(right instanceof i.Left)) {
            if (!(right instanceof i.Right)) {
                throw new p();
            }
            right = new i.Right(new jt0.a.b.Found((BEPlaceDetails) ((i.Right) right).b()));
        }
        if (right instanceof i.Left) {
            dx.b bVar = (dx.b) ((i.Left) right).b();
            return t.c(bVar, dx.b.g.c.f45047a) ? new i.Right(new jt0.a.b.NotFound(params.getCoordinates())) : new i.Left(bVar);
        }
        if (right instanceof i.Right) {
            return right;
        }
        throw new p();
    }
}
