package l61;

import iy.c0;
import j44.Access;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll61/f;", "Lgz/b;", "Ll61/f$a;", "Ldx/i;", "Lk44/a;", "", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lol0/a;", "afterOnlinePaymentUC", "<init>", "(Ll44/a;Lol0/a;)V", "params", "e", "(Ll61/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Lol0/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b<Params, dx.i<? extends k44.a, ? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ol0.a afterOnlinePaymentUC;

    /* JADX INFO: renamed from: l61.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Ll61/f$a;", "Lgz/b$a;", "", "applicationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String applicationId;

        public Params(String str) {
            this.applicationId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.applicationId, ((Params) other).applicationId);
        }

        public int hashCode() {
            return this.applicationId.hashCode();
        }

        public String toString() {
            return "Params(applicationId=" + this.applicationId + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<Access, tq.e<? super dx.i<? extends dx.b, ? extends String>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116363f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f116365h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f116365h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f116363f;
            Object objE = uq.b.e();
            int i15 = this.f116362e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ol0.a aVar = f.this.afterOnlinePaymentUC;
            ol0.a.Params params = new ol0.a.Params(c0.g(access.getValue()), this.f116365h.getApplicationId());
            this.f116363f = vq.j.a(access);
            this.f116362e = 1;
            Object objC = aVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
            return ((b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = f.this.new b(this.f116365h, eVar);
            bVar.f116363f = obj;
            return bVar;
        }
    }

    public f(l44.a aVar, ol0.a aVar2) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.afterOnlinePaymentUC = aVar2;
    }

    public Object e(Params params, tq.e<? super dx.i<? extends k44.a, String>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new b(params, null), eVar);
    }
}
