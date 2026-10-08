package w24;

import i24.DrivingLicenceData;
import i24.DrivingLicenceFullData;
import java.util.Comparator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lw24/n0;", "Lw24/m0;", "Lv24/b;", "documentsContainerRepository", "<init>", "(Lv24/b;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Li24/l;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lv24/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f209858e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f209860g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209858e = obj;
            this.f209860g |= PKIFailureInfo.systemUnavail;
            return n0.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((DrivingLicenceData) t16).getScope().getData().getReleaseDate(), ((DrivingLicenceData) t15).getScope().getData().getReleaseDate());
        }
    }

    public n0(v24.b bVar) {
        this.documentsContainerRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, DrivingLicenceFullData>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f209860g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209860g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objM = aVar.f209858e;
        Object objE = uq.b.e();
        int i16 = aVar.f209860g;
        if (i16 == 0) {
            oq.u.b(objM);
            v24.b bVar = this.documentsContainerRepository;
            aVar.f209857d = vq.j.a(c1792a);
            aVar.f209860g = 1;
            objM = bVar.m(aVar);
            if (objM == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objM);
        }
        dx.i iVar = (dx.i) objM;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        DrivingLicenceFullData drivingLicenceFullData = (DrivingLicenceFullData) ((dx.i.Right) iVar).b();
        return new dx.i.Right(DrivingLicenceFullData.b(drivingLicenceFullData, null, pq.v.U0(drivingLicenceFullData.d(), new b()), 1, null));
    }
}
