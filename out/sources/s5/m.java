package s5;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f177949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f177950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l.e f177951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f177952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f177953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Bundle> f177954f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f177955g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f177956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f177957i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder f(Notification.Builder builder, boolean z15) {
            return builder.setGroupSummary(z15);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z15) {
            return builder.setLocalOnly(z15);
        }

        static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i15) {
            return builder.setColor(i15);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i15) {
            return builder.setVisibility(i15);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z15) {
            return builder.setAllowGeneratedReplies(z15);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i15) {
            return builder.setBadgeIconType(i15);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z15) {
            return builder.setColorized(z15);
        }

        static Notification.Builder d(Notification.Builder builder, int i15) {
            return builder.setGroupAlertBehavior(i15);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j15) {
            return builder.setTimeoutAfter(j15);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i15) {
            return builder.setSemanticAction(i15);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z15) {
            return builder.setAllowSystemGeneratedContextualActions(z15);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z15) {
            return builder.setContextual(z15);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z15) {
            return builder.setAuthenticationRequired(z15);
        }

        static Notification.Builder b(Notification.Builder builder, int i15) {
            return builder.setForegroundServiceBehavior(i15);
        }
    }

    static final class i {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    m(l.e eVar) {
        int i15;
        this.f177951c = eVar;
        Context context = eVar.f177909a;
        this.f177949a = context;
        Notification.Builder builderA = e.a(context, eVar.L);
        this.f177950b = builderA;
        Notification notification = eVar.S;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f177918j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f177913e).setContentText(eVar.f177914f).setContentInfo(eVar.f177920l).setContentIntent(eVar.f177916h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f177917i, (notification.flags & 128) != 0).setNumber(eVar.f177921m).setProgress(eVar.f177929u, eVar.f177930v, eVar.f177931w);
        IconCompat iconCompat = eVar.f177919k;
        c.b(builderA, iconCompat == null ? null : iconCompat.o(context));
        builderA.setSubText(eVar.f177926r).setUsesChronometer(eVar.f177924p).setPriority(eVar.f177922n);
        l.g gVar = eVar.f177925q;
        if (gVar instanceof l.f) {
            Iterator<l.a> it = ((l.f) gVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<l.a> it4 = eVar.f177910b.iterator();
            while (it4.hasNext()) {
                b(it4.next());
            }
        }
        Bundle bundle = eVar.E;
        if (bundle != null) {
            this.f177955g.putAll(bundle);
        }
        int i16 = Build.VERSION.SDK_INT;
        this.f177952d = eVar.I;
        this.f177953e = eVar.J;
        this.f177950b.setShowWhen(eVar.f177923o);
        a.g(this.f177950b, eVar.A);
        a.e(this.f177950b, eVar.f177932x);
        a.h(this.f177950b, eVar.f177934z);
        a.f(this.f177950b, eVar.f177933y);
        this.f177956h = eVar.P;
        b.b(this.f177950b, eVar.D);
        b.c(this.f177950b, eVar.F);
        b.f(this.f177950b, eVar.G);
        b.d(this.f177950b, eVar.H);
        b.e(this.f177950b, notification.sound, notification.audioAttributes);
        List listE = i16 < 28 ? e(g(eVar.f177911c), eVar.V) : eVar.V;
        if (listE != null && !listE.isEmpty()) {
            Iterator it5 = listE.iterator();
            while (it5.hasNext()) {
                b.a(this.f177950b, (String) it5.next());
            }
        }
        this.f177957i = eVar.K;
        if (eVar.f177912d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i17 = 0; i17 < eVar.f177912d.size(); i17++) {
                bundle4.putBundle(Integer.toString(i17), n.a(eVar.f177912d.get(i17)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f177955g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i18 = Build.VERSION.SDK_INT;
        Object obj = eVar.U;
        if (obj != null) {
            c.c(this.f177950b, obj);
        }
        this.f177950b.setExtras(eVar.E);
        d.e(this.f177950b, eVar.f177928t);
        RemoteViews remoteViews = eVar.I;
        if (remoteViews != null) {
            d.c(this.f177950b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.J;
        if (remoteViews2 != null) {
            d.b(this.f177950b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.K;
        if (remoteViews3 != null) {
            d.d(this.f177950b, remoteViews3);
        }
        e.b(this.f177950b, eVar.M);
        e.e(this.f177950b, eVar.f177927s);
        e.f(this.f177950b, eVar.N);
        e.g(this.f177950b, eVar.O);
        e.d(this.f177950b, eVar.P);
        if (eVar.C) {
            e.c(this.f177950b, eVar.B);
        }
        if (!TextUtils.isEmpty(eVar.L)) {
            this.f177950b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i18 >= 28) {
            Iterator<s> it6 = eVar.f177911c.iterator();
            while (it6.hasNext()) {
                f.a(this.f177950b, it6.next().h());
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 29) {
            g.a(this.f177950b, eVar.R);
            g.b(this.f177950b, l.d.a(null));
        }
        if (i19 >= 31 && (i15 = eVar.Q) != 0) {
            h.b(this.f177950b, i15);
        }
        if (i19 >= 36) {
            i.a(this.f177950b, eVar.f177915g);
        }
        if (eVar.T) {
            if (this.f177951c.f177933y) {
                this.f177956h = 2;
            } else {
                this.f177956h = 1;
            }
            this.f177950b.setVibrate(null);
            this.f177950b.setSound(null);
            int i25 = notification.defaults & (-4);
            notification.defaults = i25;
            this.f177950b.setDefaults(i25);
            if (TextUtils.isEmpty(this.f177951c.f177932x)) {
                a.e(this.f177950b, "silent");
            }
            e.d(this.f177950b, this.f177956h);
        }
    }

    private void b(l.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.n() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : u.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i15 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i15 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i15 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i15 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f177950b, a.d(builderA));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        r0.b bVar = new r0.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<s> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<s> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    @Override // s5.k
    public Notification.Builder a() {
        return this.f177950b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        l.g gVar = this.f177951c.f177925q;
        if (gVar != null) {
            gVar.b(this);
        }
        RemoteViews remoteViewsE = gVar != null ? gVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f177951c.I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (gVar != null && (remoteViewsD = gVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (gVar != null && (remoteViewsF = this.f177951c.f177925q.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (gVar != null && (bundleA = l.a(notificationD)) != null) {
            gVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        return this.f177950b.build();
    }

    Context f() {
        return this.f177949a;
    }
}
