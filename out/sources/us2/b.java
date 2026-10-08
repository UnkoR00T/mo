package us2;

import a14.s;
import android.content.Intent;
import android.net.Uri;
import fr.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lus2/b;", "Lus2/a;", "La14/s;", "launchAppUseCase", "<init>", "(La14/s;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;Ltq/e;)Ljava/lang/Object;", "La14/s;", "b", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f201195c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s launchAppUseCase;

    /* JADX INFO: renamed from: us2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5230b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f201197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f201198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f201199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f201200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f201201h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f201203k;

        C5230b(e<? super C5230b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f201201h = obj;
            this.f201203k |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(s sVar) {
        this.launchAppUseCase = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mz.k
    public Object a(Intent intent, e<? super Boolean> eVar) throws Throwable {
        C5230b c5230b;
        if (eVar instanceof C5230b) {
            c5230b = (C5230b) eVar;
            int i15 = c5230b.f201203k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5230b.f201203k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5230b = new C5230b(eVar);
            }
        } else {
            c5230b = new C5230b(eVar);
        }
        Object obj = c5230b.f201201h;
        Object objE = uq.b.e();
        int i16 = c5230b.f201203k;
        if (i16 == 0) {
            u.b(obj);
            if (!t.c("android.intent.action.VIEW", intent.getAction())) {
                return vq.b.a(false);
            }
            Uri data = intent.getData();
            if (data == null || !t.c(data.getScheme(), "mobywatel") || !t.c(data.getHost(), "app") || !t.c(data.getPath(), "/service/pesel_restriction")) {
                return vq.b.a(false);
            }
            s.Params params = new s.Params(t64.b.a.f188027a, new tj2.b.ToLogin(tj2.b.ToLogin.AbstractC4973a.j.f190509b), ss2.a.C4742a.f183980a);
            s sVar = this.launchAppUseCase;
            c5230b.f201197d = j.a(intent);
            c5230b.f201198e = j.a(data);
            c5230b.f201199f = j.a(params);
            c5230b.f201200g = 0;
            c5230b.f201203k = 1;
            if (sVar.c(params, c5230b) == objE) {
                return objE;
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
