package pp0;

import dx.i;
import dx.j;
import fp0.InstitutionCardAndCertData;
import fp0.ReportData;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import px.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpp0/d;", "Lgp0/d;", "Lop0/b;", "giosRepository", "<init>", "(Lop0/b;)V", "Lgp0/d$a;", "params", "Ldx/i;", "Ldx/b;", "", "e", "(Lgp0/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lop0/b;", "Lfp0/f;", "d", "(Lfp0/f;)Ldx/i;", "instituteUrl", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gp0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final op0.b giosRepository;

    public d(op0.b bVar) {
        this.giosRepository = bVar;
    }

    private final i<dx.b, String> d(InstitutionCardAndCertData institutionCardAndCertData) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String url = institutionCardAndCertData.getCard().getUrl();
                    if (url != null) {
                        return new i.Right(url);
                    }
                    aVar.b(new dx.b.Generic(new Exception("Missing institute url")));
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
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
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(gp0.d.Params params, tq.e<? super i<? extends dx.b, String>> eVar) {
        i<dx.b, String> iVarD = d(params.getInstitutionCardAndCertData());
        if (iVarD instanceof i.Left) {
            return iVarD;
        }
        if (!(iVarD instanceof i.Right)) {
            throw new p();
        }
        Object objA = this.giosRepository.a(new ReportData((String) ((i.Right) iVarD).b(), params.getCertKeyPair(), params.getPesel(), params.getInstitutionCardAndCertData(), params.getSummaryData(), null), eVar);
        return objA == uq.b.e() ? objA : (i) objA;
    }
}
