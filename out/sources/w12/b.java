package w12;

import androidx.compose.ui.graphics.Color;
import eo0.BEAdditionalInformationUrl;
import eo0.BEDictionaryAdditionalInformation;
import eo0.DeliveryMessageDetails;
import eo0.Recipient;
import eo0.y0;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.j0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000275B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u001a2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u0004\u0018\u00010!2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J=\u0010'\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J=\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\r2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lw12/b;", "Lxw/f;", "Lw12/b$b;", "Lv12/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Lkotlin/Function0;", "Loq/i0;", "addRecipientAction", "Lkotlin/Function1;", "Leo0/k0;", "deleteRecipientAction", "", "urlClick", "Lv12/b$b;", "state", "Lx12/a;", "l", "(Lw12/b$b;Ler/a;Ler/l;Ler/l;Lv12/b$b;)Lx12/a;", "", "recipients", "Leo0/y0;", "messageServiceType", "Ln30/b;", "i", "(Lw12/b$b;Ljava/util/List;Ler/l;Leo0/y0;)Ln30/b;", "Lhz/b;", "validationState", "f", "(Ler/a;Lhz/b;)Ln30/b;", "Lc30/b;", "u", "(Ljava/util/List;Leo0/y0;)Lc30/b;", "Leo0/h;", "messageRecipientsInfo", "hideGeneralAlert", "m", "(Leo0/h;Ler/l;Ler/a;)Lc30/b;", "", "quantity", "Lmx/a;", "q", "(I)Lmx/a;", "recipient", "onClick", "Ln50/g;", "r", "(Lw12/b$b;Leo0/k0;Ler/l;Leo0/y0;)Ln50/g;", "e", "(Lw12/b$b;)Lv12/c$a;", "a", "Lmx/c;", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, v12.c.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f209289c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: w12.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b)\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b\u001e\u0010(R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b&\u0010-R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b.\u0010-R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b*\u0010(R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b+\u00100¨\u00061"}, d2 = {"Lw12/b$b;", "", "Lv12/b;", "state", "Lz02/a;", "entryData", "Lkotlin/Function0;", "Loq/i0;", "backAction", "nextAction", "addRecipientAction", "Lkotlin/Function1;", "Leo0/k0;", "deleteRecipientAction", "", "urlClick", "hideGeneralAlert", "Leo0/y0;", "messageServiceType", "<init>", "(Lv12/b;Lz02/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;Leo0/y0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv12/b;", "h", "()Lv12/b;", "b", "Lz02/a;", "d", "()Lz02/a;", "c", "Ler/a;", "()Ler/a;", "g", "e", "f", "Ler/l;", "()Ler/l;", "i", "Leo0/y0;", "()Leo0/y0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v12.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a entryData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addRecipientAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Recipient, i0> deleteRecipientAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> urlClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideGeneralAlert;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 messageServiceType;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(v12.b bVar, z02.a aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super Recipient, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar5, y0 y0Var) {
            this.state = bVar;
            this.entryData = aVar;
            this.backAction = aVar2;
            this.nextAction = aVar3;
            this.addRecipientAction = aVar4;
            this.deleteRecipientAction = lVar;
            this.urlClick = lVar2;
            this.hideGeneralAlert = aVar5;
            this.messageServiceType = y0Var;
        }

        public final er.a<i0> a() {
            return this.addRecipientAction;
        }

        public final er.a<i0> b() {
            return this.backAction;
        }

        public final l<Recipient, i0> c() {
            return this.deleteRecipientAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final z02.a getEntryData() {
            return this.entryData;
        }

        public final er.a<i0> e() {
            return this.hideGeneralAlert;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.entryData, params.entryData) && t.c(this.backAction, params.backAction) && t.c(this.nextAction, params.nextAction) && t.c(this.addRecipientAction, params.addRecipientAction) && t.c(this.deleteRecipientAction, params.deleteRecipientAction) && t.c(this.urlClick, params.urlClick) && t.c(this.hideGeneralAlert, params.hideGeneralAlert) && this.messageServiceType == params.messageServiceType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final y0 getMessageServiceType() {
            return this.messageServiceType;
        }

        public final er.a<i0> g() {
            return this.nextAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final v12.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.entryData.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.addRecipientAction.hashCode()) * 31) + this.deleteRecipientAction.hashCode()) * 31) + this.urlClick.hashCode()) * 31) + this.hideGeneralAlert.hashCode()) * 31) + this.messageServiceType.hashCode();
        }

        public final l<String, i0> i() {
            return this.urlClick;
        }

        public String toString() {
            return "Params(state=" + this.state + ", entryData=" + this.entryData + ", backAction=" + this.backAction + ", nextAction=" + this.nextAction + ", addRecipientAction=" + this.addRecipientAction + ", deleteRecipientAction=" + this.deleteRecipientAction + ", urlClick=" + this.urlClick + ", hideGeneralAlert=" + this.hideGeneralAlert + ", messageServiceType=" + this.messageServiceType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209300a;

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
            f209300a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f209301a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1705672429);
            if (p076m2.t.k()) {
                p076m2.t.o(-1705672429, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.addrecipient.mapper.AddRecipientMapper.mapToAddRecipientCardData.<anonymous> (AddRecipientMapper.kt:182)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f209302a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1753461937);
            if (p076m2.t.k()) {
                p076m2.t.o(-1753461937, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.addrecipient.mapper.AddRecipientMapper.mapToAddRecipientCardData.<anonymous> (AddRecipientMapper.kt:191)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData f(er.a<i0> addRecipientAction, hz.b validationState) {
        return new CardListData(v.e(new DefaultSingleCardData(null, addRecipientAction, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(e02.a.f46522e1), null, e.f209302a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106760e0, null, d.f209301a, null, null, 26, null), 3, null), null, null, 3325, null)), validationState instanceof hz.b.Invalid ? new j0.Error(this.labelProvider.c(e02.a.f46516d1)) : j0.a.f132074a, false, null, null, 28, null);
    }

    static /* synthetic */ CardListData h(b bVar, er.a aVar, hz.b bVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            bVar2 = hz.b.C2039b.f86846c;
        }
        return bVar.f(aVar, bVar2);
    }

    private final CardListData i(Params params, List<Recipient> recipients, l<? super Recipient, i0> deleteRecipientAction, y0 messageServiceType) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = recipients.iterator();
        while (it.hasNext()) {
            DefaultSingleCardData defaultSingleCardDataR = r(params, (Recipient) it.next(), deleteRecipientAction, messageServiceType);
            if (defaultSingleCardDataR != null) {
                arrayList.add(defaultSingleCardDataR);
            }
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    private final x12.a l(Params params, er.a<i0> addRecipientAction, l<? super Recipient, i0> deleteRecipientAction, l<? super String, i0> urlClick, v12.b.C5281b state) {
        if (state.e().isEmpty()) {
            return new x12.a.Empty(f(addRecipientAction, state.getValidationState()), state.getShowGeneralAlert() ? m(state.getMessageRecipientsInfo(), urlClick, params.e()) : null);
        }
        CardListData cardListDataI = i(params, state.e(), deleteRecipientAction, params.getMessageServiceType());
        CardListData cardListDataH = h(this, addRecipientAction, null, 2, null);
        if (params.getMessageServiceType() == y0.E_PUAP || state.e().size() >= 15) {
            cardListDataH = null;
        }
        return new x12.a.Recipients(cardListDataI, cardListDataH, u(state.e(), params.getMessageServiceType()), state.getShowGeneralAlert() ? m(state.getMessageRecipientsInfo(), urlClick, params.e()) : null);
    }

    private final c30.b m(BEDictionaryAdditionalInformation messageRecipientsInfo, l<? super String, i0> urlClick, er.a<i0> hideGeneralAlert) {
        c30.a.Link link;
        if (messageRecipientsInfo == null) {
            return null;
        }
        BEAdditionalInformationUrl url = messageRecipientsInfo.getUrl();
        if (url != null) {
            link = new c30.a.Link(new LinkData(null, mx.b.b(url.getTitle(), "linkLabel"), url.getValue(), LinkData.EnumC5775a.WEBSITE, false, urlClick, 17, null));
        } else {
            link = null;
        }
        String title = messageRecipientsInfo.getTitle();
        return new c30.b.c(null, null, title != null ? mx.b.b(title, "recipientGeneralInfoAlertTitle") : null, mx.b.b(messageRecipientsInfo.getBody(), "recipientGeneralInfoAlert"), hideGeneralAlert, null, link, 35, null);
    }

    private final Label q(int quantity) {
        return this.labelProvider.e(e02.a.f46507b4, Integer.valueOf(quantity));
    }

    private final DefaultSingleCardData r(Params params, final Recipient recipient, final l<? super Recipient, i0> onClick, y0 messageServiceType) {
        Label labelC;
        DeliveryMessageDetails messageDetails;
        fo0.c deliveryMessage;
        int i15 = c.f209300a[messageServiceType.ordinal()];
        x0.Button button = null;
        if (i15 == 1) {
            labelC = this.labelProvider.c(e02.a.f46564l1);
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    return null;
                }
                throw new oq.p();
            }
            labelC = this.labelProvider.c(e02.a.f46540h1);
        }
        BodySection bodySection = new BodySection(new SingleCardLabel(labelC, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(recipient.getFullName(), "fullName"), null, null, 0, 0, null, 62, null)), null, 4, null);
        z02.a entryData = params.getEntryData();
        z02.a.Reply reply = entryData instanceof z02.a.Reply ? (z02.a.Reply) entryData : null;
        if (((reply == null || (messageDetails = reply.getMessageDetails()) == null || (deliveryMessage = messageDetails.getDeliveryMessage()) == null) ? null : deliveryMessage.getServiceType()) != y0.E_PUAP) {
            button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(e02.a.f46592q), mx.b.b(this.labelProvider.c(e02.a.f46592q).getText() + ' ' + recipient.getFullName(), "deleteRecipient")), k30.d.a.f107773a, k30.b.a.f107766a, new er.a() { // from class: w12.a
                @Override // er.a
                public final Object a() {
                    return b.s(onClick, recipient);
                }
            }, 3, null));
        }
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, button, null, 2815, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar, Recipient recipient) {
        lVar.b(recipient);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r0
      0x0021: PHI (r0v3 mx.a) = (r0v2 mx.a), (r0v5 mx.a) binds: [B:6:0x000f, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    private final c30.b u(List<Recipient> recipients, y0 messageServiceType) {
        Label label;
        Label labelC = this.labelProvider.c(e02.a.f46498a1);
        if (messageServiceType != y0.E_PUAP) {
            labelC = null;
        }
        if (labelC == null) {
            labelC = this.labelProvider.c(e02.a.Z0);
            if (recipients.size() >= 15) {
                label = labelC;
            } else {
                label = null;
            }
        } else {
            label = labelC;
        }
        if (label == null) {
            return null;
        }
        return new c30.b.c(null, null, null, label, null, null, null, 119, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public v12.c.a b(Params params) {
        v12.b state = params.getState();
        if (state instanceof v12.b.a) {
            return new v12.c.a.Loading(x70.a.b.f217282c, params.b());
        }
        if (!(state instanceof v12.b.C5281b)) {
            throw new oq.p();
        }
        v12.b.C5281b c5281b = (v12.b.C5281b) state;
        if (c5281b.getIsLoading()) {
            return new v12.c.a.Loading(x70.a.b.f217282c, params.b());
        }
        er.a<i0> aVarB = params.b();
        return new v12.c.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(e02.a.L3), null, null, null, 28, null), null, null, null, null, 61, null), q(c5281b.e().size()), l(params, params.a(), params.c(), params.i(), c5281b), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(e02.a.P), null, 2, null), k30.d.a.f107773a, null, params.g(), 35, null), aVarB);
    }
}
