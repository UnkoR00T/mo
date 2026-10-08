package vx3;

import bs0.c;
import dx.i;
import fr.t;
import jb4.PayloadErrorData;
import mx.Label;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import ur0.BEStartPaymentResult;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvx3/b;", "", "Lbs0/c$a;", "Lur0/g;", "Lbs0/c;", "bEStartOneClickPayment", "Lmx/c;", "labelProvider", "<init>", "(Lbs0/c;Lmx/c;)V", "Ldx/b;", "Ljb4/f;", "d", "(Ldx/b;)Ljb4/f;", "params", "Ldx/i;", "e", "(Lbs0/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbs0/c;", "b", "Lmx/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c bEStartOneClickPayment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f208660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f208661e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f208663g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f208661e = obj;
            this.f208663g |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    public b(c cVar, mx.c cVar2) {
        this.bEStartOneClickPayment = cVar;
        this.labelProvider = cVar2;
    }

    private final PayloadErrorData d(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(c.Params params, e<? super i<? extends dx.b, BEStartPaymentResult>> eVar) throws Throwable {
        a aVar;
        Label labelC;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f208663g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f208663g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f208661e;
        Object objE = uq.b.e();
        int i16 = aVar.f208663g;
        if (i16 == 0) {
            u.b(objC);
            c cVar = this.bEStartOneClickPayment;
            aVar.f208660d = j.a(params);
            aVar.f208663g = 1;
            objC = cVar.c(params, aVar);
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
        if (!(iVar instanceof i.Left)) {
            if (iVar instanceof i.Right) {
                return iVar;
            }
            throw new p();
        }
        dx.b business = (dx.b) ((i.Left) iVar).b();
        if (business instanceof dx.b.g.Http) {
            PayloadErrorData payloadErrorDataD = d(business);
            if (t.c(payloadErrorDataD != null ? payloadErrorDataD.getCode() : null, ur0.c.INVALID_BLIK_ALIAS.getCode())) {
                ur0.d dVar = ur0.d.ALIAS_ERROR;
                Label labelC2 = this.labelProvider.c(px3.b.f163123d);
                String title = payloadErrorDataD.getTitle();
                if (title == null || (labelC = mx.b.b(title, "aliasPaymentErrorMessageTag")) == null) {
                    labelC = this.labelProvider.c(px3.b.f163133i);
                }
                business = new dx.b.Business(dVar, null, labelC2, labelC, null, this.labelProvider.c(px3.b.W), null, 82, null);
            }
        }
        return new i.Left(business);
    }
}
