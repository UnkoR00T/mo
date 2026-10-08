package pd4;

import android.content.Context;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.legacy.storage.ContainerManagerNew;
import vq.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpd4/a;", "Lv64/d;", "Landroid/content/Context;", "context", "Lhj2/a;", "clearCertificatesUseCase", "<init>", "(Landroid/content/Context;Lhj2/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Landroid/content/Context;", "b", "Lhj2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements v64.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hj2.a clearCertificatesUseCase;

    /* JADX INFO: renamed from: pd4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3887a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f157042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f157043e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f157045g;

        C3887a(tq.e<? super C3887a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f157043e = obj;
            this.f157045g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(Context context, hj2.a aVar) {
        this.context = context;
        this.clearCertificatesUseCase = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i0> eVar) throws Throwable {
        C3887a c3887a;
        if (eVar instanceof C3887a) {
            c3887a = (C3887a) eVar;
            int i15 = c3887a.f157045g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3887a.f157045g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3887a = new C3887a(eVar);
            }
        } else {
            c3887a = new C3887a(eVar);
        }
        Object obj = c3887a.f157043e;
        Object objE = uq.b.e();
        int i16 = c3887a.f157045g;
        if (i16 == 0) {
            u.b(obj);
            ContainerManagerNew.u().g(this.context);
            hj2.a aVar = this.clearCertificatesUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            c3887a.f157042d = j.a(c1792a);
            c3887a.f157045g = 1;
            if (aVar.a(c1792a2, c3887a) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}
