package p02;

import eo0.DeliveryMessageDetails;
import eo0.Recipient;
import eo0.y0;
import java.util.Collection;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J*\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010'\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010)\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"¨\u0006*"}, d2 = {"Lp02/s0;", "", "Lp02/s0$a;", "", "Leo0/k0;", "Lmx/c;", "labelProvider", "Lp02/g0;", "hasActiveEdorInboxUC", "<init>", "(Lmx/c;Lp02/g0;)V", "recipientToAdd", "", "d", "(Ljava/util/List;Leo0/k0;)Z", "Leo0/m;", "Leo0/y0;", "messageServiceType", "e", "(Leo0/m;Leo0/k0;Leo0/y0;)Z", "Leo0/p0;", "i", "(Leo0/p0;Leo0/y0;)Leo0/y0;", "h", "(Leo0/k0;)Z", "g", "params", "Ldx/i;", "Ldx/b$c;", "f", "(Lp02/s0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp02/g0;", "b", "Ldx/b$c;", "addRecipientNoEpuapAdressError", "c", "invalidRecipientDraftError", "addRecipientNoEdorAdressError", "addRecipientEpuapError", "addRecipientEdorInboxInactiveError", "addRecipientExistsError", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 implements gz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f151397h = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 hasActiveEdorInboxUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business addRecipientNoEpuapAdressError;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business invalidRecipientDraftError;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business addRecipientNoEdorAdressError;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business addRecipientEpuapError;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business addRecipientEdorInboxInactiveError;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business addRecipientExistsError;

    /* JADX INFO: renamed from: p02.s0$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lp02/s0$a;", "Lgz/b$a;", "Leo0/k0;", "recipientToAdd", "", "recipients", "Lz02/a;", "entryMessageType", "Leo0/y0;", "messageServiceType", "<init>", "(Leo0/k0;Ljava/util/List;Lz02/a;Leo0/y0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k0;", "o", "()Leo0/k0;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lz02/a;", "()Lz02/a;", "d", "Leo0/y0;", "()Leo0/y0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Recipient recipientToAdd;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Recipient> recipients;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a entryMessageType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 messageServiceType;

        public Params(Recipient recipient, List<Recipient> list, z02.a aVar, y0 y0Var) {
            this.recipientToAdd = recipient;
            this.recipients = list;
            this.entryMessageType = aVar;
            this.messageServiceType = y0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final z02.a getEntryMessageType() {
            return this.entryMessageType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y0 getMessageServiceType() {
            return this.messageServiceType;
        }

        public final List<Recipient> c() {
            return this.recipients;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.recipientToAdd, params.recipientToAdd) && fr.t.c(this.recipients, params.recipients) && fr.t.c(this.entryMessageType, params.entryMessageType) && this.messageServiceType == params.messageServiceType;
        }

        public int hashCode() {
            return (((((this.recipientToAdd.hashCode() * 31) + this.recipients.hashCode()) * 31) + this.entryMessageType.hashCode()) * 31) + this.messageServiceType.hashCode();
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final Recipient getRecipientToAdd() {
            return this.recipientToAdd;
        }

        public String toString() {
            return "Params(recipientToAdd=" + this.recipientToAdd + ", recipients=" + this.recipients + ", entryMessageType=" + this.entryMessageType + ", messageServiceType=" + this.messageServiceType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151409a;

        static {
            int[] iArr = new int[eo0.p0.values().length];
            try {
                iArr[eo0.p0.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eo0.p0.E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eo0.p0.E_PUAP_AND_E_DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eo0.p0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f151409a = iArr;
        }
    }

    public s0(mx.c cVar, g0 g0Var) {
        this.hasActiveEdorInboxUC = g0Var;
        this.addRecipientNoEpuapAdressError = new dx.b.Business(n02.a.ADD_RECIPIENT_NO_EPUAP_ADDRESS, null, cVar.c(e02.a.W0), cVar.c(e02.a.X0), null, cVar.c(e02.a.f46550j), null, 82, null);
        n02.a aVar = n02.a.ADD_RECIPIENT_NO_EDOR_ADDRESS;
        this.invalidRecipientDraftError = new dx.b.Business(aVar, null, cVar.c(e02.a.W0), cVar.c(e02.a.Y0), null, cVar.c(e02.a.f46550j), null, 82, null);
        this.addRecipientNoEdorAdressError = new dx.b.Business(aVar, null, cVar.c(e02.a.W0), cVar.c(e02.a.T0), null, cVar.c(e02.a.f46550j), null, 82, null);
        this.addRecipientEpuapError = new dx.b.Business(n02.a.ADD_RECIPIENT_E_PUAP, null, cVar.c(e02.a.W0), cVar.c(e02.a.V0), null, cVar.c(e02.a.f46550j), null, 82, null);
        this.addRecipientEdorInboxInactiveError = new dx.b.Business(n02.a.ADD_RECIPIENT_EDOR_INBOX_INACTIVE, null, cVar.c(e02.a.W0), cVar.c(e02.a.U0), null, cVar.c(e02.a.f46550j), null, 82, null);
        n02.a aVar2 = n02.a.ADD_RECIPIENT_EXISTS;
        Label.Companion companion = Label.INSTANCE;
        this.addRecipientExistsError = new dx.b.Business(aVar2, null, companion.c(), null, null, companion.c(), null, 90, null);
    }

    private final boolean d(List<Recipient> list, Recipient recipient) {
        List<Recipient> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Recipient recipient2 : list2) {
            if (recipient.getDeliveryAddress() != null ? fr.t.c(recipient.getDeliveryAddress(), recipient2.getDeliveryAddress()) : recipient.getEpuapAddress() != null ? fr.t.c(recipient.getEpuapAddress(), recipient2.getEpuapAddress()) : false) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(DeliveryMessageDetails deliveryMessageDetails, Recipient recipient, y0 y0Var) {
        return deliveryMessageDetails.getDeliveryMessage().getServiceType() != i(recipient.getServiceType(), y0Var);
    }

    private final boolean g(Recipient recipient) {
        return recipient.getServiceType() == eo0.p0.E_DELIVERY;
    }

    private final boolean h(Recipient recipient) {
        return recipient.getServiceType() == eo0.p0.E_PUAP;
    }

    private final y0 i(eo0.p0 p0Var, y0 y0Var) {
        int i15 = b.f151409a[p0Var.ordinal()];
        if (i15 == 1) {
            return y0.E_PUAP;
        }
        if (i15 == 2) {
            return y0.E_DELIVERY;
        }
        if (i15 == 3) {
            return y0Var;
        }
        if (i15 == 4) {
            return y0.UNKNOWN;
        }
        throw new oq.p();
    }

    public Object f(Params params, tq.e<? super dx.i<dx.b.Business, ? extends List<Recipient>>> eVar) {
        dx.b.Business business;
        dx.b.Business business2;
        if (!this.hasActiveEdorInboxUC.b(gz.b.a.C1792a.f78542a).booleanValue() && g(params.getRecipientToAdd())) {
            return new dx.i.Left(this.addRecipientEdorInboxInactiveError);
        }
        z02.a entryMessageType = params.getEntryMessageType();
        if (entryMessageType instanceof z02.a.ForwardMessage) {
            if (e(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails(), params.getRecipientToAdd(), params.getMessageServiceType())) {
                boolean zH = h(params.getRecipientToAdd());
                if (zH) {
                    business2 = this.addRecipientNoEdorAdressError;
                } else {
                    if (zH) {
                        throw new oq.p();
                    }
                    business2 = this.addRecipientNoEpuapAdressError;
                }
                return new dx.i.Left(business2);
            }
        } else if (entryMessageType instanceof z02.a.Reply) {
            if (e(((z02.a.Reply) params.getEntryMessageType()).getMessageDetails(), params.getRecipientToAdd(), params.getMessageServiceType())) {
                boolean zH2 = h(params.getRecipientToAdd());
                if (zH2) {
                    business = this.addRecipientNoEdorAdressError;
                } else {
                    if (zH2) {
                        throw new oq.p();
                    }
                    business = this.addRecipientNoEpuapAdressError;
                }
                return new dx.i.Left(business);
            }
        } else if (entryMessageType instanceof z02.a.EditDraft) {
            if (e(((z02.a.EditDraft) params.getEntryMessageType()).getMessageDetails(), params.getRecipientToAdd(), params.getMessageServiceType())) {
                return new dx.i.Left(this.invalidRecipientDraftError);
            }
        } else {
            if (!fr.t.c(entryMessageType, z02.a.c.f231893a)) {
                throw new oq.p();
            }
            if (params.getMessageServiceType() == y0.E_DELIVERY && h(params.getRecipientToAdd())) {
                return new dx.i.Left(this.addRecipientEpuapError);
            }
        }
        return d(params.c(), params.getRecipientToAdd()) ? new dx.i.Left(this.addRecipientExistsError) : new dx.i.Right(pq.v.M0(params.c(), params.getRecipientToAdd()));
    }
}
