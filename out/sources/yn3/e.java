package yn3;

import a14.s;
import android.content.Intent;
import android.net.Uri;
import fr.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import wn3.WithDeeplink;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lyn3/e;", "Lyn3/d;", "La14/s;", "launchAppUseCase", "<init>", "(La14/s;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;Ltq/e;)Ljava/lang/Object;", "La14/s;", "b", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f228259c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s launchAppUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f228261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f228262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f228263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f228264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f228265h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f228266j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f228267k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f228269m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f228267k = obj;
            this.f228269m |= PKIFailureInfo.systemUnavail;
            return e.this.a(null, this);
        }
    }

    public e(s sVar) {
        this.launchAppUseCase = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mz.k
    public Object a(Intent intent, tq.e<? super Boolean> eVar) throws Throwable {
        b bVar;
        Uri data;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f228269m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f228269m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f228267k;
        Object objE = uq.b.e();
        int i16 = bVar.f228269m;
        if (i16 == 0) {
            u.b(obj);
            if (!t.c("android.intent.action.VIEW", intent.getAction()) || (data = intent.getData()) == null || !t.c(data.getLastPathSegment(), "institutions")) {
                return vq.b.a(false);
            }
            px.f.f163100a.b("Handling intent, path is valid", px.c.a(this));
            String queryParameter = data.getQueryParameter("qrCode");
            if (queryParameter != null) {
                s.Params params = new s.Params(t64.b.a.f188027a, new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.Verification(queryParameter)), new WithDeeplink(queryParameter));
                s sVar = this.launchAppUseCase;
                bVar.f228261d = j.a(intent);
                bVar.f228262e = j.a(data);
                bVar.f228263f = j.a(queryParameter);
                bVar.f228264g = j.a(params);
                bVar.f228265h = 0;
                bVar.f228266j = 0;
                bVar.f228269m = 1;
                if (sVar.c(params, bVar) == objE) {
                    return objE;
                }
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return vq.b.a(true);
    }
}
