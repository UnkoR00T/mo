package rz;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lrz/b;", "Lrz/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "data", "Landroid/graphics/Bitmap;", "a", "([B)Landroid/graphics/Bitmap;", "Landroid/content/Context;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public b(Context context) {
        this.context = context;
    }

    @Override // rz.a
    public Bitmap a(byte[] data) {
        return BitmapFactory.decodeByteArray(data, 0, data.length);
    }
}
