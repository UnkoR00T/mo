package f82;

import fr.t;
import hz.g;
import iy.b0;
import j14.n;
import java.util.Map;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import tq.e;
import vq.d;
import vq.j;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lf82/b;", "Lgz/b;", "Lf82/b$a;", "", "Lz72/a;", "Lhz/g;", "Le82/b;", "checkIfApplicantDetailsValidUseCase", "Lj14/a;", "checkEmailCorrectUC", "Lj14/n;", "checkPhoneNumberCorrectUC", "<init>", "(Le82/b;Lj14/a;Lj14/n;)V", "params", "d", "(Lf82/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Le82/b;", "b", "Lj14/a;", "c", "Lj14/n;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, Map<z72.a, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e82.b checkIfApplicantDetailsValidUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: f82.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lf82/b$a;", "Lgz/b$a;", "Liy/b0;", "fullName", "address", "email", "phoneNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "d", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f60122e = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 fullName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 address;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 email;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 phoneNumber;

        public Params(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4) {
            this.fullName = b0Var;
            this.address = b0Var2;
            this.email = b0Var3;
            this.phoneNumber = b0Var4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getFullName() {
            return this.fullName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getPhoneNumber() {
            return this.phoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.fullName, params.fullName) && t.c(this.address, params.address) && t.c(this.email, params.email) && t.c(this.phoneNumber, params.phoneNumber);
        }

        public int hashCode() {
            return (((((this.fullName.hashCode() * 31) + this.address.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode();
        }

        public String toString() {
            return "Params(fullName=" + this.fullName + ", address=" + this.address + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ')';
        }
    }

    /* JADX INFO: renamed from: f82.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1355b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f60127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f60128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f60129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f60130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f60131h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f60132j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f60134l;

        C1355b(e<? super C1355b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60132j = obj;
            this.f60134l |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(e82.b bVar, j14.a aVar, n nVar) {
        this.checkIfApplicantDetailsValidUseCase = bVar;
        this.checkEmailCorrectUC = aVar;
        this.checkPhoneNumberCorrectUC = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x011c  */
    /* JADX WARN: Code duplicated, block: B:35:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(Params params, e<? super Map<z72.a, ? extends g>> eVar) throws Throwable {
        C1355b c1355b;
        r[] rVarArr;
        z72.a aVar;
        int i15;
        Params params2;
        r[] rVarArr2;
        z72.a aVar2;
        r[] rVarArr3;
        z72.a aVar3;
        r[] rVarArr4;
        r[] rVarArr5;
        Params params3;
        z72.a aVar4;
        Object objC;
        z72.a aVar5;
        r[] rVarArr6;
        r[] rVarArr7;
        if (eVar instanceof C1355b) {
            c1355b = (C1355b) eVar;
            int i16 = c1355b.f60134l;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                c1355b.f60134l = i16 - PKIFailureInfo.systemUnavail;
            } else {
                c1355b = new C1355b(eVar);
            }
        } else {
            c1355b = new C1355b(eVar);
        }
        Object objD = c1355b.f60132j;
        Object objE = uq.b.e();
        int i17 = c1355b.f60134l;
        int i18 = 3;
        int i19 = 2;
        int i25 = 1;
        if (i17 == 0) {
            u.b(objD);
            rVarArr = new r[4];
            aVar = z72.a.NAME_AND_SURNAME;
            e82.b bVar = this.checkIfApplicantDetailsValidUseCase;
            e82.b.a.C1127b c1127b = new e82.b.a.C1127b(params.getFullName());
            c1355b.f60127d = params;
            c1355b.f60128e = rVarArr;
            c1355b.f60129f = rVarArr;
            c1355b.f60130g = aVar;
            c1355b.f60131h = 0;
            c1355b.f60134l = 1;
            objD = bVar.d(c1127b, c1355b);
            if (objD != objE) {
                i15 = 0;
                params2 = params;
                rVarArr2 = rVarArr;
            }
            return objE;
        }
        if (i17 == 1) {
            i15 = c1355b.f60131h;
            aVar = (z72.a) c1355b.f60130g;
            r[] rVarArr8 = (r[]) c1355b.f60129f;
            r[] rVarArr9 = (r[]) c1355b.f60128e;
            params2 = (Params) c1355b.f60127d;
            u.b(objD);
            rVarArr2 = rVarArr8;
            rVarArr = rVarArr9;
        } else {
            if (i17 == 2) {
                i25 = c1355b.f60131h;
                aVar2 = (z72.a) c1355b.f60130g;
                rVarArr3 = (r[]) c1355b.f60129f;
                rVarArr = (r[]) c1355b.f60128e;
                Params params4 = (Params) c1355b.f60127d;
                u.b(objD);
                params2 = params4;
                rVarArr3[i25] = y.a(aVar2, objD);
                aVar3 = z72.a.EMAIL;
                j14.a aVar6 = this.checkEmailCorrectUC;
                j14.a.Params params5 = new j14.a.Params(params2.getEmail(), false, null, 4, null);
                c1355b.f60127d = params2;
                c1355b.f60128e = rVarArr;
                c1355b.f60129f = rVarArr;
                c1355b.f60130g = aVar3;
                c1355b.f60131h = 2;
                c1355b.f60134l = 3;
                objD = aVar6.c(params5, c1355b);
                if (objD != objE) {
                    rVarArr4 = rVarArr;
                    rVarArr5 = rVarArr4;
                    params3 = params2;
                    rVarArr4[i19] = y.a(aVar3, objD);
                    aVar4 = z72.a.PHONE_NUMBER;
                    n nVar = this.checkPhoneNumberCorrectUC;
                    n.a.CheckNumber checkNumber = new n.a.CheckNumber(new PhoneNumber(PhoneNumber.c.c(b0.INSTANCE.a()), PhoneNumber.b.c(params3.getPhoneNumber()), null), false);
                    c1355b.f60127d = j.a(params3);
                    c1355b.f60128e = rVarArr5;
                    c1355b.f60129f = rVarArr5;
                    c1355b.f60130g = aVar4;
                    c1355b.f60131h = 3;
                    c1355b.f60134l = 4;
                    objC = nVar.c(checkNumber, c1355b);
                    if (objC != objE) {
                        aVar5 = aVar4;
                        objD = objC;
                        rVarArr6 = rVarArr5;
                        rVarArr7 = rVarArr6;
                    }
                }
                return objE;
            }
            if (i17 == 3) {
                i19 = c1355b.f60131h;
                aVar3 = (z72.a) c1355b.f60130g;
                rVarArr4 = (r[]) c1355b.f60129f;
                rVarArr5 = (r[]) c1355b.f60128e;
                params3 = (Params) c1355b.f60127d;
                u.b(objD);
                rVarArr4[i19] = y.a(aVar3, objD);
                aVar4 = z72.a.PHONE_NUMBER;
                n nVar2 = this.checkPhoneNumberCorrectUC;
                n.a.CheckNumber checkNumber2 = new n.a.CheckNumber(new PhoneNumber(PhoneNumber.c.c(b0.INSTANCE.a()), PhoneNumber.b.c(params3.getPhoneNumber()), null), false);
                c1355b.f60127d = j.a(params3);
                c1355b.f60128e = rVarArr5;
                c1355b.f60129f = rVarArr5;
                c1355b.f60130g = aVar4;
                c1355b.f60131h = 3;
                c1355b.f60134l = 4;
                objC = nVar2.c(checkNumber2, c1355b);
                if (objC != objE) {
                    aVar5 = aVar4;
                    objD = objC;
                    rVarArr6 = rVarArr5;
                    rVarArr7 = rVarArr6;
                }
                return objE;
            }
            if (i17 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i18 = c1355b.f60131h;
            aVar5 = (z72.a) c1355b.f60130g;
            rVarArr6 = (r[]) c1355b.f60129f;
            rVarArr7 = (r[]) c1355b.f60128e;
            u.b(objD);
        }
        rVarArr6[i18] = y.a(aVar5, objD);
        return v0.l(rVarArr7);
        rVarArr2[i15] = y.a(aVar, objD);
        aVar2 = z72.a.ADDRESS;
        e82.b bVar2 = this.checkIfApplicantDetailsValidUseCase;
        e82.b.a.C1126a c1126a = new e82.b.a.C1126a(params2.getAddress());
        c1355b.f60127d = params2;
        c1355b.f60128e = rVarArr;
        c1355b.f60129f = rVarArr;
        c1355b.f60130g = aVar2;
        c1355b.f60131h = 1;
        c1355b.f60134l = 2;
        objD = bVar2.d(c1126a, c1355b);
        if (objD != objE) {
            rVarArr3 = rVarArr;
            rVarArr3[i25] = y.a(aVar2, objD);
            aVar3 = z72.a.EMAIL;
            j14.a aVar7 = this.checkEmailCorrectUC;
            j14.a.Params params6 = new j14.a.Params(params2.getEmail(), false, null, 4, null);
            c1355b.f60127d = params2;
            c1355b.f60128e = rVarArr;
            c1355b.f60129f = rVarArr;
            c1355b.f60130g = aVar3;
            c1355b.f60131h = 2;
            c1355b.f60134l = 3;
            objD = aVar7.c(params6, c1355b);
            if (objD != objE) {
                rVarArr4 = rVarArr;
                rVarArr5 = rVarArr4;
                params3 = params2;
                rVarArr4[i19] = y.a(aVar3, objD);
                aVar4 = z72.a.PHONE_NUMBER;
                n nVar3 = this.checkPhoneNumberCorrectUC;
                n.a.CheckNumber checkNumber3 = new n.a.CheckNumber(new PhoneNumber(PhoneNumber.c.c(b0.INSTANCE.a()), PhoneNumber.b.c(params3.getPhoneNumber()), null), false);
                c1355b.f60127d = j.a(params3);
                c1355b.f60128e = rVarArr5;
                c1355b.f60129f = rVarArr5;
                c1355b.f60130g = aVar4;
                c1355b.f60131h = 3;
                c1355b.f60134l = 4;
                objC = nVar3.c(checkNumber3, c1355b);
                if (objC != objE) {
                    aVar5 = aVar4;
                    objD = objC;
                    rVarArr6 = rVarArr5;
                    rVarArr7 = rVarArr6;
                    rVarArr6[i18] = y.a(aVar5, objD);
                    return v0.l(rVarArr7);
                }
            }
        }
        return objE;
    }
}
