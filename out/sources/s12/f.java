package s12;

import androidx.compose.ui.graphics.Color;
import eo0.t;
import er.l;
import er.p;
import fo0.DeliveryMessageAddress;
import java.time.OffsetDateTime;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import n50.x0;
import oq.i0;
import p02.s;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010 \u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u0016*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J%\u0010+\u001a\u0004\u0018\u00010\u0016*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Ls12/f;", "Lxw/f;", "Ls12/f$a;", "Ln50/k;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lp02/s;", "getMessageDateTimeUC", "<init>", "(Lmx/c;Lez/e;Lp02/s;)V", "Lfo0/c;", "message", "", "index", "Leo0/t;", "type", "Ln50/g;", "s", "(Lfo0/c;ILeo0/t;)Ln50/g;", "", "Lmx/a;", "z", "(Ljava/lang/String;)Lmx/a;", "sender", "Ln50/b;", "E", "(Lfo0/c;ILmx/a;)Ln50/b;", "Lkotlin/Function1;", "Loq/i0;", "messageClick", "q", "(Lfo0/c;Leo0/t;Ler/l;I)Ln50/g;", "x", "(Lfo0/c;Leo0/t;)Lmx/a;", "prefixLabel", "", "Lfo0/d;", "additionalString", "h", "(Lmx/a;Ljava/util/List;)Lmx/a;", "tag", "v", "(Lfo0/c;Leo0/t;Ljava/lang/String;)Lmx/a;", "params", "m", "(Ls12/f$a;)Ln50/k;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lp02/s;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s getMessageDateTimeUC;

    /* JADX INFO: renamed from: s12.f$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Ls12/f$a;", "", "Lfo0/c;", "message", "", "index", "Leo0/t;", "directoryType", "Lkotlin/Function1;", "Loq/i0;", "messageClick", "<init>", "(Lfo0/c;ILeo0/t;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfo0/c;", "c", "()Lfo0/c;", "b", "I", "Leo0/t;", "()Leo0/t;", "d", "Ler/l;", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fo0.c message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final t directoryType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<fo0.c, i0> messageClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(fo0.c cVar, int i15, t tVar, l<? super fo0.c, i0> lVar) {
            this.message = cVar;
            this.index = i15;
            this.directoryType = tVar;
            this.messageClick = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getDirectoryType() {
            return this.directoryType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final fo0.c getMessage() {
            return this.message;
        }

        public final l<fo0.c, i0> d() {
            return this.messageClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.message, params.message) && this.index == params.index && this.directoryType == params.directoryType && fr.t.c(this.messageClick, params.messageClick);
        }

        public int hashCode() {
            return (((((this.message.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.directoryType.hashCode()) * 31) + this.messageClick.hashCode();
        }

        public String toString() {
            return "Params(message=" + this.message + ", index=" + this.index + ", directoryType=" + this.directoryType + ", messageClick=" + this.messageClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177456a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.OUTBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.INBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.TRASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.CUSTOM_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.SENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.DRAFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f177456a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fo0.c f177457a;

        c(fo0.c cVar) {
            this.f177457a = cVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long jB;
            rVar.X(-774245685);
            if (p076m2.t.k()) {
                p076m2.t.o(-774245685, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.mapper.MessageSingleCardMapper.mapToGeneralSingleCard.<anonymous>.<anonymous> (MessageSingleCardMapper.kt:111)");
            }
            if (this.f177457a.getReceiptStatus() instanceof fo0.h.Warning) {
                rVar.X(-1020757257);
                jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                rVar.R();
            } else {
                rVar.X(-1020755243);
                jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public f(mx.c cVar, ez.e eVar, s sVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.getMessageDateTimeUC = sVar;
    }

    private final n50.b E(fo0.c cVar, int i15, Label label) {
        if (cVar.getOpened()) {
            return new n50.b.Title(new SingleCardLabel(label.n("Sender_" + i15), null, null, 3, 0, null, 54, null));
        }
        return new n50.b.StatusBadge(new r50.a.WithDot(null, label.n("Sender_" + i15), null, 3, r50.f.INFORMATIVE, 5, null));
    }

    private final Label h(Label prefixLabel, List<DeliveryMessageAddress> additionalString) {
        Label labelO;
        Label labelO2;
        String strV0 = v.v0(additionalString, ", ", null, null, 0, null, new l() { // from class: s12.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.l((DeliveryMessageAddress) obj);
            }
        }, 30, null);
        return (prefixLabel == null || (labelO = prefixLabel.o(Label.INSTANCE.d())) == null || (labelO2 = labelO.o(new Label(strV0, "names"))) == null) ? mx.b.b(strV0, "") : labelO2;
    }

    static /* synthetic */ Label i(f fVar, Label label, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = null;
        }
        return fVar.h(label, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(DeliveryMessageAddress deliveryMessageAddress) {
        return deliveryMessageAddress.getName();
    }

    private final DefaultSingleCardData q(final fo0.c message, t type, final l<? super fo0.c, i0> messageClick, int index) {
        n50.b statusBadge;
        Label labelV = v(message, type, "DeliveryTime_" + index);
        SingleCardLabel singleCardLabel = labelV != null ? new SingleCardLabel(labelV, null, new c(message), 0, 0, null, 58, null) : null;
        if (message.getOpened()) {
            statusBadge = new n50.b.Title(new SingleCardLabel(x(message, type).n("Sender_" + index), null, null, 3, 0, null, 54, null));
        } else {
            statusBadge = new n50.b.StatusBadge(new r50.a.WithDot(null, x(message, type).n("Sender_" + index), null, 3, r50.f.INFORMATIVE, 5, null));
        }
        return new DefaultSingleCardData(null, new er.a() { // from class: s12.e
            @Override // er.a
            public final Object a() {
                return f.r(messageClick, message);
            }
        }, false, null, null, false, null, null, new BodySection(singleCardLabel, statusBadge, new SingleCardLabel(z(message.getSubject()).n("Subject_" + index), null, null, 3, 0, null, 54, null)), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar, fo0.c cVar) {
        lVar.b(cVar);
        return i0.f148189a;
    }

    private final DefaultSingleCardData s(fo0.c message, int index, t type) {
        return new DefaultSingleCardData(null, new er.a() { // from class: s12.d
            @Override // er.a
            public final Object a() {
                return f.u();
            }
        }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(e02.a.W3), null, null, 0, 0, null, 62, null), E(message, index, x(message, type)), new SingleCardLabel(z(message.getSubject()).n("Subject_" + index), null, null, 3, 0, null, 54, null)), null, null, null, 3837, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    private final Label v(fo0.c cVar, t tVar, String str) {
        fo0.h receiptStatus = cVar.getReceiptStatus();
        if (tVar == t.DRAFT) {
            return this.labelProvider.c(e02.a.f46548i3).n(str);
        }
        if (receiptStatus != null) {
            return mx.b.b(receiptStatus.getText(), str);
        }
        OffsetDateTime offsetDateTimeB = this.getMessageDateTimeUC.b(new s.Params(cVar));
        if (offsetDateTimeB != null) {
            return new Label(this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTimeB), fz.c.FULL_MONTH_DATE_TIME_COMMA), "message_local_date_time").n(str);
        }
        return null;
    }

    private final Label x(fo0.c cVar, t tVar) {
        Label labelI;
        switch (b.f177456a[tVar.ordinal()]) {
            case 1:
            case 5:
            case 6:
                List<DeliveryMessageAddress> listP = cVar.p();
                return fr.t.c(listP != null ? Boolean.valueOf(listP.isEmpty() ^ true) : null, Boolean.TRUE) ? h(this.labelProvider.c(e02.a.f46647z0), listP) : Label.INSTANCE.b();
            case 2:
            case 3:
            case 4:
                DeliveryMessageAddress from = cVar.getFrom();
                return (from == null || (labelI = i(this, null, v.e(from), 1, null)) == null) ? Label.INSTANCE.b() : labelI;
            case 7:
                return Label.INSTANCE.b();
            default:
                throw new oq.p();
        }
    }

    private final Label z(String str) {
        Label labelB;
        return (str == null || (labelB = mx.b.b(str, "")) == null) ? this.labelProvider.c(e02.a.f46584o3) : labelB;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public k b(Params params) {
        if (b.f177456a[params.getDirectoryType().ordinal()] == 1) {
            return s(params.getMessage(), params.getIndex(), params.getDirectoryType());
        }
        return q(params.getMessage(), params.getDirectoryType(), params.d(), params.getIndex());
    }
}
