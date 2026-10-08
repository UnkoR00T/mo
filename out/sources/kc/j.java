package kc;

import ad.Size;
import android.graphics.Bitmap;
import oc.DecodeResult;
import p071kotlin.Metadata;
import zc.ErrorResult;
import zc.ImageRequest;
import zc.Options;
import zc.SuccessResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 :2\u00020\u0001:\u00025\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J1\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020,H\u0016¢\u0006\u0004\b/\u0010.J\u001f\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\bJ\u001f\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lkc/j;", "Lzc/f$d;", "<init>", "()V", "Lzc/f;", "request", "Loq/i0;", "b", "(Lzc/f;)V", "Lad/i;", "sizeResolver", "n", "(Lzc/f;Lad/i;)V", "Lad/g;", "size", "m", "(Lzc/f;Lad/g;)V", "", "input", "l", "(Lzc/f;Ljava/lang/Object;)V", "output", "k", "j", "", "i", "(Lzc/f;Ljava/lang/String;)V", "Lqc/j;", "fetcher", "Lzc/n;", "options", "h", "(Lzc/f;Lqc/j;Lzc/n;)V", "Lqc/i;", "result", "g", "(Lzc/f;Lqc/j;Lzc/n;Lqc/i;)V", "Loc/i;", "decoder", "f", "(Lzc/f;Loc/i;Lzc/n;)V", "Loc/g;", "e", "(Lzc/f;Loc/i;Lzc/n;Loc/g;)V", "Landroid/graphics/Bitmap;", "p", "(Lzc/f;Landroid/graphics/Bitmap;)V", "o", "Ldd/c;", "transition", "r", "(Lzc/f;Ldd/c;)V", "q", "c", "Lzc/e;", "d", "(Lzc/f;Lzc/e;)V", "Lzc/r;", "a", "(Lzc/f;Lzc/r;)V", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j implements ImageRequest.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f109827b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kc/j$a", "Lkc/j;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends j {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lkc/j$c;", "", "Lzc/f;", "request", "Lkc/j;", "b", "(Lzc/f;)Lkc/j;", "a", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f109830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f109829b = new c() { // from class: kc.k
            @Override // kc.j.c
            public final j b(ImageRequest imageRequest) {
                return j.c.a(imageRequest);
            }
        };

        /* JADX INFO: renamed from: kc.j$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lkc/j$c$a;", "", "<init>", "()V", "Lkc/j$c;", "NONE", "Lkc/j$c;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f109830a = new Companion();

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static j a(ImageRequest imageRequest) {
            return j.f109827b;
        }

        j b(ImageRequest request);
    }

    @Override // zc.ImageRequest.d
    public void a(ImageRequest request, SuccessResult result) {
    }

    @Override // zc.ImageRequest.d
    public void b(ImageRequest request) {
    }

    @Override // zc.ImageRequest.d
    public void c(ImageRequest request) {
    }

    @Override // zc.ImageRequest.d
    public void d(ImageRequest request, ErrorResult result) {
    }

    public void e(ImageRequest request, oc.i decoder, Options options, DecodeResult result) {
    }

    public void f(ImageRequest request, oc.i decoder, Options options) {
    }

    public void g(ImageRequest request, qc.j fetcher, Options options, qc.i result) {
    }

    public void h(ImageRequest request, qc.j fetcher, Options options) {
    }

    public void i(ImageRequest request, String output) {
    }

    public void j(ImageRequest request, Object input) {
    }

    public void k(ImageRequest request, Object output) {
    }

    public void l(ImageRequest request, Object input) {
    }

    public void m(ImageRequest request, Size size) {
    }

    public void n(ImageRequest request, ad.i sizeResolver) {
    }

    public void o(ImageRequest request, Bitmap output) {
    }

    public void p(ImageRequest request, Bitmap input) {
    }

    public void q(ImageRequest request, dd.c transition) {
    }

    public void r(ImageRequest request, dd.c transition) {
    }
}
