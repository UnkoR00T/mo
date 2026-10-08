package me;

import android.content.Context;
import android.graphics.Bitmap;
import be.v;
import java.security.MessageDigest;
import ve.k;
import zd.l;

/* JADX INFO: loaded from: classes3.dex */
public class f implements l<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<Bitmap> f125919b;

    public f(l<Bitmap> lVar) {
        this.f125919b = (l) k.d(lVar);
    }

    @Override // zd.l
    public v<c> a(Context context, v<c> vVar, int i15, int i16) {
        c cVar = vVar.get();
        v<Bitmap> fVar = new ie.f(cVar.e(), com.bumptech.glide.b.c(context).f());
        v<Bitmap> vVarA = this.f125919b.a(context, fVar, i15, i16);
        if (!fVar.equals(vVarA)) {
            fVar.c();
        }
        cVar.m(this.f125919b, vVarA.get());
        return vVar;
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        this.f125919b.b(messageDigest);
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f125919b.equals(((f) obj).f125919b);
        }
        return false;
    }

    @Override // zd.f
    public int hashCode() {
        return this.f125919b.hashCode();
    }
}
