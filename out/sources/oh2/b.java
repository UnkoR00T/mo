package oh2;

import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.d;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loh2/b;", "Lkh2/b;", "Lnh2/a;", "dataSource", "Lpx/d;", "remoteLogger", "<init>", "(Lnh2/a;Lpx/d;)V", "Lkh2/b$a;", "params", "", "d", "(Lkh2/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lnh2/a;", "b", "Lpx/d;", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements kh2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nh2.a dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f145895e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f145897g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145895e = obj;
            this.f145897g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(nh2.a aVar, d dVar) {
        this.dataSource = aVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(kh2.b.Params params, e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f145897g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f145897g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f145895e;
        Object objE = uq.b.e();
        int i16 = aVar.f145897g;
        if (i16 == 0) {
            u.b(objB);
            nh2.a aVar2 = this.dataSource;
            String language = params.getLanguage();
            aVar.f145894d = params;
            aVar.f145897g = 1;
            objB = aVar2.b(language, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (kh2.b.Params) aVar.f145894d;
            u.b(objB);
        }
        if (((Boolean) objB).booleanValue()) {
            this.remoteLogger.p("APP_LANGUAGE", params.getLanguage());
        }
        return objB;
    }
}
