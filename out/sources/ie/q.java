package ie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class q implements zd.l<Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<Bitmap> f91936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f91937c;

    public q(zd.l<Bitmap> lVar, boolean z15) {
        this.f91936b = lVar;
        this.f91937c = z15;
    }

    private be.v<Drawable> d(Context context, be.v<Bitmap> vVar) {
        return w.e(context.getResources(), vVar);
    }

    @Override // zd.l
    public be.v<Drawable> a(Context context, be.v<Drawable> vVar, int i15, int i16) {
        ce.d dVarF = com.bumptech.glide.b.c(context).f();
        Drawable drawable = vVar.get();
        be.v<Bitmap> vVarA = p.a(dVarF, drawable, i15, i16);
        if (vVarA != null) {
            be.v<Bitmap> vVarA2 = this.f91936b.a(context, vVarA, i15, i16);
            if (!vVarA2.equals(vVarA)) {
                return d(context, vVarA2);
            }
            vVarA2.c();
            return vVar;
        }
        if (!this.f91937c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        this.f91936b.b(messageDigest);
    }

    public zd.l<BitmapDrawable> c() {
        return this;
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f91936b.equals(((q) obj).f91936b);
        }
        return false;
    }

    @Override // zd.f
    public int hashCode() {
        return this.f91936b.hashCode();
    }
}
