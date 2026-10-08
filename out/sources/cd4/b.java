package cd4;

import dx.i;
import iw0.BEDictionaryResponse;
import kk3.DictionaryResponse;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcd4/b;", "Ljk3/b;", "Lqw0/c;", "getDictionaryUC", "Lqw0/a;", "getDictionaryTypesUC", "<init>", "(Lqw0/c;Lqw0/a;)V", "", "dictionaryId", "Ldx/i;", "Ldx/b;", "Lkk3/c;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lqw0/c;", "b", "Lqw0/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements jk3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final qw0.c getDictionaryUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qw0.a getDictionaryTypesUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f25494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f25495e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f25497g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f25495e = obj;
            this.f25497g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(qw0.c cVar, qw0.a aVar) {
        this.getDictionaryUC = cVar;
        this.getDictionaryTypesUC = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jk3.b
    public Object a(String str, e<? super i<? extends dx.b, DictionaryResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f25497g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25497g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f25495e;
        Object objE = uq.b.e();
        int i16 = aVar.f25497g;
        if (i16 == 0) {
            u.b(objC);
            qw0.c cVar = this.getDictionaryUC;
            qw0.c.Params params = new qw0.c.Params(str);
            aVar.f25494d = j.a(str);
            aVar.f25497g = 1;
            objC = cVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(c.c((BEDictionaryResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
