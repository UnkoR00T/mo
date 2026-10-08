package ie;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public class z implements zd.j<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ke.g f91966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.d f91967b;

    public z(ke.g gVar, ce.d dVar) {
        this.f91966a = gVar;
        this.f91967b = dVar;
    }

    @Override // zd.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public be.v<Bitmap> b(Uri uri, int i15, int i16, zd.h hVar) {
        be.v<Drawable> vVarB = this.f91966a.b(uri, i15, i16, hVar);
        if (vVarB == null) {
            return null;
        }
        return p.a(this.f91967b, vVarB.get(), i15, i16);
    }

    @Override // zd.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, zd.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
