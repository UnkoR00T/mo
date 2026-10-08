package pm1;

import al0.BEGenerateXmlResponse;
import dx.i;
import er.p;
import fr.t;
import j44.Access;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.j;
import vq.k;
import wn1.SummaryModel;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpm1/a;", "Lgz/b;", "Lpm1/a$a;", "Ldx/i;", "Lk44/a;", "Lal0/m;", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lql0/a;", "generateXmlUC", "<init>", "(Ll44/a;Lql0/a;)V", "params", "e", "(Lpm1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Lql0/a;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, i<? extends k44.a, ? extends BEGenerateXmlResponse>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ql0.a generateXmlUC;

    /* JADX INFO: renamed from: pm1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpm1/a$a;", "Lgz/b$a;", "Lwn1/a;", "data", "<init>", "(Lwn1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn1/a;", "()Lwn1/a;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SummaryModel data;

        public Params(SummaryModel summaryModel) {
            this.data = summaryModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SummaryModel getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "owAccessToken", "Ldx/i;", "Ldx/b;", "Lal0/m;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<Access, e<? super i<? extends dx.b, ? extends BEGenerateXmlResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f160901f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f160903h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, e<? super b> eVar) {
            super(2, eVar);
            this.f160903h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f160901f;
            Object objE = uq.b.e();
            int i15 = this.f160900e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ql0.a aVar = a.this.generateXmlUC;
            ql0.a.Params params = new ql0.a.Params(nm1.a.a(access), nm1.a.f(this.f160903h.getData()), null);
            this.f160901f = j.a(access);
            this.f160900e = 1;
            Object objC = aVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, e<? super i<? extends dx.b, BEGenerateXmlResponse>> eVar) {
            return ((b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = a.this.new b(this.f160903h, eVar);
            bVar.f160901f = obj;
            return bVar;
        }
    }

    public a(l44.a aVar, ql0.a aVar2) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.generateXmlUC = aVar2;
    }

    public Object e(Params params, e<? super i<? extends k44.a, BEGenerateXmlResponse>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new b(params, null), eVar);
    }
}
