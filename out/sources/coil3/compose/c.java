package coil3.compose;

import kc.n;
import kc.s;
import lc.g;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import zc.ErrorResult;
import zc.ImageRequest;
import zc.SuccessResult;
import zc.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\tJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcoil3/compose/c;", "", "Lkc/s;", "imageLoader", "Lzc/f;", "request", "Lcoil3/compose/AsyncImagePainter$State;", "a", "(Lkc/s;Lzc/f;Ltq/e;)Ljava/lang/Object;", "b", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f28719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f28713b = a.f28714c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f28714c = new a();

        /* JADX INFO: renamed from: coil3.compose.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C0738a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f28715d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f28716e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f28718g;

            C0738a(e<? super C0738a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f28716e = obj;
                this.f28718g |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, null, this);
            }
        }

        a() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // coil3.compose.c
        public final Object a(s sVar, ImageRequest imageRequest, e<? super AsyncImagePainter.State> eVar) throws Throwable {
            C0738a c0738a;
            if (eVar instanceof C0738a) {
                c0738a = (C0738a) eVar;
                int i15 = c0738a.f28718g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c0738a.f28718g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c0738a = new C0738a(eVar);
                }
            } else {
                c0738a = new C0738a(eVar);
            }
            Object objD = c0738a.f28716e;
            Object objE = uq.b.e();
            int i16 = c0738a.f28718g;
            if (i16 == 0) {
                u.b(objD);
                c0738a.f28715d = imageRequest;
                c0738a.f28718g = 1;
                objD = sVar.d(imageRequest, c0738a);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                imageRequest = (ImageRequest) c0738a.f28715d;
                u.b(objD);
            }
            i iVar = (i) objD;
            if (iVar instanceof SuccessResult) {
                SuccessResult successResult = (SuccessResult) iVar;
                return new AsyncImagePainter.State.Success(g.b(successResult.getImage(), imageRequest.getContext(), 0, 2, null), successResult);
            }
            if (!(iVar instanceof ErrorResult)) {
                throw new p();
            }
            ErrorResult errorResult = (ErrorResult) iVar;
            n image = errorResult.getImage();
            return new AsyncImagePainter.State.Error(image != null ? g.b(image, imageRequest.getContext(), 0, 2, null) : null, errorResult);
        }
    }

    /* JADX INFO: renamed from: coil3.compose.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcoil3/compose/c$b;", "", "<init>", "()V", "Lcoil3/compose/c;", "Default", "Lcoil3/compose/c;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f28719a = new Companion();

        private Companion() {
        }
    }

    Object a(s sVar, ImageRequest imageRequest, e<? super AsyncImagePainter.State> eVar);
}
