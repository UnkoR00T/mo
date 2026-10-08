package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import fe.p;
import fe.t;
import fe.u;
import fe.w;
import fe.y;
import ie.a0;
import ie.c0;
import ie.d0;
import ie.o;
import ie.r;
import ie.v;
import ie.x;
import ie.z;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class j {

    class a implements ve.f.b<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f28784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f28785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f28786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pe.a f28787d;

        a(b bVar, List list, pe.a aVar) {
            this.f28785b = bVar;
            this.f28786c = list;
            this.f28787d = aVar;
        }

        @Override // ve.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i get() {
            if (this.f28784a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            eb.a.c("Glide registry");
            this.f28784a = true;
            try {
                return j.a(this.f28785b, this.f28786c, this.f28787d);
            } finally {
                this.f28784a = false;
                eb.a.f();
            }
        }
    }

    static i a(b bVar, List<pe.b> list, pe.a aVar) {
        ce.d dVarF = bVar.f();
        ce.b bVarE = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e eVarG = bVar.i().g();
        i iVar = new i();
        b(applicationContext, iVar, dVarF, bVarE, eVarG);
        c(applicationContext, bVar, iVar, list, aVar);
        return iVar;
    }

    private static void b(Context context, i iVar, ce.d dVar, ce.b bVar, e eVar) {
        zd.j hVar;
        zd.j a0Var;
        i iVar2;
        iVar.o(new ie.m());
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 27) {
            iVar.o(new r());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> listG = iVar.g();
        me.a aVar = new me.a(context, listG, dVar, bVar);
        zd.j<ParcelFileDescriptor, Bitmap> jVarM = d0.m(dVar);
        o oVar = new o(iVar.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i15 < 28 || !eVar.a(c.b.class)) {
            hVar = new ie.h(oVar);
            a0Var = new a0(oVar, bVar);
        } else {
            a0Var = new v();
            hVar = new ie.i();
        }
        if (i15 >= 28) {
            iVar.e("Animation", InputStream.class, Drawable.class, ke.c.f(listG, bVar));
            iVar.e("Animation", ByteBuffer.class, Drawable.class, ke.c.a(listG, bVar));
        }
        ke.g gVar = new ke.g(context);
        ie.c cVar = new ie.c(bVar);
        ne.a aVar2 = new ne.a();
        ne.d dVar2 = new ne.d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.c(ByteBuffer.class, new fe.c()).c(InputStream.class, new fe.v(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, hVar).e("Bitmap", InputStream.class, Bitmap.class, a0Var);
        if (ParcelFileDescriptorRewinder.c()) {
            iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new x(oVar));
        }
        iVar.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, d0.c(dVar));
        iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, jVarM).a(Bitmap.class, Bitmap.class, fe.x.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new c0()).d(Bitmap.class, cVar).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ie.a(resources, hVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ie.a(resources, a0Var)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new ie.a(resources, jVarM)).d(BitmapDrawable.class, new ie.b(dVar, cVar)).e("Animation", InputStream.class, me.c.class, new me.j(listG, aVar, bVar)).e("Animation", ByteBuffer.class, me.c.class, aVar).d(me.c.class, new me.d()).a(yd.a.class, yd.a.class, fe.x.a.a()).e("Bitmap", yd.a.class, Bitmap.class, new me.h(dVar)).b(Uri.class, Drawable.class, gVar).b(Uri.class, Bitmap.class, new z(gVar, dVar)).p(new je.a.C2414a()).a(File.class, ByteBuffer.class, new fe.d.b()).a(File.class, InputStream.class, new fe.g.e()).b(File.class, File.class, new le.a()).a(File.class, ParcelFileDescriptor.class, new fe.g.b()).a(File.class, File.class, fe.x.a.a()).p(new com.bumptech.glide.load.data.k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            iVar2 = iVar;
            iVar2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            iVar2 = iVar;
        }
        p<Integer, InputStream> pVarG = fe.f.g(context);
        p<Integer, AssetFileDescriptor> pVarC = fe.f.c(context);
        p<Integer, Drawable> pVarE = fe.f.e(context);
        Class cls = Integer.TYPE;
        iVar2.a(cls, InputStream.class, pVarG).a(Integer.class, InputStream.class, pVarG).a(cls, AssetFileDescriptor.class, pVarC).a(Integer.class, AssetFileDescriptor.class, pVarC).a(cls, Drawable.class, pVarE).a(Integer.class, Drawable.class, pVarE).a(Uri.class, InputStream.class, u.f(context)).a(Uri.class, AssetFileDescriptor.class, u.e(context));
        t.c cVar2 = new t.c(resources);
        t.a aVar3 = new t.a(resources);
        t.b bVar2 = new t.b(resources);
        iVar2.a(Integer.class, Uri.class, cVar2).a(cls, Uri.class, cVar2).a(Integer.class, AssetFileDescriptor.class, aVar3).a(cls, AssetFileDescriptor.class, aVar3).a(Integer.class, InputStream.class, bVar2).a(cls, InputStream.class, bVar2);
        iVar2.a(String.class, InputStream.class, new fe.e.c()).a(Uri.class, InputStream.class, new fe.e.c()).a(String.class, InputStream.class, new w.c()).a(String.class, ParcelFileDescriptor.class, new w.b()).a(String.class, AssetFileDescriptor.class, new w.a()).a(Uri.class, InputStream.class, new fe.a.c(context.getAssets())).a(Uri.class, AssetFileDescriptor.class, new fe.a.b(context.getAssets())).a(Uri.class, InputStream.class, new ge.b.a(context)).a(Uri.class, InputStream.class, new ge.c.a(context));
        if (i15 >= 29) {
            iVar2.a(Uri.class, InputStream.class, new ge.d.c(context));
            iVar2.a(Uri.class, ParcelFileDescriptor.class, new ge.d.b(context));
        }
        iVar2.a(Uri.class, InputStream.class, new y.d(contentResolver)).a(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver)).a(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver)).a(Uri.class, InputStream.class, new fe.z.a()).a(URL.class, InputStream.class, new ge.e.a()).a(Uri.class, File.class, new fe.l.a(context)).a(fe.h.class, InputStream.class, new ge.a.C1652a()).a(byte[].class, ByteBuffer.class, new fe.b.a()).a(byte[].class, InputStream.class, new fe.b.d()).a(Uri.class, Uri.class, fe.x.a.a()).a(Drawable.class, Drawable.class, fe.x.a.a()).b(Drawable.class, Drawable.class, new ke.h()).q(Bitmap.class, BitmapDrawable.class, new ne.b(resources)).q(Bitmap.class, byte[].class, aVar2).q(Drawable.class, byte[].class, new ne.c(dVar, aVar2, dVar2)).q(me.c.class, byte[].class, dVar2);
        zd.j<ByteBuffer, Bitmap> jVarD = d0.d(dVar);
        iVar2.b(ByteBuffer.class, Bitmap.class, jVarD);
        iVar2.b(ByteBuffer.class, BitmapDrawable.class, new ie.a(resources, jVarD));
    }

    private static void c(Context context, b bVar, i iVar, List<pe.b> list, pe.a aVar) {
        for (pe.b bVar2 : list) {
            try {
                bVar2.b(context, bVar, iVar);
            } catch (AbstractMethodError e15) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar2.getClass().getName(), e15);
            }
        }
        if (aVar != null) {
            aVar.a(context, bVar, iVar);
        }
    }

    static ve.f.b<i> d(b bVar, List<pe.b> list, pe.a aVar) {
        return new a(bVar, list, aVar);
    }
}
