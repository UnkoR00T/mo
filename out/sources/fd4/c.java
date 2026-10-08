package fd4;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import androidx.core.content.FileProvider;
import er.p;
import iy.w;
import java.io.File;
import java.security.SecureRandom;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import ju.g1;
import ju.l0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker;
import pl.gov.mc.fringers.mobywatel.MainActivity;
import pl.gov.mc.fringers.mobywatel.d0;
import pq.v;
import s5.l;
import ub.g0;
import ub.i;
import ub.o0;
import ub.p0;
import ub.x;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0011J,\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001c\u0010\u0011J(\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b \u0010!J(\u0010$\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lfd4/c;", "Lq54/a;", "Landroid/content/Context;", "context", "Lez/e;", "dateFormatter", "Lpx/d;", "remoteLogger", "Liy/w;", "secureRandomFactory", "Lub/p0;", "workManager", "<init>", "(Landroid/content/Context;Lez/e;Lpx/d;Liy/w;Lub/p0;)V", "", "Lub/o0;", "j", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "k", "Landroid/content/Intent;", "intent", "", "title", "description", "l", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "c", "d", "Lr54/c;", "localNotificationItem", "Lmx/a;", "b", "(Lr54/c;Lmx/a;Lmx/a;Ltq/e;)Ljava/lang/Object;", "filePath", "mimeType", "a", "(Ljava/lang/String;Ljava/lang/String;Lmx/a;Ltq/e;)Ljava/lang/Object;", "Landroid/content/Context;", "Lez/e;", "Lpx/d;", "Liy/w;", "e", "Lub/p0;", "Lub/d;", "f", "Lub/d;", CryptoServicesPermission.CONSTRAINTS, "Lub/g0;", "g", "Lub/g0;", "workRequestPeriod", "h", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements q54.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f61569i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w secureRandomFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0 workManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ub.d constraints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g0 workRequestPeriod;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f61577d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f61579f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f61577d = obj;
            this.f61579f |= PKIFailureInfo.systemUnavail;
            return c.this.d(this);
        }
    }

    /* JADX INFO: renamed from: fd4.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1396c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f61580d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f61582f;

        C1396c(tq.e<? super C1396c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f61580d = obj;
            this.f61582f |= PKIFailureInfo.systemUnavail;
            return c.this.j(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "", "Lub/o0;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<ju.p0, tq.e<? super List<? extends o0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61583e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f61583e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c.this.workManager.h("LocalNotificationWorker").get();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super List<o0>> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61585e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f61585e;
            if (i15 == 0) {
                u.b(obj);
                c.this.workManager.d("LocalNotificationPeriodicWork", i.CANCEL_AND_REENQUEUE, c.this.workRequestPeriod);
                c cVar = c.this;
                this.f61585e = 1;
                if (cVar.k(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new e(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f61587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f61588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61589f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f61591h;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f61589f = obj;
            this.f61591h |= PKIFailureInfo.systemUnavail;
            return c.this.k(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f61592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f61593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f61594f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f61595g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f61597j;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f61595g = obj;
            this.f61597j |= PKIFailureInfo.systemUnavail;
            return c.this.l(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f61598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f61599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f61600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f61601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f61602h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f61603j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f61604k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f61606m;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f61604k = obj;
            this.f61606m |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, null, null, this);
        }
    }

    public c(Context context, ez.e eVar, px.d dVar, w wVar, p0 p0Var) {
        this.context = context;
        this.dateFormatter = eVar;
        this.remoteLogger = dVar;
        this.secureRandomFactory = wVar;
        this.workManager = p0Var;
        ub.d dVarA = new ub.d.a().b(x.NOT_REQUIRED).d(false).c(false).e(false).a();
        this.constraints = dVarA;
        this.workRequestPeriod = new g0.a(LocalNotificationWorker.class, 3L, TimeUnit.HOURS).i(dVarA).k(2L, TimeUnit.MINUTES).a("LocalNotificationWorker").b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(tq.e<? super List<o0>> eVar) throws Throwable {
        C1396c c1396c;
        if (eVar instanceof C1396c) {
            c1396c = (C1396c) eVar;
            int i15 = c1396c.f61582f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1396c.f61582f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1396c = new C1396c(eVar);
            }
        } else {
            c1396c = new C1396c(eVar);
        }
        Object objG = c1396c.f61580d;
        Object objE = uq.b.e();
        int i16 = c1396c.f61582f;
        if (i16 == 0) {
            u.b(objG);
            l0 l0VarB = g1.b();
            d dVar = new d(null);
            c1396c.f61582f = 1;
            objG = ju.i.g(l0VarB, dVar, c1396c);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objG);
        }
        return objG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(tq.e<? super i0> eVar) throws Throwable {
        f fVar;
        px.d dVar;
        StringBuilder sb5;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f61591h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f61591h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f61589f;
        Object objE = uq.b.e();
        int i16 = fVar.f61591h;
        if (i16 == 0) {
            u.b(obj);
            px.d dVar2 = this.remoteLogger;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("LocalNotifications worker status: ");
            fVar.f61587d = dVar2;
            fVar.f61588e = sb6;
            fVar.f61591h = 1;
            Object objJ = j(fVar);
            if (objJ == objE) {
                return objE;
            }
            dVar = dVar2;
            obj = objJ;
            sb5 = sb6;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb5 = (StringBuilder) fVar.f61588e;
            dVar = (px.d) fVar.f61587d;
            u.b(obj);
        }
        sb5.append(((o0) v.x0((List) obj)).getState().name());
        dVar.u6(sb5.toString(), v.q(new px.a.Feature("LocalNotifications"), new px.a.Class(this)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Intent intent, String str, String str2, tq.e<? super i0> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f61597j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f61597j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objC = gVar.f61595g;
        Object objE = uq.b.e();
        int i16 = gVar.f61597j;
        if (i16 == 0) {
            u.b(objC);
            w wVar = this.secureRandomFactory;
            gVar.f61592d = intent;
            gVar.f61593e = str;
            gVar.f61594f = str2;
            gVar.f61597j = 1;
            objC = w.c(wVar, null, gVar, 1, null);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) gVar.f61594f;
            str = (String) gVar.f61593e;
            intent = (Intent) gVar.f61592d;
            u.b(objC);
        }
        int iNextInt = ((SecureRandom) objC).nextInt();
        String id5 = s74.b.MAIN_GENERAL_CHANNEL.getId();
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        Notification notificationB = new l.e(this.context, id5).j(str).i(str2).t(d0.f160692a).e(true).u(defaultUri).h(PendingIntent.getActivity(this.context, iNextInt, intent, 201326592)).v(new l.c().h(str2)).b();
        NotificationManager notificationManager = (NotificationManager) this.context.getSystemService("notification");
        if (notificationManager.areNotificationsEnabled()) {
            notificationManager.notify(iNextInt, notificationB);
        }
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // q54.a
    public Object a(String str, String str2, Label label, tq.e<? super i0> eVar) throws Throwable {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f61606m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f61606m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f61604k;
        Object objE = uq.b.e();
        int i16 = hVar.f61606m;
        try {
            if (i16 == 0) {
                u.b(obj);
                String str3 = this.context.getApplicationContext().getPackageName() + ".provider";
                Uri uriH = FileProvider.h(this.context, str3, new File(str));
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriH, str2);
                intent.setFlags(1);
                String lastPathSegment = uriH.getLastPathSegment();
                String text = label.getText();
                hVar.f61598d = j.a(str);
                hVar.f61599e = j.a(str2);
                hVar.f61600f = j.a(label);
                hVar.f61601g = j.a(str3);
                hVar.f61602h = j.a(uriH);
                hVar.f61603j = j.a(intent);
                hVar.f61606m = 1;
                if (l(intent, lastPathSegment, text, hVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
        } catch (Exception e15) {
            this.remoteLogger.T6("SendDownloadDocumentNotification Error: " + e15.getMessage(), e15, v.q(new px.a.Feature("LocalNotifications"), new px.a.Class(this)));
        }
        return i0.f148189a;
    }

    @Override // q54.a
    public Object b(r54.c cVar, Label label, Label label2, tq.e<? super i0> eVar) throws Throwable {
        Intent intent = new Intent(this.context, (Class<?>) MainActivity.class);
        intent.putExtra("localNotification", cVar);
        intent.setFlags(PKIFailureInfo.duplicateCertReq);
        Object objL = l(intent, label.getText(), label2.getText(), eVar);
        return objL == uq.b.e() ? objL : i0.f148189a;
    }

    @Override // q54.a
    public Object c(tq.e<? super i0> eVar) {
        Object objG = ju.i.g(g1.b(), new e(null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // q54.a
    public Object d(tq.e<? super String> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f61579f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f61579f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objJ = bVar.f61577d;
        Object objE = uq.b.e();
        int i16 = bVar.f61579f;
        try {
            if (i16 == 0) {
                u.b(objJ);
                bVar.f61579f = 1;
                objJ = j(bVar);
                if (objJ == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(objJ);
            }
            for (Object obj : (Iterable) objJ) {
                if (((o0) obj).getState() == o0.c.ENQUEUED) {
                    return this.dateFormatter.d(new fz.b.Long(((o0) obj).getNextScheduleTimeMillis()), fz.c.DOTTED_PLUS_HOUR);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            return "not scheduled yet";
        }
    }
}
