package z14;

import dx.i;
import mu.g;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import vy.Coordinates;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lz14/c;", "Li14/c;", "Luy/d;", "gpsManager", "<init>", "(Luy/d;)V", "Lgz/b$a$a;", "params", "Lvy/c;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Luy/d;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements i14.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f232311e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232313g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232311e = obj;
            this.f232313g |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(uy.d dVar) {
        this.gpsManager = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super Coordinates> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f232313g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f232313g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f232311e;
        Object objE = uq.b.e();
        int i16 = aVar.f232313g;
        if (i16 == 0) {
            u.b(objB);
            g<i<dx.b, Coordinates>> gVarG = this.gpsManager.g();
            aVar.f232310d = j.a(c1792a);
            aVar.f232313g = 1;
            objB = mu.i.B(gVarG, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (!(iVar instanceof i.Right)) {
            return null;
        }
        i.Right right = (i.Right) iVar;
        return new Coordinates(((Coordinates) right.b()).getLatitude(), ((Coordinates) right.b()).getLongitude());
    }
}
