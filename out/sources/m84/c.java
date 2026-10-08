package m84;

import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j84.NotificationsHistoryRecord;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k30.d;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import r50.f;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010$\u001a\u00020\u0012*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lm84/c;", "Lm84/a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "<init>", "(Lmx/c;Lez/e;Lez/a;)V", "Lm84/a$a;", "params", "Lc30/b$c;", "h", "(Lm84/a$a;)Lc30/b$c;", "", "Lj84/c;", "Lkotlin/Function1;", "", "Loq/i0;", "onNotificationClick", "Ln84/a;", "q", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "e", "(Ljava/util/List;Lmx/a;)Ljava/util/List;", "notification", "Ln84/a$b;", "l", "(Lj84/c;Ler/l;)Ln84/a$b;", "Ljava/time/OffsetDateTime;", "Lfz/c;", "formatType", "f", "(Ljava/time/OffsetDateTime;Lfz/c;)Ljava/lang/String;", "Ll84/f$a;", "i", "(Lm84/a$a;)Ll84/f$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lez/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements m84.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((NotificationsHistoryRecord) t16).getSendingDateTime(), ((NotificationsHistoryRecord) t15).getSendingDateTime());
        }
    }

    public c(mx.c cVar, e eVar, ez.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.currentTimeProvider = aVar;
    }

    private final List<n84.a> e(List<n84.a> list, Label label) {
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        list.add(0, new n84.a.Header(label));
        return list;
    }

    private final String f(OffsetDateTime offsetDateTime, fz.c cVar) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTime), cVar);
    }

    private final c30.b.c h(m84.a.Params params) {
        return new c30.b.c(null, null, this.labelProvider.c(q74.a.f165236s), this.labelProvider.c(q74.a.f165235r), params.b(), null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(q74.a.f165233p), null, null, params.c(), 13, null)), 35, null);
    }

    private final n84.a.Message l(final NotificationsHistoryRecord notification, final l<? super String, i0> onNotificationClick) {
        n50.b statusBadge = new n50.b.StatusBadge(new r50.a.WithDot(null, mx.b.b(notification.getTitle(), "NotificationHistory"), this.labelProvider.c(q74.a.f165219b), 0, f.INFORMATIVE, 9, null));
        if (notification.getDisplayed()) {
            statusBadge = null;
        }
        if (statusBadge == null) {
            statusBadge = new n50.b.Title(new SingleCardLabel(mx.b.b(notification.getTitle(), "NotificationHistory"), this.labelProvider.c(q74.a.f165218a).o(Label.INSTANCE.d()).o(mx.b.b(notification.getTitle(), "NotificationHistory")), null, 0, 0, null, 60, null));
        }
        return new n84.a.Message(new DefaultSingleCardData(null, new er.a() { // from class: m84.b
            @Override // er.a
            public final Object a() {
                return c.m(onNotificationClick, notification);
            }
        }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(f(notification.getSendingDateTime(), fz.c.DOTTED_PLUS_HOUR), "sendingDateTime"), null, null, 0, 0, null, 62, null), statusBadge, null, 4, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, NotificationsHistoryRecord notificationsHistoryRecord) {
        lVar.b(notificationsHistoryRecord.getId());
        return i0.f148189a;
    }

    private final List<n84.a> q(List<NotificationsHistoryRecord> list, l<? super String, i0> lVar) {
        OffsetDateTime offsetDateTimeF = this.currentTimeProvider.f();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (NotificationsHistoryRecord notificationsHistoryRecord : v.U0(list, new a())) {
            if (notificationsHistoryRecord.getSendingDateTime().toLocalDate().isEqual(offsetDateTimeF.toLocalDate())) {
                arrayList.add(l(notificationsHistoryRecord, lVar));
            } else if (notificationsHistoryRecord.getSendingDateTime().isAfter(offsetDateTimeF.minusWeeks(1L))) {
                arrayList2.add(l(notificationsHistoryRecord, lVar));
            } else if (notificationsHistoryRecord.getSendingDateTime().isAfter(offsetDateTimeF.minusMonths(1L))) {
                arrayList3.add(l(notificationsHistoryRecord, lVar));
            } else {
                arrayList4.add(l(notificationsHistoryRecord, lVar));
            }
        }
        return v.A(v.s(e(arrayList, mx.b.b(f(offsetDateTimeF, fz.c.FULLDAY_DATEDOT), "todayListHeader")), e(arrayList2, this.labelProvider.c(q74.a.f165226i)), e(arrayList3, this.labelProvider.c(q74.a.f165225h)), e(arrayList4, this.labelProvider.c(q74.a.f165227j))));
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public l84.f.a b(m84.a.Params params) {
        List<n84.a> listN;
        l84.e state = params.getState();
        if (t.c(state, l84.e.c.f117050a)) {
            return new l84.f.a.LoadingState(this.labelProvider.c(q74.a.f165228k), params.a());
        }
        if (t.c(state, l84.e.b.a.f117048a)) {
            return new l84.f.a.b.NoData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q74.a.f165228k), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106746c2), this.labelProvider.c(q74.a.f165223f), null, null, null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(q74.a.f165221d), null, 2, null), d.a.f107773a, null, params.e(), 35, null), false, 76, null), this.labelProvider.c(q74.a.f165224g), params.a());
        }
        if (t.c(state, l84.e.b.C2833b.f117049a)) {
            return new l84.f.a.b.NoNotificationPermissions(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q74.a.f165228k), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106746c2), this.labelProvider.c(q74.a.f165234q), this.labelProvider.c(q74.a.f165237t), null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(q74.a.f165233p), null, 2, null), d.c.f107775a, null, params.c(), 35, null), null, false, 72, null), this.labelProvider.c(q74.a.f165224g), params.a());
        }
        if (!(state instanceof l84.e.DataLoaded)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q74.a.f165228k), null, null, null, 28, null), null, null, null, null, 61, null);
        List<NotificationsHistoryRecord> listB = ((l84.e.DataLoaded) params.getState()).getHistory().b();
        if (listB == null || (listN = q(listB, params.d())) == null) {
            listN = v.n();
        }
        return new l84.f.a.DataLoaded(baseScaffoldData, listN, this.labelProvider.c(q74.a.f165221d), params.e(), this.labelProvider.c(q74.a.f165224g), (!((l84.e.DataLoaded) params.getState()).getShowAlert() || ((l84.e.DataLoaded) params.getState()).getNotificationsEnabled()) ? null : h(params), params.a());
    }
}
