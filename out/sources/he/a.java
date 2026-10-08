package he;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import ie.n;
import ie.o;
import ie.t;
import zd.g;
import zd.h;
import zd.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f83956a = t.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f83957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f83958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.b f83959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f83960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f83961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f83962g;

    /* JADX INFO: renamed from: he.a$a, reason: collision with other inner class name */
    class C1931a implements ImageDecoder$OnPartialImageListener {
        C1931a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i15, int i16, h hVar) {
        this.f83957b = i15;
        this.f83958c = i16;
        this.f83959d = (zd.b) hVar.c(o.f91921f);
        this.f83960e = (n) hVar.c(n.f91916h);
        g<Boolean> gVar = o.f91925j;
        this.f83961f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f83962g = (i) hVar.c(o.f91922g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f83956a.f(this.f83957b, this.f83958c, this.f83961f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f83959d == zd.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1931a());
        Size size = imageInfo.getSize();
        int width = this.f83957b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f83958c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f83960e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f83962g;
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
