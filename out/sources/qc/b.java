package qc;

import android.graphics.Bitmap;
import kc.s;
import kc.v;
import p071kotlin.Metadata;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lqc/b;", "Lqc/j;", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "data", "<init>", "(Landroid/graphics/Bitmap;)V", "Lqc/i;", "a", "(Ltq/e;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bitmap data;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqc/b$a;", "Lqc/j$a;", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "<init>", "()V", "data", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Lqc/j;", "b", "(Landroid/graphics/Bitmap;Lzc/n;Lkc/s;)Lqc/j;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<Bitmap> {
        @Override // qc.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(Bitmap data, Options options, s imageLoader) {
            return new b(data);
        }
    }

    public b(Bitmap bitmap) {
        this.data = bitmap;
    }

    @Override // qc.j
    public Object a(tq.e<? super i> eVar) {
        return new ImageFetchResult(v.d(this.data, false, 1, null), false, oc.f.MEMORY);
    }
}
