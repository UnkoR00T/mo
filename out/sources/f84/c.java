package f84;

import d84.NotificationSettingsEntry;
import d84.NotificationSettingsSection;
import e84.y;
import e84.z;
import er.l;
import er.p;
import fr.t;
import g84.Initialized;
import g84.NoPermission;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ji\u0010\u0018\u001a\u00020\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010 \u001a\u00020\u001f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lf84/c;", "Lxw/f;", "Lf84/c$a;", "Le84/z$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Ld84/c;", "notificationSettingsSectionList", "Lkotlin/Function2;", "", "", "Loq/i0;", "onSwitchStateChange", "Lkotlin/Function0;", "onBackButtonClick", "Lkotlin/Function1;", "openUrl", "appPzGovUrl", "Lw74/a;", "config", "Le84/z$a$b;", "q", "(Ljava/util/List;Ler/p;Ler/a;Ler/l;Ljava/lang/String;Lw74/a;)Le84/z$a$b;", "Lg84/c;", "r", "(Ljava/util/List;Ler/p;)Ljava/util/List;", "Ld84/a;", "notificationSettings", "Ln30/b;", "h", "(Ljava/util/List;Ler/p;)Ln30/b;", "params", "Le84/z$a$a;", "l", "(Lf84/c$a;)Le84/z$a$a;", "f", "(Lf84/c$a;)Le84/z$a;", "a", "Lmx/c;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, z.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f84.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001f\u0010!R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Lf84/c$a;", "", "Le84/y;", "state", "", "appPzGovUrl", "Lkotlin/Function0;", "Loq/i0;", "goToSystemNotificationSettings", "Lkotlin/Function2;", "", "onSwitchStateChange", "onBackButtonClick", "Lkotlin/Function1;", "openUrl", "<init>", "(Le84/y;Ljava/lang/String;Ler/a;Ler/p;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Le84/y;", "f", "()Le84/y;", "b", "Ljava/lang/String;", "c", "Ler/a;", "()Ler/a;", "d", "Ler/p;", "()Ler/p;", "e", "Ler/l;", "()Ler/l;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String appPzGovUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSystemNotificationSettings;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, Boolean, i0> onSwitchStateChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackButtonClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(y yVar, String str, er.a<i0> aVar, p<? super String, ? super Boolean, i0> pVar, er.a<i0> aVar2, l<? super String, i0> lVar) {
            this.state = yVar;
            this.appPzGovUrl = str;
            this.goToSystemNotificationSettings = aVar;
            this.onSwitchStateChange = pVar;
            this.onBackButtonClick = aVar2;
            this.openUrl = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAppPzGovUrl() {
            return this.appPzGovUrl;
        }

        public final er.a<i0> b() {
            return this.goToSystemNotificationSettings;
        }

        public final er.a<i0> c() {
            return this.onBackButtonClick;
        }

        public final p<String, Boolean, i0> d() {
            return this.onSwitchStateChange;
        }

        public final l<String, i0> e() {
            return this.openUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.appPzGovUrl, params.appPzGovUrl) && t.c(this.goToSystemNotificationSettings, params.goToSystemNotificationSettings) && t.c(this.onSwitchStateChange, params.onSwitchStateChange) && t.c(this.onBackButtonClick, params.onBackButtonClick) && t.c(this.openUrl, params.openUrl);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final y getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.appPzGovUrl.hashCode()) * 31) + this.goToSystemNotificationSettings.hashCode()) * 31) + this.onSwitchStateChange.hashCode()) * 31) + this.onBackButtonClick.hashCode()) * 31) + this.openUrl.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", appPzGovUrl=" + this.appPzGovUrl + ", goToSystemNotificationSettings=" + this.goToSystemNotificationSettings + ", onSwitchStateChange=" + this.onSwitchStateChange + ", onBackButtonClick=" + this.onBackButtonClick + ", openUrl=" + this.openUrl + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData h(List<NotificationSettingsEntry> notificationSettings, final p<? super String, ? super Boolean, i0> onSwitchStateChange) {
        List listN;
        if (notificationSettings != null) {
            List<NotificationSettingsEntry> list = notificationSettings;
            listN = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                final NotificationSettingsEntry notificationSettingsEntry = (NotificationSettingsEntry) obj;
                listN.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.d(notificationSettingsEntry.getTitle(), "title_" + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.d(notificationSettingsEntry.getDescription(), "description" + i15), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Switch(new s50.a.C4550a(null, notificationSettingsEntry.getEnabled(), false, new l() { // from class: f84.a
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c.i(onSwitchStateChange, notificationSettingsEntry, ((Boolean) obj2).booleanValue());
                    }
                }, null, null, null, false, 245, null)), null, 2815, null));
                i15 = i16;
            }
        } else {
            listN = v.n();
        }
        return new CardListData(listN, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(p pVar, NotificationSettingsEntry notificationSettingsEntry, boolean z15) {
        pVar.B(notificationSettingsEntry.getType(), Boolean.valueOf(z15));
        return i0.f148189a;
    }

    private final z.a.EmptyState l(final Params params) {
        return new z.a.EmptyState(new NoPermission(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), new er.a() { // from class: f84.b
            @Override // er.a
            public final Object a() {
                return c.m(params);
            }
        }), this.labelProvider.c(q74.a.f165228k), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106746c2), this.labelProvider.c(q74.a.f165234q), this.labelProvider.c(q74.a.f165237t), null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(q74.a.f165233p), null, 2, null), d.c.f107775a, null, params.b(), 35, null), null, false, 72, null), params.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.c().a();
        return i0.f148189a;
    }

    private final z.a.Initialized q(List<NotificationSettingsSection> notificationSettingsSectionList, p<? super String, ? super Boolean, i0> onSwitchStateChange, er.a<i0> onBackButtonClick, l<? super String, i0> openUrl, String appPzGovUrl, w74.a config) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackButtonClick), this.labelProvider.c(q74.a.f165228k), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(q74.a.f165232o);
        List<g84.c> listR = r(notificationSettingsSectionList, onSwitchStateChange);
        c30.b.c cVar = new c30.b.c(null, null, this.labelProvider.c(q74.a.f165231n), this.labelProvider.c(q74.a.f165229l), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(q74.a.f165230m), appPzGovUrl, LinkData.EnumC5775a.WEBSITE, false, openUrl, 17, null)), 51, null);
        if (config != w74.a.MOBYWATEL) {
            cVar = null;
        }
        return new z.a.Initialized(new Initialized(baseScaffoldData, labelC, listR, cVar, onBackButtonClick));
    }

    private final List<g84.c> r(List<NotificationSettingsSection> notificationSettingsSectionList, p<? super String, ? super Boolean, i0> onSwitchStateChange) {
        List<NotificationSettingsSection> list = notificationSettingsSectionList;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            NotificationSettingsSection notificationSettingsSection = (NotificationSettingsSection) obj;
            String title = notificationSettingsSection.getTitle();
            arrayList.add(new g84.c(title != null ? mx.b.b(title, "title_" + i15) : null, h(notificationSettingsSection.c(), onSwitchStateChange)));
            i15 = i16;
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public z.a b(Params params) {
        y state = params.getState();
        if (state instanceof y.Initialized) {
            return q(((y.Initialized) params.getState()).d(), params.d(), params.c(), params.e(), params.getAppPzGovUrl(), ((y.Initialized) params.getState()).getConfig());
        }
        if (state instanceof y.NoPermission) {
            return l(params);
        }
        throw new oq.p();
    }
}
