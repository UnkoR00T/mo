package f22;

import e22.State;
import e22.g;
import eo0.BEAdditionalInformationUrl;
import eo0.BEDictionaryAdditionalInformation;
import eo0.y0;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf22/c;", "Lxw/f;", "Lf22/c$a;", "Le22/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Leo0/h;", "additionalInfo", "Lkotlin/Function1;", "", "Loq/i0;", "urlClick", "Lkotlin/Function0;", "hideGeneralAlert", "Lc30/b;", "l", "(Leo0/h;Ler/l;Ler/a;)Lc30/b;", "params", "f", "(Lf22/c$a;)Le22/g$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f22.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\"\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001f\u0010\u001e¨\u0006#"}, d2 = {"Lf22/c$a;", "", "Le22/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "close", "Lkotlin/Function1;", "Leo0/y0;", "chooseMessageType", "", "urlClick", "hideGeneralAlert", "<init>", "(Le22/f;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le22/f;", "d", "()Le22/f;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<y0, i0> chooseMessageType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> urlClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideGeneralAlert;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super y0, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2) {
            this.state = state;
            this.close = aVar;
            this.chooseMessageType = lVar;
            this.urlClick = lVar2;
            this.hideGeneralAlert = aVar2;
        }

        public final l<y0, i0> a() {
            return this.chooseMessageType;
        }

        public final er.a<i0> b() {
            return this.close;
        }

        public final er.a<i0> c() {
            return this.hideGeneralAlert;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final l<String, i0> e() {
            return this.urlClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.close, params.close) && t.c(this.chooseMessageType, params.chooseMessageType) && t.c(this.urlClick, params.urlClick) && t.c(this.hideGeneralAlert, params.hideGeneralAlert);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.close.hashCode()) * 31) + this.chooseMessageType.hashCode()) * 31) + this.urlClick.hashCode()) * 31) + this.hideGeneralAlert.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", close=" + this.close + ", chooseMessageType=" + this.chooseMessageType + ", urlClick=" + this.urlClick + ", hideGeneralAlert=" + this.hideGeneralAlert + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.a().b(y0.E_DELIVERY);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.a().b(y0.E_PUAP);
        return i0.f148189a;
    }

    private final c30.b l(BEDictionaryAdditionalInformation additionalInfo, l<? super String, i0> urlClick, er.a<i0> hideGeneralAlert) {
        c30.a.Link link;
        if (additionalInfo == null) {
            return null;
        }
        BEAdditionalInformationUrl url = additionalInfo.getUrl();
        if (url != null) {
            link = new c30.a.Link(new LinkData(null, mx.b.b(url.getTitle(), "linkLabel"), url.getValue(), LinkData.EnumC5775a.WEBSITE, false, urlClick, 17, null));
        } else {
            link = null;
        }
        String title = additionalInfo.getTitle();
        return new c30.b.c(null, null, title != null ? mx.b.b(title, "additionalInfoAlertTitle") : null, mx.b.b(additionalInfo.getBody(), "additionalInfoAlert"), hideGeneralAlert, null, link, 35, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g.Data b(final Params params) {
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        x0.Icon iconB = companion.b();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: f22.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(e02.a.f46540h1), null, null, 3, null)), null, 5, null), null, iconB, null, 2813, null);
        x0.Icon iconB2 = companion.b();
        CardListData cardListData = new CardListData(v.q(defaultSingleCardData, new DefaultSingleCardData(null, new er.a() { // from class: f22.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(e02.a.f46564l1), null, null, 3, null)), null, 5, null), null, iconB2, null, 2813, null)), null, false, null, null, 30, null);
        Label labelC = this.labelProvider.c(e02.a.Y1);
        return new g.Data(new BaseScaffoldData(null, new i.Small(null, this.labelProvider.c(e02.a.f46590p3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 21, null), null, null, null, null, 61, null), cardListData, l(params.getState().getAdditionalInfo(), params.e(), params.c()), labelC);
    }
}
