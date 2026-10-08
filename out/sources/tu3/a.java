package tu3;

import dx.i;
import er.l;
import fj0.g;
import fr.t;
import iy.b0;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;
import xi0.ContactDetails;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltu3/a;", "", "Lgz/b$a$a;", "Ltu3/a$a;", "Lac4/a;", "callActionWithLoaderUseCase", "Lfj0/g;", "getContactDetailsUseCase", "<init>", "(Lac4/a;Lfj0/g;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lac4/a;", "b", "Lfj0/g;", "contactdetailsform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g getContactDetailsUseCase;

    /* JADX INFO: renamed from: tu3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltu3/a$a;", "", "Liy/b0;", "email", "Lxw/h;", "phoneNumber", "<init>", "(Liy/b0;Lxw/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lxw/h;", "()Lxw/h;", "contactdetailsform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f192341c = PhoneNumber.f221634d | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhoneNumber phoneNumber;

        public Result(b0 b0Var, PhoneNumber phoneNumber) {
            this.email = b0Var;
            this.phoneNumber = phoneNumber;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.email, result.email) && t.c(this.phoneNumber, result.phoneNumber);
        }

        public int hashCode() {
            b0 b0Var = this.email;
            int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
            PhoneNumber phoneNumber = this.phoneNumber;
            return iHashCode + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        }

        public String toString() {
            return "Result(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Ltu3/a$a;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements l<e<? super i<? extends dx.b, ? extends Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192344e;

        b(e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f192344e;
            if (i15 == 0) {
                u.b(obj);
                g gVar = a.this.getContactDetailsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f192344e = 1;
                obj = gVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            i iVar = (i) obj;
            if (iVar instanceof i.Left) {
                return iVar;
            }
            if (!(iVar instanceof i.Right)) {
                throw new p();
            }
            ContactDetails contactDetails = (ContactDetails) ((i.Right) iVar).b();
            return new i.Right(new Result(contactDetails.getRegisteredEmail(), contactDetails.getRegisteredPhoneNumber()));
        }

        public final e<i0> M(e<?> eVar) {
            return a.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i<? extends dx.b, Result>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public a(ac4.a aVar, g gVar) {
        this.callActionWithLoaderUseCase = aVar;
        this.getContactDetailsUseCase = gVar;
    }

    public Object a(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, Result>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(null), eVar, 1, null);
    }
}
