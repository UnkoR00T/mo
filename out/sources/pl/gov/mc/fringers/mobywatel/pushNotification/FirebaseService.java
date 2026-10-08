package pl.gov.mc.fringers.mobywatel.pushNotification;

import a84.d;
import a84.f;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.p;
import iy.w;
import java.security.SecureRandom;
import ju.j;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.mc.fringers.mobywatel.MainActivity;
import pl.gov.mc.fringers.mobywatel.d0;
import s5.l;
import s74.DecryptedMessage;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lpl/gov/mc/fringers/mobywatel/pushNotification/FirebaseService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/p0;", "message", "Loq/i0;", "F", "(Lcom/google/firebase/messaging/p0;)V", "", "G", "(Lcom/google/firebase/messaging/p0;)Z", "Ls74/a;", "item", "z", "(Ls74/a;)V", "q", "La84/d;", "l", "La84/d;", "A", "()La84/d;", "setDecryptNotificationMessageUseCase", "(La84/d;)V", "decryptNotificationMessageUseCase", "La84/f;", "m", "La84/f;", i.f37087n, "()La84/f;", "setDeviceRegisteredToNotificationsUseCase", "(La84/f;)V", "isDeviceRegisteredToNotificationsUseCase", "Lt74/a;", "n", "Lt74/a;", ip.a.f96138c, "()Lt74/a;", "setSetupNotificationsChannelsUseCase", "(Lt74/a;)V", "setupNotificationsChannelsUseCase", "Liy/w;", "p", "Liy/w;", "C", "()Liy/w;", "setSecureRandomFactory", "(Liy/w;)V", "secureRandomFactory", "Lt74/b;", "Lt74/b;", "E", "()Lt74/b;", "setUpdateNotDisplayedPushCountUC", "(Lt74/b;)V", "updateNotDisplayedPushCountUC", "Lpx/d;", "r", "Lpx/d;", "B", "()Lpx/d;", "setRemoteLogger", "(Lpx/d;)V", "remoteLogger", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"MissingFirebaseInstanceTokenRefresh"})
public final class FirebaseService extends kd4.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public d decryptNotificationMessageUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public f isDeviceRegisteredToNotificationsUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public t74.a setupNotificationsChannelsUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public w secureRandomFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public t74.b updateNotDisplayedPushCountUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public px.d remoteLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super Integer>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160788e;

        a(e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f160788e;
            if (i15 == 0) {
                u.b(obj);
                w wVarC = FirebaseService.this.C();
                this.f160788e = 1;
                obj = w.c(wVarC, null, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return vq.b.e(((SecureRandom) obj).nextInt());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super Integer> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return FirebaseService.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160790e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.messaging.p0 f160792g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.google.firebase.messaging.p0 p0Var, e<? super b> eVar) {
            super(2, eVar);
            this.f160792g = p0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f160790e;
            if (i15 == 0) {
                u.b(obj);
                d dVarA = FirebaseService.this.A();
                d.Params aVar = new d.Params(this.f160792g.h());
                this.f160790e = 1;
                obj = dVarA.d(aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            FirebaseService firebaseService = FirebaseService.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                px.d dVarB = firebaseService.B();
                dx.b.Generic generic = bVar instanceof dx.b.Generic ? (dx.b.Generic) bVar : null;
                dVarB.T6("Failed to decrypt push notification", generic != null ? generic.getE() : null, px.c.a(firebaseService));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                firebaseService.z((DecryptedMessage) ((dx.i.Right) iVar).b());
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return FirebaseService.this.new b(this.f160792g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<p0, e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160793e;

        c(e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f160793e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            f fVarH = FirebaseService.this.H();
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f160793e = 1;
            Object objA = fVarH.a(c1792a, this);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super Boolean> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return FirebaseService.this.new c(eVar);
        }
    }

    private final void F(com.google.firebase.messaging.p0 message) {
        j.b(null, new b(message, null), 1, null);
    }

    private final boolean G(com.google.firebase.messaging.p0 message) {
        return message.h().get("encryptedData") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(DecryptedMessage item) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("remoteNotification", item);
        intent.addFlags(PKIFailureInfo.duplicateCertReq);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        int iIntValue = ((Number) j.b(null, new a(null), 1, null)).intValue();
        String id5 = s74.b.MAIN_GENERAL_CHANNEL.getId();
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        Notification notificationB = new l.e(this, id5).j(item.getTitle()).i(item.getText()).t(d0.f160692a).e(true).u(defaultUri).h(PendingIntent.getActivity(this, iIntValue, intent, 201326592)).v(new l.c().h(item.getText())).b();
        E().a(new t74.b.Params(t74.b.a.C4900b.f188826a));
        if (notificationManager.areNotificationsEnabled()) {
            notificationManager.notify(iIntValue, notificationB);
        }
    }

    public final d A() {
        d dVar = this.decryptNotificationMessageUseCase;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final px.d B() {
        px.d dVar = this.remoteLogger;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final w C() {
        w wVar = this.secureRandomFactory;
        if (wVar != null) {
            return wVar;
        }
        return null;
    }

    public final t74.a D() {
        t74.a aVar = this.setupNotificationsChannelsUseCase;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final t74.b E() {
        t74.b bVar = this.updateNotDisplayedPushCountUC;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final f H() {
        f fVar = this.isDeviceRegisteredToNotificationsUseCase;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(com.google.firebase.messaging.p0 message) {
        D().a(gz.b.a.C1792a.f78542a);
        super.q(message);
        if (((Boolean) j.b(null, new c(null), 1, null)).booleanValue() && G(message)) {
            F(message);
        }
    }
}
