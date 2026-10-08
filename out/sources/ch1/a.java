package ch1;

import cb4.DialogData;
import iq0.TemporaryInterruption;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lch1/a;", "Lgz/b;", "Lch1/a$a;", "Ldx/i;", "Loq/i0;", "Lcb4/d;", "Lh64/f;", "getFeatureTemporaryInterruptionUseCase", "Lzg1/c;", "mapper", "<init>", "(Lh64/f;Lzg1/c;)V", "params", "d", "(Lch1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lh64/f;", "b", "Lzg1/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, dx.i<? extends oq.i0, ? extends DialogData>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h64.f getFeatureTemporaryInterruptionUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zg1.c mapper;

    /* JADX INFO: renamed from: ch1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lch1/a$a;", "Lgz/b$a;", "Liq0/v;", "featureType", "<init>", "(Liq0/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liq0/v;", "()Liq0/v;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iq0.v featureType;

        public Params(iq0.v vVar) {
            this.featureType = vVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iq0.v getFeatureType() {
            return this.featureType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.featureType == ((Params) other).featureType;
        }

        public int hashCode() {
            return this.featureType.hashCode();
        }

        public String toString() {
            return "Params(featureType=" + this.featureType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f26780e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f26782g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26780e = obj;
            this.f26782g |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(h64.f fVar, zg1.c cVar) {
        this.getFeatureTemporaryInterruptionUseCase = fVar;
        this.mapper = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super dx.i<oq.i0, DialogData>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f26782g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f26782g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f26780e;
        Object objE = uq.b.e();
        int i16 = bVar.f26782g;
        if (i16 == 0) {
            oq.u.b(objC);
            h64.f fVar = this.getFeatureTemporaryInterruptionUseCase;
            h64.f.Params params2 = new h64.f.Params(params.getFeatureType());
            bVar.f26779d = vq.j.a(params);
            bVar.f26782g = 1;
            objC = fVar.c(params2, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        TemporaryInterruption temporaryInterruption = (TemporaryInterruption) objC;
        return temporaryInterruption != null ? new dx.i.Right(this.mapper.b(new zg1.c.Params(temporaryInterruption))) : new dx.i.Left(oq.i0.f148189a);
    }
}
