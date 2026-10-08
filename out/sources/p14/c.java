package p14;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp14/c;", "Lb14/c;", "Ln14/a;", "dataSource", "<init>", "(Ln14/a;)V", "Lb14/c$a;", "params", "Loq/i0;", "d", "(Lb14/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Ln14/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b14.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n14.a dataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f151661e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f151663g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151661e = obj;
            this.f151663g |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(n14.a aVar) {
        this.dataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(b14.c.Params params, e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f151663g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f151663g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f151661e;
        Object objE = uq.b.e();
        int i16 = aVar.f151663g;
        if (i16 == 0) {
            u.b(obj);
            n14.a aVar2 = this.dataSource;
            String appVersionOverride = params.getAppVersionOverride();
            aVar.f151660d = j.a(params);
            aVar.f151663g = 1;
            if (aVar2.b(appVersionOverride, aVar) == objE) {
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
