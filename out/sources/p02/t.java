package p02;

import eo0.y0;
import java.util.concurrent.CancellationException;
import o02.Epuap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"Lp02/t;", "Lgz/a;", "Lp02/t$a;", "Ldx/i;", "Ldx/b;", "Lo02/a;", "Lmx/c;", "labelProvider", "Lx02/d;", "getMessageServiceTypeWizardResultUC", "<init>", "(Lmx/c;Lx02/d;)V", "params", "b", "(Lp02/t$a;)Ldx/i;", "a", "Lx02/d;", "Ldx/b$c;", "Ldx/b$c;", "unknownError", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements gz.a<Params, dx.i<? extends dx.b, ? extends o02.a>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f151410c = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x02.d getMessageServiceTypeWizardResultUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business unknownError;

    /* JADX INFO: renamed from: p02.t$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/t$a;", "Lgz/b$a;", "Lm22/h;", "contract", "<init>", "(Lm22/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm22/h;", "()Lm22/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m22.h contract;

        public Params(m22.h hVar) {
            this.contract = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final m22.h getContract() {
            return this.contract;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.contract, ((Params) other).contract);
        }

        public int hashCode() {
            return this.contract.hashCode();
        }

        public String toString() {
            return "Params(contract=" + this.contract + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151414a;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f151414a = iArr;
        }
    }

    public t(mx.c cVar, x02.d dVar) {
        this.getMessageServiceTypeWizardResultUC = dVar;
        this.unknownError = new dx.b.Business(null, null, cVar.c(e02.a.D0), null, null, cVar.c(e02.a.f46550j), null, 91, null);
    }

    public dx.i<dx.b, o02.a> b(Params params) {
        Object objB;
        Object epuap;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    m22.h contract = params.getContract();
                    int i15 = b.f151414a[this.getMessageServiceTypeWizardResultUC.b(new x02.d.Params(params.getContract(), params.getContract())).ordinal()];
                    if (i15 == 1) {
                        o02.b.Start startV6 = contract.v6();
                        o02.b.AddRecipients addRecipientsH6 = contract.H6();
                        if (addRecipientsH6 == null) {
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        Epuap epuapP1 = contract.p1();
                        if (epuapP1 == null) {
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        o02.b.ContactDetails contactDetailsA7 = contract.a7();
                        if (contactDetailsA7 == null) {
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        o02.b.ContactMethod contactMethodT7 = contract.T7();
                        if (contactMethodT7 == null) {
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        o02.b.CorrespondenceAddress correspondenceAddressY0 = contract.y0();
                        o02.b.ChooseMessageType chooseMessageTypeV5 = contract.v5();
                        if (chooseMessageTypeV5 == null) {
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        epuap = new o02.a.Epuap(startV6, addRecipientsH6, epuapP1, chooseMessageTypeV5, contactDetailsA7, contactMethodT7, correspondenceAddressY0);
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new oq.p();
                            }
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        o02.b.Start startV7 = contract.v6();
                        o02.b.AddRecipients addRecipientsH7 = contract.H6();
                        if (addRecipientsH7 == null) {
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        o02.c cVarI1 = contract.I1();
                        if (cVarI1 == null) {
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        o02.b.ChooseMessageType chooseMessageTypeV6 = contract.v5();
                        if (chooseMessageTypeV6 == null) {
                            aVar.b(this.unknownError);
                            throw new oq.g();
                        }
                        epuap = new o02.a.Edor(startV7, addRecipientsH7, cVarI1, chooseMessageTypeV6);
                    }
                    return new dx.i.Right(epuap);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
