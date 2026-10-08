package f82;

import dx.i;
import fj0.g;
import fu.r;
import iy.b0;
import iy.c0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;
import xi0.ContactDetails;
import xw.PhoneNumber;
import z72.RdkApplicantDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lf82/a;", "", "Lgz/b$a$a;", "Lz72/b;", "Lfj0/g;", "getContactDetailsUseCase", "<init>", "(Lfj0/g;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lfj0/g;", "Lxw/h;", "Liy/b0;", "d", "(Lxw/h;)Liy/b0;", "formatted", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g getContactDetailsUseCase;

    /* JADX INFO: renamed from: f82.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1354a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f60115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f60116e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f60118g;

        C1354a(e<? super C1354a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60116e = obj;
            this.f60118g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(g gVar) {
        this.getContactDetailsUseCase = gVar;
    }

    private final b0 d(PhoneNumber phoneNumber) {
        return c0.g(r.M0(c0.e(phoneNumber.h()), "+") + c0.e(phoneNumber.g()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, RdkApplicantDetails>> eVar) throws Throwable {
        C1354a c1354a;
        if (eVar instanceof C1354a) {
            c1354a = (C1354a) eVar;
            int i15 = c1354a.f60118g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1354a.f60118g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1354a = new C1354a(eVar);
            }
        } else {
            c1354a = new C1354a(eVar);
        }
        Object objC = c1354a.f60116e;
        Object objE = uq.b.e();
        int i16 = c1354a.f60118g;
        if (i16 == 0) {
            u.b(objC);
            g gVar = this.getContactDetailsUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            c1354a.f60115d = j.a(c1792a);
            c1354a.f60118g = 1;
            objC = gVar.c(c1792a2, c1354a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        ContactDetails contactDetails = (ContactDetails) ((i.Right) iVar).b();
        PhoneNumber registeredPhoneNumber = contactDetails.getRegisteredPhoneNumber();
        return new i.Right(new RdkApplicantDetails(registeredPhoneNumber != null ? d(registeredPhoneNumber) : null, contactDetails.getRegisteredEmail()));
    }
}
