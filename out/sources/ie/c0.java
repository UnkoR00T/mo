package ie;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements zd.j<Bitmap, Bitmap> {

    private static final class a implements be.v<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f91884a;

        a(Bitmap bitmap) {
            this.f91884a = bitmap;
        }

        @Override // be.v
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f91884a;
        }

        @Override // be.v
        public void c() {
        }

        @Override // be.v
        public Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // be.v
        public int getSize() {
            return ve.l.h(this.f91884a);
        }
    }

    @Override // zd.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public be.v<Bitmap> b(Bitmap bitmap, int i15, int i16, zd.h hVar) {
        return new a(bitmap);
    }

    @Override // zd.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, zd.h hVar) {
        return true;
    }
}
