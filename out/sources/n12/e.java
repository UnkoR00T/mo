package n12;

import eo0.DeliveryMessageDetails;
import eo0.DeliveryMessageDetailsAttachment;
import eo0.y0;
import fo0.DeliveryMessageAddress;
import fr.t;
import fu.r;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J5\u0010-\u001a\u00020,2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Ln12/e;", "Lxw/f;", "Ln12/e$a;", "Lm12/e$a$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "Lm12/e$a$a$a;", "l", "(Ln12/e$a;)Ljava/util/List;", "Lfo0/c;", "Ln30/b;", "m", "(Lfo0/c;)Ln30/b;", "Leo0/m;", "i", "(Leo0/m;)Ln30/b;", "", "testTag", "Lmx/a;", "s", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "c", "title", "info", "Ln50/g;", "h", "(Lmx/a;Lmx/a;)Ln50/g;", "Leo0/y0;", "r", "(Leo0/y0;)Lmx/a;", "q", "(Ln12/e$a;)Lm12/e$a$a;", "Lkotlin/Function0;", "Loq/i0;", "action", AnnotatedPrivateKey.LABEL, "Lk30/d;", "buttonVariant", "Lk30/b;", "buttonState", "Lh30/a;", "e", "(Ler/a;Lmx/a;Lk30/d;Lk30/b;)Lh30/a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, m12.e.a.DraftMessage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n12.e$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Ln12/e$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "editDraftAction", "deleteDraftAction", "Leo0/m;", "deliveryMessage", "<init>", "(Ler/a;Ler/a;Ler/a;Leo0/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "d", "()Ler/a;", "b", "c", "Leo0/m;", "()Leo0/m;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> editDraftAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDraftAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeliveryMessageDetails deliveryMessage;

        public Params(er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, DeliveryMessageDetails deliveryMessageDetails) {
            this.onBackClick = aVar;
            this.editDraftAction = aVar2;
            this.deleteDraftAction = aVar3;
            this.deliveryMessage = deliveryMessageDetails;
        }

        public final er.a<i0> a() {
            return this.deleteDraftAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DeliveryMessageDetails getDeliveryMessage() {
            return this.deliveryMessage;
        }

        public final er.a<i0> c() {
            return this.editDraftAction;
        }

        public final er.a<i0> d() {
            return this.onBackClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onBackClick, params.onBackClick) && t.c(this.editDraftAction, params.editDraftAction) && t.c(this.deleteDraftAction, params.deleteDraftAction) && t.c(this.deliveryMessage, params.deliveryMessage);
        }

        public int hashCode() {
            return (((((this.onBackClick.hashCode() * 31) + this.editDraftAction.hashCode()) * 31) + this.deleteDraftAction.hashCode()) * 31) + this.deliveryMessage.hashCode();
        }

        public String toString() {
            return "Params(onBackClick=" + this.onBackClick + ", editDraftAction=" + this.editDraftAction + ", deleteDraftAction=" + this.deleteDraftAction + ", deliveryMessage=" + this.deliveryMessage + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130656a;

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
            f130656a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData c(DeliveryMessageDetails deliveryMessageDetails) {
        List<DeliveryMessageDetailsAttachment> listD = deliveryMessageDetails.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        int i15 = 0;
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(h(mx.b.b(((DeliveryMessageDetailsAttachment) obj).getFileName(), "fileName" + i15), this.labelProvider.c(e02.a.O3)));
            i15 = i16;
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    public static /* synthetic */ ButtonData f(e eVar, er.a aVar, Label label, k30.d dVar, k30.b bVar, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            bVar = k30.b.c.f107768a;
        }
        return eVar.e(aVar, label, dVar, bVar);
    }

    private final DefaultSingleCardData h(Label title, Label info) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(info, null, null, 3, null), new n50.b.Title(n50.l.b(title, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final CardListData i(DeliveryMessageDetails deliveryMessageDetails) {
        DefaultSingleCardData defaultSingleCardDataH = h(s(deliveryMessageDetails.getDeliveryMessage().getSubject(), "messageSubject"), this.labelProvider.c(e02.a.A0));
        DefaultSingleCardData defaultSingleCardDataH2 = h(s(deliveryMessageDetails.getTextBody(), "textBody"), this.labelProvider.c(e02.a.B3));
        Label labelC = this.labelProvider.c(e02.a.P3);
        String caseId = deliveryMessageDetails.getDeliveryMessage().getCaseId();
        if (caseId == null) {
            caseId = null;
        }
        return new CardListData(v.q(defaultSingleCardDataH, defaultSingleCardDataH2, h(s(caseId, "caseId"), labelC)), null, false, null, null, 30, null);
    }

    private final List<m12.e.a.DraftMessage.MessageSection> l(Params params) {
        List<m12.e.a.DraftMessage.MessageSection> listT = v.t(new m12.e.a.DraftMessage.MessageSection(this.labelProvider.c(e02.a.Q3), m(params.getDeliveryMessage().getDeliveryMessage())), new m12.e.a.DraftMessage.MessageSection(this.labelProvider.c(e02.a.R3), i(params.getDeliveryMessage())));
        if (!params.getDeliveryMessage().d().isEmpty()) {
            listT.add(new m12.e.a.DraftMessage.MessageSection(this.labelProvider.c(e02.a.f46520e), c(params.getDeliveryMessage())));
        }
        return listT;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    private final CardListData m(fo0.c cVar) {
        List listE;
        List<DeliveryMessageAddress> listP = cVar.p();
        if (listP == null) {
            listE = v.e(h(Label.INSTANCE.b(), r(cVar.getServiceType())));
        } else {
            if (listP.isEmpty()) {
                listP = null;
            }
            if (listP != null) {
                List<DeliveryMessageAddress> list = listP;
                listE = new ArrayList(v.y(list, 10));
                for (DeliveryMessageAddress deliveryMessageAddress : list) {
                    listE.add(h(mx.b.b(deliveryMessageAddress.getName(), deliveryMessageAddress.getName()), r(cVar.getServiceType())));
                }
            } else {
                listE = v.e(h(Label.INSTANCE.b(), r(cVar.getServiceType())));
            }
        }
        return new CardListData(listE, null, false, null, null, 30, null);
    }

    private final Label r(y0 y0Var) {
        int i15 = b.f130656a[y0Var.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(e02.a.f46564l1);
        }
        if (i15 == 2) {
            return this.labelProvider.c(e02.a.f46540h1);
        }
        if (i15 == 3) {
            return Label.INSTANCE.b();
        }
        throw new oq.p();
    }

    private final Label s(String str, String str2) {
        if (str == null || r.t0(str)) {
            str = null;
        }
        return mx.b.d(str, str2);
    }

    public final ButtonData e(er.a<i0> action, Label label, k30.d buttonVariant, k30.b buttonState) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(label, null, 2, null), buttonVariant, buttonState, action, 3, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public m12.e.a.DraftMessage b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(e02.a.f46513c4), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(e02.a.f46610t);
        List<m12.e.a.DraftMessage.MessageSection> listL = l(params);
        er.a<i0> aVarD = params.d();
        return new m12.e.a.DraftMessage(baseScaffoldData, labelC, listL, f(this, params.c(), this.labelProvider.c(e02.a.f46616u), k30.d.a.f107773a, null, 8, null), e(params.a(), this.labelProvider.c(e02.a.f46592q), new k30.d.Secondary(null, 1, null), k30.b.a.f107766a), aVarD);
    }
}
