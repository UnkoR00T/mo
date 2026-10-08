package fe;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import io.sentry.android.core.c2;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class t<Data> implements o<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f61700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f61701b;

    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f61702a;

        public a(Resources resources) {
            this.f61702a = resources;
        }

        @Override // fe.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new t(this.f61702a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f61703a;

        public b(Resources resources) {
            this.f61703a = resources;
        }

        @Override // fe.p
        public o<Integer, InputStream> d(s sVar) {
            return new t(this.f61703a, sVar.d(Uri.class, InputStream.class));
        }
    }

    public static class c implements p<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f61704a;

        public c(Resources resources) {
            this.f61704a = resources;
        }

        @Override // fe.p
        public o<Integer, Uri> d(s sVar) {
            return new t(this.f61704a, x.c());
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f61701b = resources;
        this.f61700a = oVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f61701b.getResourcePackageName(num.intValue()) + '/' + this.f61701b.getResourceTypeName(num.intValue()) + '/' + this.f61701b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e15) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            c2.h("ResourceLoader", "Received invalid resource id: " + num, e15);
            return null;
        }
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(Integer num, int i15, int i16, zd.h hVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f61700a.a(uriD, i15, i16, hVar);
    }

    @Override // fe.o
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
