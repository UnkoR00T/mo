package fe;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f61632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<DataT> f61633b;

    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61634a;

        a(Context context) {
            this.f61634a = context;
        }

        @Override // fe.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // fe.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new f(this.f61634a, this);
        }

        @Override // fe.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // fe.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i15) {
            return resources.openRawResourceFd(i15);
        }
    }

    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61635a;

        b(Context context) {
            this.f61635a = context;
        }

        @Override // fe.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // fe.p
        public o<Integer, Drawable> d(s sVar) {
            return new f(this.f61635a, this);
        }

        @Override // fe.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }

        @Override // fe.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i15) {
            return ke.d.a(this.f61635a, i15, theme);
        }
    }

    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61636a;

        c(Context context) {
            this.f61636a = context;
        }

        @Override // fe.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // fe.p
        public o<Integer, InputStream> d(s sVar) {
            return new f(this.f61636a, this);
        }

        @Override // fe.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // fe.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i15) {
            return resources.openRawResource(i15);
        }
    }

    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources.Theme f61637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Resources f61638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e<DataT> f61639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f61640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private DataT f61641e;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i15) {
            this.f61637a = theme;
            this.f61638b = resources;
            this.f61639c = eVar;
            this.f61640d = i15;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f61639c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f61641e;
            if (datat != null) {
                try {
                    this.f61639c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public zd.a d() {
            return zd.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super DataT> aVar) {
            try {
                DataT datatC = this.f61639c.c(this.f61637a, this.f61638b, this.f61640d);
                this.f61641e = datatC;
                aVar.f(datatC);
            } catch (Resources.NotFoundException e15) {
                aVar.c(e15);
            }
        }
    }

    private interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        DataT c(Resources.Theme theme, Resources resources, int i15);
    }

    f(Context context, e<DataT> eVar) {
        this.f61632a = context.getApplicationContext();
        this.f61633b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> a(Integer num, int i15, int i16, zd.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(ke.g.f110242b);
        return new o.a<>(new ue.d(num), new d(theme, theme != null ? theme.getResources() : this.f61632a.getResources(), this.f61633b, num.intValue()));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
