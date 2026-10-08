package o14;

import a14.y;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lo14/g;", "La14/h;", "La14/y;", "requestPermissionUseCase", "Laz/b;", "downloadFileManager", "<init>", "(La14/y;Laz/b;)V", "La14/h$a;", "params", "Lu04/b;", "d", "(La14/h$a;Ltq/e;)Ljava/lang/Object;", "a", "La14/y;", "b", "Laz/b;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements a14.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y requestPermissionUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final az.b downloadFileManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f140611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f140612e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f140614g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f140612e = obj;
            this.f140614g |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(y yVar, az.b bVar) {
        this.requestPermissionUseCase = yVar;
        this.downloadFileManager = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(a14.h.Params params, tq.e<? super u04.b> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f140614g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f140614g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f140612e;
        Object objE = uq.b.e();
        int i16 = aVar.f140614g;
        if (i16 == 0) {
            u.b(objC);
            y yVar = this.requestPermissionUseCase;
            y.Params params2 = new y.Params(gy.d.EXTERNAL_STORAGE);
            aVar.f140611d = params;
            aVar.f140614g = 1;
            objC = yVar.c(params2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (a14.h.Params) aVar.f140611d;
            u.b(objC);
        }
        u04.c cVar = (u04.c) objC;
        if (cVar instanceof u04.c.b) {
            return ((u04.c.b) cVar).getShouldShowRationale() ? u04.b.NOT_PERMISSION_GRANTED : u04.b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS;
        }
        dx.i<dx.b, i0> iVarA = this.downloadFileManager.a(params.getDownloadFileData());
        if (iVarA instanceof dx.i.Right) {
            return u04.b.OK;
        }
        if (iVarA instanceof dx.i.Left) {
            return u04.b.FILE_NOT_SAVED;
        }
        throw new oq.p();
    }
}
