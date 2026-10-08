package p02;

import eo0.BEDictionaryAdditionalInformation;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lp02/n;", "", "Lp02/n$a;", "Leo0/h;", "Lgo0/i;", "fetchMessageRecipientsInfo", "Lj02/a;", "dataSource", "<init>", "(Lgo0/i;Lj02/a;)V", "", "Leo0/f;", "type", "d", "(Ljava/util/List;Leo0/f;)Leo0/h;", "params", "Ldx/i;", "Ldx/b;", "e", "(Lp02/n$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo0/i;", "b", "Lj02/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final go0.i fetchMessageRecipientsInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j02.a dataSource;

    /* JADX INFO: renamed from: p02.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/n$a;", "Lgz/b$a;", "Leo0/f;", "infoType", "<init>", "(Leo0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/f;", "()Leo0/f;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo0.f infoType;

        public Params(eo0.f fVar) {
            this.infoType = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final eo0.f getInfoType() {
            return this.infoType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.infoType == ((Params) other).infoType;
        }

        public int hashCode() {
            return this.infoType.hashCode();
        }

        public String toString() {
            return "Params(infoType=" + this.infoType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151232f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f151234h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151232f = obj;
            this.f151234h |= PKIFailureInfo.systemUnavail;
            return n.this.e(null, this);
        }
    }

    public n(go0.i iVar, j02.a aVar) {
        this.fetchMessageRecipientsInfo = iVar;
        this.dataSource = aVar;
    }

    private final BEDictionaryAdditionalInformation d(List<BEDictionaryAdditionalInformation> list, eo0.f fVar) {
        Object next;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((BEDictionaryAdditionalInformation) next).getType() == fVar) {
                return (BEDictionaryAdditionalInformation) next;
            }
        }
        next = null;
        return (BEDictionaryAdditionalInformation) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, BEDictionaryAdditionalInformation>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f151234h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f151234h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f151232f;
        Object objE = uq.b.e();
        int i16 = bVar.f151234h;
        if (i16 == 0) {
            oq.u.b(objC);
            m02.f additionalInfoResult = this.dataSource.getAdditionalInfoResult();
            if (additionalInfoResult instanceof m02.f.Success) {
                BEDictionaryAdditionalInformation bEDictionaryAdditionalInformationD = d(((m02.f.Success) additionalInfoResult).a(), params.getInfoType());
                return bEDictionaryAdditionalInformationD != null ? new dx.i.Right(bEDictionaryAdditionalInformationD) : new dx.i.Left(new dx.b.Generic(null, 1, null));
            }
            if (!(additionalInfoResult instanceof m02.f.c) && !(additionalInfoResult instanceof m02.f.Error)) {
                if (additionalInfoResult instanceof m02.f.a) {
                    return new dx.i.Left(dx.b.g.c.f45047a);
                }
                throw new oq.p();
            }
            go0.i iVar = this.fetchMessageRecipientsInfo;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar.f151230d = params;
            bVar.f151231e = vq.j.a(additionalInfoResult);
            bVar.f151234h = 1;
            objC = iVar.c(c1792a, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (Params) bVar.f151230d;
            oq.u.b(objC);
        }
        dx.i iVar2 = (dx.i) objC;
        if (iVar2 instanceof dx.i.Left) {
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar2).b();
            if (bVar2 instanceof dx.b.g.c) {
                this.dataSource.b0(m02.f.a.f122034a);
            } else {
                this.dataSource.b0(new m02.f.Error(bVar2));
            }
            return new dx.i.Left(bVar2);
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List<BEDictionaryAdditionalInformation> list = (List) ((dx.i.Right) iVar2).b();
        this.dataSource.b0(new m02.f.Success(list));
        BEDictionaryAdditionalInformation bEDictionaryAdditionalInformationD2 = d(list, params.getInfoType());
        return bEDictionaryAdditionalInformationD2 != null ? new dx.i.Right(bEDictionaryAdditionalInformationD2) : new dx.i.Left(new dx.b.Generic(null, 1, null));
    }
}
