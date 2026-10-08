package pl.gov.mc.fringers.mobywatel;

import android.content.Intent;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lpl/gov/mc/fringers/mobywatel/h;", "Lpl/gov/mc/fringers/mobywatel/g;", "La14/s;", "launchAppUseCase", "<init>", "(La14/s;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;Ltq/e;)Ljava/lang/Object;", "La14/s;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a14.s launchAppUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f160753f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f160755h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f160753f = obj;
            this.f160755h |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, this);
        }
    }

    public h(a14.s sVar) {
        this.launchAppUseCase = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mz.k
    public Object a(Intent intent, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f160755h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f160755h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f160753f;
        Object objE = uq.b.e();
        int i16 = aVar.f160755h;
        if (i16 == 0) {
            oq.u.b(obj);
            px.f.f163100a.b("Handled by default launch intent handler.", px.c.a(this));
            a14.s.Params params = new a14.s.Params(new po2.a.ToOnboarding(false, false, false, 7, null), oi2.a.C3628a.f145998a, null);
            a14.s sVar = this.launchAppUseCase;
            aVar.f160751d = vq.j.a(intent);
            aVar.f160752e = vq.j.a(params);
            aVar.f160755h = 1;
            if (sVar.c(params, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return vq.b.a(true);
    }
}
