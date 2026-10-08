package zy2;

import a14.s;
import android.content.Intent;
import android.net.Uri;
import fr.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.c;
import px.d;
import px.f;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzy2/b;", "Lzy2/a;", "La14/s;", "launchAppUseCase", "Lpx/d;", "remoteLogger", "<init>", "(La14/s;Lpx/d;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;Ltq/e;)Ljava/lang/Object;", "La14/s;", "b", "Lpx/d;", "c", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f238517d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s launchAppUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d remoteLogger;

    /* JADX INFO: renamed from: zy2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6445b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f238520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f238521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f238522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f238523g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f238524h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f238525j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f238526k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f238528m;

        C6445b(e<? super C6445b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f238526k = obj;
            this.f238528m |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(s sVar, d dVar) {
        this.launchAppUseCase = sVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mz.k
    public Object a(Intent intent, e<? super Boolean> eVar) throws Throwable {
        C6445b c6445b;
        if (eVar instanceof C6445b) {
            c6445b = (C6445b) eVar;
            int i15 = c6445b.f238528m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c6445b.f238528m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c6445b = new C6445b(eVar);
            }
        } else {
            c6445b = new C6445b(eVar);
        }
        Object obj = c6445b.f238526k;
        Object objE = uq.b.e();
        int i16 = c6445b.f238528m;
        boolean z15 = true;
        if (i16 == 0) {
            u.b(obj);
            if (!t.c("android.intent.action.VIEW", intent.getAction())) {
                return vq.b.a(false);
            }
            Uri data = intent.getData();
            if (data == null || !t.c(data.getScheme(), "mobywatel") || !t.c(data.getHost(), "eqsig")) {
                return vq.b.a(false);
            }
            String queryParameter = data.getQueryParameter("token");
            if (queryParameter != null) {
                f.f163100a.b("Handling intent, qualified signature deeplink path", c.a(this));
                s.Params params = new s.Params(t64.b.a.f188027a, new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.ToQualifiedSignatureIdentityConfirmation(queryParameter)), new wy2.c.ToIdentityConfirmation(new wy2.c.ToIdentityConfirmation.InterfaceC5735a.Deeplink(queryParameter)));
                s sVar = this.launchAppUseCase;
                c6445b.f238520d = j.a(intent);
                c6445b.f238521e = j.a(data);
                c6445b.f238522f = j.a(queryParameter);
                c6445b.f238523g = j.a(params);
                c6445b.f238524h = 0;
                c6445b.f238525j = 0;
                c6445b.f238528m = 1;
                if (sVar.c(params, c6445b) == objE) {
                    return objE;
                }
            } else {
                px.b.y5(this.remoteLogger, "QualifiedSignatureIntentHandler error, token from query parameter not provided", null, c.a(this), 2, null);
                z15 = false;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return vq.b.a(z15);
    }
}
