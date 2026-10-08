package d03;

import b03.PermanentPersonalAddress;
import bh0.RegisteredAddress;
import dx.i;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import java.util.Locale;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u0003*\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ld03/b;", "", "Ld03/b$a;", "", "La03/a;", "registeredAddressContainersInteractor", "<init>", "(La03/a;)V", "Lb03/a;", "Lbh0/b;", "address", "d", "(Lb03/a;Lbh0/b;)Z", "Liy/b0;", "", "comparedText", "f", "(Liy/b0;Ljava/lang/String;)Z", "params", "Ldx/i;", "Ldx/b;", "e", "(Ld03/b$a;Ltq/e;)Ljava/lang/Object;", "a", "La03/a;", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a03.a registeredAddressContainersInteractor;

    /* JADX INFO: renamed from: d03.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ld03/b$a;", "Lgz/b$a;", "Lbh0/b;", "registeredAddress", "<init>", "(Lbh0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbh0/b;", "()Lbh0/b;", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RegisteredAddress registeredAddress;

        public Params(RegisteredAddress registeredAddress) {
            this.registeredAddress = registeredAddress;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RegisteredAddress getRegisteredAddress() {
            return this.registeredAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.registeredAddress, ((Params) other).registeredAddress);
        }

        public int hashCode() {
            return this.registeredAddress.hashCode();
        }

        public String toString() {
            return "Params(registeredAddress=" + this.registeredAddress + ')';
        }
    }

    /* JADX INFO: renamed from: d03.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0843b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f38986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f38987e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f38989g;

        C0843b(e<? super C0843b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f38987e = obj;
            this.f38989g |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    public b(a03.a aVar) {
        this.registeredAddressContainersInteractor = aVar;
    }

    private final boolean d(PermanentPersonalAddress permanentPersonalAddress, RegisteredAddress registeredAddress) {
        if (!f(permanentPersonalAddress.getStreetName(), registeredAddress.getStreetName()) || !f(permanentPersonalAddress.getHouseNumber(), registeredAddress.getBuildingNumber()) || !f(permanentPersonalAddress.getApartmentNumber(), registeredAddress.getApartmentNumber())) {
            return false;
        }
        b0 postalCode = permanentPersonalAddress.getPostalCode();
        String postalCode2 = registeredAddress.getPostalCode();
        return f(postalCode, postalCode2 != null ? r.P(postalCode2, "-", "", false, 4, null) : null) && f(permanentPersonalAddress.getLocality(), registeredAddress.getCity()) && f(permanentPersonalAddress.getVoivodeship(), registeredAddress.getVoivodeship());
    }

    private final boolean f(b0 b0Var, String str) {
        return t.c(g(b0Var != null ? c0.e(b0Var) : null), g(str));
    }

    private static final String g(String str) {
        String lowerCase;
        if (str != null && (lowerCase = str.toLowerCase(Locale.ROOT)) != null) {
            if (t.c(lowerCase, "-")) {
                lowerCase = null;
            }
            if (lowerCase != null) {
                return r.u1(lowerCase).toString();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Params params, e<? super i<? extends dx.b, Boolean>> eVar) throws Throwable {
        C0843b c0843b;
        if (eVar instanceof C0843b) {
            c0843b = (C0843b) eVar;
            int i15 = c0843b.f38989g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0843b.f38989g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c0843b = new C0843b(eVar);
            }
        } else {
            c0843b = new C0843b(eVar);
        }
        Object objA = c0843b.f38987e;
        Object objE = uq.b.e();
        int i16 = c0843b.f38989g;
        if (i16 == 0) {
            u.b(objA);
            a03.a aVar = this.registeredAddressContainersInteractor;
            c0843b.f38986d = params;
            c0843b.f38989g = 1;
            objA = aVar.a(c0843b);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (Params) c0843b.f38986d;
            u.b(objA);
        }
        i iVar = (i) objA;
        if (iVar instanceof i.Left) {
            return new i.Left((dx.b) ((i.Left) iVar).b());
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        PermanentPersonalAddress permanentPersonalAddress = (PermanentPersonalAddress) ((i.Right) iVar).b();
        return permanentPersonalAddress != null ? new i.Right(vq.b.a(!d(permanentPersonalAddress, params.getRegisteredAddress()))) : new i.Right(vq.b.a(false));
    }
}
