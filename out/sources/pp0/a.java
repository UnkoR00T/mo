package pp0;

import dx.j;
import fp0.InstitutionCardAndCertData;
import hz.g;
import hz.h;
import hz.i;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u00020\u001e*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u00020\u001e*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lpp0/a;", "Lgp0/a;", "Lop0/a;", "frontSrvRepository", "Lhz/i;", "validatorTextFactory", "<init>", "(Lop0/a;Lhz/i;)V", "Lex/b;", "Ldx/b;", "Lfp0/f$a;", "card", "Loq/i0;", "h", "(Lex/b;Lfp0/f$a;)V", "i", "Lgp0/a$a;", "params", "Ldx/i;", "Lfp0/f;", "g", "(Lgp0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lop0/a;", "b", "Lhz/i;", "Lhz/h;", "f", "()Lhz/h;", "networkUrlValidator", "", "d", "(Lfp0/f$a;)Z", "hasValidScope", "e", "hasValidUrl", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gp0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final op0.a frontSrvRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: pp0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3981a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f161587e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f161589g;

        C3981a(tq.e<? super C3981a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161587e = obj;
            this.f161589g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(op0.a aVar, i iVar) {
        this.frontSrvRepository = aVar;
        this.validatorTextFactory = iVar;
    }

    private final boolean d(InstitutionCardAndCertData.Card card) {
        return card.getScope() == 9001000;
    }

    private final boolean e(InstitutionCardAndCertData.Card card) {
        String url = card.getUrl();
        if (url != null) {
            return f().a(url) instanceof g.b;
        }
        return false;
    }

    private final h f() {
        return this.validatorTextFactory.a().G(Label.INSTANCE.c());
    }

    private final void h(ex.b<? super dx.b> bVar, InstitutionCardAndCertData.Card card) {
        if (d(card)) {
            return;
        }
        bVar.b(new dx.b.Generic(new Exception("17001: Institution card - incorrect scope")));
        throw new oq.g();
    }

    private final void i(ex.b<? super dx.b> bVar, InstitutionCardAndCertData.Card card) {
        if (e(card)) {
            return;
        }
        bVar.b(new dx.b.Generic(new Exception("17002: Institution card - incorrect url")));
        throw new oq.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(gp0.a.Params params, tq.e<? super dx.i<? extends dx.b, InstitutionCardAndCertData>> eVar) throws Throwable {
        C3981a c3981a;
        Object objB;
        if (eVar instanceof C3981a) {
            c3981a = (C3981a) eVar;
            int i15 = c3981a.f161589g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3981a.f161589g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3981a = new C3981a(eVar);
            }
        } else {
            c3981a = new C3981a(eVar);
        }
        Object objA = c3981a.f161587e;
        Object objE = uq.b.e();
        int i16 = c3981a.f161589g;
        if (i16 == 0) {
            u.b(objA);
            op0.a aVar = this.frontSrvRepository;
            CertKeyPair certKeyPair = params.getCertKeyPair();
            fp0.d identity = params.getIdentity();
            c3981a.f161586d = params;
            c3981a.f161589g = 1;
            objA = aVar.a(certKeyPair, identity, c3981a);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (gp0.a.Params) c3981a.f161586d;
            u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        InstitutionCardAndCertData institutionCardAndCertData = (InstitutionCardAndCertData) ((dx.i.Right) iVar).b();
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar2 = new ex.a();
                    institutionCardAndCertData.getCertificate().checkValidity(params.getCurrentServerDate().getDate());
                    h(aVar2, institutionCardAndCertData.getCard());
                    i(aVar2, institutionCardAndCertData.getCard());
                    return new dx.i.Right(institutionCardAndCertData);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA2 = jVarA.a(e18);
            if (objA2 instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
            } else {
                if (!(objA2 instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA2).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
