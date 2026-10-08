package rc;

import ad.Size;
import java.util.List;
import kc.j;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zc.ImageRequest;
import zc.i;
import zc.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b*\u0010.¨\u0006/"}, d2 = {"Lrc/e;", "Lrc/d$a;", "Lzc/f;", "initialRequest", "", "Lrc/d;", "interceptors", "", "index", "request", "Lad/g;", "size", "Lkc/j;", "eventListener", "", "isPlaceholderCached", "<init>", "(Lzc/f;Ljava/util/List;ILzc/f;Lad/g;Lkc/j;Z)V", "interceptor", "Loq/i0;", "a", "(Lzc/f;Lrc/d;)V", "c", "(ILzc/f;Lad/g;)Lrc/e;", "Lzc/i;", "g", "(Ltq/e;)Ljava/lang/Object;", "Lzc/f;", "getInitialRequest", "()Lzc/f;", "b", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "I", "getIndex", "()I", "d", "e", "Lad/g;", "getSize", "()Lad/g;", "f", "Lkc/j;", "()Lkc/j;", "Z", "()Z", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageRequest initialRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<d> interceptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ImageRequest request;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Size size;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j eventListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isPlaceholderCached;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f173092e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f173094g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173092e = obj;
            this.f173094g |= PKIFailureInfo.systemUnavail;
            return e.this.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(ImageRequest imageRequest, List<? extends d> list, int i15, ImageRequest imageRequest2, Size size, j jVar, boolean z15) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i15;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = jVar;
        this.isPlaceholderCached = z15;
    }

    private final void a(ImageRequest request, d interceptor) {
        if (request.getContext() != this.initialRequest.getContext()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (request.getData() == k.f234180a) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (request.getTarget() != this.initialRequest.getTarget()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (request.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    private final e c(int index, ImageRequest request, Size size) {
        return new e(this.initialRequest, this.interceptors, index, request, size, this.eventListener, this.isPlaceholderCached);
    }

    static /* synthetic */ e d(e eVar, int i15, ImageRequest imageRequest, Size size, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = eVar.index;
        }
        if ((i16 & 2) != 0) {
            imageRequest = eVar.getRequest();
        }
        if ((i16 & 4) != 0) {
            size = eVar.getSize();
        }
        return eVar.c(i15, imageRequest, size);
    }

    @Override // rc.d.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public ImageRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(tq.e<? super i> eVar) {
        a aVar;
        d dVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f173094g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f173094g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f173092e;
        Object objE = uq.b.e();
        int i16 = aVar.f173094g;
        if (i16 == 0) {
            u.b(obj);
            d dVar2 = this.interceptors.get(this.index);
            d.a aVarD = d(this, this.index + 1, null, null, 6, null);
            aVar.f173091d = dVar2;
            aVar.f173094g = 1;
            Object objA = dVar2.a(aVarD, aVar);
            if (objA == objE) {
                return objE;
            }
            dVar = dVar2;
            obj = objA;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (d) aVar.f173091d;
            u.b(obj);
        }
        i iVar = (i) obj;
        a(iVar.getRequest(), dVar);
        return iVar;
    }

    @Override // rc.d.a
    public Size getSize() {
        return this.size;
    }
}
