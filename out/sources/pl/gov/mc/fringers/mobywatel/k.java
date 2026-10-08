package pl.gov.mc.fringers.mobywatel;

import android.content.Intent;
import java.io.Serializable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p135y70.e4;
import p135y70.f4;
import p135y70.h4;
import r74.DefaultNotificationDetailsData;
import s74.DecryptedMessage;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpl/gov/mc/fringers/mobywatel/k;", "Lmz/k;", "Ln90/a;", "isMJuniorAppActivatedUC", "La14/s;", "launchAppUseCase", "Ly70/h4;", "setPendingNavigationUC", "<init>", "(Ln90/a;La14/s;Ly70/h4;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;Ltq/e;)Ljava/lang/Object;", "Ln90/a;", "b", "La14/s;", "c", "Ly70/h4;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements mz.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n90.a isMJuniorAppActivatedUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.s launchAppUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h4 setPendingNavigationUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f160769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f160770g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f160771h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f160772j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f160774l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f160772j = obj;
            this.f160774l |= PKIFailureInfo.systemUnavail;
            return k.this.a(null, this);
        }
    }

    public k(n90.a aVar, a14.s sVar, h4 h4Var) {
        this.isMJuniorAppActivatedUC = aVar;
        this.launchAppUseCase = sVar;
        this.setPendingNavigationUC = h4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mz.k
    public Object a(Intent intent, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        DefaultNotificationDetailsData defaultNotificationDetailsDataB;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f160774l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f160774l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f160772j;
        Object objE = uq.b.e();
        int i16 = aVar.f160774l;
        if (i16 == 0) {
            oq.u.b(obj);
            if (!this.isMJuniorAppActivatedUC.b(gz.b.a.C1792a.f78542a).booleanValue()) {
                return vq.b.a(false);
            }
            Serializable serializableExtra = intent.getSerializableExtra("remoteNotification");
            DecryptedMessage decryptedMessage = serializableExtra instanceof DecryptedMessage ? (DecryptedMessage) serializableExtra : null;
            if (decryptedMessage != null && (defaultNotificationDetailsDataB = l.b(decryptedMessage)) != null) {
                this.setPendingNavigationUC.a(new h4.Params(new f4.DefaultNotification(defaultNotificationDetailsDataB)));
                e4.a aVar2 = e4.a.f225002a;
                a14.s.Params params = new a14.s.Params(aVar2, aVar2, aVar2);
                a14.s sVar = this.launchAppUseCase;
                aVar.f160767d = vq.j.a(intent);
                aVar.f160768e = vq.j.a(decryptedMessage);
                aVar.f160769f = vq.j.a(params);
                aVar.f160770g = vq.j.a(defaultNotificationDetailsDataB);
                aVar.f160771h = 0;
                aVar.f160774l = 1;
                if (sVar.c(params, aVar) == objE) {
                    return objE;
                }
            }
            return vq.b.a(false);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oq.u.b(obj);
        return vq.b.a(true);
    }
}
