package ny3;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import my3.h;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J]\u0010\u0014\u001a\u00020\u0013*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001a\u001a\u00020\u0019*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u001e*\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lny3/d;", "Lxw/f;", "Lny3/d$a;", "Lmy3/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmy3/f$b;", "Lmy3/h$a$b$a;", "contentData", "Lkotlin/Function0;", "Loq/i0;", "onDownloadConfirmation", "onClose", "onSnackBarHidden", "onGoToBlikPayment", "Lrx3/a;", "paymentSuccessResultType", "Lmy3/h$a$b;", "i", "(Lmy3/f$b;Lmy3/h$a$b$a;Ler/a;Ler/a;Ler/a;Ler/a;Lrx3/a;)Lmy3/h$a$b;", "Lmy3/f$b$a;", "onBackAction", "goToBlikPaymentAction", "Lh30/a;", "c", "(Lmy3/f$b$a;Ler/a;Ler/a;Lrx3/a;)Lh30/a;", "e", "(Lmy3/f$b$a;Ler/a;Lrx3/a;)Lh30/a;", "Lq40/f;", "f", "(Lrx3/a;Ler/a;Ler/a;)Lq40/f;", "params", "h", "(Lny3/d$a;)Lmy3/h$a;", "a", "Lmx/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ny3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lny3/d$a;", "", "Lmy3/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onDownloadConfirmation", "onSnackBarHidden", "onGoToBlikPayment", "Lrx3/a;", "paymentSuccessResultType", "<init>", "(Lmy3/f;Ler/a;Ler/a;Ler/a;Ler/a;Lrx3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmy3/f;", "f", "()Lmy3/f;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Lrx3/a;", "()Lrx3/a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final my3.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadConfirmation;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToBlikPayment;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final rx3.a paymentSuccessResultType;

        public Params(my3.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, rx3.a aVar5) {
            this.state = fVar;
            this.onClose = aVar;
            this.onDownloadConfirmation = aVar2;
            this.onSnackBarHidden = aVar3;
            this.onGoToBlikPayment = aVar4;
            this.paymentSuccessResultType = aVar5;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final er.a<i0> b() {
            return this.onDownloadConfirmation;
        }

        public final er.a<i0> c() {
            return this.onGoToBlikPayment;
        }

        public final er.a<i0> d() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final rx3.a getPaymentSuccessResultType() {
            return this.paymentSuccessResultType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.onDownloadConfirmation, params.onDownloadConfirmation) && t.c(this.onSnackBarHidden, params.onSnackBarHidden) && t.c(this.onGoToBlikPayment, params.onGoToBlikPayment) && this.paymentSuccessResultType == params.paymentSuccessResultType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final my3.f getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onDownloadConfirmation.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.onGoToBlikPayment.hashCode()) * 31) + this.paymentSuccessResultType.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onDownloadConfirmation=" + this.onDownloadConfirmation + ", onSnackBarHidden=" + this.onSnackBarHidden + ", onGoToBlikPayment=" + this.onGoToBlikPayment + ", paymentSuccessResultType=" + this.paymentSuccessResultType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139703a;

        static {
            int[] iArr = new int[rx3.a.values().length];
            try {
                iArr[rx3.a.STANDALONE_PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rx3.a.PAYMENT_AS_STEP_IN_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f139703a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final ButtonData c(my3.f.b.a aVar, er.a<i0> aVar2, er.a<i0> aVar3, rx3.a aVar4) {
        if (!(aVar instanceof my3.f.b.a.Alias)) {
            if (!(aVar instanceof my3.f.b.a.Generic)) {
                throw new p();
            }
            return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.f163119b), null, 2, null), k30.d.a.f107773a, null, aVar2, 35, null);
        }
        int i15 = b.f139703a[aVar4.ordinal()];
        if (i15 == 1) {
            return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.W), null, 2, null), k30.d.a.f107773a, null, aVar3, 35, null);
        }
        if (i15 != 2) {
            throw new p();
        }
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.f163119b), null, 2, null), k30.d.a.f107773a, null, aVar2, 35, null);
    }

    private final ButtonData e(my3.f.b.a aVar, er.a<i0> aVar2, rx3.a aVar3) {
        if (!(aVar instanceof my3.f.b.a.Alias)) {
            if (aVar instanceof my3.f.b.a.Generic) {
                return null;
            }
            throw new p();
        }
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.f163119b), null, 2, null), new k30.d.Secondary(null, 1, null), null, aVar2, 35, null);
        if (aVar3 == rx3.a.STANDALONE_PAYMENT) {
            return buttonData;
        }
        return null;
    }

    private final IconPageBottomContentData f(rx3.a aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
        int i15 = b.f139703a[aVar.ordinal()];
        if (i15 == 1) {
            return new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.f163118a0), null, 2, null), k30.d.a.f107773a, null, aVar2, 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.f163119b), null, 2, null), new k30.d.Secondary(null, 1, null), null, aVar3, 35, null), null, 4, null);
        }
        if (i15 != 2) {
            throw new p();
        }
        return new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.f163129g), null, 2, null), k30.d.a.f107773a, null, aVar3, 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.f163118a0), null, 2, null), new k30.d.Secondary(null, 1, null), null, aVar2, 35, null), null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d2  */
    private final h.a.Result i(my3.f.b bVar, h.a.Result.ContentData contentData, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, rx3.a aVar5) {
        Label labelC;
        if (bVar instanceof my3.f.b.Success) {
            return new h.a.Result(aVar2, new IconPageData(j.b.c.f164688d, this.labelProvider.c(px3.b.f163126e0), null, null, contentData, f(aVar5, aVar, aVar2), true, 12, null), aVar3, new BaseScaffoldData(null, new i.Small(null, null, null, null, null, 31, null), null, null, null, null, 61, null));
        }
        if (bVar instanceof my3.f.b.PaymentInProcessing) {
            return new h.a.Result(aVar2, new IconPageData(j.b.C4090b.f164686d, this.labelProvider.c(px3.b.C), null, null, contentData, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.f163119b), null, 2, null), k30.d.a.f107773a, null, aVar2, 35, null), null, null, 4, null), true, 12, null), aVar3, new BaseScaffoldData(null, new i.Small(null, null, null, null, null, 31, null), null, null, null, null, 61, null));
        }
        if (!(bVar instanceof my3.f.b.a)) {
            throw new p();
        }
        j.b.a aVar6 = j.b.a.f164684d;
        my3.f.b.a aVar7 = (my3.f.b.a) bVar;
        Label title = aVar7.getTitle();
        if (title == null) {
            labelC = this.labelProvider.c(px3.b.f163123d);
        } else {
            labelC = title.l() ? title : null;
            if (labelC == null) {
                labelC = this.labelProvider.c(px3.b.f163123d);
            }
        }
        return new h.a.Result(aVar2, new IconPageData(aVar6, labelC, aVar7.getMessage(), null, contentData, new IconPageBottomContentData(c(aVar7, aVar2, aVar4, aVar5), e(aVar7, aVar2, aVar5), null, 4, null), true, 8, null), aVar3, new BaseScaffoldData(null, new i.Small(null, null, null, null, null, 31, null), null, null, null, null, 61, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public h.a b(Params params) {
        my3.f state = params.getState();
        if (state instanceof my3.f.a) {
            return h.a.C3222a.f129538a;
        }
        if (state instanceof my3.f.b) {
            return i((my3.f.b) params.getState(), new h.a.Result.ContentData(this.labelProvider.c(px3.b.f163124d0), ((my3.f.b) params.getState()).getPaymentTitle(), this.labelProvider.c(px3.b.Z), ((my3.f.b) params.getState()).getPaymentAmount()), params.b(), params.a(), params.d(), params.c(), params.getPaymentSuccessResultType());
        }
        throw new p();
    }
}
