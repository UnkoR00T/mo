package ep2;

import er.p;
import fr.t;
import iy.c0;
import j44.Access;
import jl0.PassportChildAgreementXmlRequest;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lep2/g;", "Lgz/b;", "Lep2/g$a;", "Ldx/i;", "Lk44/a;", "Lry/a;", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Ltl0/c;", "generateXmlUC", "<init>", "(Ll44/a;Ltl0/c;)V", "params", "e", "(Lep2/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Ltl0/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, dx.i<? extends k44.a, ? extends ry.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tl0.c generateXmlUC;

    /* JADX INFO: renamed from: ep2.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lep2/g$a;", "Lgz/b$a;", "Ljl0/x;", "passportChildAgreementXmlRequest", "<init>", "(Ljl0/x;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljl0/x;", "()Ljl0/x;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PassportChildAgreementXmlRequest passportChildAgreementXmlRequest;

        public Params(PassportChildAgreementXmlRequest passportChildAgreementXmlRequest) {
            this.passportChildAgreementXmlRequest = passportChildAgreementXmlRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PassportChildAgreementXmlRequest getPassportChildAgreementXmlRequest() {
            return this.passportChildAgreementXmlRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.passportChildAgreementXmlRequest, ((Params) other).passportChildAgreementXmlRequest);
        }

        public int hashCode() {
            return this.passportChildAgreementXmlRequest.hashCode();
        }

        public String toString() {
            return "Params(passportChildAgreementXmlRequest=" + this.passportChildAgreementXmlRequest + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "Lry/a;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<Access, tq.e<? super dx.i<? extends dx.b, ? extends ry.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f52682f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f52684h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f52684h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f52682f;
            Object objE = uq.b.e();
            int i15 = this.f52681e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            tl0.c cVar = g.this.generateXmlUC;
            tl0.c.Params params = new tl0.c.Params(c0.g(access.getValue()), this.f52684h.getPassportChildAgreementXmlRequest());
            this.f52682f = vq.j.a(access);
            this.f52681e = 1;
            Object objC = cVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) {
            return ((b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = g.this.new b(this.f52684h, eVar);
            bVar.f52682f = obj;
            return bVar;
        }
    }

    public g(l44.a aVar, tl0.c cVar) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.generateXmlUC = cVar;
    }

    public Object e(Params params, tq.e<? super dx.i<? extends k44.a, ry.a>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new b(params, null), eVar);
    }
}
