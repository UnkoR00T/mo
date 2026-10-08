package l61;

import cl0.BEPassportChildApplicationSubmitOnlinePaymentResponse;
import iy.b0;
import iy.c0;
import j44.Access;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll61/h;", "Lgz/b;", "Ll61/h$a;", "Ldx/i;", "Lk44/a;", "Lcl0/b0;", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lol0/d;", "submitXmlWithOnlinePaymentUC", "<init>", "(Ll44/a;Lol0/d;)V", "params", "e", "(Ll61/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Lol0/d;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b<Params, dx.i<? extends k44.a, ? extends BEPassportChildApplicationSubmitOnlinePaymentResponse>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ol0.d submitXmlWithOnlinePaymentUC;

    /* JADX INFO: renamed from: l61.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll61/h$a;", "Lgz/b$a;", "Lry/a;", "signedXml", "<init>", "(Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f116388b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 signedXml;

        public /* synthetic */ Params(b0 b0Var, fr.k kVar) {
            this(b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getSignedXml() {
            return this.signedXml;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && ry.a.d(this.signedXml, ((Params) other).signedXml);
        }

        public int hashCode() {
            return ry.a.e(this.signedXml);
        }

        public String toString() {
            return "Params(signedXml=" + ((Object) ry.a.f(this.signedXml)) + ')';
        }

        private Params(b0 b0Var) {
            this.signedXml = b0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "Lcl0/b0;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<Access, tq.e<? super dx.i<? extends dx.b, ? extends BEPassportChildApplicationSubmitOnlinePaymentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116391f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f116393h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f116393h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f116391f;
            Object objE = uq.b.e();
            int i15 = this.f116390e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ol0.d dVar = h.this.submitXmlWithOnlinePaymentUC;
            ol0.d.Params params = new ol0.d.Params(c0.g(access.getValue()), this.f116393h.getSignedXml(), null);
            this.f116391f = vq.j.a(access);
            this.f116390e = 1;
            Object objC = dVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationSubmitOnlinePaymentResponse>> eVar) {
            return ((b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = h.this.new b(this.f116393h, eVar);
            bVar.f116391f = obj;
            return bVar;
        }
    }

    public h(l44.a aVar, ol0.d dVar) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.submitXmlWithOnlinePaymentUC = dVar;
    }

    public Object e(Params params, tq.e<? super dx.i<? extends k44.a, BEPassportChildApplicationSubmitOnlinePaymentResponse>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new b(params, null), eVar);
    }
}
