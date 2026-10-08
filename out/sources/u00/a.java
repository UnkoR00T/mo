package u00;

import android.app.NotificationManager;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import dx.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vh.l;
import vq.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006H\u0096@¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lu00/a;", "Ley/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ldx/i;", "Ldx/b;", "", "c", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "a", "()V", "Lcom/google/firebase/messaging/FirebaseMessaging;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "notificationManager", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ey.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FirebaseMessaging firebaseMessaging = FirebaseMessaging.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final NotificationManager notificationManager;

    /* JADX INFO: renamed from: u00.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5050a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f193997d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193999f;

        C5050a(e<? super C5050a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193997d = obj;
            this.f193999f |= PKIFailureInfo.systemUnavail;
            return a.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f194000d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f194002f;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f194000d = obj;
            this.f194002f |= PKIFailureInfo.systemUnavail;
            return a.this.c(this);
        }
    }

    public a(Context context) {
        Object systemService = context.getSystemService("notification");
        this.notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
    }

    @Override // ey.a
    public void a() {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ey.a
    public Object b(e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        C5050a c5050a;
        if (eVar instanceof C5050a) {
            c5050a = (C5050a) eVar;
            int i15 = c5050a.f193999f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5050a.f193999f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5050a = new C5050a(eVar);
            }
        } else {
            c5050a = new C5050a(eVar);
        }
        Object obj = c5050a.f193997d;
        Object objE = uq.b.e();
        int i16 = c5050a.f193999f;
        try {
            if (i16 == 0) {
                u.b(obj);
                l<Void> lVarN = this.firebaseMessaging.n();
                c5050a.f193999f = 1;
                if (tu.b.a(lVarN, c5050a) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return new i.Right(i0.f148189a);
        } catch (Exception e15) {
            return new i.Left(new dx.b.Generic(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ey.a
    public Object c(e<? super i<? extends dx.b, String>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f194002f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f194002f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f194000d;
        Object objE = uq.b.e();
        int i16 = bVar.f194002f;
        try {
            if (i16 == 0) {
                u.b(objA);
                l<String> lVarT = this.firebaseMessaging.t();
                bVar.f194002f = 1;
                objA = tu.b.a(lVarT, bVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(objA);
            }
            return new i.Right((String) objA);
        } catch (Exception e15) {
            return new i.Left(new dx.b.Generic(e15));
        }
    }
}
